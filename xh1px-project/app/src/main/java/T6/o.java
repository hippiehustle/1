package T6;

import C6.AbstractC0015p;
import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import C6.InterfaceC0018t;
import C6.InterfaceC0019u;
import F6.AbstractC0054n;
import F6.L;
import F6.N;
import F6.U;
import I6.AbstractC0065d;
import P6.AbstractC0280c;
import P6.AbstractC0282e;
import P6.AbstractC0283f;
import P6.C0281d;
import a.AbstractC0405a;
import a6.AbstractC0425A;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import f7.C0723c;
import f7.C0724d;
import f7.C0725e;
import i7.AbstractC0890e;
import i7.AbstractC0898m;
import i7.C0896k;
import java.lang.annotation.Annotation;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m7.AbstractC1098d;
import n1.AbstractC1149a;
import n6.InterfaceC1163b;
import n7.C1168a;
import p7.C1324f;
import p7.C1330l;
import q4.X;
import s3.AbstractC1492c;
import s7.InterfaceC1521l;
import u6.AbstractC1638C;
import w7.AbstractC1759v;
import w7.M;
import w7.S;
import w7.W;
import x7.InterfaceC1822d;

/* loaded from: classes.dex */
public final class o extends A {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f5868v = 0;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0004e f5869n;

    /* renamed from: o, reason: collision with root package name */
    public final I6.o f5870o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5871p;

    /* renamed from: q, reason: collision with root package name */
    public final v7.i f5872q;

    /* renamed from: r, reason: collision with root package name */
    public final v7.i f5873r;

    /* renamed from: s, reason: collision with root package name */
    public final v7.i f5874s;

    /* renamed from: t, reason: collision with root package name */
    public final v7.i f5875t;

    /* renamed from: u, reason: collision with root package name */
    public final U1.c f5876u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r6v1, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r6v2, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r6v4, types: [v7.i, v7.h] */
    public o(A4.a aVar, InterfaceC0004e interfaceC0004e, I6.o oVar, boolean z8, o oVar2) {
        super(aVar, oVar2);
        o6.j.e(aVar, "c");
        o6.j.e(oVar, "jClass");
        this.f5869n = interfaceC0004e;
        this.f5870o = oVar;
        this.f5871p = z8;
        v7.n nVar = ((S6.a) aVar.f280e).f5398a;
        j jVar = new j(this, aVar);
        v7.k kVar = (v7.k) nVar;
        kVar.getClass();
        this.f5872q = new v7.h(kVar, jVar);
        k kVar2 = new k(this, 0);
        v7.k kVar3 = (v7.k) nVar;
        kVar3.getClass();
        this.f5873r = new v7.h(kVar3, kVar2);
        j jVar2 = new j(aVar, this);
        v7.k kVar4 = (v7.k) nVar;
        kVar4.getClass();
        this.f5874s = new v7.h(kVar4, jVar2);
        k kVar5 = new k(this, 1);
        v7.k kVar6 = (v7.k) nVar;
        kVar6.getClass();
        this.f5875t = new v7.h(kVar6, kVar5);
        this.f5876u = ((v7.k) nVar).c(new l(this, 0, aVar));
    }

    public static N A(N n3, InterfaceC0019u interfaceC0019u, AbstractCollection abstractCollection) {
        if (!abstractCollection.isEmpty()) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                N n8 = (N) it.next();
                if (!n3.equals(n8) && n8.f1585F == null && D(n8, interfaceC0019u)) {
                    InterfaceC0019u build = n3.s0().g().build();
                    o6.j.b(build);
                    return (N) build;
                }
            }
            return n3;
        }
        return n3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static N B(N n3) {
        C0723c c0723c;
        List z02 = n3.z0();
        o6.j.d(z02, "getValueParameters(...)");
        U u8 = (U) AbstractC0436k.y0(z02);
        if (u8 != null) {
            InterfaceC0007h c6 = u8.b().B0().c();
            if (c6 != null) {
                C0724d h8 = AbstractC1098d.h(c6);
                if (!h8.d()) {
                    h8 = null;
                }
                if (h8 != null) {
                    c0723c = h8.g();
                    if (!o6.j.a(c0723c, z6.n.f16799g)) {
                        u8 = null;
                    }
                    if (u8 != null) {
                        InterfaceC0018t s02 = n3.s0();
                        List z03 = n3.z0();
                        o6.j.d(z03, "getValueParameters(...)");
                        N n8 = (N) s02.c(AbstractC0436k.n0(z03)).h(((M) u8.b().r0().get(0)).b()).build();
                        if (n8 != null) {
                            n8.f1601y = true;
                        }
                        return n8;
                    }
                }
            }
            c0723c = null;
            if (!o6.j.a(c0723c, z6.n.f16799g)) {
            }
            if (u8 != null) {
            }
        }
        return null;
    }

    public static boolean D(InterfaceC0019u interfaceC0019u, InterfaceC0019u interfaceC0019u2) {
        int b4 = C0896k.f11782c.n(interfaceC0019u2, interfaceC0019u, true).b();
        AbstractC1149a.n("getResult(...)", b4);
        if (b4 == 1 && !AbstractC0405a.u(interfaceC0019u2, interfaceC0019u)) {
            return true;
        }
        return false;
    }

    public static boolean E(N n3, N n8) {
        int i4 = AbstractC0280c.f4552l;
        o6.j.e(n3, "<this>");
        if (o6.j.a(n3.getName().b(), "removeAt") && o6.j.a(D2.f.f(n3), P6.F.f4540g.f4523e)) {
            n8 = n8.a();
        }
        o6.j.b(n8);
        return D(n8, n3);
    }

    public static N F(C6.M m6, String str, InterfaceC1163b interfaceC1163b) {
        N n3;
        boolean b4;
        Iterator it = ((Iterable) interfaceC1163b.m(C0725e.e(str))).iterator();
        do {
            n3 = null;
            if (!it.hasNext()) {
                break;
            }
            N n8 = (N) it.next();
            if (n8.z0().size() == 0) {
                x7.l lVar = InterfaceC1822d.f16280a;
                AbstractC1759v abstractC1759v = n8.k;
                if (abstractC1759v == null) {
                    b4 = false;
                } else {
                    b4 = lVar.b(abstractC1759v, m6.b());
                }
                if (b4) {
                    n3 = n8;
                }
            }
        } while (n3 == null);
        return n3;
    }

    public static N H(C6.M m6, InterfaceC1163b interfaceC1163b) {
        N n3;
        AbstractC1759v abstractC1759v;
        String b4 = m6.getName().b();
        o6.j.d(b4, "asString(...)");
        Iterator it = ((Iterable) interfaceC1163b.m(C0725e.e(P6.v.b(b4)))).iterator();
        do {
            n3 = null;
            if (!it.hasNext()) {
                break;
            }
            N n8 = (N) it.next();
            if (n8.z0().size() == 1 && (abstractC1759v = n8.k) != null) {
                C0725e c0725e = z6.h.f16714e;
                if (z6.h.E(abstractC1759v, z6.m.f16768d)) {
                    x7.l lVar = InterfaceC1822d.f16280a;
                    List z02 = n8.z0();
                    o6.j.d(z02, "getValueParameters(...)");
                    if (lVar.a(((U) AbstractC0436k.G0(z02)).b(), m6.b())) {
                        n3 = n8;
                    }
                }
            }
        } while (n3 == null);
        return n3;
    }

    public static boolean K(N n3, InterfaceC0019u interfaceC0019u) {
        String e9 = D2.f.e(n3, 2);
        InterfaceC0019u a3 = interfaceC0019u.a();
        o6.j.d(a3, "getOriginal(...)");
        if (o6.j.a(e9, D2.f.e(a3, 2)) && !D(n3, interfaceC0019u)) {
            return true;
        }
        return false;
    }

    public final boolean C(C6.M m6, InterfaceC1163b interfaceC1163b) {
        if (!D2.f.w(m6)) {
            N G8 = G(m6, interfaceC1163b);
            N H2 = H(m6, interfaceC1163b);
            if (G8 != null) {
                if (m6.H()) {
                    if (H2 != null && H2.j() == G8.j()) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, java.lang.Object] */
    public final N G(C6.M m6, InterfaceC1163b interfaceC1163b) {
        L l6;
        C0725e c0725e;
        L c6 = m6.c();
        String str = null;
        if (c6 != null) {
            l6 = (L) AbstractC1492c.u(c6);
        } else {
            l6 = null;
        }
        if (l6 != null) {
            z6.h.A(l6);
            InterfaceC0002c b4 = AbstractC1098d.b(AbstractC1098d.k(l6), C0281d.f4555g);
            if (b4 != null && (c0725e = (C0725e) AbstractC0283f.f4560a.get(AbstractC1098d.g(b4))) != null) {
                str = c0725e.b();
            }
        }
        if (str != null && !AbstractC1492c.w(this.f5869n, l6)) {
            return F(m6, str, interfaceC1163b);
        }
        String b9 = m6.getName().b();
        o6.j.d(b9, "asString(...)");
        return F(m6, P6.v.a(b9), interfaceC1163b);
    }

    public final LinkedHashSet I(C0725e c0725e) {
        Collection z8 = z();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = z8.iterator();
        while (it.hasNext()) {
            a6.q.f0(linkedHashSet, ((AbstractC1759v) it.next()).w0().g(c0725e, K6.b.f2734h));
        }
        return linkedHashSet;
    }

    public final Set J(C0725e c0725e) {
        Collection z8 = z();
        ArrayList arrayList = new ArrayList();
        Iterator it = z8.iterator();
        while (it.hasNext()) {
            Collection f8 = ((AbstractC1759v) it.next()).w0().f(c0725e, K6.b.f2734h);
            ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(f8, 10));
            Iterator it2 = f8.iterator();
            while (it2.hasNext()) {
                arrayList2.add((C6.M) it2.next());
            }
            a6.q.f0(arrayList, arrayList2);
        }
        return AbstractC0436k.V0(arrayList);
    }

    public final boolean L(N n3) {
        Collection Y;
        C0725e name = n3.getName();
        o6.j.d(name, "getName(...)");
        String b4 = name.b();
        o6.j.d(b4, "asString(...)");
        C0723c c0723c = P6.v.f4595a;
        if (!I7.v.a0(b4, "get") && !I7.v.a0(b4, "is")) {
            if (I7.v.a0(b4, "set")) {
                Y = AbstractC0434i.V0(new C0725e[]{X.K(name, "set", null, 4), X.K(name, "set", "is", 4)});
            } else {
                Y = (List) AbstractC0283f.f4561b.get(name);
                if (Y == null) {
                    Y = a6.s.f7766d;
                }
            }
        } else {
            C0725e K = X.K(name, "get", null, 12);
            if (K == null) {
                K = X.K(name, "is", null, 8);
            }
            Y = AbstractC0437l.Y(K);
        }
        if (!Y.isEmpty()) {
            Iterator it = Y.iterator();
            while (it.hasNext()) {
                Set<C6.M> J6 = J((C0725e) it.next());
                if (!J6.isEmpty()) {
                    for (C6.M m6 : J6) {
                        if (C(m6, new l(n3, this))) {
                            if (!m6.H()) {
                                String b9 = n3.getName().b();
                                o6.j.d(b9, "asString(...)");
                                if (!I7.v.a0(b9, "set")) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList = P6.F.f4534a;
        C0725e name2 = n3.getName();
        o6.j.d(name2, "getName(...)");
        C0725e c0725e = (C0725e) P6.F.k.get(name2);
        if (c0725e != null) {
            LinkedHashSet I8 = I(c0725e);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : I8) {
                N n8 = (N) obj;
                o6.j.e(n8, "<this>");
                if (AbstractC1492c.u(n8) != null) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                InterfaceC0018t s02 = n3.s0();
                s02.p(c0725e);
                s02.q();
                s02.j();
                InterfaceC0019u build = s02.build();
                o6.j.b(build);
                N n9 = (N) build;
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (E((N) it2.next(), n9)) {
                            return false;
                        }
                    }
                }
            }
        }
        int i4 = AbstractC0282e.f4559l;
        C0725e name3 = n3.getName();
        o6.j.d(name3, "getName(...)");
        if (AbstractC0282e.b(name3)) {
            C0725e name4 = n3.getName();
            o6.j.d(name4, "getName(...)");
            LinkedHashSet I9 = I(name4);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = I9.iterator();
            while (it3.hasNext()) {
                InterfaceC0019u a3 = AbstractC0282e.a((N) it3.next());
                if (a3 != null) {
                    arrayList3.add(a3);
                }
            }
            if (!arrayList3.isEmpty()) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    if (K(n3, (InterfaceC0019u) it4.next())) {
                        return false;
                    }
                }
            }
        }
        N B8 = B(n3);
        if (B8 != null) {
            C0725e name5 = n3.getName();
            o6.j.d(name5, "getName(...)");
            LinkedHashSet<N> I10 = I(name5);
            if (!I10.isEmpty()) {
                for (N n10 : I10) {
                    if (n10.p() && D(B8, n10)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void M(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        o6.j.e(((S6.a) this.f5793b.f280e).f5409n, "<this>");
        o6.j.e(this.f5869n, "scopeOwner");
    }

    public final ArrayList N(C0725e c0725e) {
        Collection d2 = ((InterfaceC0328c) this.f5796e.a()).d(c0725e);
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(d2, 10));
        Iterator it = d2.iterator();
        while (it.hasNext()) {
            arrayList.add(t((I6.x) it.next()));
        }
        return arrayList;
    }

    public final ArrayList O(C0725e c0725e) {
        LinkedHashSet I8 = I(c0725e);
        ArrayList arrayList = new ArrayList();
        for (Object obj : I8) {
            N n3 = (N) obj;
            o6.j.e(n3, "<this>");
            if (AbstractC1492c.u(n3) == null && AbstractC0282e.a(n3) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1335q
    public final InterfaceC0007h d(C0725e c0725e, K6.b bVar) {
        U1.c cVar;
        InterfaceC0004e interfaceC0004e;
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        M(c0725e, bVar);
        o oVar = (o) this.f5794c;
        if (oVar != null && (cVar = oVar.f5876u) != null && (interfaceC0004e = (InterfaceC0004e) cVar.m(c0725e)) != null) {
            return interfaceC0004e;
        }
        return (InterfaceC0007h) this.f5876u.m(c0725e);
    }

    @Override // T6.A, p7.AbstractC1334p, p7.InterfaceC1333o
    public final Collection f(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        M(c0725e, bVar);
        return super.f(c0725e, bVar);
    }

    @Override // T6.A, p7.AbstractC1334p, p7.InterfaceC1333o
    public final Collection g(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        M(c0725e, bVar);
        return super.g(c0725e, bVar);
    }

    @Override // T6.A
    public final Set h(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        return AbstractC0425A.g0((Set) this.f5873r.a(), ((Map) this.f5875t.a()).keySet());
    }

    @Override // T6.A
    public final Set i(C1324f c1324f, C1330l c1330l) {
        o6.j.e(c1324f, "kindFilter");
        InterfaceC0004e interfaceC0004e = this.f5869n;
        Collection d2 = interfaceC0004e.B().d();
        o6.j.d(d2, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = d2.iterator();
        while (it.hasNext()) {
            a6.q.f0(linkedHashSet, ((AbstractC1759v) it.next()).w0().b());
        }
        v7.i iVar = this.f5796e;
        linkedHashSet.addAll(((InterfaceC0328c) iVar.a()).a());
        linkedHashSet.addAll(((InterfaceC0328c) iVar.a()).b());
        linkedHashSet.addAll(h(c1324f, c1330l));
        A4.a aVar = this.f5793b;
        ((C1168a) ((S6.a) aVar.f280e).f5419x).getClass();
        o6.j.e(interfaceC0004e, "thisDescriptor");
        o6.j.e(aVar, "c");
        linkedHashSet.addAll(new ArrayList());
        return linkedHashSet;
    }

    @Override // T6.A
    public final void j(C0725e c0725e, ArrayList arrayList) {
        o6.j.e(c0725e, "name");
        boolean g8 = this.f5870o.g();
        InterfaceC0004e interfaceC0004e = this.f5869n;
        A4.a aVar = this.f5793b;
        if (g8) {
            v7.i iVar = this.f5796e;
            if (((InterfaceC0328c) iVar.a()).e(c0725e) != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((N) it.next()).z0().isEmpty()) {
                            break;
                        }
                    }
                }
                I6.A e9 = ((InterfaceC0328c) iVar.a()).e(c0725e);
                o6.j.b(e9);
                S6.c H2 = AbstractC1492c.H(aVar, e9);
                S6.a aVar2 = (S6.a) aVar.f280e;
                R6.f b12 = R6.f.b1(interfaceC0004e, H2, e9.c(), aVar2.j.b(e9), true);
                AbstractC1759v R5 = ((R.g) aVar.f283h).R(e9.f(), AbstractC0405a.D0(S.f15974e, false, null, 6));
                F6.w p8 = p();
                EnumC0023y.f777d.getClass();
                C0014o c0014o = AbstractC0015p.f758e;
                a6.s sVar = a6.s.f7766d;
                b12.a1(null, p8, sVar, sVar, sVar, R5, EnumC0023y.f780g, c0014o, null);
                b12.f5138H = 1;
                aVar2.f5404g.getClass();
                arrayList.add(b12);
            }
        }
        ((C1168a) ((S6.a) aVar.f280e).f5419x).getClass();
        o6.j.e(interfaceC0004e, "thisDescriptor");
        o6.j.e(c0725e, "name");
        o6.j.e(aVar, "c");
    }

    @Override // T6.A
    public final InterfaceC0328c k() {
        return new C0326a(this.f5870o, m.f5860e);
    }

    @Override // T6.A
    public final void m(LinkedHashSet linkedHashSet, C0725e c0725e) {
        o6.j.e(c0725e, "name");
        LinkedHashSet I8 = I(c0725e);
        ArrayList arrayList = P6.F.f4534a;
        if (!P6.F.j.contains(c0725e) && !AbstractC0282e.b(c0725e)) {
            if (!I8.isEmpty()) {
                Iterator it = I8.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC0019u) it.next()).p()) {
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : I8) {
                if (L((N) obj)) {
                    arrayList2.add(obj);
                }
            }
            w(linkedHashSet, c0725e, arrayList2, false);
            return;
        }
        int i4 = F7.i.f1630f;
        F7.i e9 = F7.l.e();
        LinkedHashSet p02 = AbstractC0405a.p0(c0725e, I8, a6.s.f7766d, this.f5869n, InterfaceC1521l.f14597a, ((x7.l) ((S6.a) this.f5793b.f280e).f5416u).f16298d);
        x(c0725e, linkedHashSet, p02, linkedHashSet, new A1.e(1, this, o.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 0, 23));
        x(c0725e, linkedHashSet, p02, e9, new A1.e(1, this, o.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 0, 24));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : I8) {
            if (L((N) obj2)) {
                arrayList3.add(obj2);
            }
        }
        w(linkedHashSet, c0725e, AbstractC0436k.C0(arrayList3, e9), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [T6.A, T6.o] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, Z5.g] */
    @Override // T6.A
    public final void n(C0725e c0725e, ArrayList arrayList) {
        ?? linkedHashSet;
        I6.x xVar;
        o6.j.e(c0725e, "name");
        boolean isAnnotation = this.f5870o.f2208a.isAnnotation();
        A4.a aVar = this.f5793b;
        if (isAnnotation && (xVar = (I6.x) AbstractC0436k.H0(((InterfaceC0328c) this.f5796e.a()).d(c0725e))) != null) {
            R6.g U02 = R6.g.U0(this.f5869n, AbstractC1492c.H(aVar, xVar), AbstractC1638C.N(xVar.e()), false, xVar.c(), ((S6.a) aVar.f280e).j.b(xVar), false);
            L f8 = AbstractC0898m.f(U02, D6.i.f1043a);
            U02.Q0(f8, null, null, null);
            o6.j.e(aVar, "<this>");
            AbstractC1759v l6 = A.l(xVar, new A4.a((S6.a) aVar.f280e, new S6.e(aVar, U02, xVar, 0), (Z5.g) aVar.f282g));
            F6.w p8 = p();
            a6.s sVar = a6.s.f7766d;
            U02.T0(l6, sVar, p8, null, sVar);
            f8.f1500q = l6;
            arrayList.add(U02);
        }
        Set J6 = J(c0725e);
        if (J6.isEmpty()) {
            return;
        }
        int i4 = F7.i.f1630f;
        F7.i e9 = F7.l.e();
        F7.i e10 = F7.l.e();
        y(J6, arrayList, e9, new n(this, 0));
        if (e9.isEmpty()) {
            linkedHashSet = AbstractC0436k.V0(J6);
        } else if (e9 instanceof Set) {
            linkedHashSet = new LinkedHashSet();
            for (Object obj : J6) {
                if (!e9.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
        } else {
            linkedHashSet = new LinkedHashSet(J6);
            linkedHashSet.removeAll(e9);
        }
        y(linkedHashSet, e10, null, new n(this, 1));
        LinkedHashSet g02 = AbstractC0425A.g0(J6, e10);
        S6.a aVar2 = (S6.a) aVar.f280e;
        arrayList.addAll(AbstractC0405a.p0(c0725e, g02, arrayList, this.f5869n, aVar2.f5403f, ((x7.l) aVar2.f5416u).f16298d));
    }

    @Override // T6.A
    public final Set o(C1324f c1324f) {
        o6.j.e(c1324f, "kindFilter");
        if (this.f5870o.f2208a.isAnnotation()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((InterfaceC0328c) this.f5796e.a()).f());
        Collection d2 = this.f5869n.B().d();
        o6.j.d(d2, "getSupertypes(...)");
        Iterator it = d2.iterator();
        while (it.hasNext()) {
            a6.q.f0(linkedHashSet, ((AbstractC1759v) it.next()).w0().c());
        }
        return linkedHashSet;
    }

    @Override // T6.A
    public final F6.w p() {
        InterfaceC0004e interfaceC0004e = this.f5869n;
        if (interfaceC0004e != null) {
            int i4 = AbstractC0890e.f11774a;
            return interfaceC0004e.F0();
        }
        AbstractC0890e.a(0);
        throw null;
    }

    @Override // T6.A
    public final InterfaceC0010k q() {
        return this.f5869n;
    }

    @Override // T6.A
    public final boolean r(R6.f fVar) {
        if (this.f5870o.f2208a.isAnnotation()) {
            return false;
        }
        return L(fVar);
    }

    @Override // T6.A
    public final z s(I6.x xVar, ArrayList arrayList, AbstractC1759v abstractC1759v, List list) {
        o6.j.e(xVar, "method");
        ((S6.a) this.f5793b.f280e).f5402e.getClass();
        if (this.f5869n != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new z(abstractC1759v, list, arrayList, list2);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"));
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "returnType";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "valueParameters";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "typeParameters";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "descriptor";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // T6.A
    public final String toString() {
        return "Lazy Java member scope for " + this.f5870o.c();
    }

    public final void v(ArrayList arrayList, R6.b bVar, int i4, I6.x xVar, AbstractC1759v abstractC1759v, AbstractC1759v abstractC1759v2) {
        I6.f fVar;
        boolean z8;
        C0725e c6 = xVar.c();
        W w8 = null;
        if (abstractC1759v != null) {
            W g8 = w7.U.g(abstractC1759v, false);
            Object defaultValue = xVar.f2216a.getDefaultValue();
            if (defaultValue != null) {
                Class<?> cls = defaultValue.getClass();
                List list = AbstractC0065d.f2192a;
                if (Enum.class.isAssignableFrom(cls)) {
                    fVar = new I6.t(null, (Enum) defaultValue);
                } else if (defaultValue instanceof Annotation) {
                    fVar = new I6.g(null, (Annotation) defaultValue);
                } else if (defaultValue instanceof Object[]) {
                    fVar = new I6.h(null, (Object[]) defaultValue);
                } else if (defaultValue instanceof Class) {
                    fVar = new I6.p(null, (Class) defaultValue);
                } else {
                    fVar = new I6.v(null, defaultValue);
                }
            } else {
                fVar = null;
            }
            if (fVar != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (abstractC1759v2 != null) {
                w8 = w7.U.g(abstractC1759v2, false);
            }
            arrayList.add(new U(bVar, null, i4, D6.i.f1043a, c6, g8, z8, false, false, w8, ((S6.a) this.f5793b.f280e).j.b(xVar)));
            return;
        }
        w7.U.a(2);
        throw null;
    }

    public final void w(LinkedHashSet linkedHashSet, C0725e c0725e, ArrayList arrayList, boolean z8) {
        S6.a aVar = (S6.a) this.f5793b.f280e;
        LinkedHashSet<N> p02 = AbstractC0405a.p0(c0725e, arrayList, linkedHashSet, this.f5869n, aVar.f5403f, ((x7.l) aVar.f5416u).f16298d);
        if (!z8) {
            linkedHashSet.addAll(p02);
            return;
        }
        ArrayList C02 = AbstractC0436k.C0(linkedHashSet, p02);
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(p02, 10));
        for (N n3 : p02) {
            N n8 = (N) AbstractC1492c.v(n3);
            if (n8 != null) {
                n3 = A(n3, n8, C02);
            }
            arrayList2.add(n3);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0130 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(C0725e c0725e, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, InterfaceC1163b interfaceC1163b) {
        N A2;
        Object obj;
        N n3;
        N A8;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            N n8 = (N) it.next();
            N n9 = (N) AbstractC1492c.u(n8);
            N n10 = null;
            if (n9 != null) {
                String r8 = AbstractC1492c.r(n9);
                o6.j.b(r8);
                Iterator it2 = ((Collection) interfaceC1163b.m(C0725e.e(r8))).iterator();
                while (it2.hasNext()) {
                    InterfaceC0018t s02 = ((N) it2.next()).s0();
                    s02.p(c0725e);
                    s02.q();
                    s02.j();
                    InterfaceC0019u build = s02.build();
                    o6.j.b(build);
                    N n11 = (N) build;
                    if (E(n9, n11)) {
                        A2 = A(n11, n9, linkedHashSet);
                        break;
                    }
                }
            }
            A2 = null;
            F7.l.a(abstractSet, A2);
            InterfaceC0019u a3 = AbstractC0282e.a(n8);
            if (a3 != 0) {
                C0725e name = ((AbstractC0054n) a3).getName();
                o6.j.d(name, "getName(...)");
                Iterator it3 = ((Iterable) interfaceC1163b.m(name)).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = it3.next();
                        if (K((N) obj, a3)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                N n12 = (N) obj;
                if (n12 != null) {
                    InterfaceC0018t s03 = n12.s0();
                    List z02 = a3.z0();
                    o6.j.d(z02, "getValueParameters(...)");
                    ArrayList arrayList = new ArrayList(AbstractC0438m.d0(z02, 10));
                    Iterator it4 = z02.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((U) it4.next()).b());
                    }
                    List z03 = n12.z0();
                    o6.j.d(z03, "getValueParameters(...)");
                    s03.c(AbstractC1638C.p(arrayList, z03, a3));
                    s03.q();
                    s03.j();
                    s03.m();
                    n3 = (N) s03.build();
                } else {
                    n3 = null;
                }
                if (n3 != null) {
                    if (!L(n3)) {
                        n3 = null;
                    }
                    if (n3 != null) {
                        A8 = A(n3, a3, linkedHashSet);
                        F7.l.a(abstractSet, A8);
                        if (!n8.p()) {
                            C0725e name2 = n8.getName();
                            o6.j.d(name2, "getName(...)");
                            Iterator it5 = ((Iterable) interfaceC1163b.m(name2)).iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    break;
                                }
                                N B8 = B((N) it5.next());
                                if (B8 == null || !D(B8, n8)) {
                                    B8 = null;
                                }
                                if (B8 != null) {
                                    n10 = B8;
                                    break;
                                }
                            }
                        }
                        F7.l.a(abstractSet, n10);
                    }
                }
            }
            A8 = null;
            F7.l.a(abstractSet, A8);
            if (!n8.p()) {
            }
            F7.l.a(abstractSet, n10);
        }
    }

    public final void y(Set set, AbstractCollection abstractCollection, F7.i iVar, InterfaceC1163b interfaceC1163b) {
        N n3;
        boolean z8;
        F6.M m6;
        R6.g gVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C6.M m8 = (C6.M) it.next();
            if (!C(m8, interfaceC1163b)) {
                gVar = null;
            } else {
                N G8 = G(m8, interfaceC1163b);
                o6.j.b(G8);
                if (m8.H()) {
                    n3 = H(m8, interfaceC1163b);
                    o6.j.b(n3);
                } else {
                    n3 = null;
                }
                if (n3 != null) {
                    n3.j();
                    G8.j();
                }
                InterfaceC0004e interfaceC0004e = this.f5869n;
                o6.j.e(interfaceC0004e, "ownerDescriptor");
                EnumC0023y j = G8.j();
                C0014o d2 = G8.d();
                if (n3 != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                R6.g gVar2 = new R6.g(interfaceC0004e, D6.i.f1043a, j, d2, z8, m8.getName(), G8.h(), null, 1, false, null);
                AbstractC1759v abstractC1759v = G8.k;
                o6.j.b(abstractC1759v);
                F6.w p8 = p();
                a6.s sVar = a6.s.f7766d;
                gVar2.T0(abstractC1759v, sVar, p8, null, sVar);
                L l6 = AbstractC0898m.l(gVar2, G8.getAnnotations(), false, G8.h());
                l6.f1471p = G8;
                l6.P0(gVar2.b());
                if (n3 != null) {
                    List z02 = n3.z0();
                    o6.j.d(z02, "getValueParameters(...)");
                    U u8 = (U) AbstractC0436k.r0(z02);
                    if (u8 != null) {
                        m6 = AbstractC0898m.m(gVar2, n3.getAnnotations(), u8.getAnnotations(), false, n3.d(), n3.h());
                        m6.f1471p = n3;
                    } else {
                        throw new AssertionError("No parameter found for " + n3);
                    }
                } else {
                    m6 = null;
                }
                gVar2.Q0(l6, m6, null, null);
                gVar = gVar2;
            }
            if (gVar != null) {
                abstractCollection.add(gVar);
                if (iVar != null) {
                    iVar.add(m8);
                    return;
                }
                return;
            }
        }
    }

    public final Collection z() {
        boolean z8 = this.f5871p;
        InterfaceC0004e interfaceC0004e = this.f5869n;
        if (z8) {
            Collection d2 = interfaceC0004e.B().d();
            o6.j.d(d2, "getSupertypes(...)");
            return d2;
        }
        ((x7.l) ((S6.a) this.f5793b.f280e).f5416u).getClass();
        o6.j.e(interfaceC0004e, "classDescriptor");
        Collection d3 = interfaceC0004e.B().d();
        o6.j.d(d3, "getSupertypes(...)");
        return d3;
    }
}
