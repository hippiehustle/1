package w6;

import C6.InterfaceC0002c;
import i.AbstractC0862a;
import x6.InterfaceC1803g;

/* loaded from: classes.dex */
public abstract class j0 extends h0 implements u6.n {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f15863h = {o6.v.f13643a.f(new o6.p(j0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};

    /* renamed from: f, reason: collision with root package name */
    public final s0 f15864f = AbstractC0862a.l(null, new i0(this, 0));

    /* renamed from: g, reason: collision with root package name */
    public final Object f15865g = Z5.a.c(Z5.h.f7482d, new i0(this, 1));

    public final boolean equals(Object obj) {
        if ((obj instanceof j0) && o6.j.a(v(), ((j0) obj).v())) {
            return true;
        }
        return false;
    }

    @Override // u6.InterfaceC1641b
    public final String getName() {
        return A.j.q(new StringBuilder("<get-"), v().f15878g, '>');
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // w6.AbstractC1731s
    public final InterfaceC1803g h() {
        return (InterfaceC1803g) this.f15865g.getValue();
    }

    public final int hashCode() {
        return v().hashCode();
    }

    @Override // w6.AbstractC1731s
    public final InterfaceC0002c o() {
        u6.s sVar = f15863h[0];
        Object a3 = this.f15864f.a();
        o6.j.d(a3, "getValue(...)");
        return (F6.L) a3;
    }

    public final String toString() {
        return "getter of " + v();
    }

    @Override // w6.h0
    public final C6.L u() {
        u6.s sVar = f15863h[0];
        Object a3 = this.f15864f.a();
        o6.j.d(a3, "getValue(...)");
        return (F6.L) a3;
    }
}
