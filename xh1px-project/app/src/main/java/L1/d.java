package L1;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;
import i.AbstractActivityC0870i;
import o6.j;

/* loaded from: classes.dex */
public final class d extends a {
    @Override // L1.b
    public final boolean c(Context context) {
        j.e(context, "context");
        return Settings.canDrawOverlays(context);
    }

    @Override // L1.b
    public final boolean d(AbstractActivityC0870i abstractActivityC0870i) {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + abstractActivityC0870i.getPackageName()));
        intent.addFlags(1342177280);
        try {
            abstractActivityC0870i.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            Log.e("Permission", "Can't find device overlay settings menu.");
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        ((d) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false);
    }

    public final String toString() {
        return "PermissionOverlay(optional=false)";
    }
}
