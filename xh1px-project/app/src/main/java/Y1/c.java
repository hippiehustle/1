package Y1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import h1.AbstractC0812e;
import i.AbstractC0863b;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import n6.InterfaceC1163b;
import o6.j;
import s3.C1490a;
import t0.C1536c;
import t3.AbstractC1571i;
import t3.C1566d;
import t3.C1567e;
import t3.C1568f;
import t3.C1569g;
import t3.C1570h;

/* loaded from: classes.dex */
public final class c extends AbstractC0812e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7098c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, IntentFilter intentFilter, int i4) {
        super(intentFilter);
        this.f7098c = i4;
        this.f7099d = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z8;
        String action;
        switch (this.f7098c) {
            case 0:
                j.e(context, "context");
                j.e(intent, "intent");
                d dVar = (d) this.f7099d;
                Log.i("DisplayMetrics", "onAndroidConfigurationChanged");
                b a3 = d.a(dVar.f7104e, dVar.b());
                if (a3.equals(dVar.f7104e)) {
                    Log.i("DisplayMetrics", "Same DisplayConfig, skip update");
                    return;
                }
                Log.i("DisplayMetrics", "New DisplayConfig: " + a3);
                if (dVar.f7104e.f7095b != a3.f7095b) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                dVar.f7104e = a3;
                if (z8) {
                    Iterator it = dVar.f7102c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1163b) it.next()).m(context);
                    }
                    return;
                }
                return;
            case 1:
                if (intent != null && (action = intent.getAction()) != null) {
                    ((ConcurrentHashMap) ((C1536c) this.f7099d).f14808e).put(action, Boolean.TRUE);
                    return;
                }
                return;
            default:
                j.e(context, "context");
                j.e(intent, "intent");
                String action2 = intent.getAction();
                AbstractC1571i abstractC1571i = C1568f.f15054a;
                if (!j.a(action2, AbstractC0863b.g(abstractC1571i))) {
                    abstractC1571i = C1567e.f15053a;
                    if (!j.a(action2, AbstractC0863b.g(abstractC1571i))) {
                        abstractC1571i = C1569g.f15055a;
                        if (!j.a(action2, AbstractC0863b.g(abstractC1571i))) {
                            abstractC1571i = C1566d.f15052a;
                            if (!j.a(action2, AbstractC0863b.g(abstractC1571i))) {
                                abstractC1571i = C1570h.f15056a;
                                if (!j.a(action2, AbstractC0863b.g(abstractC1571i))) {
                                    abstractC1571i = null;
                                }
                            }
                        }
                    }
                }
                if (abstractC1571i != null) {
                    Log.i("NotificationActionsReceiver", "Notification action received: " + intent.getAction());
                    ((C1490a) this.f7099d).m(abstractC1571i);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(C1490a c1490a) {
        super(r0);
        this.f7098c = 2;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AbstractC0863b.g(C1568f.f15054a));
        intentFilter.addAction(AbstractC0863b.g(C1567e.f15053a));
        intentFilter.addAction(AbstractC0863b.g(C1569g.f15055a));
        intentFilter.addAction(AbstractC0863b.g(C1566d.f15052a));
        intentFilter.addAction(AbstractC0863b.g(C1570h.f15056a));
        this.f7099d = c1490a;
    }
}
