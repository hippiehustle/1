package E;

import android.app.Notification;
import android.app.Service;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class f {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static void b(Notification.Builder builder, boolean z8) {
        builder.setAllowSystemGeneratedContextualActions(z8);
    }

    public static void c(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void d(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void e(Service service, Notification notification) {
        service.startForeground(1, notification, 32);
    }

    public static void f(Service service, Notification notification) {
        service.startForeground(1, notification, 32);
    }
}
