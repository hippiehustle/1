package E;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s implements Handler.Callback, ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1138a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1139b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1140c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public HashSet f1141d = new HashSet();

    public s(Context context) {
        this.f1138a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f1139b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(r rVar) {
        boolean z8;
        ComponentName componentName = rVar.f1133a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            rVar.f1136d.size();
        }
        ArrayDeque arrayDeque = rVar.f1136d;
        if (!arrayDeque.isEmpty()) {
            if (rVar.f1134b) {
                z8 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f1138a;
                boolean bindService = context.bindService(component, this, 33);
                rVar.f1134b = bindService;
                if (bindService) {
                    rVar.f1137e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z8 = rVar.f1134b;
            }
            if (z8 && rVar.f1135c != null) {
                while (true) {
                    p pVar = (p) arrayDeque.peek();
                    if (pVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            pVar.toString();
                        }
                        pVar.a(rVar.f1135c);
                        arrayDeque.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName);
                        }
                    } catch (RemoteException e9) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e9);
                    }
                }
                if (!arrayDeque.isEmpty()) {
                    b(rVar);
                    return;
                }
                return;
            }
            b(rVar);
        }
    }

    public final void b(r rVar) {
        ComponentName componentName = rVar.f1133a;
        ArrayDeque arrayDeque = rVar.f1136d;
        Handler handler = this.f1139b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i4 = rVar.f1137e + 1;
        rVar.f1137e = i4;
        if (i4 > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + rVar.f1137e + " retries");
            arrayDeque.clear();
            return;
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << r4) * 1000);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [b.a, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i4 = message.what;
        b.c cVar = null;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return false;
                    }
                    r rVar = (r) this.f1140c.get((ComponentName) message.obj);
                    if (rVar != null) {
                        a(rVar);
                        return true;
                    }
                } else {
                    r rVar2 = (r) this.f1140c.get((ComponentName) message.obj);
                    if (rVar2 != null) {
                        if (rVar2.f1134b) {
                            this.f1138a.unbindService(this);
                            rVar2.f1134b = false;
                        }
                        rVar2.f1135c = null;
                        return true;
                    }
                }
            } else {
                q qVar = (q) message.obj;
                ComponentName componentName = qVar.f1131a;
                IBinder iBinder = qVar.f1132b;
                r rVar3 = (r) this.f1140c.get(componentName);
                if (rVar3 != null) {
                    int i8 = b.b.f9009d;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(b.c.f9010a);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof b.c)) {
                            cVar = (b.c) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.f9008d = iBinder;
                            cVar = obj;
                        }
                    }
                    rVar3.f1135c = cVar;
                    rVar3.f1137e = 0;
                    a(rVar3);
                    return true;
                }
            }
        } else {
            p pVar = (p) message.obj;
            String string = Settings.Secure.getString(this.f1138a.getContentResolver(), "enabled_notification_listeners");
            synchronized (t.f1142c) {
                if (string != null) {
                    try {
                        if (!string.equals(t.f1143d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            t.f1144e = hashSet2;
                            t.f1143d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = t.f1144e;
            }
            if (!hashSet.equals(this.f1141d)) {
                this.f1141d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f1138a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName2);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName3 = (ComponentName) it.next();
                    if (!this.f1140c.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName3);
                        }
                        this.f1140c.put(componentName3, new r(componentName3));
                    }
                }
                Iterator it2 = this.f1140c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        r rVar4 = (r) entry.getValue();
                        if (rVar4.f1134b) {
                            this.f1138a.unbindService(this);
                            rVar4.f1134b = false;
                        }
                        rVar4.f1135c = null;
                        it2.remove();
                    }
                }
            }
            for (r rVar5 : this.f1140c.values()) {
                rVar5.f1136d.add(pVar);
                a(rVar5);
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.f1139b.obtainMessage(1, new q(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.f1139b.obtainMessage(2, componentName).sendToTarget();
    }
}
