package w6;

import C6.InterfaceC0002c;
import i.AbstractC0862a;
import u6.InterfaceC1646g;
import x6.InterfaceC1803g;

/* loaded from: classes.dex */
public abstract class l0 extends h0 implements InterfaceC1646g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f15871h = {o6.v.f13643a.f(new o6.p(l0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};

    /* renamed from: f, reason: collision with root package name */
    public final s0 f15872f = AbstractC0862a.l(null, new k0(this, 0));

    /* renamed from: g, reason: collision with root package name */
    public final Object f15873g = Z5.a.c(Z5.h.f7482d, new k0(this, 1));

    public final boolean equals(Object obj) {
        if ((obj instanceof l0) && o6.j.a(v(), ((l0) obj).v())) {
            return true;
        }
        return false;
    }

    @Override // u6.InterfaceC1641b
    public final String getName() {
        return A.j.q(new StringBuilder("<set-"), v().f15878g, '>');
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // w6.AbstractC1731s
    public final InterfaceC1803g h() {
        return (InterfaceC1803g) this.f15873g.getValue();
    }

    public final int hashCode() {
        return v().hashCode();
    }

    @Override // w6.AbstractC1731s
    public final InterfaceC0002c o() {
        u6.s sVar = f15871h[0];
        Object a3 = this.f15872f.a();
        o6.j.d(a3, "getValue(...)");
        return (F6.M) a3;
    }

    public final String toString() {
        return "setter of " + v();
    }

    @Override // w6.h0
    public final C6.L u() {
        u6.s sVar = f15871h[0];
        Object a3 = this.f15872f.a();
        o6.j.d(a3, "getValue(...)");
        return (F6.M) a3;
    }
}
