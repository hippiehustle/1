package P;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f4301b;

    /* renamed from: a, reason: collision with root package name */
    public final t0 f4302a;

    static {
        i0 e0Var;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            e0Var = new h0();
        } else if (i4 >= 30) {
            e0Var = new g0();
        } else if (i4 >= 29) {
            e0Var = new f0();
        } else {
            e0Var = new e0();
        }
        f4301b = e0Var.b().f4308a.a().f4308a.b().f4308a.c();
    }

    public p0(t0 t0Var) {
        this.f4302a = t0Var;
    }

    public t0 a() {
        return this.f4302a;
    }

    public t0 b() {
        return this.f4302a;
    }

    public t0 c() {
        return this.f4302a;
    }

    public C0261i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (n() == p0Var.n() && m() == p0Var.m() && Objects.equals(j(), p0Var.j()) && Objects.equals(h(), p0Var.h()) && Objects.equals(e(), p0Var.e())) {
            return true;
        }
        return false;
    }

    public H.c f(int i4) {
        return H.c.f1847e;
    }

    public H.c g() {
        return j();
    }

    public H.c h() {
        return H.c.f1847e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public H.c i() {
        return j();
    }

    public H.c j() {
        return H.c.f1847e;
    }

    public H.c k() {
        return j();
    }

    public t0 l(int i4, int i8, int i9, int i10) {
        return f4301b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(View view) {
    }

    public void o(H.c[] cVarArr) {
    }

    public void p(t0 t0Var) {
    }

    public void q(H.c cVar) {
    }

    public void r(int i4) {
    }
}
