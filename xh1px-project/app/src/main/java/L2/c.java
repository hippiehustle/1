package L2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1162a f2768b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2769c;

    public /* synthetic */ c(InterfaceC1162a interfaceC1162a, Object obj, int i4) {
        this.f2767a = i4;
        this.f2768b = interfaceC1162a;
        this.f2769c = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i4 = this.f2767a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2767a) {
            case 0:
                ((B0.e) this.f2768b).a();
                ((AnimatorSet) ((A4.d) this.f2769c).f298h).removeAllListeners();
                return;
            default:
                ((B0.e) this.f2768b).a();
                ((AnimatorSet) ((F3.a) this.f2769c).f1305f).removeAllListeners();
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i4 = this.f2767a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i4 = this.f2767a;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }
}
