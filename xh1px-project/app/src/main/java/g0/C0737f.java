package g0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: g0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0737f extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public final C0738g f11016c;

    public C0737f(C0738g c0738g) {
        this.f11016c = c0738g;
    }

    @Override // g0.f0
    public final void a(ViewGroup viewGroup) {
        o6.j.e(viewGroup, "container");
        C0738g c0738g = this.f11016c;
        g0 g0Var = (g0) c0738g.f1023e;
        View view = g0Var.f11024c.K;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((g0) c0738g.f1023e).c(this);
        if (T.K(2)) {
            g0Var.toString();
        }
    }

    @Override // g0.f0
    public final void b(ViewGroup viewGroup) {
        o6.j.e(viewGroup, "container");
        C0738g c0738g = this.f11016c;
        g0 g0Var = (g0) c0738g.f1023e;
        if (c0738g.I0()) {
            g0Var.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = g0Var.f11024c.K;
        o6.j.d(context, "context");
        R3.r K02 = c0738g.K0(context);
        if (K02 != null) {
            Animation animation = (Animation) K02.f5082e;
            if (animation != null) {
                if (g0Var.f11022a != 1) {
                    view.startAnimation(animation);
                    g0Var.c(this);
                    return;
                }
                viewGroup.startViewTransition(view);
                B b4 = new B(animation, viewGroup, view);
                b4.setAnimationListener(new AnimationAnimationListenerC0736e(g0Var, viewGroup, view, this));
                view.startAnimation(b4);
                if (T.K(2)) {
                    g0Var.toString();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
