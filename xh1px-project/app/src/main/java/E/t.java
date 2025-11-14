package E;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static String f1143d;

    /* renamed from: g, reason: collision with root package name */
    public static s f1146g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1147a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f1148b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1142c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f1144e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f1145f = new Object();

    public t(Context context) {
        this.f1147a = context;
        this.f1148b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            l.b(this.f1148b, notificationChannel);
        }
    }

    public final void b(int i4, Notification notification) {
        NotificationManager notificationManager = this.f1148b;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            p pVar = new p(this.f1147a.getPackageName(), i4, notification);
            synchronized (f1145f) {
                try {
                    if (f1146g == null) {
                        f1146g = new s(this.f1147a.getApplicationContext());
                    }
                    f1146g.f1139b.obtainMessage(0, pVar).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            notificationManager.cancel(null, i4);
            return;
        }
        notificationManager.notify(null, i4, notification);
    }
}
