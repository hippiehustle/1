package X6;

import C6.AbstractC0021w;
import C6.InterfaceC0001b;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import C6.T;
import F6.K;
import F6.L;
import F6.w;
import I6.C0066e;
import P6.A;
import P6.C0279b;
import P6.EnumC0278a;
import P6.x;
import T6.C0331f;
import a.AbstractC0405a;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import f7.C0723c;
import f7.C0724d;
import h6.AbstractC0837b;
import i7.AbstractC0890e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import l7.AbstractC1037b;
import m7.AbstractC1098d;
import n6.InterfaceC1163b;
import u6.AbstractC1638C;
import w7.AbstractC1741c;
import w7.AbstractC1754p;
import w7.AbstractC1759v;
import w7.E;
import w7.G;
import w7.J;
import w7.M;
import w7.U;
import w7.W;
import w7.X;
import w7.z;
import x7.AbstractC1825g;
import z7.EnumC1892i;
import z7.InterfaceC1887d;

/* loaded from: classes.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0211  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c c(z zVar, T6.l lVar, int i4, s sVar, boolean z8, boolean z9) {
        boolean z10;
        boolean z11;
        InterfaceC0004e interfaceC0004e;
        Boolean bool;
        J B02;
        int i8;
        Iterator it;
        ArrayList arrayList;
        int i9;
        D6.k kVar;
        int size;
        D6.j jVar;
        boolean E02;
        boolean z12;
        M.i iVar;
        AbstractC1759v abstractC1759v;
        E e9;
        int i10;
        T6.l lVar2 = lVar;
        ?? r32 = 0;
        s sVar2 = s.f7042f;
        if (sVar != sVar2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 && z8) {
            z11 = false;
        } else {
            z11 = true;
        }
        Object obj = null;
        if (!z10 && zVar.r0().isEmpty()) {
            return new c(null, 1, false);
        }
        InterfaceC0007h c6 = zVar.B0().c();
        if (c6 == null) {
            return new c(null, 1, false);
        }
        e eVar = (e) lVar2.m(Integer.valueOf(i4));
        D6.k kVar2 = v.f7046a;
        if (sVar != sVar2 && (c6 instanceof InterfaceC0004e)) {
            if (eVar.f6997b == f.f7000d && sVar == s.f7040d) {
                InterfaceC0004e interfaceC0004e2 = (InterfaceC0004e) c6;
                String str = B6.d.f457a;
                C0724d g8 = AbstractC0890e.g(interfaceC0004e2);
                HashMap hashMap = B6.d.j;
                if (hashMap.containsKey(g8)) {
                    C0723c c0723c = (C0723c) hashMap.get(AbstractC0890e.g(interfaceC0004e2));
                    if (c0723c != null) {
                        interfaceC0004e = AbstractC1098d.e(interfaceC0004e2).j(c0723c);
                        if (sVar != sVar2) {
                            h hVar = eVar.f6996a;
                            if (hVar == null) {
                                i10 = -1;
                            } else {
                                i10 = u.f7045a[hVar.ordinal()];
                            }
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    bool = Boolean.FALSE;
                                }
                            } else {
                                bool = Boolean.TRUE;
                            }
                            if (interfaceC0004e != null || (B02 = interfaceC0004e.B()) == null) {
                                B02 = zVar.B0();
                            }
                            i8 = i4 + 1;
                            List r02 = zVar.r0();
                            List e10 = B02.e();
                            o6.j.d(e10, "getParameters(...)");
                            it = e10.iterator();
                            arrayList = new ArrayList(Math.min(AbstractC0438m.d0(r02, 10), AbstractC0438m.d0(e10, 10)));
                            while (r14.hasNext() && it.hasNext()) {
                                T t8 = (T) it.next();
                                M m6 = (M) r12;
                                if (z11) {
                                    iVar = new M.i((int) r32, obj);
                                } else if (!m6.c()) {
                                    iVar = d(m6.b().H0(), lVar2, i8, z9);
                                } else if (((e) lVar2.m(Integer.valueOf(i8))).f6996a == h.f7004d) {
                                    W H02 = m6.b().H0();
                                    iVar = new M.i(1, AbstractC1741c.e(AbstractC1741c.l(H02).I0(r32), AbstractC1741c.D(H02).I0(true)));
                                } else {
                                    iVar = new M.i(1, (Object) null);
                                }
                                i8 += iVar.f3287d;
                                abstractC1759v = (AbstractC1759v) iVar.f3288e;
                                if (abstractC1759v == null) {
                                    X a3 = m6.a();
                                    o6.j.d(a3, "getProjectionKind(...)");
                                    e9 = AbstractC0405a.t(abstractC1759v, a3, t8);
                                } else if (interfaceC0004e != null && !m6.c()) {
                                    AbstractC1759v b4 = m6.b();
                                    o6.j.d(b4, "getType(...)");
                                    X a4 = m6.a();
                                    o6.j.d(a4, "getProjectionKind(...)");
                                    e9 = AbstractC0405a.t(b4, a4, t8);
                                } else if (interfaceC0004e != null) {
                                    e9 = U.j(t8);
                                } else {
                                    e9 = null;
                                }
                                arrayList.add(e9);
                                lVar2 = lVar;
                                r32 = 0;
                                obj = null;
                            }
                            i9 = i8 - i4;
                            if (interfaceC0004e == null && bool == null) {
                                if (!arrayList.isEmpty()) {
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        if (((M) it2.next()) == null) {
                                        }
                                    }
                                }
                                return new c(null, i9, false);
                            }
                            D6.j annotations = zVar.getAnnotations();
                            D6.k kVar3 = v.f7047b;
                            if (interfaceC0004e == null) {
                                kVar3 = null;
                            }
                            D6.k kVar4 = v.f7046a;
                            if (bool == null) {
                                kVar = kVar4;
                            } else {
                                kVar = null;
                            }
                            ArrayList V02 = AbstractC0434i.V0(new D6.j[]{annotations, kVar3, kVar});
                            size = V02.size();
                            if (size == 0) {
                                if (size != 1) {
                                    jVar = new D6.k(1, AbstractC0436k.Q0(V02));
                                } else {
                                    jVar = (D6.j) AbstractC0436k.G0(V02);
                                }
                                G B8 = AbstractC1741c.B(jVar);
                                List r03 = zVar.r0();
                                Iterator it3 = arrayList.iterator();
                                Iterator it4 = r03.iterator();
                                ArrayList arrayList2 = new ArrayList(Math.min(AbstractC0438m.d0(arrayList, 10), AbstractC0438m.d0(r03, 10)));
                                while (it3.hasNext() && it4.hasNext()) {
                                    Object next = it3.next();
                                    M m8 = (M) it4.next();
                                    M m9 = (M) next;
                                    if (m9 != null) {
                                        m8 = m9;
                                    }
                                    arrayList2.add(m8);
                                }
                                if (bool != null) {
                                    E02 = bool.booleanValue();
                                } else {
                                    E02 = zVar.E0();
                                }
                                z t9 = AbstractC1741c.t(arrayList2, B8, B02, E02);
                                if (eVar.f6998c) {
                                    t9 = new g(t9);
                                }
                                if (bool != null && eVar.f6999d) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                return new c(t9, i9, z12);
                            }
                            throw new IllegalStateException("At least one Annotations object expected");
                        }
                        bool = null;
                        if (interfaceC0004e != null) {
                        }
                        B02 = zVar.B0();
                        i8 = i4 + 1;
                        List r022 = zVar.r0();
                        List e102 = B02.e();
                        o6.j.d(e102, "getParameters(...)");
                        it = e102.iterator();
                        arrayList = new ArrayList(Math.min(AbstractC0438m.d0(r022, 10), AbstractC0438m.d0(e102, 10)));
                        for (Object obj2 : r022) {
                            T t82 = (T) it.next();
                            M m62 = (M) obj2;
                            if (z11) {
                            }
                            i8 += iVar.f3287d;
                            abstractC1759v = (AbstractC1759v) iVar.f3288e;
                            if (abstractC1759v == null) {
                            }
                            arrayList.add(e9);
                            lVar2 = lVar;
                            r32 = 0;
                            obj = null;
                        }
                        i9 = i8 - i4;
                        if (interfaceC0004e == null) {
                            if (!arrayList.isEmpty()) {
                            }
                            return new c(null, i9, false);
                        }
                        D6.j annotations2 = zVar.getAnnotations();
                        D6.k kVar32 = v.f7047b;
                        if (interfaceC0004e == null) {
                        }
                        D6.k kVar42 = v.f7046a;
                        if (bool == null) {
                        }
                        ArrayList V022 = AbstractC0434i.V0(new D6.j[]{annotations2, kVar32, kVar});
                        size = V022.size();
                        if (size == 0) {
                        }
                    } else {
                        throw new IllegalArgumentException("Given class " + interfaceC0004e2 + " is not a mutable collection");
                    }
                }
            }
            if (eVar.f6997b == f.f7001e && sVar == s.f7041e) {
                InterfaceC0004e interfaceC0004e3 = (InterfaceC0004e) c6;
                String str2 = B6.d.f457a;
                if (B6.d.k.containsKey(AbstractC0890e.g(interfaceC0004e3))) {
                    interfaceC0004e = B6.e.a(interfaceC0004e3);
                    if (sVar != sVar2) {
                    }
                    bool = null;
                    if (interfaceC0004e != null) {
                    }
                    B02 = zVar.B0();
                    i8 = i4 + 1;
                    List r0222 = zVar.r0();
                    List e1022 = B02.e();
                    o6.j.d(e1022, "getParameters(...)");
                    it = e1022.iterator();
                    arrayList = new ArrayList(Math.min(AbstractC0438m.d0(r0222, 10), AbstractC0438m.d0(e1022, 10)));
                    while (r14.hasNext()) {
                    }
                    i9 = i8 - i4;
                    if (interfaceC0004e == null) {
                    }
                    D6.j annotations22 = zVar.getAnnotations();
                    D6.k kVar322 = v.f7047b;
                    if (interfaceC0004e == null) {
                    }
                    D6.k kVar422 = v.f7046a;
                    if (bool == null) {
                    }
                    ArrayList V0222 = AbstractC0434i.V0(new D6.j[]{annotations22, kVar322, kVar});
                    size = V0222.size();
                    if (size == 0) {
                    }
                }
            }
        }
        interfaceC0004e = null;
        if (sVar != sVar2) {
        }
        bool = null;
        if (interfaceC0004e != null) {
        }
        B02 = zVar.B0();
        i8 = i4 + 1;
        List r02222 = zVar.r0();
        List e10222 = B02.e();
        o6.j.d(e10222, "getParameters(...)");
        it = e10222.iterator();
        arrayList = new ArrayList(Math.min(AbstractC0438m.d0(r02222, 10), AbstractC0438m.d0(e10222, 10)));
        while (r14.hasNext()) {
        }
        i9 = i8 - i4;
        if (interfaceC0004e == null) {
        }
        D6.j annotations222 = zVar.getAnnotations();
        D6.k kVar3222 = v.f7047b;
        if (interfaceC0004e == null) {
        }
        D6.k kVar4222 = v.f7046a;
        if (bool == null) {
        }
        ArrayList V02222 = AbstractC0434i.V0(new D6.j[]{annotations222, kVar3222, kVar});
        size = V02222.size();
        if (size == 0) {
        }
    }

    public static M.i d(W w8, T6.l lVar, int i4, boolean z8) {
        AbstractC1759v abstractC1759v;
        Object obj = null;
        if (AbstractC1741c.j(w8)) {
            return new M.i(1, (Object) null);
        }
        if (w8 instanceof AbstractC1754p) {
            boolean z9 = w8 instanceof U6.h;
            AbstractC1754p abstractC1754p = (AbstractC1754p) w8;
            z zVar = abstractC1754p.f16007f;
            z zVar2 = abstractC1754p.f16006e;
            c c6 = c(abstractC1754p.f16006e, lVar, i4, s.f7040d, z9, z8);
            c c9 = c(abstractC1754p.f16007f, lVar, i4, s.f7041e, z9, z8);
            z zVar3 = (z) c9.f6994c;
            z zVar4 = (z) c6.f6994c;
            if (zVar4 != null || zVar3 != null) {
                if (!c6.f6992a && !c9.f6992a) {
                    if (z9) {
                        if (zVar4 != null) {
                            zVar2 = zVar4;
                        }
                        if (zVar3 != null) {
                            zVar = zVar3;
                        }
                        obj = new U6.h(zVar2, zVar);
                    } else {
                        if (zVar4 != null) {
                            zVar2 = zVar4;
                        }
                        if (zVar3 != null) {
                            zVar = zVar3;
                        }
                        obj = AbstractC1741c.e(zVar2, zVar);
                    }
                } else {
                    if (zVar3 != null) {
                        if (zVar4 == null) {
                            zVar4 = zVar3;
                        }
                        abstractC1759v = AbstractC1741c.e(zVar4, zVar3);
                    } else {
                        o6.j.b(zVar4);
                        abstractC1759v = zVar4;
                    }
                    obj = AbstractC1741c.F(w8, abstractC1759v);
                }
            }
            return new M.i(c6.f6993b, obj);
        }
        if (w8 instanceof z) {
            c c10 = c((z) w8, lVar, i4, s.f7042f, false, z8);
            AbstractC1759v abstractC1759v2 = (z) c10.f6994c;
            if (c10.f6992a) {
                abstractC1759v2 = AbstractC1741c.F(w8, abstractC1759v2);
            }
            return new M.i(c10.f6993b, abstractC1759v2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public AbstractC1759v a(InterfaceC0002c interfaceC0002c, InterfaceC0001b interfaceC0001b, boolean z8, A4.a aVar, EnumC0278a enumC0278a, t tVar, boolean z9, InterfaceC1163b interfaceC1163b) {
        r rVar = new r(interfaceC0001b, z8, aVar, enumC0278a, false);
        AbstractC1759v abstractC1759v = (AbstractC1759v) interfaceC1163b.m(interfaceC0002c);
        Collection<InterfaceC0002c> s8 = interfaceC0002c.s();
        o6.j.d(s8, "getOverriddenDescriptors(...)");
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(s8, 10));
        for (InterfaceC0002c interfaceC0002c2 : s8) {
            o6.j.b(interfaceC0002c2);
            arrayList.add((AbstractC1759v) interfaceC1163b.m(interfaceC0002c2));
        }
        return b(rVar, abstractC1759v, arrayList, tVar, z9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x0279, code lost:
    
        if (r13 == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x027e, code lost:
    
        if (r13 == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x028c, code lost:
    
        if (r8.compareTo(r9) <= 0) goto L175;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0338 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x038d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC1759v b(r rVar, AbstractC1759v abstractC1759v, List list, t tVar, boolean z8) {
        int size;
        T t8;
        boolean z9;
        Iterable iterable;
        EnumC0278a enumC0278a;
        D6.j annotations;
        Iterable iterable2;
        A4.a aVar;
        e[] eVarArr;
        boolean z10;
        h hVar;
        i iVar;
        i iVar2;
        i iVar3;
        e eVar;
        boolean z11;
        i c6;
        C0279b c0279b;
        i iVar4;
        i iVar5;
        boolean z12;
        f fVar;
        J s8;
        Iterator it;
        Iterator it2;
        h hVar2;
        Iterator it3;
        boolean z13;
        Iterator it4;
        e eVar2;
        InterfaceC1887d interfaceC1887d;
        h hVar3;
        f fVar2;
        EnumC1892i enumC1892i;
        r rVar2 = rVar;
        D6.a aVar2 = (D6.a) rVar2.f7037d;
        A4.a aVar3 = (A4.a) rVar2.f7038e;
        boolean z14 = rVar2.f7035b;
        o6.j.e(abstractC1759v, "<this>");
        ArrayList i4 = rVar.i(abstractC1759v);
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            arrayList.add(rVar2.i((InterfaceC1887d) it5.next()));
        }
        if (z14 && !list.isEmpty()) {
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                InterfaceC1887d interfaceC1887d2 = (InterfaceC1887d) it6.next();
                o6.j.e(interfaceC1887d2, "other");
                if (!((x7.l) ((S6.a) aVar3.f280e).f5416u).a(abstractC1759v, (AbstractC1759v) interfaceC1887d2)) {
                    size = 1;
                    break;
                }
            }
        }
        size = i4.size();
        e[] eVarArr2 = new e[size];
        int i8 = 0;
        while (i8 < size) {
            a aVar4 = (a) i4.get(i8);
            EnumC0278a enumC0278a2 = (EnumC0278a) rVar2.f7039f;
            InterfaceC1887d interfaceC1887d3 = aVar4.f6988a;
            T t9 = aVar4.f6990c;
            h hVar4 = h.f7004d;
            f fVar3 = f.f7001e;
            f fVar4 = f.f7000d;
            boolean z15 = z14;
            h hVar5 = h.f7005e;
            ArrayList arrayList2 = i4;
            h hVar6 = h.f7006f;
            ArrayList arrayList3 = arrayList;
            x7.m mVar = x7.m.f16299a;
            int i9 = size;
            if (interfaceC1887d3 == null) {
                if (t9 != null) {
                    X e02 = t9.e0();
                    t8 = t9;
                    o6.j.d(e02, "getVariance(...)");
                    enumC1892i = AbstractC0837b.e(e02);
                } else {
                    t8 = t9;
                    enumC1892i = null;
                }
                if (enumC1892i == EnumC1892i.f16825e) {
                    eVar = e.f6995e;
                    aVar = aVar3;
                    eVarArr = eVarArr2;
                    boolean z16 = eVar.f6999d;
                    ArrayList arrayList4 = new ArrayList();
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                        a aVar5 = (a) AbstractC0436k.s0(i8, (List) it.next());
                        if (aVar5 == null || (interfaceC1887d = aVar5.f6988a) == null) {
                            it4 = it;
                            eVar2 = null;
                        } else {
                            h f8 = r.f(interfaceC1887d);
                            if (f8 == null) {
                                AbstractC1759v f9 = AbstractC1741c.f((AbstractC1759v) interfaceC1887d);
                                hVar3 = f9 != null ? r.f(f9) : null;
                            } else {
                                hVar3 = f8;
                            }
                            String str = B6.d.f457a;
                            it4 = it;
                            if (B6.d.k.containsKey(r.e(mVar.k(interfaceC1887d)))) {
                                fVar2 = fVar4;
                            } else {
                                fVar2 = B6.d.j.containsKey(r.e(mVar.P(interfaceC1887d))) ? fVar3 : null;
                            }
                            eVar2 = new e(hVar3, fVar2, mVar.g0(interfaceC1887d) || (((AbstractC1759v) interfaceC1887d).H0() instanceof g), hVar3 != f8);
                        }
                        if (eVar2 != null) {
                            arrayList4.add(eVar2);
                        }
                        it = it4;
                    }
                    boolean z17 = i8 != 0 && z15;
                    boolean z18 = (i8 == 0 || !(aVar2 instanceof F6.U) || ((F6.U) aVar2).f1514n == null) ? false : true;
                    h hVar7 = eVar.f6996a;
                    ArrayList arrayList5 = new ArrayList();
                    it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        e eVar3 = (e) it2.next();
                        D6.a aVar6 = aVar2;
                        h hVar8 = eVar3.f6999d ? null : eVar3.f6996a;
                        if (hVar8 != null) {
                            arrayList5.add(hVar8);
                        }
                        aVar2 = aVar6;
                    }
                    D6.a aVar7 = aVar2;
                    Set V02 = AbstractC0436k.V0(arrayList5);
                    h hVar9 = !z16 ? null : hVar7;
                    hVar2 = hVar9 != hVar4 ? hVar4 : (h) E2.c.m0(V02, hVar6, hVar5, hVar9, z17);
                    if (hVar2 != null) {
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it7 = arrayList4.iterator();
                        while (it7.hasNext()) {
                            h hVar10 = ((e) it7.next()).f6996a;
                            if (hVar10 != null) {
                                arrayList6.add(hVar10);
                            }
                        }
                        Set V03 = AbstractC0436k.V0(arrayList6);
                        if (hVar7 != hVar4) {
                            hVar4 = (h) E2.c.m0(V03, hVar6, hVar5, hVar7, z17);
                        }
                    } else {
                        hVar4 = hVar2;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        f fVar5 = ((e) it3.next()).f6997b;
                        if (fVar5 != null) {
                            arrayList7.add(fVar5);
                        }
                    }
                    f fVar6 = (f) E2.c.m0(AbstractC0436k.V0(arrayList7), fVar3, fVar4, eVar.f6997b, z17);
                    if (hVar4 != null || z8 || (z18 && hVar4 == hVar5)) {
                        hVar4 = null;
                    }
                    boolean z19 = hVar4 == null && hVar2 == null;
                    if (hVar4 == hVar6) {
                        if (z16 != z19 || !eVar.f6998c) {
                            if (!arrayList4.isEmpty()) {
                                Iterator it8 = arrayList4.iterator();
                                while (it8.hasNext()) {
                                    e eVar4 = (e) it8.next();
                                    if (eVar4.f6999d != z19 || !eVar4.f6998c) {
                                    }
                                }
                            }
                        }
                        z13 = true;
                        eVarArr[i8] = new e(hVar4, fVar6, z13, z19);
                        i8++;
                        rVar2 = rVar;
                        aVar2 = aVar7;
                        z14 = z15;
                        i4 = arrayList2;
                        arrayList = arrayList3;
                        size = i9;
                        aVar3 = aVar;
                        eVarArr2 = eVarArr;
                    }
                    z13 = false;
                    eVarArr[i8] = new e(hVar4, fVar6, z13, z19);
                    i8++;
                    rVar2 = rVar;
                    aVar2 = aVar7;
                    z14 = z15;
                    i4 = arrayList2;
                    arrayList = arrayList3;
                    size = i9;
                    aVar3 = aVar;
                    eVarArr2 = eVarArr;
                }
            } else {
                t8 = t9;
            }
            boolean z20 = t8 == null;
            Iterable iterable3 = a6.s.f7766d;
            if (interfaceC1887d3 != null) {
                z9 = z20;
                iterable = ((AbstractC1759v) interfaceC1887d3).getAnnotations();
            } else {
                z9 = z20;
                iterable = iterable3;
            }
            T s9 = (interfaceC1887d3 == null || (s8 = mVar.s(interfaceC1887d3)) == null) ? null : AbstractC1825g.s(s8);
            boolean z21 = enumC0278a2 == EnumC0278a.f4547i;
            if (z9) {
                enumC0278a = enumC0278a2;
                if (!z21) {
                    ((S6.a) aVar3.f280e).f5415t.getClass();
                }
                if (aVar2 != null && (annotations = aVar2.getAnnotations()) != null) {
                    iterable3 = annotations;
                }
                iterable = AbstractC0436k.A0(iterable3, iterable);
            } else {
                enumC0278a = enumC0278a2;
            }
            ((S6.a) aVar3.f280e).f5412q.getClass();
            Iterator it9 = iterable.iterator();
            f fVar7 = null;
            while (true) {
                if (!it9.hasNext()) {
                    iterable2 = iterable;
                    break;
                }
                iterable2 = iterable;
                C0723c d2 = C0279b.d(it9.next());
                Iterator it10 = it9;
                if (AbstractC0436k.l0(x.f4623n, d2)) {
                    fVar = fVar4;
                } else if (AbstractC0436k.l0(x.f4624o, d2)) {
                    fVar = fVar3;
                } else {
                    continue;
                    it9 = it10;
                    iterable = iterable2;
                }
                if (fVar7 != null && fVar7 != fVar) {
                    fVar7 = null;
                    break;
                }
                fVar7 = fVar;
                it9 = it10;
                iterable = iterable2;
            }
            C0279b c0279b2 = ((S6.a) aVar3.f280e).f5412q;
            aVar = aVar3;
            T6.l lVar = new T6.l(rVar2, 3, aVar4);
            c0279b2.getClass();
            i iVar6 = null;
            for (Object obj : iterable2) {
                z10 = z21;
                i g8 = c0279b2.g(obj, ((Boolean) lVar.m(obj)).booleanValue());
                if (g8 != null) {
                    c0279b = c0279b2;
                    eVarArr = eVarArr2;
                    iVar4 = g8;
                } else {
                    Object i10 = c0279b2.i(obj);
                    if (i10 == null) {
                        eVarArr = eVarArr2;
                    } else {
                        A h8 = c0279b2.h(obj);
                        if (h8 == null) {
                            h8 = ((P6.u) c0279b2.f4550a.f4588c).f4591a;
                        }
                        eVarArr = eVarArr2;
                        if (h8 == A.f4515d) {
                            c0279b = c0279b2;
                            iVar4 = null;
                        } else {
                            i g9 = c0279b2.g(i10, ((Boolean) lVar.m(i10)).booleanValue());
                            if (g9 != null) {
                                boolean z22 = h8 == A.f4516e;
                                c0279b = c0279b2;
                                hVar = null;
                                iVar5 = i.a(g9, null, z22, 1);
                                if (iVar6 != null) {
                                    boolean z23 = iVar6.f7009b;
                                    if (iVar5 != null && !iVar5.equals(iVar6) && (!(z12 = iVar5.f7009b) || z23)) {
                                        if (z12 || !z23) {
                                            iVar = hVar;
                                            break;
                                        }
                                    }
                                    c0279b2 = c0279b;
                                    z21 = z10;
                                    eVarArr2 = eVarArr;
                                    iVar6 = iVar6;
                                }
                                iVar6 = iVar5;
                                c0279b2 = c0279b;
                                z21 = z10;
                                eVarArr2 = eVarArr;
                                iVar6 = iVar6;
                            }
                        }
                    }
                    c0279b = c0279b2;
                    hVar = null;
                    iVar5 = null;
                    if (iVar6 != null) {
                    }
                    iVar6 = iVar5;
                    c0279b2 = c0279b;
                    z21 = z10;
                    eVarArr2 = eVarArr;
                    iVar6 = iVar6;
                }
                hVar = null;
                iVar5 = iVar4;
                if (iVar6 != null) {
                }
                iVar6 = iVar5;
                c0279b2 = c0279b;
                z21 = z10;
                eVarArr2 = eVarArr;
                iVar6 = iVar6;
            }
            eVarArr = eVarArr2;
            z10 = z21;
            hVar = null;
            iVar = iVar6;
            if (iVar != 0) {
                h hVar11 = iVar.f7008a;
                eVar = new e(hVar11, fVar7, hVar11 == hVar6 && s9 != null, iVar.f7009b);
                boolean z162 = eVar.f6999d;
                ArrayList arrayList42 = new ArrayList();
                it = arrayList3.iterator();
                while (it.hasNext()) {
                }
                if (i8 != 0) {
                }
                if (i8 == 0) {
                }
                h hVar72 = eVar.f6996a;
                ArrayList arrayList52 = new ArrayList();
                it2 = arrayList42.iterator();
                while (it2.hasNext()) {
                }
                D6.a aVar72 = aVar2;
                Set V022 = AbstractC0436k.V0(arrayList52);
                if (!z162) {
                }
                if (hVar9 != hVar4) {
                }
                if (hVar2 != null) {
                }
                ArrayList arrayList72 = new ArrayList();
                it3 = arrayList42.iterator();
                while (it3.hasNext()) {
                }
                f fVar62 = (f) E2.c.m0(AbstractC0436k.V0(arrayList72), fVar3, fVar4, eVar.f6997b, z17);
                if (hVar4 != null) {
                }
                hVar4 = null;
                if (hVar4 == null) {
                }
                if (hVar4 == hVar6) {
                }
                z13 = false;
                eVarArr[i8] = new e(hVar4, fVar62, z13, z19);
                i8++;
                rVar2 = rVar;
                aVar2 = aVar72;
                z14 = z15;
                i4 = arrayList2;
                arrayList = arrayList3;
                size = i9;
                aVar3 = aVar;
                eVarArr2 = eVarArr;
            } else {
                EnumC0278a enumC0278a3 = (z9 || z10) ? enumC0278a : EnumC0278a.f4546h;
                P6.t tVar2 = aVar4.f6989b;
                P6.m mVar2 = tVar2 != null ? (P6.m) tVar2.f4590a.get(enumC0278a3) : hVar;
                i c9 = s9 != null ? r.c(s9) : hVar;
                if (c9 != 0) {
                    iVar2 = i.a(c9, hVar6, false, 2);
                } else {
                    iVar2 = mVar2 != 0 ? mVar2.f4568a : hVar;
                }
                boolean z24 = (c9 != 0 ? c9.f7008a : hVar) == hVar6 || !(s9 == null || mVar2 == 0 || !mVar2.f4570c);
                if (t8 == null || (c6 = r.c(t8)) == null) {
                    iVar3 = hVar;
                } else {
                    h hVar12 = c6.f7008a;
                    iVar3 = c6;
                    if (hVar12 == hVar5) {
                        iVar3 = i.a(c6, hVar4, false, 2);
                    }
                }
                if (iVar3 != 0) {
                    h hVar13 = iVar3.f7008a;
                    if (iVar2 != 0) {
                        h hVar14 = iVar2.f7008a;
                        boolean z25 = iVar2.f7009b;
                        boolean z26 = iVar3.f7009b;
                        if (z26) {
                        }
                        if (!z26) {
                        }
                        if (hVar13.compareTo(hVar14) >= 0) {
                        }
                    }
                    iVar2 = iVar3;
                }
                h hVar15 = iVar2 != 0 ? iVar2.f7008a : null;
                if (iVar2 != 0 && iVar2.f7009b) {
                    z11 = true;
                    eVar = new e(hVar15, fVar7, z24, z11);
                    boolean z1622 = eVar.f6999d;
                    ArrayList arrayList422 = new ArrayList();
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                    }
                    if (i8 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    h hVar722 = eVar.f6996a;
                    ArrayList arrayList522 = new ArrayList();
                    it2 = arrayList422.iterator();
                    while (it2.hasNext()) {
                    }
                    D6.a aVar722 = aVar2;
                    Set V0222 = AbstractC0436k.V0(arrayList522);
                    if (!z1622) {
                    }
                    if (hVar9 != hVar4) {
                    }
                    if (hVar2 != null) {
                    }
                    ArrayList arrayList722 = new ArrayList();
                    it3 = arrayList422.iterator();
                    while (it3.hasNext()) {
                    }
                    f fVar622 = (f) E2.c.m0(AbstractC0436k.V0(arrayList722), fVar3, fVar4, eVar.f6997b, z17);
                    if (hVar4 != null) {
                    }
                    hVar4 = null;
                    if (hVar4 == null) {
                    }
                    if (hVar4 == hVar6) {
                    }
                    z13 = false;
                    eVarArr[i8] = new e(hVar4, fVar622, z13, z19);
                    i8++;
                    rVar2 = rVar;
                    aVar2 = aVar722;
                    z14 = z15;
                    i4 = arrayList2;
                    arrayList = arrayList3;
                    size = i9;
                    aVar3 = aVar;
                    eVarArr2 = eVarArr;
                }
                z11 = false;
                eVar = new e(hVar15, fVar7, z24, z11);
                boolean z16222 = eVar.f6999d;
                ArrayList arrayList4222 = new ArrayList();
                it = arrayList3.iterator();
                while (it.hasNext()) {
                }
                if (i8 != 0) {
                }
                if (i8 == 0) {
                }
                h hVar7222 = eVar.f6996a;
                ArrayList arrayList5222 = new ArrayList();
                it2 = arrayList4222.iterator();
                while (it2.hasNext()) {
                }
                D6.a aVar7222 = aVar2;
                Set V02222 = AbstractC0436k.V0(arrayList5222);
                if (!z16222) {
                }
                if (hVar9 != hVar4) {
                }
                if (hVar2 != null) {
                }
                ArrayList arrayList7222 = new ArrayList();
                it3 = arrayList4222.iterator();
                while (it3.hasNext()) {
                }
                f fVar6222 = (f) E2.c.m0(AbstractC0436k.V0(arrayList7222), fVar3, fVar4, eVar.f6997b, z17);
                if (hVar4 != null) {
                }
                hVar4 = null;
                if (hVar4 == null) {
                }
                if (hVar4 == hVar6) {
                }
                z13 = false;
                eVarArr[i8] = new e(hVar4, fVar6222, z13, z19);
                i8++;
                rVar2 = rVar;
                aVar2 = aVar7222;
                z14 = z15;
                i4 = arrayList2;
                arrayList = arrayList3;
                size = i9;
                aVar3 = aVar;
                eVarArr2 = eVarArr;
            }
        }
        return (AbstractC1759v) d(abstractC1759v.H0(), new T6.l(tVar, 4, eVarArr2), 0, rVar.f7036c).f3288e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x031e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0290  */
    /* JADX WARN: Type inference failed for: r26v0, types: [X6.d] */
    /* JADX WARN: Type inference failed for: r7v1, types: [C6.c, C6.b, C6.k] */
    /* JADX WARN: Type inference failed for: r7v2, types: [R6.a] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList e(A4.a aVar, Collection collection) {
        T6.i iVar;
        List list;
        D6.j annotations;
        L l6;
        AbstractC1759v abstractC1759v;
        R6.f fVar;
        n nVar;
        P6.s sVar;
        int i4;
        boolean z8;
        C6.M m6;
        EnumC0278a enumC0278a;
        t tVar;
        AbstractC1759v r8;
        boolean z9;
        Z5.j jVar;
        ArrayList arrayList;
        int i8;
        Iterator it;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        t tVar2;
        A4.a aVar2;
        L l8;
        F6.U u8;
        A4.a aVar3;
        L l9;
        o oVar = o.f7028h;
        o6.j.e(aVar, "c");
        int i9 = 10;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(collection, 10));
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            ?? r72 = (InterfaceC0002c) it2.next();
            if (!(r72 instanceof R6.a) || (r72.e() == 2 && r72.a().s().size() == 1)) {
                i8 = i9;
            } else {
                InterfaceC0007h g8 = AbstractC0021w.g(r72);
                if (g8 == null) {
                    annotations = ((D6.b) r72).getAnnotations();
                } else {
                    if (g8 instanceof T6.i) {
                        iVar = (T6.i) g8;
                    } else {
                        iVar = null;
                    }
                    if (iVar != null) {
                        list = (List) iVar.f5840n.getValue();
                    } else {
                        list = null;
                    }
                    if (list != null && !list.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(list, i9));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(new C0331f(aVar, (C0066e) it3.next(), true));
                        }
                        ArrayList A02 = AbstractC0436k.A0(((D6.b) r72).getAnnotations(), arrayList3);
                        if (A02.isEmpty()) {
                            annotations = D6.i.f1043a;
                        } else {
                            annotations = new D6.k(0, A02);
                        }
                    } else {
                        annotations = ((D6.b) r72).getAnnotations();
                    }
                }
                A4.a q6 = q4.X.q(aVar, annotations);
                if ((r72 instanceof R6.g) && (l9 = ((K) r72).f1481A) != null && !l9.f1466i) {
                    l6 = l9;
                } else {
                    l6 = r72;
                }
                w M8 = r72.M();
                EnumC0278a enumC0278a2 = EnumC0278a.f4544f;
                if (M8 != null) {
                    if (l6 instanceof InterfaceC0019u) {
                        l8 = l6;
                    } else {
                        l8 = null;
                    }
                    if (l8 != null) {
                        u8 = (F6.U) l8.L(R6.f.f5137J);
                    } else {
                        u8 = null;
                    }
                    o oVar2 = o.f7025e;
                    R6.a aVar4 = (R6.a) r72;
                    if (u8 != null) {
                        aVar3 = q4.X.q(q6, u8.getAnnotations());
                    } else {
                        aVar3 = q6;
                    }
                    abstractC1759v = a(aVar4, u8, false, aVar3, enumC0278a2, null, false, oVar2);
                } else {
                    abstractC1759v = null;
                }
                if (r72 instanceof R6.f) {
                    fVar = (R6.f) r72;
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    InterfaceC0010k q8 = fVar.q();
                    o6.j.c(q8, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    String M9 = AbstractC1638C.M((InterfaceC0004e) q8, D2.f.e(fVar, 3));
                    if (M9 != null && (nVar = (n) m.f7020d.get(M9)) != null) {
                        String str = nVar.f7023c;
                        if (str != null && !I7.v.a0(str, "2.")) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (str != null) {
                            nVar = nVar.f7024d;
                        }
                        if (nVar != null) {
                            nVar.f7022b.size();
                            ((R6.f) r72).z0().size();
                        }
                        sVar = ((S6.a) aVar.f280e).f5417v;
                        o6.j.e(sVar, "javaTypeEnhancementState");
                        i4 = 0;
                        if (((B6.n) sVar.f4589d).m(P6.q.f4578a) != A.f4517f) {
                            if ((r72 instanceof InterfaceC0019u) && o6.j.a(r72.L(R6.f.K), Boolean.TRUE)) {
                                z8 = true;
                                List<F6.U> z02 = l6.z0();
                                o6.j.d(z02, "getValueParameters(...)");
                                ArrayList arrayList4 = new ArrayList(AbstractC0438m.d0(z02, i9));
                                for (F6.U u9 : z02) {
                                    if (nVar != null) {
                                        tVar2 = (t) AbstractC0436k.s0(u9.j, nVar.f7022b);
                                    } else {
                                        tVar2 = null;
                                    }
                                    B6.n nVar2 = new B6.n(16, u9);
                                    R6.a aVar5 = (R6.a) r72;
                                    if (u9 != null) {
                                        aVar2 = q4.X.q(q6, u9.getAnnotations());
                                    } else {
                                        aVar2 = q6;
                                    }
                                    arrayList4.add(a(aVar5, u9, false, aVar2, enumC0278a2, tVar2, z8, nVar2));
                                }
                                if (r72 instanceof C6.M) {
                                    m6 = (C6.M) r72;
                                } else {
                                    m6 = null;
                                }
                                if (m6 == null && D2.f.w(m6)) {
                                    enumC0278a = EnumC0278a.f4545g;
                                } else {
                                    enumC0278a = EnumC0278a.f4543e;
                                }
                                EnumC0278a enumC0278a3 = enumC0278a;
                                if (nVar != null) {
                                    tVar = nVar.f7021a;
                                } else {
                                    tVar = null;
                                }
                                AbstractC1759v a3 = a(r72, l6, true, q6, enumC0278a3, tVar, false, o.f7026f);
                                r8 = r72.r();
                                o6.j.b(r8);
                                if (!U.c(r8, oVar, null)) {
                                    w M10 = r72.M();
                                    if (M10 != null) {
                                        z12 = U.c(M10.b(), oVar, null);
                                    } else {
                                        z12 = false;
                                    }
                                    if (!z12) {
                                        List z03 = r72.z0();
                                        o6.j.d(z03, "getValueParameters(...)");
                                        if (!z03.isEmpty()) {
                                            Iterator it4 = z03.iterator();
                                            while (it4.hasNext()) {
                                                AbstractC1759v b4 = ((F6.U) it4.next()).b();
                                                o6.j.d(b4, "getType(...)");
                                                if (U.c(b4, oVar, null)) {
                                                    z13 = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z13 = false;
                                        if (!z13) {
                                            z9 = false;
                                            if (!z9) {
                                                jVar = new Z5.j(AbstractC1037b.f12315a, new Object());
                                            } else {
                                                jVar = null;
                                            }
                                            if (abstractC1759v == null && a3 == null) {
                                                if (!arrayList4.isEmpty()) {
                                                    Iterator it5 = arrayList4.iterator();
                                                    while (it5.hasNext()) {
                                                        if (((AbstractC1759v) it5.next()) != null) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        if (z10) {
                                                            z11 = true;
                                                            break;
                                                        }
                                                    }
                                                }
                                                z11 = false;
                                                if (!z11 && jVar == null) {
                                                    i8 = 10;
                                                }
                                            }
                                            R6.a aVar6 = (R6.a) r72;
                                            if (abstractC1759v == null) {
                                                w M11 = r72.M();
                                                if (M11 != null) {
                                                    abstractC1759v = M11.b();
                                                } else {
                                                    abstractC1759v = null;
                                                }
                                            }
                                            i8 = 10;
                                            arrayList = new ArrayList(AbstractC0438m.d0(arrayList4, 10));
                                            it = arrayList4.iterator();
                                            while (true) {
                                                int i10 = i4;
                                                if (!it.hasNext()) {
                                                    Object next = it.next();
                                                    i4 = i10 + 1;
                                                    if (i10 >= 0) {
                                                        AbstractC1759v abstractC1759v2 = (AbstractC1759v) next;
                                                        if (abstractC1759v2 == null) {
                                                            abstractC1759v2 = ((F6.U) r72.z0().get(i10)).b();
                                                            o6.j.d(abstractC1759v2, "getType(...)");
                                                        }
                                                        arrayList.add(abstractC1759v2);
                                                    } else {
                                                        AbstractC0437l.c0();
                                                        throw null;
                                                    }
                                                } else {
                                                    if (a3 == null) {
                                                        a3 = r72.r();
                                                        o6.j.b(a3);
                                                    }
                                                    r72 = aVar6.b0(abstractC1759v, arrayList, a3, jVar);
                                                }
                                            }
                                        }
                                    }
                                }
                                z9 = true;
                                if (!z9) {
                                }
                                if (abstractC1759v == null) {
                                    if (!arrayList4.isEmpty()) {
                                    }
                                    z11 = false;
                                    if (!z11) {
                                        i8 = 10;
                                    }
                                }
                                R6.a aVar62 = (R6.a) r72;
                                if (abstractC1759v == null) {
                                }
                                i8 = 10;
                                arrayList = new ArrayList(AbstractC0438m.d0(arrayList4, 10));
                                it = arrayList4.iterator();
                                while (true) {
                                    int i102 = i4;
                                    if (!it.hasNext()) {
                                    }
                                    arrayList.add(abstractC1759v2);
                                }
                            }
                        } else {
                            ((S6.a) q6.f280e).f5415t.getClass();
                        }
                        z8 = false;
                        List<F6.U> z022 = l6.z0();
                        o6.j.d(z022, "getValueParameters(...)");
                        ArrayList arrayList42 = new ArrayList(AbstractC0438m.d0(z022, i9));
                        while (r11.hasNext()) {
                        }
                        if (r72 instanceof C6.M) {
                        }
                        if (m6 == null) {
                        }
                        enumC0278a = EnumC0278a.f4543e;
                        EnumC0278a enumC0278a32 = enumC0278a;
                        if (nVar != null) {
                        }
                        AbstractC1759v a32 = a(r72, l6, true, q6, enumC0278a32, tVar, false, o.f7026f);
                        r8 = r72.r();
                        o6.j.b(r8);
                        if (!U.c(r8, oVar, null)) {
                        }
                        z9 = true;
                        if (!z9) {
                        }
                        if (abstractC1759v == null) {
                        }
                        R6.a aVar622 = (R6.a) r72;
                        if (abstractC1759v == null) {
                        }
                        i8 = 10;
                        arrayList = new ArrayList(AbstractC0438m.d0(arrayList42, 10));
                        it = arrayList42.iterator();
                        while (true) {
                            int i1022 = i4;
                            if (!it.hasNext()) {
                            }
                            arrayList.add(abstractC1759v2);
                        }
                    }
                }
                nVar = null;
                if (nVar != null) {
                }
                sVar = ((S6.a) aVar.f280e).f5417v;
                o6.j.e(sVar, "javaTypeEnhancementState");
                i4 = 0;
                if (((B6.n) sVar.f4589d).m(P6.q.f4578a) != A.f4517f) {
                }
                z8 = false;
                List<F6.U> z0222 = l6.z0();
                o6.j.d(z0222, "getValueParameters(...)");
                ArrayList arrayList422 = new ArrayList(AbstractC0438m.d0(z0222, i9));
                while (r11.hasNext()) {
                }
                if (r72 instanceof C6.M) {
                }
                if (m6 == null) {
                }
                enumC0278a = EnumC0278a.f4543e;
                EnumC0278a enumC0278a322 = enumC0278a;
                if (nVar != null) {
                }
                AbstractC1759v a322 = a(r72, l6, true, q6, enumC0278a322, tVar, false, o.f7026f);
                r8 = r72.r();
                o6.j.b(r8);
                if (!U.c(r8, oVar, null)) {
                }
                z9 = true;
                if (!z9) {
                }
                if (abstractC1759v == null) {
                }
                R6.a aVar6222 = (R6.a) r72;
                if (abstractC1759v == null) {
                }
                i8 = 10;
                arrayList = new ArrayList(AbstractC0438m.d0(arrayList422, 10));
                it = arrayList422.iterator();
                while (true) {
                    int i10222 = i4;
                    if (!it.hasNext()) {
                    }
                    arrayList.add(abstractC1759v2);
                }
            }
            arrayList2.add(r72);
            i9 = i8;
        }
        return arrayList2;
    }
}
