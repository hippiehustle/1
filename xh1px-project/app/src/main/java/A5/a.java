package A5;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("KlickrService", str, 2);
    }

    public static /* synthetic */ NotificationChannelGroup d(String str) {
        return new NotificationChannelGroup("Klickr User Scenarios", str);
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ NotificationChannel t(String str) {
        return new NotificationChannel("KlickrScenario LOW", str, 2);
    }

    public static /* synthetic */ void u() {
    }

    public static /* synthetic */ NotificationChannel v(String str) {
        return new NotificationChannel("KlickrScenario HIGH", str, 4);
    }

    public static /* synthetic */ NotificationChannel w(String str) {
        return new NotificationChannel("KlickrScenario DEFAULT", str, 3);
    }
}
