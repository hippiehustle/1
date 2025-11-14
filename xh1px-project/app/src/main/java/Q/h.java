package Q;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public class h extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final W0.d f4711a;

    public h(W0.d dVar) {
        this.f4711a = dVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
        g f8 = this.f4711a.f(i4);
        if (f8 == null) {
            return null;
        }
        return f8.f4709a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i4) {
        this.f4711a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i4) {
        g g8 = this.f4711a.g(i4);
        if (g8 == null) {
            return null;
        }
        return g8.f4709a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i4, int i8, Bundle bundle) {
        return this.f4711a.j(i4, i8, bundle);
    }
}
