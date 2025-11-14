package K2;

import L7.AbstractC0166y;
import L7.F;
import L7.k0;
import Q7.n;
import Z5.y;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import h7.u;
import java.util.Objects;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Animation f2608a;

    /* renamed from: b, reason: collision with root package name */
    public Animation f2609b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2610c = true;

    /* renamed from: d, reason: collision with root package name */
    public Q7.d f2611d;

    /* renamed from: e, reason: collision with root package name */
    public k0 f2612e;

    /* renamed from: f, reason: collision with root package name */
    public ConstraintLayout f2613f;

    /* JADX WARN: Type inference failed for: r1v1, types: [K2.a] */
    public final void a(ConstraintLayout constraintLayout, b bVar) {
        if (this.f2613f != null) {
            b();
        }
        constraintLayout.toString();
        S7.e eVar = F.f3175a;
        this.f2611d = AbstractC0166y.b(n.f4962a);
        Animation loadAnimation = AnimationUtils.loadAnimation(constraintLayout.getContext(), bVar.f2604d);
        o6.j.b(loadAnimation);
        final int i4 = 0;
        u.l(loadAnimation, new InterfaceC1162a(this) { // from class: K2.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d f2599e;

            {
                this.f2599e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i4) {
                    case 0:
                        ConstraintLayout constraintLayout2 = this.f2599e.f2613f;
                        if (constraintLayout2 != null) {
                            constraintLayout2.setVisibility(0);
                        }
                        return y.f7506a;
                    default:
                        ConstraintLayout constraintLayout3 = this.f2599e.f2613f;
                        if (constraintLayout3 != null) {
                            constraintLayout3.setVisibility(8);
                        }
                        return y.f7506a;
                }
            }
        }, null, 2);
        loadAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f2608a = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(constraintLayout.getContext(), bVar.f2605e);
        o6.j.b(loadAnimation2);
        final int i8 = 1;
        u.l(loadAnimation2, null, new InterfaceC1162a(this) { // from class: K2.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d f2599e;

            {
                this.f2599e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i8) {
                    case 0:
                        ConstraintLayout constraintLayout2 = this.f2599e.f2613f;
                        if (constraintLayout2 != null) {
                            constraintLayout2.setVisibility(0);
                        }
                        return y.f7506a;
                    default:
                        ConstraintLayout constraintLayout3 = this.f2599e.f2613f;
                        if (constraintLayout3 != null) {
                            constraintLayout3.setVisibility(8);
                        }
                        return y.f7506a;
                }
            }
        }, 1);
        loadAnimation2.setInterpolator(new AccelerateInterpolator());
        this.f2609b = loadAnimation2;
        this.f2613f = constraintLayout;
        if (constraintLayout.getVisibility() != 8) {
            d();
        }
    }

    public final void b() {
        Objects.toString(this.f2613f);
        Q7.d dVar = this.f2611d;
        if (dVar != null) {
            AbstractC0166y.e(dVar);
        }
        this.f2611d = null;
        this.f2613f = null;
    }

    public final void c() {
        ConstraintLayout constraintLayout = this.f2613f;
        if (constraintLayout == null || constraintLayout.getVisibility() != 8) {
            Objects.toString(this.f2613f);
            k0 k0Var = this.f2612e;
            if (k0Var != null) {
                k0Var.d(null);
            }
            this.f2612e = null;
            ConstraintLayout constraintLayout2 = this.f2613f;
            if (constraintLayout2 != null) {
                Animation animation = this.f2609b;
                if (animation != null) {
                    constraintLayout2.startAnimation(animation);
                } else {
                    o6.j.i("hideAnimation");
                    throw null;
                }
            }
        }
    }

    public final void d() {
        if (this.f2610c) {
            Objects.toString(this.f2613f);
            k0 k0Var = this.f2612e;
            if (k0Var != null) {
                k0Var.d(null);
            }
            this.f2612e = null;
            Q7.d dVar = this.f2611d;
            if (dVar != null) {
                this.f2612e = AbstractC0166y.q(dVar, null, null, new c(this, null), 3);
            }
        }
    }

    public final void e() {
        if (this.f2612e == null) {
            Objects.toString(this.f2613f);
            ConstraintLayout constraintLayout = this.f2613f;
            if (constraintLayout != null) {
                Animation animation = this.f2608a;
                if (animation != null) {
                    constraintLayout.startAnimation(animation);
                } else {
                    o6.j.i("showAnimation");
                    throw null;
                }
            }
        }
        d();
    }
}
