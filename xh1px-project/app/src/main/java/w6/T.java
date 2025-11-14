package w6;

import I6.AbstractC0065d;
import c7.C0587f;
import f7.C0725e;
import java.util.Collection;
import p7.InterfaceC1333o;

/* loaded from: classes.dex */
public final class T extends F {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f15817g = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Class f15818e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15819f;

    public T(Class cls) {
        o6.j.e(cls, "jClass");
        this.f15818e = cls;
        this.f15819f = Z5.a.c(Z5.h.f7482d, new O(this, 0));
    }

    @Override // o6.InterfaceC1285d
    public final Class d() {
        return this.f15818e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T) {
            if (o6.j.a(this.f15818e, ((T) obj).f15818e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // w6.F
    public final Collection h() {
        return a6.s.f7766d;
    }

    public final int hashCode() {
        return this.f15818e.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // w6.F
    public final Collection i(C0725e c0725e) {
        s0 s0Var = ((S) this.f15819f.getValue()).f15814d;
        u6.s sVar = S.f15812g[1];
        Object a3 = s0Var.a();
        o6.j.d(a3, "getValue(...)");
        return ((InterfaceC1333o) a3).g(c0725e, K6.b.f2731e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, Z5.g] */
    @Override // w6.F
    public final C6.M j(int i4) {
        Z5.o oVar = (Z5.o) ((S) this.f15819f.getValue()).f15816f.getValue();
        if (oVar != null) {
            e7.f fVar = (e7.f) oVar.f7494d;
            a7.E e9 = (a7.E) oVar.f7495e;
            C0587f c0587f = (C0587f) oVar.f7496f;
            g7.n nVar = d7.k.f10523n;
            o6.j.d(nVar, "packageLocalVariable");
            a7.I i8 = (a7.I) E2.d.u(e9, nVar, i4);
            if (i8 != null) {
                a7.Z z8 = e9.j;
                o6.j.d(z8, "getTypeTable(...)");
                return (C6.M) y0.f(this.f15818e, i8, fVar, new F6.B(z8), c0587f, C1733u.f15915f);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, Z5.g] */
    @Override // w6.F
    public final Class l() {
        Class cls = (Class) ((S) this.f15819f.getValue()).f15815e.getValue();
        if (cls == null) {
            return this.f15818e;
        }
        return cls;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // w6.F
    public final Collection n(C0725e c0725e) {
        s0 s0Var = ((S) this.f15819f.getValue()).f15814d;
        u6.s sVar = S.f15812g[1];
        Object a3 = s0Var.a();
        o6.j.d(a3, "getValue(...)");
        return ((InterfaceC1333o) a3).f(c0725e, K6.b.f2731e);
    }

    public final String toString() {
        return "file class " + AbstractC0065d.a(this.f15818e).a();
    }
}
