package z5;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import c.C0548b;

/* renamed from: z5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1873d implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1871b f16692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1874e f16693b;

    public C1873d(C1874e c1874e, InterfaceC1871b interfaceC1871b) {
        this.f16693b = c1874e;
        this.f16692a = interfaceC1871b;
    }

    public final void onBackCancelled() {
        if (this.f16693b.f16691a != null) {
            this.f16692a.d();
        }
    }

    public final void onBackInvoked() {
        this.f16692a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f16693b.f16691a != null) {
            this.f16692a.b(new C0548b(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f16693b.f16691a != null) {
            this.f16692a.c(new C0548b(backEvent));
        }
    }
}
