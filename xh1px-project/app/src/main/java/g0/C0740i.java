package g0;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import c.C0548b;
import java.util.Objects;

/* renamed from: g0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740i extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public final C0738g f11038c;

    /* renamed from: d, reason: collision with root package name */
    public AnimatorSet f11039d;

    public C0740i(C0738g c0738g) {
        this.f11038c = c0738g;
    }

    @Override // g0.f0
    public final void a(ViewGroup viewGroup) {
        o6.j.e(viewGroup, "container");
        AnimatorSet animatorSet = this.f11039d;
        C0738g c0738g = this.f11038c;
        if (animatorSet == null) {
            ((g0) c0738g.f1023e).c(this);
            return;
        }
        g0 g0Var = (g0) c0738g.f1023e;
        if (g0Var.f11028g) {
            if (Build.VERSION.SDK_INT >= 26) {
                C0742k.f11041a.a(animatorSet);
            }
        } else {
            animatorSet.end();
        }
        if (T.K(2)) {
            g0Var.toString();
        }
    }

    @Override // g0.f0
    public final void b(ViewGroup viewGroup) {
        o6.j.e(viewGroup, "container");
        g0 g0Var = (g0) this.f11038c.f1023e;
        AnimatorSet animatorSet = this.f11039d;
        if (animatorSet == null) {
            g0Var.c(this);
            return;
        }
        animatorSet.start();
        if (T.K(2)) {
            Objects.toString(g0Var);
        }
    }

    @Override // g0.f0
    public final void c(C0548b c0548b, ViewGroup viewGroup) {
        o6.j.e(c0548b, "backEvent");
        o6.j.e(viewGroup, "container");
        g0 g0Var = (g0) this.f11038c.f1023e;
        AnimatorSet animatorSet = this.f11039d;
        if (animatorSet == null) {
            g0Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT >= 34 && g0Var.f11024c.f11120p) {
            if (T.K(2)) {
                g0Var.toString();
            }
            long a3 = C0741j.f11040a.a(animatorSet);
            long j = c0548b.f9309c * ((float) a3);
            if (j == 0) {
                j = 1;
            }
            if (j == a3) {
                j = a3 - 1;
            }
            if (T.K(2)) {
                animatorSet.toString();
                g0Var.toString();
            }
            C0742k.f11041a.b(animatorSet, j);
        }
    }

    @Override // g0.f0
    public final void d(ViewGroup viewGroup) {
        AnimatorSet animatorSet;
        boolean z8;
        C0740i c0740i;
        o6.j.e(viewGroup, "container");
        C0738g c0738g = this.f11038c;
        if (!c0738g.I0()) {
            Context context = viewGroup.getContext();
            o6.j.d(context, "context");
            R3.r K02 = c0738g.K0(context);
            if (K02 != null) {
                animatorSet = (AnimatorSet) K02.f5083f;
            } else {
                animatorSet = null;
            }
            this.f11039d = animatorSet;
            g0 g0Var = (g0) c0738g.f1023e;
            AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = g0Var.f11024c;
            if (g0Var.f11022a == 3) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z9 = z8;
            View view = abstractComponentCallbacksC0755y.K;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet2 = this.f11039d;
            if (animatorSet2 != null) {
                c0740i = this;
                animatorSet2.addListener(new C0739h(viewGroup, view, z9, g0Var, c0740i));
            } else {
                c0740i = this;
            }
            AnimatorSet animatorSet3 = c0740i.f11039d;
            if (animatorSet3 != null) {
                animatorSet3.setTarget(view);
            }
        }
    }
}
