package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1543i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14852a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f14853b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f14854c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f14855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1548n f14856e;

    public C1543i(C1548n c1548n, s0 s0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f14856e = c1548n;
        this.f14853b = s0Var;
        this.f14855d = viewPropertyAnimator;
        this.f14854c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f14852a) {
            case 1:
                this.f14854c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14852a) {
            case 0:
                this.f14855d.setListener(null);
                this.f14854c.setAlpha(1.0f);
                C1548n c1548n = this.f14856e;
                s0 s0Var = this.f14853b;
                c1548n.c(s0Var);
                c1548n.f14907q.remove(s0Var);
                c1548n.i();
                return;
            default:
                this.f14855d.setListener(null);
                C1548n c1548n2 = this.f14856e;
                s0 s0Var2 = this.f14853b;
                c1548n2.c(s0Var2);
                c1548n2.f14905o.remove(s0Var2);
                c1548n2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f14852a) {
            case 0:
                this.f14856e.getClass();
                return;
            default:
                this.f14856e.getClass();
                return;
        }
    }

    public C1543i(C1548n c1548n, s0 s0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f14856e = c1548n;
        this.f14853b = s0Var;
        this.f14854c = view;
        this.f14855d = viewPropertyAnimator;
    }
}
