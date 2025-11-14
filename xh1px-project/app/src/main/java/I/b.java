package I;

import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract class b {
    public static Icon a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static void b(int i4) {
        SdkExtensions.getExtensionVersion(i4);
    }

    public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void d(Window window, boolean z8) {
        int i4;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z8) {
            i4 = systemUiVisibility & (-257);
        } else {
            i4 = systemUiVisibility | 256;
        }
        decorView.setSystemUiVisibility(i4);
        window.setDecorFitsSystemWindows(z8);
    }

    public static void e(Window window, boolean z8) {
        window.setDecorFitsSystemWindows(z8);
    }

    public static void f(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
