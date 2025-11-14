package P;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f4307b;

    /* renamed from: a, reason: collision with root package name */
    public final p0 f4308a;

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            f4307b = o0.f4300s;
        } else if (i4 >= 30) {
            f4307b = n0.f4297r;
        } else {
            f4307b = p0.f4301b;
        }
    }

    public t0(WindowInsets windowInsets) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            this.f4308a = new o0(this, windowInsets);
            return;
        }
        if (i4 >= 30) {
            this.f4308a = new n0(this, windowInsets);
            return;
        }
        if (i4 >= 29) {
            this.f4308a = new m0(this, windowInsets);
        } else if (i4 >= 28) {
            this.f4308a = new l0(this, windowInsets);
        } else {
            this.f4308a = new k0(this, windowInsets);
        }
    }

    public static H.c e(H.c cVar, int i4, int i8, int i9, int i10) {
        int max = Math.max(0, cVar.f1848a - i4);
        int max2 = Math.max(0, cVar.f1849b - i8);
        int max3 = Math.max(0, cVar.f1850c - i9);
        int max4 = Math.max(0, cVar.f1851d - i10);
        if (max == i4 && max2 == i8 && max3 == i9 && max4 == i10) {
            return cVar;
        }
        return H.c.b(max, max2, max3, max4);
    }

    public static t0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        t0 t0Var = new t0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = O.f4214a;
            t0 a3 = G.a(view);
            p0 p0Var = t0Var.f4308a;
            p0Var.p(a3);
            p0Var.d(view.getRootView());
            p0Var.r(view.getWindowSystemUiVisibility());
        }
        return t0Var;
    }

    public final int a() {
        return this.f4308a.j().f1851d;
    }

    public final int b() {
        return this.f4308a.j().f1848a;
    }

    public final int c() {
        return this.f4308a.j().f1850c;
    }

    public final int d() {
        return this.f4308a.j().f1849b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        return Objects.equals(this.f4308a, ((t0) obj).f4308a);
    }

    public final WindowInsets f() {
        p0 p0Var = this.f4308a;
        if (p0Var instanceof j0) {
            return ((j0) p0Var).f4282c;
        }
        return null;
    }

    public final int hashCode() {
        p0 p0Var = this.f4308a;
        if (p0Var == null) {
            return 0;
        }
        return p0Var.hashCode();
    }

    public t0() {
        this.f4308a = new p0(this);
    }
}
