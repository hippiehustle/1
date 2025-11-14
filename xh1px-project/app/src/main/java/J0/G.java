package J0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class G extends AnimatorListenerAdapter implements n {

    /* renamed from: a, reason: collision with root package name */
    public final View f2252a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2253b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2254c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2256e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2257f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2255d = true;

    public G(View view, int i4) {
        this.f2252a = view;
        this.f2253b = i4;
        this.f2254c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // J0.n
    public final void a() {
        g(false);
        if (!this.f2257f) {
            z.b(this.f2252a, this.f2253b);
        }
    }

    @Override // J0.n
    public final void c() {
        g(true);
        if (!this.f2257f) {
            z.b(this.f2252a, 0);
        }
    }

    @Override // J0.n
    public final void d(p pVar) {
        pVar.z(this);
    }

    public final void g(boolean z8) {
        ViewGroup viewGroup;
        if (this.f2255d && this.f2256e != z8 && (viewGroup = this.f2254c) != null) {
            this.f2256e = z8;
            E2.d.T(viewGroup, z8);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2257f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f2257f) {
            z.b(this.f2252a, this.f2253b);
            ViewGroup viewGroup = this.f2254c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z8) {
        if (z8) {
            z.b(this.f2252a, 0);
            ViewGroup viewGroup = this.f2254c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z8) {
        if (z8) {
            return;
        }
        if (!this.f2257f) {
            z.b(this.f2252a, this.f2253b);
            ViewGroup viewGroup = this.f2254c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // J0.n
    public final void b(p pVar) {
    }

    @Override // J0.n
    public final void e(p pVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
