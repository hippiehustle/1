package H3;

import D4.C0040p;
import O7.L;
import O7.V;
import O7.i0;
import d6.InterfaceC0617c;
import g2.C0777a;
import j2.AbstractC0901a;
import java.util.Iterator;
import java.util.List;
import k2.AbstractC0951a;
import l2.C1001a;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final C3.e f1980a;

    /* renamed from: b, reason: collision with root package name */
    public final L f1981b;

    /* renamed from: c, reason: collision with root package name */
    public final A4.c f1982c;

    /* renamed from: d, reason: collision with root package name */
    public final C0040p f1983d;

    /* renamed from: e, reason: collision with root package name */
    public final L f1984e;

    /* renamed from: f, reason: collision with root package name */
    public final A4.c f1985f;

    /* renamed from: g, reason: collision with root package name */
    public final P7.n f1986g;

    /* renamed from: h, reason: collision with root package name */
    public final P7.n f1987h;

    /* renamed from: i, reason: collision with root package name */
    public final P7.n f1988i;
    public final P7.n j;
    public final P7.n k;

    /* renamed from: l, reason: collision with root package name */
    public final P7.n f1989l;

    /* renamed from: m, reason: collision with root package name */
    public final P7.n f1990m;

    /* renamed from: n, reason: collision with root package name */
    public final P7.n f1991n;

    /* renamed from: o, reason: collision with root package name */
    public final P7.n f1992o;

    /* renamed from: p, reason: collision with root package name */
    public final A4.c f1993p;

    /* renamed from: q, reason: collision with root package name */
    public final A4.c f1994q;

    /* renamed from: r, reason: collision with root package name */
    public final L f1995r;

    /* renamed from: s, reason: collision with root package name */
    public final L f1996s;

    /* renamed from: t, reason: collision with root package name */
    public final t f1997t;

    /* renamed from: u, reason: collision with root package name */
    public final v f1998u;

    /* renamed from: v, reason: collision with root package name */
    public final W0.d f1999v;

    /* renamed from: w, reason: collision with root package name */
    public final W0.c f2000w;

    public y(b2.r rVar, C3.e eVar) {
        o6.j.e(rVar, "repository");
        this.f1980a = eVar;
        A4.c cVar = eVar.f598e;
        L l6 = eVar.k;
        L l8 = eVar.f603l;
        int i4 = 4;
        InterfaceC0617c interfaceC0617c = null;
        this.f1981b = V.h(cVar, l6, l8, new q(i4, interfaceC0617c, 0));
        this.f1982c = cVar;
        C0040p c0040p = new C0040p(l6, 2);
        this.f1983d = c0040p;
        this.f1984e = l8;
        A4.c cVar2 = eVar.f602i;
        this.f1985f = cVar2;
        i0 i0Var = eVar.f601h;
        int i8 = 3;
        this.f1986g = V.u(i0Var, new C3.d(i8, interfaceC0617c, 7));
        V.u(i0Var, new C3.d(i8, interfaceC0617c, 8));
        this.f1987h = V.u(i0Var, new C3.d(i8, interfaceC0617c, 9));
        this.f1988i = V.u(i0Var, new C3.d(i8, interfaceC0617c, 10));
        this.j = V.u(i0Var, new C3.d(i8, interfaceC0617c, 11));
        this.k = V.u(i0Var, new C3.d(i8, interfaceC0617c, 12));
        this.f1989l = V.u(i0Var, new C3.d(i8, interfaceC0617c, 13));
        this.f1990m = V.u(i0Var, new C3.d(i8, interfaceC0617c, 14));
        this.f1991n = V.u(i0Var, new C3.d(i8, interfaceC0617c, 15));
        this.f1992o = V.u(i0Var, new C3.d(i8, interfaceC0617c, 5));
        V.u(i0Var, new C3.d(i8, interfaceC0617c, 6));
        A4.c cVar3 = new A4.c(c0040p, rVar.f9115e, new p(i8, interfaceC0617c, 0), 27);
        this.f1993p = cVar3;
        A4.c cVar4 = new A4.c(l8, rVar.f9116f, new p(i8, interfaceC0617c, 1), 27);
        this.f1994q = cVar4;
        P7.n nVar = eVar.j;
        L h8 = V.h(nVar, cVar2, rVar.f9117g, new o(i4, interfaceC0617c, 1));
        this.f1995r = h8;
        L h9 = V.h(nVar, cVar2, rVar.f9118h, new o(i4, interfaceC0617c, 0));
        this.f1996s = h9;
        int i9 = 0;
        this.f1997t = new t(cVar3, i9);
        this.f1998u = new v(cVar4, i9);
        this.f1999v = new W0.d(7, h8);
        this.f2000w = new W0.c(6, h9);
    }

    public final f2.a a() {
        C3.a aVar;
        i0 i0Var;
        E3.a aVar2 = (E3.a) this.f1980a.f601h.f();
        if (aVar2 != null && (aVar = aVar2.f1193m) != null && (i0Var = aVar.f894h) != null) {
            return (f2.a) i0Var.f();
        }
        return null;
    }

    public final AbstractC0901a b() {
        D3.d dVar;
        i0 i0Var;
        E3.a aVar = (E3.a) this.f1980a.f601h.f();
        if (aVar != null && (dVar = aVar.f1192l) != null && (i0Var = dVar.f894h) != null) {
            return (AbstractC0901a) i0Var.f();
        }
        return null;
    }

    public final AbstractC0951a c() {
        AbstractC0951a abstractC0951a;
        i0 i0Var;
        E3.a aVar = (E3.a) this.f1980a.f601h.f();
        if (aVar != null && (i0Var = aVar.f894h) != null) {
            abstractC0951a = (AbstractC0951a) i0Var.f();
        } else {
            abstractC0951a = null;
        }
        if (abstractC0951a == null) {
            return null;
        }
        return abstractC0951a;
    }

    public final List d() {
        C3.a aVar;
        i0 i0Var;
        E3.a aVar2 = (E3.a) this.f1980a.f601h.f();
        if (aVar2 != null && (aVar = aVar2.f1193m) != null && (i0Var = aVar.f890d) != null) {
            return (List) i0Var.f();
        }
        return null;
    }

    public final List e() {
        D3.d dVar;
        i0 i0Var;
        E3.a aVar = (E3.a) this.f1980a.f601h.f();
        if (aVar != null && (dVar = aVar.f1192l) != null && (i0Var = dVar.f890d) != null) {
            return (List) i0Var.f();
        }
        return null;
    }

    public final C0777a f() {
        C3.a aVar;
        D3.d dVar;
        i0 i0Var;
        E3.a aVar2 = (E3.a) this.f1980a.f601h.f();
        if (aVar2 != null && (aVar = aVar2.f1193m) != null && (dVar = aVar.k) != null && (i0Var = dVar.f894h) != null) {
            return (C0777a) i0Var.f();
        }
        return null;
    }

    public final C1001a g() {
        return (C1001a) this.f1980a.f597d.f();
    }

    public final boolean h() {
        AbstractC0901a b4;
        E3.a aVar;
        C3.a aVar2;
        i0 i0Var;
        List list;
        Object obj;
        AbstractC0951a c6 = c();
        if (c6 != null && c6.h() != 2 && (b4 = b()) != null && (aVar = (E3.a) this.f1980a.f601h.f()) != null && (aVar2 = aVar.f1193m) != null && (i0Var = aVar2.f890d) != null && (list = (List) i0Var.f()) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    f2.a aVar3 = (f2.a) obj;
                    if ((aVar3 instanceof f2.e) && o6.j.a(((f2.e) aVar3).f10697h, b4.getId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                return true;
            }
            return false;
        }
        return false;
    }
}
