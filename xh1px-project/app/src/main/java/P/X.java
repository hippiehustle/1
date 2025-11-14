package P;

import J0.C0075i;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class X implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0256d f4234a;

    /* renamed from: b, reason: collision with root package name */
    public t0 f4235b;

    public X(View view, C0256d c0256d) {
        t0 t0Var;
        i0 e0Var;
        this.f4234a = c0256d;
        WeakHashMap weakHashMap = O.f4214a;
        t0 a3 = G.a(view);
        if (a3 != null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34) {
                e0Var = new h0(a3);
            } else if (i4 >= 30) {
                e0Var = new g0(a3);
            } else if (i4 >= 29) {
                e0Var = new f0(a3);
            } else {
                e0Var = new e0(a3);
            }
            t0Var = e0Var.b();
        } else {
            t0Var = null;
        }
        this.f4235b = t0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j;
        int[] iArr;
        boolean z8;
        boolean z9;
        if (!view.isLaidOut()) {
            this.f4235b = t0.g(view, windowInsets);
            return Y.i(view, windowInsets);
        }
        t0 g8 = t0.g(view, windowInsets);
        p0 p0Var = g8.f4308a;
        if (this.f4235b == null) {
            WeakHashMap weakHashMap = O.f4214a;
            this.f4235b = G.a(view);
        }
        if (this.f4235b == null) {
            this.f4235b = g8;
            return Y.i(view, windowInsets);
        }
        C0256d j5 = Y.j(view);
        if (j5 != null && Objects.equals((t0) j5.f4254e, g8)) {
            return Y.i(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        t0 t0Var = this.f4235b;
        int i4 = 1;
        while (i4 <= 512) {
            H.c f8 = p0Var.f(i4);
            H.c f9 = t0Var.f4308a.f(i4);
            int i8 = f8.f1848a;
            int i9 = f8.f1851d;
            int i10 = f8.f1850c;
            int i11 = f8.f1849b;
            int i12 = f9.f1848a;
            int i13 = f9.f1851d;
            int i14 = f9.f1850c;
            int i15 = f9.f1849b;
            if (i8 <= i12 && i11 <= i15 && i10 <= i14 && i9 <= i13) {
                iArr = iArr2;
                z8 = false;
            } else {
                iArr = iArr2;
                z8 = true;
            }
            if (i8 >= i12 && i11 >= i15 && i10 >= i14 && i9 >= i13) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z8 != z9) {
                if (z8) {
                    iArr[0] = iArr[0] | i4;
                } else {
                    iArr3[0] = iArr3[0] | i4;
                }
            }
            i4 <<= 1;
            iArr2 = iArr;
        }
        int i16 = iArr2[0];
        int i17 = iArr3[0];
        int i18 = i16 | i17;
        if (i18 == 0) {
            this.f4235b = g8;
            return Y.i(view, windowInsets);
        }
        t0 t0Var2 = this.f4235b;
        if ((i16 & 8) != 0) {
            interpolator = Y.f4236e;
        } else if ((i17 & 8) != 0) {
            interpolator = Y.f4237f;
        } else if ((i16 & 519) != 0) {
            interpolator = Y.f4238g;
        } else if ((i17 & 519) != 0) {
            interpolator = Y.f4239h;
        } else {
            interpolator = null;
        }
        if ((i18 & 8) != 0) {
            j = 160;
        } else {
            j = 250;
        }
        d0 d0Var = new d0(i18, interpolator, j);
        d0Var.f4259a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(d0Var.f4259a.a());
        H.c f10 = p0Var.f(i18);
        H.c f11 = t0Var2.f4308a.f(i18);
        int min = Math.min(f10.f1848a, f11.f1848a);
        int i19 = f10.f1849b;
        int i20 = f11.f1849b;
        int min2 = Math.min(i19, i20);
        int i21 = f10.f1850c;
        int i22 = f11.f1850c;
        int min3 = Math.min(i21, i22);
        int i23 = f10.f1851d;
        int i24 = f11.f1851d;
        A.i iVar = new A.i(H.c.b(min, min2, min3, Math.min(i23, i24)), 27, H.c.b(Math.max(f10.f1848a, f11.f1848a), Math.max(i19, i20), Math.max(i21, i22), Math.max(i23, i24)));
        Y.f(view, g8, false);
        duration.addUpdateListener(new W(d0Var, g8, t0Var2, i18, view));
        duration.addListener(new C0075i(d0Var, view));
        r.a(view, new M.n(view, d0Var, iVar, duration));
        this.f4235b = g8;
        return Y.i(view, windowInsets);
    }
}
