package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1544j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f14860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f14862c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f14864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1548n f14865f;

    public C1544j(C1548n c1548n, s0 s0Var, int i4, View view, int i8, ViewPropertyAnimator viewPropertyAnimator) {
        this.f14865f = c1548n;
        this.f14860a = s0Var;
        this.f14861b = i4;
        this.f14862c = view;
        this.f14863d = i8;
        this.f14864e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i4 = this.f14861b;
        View view = this.f14862c;
        if (i4 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f14863d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f14864e.setListener(null);
        C1548n c1548n = this.f14865f;
        s0 s0Var = this.f14860a;
        c1548n.c(s0Var);
        c1548n.f14906p.remove(s0Var);
        c1548n.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f14865f.getClass();
    }
}
