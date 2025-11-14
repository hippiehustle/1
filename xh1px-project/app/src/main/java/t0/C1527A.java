package t0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: t0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1527A implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f14677a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14678b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14679c;

    /* renamed from: d, reason: collision with root package name */
    public final float f14680d;

    /* renamed from: e, reason: collision with root package name */
    public final s0 f14681e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14682f;

    /* renamed from: g, reason: collision with root package name */
    public final ValueAnimator f14683g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14684h;

    /* renamed from: i, reason: collision with root package name */
    public float f14685i;
    public float j;
    public boolean k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14686l = false;

    /* renamed from: m, reason: collision with root package name */
    public float f14687m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f14688n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s0 f14689o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1530D f14690p;

    public C1527A(C1530D c1530d, s0 s0Var, int i4, float f8, float f9, float f10, float f11, int i8, s0 s0Var2) {
        this.f14690p = c1530d;
        this.f14688n = i8;
        this.f14689o = s0Var2;
        this.f14682f = i4;
        this.f14681e = s0Var;
        this.f14677a = f8;
        this.f14678b = f9;
        this.f14679c = f10;
        this.f14680d = f11;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f14683g = ofFloat;
        ofFloat.addUpdateListener(new I5.b(4, this));
        ofFloat.setTarget(s0Var.f14950a);
        ofFloat.addListener(this);
        this.f14687m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f14686l) {
            this.f14681e.p(true);
        }
        this.f14686l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f14687m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.k) {
            int i4 = this.f14688n;
            s0 s0Var = this.f14689o;
            C1530D c1530d = this.f14690p;
            if (i4 <= 0) {
                c1530d.f14717m.a(c1530d.f14722r, s0Var);
            } else {
                c1530d.f14707a.add(s0Var.f14950a);
                this.f14684h = true;
                if (i4 > 0) {
                    c1530d.f14722r.post(new E.b(c1530d, this, i4));
                }
            }
            View view = c1530d.f14727w;
            View view2 = s0Var.f14950a;
            if (view == view2) {
                c1530d.p(view2);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
