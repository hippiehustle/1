package O5;

import Z.g;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import t0.C1554u;
import w5.j;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4041a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4043c;

    public c(View view, boolean z8) {
        this.f4041a = 0;
        this.f4042b = z8;
        this.f4043c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f4041a) {
            case 1:
                this.f4042b = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4041a) {
            case 0:
                if (!this.f4042b) {
                    ((View) this.f4043c).setVisibility(4);
                    return;
                }
                return;
            case 1:
                C1554u c1554u = (C1554u) this.f4043c;
                if (this.f4042b) {
                    this.f4042b = false;
                    return;
                } else if (((Float) c1554u.f15000z.getAnimatedValue()).floatValue() == 0.0f) {
                    c1554u.f14975A = 0;
                    c1554u.j(0);
                    return;
                } else {
                    c1554u.f14975A = 2;
                    c1554u.f14993s.invalidate();
                    return;
                }
            default:
                j jVar = (j) this.f4043c;
                jVar.f15775r = 0;
                jVar.f15769l = null;
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f4041a) {
            case 0:
                if (this.f4042b) {
                    ((View) this.f4043c).setVisibility(0);
                    return;
                }
                return;
            case 1:
            default:
                super.onAnimationStart(animator);
                return;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                j jVar = (j) this.f4043c;
                jVar.f15776s.a(0, this.f4042b);
                jVar.f15775r = 2;
                jVar.f15769l = animator;
                return;
        }
    }

    public c(j jVar, boolean z8) {
        this.f4041a = 2;
        this.f4043c = jVar;
        this.f4042b = z8;
    }

    public c(C1554u c1554u) {
        this.f4041a = 1;
        this.f4043c = c1554u;
        this.f4042b = false;
    }
}
