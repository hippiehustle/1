package s1;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1478a extends AccessibilityService.GestureResultCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1479b f14444a;

    public C1478a(C1479b c1479b) {
        this.f14444a = c1479b;
    }

    @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
    public final void onCancelled(GestureDescription gestureDescription) {
        C1479b c1479b = this.f14444a;
        c1479b.f14448d++;
        c1479b.a(false);
    }

    @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
    public final void onCompleted(GestureDescription gestureDescription) {
        C1479b c1479b = this.f14444a;
        c1479b.f14447c++;
        c1479b.a(false);
    }
}
