package y7;

import C6.AbstractC0015p;
import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0000a;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import C6.InterfaceC0012m;
import C6.M;
import C6.O;
import F6.C0059t;
import F6.K;
import F6.L;
import F6.w;
import a6.s;
import f7.C0725e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import n1.AbstractC1149a;
import w7.AbstractC1759v;
import w7.Q;

/* loaded from: classes.dex */
public final class f implements M {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ K f16521d;

    public f() {
        l lVar = l.f16567a;
        K N02 = K.N0(l.f16569c, EnumC0023y.f780g, AbstractC0015p.f758e, true, C0725e.g("<Error property>"), 1, O.f726a);
        i iVar = l.f16571e;
        s sVar = s.f7766d;
        N02.T0(iVar, sVar, null, null, sVar);
        this.f16521d = N02;
    }

    @Override // C6.InterfaceC0001b
    public final w A() {
        return this.f16521d.f1497x;
    }

    @Override // C6.W
    public final boolean F() {
        return this.f16521d.F();
    }

    @Override // C6.W
    public final boolean H() {
        return this.f16521d.j;
    }

    @Override // C6.InterfaceC0010k
    public final Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        K k = this.f16521d;
        k.getClass();
        return interfaceC0012m.N(k, obj);
    }

    @Override // C6.InterfaceC0001b
    public final Object L(InterfaceC0000a interfaceC0000a) {
        this.f16521d.getClass();
        return null;
    }

    @Override // C6.InterfaceC0001b
    public final w M() {
        return this.f16521d.f1498y;
    }

    @Override // C6.M
    public final C0059t O() {
        return this.f16521d.f1484D;
    }

    @Override // C6.InterfaceC0001b
    public final boolean S() {
        this.f16521d.getClass();
        return false;
    }

    @Override // C6.M
    public final C0059t T() {
        return this.f16521d.f1483C;
    }

    @Override // C6.InterfaceC0001b
    public final List W() {
        List W7 = this.f16521d.W();
        o6.j.d(W7, "getContextReceiverParameters(...)");
        return W7;
    }

    @Override // C6.W
    public final boolean Z() {
        return this.f16521d.f1491r;
    }

    @Override // C6.InterfaceC0010k
    public final M a() {
        M a3 = this.f16521d.a();
        o6.j.d(a3, "getOriginal(...)");
        return a3;
    }

    @Override // C6.V
    public final AbstractC1759v b() {
        AbstractC1759v b4 = this.f16521d.b();
        o6.j.d(b4, "getType(...)");
        return b4;
    }

    @Override // C6.M
    public final L c() {
        return this.f16521d.f1481A;
    }

    @Override // C6.InterfaceC0022x
    public final boolean c0() {
        return this.f16521d.f1493t;
    }

    @Override // C6.InterfaceC0013n
    public final C0014o d() {
        C0014o d2 = this.f16521d.d();
        o6.j.d(d2, "getVisibility(...)");
        return d2;
    }

    @Override // C6.InterfaceC0002c
    public final int e() {
        int e9 = this.f16521d.e();
        AbstractC1149a.n("getKind(...)", e9);
        return e9;
    }

    @Override // C6.Q
    public final M f(Q q6) {
        o6.j.e(q6, "substitutor");
        return this.f16521d.f(q6);
    }

    @Override // C6.M
    public final boolean f0() {
        return this.f16521d.f1495v;
    }

    @Override // D6.a
    public final D6.j getAnnotations() {
        D6.j annotations = this.f16521d.getAnnotations();
        o6.j.d(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // C6.InterfaceC0010k
    public final C0725e getName() {
        C0725e name = this.f16521d.getName();
        o6.j.d(name, "getName(...)");
        return name;
    }

    @Override // C6.InterfaceC0001b
    public final List getTypeParameters() {
        return this.f16521d.getTypeParameters();
    }

    @Override // C6.InterfaceC0011l
    public final O h() {
        O h8 = this.f16521d.h();
        o6.j.d(h8, "getSource(...)");
        return h8;
    }

    @Override // C6.InterfaceC0002c
    public final void h0(Collection collection) {
        this.f16521d.f1488o = collection;
    }

    @Override // C6.M
    public final F6.M i() {
        return this.f16521d.f1482B;
    }

    @Override // C6.InterfaceC0022x
    public final EnumC0023y j() {
        EnumC0023y j = this.f16521d.j();
        o6.j.d(j, "getModality(...)");
        return j;
    }

    @Override // C6.InterfaceC0010k
    public final InterfaceC0010k q() {
        InterfaceC0010k q6 = this.f16521d.q();
        o6.j.d(q6, "getContainingDeclaration(...)");
        return q6;
    }

    @Override // C6.InterfaceC0001b
    public final AbstractC1759v r() {
        return this.f16521d.r();
    }

    @Override // C6.InterfaceC0002c, C6.InterfaceC0001b
    public final Collection s() {
        Collection s8 = this.f16521d.s();
        o6.j.d(s8, "getOverriddenDescriptors(...)");
        return s8;
    }

    @Override // C6.W
    public final k7.g u0() {
        return this.f16521d.u0();
    }

    @Override // C6.M
    public final ArrayList v() {
        return this.f16521d.v();
    }

    @Override // C6.InterfaceC0022x
    public final boolean v0() {
        this.f16521d.getClass();
        return false;
    }

    @Override // C6.InterfaceC0002c
    public final InterfaceC0002c x(InterfaceC0004e interfaceC0004e, EnumC0023y enumC0023y, C0014o c0014o) {
        return this.f16521d.x(interfaceC0004e, enumC0023y, c0014o);
    }

    @Override // C6.InterfaceC0022x
    public final boolean z() {
        return this.f16521d.z();
    }

    @Override // C6.InterfaceC0001b
    public final List z0() {
        this.f16521d.z0();
        List list = Collections.EMPTY_LIST;
        o6.j.d(list, "getValueParameters(...)");
        return list;
    }
}
