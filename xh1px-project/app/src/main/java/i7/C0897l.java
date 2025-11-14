package i7;

import C6.T;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import h6.AbstractC0837b;
import j7.C0942a;
import j7.InterfaceC0943b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import o6.v;
import w7.AbstractC1741c;
import w7.AbstractC1754p;
import w7.AbstractC1759v;
import w7.C1750l;
import w7.E;
import w7.I;
import w7.J;
import w7.M;
import w7.W;
import w7.X;
import w7.z;
import x7.AbstractC1825g;
import x7.C1819a;
import x7.C1823e;
import x7.C1824f;
import x7.C1827i;
import x7.InterfaceC1820b;
import x7.InterfaceC1821c;
import x7.t;
import z7.C1884a;
import z7.EnumC1885b;
import z7.EnumC1892i;
import z7.InterfaceC1886c;
import z7.InterfaceC1887d;
import z7.InterfaceC1888e;
import z7.InterfaceC1889f;
import z7.InterfaceC1890g;
import z7.InterfaceC1891h;

/* renamed from: i7.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0897l implements InterfaceC1820b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f11785a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1821c f11786b;

    public C0897l(HashMap hashMap, InterfaceC1821c interfaceC1821c) {
        o6.j.e(interfaceC1821c, "equalityAxioms");
        this.f11785a = hashMap;
        this.f11786b = interfaceC1821c;
    }

    @Override // x7.InterfaceC1820b
    public final boolean A(T t8, InterfaceC1891h interfaceC1891h) {
        return AbstractC1825g.v(t8, interfaceC1891h);
    }

    @Override // x7.InterfaceC1820b
    public final EnumC1892i B(T t8) {
        o6.j.e(t8, "$receiver");
        X e02 = t8.e0();
        o6.j.d(e02, "getVariance(...)");
        return AbstractC0837b.e(e02);
    }

    @Override // x7.InterfaceC1820b
    public final M C(InterfaceC1887d interfaceC1887d, int i4) {
        return AbstractC1825g.p(interfaceC1887d, i4);
    }

    @Override // x7.InterfaceC1820b
    public final boolean D(InterfaceC1891h interfaceC1891h) {
        return AbstractC1825g.D(interfaceC1891h);
    }

    @Override // x7.InterfaceC1820b
    public final boolean E(InterfaceC1888e interfaceC1888e, InterfaceC1888e interfaceC1888e2) {
        return AbstractC1825g.w(interfaceC1888e, interfaceC1888e2);
    }

    @Override // x7.InterfaceC1820b
    public final boolean F(InterfaceC1886c interfaceC1886c) {
        o6.j.e(interfaceC1886c, "$receiver");
        return interfaceC1886c instanceof C0942a;
    }

    @Override // x7.InterfaceC1820b
    public final AbstractC1754p G(InterfaceC1887d interfaceC1887d) {
        return AbstractC1825g.g(interfaceC1887d);
    }

    @Override // x7.InterfaceC1820b
    public final void H(InterfaceC1888e interfaceC1888e) {
        AbstractC1825g.M(interfaceC1888e);
    }

    @Override // x7.InterfaceC1820b
    public final Collection I(InterfaceC1891h interfaceC1891h) {
        return AbstractC1825g.U(interfaceC1891h);
    }

    @Override // x7.InterfaceC1820b
    public final InterfaceC1887d J(InterfaceC1887d interfaceC1887d) {
        return AbstractC1825g.Z(this, interfaceC1887d);
    }

    @Override // x7.InterfaceC1820b
    public final boolean K(InterfaceC1888e interfaceC1888e) {
        return AbstractC1825g.D(AbstractC1825g.V(interfaceC1888e));
    }

    @Override // x7.InterfaceC1820b
    public final z L(AbstractC1754p abstractC1754p) {
        return AbstractC1825g.X(abstractC1754p);
    }

    @Override // x7.InterfaceC1820b
    public final W M(InterfaceC1889f interfaceC1889f, InterfaceC1889f interfaceC1889f2) {
        return AbstractC1825g.m(this, interfaceC1889f, interfaceC1889f2);
    }

    @Override // x7.InterfaceC1820b
    public final M O(InterfaceC1888e interfaceC1888e, int i4) {
        o6.j.e(interfaceC1888e, "<this>");
        if (i4 >= 0 && i4 < AbstractC1825g.c(interfaceC1888e)) {
            return AbstractC1825g.p(interfaceC1888e, i4);
        }
        return null;
    }

    @Override // x7.InterfaceC1820b
    public final z P(InterfaceC1887d interfaceC1887d) {
        z X8;
        o6.j.e(interfaceC1887d, "<this>");
        AbstractC1754p g8 = AbstractC1825g.g(interfaceC1887d);
        if (g8 != null && (X8 = AbstractC1825g.X(g8)) != null) {
            return X8;
        }
        z h8 = AbstractC1825g.h(interfaceC1887d);
        o6.j.b(h8);
        return h8;
    }

    @Override // x7.InterfaceC1820b
    public final E Q(InterfaceC1887d interfaceC1887d) {
        return AbstractC1825g.i(interfaceC1887d);
    }

    @Override // x7.InterfaceC1820b
    public final boolean R(InterfaceC1891h interfaceC1891h) {
        return AbstractC1825g.A(interfaceC1891h);
    }

    @Override // x7.InterfaceC1820b
    public final C1827i S(InterfaceC1886c interfaceC1886c) {
        return AbstractC1825g.W(interfaceC1886c);
    }

    @Override // x7.InterfaceC1820b
    public final void T(InterfaceC1887d interfaceC1887d) {
        o6.j.e(interfaceC1887d, "<this>");
        AbstractC1825g.g(interfaceC1887d);
    }

    @Override // x7.InterfaceC1820b
    public final boolean U(InterfaceC1888e interfaceC1888e) {
        o6.j.e(interfaceC1888e, "<this>");
        if (AbstractC1825g.G(s(interfaceC1888e)) && !AbstractC1825g.H(interfaceC1888e)) {
            return true;
        }
        return false;
    }

    @Override // x7.InterfaceC1820b
    public final z V(AbstractC1759v abstractC1759v) {
        return AbstractC1825g.h(abstractC1759v);
    }

    @Override // x7.InterfaceC1820b
    public final boolean W(InterfaceC1891h interfaceC1891h) {
        return AbstractC1825g.x(interfaceC1891h);
    }

    @Override // x7.InterfaceC1820b
    public final boolean X(InterfaceC1891h interfaceC1891h) {
        return AbstractC1825g.G(interfaceC1891h);
    }

    @Override // x7.InterfaceC1820b
    public final Set Y(InterfaceC1888e interfaceC1888e) {
        return AbstractC1825g.R(this, interfaceC1888e);
    }

    @Override // x7.InterfaceC1820b
    public final boolean Z(InterfaceC1891h interfaceC1891h) {
        return AbstractC1825g.E(interfaceC1891h);
    }

    @Override // x7.InterfaceC1820b
    public final z a(InterfaceC1888e interfaceC1888e) {
        return AbstractC1825g.Y(interfaceC1888e, true);
    }

    @Override // x7.InterfaceC1820b
    public final boolean a0(W w8) {
        o6.j.e(w8, "<this>");
        if (AbstractC1825g.F(k(w8)) != AbstractC1825g.F(P(w8))) {
            return true;
        }
        return false;
    }

    @Override // x7.InterfaceC1820b
    public final boolean b(InterfaceC1886c interfaceC1886c) {
        return AbstractC1825g.J(interfaceC1886c);
    }

    @Override // x7.InterfaceC1820b
    public final int b0(InterfaceC1887d interfaceC1887d) {
        return AbstractC1825g.c(interfaceC1887d);
    }

    @Override // x7.InterfaceC1820b
    public final boolean c(InterfaceC1888e interfaceC1888e) {
        o6.j.e(interfaceC1888e, "<this>");
        return AbstractC1825g.y(AbstractC1825g.V(interfaceC1888e));
    }

    @Override // x7.InterfaceC1820b
    public final J c0(InterfaceC1888e interfaceC1888e) {
        return AbstractC1825g.V(interfaceC1888e);
    }

    @Override // x7.InterfaceC1820b
    public final z d(InterfaceC1888e interfaceC1888e) {
        return AbstractC1825g.Y(interfaceC1888e, false);
    }

    @Override // x7.InterfaceC1820b
    public final C1819a d0(InterfaceC1888e interfaceC1888e) {
        return AbstractC1825g.T(this, interfaceC1888e);
    }

    @Override // x7.InterfaceC1820b
    public final z e(InterfaceC1887d interfaceC1887d) {
        return AbstractC1825g.h(interfaceC1887d);
    }

    @Override // x7.InterfaceC1820b
    public final M e0(InterfaceC0943b interfaceC0943b) {
        return AbstractC1825g.S(interfaceC0943b);
    }

    @Override // x7.InterfaceC1820b
    public final boolean f(InterfaceC1887d interfaceC1887d) {
        o6.j.e(interfaceC1887d, "<this>");
        return !o6.j.a(AbstractC1825g.V(k(interfaceC1887d)), AbstractC1825g.V(P(interfaceC1887d)));
    }

    @Override // x7.InterfaceC1820b
    public final int f0(InterfaceC1890g interfaceC1890g) {
        o6.j.e(interfaceC1890g, "<this>");
        if (interfaceC1890g instanceof InterfaceC1888e) {
            return AbstractC1825g.c((InterfaceC1887d) interfaceC1890g);
        }
        if (interfaceC1890g instanceof C1884a) {
            return ((C1884a) interfaceC1890g).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC1890g + ", " + v.f13643a.b(interfaceC1890g.getClass())).toString());
    }

    @Override // x7.InterfaceC1820b
    public final int g(InterfaceC1891h interfaceC1891h) {
        return AbstractC1825g.Q(interfaceC1891h);
    }

    @Override // x7.InterfaceC1820b
    public final boolean g0(InterfaceC1887d interfaceC1887d) {
        C1750l c1750l;
        o6.j.e(interfaceC1887d, "<this>");
        z h8 = AbstractC1825g.h(interfaceC1887d);
        if (h8 != null) {
            c1750l = AbstractC1825g.f(h8);
        } else {
            c1750l = null;
        }
        if (c1750l != null) {
            return true;
        }
        return false;
    }

    @Override // x7.InterfaceC1820b
    public final boolean h(InterfaceC1891h interfaceC1891h, InterfaceC1891h interfaceC1891h2) {
        o6.j.e(interfaceC1891h, "c1");
        o6.j.e(interfaceC1891h2, "c2");
        if (interfaceC1891h instanceof J) {
            if (interfaceC1891h2 instanceof J) {
                if (!AbstractC1825g.b(interfaceC1891h, interfaceC1891h2)) {
                    J j = (J) interfaceC1891h;
                    J j5 = (J) interfaceC1891h2;
                    if (!this.f11786b.a(j, j5)) {
                        Map map = this.f11785a;
                        if (map != null) {
                            J j8 = (J) map.get(j);
                            J j9 = (J) map.get(j5);
                            if (j8 == null || !j8.equals(j5)) {
                                if (j9 == null || !j9.equals(j)) {
                                    return false;
                                }
                                return true;
                            }
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return true;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // x7.InterfaceC1820b
    public final EnumC1885b h0(InterfaceC1886c interfaceC1886c) {
        return AbstractC1825g.k(interfaceC1886c);
    }

    @Override // x7.InterfaceC1820b
    public final W i(InterfaceC1886c interfaceC1886c) {
        return AbstractC1825g.O(interfaceC1886c);
    }

    @Override // x7.InterfaceC1820b
    public final boolean i0(InterfaceC1891h interfaceC1891h) {
        return AbstractC1825g.y(interfaceC1891h);
    }

    @Override // x7.InterfaceC1820b
    public final T j(InterfaceC1891h interfaceC1891h, int i4) {
        return AbstractC1825g.q(interfaceC1891h, i4);
    }

    @Override // x7.InterfaceC1820b
    public final boolean j0(M m6) {
        return AbstractC1825g.K(m6);
    }

    @Override // x7.InterfaceC1820b
    public final z k(InterfaceC1887d interfaceC1887d) {
        z N8;
        o6.j.e(interfaceC1887d, "<this>");
        AbstractC1754p g8 = AbstractC1825g.g(interfaceC1887d);
        if (g8 != null && (N8 = AbstractC1825g.N(g8)) != null) {
            return N8;
        }
        z h8 = AbstractC1825g.h(interfaceC1887d);
        o6.j.b(h8);
        return h8;
    }

    @Override // x7.InterfaceC1820b
    public final InterfaceC1886c k0(InterfaceC1888e interfaceC1888e) {
        InterfaceC1889f interfaceC1889f;
        o6.j.e(interfaceC1888e, "<this>");
        o6.j.e(interfaceC1888e, "<this>");
        C1750l f8 = AbstractC1825g.f(interfaceC1888e);
        if (f8 == null || (interfaceC1889f = f8.f16001e) == null) {
            interfaceC1889f = (InterfaceC1889f) interfaceC1888e;
        }
        return AbstractC1825g.e(this, interfaceC1889f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x7.InterfaceC1820b
    public final M l(InterfaceC1890g interfaceC1890g, int i4) {
        o6.j.e(interfaceC1890g, "<this>");
        if (interfaceC1890g instanceof InterfaceC1889f) {
            return AbstractC1825g.p((InterfaceC1887d) interfaceC1890g, i4);
        }
        if (interfaceC1890g instanceof C1884a) {
            E e9 = ((C1884a) interfaceC1890g).get(i4);
            o6.j.d(e9, "get(...)");
            return (M) e9;
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC1890g + ", " + v.f13643a.b(interfaceC1890g.getClass())).toString());
    }

    @Override // x7.InterfaceC1820b
    public final z l0(AbstractC1754p abstractC1754p) {
        return AbstractC1825g.N(abstractC1754p);
    }

    @Override // x7.InterfaceC1820b
    public final boolean m(InterfaceC1888e interfaceC1888e) {
        o6.j.e(interfaceC1888e, "<this>");
        if (AbstractC1825g.f(interfaceC1888e) != null) {
            return true;
        }
        return false;
    }

    @Override // x7.InterfaceC1820b
    public final boolean m0(InterfaceC1887d interfaceC1887d) {
        return AbstractC1825g.F(interfaceC1887d);
    }

    @Override // x7.InterfaceC1820b
    public final boolean n(InterfaceC1891h interfaceC1891h) {
        return AbstractC1825g.z(interfaceC1891h);
    }

    @Override // x7.InterfaceC1820b
    public final z n0(AbstractC1754p abstractC1754p) {
        return AbstractC1825g.X(abstractC1754p);
    }

    @Override // x7.InterfaceC1820b
    public final W o(ArrayList arrayList) {
        z zVar;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
                Iterator it = arrayList.iterator();
                boolean z8 = false;
                boolean z9 = false;
                while (it.hasNext()) {
                    W w8 = (W) it.next();
                    if (!z8 && !AbstractC1741c.j(w8)) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (w8 instanceof z) {
                        zVar = (z) w8;
                    } else if (w8 instanceof AbstractC1754p) {
                        o6.j.e(w8, "<this>");
                        zVar = ((AbstractC1754p) w8).f16006e;
                        z9 = true;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList2.add(zVar);
                }
                if (z8) {
                    return y7.l.c(y7.k.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
                }
                t tVar = t.f16307a;
                if (!z9) {
                    return tVar.b(arrayList2);
                }
                ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(AbstractC1741c.D((W) it2.next()));
                }
                return AbstractC1741c.e(tVar.b(arrayList2), tVar.b(arrayList3));
            }
            return (W) AbstractC0436k.F0(arrayList);
        }
        throw new IllegalStateException("Expected some types");
    }

    @Override // x7.InterfaceC1820b
    public final W o0(InterfaceC1887d interfaceC1887d) {
        return AbstractC1825g.P(interfaceC1887d);
    }

    @Override // x7.InterfaceC1820b
    public final boolean p(InterfaceC1888e interfaceC1888e) {
        InterfaceC1886c interfaceC1886c;
        o6.j.e(interfaceC1888e, "<this>");
        z h8 = AbstractC1825g.h(interfaceC1888e);
        if (h8 != null) {
            interfaceC1886c = k0(h8);
        } else {
            interfaceC1886c = null;
        }
        if (interfaceC1886c != null) {
            return true;
        }
        return false;
    }

    public final I p0() {
        return new I(true, true, this, C1823e.f16281a, C1824f.f16282a);
    }

    @Override // x7.InterfaceC1820b
    public final InterfaceC1890g q(InterfaceC1888e interfaceC1888e) {
        return AbstractC1825g.d(interfaceC1888e);
    }

    @Override // x7.InterfaceC1820b
    public final InterfaceC1886c r(z zVar) {
        return AbstractC1825g.e(this, zVar);
    }

    @Override // x7.InterfaceC1820b
    public final J s(InterfaceC1887d interfaceC1887d) {
        o6.j.e(interfaceC1887d, "<this>");
        z h8 = AbstractC1825g.h(interfaceC1887d);
        if (h8 == null) {
            h8 = k(interfaceC1887d);
        }
        return AbstractC1825g.V(h8);
    }

    @Override // x7.InterfaceC1820b
    public final boolean t(InterfaceC1888e interfaceC1888e) {
        return AbstractC1825g.B(interfaceC1888e);
    }

    @Override // x7.InterfaceC1820b
    public final z u(InterfaceC1888e interfaceC1888e) {
        return AbstractC1825g.j(interfaceC1888e);
    }

    @Override // x7.InterfaceC1820b
    public final boolean v(InterfaceC1887d interfaceC1887d) {
        o6.j.e(interfaceC1887d, "$receiver");
        return interfaceC1887d instanceof X6.g;
    }

    @Override // x7.InterfaceC1820b
    public final W w(M m6) {
        return AbstractC1825g.r(this, m6);
    }

    @Override // x7.InterfaceC1820b
    public final z x(AbstractC1754p abstractC1754p) {
        return AbstractC1825g.N(abstractC1754p);
    }

    @Override // x7.InterfaceC1820b
    public final EnumC1892i y(M m6) {
        return AbstractC1825g.t(m6);
    }

    @Override // x7.InterfaceC1820b
    public final void z(InterfaceC1888e interfaceC1888e) {
        AbstractC1825g.L(interfaceC1888e);
    }

    @Override // x7.InterfaceC1820b
    public final void N(InterfaceC1888e interfaceC1888e, InterfaceC1891h interfaceC1891h) {
    }
}
