package F6;

import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0008i;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import C6.InterfaceC0022x;
import f7.AbstractC0727g;
import f7.C0725e;
import n1.AbstractC1149a;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class Q extends AbstractC0061v implements P {
    public static final F K;

    /* renamed from: H, reason: collision with root package name */
    public final v7.n f1506H;

    /* renamed from: I, reason: collision with root package name */
    public final C6.S f1507I;

    /* renamed from: J, reason: collision with root package name */
    public C0050j f1508J;

    /* JADX WARN: Type inference failed for: r0v1, types: [F6.F, java.lang.Object] */
    static {
        o6.v.f13643a.f(new o6.p(Q.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0));
        K = new Object();
    }

    public Q(v7.n nVar, C6.S s8, C0050j c0050j, P p8, D6.j jVar, int i4, C6.O o7) {
        super(i4, s8, p8, o7, jVar, AbstractC0727g.f10812e);
        this.f1506H = nVar;
        this.f1507I = s8;
        B6.f fVar = new B6.f(this, 6, c0050j);
        v7.k kVar = (v7.k) nVar;
        kVar.getClass();
        new v7.h(kVar, fVar);
        this.f1508J = c0050j;
    }

    @Override // C6.InterfaceC0009j
    public final boolean I() {
        return this.f1508J.f1536H;
    }

    @Override // C6.InterfaceC0009j
    public final InterfaceC0004e J() {
        InterfaceC0004e J6 = this.f1508J.J();
        o6.j.d(J6, "getConstructedClass(...)");
        return J6;
    }

    @Override // F6.AbstractC0061v
    public final AbstractC0061v O0(int i4, InterfaceC0010k interfaceC0010k, InterfaceC0019u interfaceC0019u, C6.O o7, D6.j jVar, C0725e c0725e) {
        o6.j.e(interfaceC0010k, "newOwner");
        AbstractC1149a.l("kind", i4);
        o6.j.e(jVar, "annotations");
        if (i4 != 1) {
        }
        return new Q(this.f1506H, this.f1507I, this.f1508J, this, jVar, 1, o7);
    }

    @Override // F6.AbstractC0061v, F6.AbstractC0055o, F6.AbstractC0054n, C6.InterfaceC0010k
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public final P a() {
        InterfaceC0019u a3 = super.a();
        o6.j.c(a3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (P) a3;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0019u, C6.Q
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public final Q f(w7.Q q6) {
        o6.j.e(q6, "substitutor");
        InterfaceC0019u f8 = super.f(q6);
        o6.j.c(f8, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        Q q8 = (Q) f8;
        AbstractC1759v abstractC1759v = q8.k;
        o6.j.b(abstractC1759v);
        C0050j f9 = this.f1508J.L0().f(w7.Q.d(abstractC1759v));
        if (f9 == null) {
            return null;
        }
        q8.f1508J = f9;
        return q8;
    }

    @Override // F6.AbstractC0055o, C6.InterfaceC0010k
    public final InterfaceC0008i q() {
        return this.f1507I;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0001b
    public final AbstractC1759v r() {
        AbstractC1759v abstractC1759v = this.k;
        o6.j.b(abstractC1759v);
        return abstractC1759v;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0002c
    public final InterfaceC0002c x(InterfaceC0004e interfaceC0004e, EnumC0023y enumC0023y, C0014o c0014o) {
        o6.j.e(interfaceC0004e, "newOwner");
        o6.j.e(c0014o, "visibility");
        AbstractC1149a.l("kind", 2);
        C0060u S02 = S0(w7.Q.f15971b);
        S02.f1560e = interfaceC0004e;
        S02.f1561f = enumC0023y;
        S02.f1562g = c0014o;
        S02.f1564i = 2;
        S02.f1569p = false;
        InterfaceC0022x P02 = S02.f1558A.P0(S02);
        o6.j.c(P02, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (P) P02;
    }

    @Override // F6.AbstractC0055o, C6.InterfaceC0010k
    public final InterfaceC0010k q() {
        return this.f1507I;
    }
}
