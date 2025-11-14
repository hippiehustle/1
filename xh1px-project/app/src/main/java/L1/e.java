package L1;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import g0.C0749s;
import i.AbstractActivityC0870i;
import o6.j;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: b, reason: collision with root package name */
    public C0749s f2759b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2760c;

    public e(boolean z8) {
        super(z8);
        this.f2760c = z8;
    }

    @Override // L1.b
    public final boolean c(Context context) {
        j.e(context, "context");
        return ((NotificationManager) context.getSystemService(NotificationManager.class)).areNotificationsEnabled();
    }

    @Override // L1.b
    public final boolean d(AbstractActivityC0870i abstractActivityC0870i) {
        if (!b(abstractActivityC0870i)) {
            C0749s c0749s = this.f2759b;
            if (c0749s != null) {
                try {
                    c0749s.a("android.permission.POST_NOTIFICATIONS");
                    return true;
                } catch (IllegalStateException e9) {
                    Log.e("PermissionDangerous", "Can't start permission request", e9);
                }
            }
            return false;
        }
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.addFlags(268435456);
        intent.putExtra("android.provider.extra.APP_PACKAGE", "com.buzbuz.smartautoclicker");
        try {
            abstractActivityC0870i.startActivity(intent);
            return true;
        } catch (Exception e10) {
            Log.e("PermissionDangerous", "Can't start permission settings", e10);
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof e) || this.f2760c != ((e) obj).f2760c) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2760c);
    }

    public final String toString() {
        return "PermissionPostNotification(optional=" + this.f2760c + ")";
    }
}
