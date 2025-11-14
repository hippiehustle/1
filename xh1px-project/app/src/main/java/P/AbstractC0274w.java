package P;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* renamed from: P.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0274w {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float b(VelocityTracker velocityTracker, int i4) {
        return velocityTracker.getAxisVelocity(i4);
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int e(ViewConfiguration viewConfiguration, int i4, int i8, int i9) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i4, i8, i9);
    }

    public static int f(ViewConfiguration viewConfiguration, int i4, int i8, int i9) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i4, i8, i9);
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void h(TextView textView, int i4, float f8) {
        textView.setLineHeight(i4, f8);
    }
}
