package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1545k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1546l f14875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f14876c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f14877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1548n f14878e;

    public /* synthetic */ C1545k(C1548n c1548n, C1546l c1546l, ViewPropertyAnimator viewPropertyAnimator, View view, int i4) {
        this.f14874a = i4;
        this.f14878e = c1548n;
        this.f14875b = c1546l;
        this.f14876c = viewPropertyAnimator;
        this.f14877d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14874a) {
            case 0:
                this.f14876c.setListener(null);
                View view = this.f14877d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C1546l c1546l = this.f14875b;
                s0 s0Var = c1546l.f14879a;
                C1548n c1548n = this.f14878e;
                c1548n.c(s0Var);
                c1548n.f14908r.remove(c1546l.f14879a);
                c1548n.i();
                return;
            default:
                this.f14876c.setListener(null);
                View view2 = this.f14877d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C1546l c1546l2 = this.f14875b;
                s0 s0Var2 = c1546l2.f14880b;
                C1548n c1548n2 = this.f14878e;
                c1548n2.c(s0Var2);
                c1548n2.f14908r.remove(c1546l2.f14880b);
                c1548n2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f14874a) {
            case 0:
                s0 s0Var = this.f14875b.f14879a;
                this.f14878e.getClass();
                return;
            default:
                s0 s0Var2 = this.f14875b.f14880b;
                this.f14878e.getClass();
                return;
        }
    }
}
