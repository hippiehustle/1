package s1;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import d6.C0624j;

/* renamed from: s1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1479b {

    /* renamed from: a, reason: collision with root package name */
    public AccessibilityService.GestureResultCallback f14445a;

    /* renamed from: b, reason: collision with root package name */
    public C0624j f14446b;

    /* renamed from: c, reason: collision with root package name */
    public long f14447c;

    /* renamed from: d, reason: collision with root package name */
    public long f14448d;

    /* renamed from: e, reason: collision with root package name */
    public long f14449e;

    public final void a(boolean z8) {
        C0624j c0624j = this.f14446b;
        if (c0624j != null) {
            this.f14446b = null;
            try {
                c0624j.k(Boolean.valueOf(!z8));
                return;
            } catch (IllegalStateException e9) {
                Log.w("GestureExecutor", "Continuation have already been resumed. Did the same event got two results ?", e9);
                return;
            }
        }
        Log.w("GestureExecutor", "Can't resume continuation. Did the same event got two results ?");
    }
}
