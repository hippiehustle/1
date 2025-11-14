package J0;

import P.Y;
import P.d0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: J0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2292a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2294c;

    public C0075i(d0 d0Var, View view) {
        this.f2293b = d0Var;
        this.f2294c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2292a) {
            case 0:
                ((t.e) this.f2293b).remove(animator);
                ((p) this.f2294c).f2324q.remove(animator);
                return;
            default:
                ((d0) this.f2293b).f4259a.d(1.0f);
                Y.e((View) this.f2294c);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2292a) {
            case 0:
                ((p) this.f2294c).f2324q.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public C0075i(p pVar, t.e eVar) {
        this.f2294c = pVar;
        this.f2293b = eVar;
    }
}
