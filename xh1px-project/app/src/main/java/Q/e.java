package Q;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ PackageManager.ResolveInfoFlags a(long j) {
        return PackageManager.ResolveInfoFlags.of(j);
    }

    public static /* bridge */ /* synthetic */ ResolveInfo b(PackageManager packageManager, Intent intent, PackageManager.ResolveInfoFlags resolveInfoFlags) {
        return packageManager.resolveActivity(intent, resolveInfoFlags);
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback d(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher h(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }
}
