package P;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class W implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f4229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f4230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f4231c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f4233e;

    public W(d0 d0Var, t0 t0Var, t0 t0Var2, int i4, View view) {
        this.f4229a = d0Var;
        this.f4230b = t0Var;
        this.f4231c = t0Var2;
        this.f4232d = i4;
        this.f4233e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        i0 e0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        d0 d0Var = this.f4229a;
        d0Var.f4259a.d(animatedFraction);
        t0 t0Var = this.f4230b;
        p0 p0Var = t0Var.f4308a;
        float b4 = d0Var.f4259a.b();
        PathInterpolator pathInterpolator = Y.f4236e;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            e0Var = new h0(t0Var);
        } else if (i4 >= 30) {
            e0Var = new g0(t0Var);
        } else if (i4 >= 29) {
            e0Var = new f0(t0Var);
        } else {
            e0Var = new e0(t0Var);
        }
        for (int i8 = 1; i8 <= 512; i8 <<= 1) {
            if ((this.f4232d & i8) == 0) {
                e0Var.c(i8, p0Var.f(i8));
            } else {
                H.c f8 = p0Var.f(i8);
                H.c f9 = this.f4231c.f4308a.f(i8);
                float f10 = 1.0f - b4;
                e0Var.c(i8, t0.e(f8, (int) (((f8.f1848a - f9.f1848a) * f10) + 0.5d), (int) (((f8.f1849b - f9.f1849b) * f10) + 0.5d), (int) (((f8.f1850c - f9.f1850c) * f10) + 0.5d), (int) (((f8.f1851d - f9.f1851d) * f10) + 0.5d)));
            }
        }
        Y.g(this.f4233e, e0Var.b(), Collections.singletonList(d0Var));
    }
}
