package s7;

import C6.C0014o;
import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.F;
import C6.InterfaceC0001b;
import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import C6.O;
import C6.P;
import F6.E;
import F6.K;
import F6.L;
import F6.M;
import F6.U;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import a7.C0439A;
import a7.C0447h;
import a7.C0453n;
import a7.I;
import a7.T;
import a7.b0;
import a7.h0;
import c7.AbstractC0582a;
import c7.AbstractC0586e;
import c7.C0584c;
import c7.C0590i;
import c7.InterfaceC0588g;
import f7.C0723c;
import f7.C0725e;
import g7.AbstractC0803l;
import h7.AbstractC0842e;
import i7.AbstractC0898m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC1098d;
import o.p1;
import u7.C1648a;
import u7.C1650c;
import u7.C1655h;
import u7.InterfaceC1657j;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final F3.m f14620a;

    /* renamed from: b, reason: collision with root package name */
    public final R3.r f14621b;

    public s(F3.m mVar) {
        this.f14620a = mVar;
        C1518i c1518i = (C1518i) mVar.f1371d;
        this.f14621b = new R3.r(c1518i.f14574b, c1518i.f14582l);
    }

    public final v a(InterfaceC0010k interfaceC0010k) {
        if (interfaceC0010k instanceof F) {
            C0723c c0723c = ((E) ((F) interfaceC0010k)).f1461i;
            F3.m mVar = this.f14620a;
            return new u(c0723c, (InterfaceC0588g) mVar.f1372e, (F6.B) mVar.f1374g, (InterfaceC1657j) mVar.j);
        }
        if (interfaceC0010k instanceof C1655h) {
            return ((C1655h) interfaceC0010k).f15413x;
        }
        return null;
    }

    public final D6.j b(AbstractC0803l abstractC0803l, int i4, int i8) {
        if (!AbstractC0586e.f9699c.c(i4).booleanValue()) {
            return D6.i.f1043a;
        }
        return new u7.u(((C1518i) this.f14620a.f1371d).f14573a, new p(this, abstractC0803l, i8, 0));
    }

    public final D6.j c(I i4, boolean z8) {
        if (!AbstractC0586e.f9699c.c(i4.f7856g).booleanValue()) {
            return D6.i.f1043a;
        }
        return new u7.u(((C1518i) this.f14620a.f1371d).f14573a, new q(this, z8, i4));
    }

    public final C1650c d(C0453n c0453n, boolean z8) {
        F3.m a3;
        F3.m mVar = this.f14620a;
        InterfaceC0010k interfaceC0010k = (InterfaceC0010k) mVar.f1373f;
        o6.j.c(interfaceC0010k, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC0004e interfaceC0004e = (InterfaceC0004e) interfaceC0010k;
        C1650c c1650c = new C1650c(interfaceC0004e, null, b(c0453n, c0453n.f8191g, 1), z8, 1, c0453n, (InterfaceC0588g) mVar.f1372e, (F6.B) mVar.f1374g, (C0590i) mVar.f1375h, (InterfaceC1657j) mVar.j, null);
        a3 = mVar.a(c1650c, a6.s.f7766d, (InterfaceC0588g) mVar.f1372e, (F6.B) mVar.f1374g, (C0590i) mVar.f1375h, (AbstractC0582a) mVar.f1376i);
        s sVar = (s) a3.f1377l;
        List list = c0453n.f8192h;
        o6.j.d(list, "getValueParameterList(...)");
        c1650c.a1(sVar.g(list, c0453n, 1), h7.u.c((h0) AbstractC0586e.f9700d.c(c0453n.f8191g)));
        c1650c.W0(interfaceC0004e.l());
        c1650c.f1598v = interfaceC0004e.c0();
        c1650c.f1602z = !AbstractC0586e.f9709o.c(c0453n.f8191g).booleanValue();
        return c1650c;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    public final u7.r e(C0439A c0439a) {
        int i4;
        D6.j c1648a;
        C0590i c0590i;
        F3.m a3;
        F6.w wVar;
        InterfaceC0004e interfaceC0004e;
        F6.w wVar2;
        AbstractC1759v i8;
        F3.m mVar = this.f14620a;
        InterfaceC0588g interfaceC0588g = (InterfaceC0588g) mVar.f1372e;
        F6.B b4 = (F6.B) mVar.f1374g;
        o6.j.e(c0439a, "proto");
        int i9 = 1;
        if ((c0439a.f7779f & 1) == 1) {
            i4 = c0439a.f7780g;
        } else {
            int i10 = c0439a.f7781h;
            i4 = ((i10 >> 8) << 6) + (i10 & 63);
        }
        int i11 = i4;
        D6.j b9 = b(c0439a, i11, 1);
        int i12 = c0439a.f7779f;
        int i13 = i12 & 32;
        D6.h hVar = D6.i.f1043a;
        if (i13 == 32 || (i12 & 64) == 64) {
            c1648a = new C1648a(((C1518i) mVar.f1371d).f14573a, new p(this, c0439a, i9, 1));
        } else {
            c1648a = hVar;
        }
        if (AbstractC1098d.g((InterfaceC0010k) mVar.f1373f).a(AbstractC0842e.t(interfaceC0588g, c0439a.f7782i)).equals(y.f14635a)) {
            c0590i = C0590i.f9728b;
        } else {
            c0590i = (C0590i) mVar.f1375h;
        }
        D6.j jVar = c1648a;
        u7.r rVar = new u7.r((InterfaceC0010k) mVar.f1373f, null, b9, AbstractC0842e.t(interfaceC0588g, c0439a.f7782i), h7.u.g((a7.B) AbstractC0586e.f9710p.c(i11)), c0439a, (InterfaceC0588g) mVar.f1372e, b4, c0590i, (InterfaceC1657j) mVar.j, null);
        List list = c0439a.f7783l;
        o6.j.d(list, "getTypeParameterList(...)");
        a3 = mVar.a(rVar, list, (InterfaceC0588g) mVar.f1372e, (F6.B) mVar.f1374g, (C0590i) mVar.f1375h, (AbstractC0582a) mVar.f1376i);
        p1 p1Var = (p1) a3.k;
        T j0 = AbstractC0405a.j0(c0439a, b4);
        if (j0 != null && (i8 = p1Var.i(j0)) != null) {
            wVar = AbstractC0898m.k(rVar, i8, jVar);
        } else {
            wVar = null;
        }
        InterfaceC0010k interfaceC0010k = (InterfaceC0010k) mVar.f1373f;
        if (interfaceC0010k instanceof InterfaceC0004e) {
            interfaceC0004e = (InterfaceC0004e) interfaceC0010k;
        } else {
            interfaceC0004e = null;
        }
        if (interfaceC0004e != null) {
            wVar2 = interfaceC0004e.F0();
        } else {
            wVar2 = null;
        }
        List q6 = AbstractC0405a.q(c0439a, b4);
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Object obj : q6) {
            int i15 = i14 + 1;
            if (i14 >= 0) {
                F6.w e9 = AbstractC0898m.e(rVar, p1Var.i((T) obj), null, hVar, i14);
                if (e9 != null) {
                    arrayList.add(e9);
                }
                i14 = i15;
            } else {
                AbstractC0437l.c0();
                throw null;
            }
        }
        List Q02 = AbstractC0436k.Q0(p1Var.k.values());
        s sVar = (s) a3.f1377l;
        List list2 = c0439a.f7790s;
        o6.j.d(list2, "getValueParameterList(...)");
        rVar.a1(wVar, wVar2, arrayList, Q02, sVar.g(list2, c0439a, 1), p1Var.i(AbstractC0405a.r0(c0439a, b4)), C1519j.e((a7.C) AbstractC0586e.f9701e.c(i11)), h7.u.c((h0) AbstractC0586e.f9700d.c(i11)), a6.t.f7767d);
        rVar.f1593q = AbstractC0586e.f9711q.c(i11).booleanValue();
        rVar.f1594r = AbstractC0586e.f9712r.c(i11).booleanValue();
        rVar.f1595s = AbstractC0586e.f9715u.c(i11).booleanValue();
        rVar.f1596t = AbstractC0586e.f9713s.c(i11).booleanValue();
        rVar.f1597u = AbstractC0586e.f9714t.c(i11).booleanValue();
        rVar.f1601y = AbstractC0586e.f9716v.c(i11).booleanValue();
        rVar.f1598v = AbstractC0586e.f9717w.c(i11).booleanValue();
        rVar.f1602z = !AbstractC0586e.f9718x.c(i11).booleanValue();
        ((C1518i) mVar.f1371d).f14583m.getClass();
        return rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0177  */
    /* JADX WARN: Type inference failed for: r0v8, types: [F6.t, D6.b] */
    /* JADX WARN: Type inference failed for: r2v22, types: [F6.t, D6.b] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u7.q f(I i4, boolean z8) {
        int i8;
        D6.j jVar;
        F3.m a3;
        D6.j jVar2;
        InterfaceC0010k interfaceC0010k;
        InterfaceC0004e interfaceC0004e;
        F6.w wVar;
        T k02;
        F6.w wVar2;
        Iterator it;
        u7.q qVar;
        boolean z9;
        L l6;
        M m6;
        InterfaceC0010k interfaceC0010k2;
        InterfaceC0004e interfaceC0004e2;
        EnumC0005f enumC0005f;
        F3.m a4;
        int i9;
        K k;
        AbstractC1759v i10;
        F3.m mVar = this.f14620a;
        InterfaceC0588g interfaceC0588g = (InterfaceC0588g) mVar.f1372e;
        F6.B b4 = (F6.B) mVar.f1374g;
        o6.j.e(i4, "proto");
        if ((i4.f7855f & 1) == 1) {
            i8 = i4.f7856g;
        } else {
            int i11 = i4.f7857h;
            i8 = ((i11 >> 8) << 6) + (i11 & 63);
        }
        D6.h hVar = D6.i.f1043a;
        if (z8) {
            List<C0447h> list = i4.f7871x;
            o6.j.d(list, "getAnnotationList(...)");
            ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
            for (C0447h c0447h : list) {
                o6.j.b(c0447h);
                arrayList.add(this.f14621b.z(c0447h, interfaceC0588g));
            }
            if (arrayList.isEmpty()) {
                jVar = hVar;
            } else {
                jVar = new D6.k(0, arrayList);
            }
        } else {
            jVar = null;
        }
        InterfaceC0010k interfaceC0010k3 = (InterfaceC0010k) mVar.f1373f;
        if (jVar == null) {
            jVar = b(i4, i8, 2);
        }
        int i12 = i8;
        K qVar2 = new u7.q(interfaceC0010k3, null, jVar, C1519j.e((a7.C) AbstractC0586e.f9701e.c(i8)), h7.u.c((h0) AbstractC0586e.f9700d.c(i8)), AbstractC0586e.f9719y.c(i8).booleanValue(), AbstractC0842e.t(interfaceC0588g, i4.f7858i), h7.u.g((a7.B) AbstractC0586e.f9710p.c(i8)), AbstractC0586e.f9684C.c(i8).booleanValue(), AbstractC0586e.f9683B.c(i8).booleanValue(), AbstractC0586e.f9686E.c(i8).booleanValue(), AbstractC0586e.f9687F.c(i8).booleanValue(), AbstractC0586e.f9688G.c(i8).booleanValue(), i4, (InterfaceC0588g) mVar.f1372e, b4, (C0590i) mVar.f1375h, (InterfaceC1657j) mVar.j);
        List list2 = i4.f7859l;
        o6.j.d(list2, "getTypeParameterList(...)");
        a3 = mVar.a(qVar2, list2, (InterfaceC0588g) mVar.f1372e, (F6.B) mVar.f1374g, (C0590i) mVar.f1375h, (AbstractC0582a) mVar.f1376i);
        p1 p1Var = (p1) a3.k;
        boolean booleanValue = AbstractC0586e.f9720z.c(i12).booleanValue();
        int i13 = 3;
        if (booleanValue) {
            int i14 = i4.f7855f;
            if ((i14 & 32) == 32 || (i14 & 64) == 64) {
                jVar2 = new C1648a(((C1518i) mVar.f1371d).f14573a, new p(this, i4, i13, 1));
                AbstractC1759v i15 = p1Var.i(AbstractC0405a.s0(i4, b4));
                List Q02 = AbstractC0436k.Q0(p1Var.k.values());
                interfaceC0010k = (InterfaceC0010k) mVar.f1373f;
                if (!(interfaceC0010k instanceof InterfaceC0004e)) {
                    interfaceC0004e = (InterfaceC0004e) interfaceC0010k;
                } else {
                    interfaceC0004e = null;
                }
                if (interfaceC0004e == null) {
                    wVar = interfaceC0004e.F0();
                } else {
                    wVar = null;
                }
                k02 = AbstractC0405a.k0(i4, b4);
                if (k02 == null && (i10 = p1Var.i(k02)) != null) {
                    wVar2 = AbstractC0898m.k(qVar2, i10, jVar2);
                } else {
                    wVar2 = null;
                }
                List r8 = AbstractC0405a.r(i4, b4);
                ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(r8, 10));
                int i16 = 0;
                for (it = r8.iterator(); it.hasNext(); it = it) {
                    Object next = it.next();
                    int i17 = i16 + 1;
                    if (i16 >= 0) {
                        arrayList2.add(AbstractC0898m.e(qVar2, p1Var.i((T) next), null, hVar, i16));
                        i16 = i17;
                    } else {
                        AbstractC0437l.c0();
                        throw null;
                    }
                }
                qVar2.T0(i15, Q02, wVar, wVar2, arrayList2);
                boolean booleanValue2 = AbstractC0586e.f9699c.c(i12).booleanValue();
                C0584c c0584c = AbstractC0586e.f9700d;
                h0 h0Var = (h0) c0584c.c(i12);
                C0584c c0584c2 = AbstractC0586e.f9701e;
                int b9 = AbstractC0586e.b(booleanValue2, h0Var, (a7.C) c0584c2.c(i12));
                P p8 = O.f726a;
                if (!booleanValue) {
                    if ((i4.f7855f & 256) == 256) {
                        i9 = i4.f7867t;
                    } else {
                        i9 = b9;
                    }
                    boolean booleanValue3 = AbstractC0586e.K.c(i9).booleanValue();
                    boolean booleanValue4 = AbstractC0586e.f9692L.c(i9).booleanValue();
                    boolean booleanValue5 = AbstractC0586e.f9693M.c(i9).booleanValue();
                    D6.j b10 = b(i4, i9, 3);
                    if (booleanValue3) {
                        EnumC0023y e9 = C1519j.e((a7.C) c0584c2.c(i9));
                        C0014o c6 = h7.u.c((h0) c0584c.c(i9));
                        z9 = true;
                        L l8 = new L(qVar2, b10, e9, c6, !booleanValue3, booleanValue4, booleanValue5, qVar2.e(), null, p8);
                        k = qVar2;
                        l6 = l8;
                    } else {
                        K k6 = qVar2;
                        z9 = true;
                        l6 = AbstractC0898m.f(k6, b10);
                        k = k6;
                    }
                    l6.P0(k.r());
                    qVar = k;
                } else {
                    qVar = qVar2;
                    z9 = true;
                    l6 = null;
                }
                if (!AbstractC0586e.f9682A.c(i12).booleanValue()) {
                    if ((i4.f7855f & 512) == 512) {
                        b9 = i4.f7868u;
                    }
                    boolean booleanValue6 = AbstractC0586e.K.c(b9).booleanValue();
                    boolean booleanValue7 = AbstractC0586e.f9692L.c(b9).booleanValue();
                    boolean booleanValue8 = AbstractC0586e.f9693M.c(b9).booleanValue();
                    D6.j b11 = b(i4, b9, 4);
                    if (booleanValue6) {
                        m6 = new M(qVar, b11, C1519j.e((a7.C) c0584c2.c(b9)), h7.u.c((h0) c0584c.c(b9)), !booleanValue6, booleanValue7, booleanValue8, qVar.e(), null, p8);
                        a4 = a3.a(m6, a6.s.f7766d, (InterfaceC0588g) a3.f1372e, (F6.B) a3.f1374g, (C0590i) a3.f1375h, (AbstractC0582a) a3.f1376i);
                        U u8 = (U) AbstractC0436k.G0(((s) a4.f1377l).g(E2.d.y(i4.f7866s), i4, 4));
                        if (u8 != null) {
                            m6.f1502q = u8;
                        } else {
                            M.G0(6);
                            throw null;
                        }
                    } else {
                        m6 = AbstractC0898m.g(qVar, b11);
                    }
                } else {
                    m6 = null;
                }
                if (AbstractC0586e.f9685D.c(i12).booleanValue()) {
                    qVar.R0(null, new o(this, i4, qVar, 0));
                }
                interfaceC0010k2 = (InterfaceC0010k) mVar.f1373f;
                if (!(interfaceC0010k2 instanceof InterfaceC0004e)) {
                    interfaceC0004e2 = (InterfaceC0004e) interfaceC0010k2;
                } else {
                    interfaceC0004e2 = null;
                }
                if (interfaceC0004e2 == null) {
                    enumC0005f = interfaceC0004e2.e();
                } else {
                    enumC0005f = null;
                }
                if (enumC0005f == EnumC0005f.f745h) {
                    qVar.R0(null, new o(this, i4, qVar, 1));
                }
                qVar.Q0(l6, m6, new D6.b(c(i4, false)), new D6.b(c(i4, z9)));
                return qVar;
            }
        }
        jVar2 = hVar;
        AbstractC1759v i152 = p1Var.i(AbstractC0405a.s0(i4, b4));
        List Q022 = AbstractC0436k.Q0(p1Var.k.values());
        interfaceC0010k = (InterfaceC0010k) mVar.f1373f;
        if (!(interfaceC0010k instanceof InterfaceC0004e)) {
        }
        if (interfaceC0004e == null) {
        }
        k02 = AbstractC0405a.k0(i4, b4);
        if (k02 == null) {
        }
        wVar2 = null;
        List r82 = AbstractC0405a.r(i4, b4);
        ArrayList arrayList22 = new ArrayList(AbstractC0438m.d0(r82, 10));
        int i162 = 0;
        while (it.hasNext()) {
        }
        qVar2.T0(i152, Q022, wVar, wVar2, arrayList22);
        boolean booleanValue22 = AbstractC0586e.f9699c.c(i12).booleanValue();
        C0584c c0584c3 = AbstractC0586e.f9700d;
        h0 h0Var2 = (h0) c0584c3.c(i12);
        C0584c c0584c22 = AbstractC0586e.f9701e;
        int b92 = AbstractC0586e.b(booleanValue22, h0Var2, (a7.C) c0584c22.c(i12));
        P p82 = O.f726a;
        if (!booleanValue) {
        }
        if (!AbstractC0586e.f9682A.c(i12).booleanValue()) {
        }
        if (AbstractC0586e.f9685D.c(i12).booleanValue()) {
        }
        interfaceC0010k2 = (InterfaceC0010k) mVar.f1373f;
        if (!(interfaceC0010k2 instanceof InterfaceC0004e)) {
        }
        if (interfaceC0004e2 == null) {
        }
        if (enumC0005f == EnumC0005f.f745h) {
        }
        qVar.Q0(l6, m6, new D6.b(c(i4, false)), new D6.b(c(i4, z9)));
        return qVar;
    }

    public final List g(List list, AbstractC0803l abstractC0803l, int i4) {
        int i8;
        int i9;
        D6.j jVar;
        s sVar = this;
        F3.m mVar = sVar.f14620a;
        F6.B b4 = (F6.B) mVar.f1374g;
        p1 p1Var = (p1) mVar.k;
        InterfaceC0010k interfaceC0010k = (InterfaceC0010k) mVar.f1373f;
        o6.j.c(interfaceC0010k, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC0001b interfaceC0001b = (InterfaceC0001b) interfaceC0010k;
        InterfaceC0010k q6 = interfaceC0001b.q();
        o6.j.d(q6, "getContainingDeclaration(...)");
        v a3 = sVar.a(q6);
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            AbstractC1759v abstractC1759v = null;
            if (i10 >= 0) {
                b0 b0Var = (b0) obj;
                if ((b0Var.f8015f & 1) == 1) {
                    i8 = b0Var.f8016g;
                } else {
                    i8 = 0;
                }
                if (a3 != null && AbstractC0586e.f9699c.c(i8).booleanValue()) {
                    i9 = i10;
                    jVar = new u7.u(((C1518i) mVar.f1371d).f14573a, new r(sVar, a3, abstractC0803l, i4, i9, b0Var));
                } else {
                    i9 = i10;
                    jVar = D6.i.f1043a;
                }
                C0725e t8 = AbstractC0842e.t((InterfaceC0588g) mVar.f1372e, b0Var.f8017h);
                AbstractC1759v i12 = p1Var.i(AbstractC0405a.G0(b0Var, b4));
                boolean booleanValue = AbstractC0586e.f9689H.c(i8).booleanValue();
                boolean booleanValue2 = AbstractC0586e.f9690I.c(i8).booleanValue();
                boolean booleanValue3 = AbstractC0586e.f9691J.c(i8).booleanValue();
                T L02 = AbstractC0405a.L0(b0Var, b4);
                if (L02 != null) {
                    abstractC1759v = p1Var.i(L02);
                }
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new U(interfaceC0001b, null, i9, jVar, t8, i12, booleanValue, booleanValue2, booleanValue3, abstractC1759v, O.f726a));
                arrayList = arrayList2;
                i10 = i11;
                sVar = this;
            } else {
                AbstractC0437l.c0();
                throw null;
            }
        }
        return AbstractC0436k.Q0(arrayList);
    }
}
