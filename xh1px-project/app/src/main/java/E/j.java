package E;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1108a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1112e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f1113f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f1114g;

    /* renamed from: i, reason: collision with root package name */
    public W0.d f1116i;
    public String j;
    public boolean k;

    /* renamed from: m, reason: collision with root package name */
    public String f1118m;

    /* renamed from: n, reason: collision with root package name */
    public Bundle f1119n;

    /* renamed from: o, reason: collision with root package name */
    public RemoteViews f1120o;

    /* renamed from: p, reason: collision with root package name */
    public RemoteViews f1121p;

    /* renamed from: q, reason: collision with root package name */
    public final String f1122q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1123r;

    /* renamed from: s, reason: collision with root package name */
    public final Notification f1124s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f1125t;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1109b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1110c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1111d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1115h = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1117l = false;

    public j(Context context, String str) {
        Notification notification = new Notification();
        this.f1124s = notification;
        this.f1108a = context;
        this.f1122q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f1125t = new ArrayList();
        this.f1123r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x00e5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Notification a() {
        Notification.Builder builder;
        boolean z8;
        boolean z9;
        boolean z10;
        Notification build;
        Bundle bundle;
        int i4;
        Bundle bundle2;
        ArrayList arrayList;
        String str;
        Iterator it;
        Icon icon;
        Bundle bundle3;
        String str2;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        new ArrayList();
        Bundle bundle4 = new Bundle();
        int i8 = Build.VERSION.SDK_INT;
        String str3 = this.f1122q;
        if (i8 >= 26) {
            builder = l.a(this.f1108a, str3);
        } else {
            builder = new Notification.Builder(this.f1108a);
        }
        Notification.Builder builder2 = builder;
        Notification notification = this.f1124s;
        Notification.Builder lights = builder2.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean z11 = true;
        if ((notification.flags & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z8);
        if ((notification.flags & 8) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z9);
        if ((notification.flags & 16) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z10).setDefaults(notification.defaults).setContentTitle(this.f1112e).setContentText(this.f1113f).setContentInfo(null).setContentIntent(this.f1114g).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) == 0) {
            z11 = false;
        }
        deleteIntent.setFullScreenIntent(null, z11).setNumber(0).setProgress(0, 0, false);
        builder2.setLargeIcon((Icon) null);
        builder2.setSubText(null).setUsesChronometer(false).setPriority(0);
        Iterator it2 = this.f1109b.iterator();
        while (it2.hasNext()) {
            i iVar = (i) it2.next();
            int i9 = Build.VERSION.SDK_INT;
            IconCompat a3 = iVar.a();
            boolean z12 = iVar.f1103c;
            Bundle bundle5 = iVar.f1101a;
            if (a3 != null) {
                int i10 = Build.VERSION.SDK_INT;
                switch (a3.f8557a) {
                    case -1:
                        str = str3;
                        it = it2;
                        icon = (Icon) a3.f8558b;
                        break;
                    case 0:
                    default:
                        throw new IllegalArgumentException("Unknown type");
                    case 1:
                        str = str3;
                        it = it2;
                        icon = Icon.createWithBitmap((Bitmap) a3.f8558b);
                        colorStateList = a3.f8563g;
                        if (colorStateList != null) {
                            icon.setTintList(colorStateList);
                        }
                        mode = a3.f8564h;
                        if (mode != IconCompat.k) {
                            icon.setTintMode(mode);
                            break;
                        }
                        break;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        int i11 = a3.f8557a;
                        if (i11 == -1) {
                            int i12 = Build.VERSION.SDK_INT;
                            Object obj = a3.f8558b;
                            str = str3;
                            if (i12 >= 28) {
                                str2 = I.a.c(obj);
                                it = it2;
                            } else {
                                try {
                                    it = it2;
                                } catch (IllegalAccessException e9) {
                                    e = e9;
                                    it = it2;
                                } catch (NoSuchMethodException e10) {
                                    e = e10;
                                    it = it2;
                                } catch (InvocationTargetException e11) {
                                    e = e11;
                                    it = it2;
                                }
                                try {
                                    str2 = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                                } catch (IllegalAccessException e12) {
                                    e = e12;
                                    Log.e("IconCompat", "Unable to get icon package", e);
                                    str2 = null;
                                    icon = Icon.createWithResource(str2, a3.f8561e);
                                    colorStateList = a3.f8563g;
                                    if (colorStateList != null) {
                                    }
                                    mode = a3.f8564h;
                                    if (mode != IconCompat.k) {
                                    }
                                    Notification.Action.Builder builder3 = new Notification.Action.Builder(icon, iVar.f1106f, iVar.f1107g);
                                    if (bundle5 == null) {
                                    }
                                    bundle3.putBoolean("android.support.allowGeneratedReplies", z12);
                                    builder3.setAllowGeneratedReplies(z12);
                                    bundle3.putInt("android.support.action.semanticAction", 0);
                                    if (i9 >= 28) {
                                    }
                                    if (i9 >= 29) {
                                    }
                                    if (i9 < 31) {
                                    }
                                    bundle3.putBoolean("android.support.action.showsUserInterface", iVar.f1104d);
                                    builder3.addExtras(bundle3);
                                    builder2.addAction(builder3.build());
                                    str3 = str;
                                    it2 = it;
                                } catch (NoSuchMethodException e13) {
                                    e = e13;
                                    Log.e("IconCompat", "Unable to get icon package", e);
                                    str2 = null;
                                    icon = Icon.createWithResource(str2, a3.f8561e);
                                    colorStateList = a3.f8563g;
                                    if (colorStateList != null) {
                                    }
                                    mode = a3.f8564h;
                                    if (mode != IconCompat.k) {
                                    }
                                    Notification.Action.Builder builder32 = new Notification.Action.Builder(icon, iVar.f1106f, iVar.f1107g);
                                    if (bundle5 == null) {
                                    }
                                    bundle3.putBoolean("android.support.allowGeneratedReplies", z12);
                                    builder32.setAllowGeneratedReplies(z12);
                                    bundle3.putInt("android.support.action.semanticAction", 0);
                                    if (i9 >= 28) {
                                    }
                                    if (i9 >= 29) {
                                    }
                                    if (i9 < 31) {
                                    }
                                    bundle3.putBoolean("android.support.action.showsUserInterface", iVar.f1104d);
                                    builder32.addExtras(bundle3);
                                    builder2.addAction(builder32.build());
                                    str3 = str;
                                    it2 = it;
                                } catch (InvocationTargetException e14) {
                                    e = e14;
                                    Log.e("IconCompat", "Unable to get icon package", e);
                                    str2 = null;
                                    icon = Icon.createWithResource(str2, a3.f8561e);
                                    colorStateList = a3.f8563g;
                                    if (colorStateList != null) {
                                    }
                                    mode = a3.f8564h;
                                    if (mode != IconCompat.k) {
                                    }
                                    Notification.Action.Builder builder322 = new Notification.Action.Builder(icon, iVar.f1106f, iVar.f1107g);
                                    if (bundle5 == null) {
                                    }
                                    bundle3.putBoolean("android.support.allowGeneratedReplies", z12);
                                    builder322.setAllowGeneratedReplies(z12);
                                    bundle3.putInt("android.support.action.semanticAction", 0);
                                    if (i9 >= 28) {
                                    }
                                    if (i9 >= 29) {
                                    }
                                    if (i9 < 31) {
                                    }
                                    bundle3.putBoolean("android.support.action.showsUserInterface", iVar.f1104d);
                                    builder322.addExtras(bundle3);
                                    builder2.addAction(builder322.build());
                                    str3 = str;
                                    it2 = it;
                                }
                            }
                        } else {
                            str = str3;
                            it = it2;
                            if (i11 == 2) {
                                String str4 = a3.j;
                                if (str4 != null && !TextUtils.isEmpty(str4)) {
                                    str2 = a3.j;
                                } else {
                                    str2 = ((String) a3.f8558b).split(":", -1)[0];
                                }
                            } else {
                                throw new IllegalStateException("called getResPackage() on " + a3);
                            }
                        }
                        icon = Icon.createWithResource(str2, a3.f8561e);
                        colorStateList = a3.f8563g;
                        if (colorStateList != null) {
                        }
                        mode = a3.f8564h;
                        if (mode != IconCompat.k) {
                        }
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        icon = Icon.createWithData((byte[]) a3.f8558b, a3.f8561e, a3.f8562f);
                        str = str3;
                        it = it2;
                        colorStateList = a3.f8563g;
                        if (colorStateList != null) {
                        }
                        mode = a3.f8564h;
                        if (mode != IconCompat.k) {
                        }
                        break;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        icon = Icon.createWithContentUri((String) a3.f8558b);
                        str = str3;
                        it = it2;
                        colorStateList = a3.f8563g;
                        if (colorStateList != null) {
                        }
                        mode = a3.f8564h;
                        if (mode != IconCompat.k) {
                        }
                        break;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        if (i10 >= 26) {
                            icon = F.a.a((Bitmap) a3.f8558b);
                        } else {
                            icon = Icon.createWithBitmap(IconCompat.a((Bitmap) a3.f8558b, false));
                        }
                        str = str3;
                        it = it2;
                        colorStateList = a3.f8563g;
                        if (colorStateList != null) {
                        }
                        mode = a3.f8564h;
                        if (mode != IconCompat.k) {
                        }
                        break;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (i10 >= 30) {
                            icon = I.b.a(a3.d());
                            str = str3;
                            it = it2;
                            colorStateList = a3.f8563g;
                            if (colorStateList != null) {
                            }
                            mode = a3.f8564h;
                            if (mode != IconCompat.k) {
                            }
                        } else {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + a3.d());
                        }
                        break;
                }
            } else {
                str = str3;
                it = it2;
                icon = null;
            }
            Notification.Action.Builder builder3222 = new Notification.Action.Builder(icon, iVar.f1106f, iVar.f1107g);
            if (bundle5 == null) {
                bundle3 = new Bundle(bundle5);
            } else {
                bundle3 = new Bundle();
            }
            bundle3.putBoolean("android.support.allowGeneratedReplies", z12);
            builder3222.setAllowGeneratedReplies(z12);
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i9 >= 28) {
                m.a(builder3222);
            }
            if (i9 >= 29) {
                f.d(builder3222);
            }
            if (i9 < 31) {
                n.a(builder3222);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", iVar.f1104d);
            builder3222.addExtras(bundle3);
            builder2.addAction(builder3222.build());
            str3 = str;
            it2 = it;
        }
        String str5 = str3;
        Bundle bundle6 = this.f1119n;
        if (bundle6 != null) {
            bundle4.putAll(bundle6);
        }
        int i13 = Build.VERSION.SDK_INT;
        builder2.setShowWhen(this.f1115h);
        builder2.setLocalOnly(this.f1117l);
        builder2.setGroup(this.j);
        builder2.setSortKey(null);
        builder2.setGroupSummary(this.k);
        builder2.setCategory(this.f1118m);
        builder2.setColor(0);
        builder2.setVisibility(0);
        builder2.setPublicVersion(null);
        builder2.setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = this.f1125t;
        ArrayList arrayList3 = this.f1110c;
        if (i13 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    it3.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    t.f fVar = new t.f(arrayList2.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                builder2.addPerson((String) it4.next());
            }
        }
        ArrayList arrayList4 = this.f1111d;
        if (arrayList4.size() > 0) {
            if (this.f1119n == null) {
                this.f1119n = new Bundle();
            }
            Bundle bundle7 = this.f1119n.getBundle("android.car.EXTENSIONS");
            if (bundle7 == null) {
                bundle7 = new Bundle();
            }
            Bundle bundle8 = new Bundle(bundle7);
            Bundle bundle9 = new Bundle();
            int i14 = 0;
            while (i14 < arrayList4.size()) {
                String num = Integer.toString(i14);
                i iVar2 = (i) arrayList4.get(i14);
                Bundle bundle10 = new Bundle();
                IconCompat a4 = iVar2.a();
                Bundle bundle11 = iVar2.f1101a;
                if (a4 != null) {
                    i4 = a4.c();
                } else {
                    i4 = 0;
                }
                ArrayList arrayList5 = arrayList4;
                bundle10.putInt("icon", i4);
                bundle10.putCharSequence("title", iVar2.f1106f);
                bundle10.putParcelable("actionIntent", iVar2.f1107g);
                if (bundle11 != null) {
                    bundle2 = new Bundle(bundle11);
                } else {
                    bundle2 = new Bundle();
                }
                bundle2.putBoolean("android.support.allowGeneratedReplies", iVar2.f1103c);
                bundle10.putBundle("extras", bundle2);
                bundle10.putParcelableArray("remoteInputs", null);
                bundle10.putBoolean("showsUserInterface", iVar2.f1104d);
                bundle10.putInt("semanticAction", 0);
                bundle9.putBundle(num, bundle10);
                i14++;
                arrayList4 = arrayList5;
            }
            bundle7.putBundle("invisible_actions", bundle9);
            bundle8.putBundle("invisible_actions", bundle9);
            if (this.f1119n == null) {
                this.f1119n = new Bundle();
            }
            this.f1119n.putBundle("android.car.EXTENSIONS", bundle7);
            bundle4.putBundle("android.car.EXTENSIONS", bundle8);
        }
        int i15 = Build.VERSION.SDK_INT;
        builder2.setExtras(this.f1119n);
        builder2.setRemoteInputHistory(null);
        RemoteViews remoteViews = this.f1120o;
        if (remoteViews != null) {
            builder2.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = this.f1121p;
        if (remoteViews2 != null) {
            builder2.setCustomBigContentView(remoteViews2);
        }
        if (i15 >= 26) {
            l.d(builder2);
            l.f(builder2);
            l.g(builder2);
            l.h(builder2);
            l.e(builder2);
            if (!TextUtils.isEmpty(str5)) {
                builder2.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i15 >= 28) {
            Iterator it5 = arrayList3.iterator();
            if (it5.hasNext()) {
                it5.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i15 >= 29) {
            f.b(builder2, this.f1123r);
            f.c(builder2);
        }
        W0.d dVar = this.f1116i;
        if (dVar != null) {
            builder2.setStyle(k.a());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            build = builder2.build();
        } else {
            build = builder2.build();
        }
        RemoteViews remoteViews3 = this.f1120o;
        if (remoteViews3 != null) {
            build.contentView = remoteViews3;
        }
        if (dVar != null) {
            this.f1116i.getClass();
        }
        if (dVar != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle");
        }
        return build;
    }

    public final void c(W0.d dVar) {
        if (this.f1116i != dVar) {
            this.f1116i = dVar;
            if (((j) dVar.f6489e) != this) {
                dVar.f6489e = this;
                c(dVar);
            }
        }
    }
}
