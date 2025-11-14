package L1;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import i.AbstractActivityC0870i;
import n6.InterfaceC1162a;
import o6.j;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f2757b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1162a f2758c;

    public c(ComponentName componentName, InterfaceC1162a interfaceC1162a) {
        super(false);
        this.f2757b = componentName;
        this.f2758c = interfaceC1162a;
    }

    @Override // L1.b
    public final boolean c(Context context) {
        j.e(context, "context");
        return ((Boolean) this.f2758c.a()).booleanValue();
    }

    @Override // L1.b
    public final boolean d(AbstractActivityC0870i abstractActivityC0870i) {
        Intent intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
        intent.addFlags(1342177280);
        Bundle bundle = new Bundle();
        String flattenToString = this.f2757b.flattenToString();
        j.d(flattenToString, "flattenToString(...)");
        bundle.putString(":settings:fragment_args_key", flattenToString);
        intent.putExtra(":settings:fragment_args_key", flattenToString);
        intent.putExtra(":settings:show_fragment_args", bundle);
        try {
            abstractActivityC0870i.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            Log.e("Permission", "Can't find device accessibility service settings menu.");
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f2757b.equals(cVar.f2757b) && this.f2758c.equals(cVar.f2758c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f2758c.hashCode() + (this.f2757b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PermissionAccessibilityService(componentName=" + this.f2757b + ", isServiceRunning=" + this.f2758c + ", optional=false)";
    }
}
