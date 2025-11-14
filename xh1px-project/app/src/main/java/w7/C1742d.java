package w7;

import C6.InterfaceC0007h;
import F6.AbstractC0046f;
import F6.AbstractC0054n;
import F6.C0045e;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import g0.b0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import p7.C1332n;
import t0.C1536c;
import x7.C1826h;
import x7.InterfaceC1820b;
import z7.EnumC1885b;
import z7.EnumC1892i;
import z7.InterfaceC1886c;
import z7.InterfaceC1887d;
import z7.InterfaceC1888e;
import z7.InterfaceC1890g;
import z7.InterfaceC1891h;

/* renamed from: w7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1742d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1742d f15989a = new Object();

    public static final boolean b(InterfaceC1820b interfaceC1820b, InterfaceC1888e interfaceC1888e) {
        W w8;
        if (interfaceC1820b.K(interfaceC1888e) || ((interfaceC1888e instanceof InterfaceC1886c) && (w8 = interfaceC1820b.w(interfaceC1820b.e0(interfaceC1820b.S((InterfaceC1886c) interfaceC1888e)))) != null && interfaceC1820b.K(interfaceC1820b.P(w8)))) {
            return true;
        }
        return false;
    }

    public static final boolean c(InterfaceC1820b interfaceC1820b, I i4, InterfaceC1888e interfaceC1888e, InterfaceC1888e interfaceC1888e2, boolean z8) {
        Set<InterfaceC1887d> Y = interfaceC1820b.Y(interfaceC1888e);
        if (Y == null || !Y.isEmpty()) {
            for (InterfaceC1887d interfaceC1887d : Y) {
                if (!o6.j.a(interfaceC1820b.s(interfaceC1887d), interfaceC1820b.c0(interfaceC1888e2))) {
                    if (z8 && n(f15989a, i4, interfaceC1888e2, interfaceC1887d)) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static List d(I i4, InterfaceC1888e interfaceC1888e, InterfaceC1891h interfaceC1891h) {
        AbstractC1741c d02;
        H h8 = H.f15956c;
        InterfaceC1820b interfaceC1820b = i4.f15961c;
        interfaceC1820b.N(interfaceC1888e, interfaceC1891h);
        if (interfaceC1820b.i0(interfaceC1891h) || !interfaceC1820b.c(interfaceC1888e)) {
            if (interfaceC1820b.n(interfaceC1891h)) {
                if (interfaceC1820b.h(interfaceC1820b.c0(interfaceC1888e), interfaceC1891h)) {
                    z u8 = interfaceC1820b.u(interfaceC1888e);
                    if (u8 != null) {
                        interfaceC1888e = u8;
                    }
                    return E2.d.y(interfaceC1888e);
                }
            } else {
                F7.f fVar = new F7.f();
                i4.c();
                ArrayDeque arrayDeque = i4.f15965g;
                o6.j.b(arrayDeque);
                F7.i iVar = i4.f15966h;
                o6.j.b(iVar);
                arrayDeque.push(interfaceC1888e);
                while (!arrayDeque.isEmpty()) {
                    InterfaceC1888e interfaceC1888e2 = (InterfaceC1888e) arrayDeque.pop();
                    o6.j.b(interfaceC1888e2);
                    if (iVar.add(interfaceC1888e2)) {
                        z u9 = interfaceC1820b.u(interfaceC1888e2);
                        if (u9 == null) {
                            u9 = interfaceC1888e2;
                        }
                        if (interfaceC1820b.h(interfaceC1820b.c0(u9), interfaceC1891h)) {
                            fVar.add(u9);
                            d02 = h8;
                        } else if (interfaceC1820b.b0(u9) == 0) {
                            d02 = H.f15955b;
                        } else {
                            d02 = interfaceC1820b.d0(u9);
                        }
                        if (d02.equals(h8)) {
                            d02 = null;
                        }
                        if (d02 != null) {
                            Iterator it = interfaceC1820b.I(interfaceC1820b.c0(interfaceC1888e2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(d02.C(i4, (InterfaceC1887d) it.next()));
                            }
                        }
                    }
                }
                i4.a();
                return fVar;
            }
        }
        return a6.s.f7766d;
    }

    public static List e(I i4, InterfaceC1888e interfaceC1888e, InterfaceC1891h interfaceC1891h) {
        AbstractC1754p abstractC1754p;
        List d2 = d(i4, interfaceC1888e, interfaceC1891h);
        InterfaceC1820b interfaceC1820b = i4.f15961c;
        if (d2.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : d2) {
                InterfaceC1890g q6 = interfaceC1820b.q((InterfaceC1888e) obj);
                int f02 = interfaceC1820b.f0(q6);
                int i8 = 0;
                while (true) {
                    if (i8 < f02) {
                        W w8 = interfaceC1820b.w(interfaceC1820b.l(q6, i8));
                        if (w8 != null) {
                            abstractC1754p = interfaceC1820b.G(w8);
                        } else {
                            abstractC1754p = null;
                        }
                        if (abstractC1754p == null) {
                            i8++;
                        }
                    } else {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return d2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:253:0x024c, code lost:
    
        r6 = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x024a, code lost:
    
        if (c(r1, r17, r3, r2, true) != false) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0255  */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.AbstractCollection, z7.g, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean f(I i4, InterfaceC1887d interfaceC1887d, InterfaceC1887d interfaceC1887d2) {
        Boolean valueOf;
        Boolean bool;
        List<InterfaceC1888e> list;
        H h8;
        H h9;
        boolean z8;
        boolean z9;
        W w8;
        H h10;
        InterfaceC1887d interfaceC1887d3;
        boolean z10;
        InterfaceC1820b interfaceC1820b = i4.f15961c;
        W d2 = i4.d(i4.e(interfaceC1887d));
        W d3 = i4.d(i4.e(interfaceC1887d2));
        z k = interfaceC1820b.k(d2);
        z P4 = interfaceC1820b.P(d3);
        boolean z11 = true;
        boolean z12 = false;
        if (!interfaceC1820b.t(k) && !interfaceC1820b.t(P4)) {
            interfaceC1820b.H(k);
            interfaceC1820b.z(k);
            interfaceC1820b.z(P4);
            InterfaceC1886c k02 = interfaceC1820b.k0(P4);
            if (k02 != null) {
                interfaceC1887d3 = interfaceC1820b.i(k02);
            } else {
                interfaceC1887d3 = null;
            }
            C1742d c1742d = f15989a;
            if (k02 != null && interfaceC1887d3 != null) {
                if (interfaceC1820b.m0(P4)) {
                    interfaceC1887d3 = interfaceC1820b.J(interfaceC1887d3);
                } else if (interfaceC1820b.m(P4)) {
                    interfaceC1887d3 = interfaceC1820b.o0(interfaceC1887d3);
                }
                if (n(c1742d, i4, k, interfaceC1887d3)) {
                    valueOf = Boolean.TRUE;
                }
            }
            J c02 = interfaceC1820b.c0(P4);
            if (interfaceC1820b.Z(c02)) {
                interfaceC1820b.m0(P4);
                Collection I8 = interfaceC1820b.I(c02);
                if (!I8.isEmpty()) {
                    Iterator it = I8.iterator();
                    while (it.hasNext()) {
                        if (!n(c1742d, i4, k, (InterfaceC1887d) it.next())) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                valueOf = Boolean.valueOf(z10);
            } else {
                J c03 = interfaceC1820b.c0(k);
                if (!(k instanceof InterfaceC1886c)) {
                    if (interfaceC1820b.Z(c03)) {
                        Collection I9 = interfaceC1820b.I(c03);
                        if (!I9.isEmpty()) {
                            Iterator it2 = I9.iterator();
                            while (it2.hasNext()) {
                                if (!(((InterfaceC1887d) it2.next()) instanceof InterfaceC1886c)) {
                                    break;
                                }
                            }
                        }
                    }
                    valueOf = null;
                }
                C6.T k6 = k(interfaceC1820b, P4, k);
                if (k6 != null && interfaceC1820b.A(k6, interfaceC1820b.c0(P4))) {
                    valueOf = Boolean.TRUE;
                }
                valueOf = null;
            }
        } else if (i4.f15959a) {
            valueOf = Boolean.TRUE;
        } else if (interfaceC1820b.m0(k) && !interfaceC1820b.m0(P4)) {
            valueOf = Boolean.FALSE;
        } else {
            z d9 = interfaceC1820b.d(k);
            z d10 = interfaceC1820b.d(P4);
            o6.j.e(interfaceC1820b, "context");
            o6.j.e(d9, "a");
            o6.j.e(d10, "b");
            valueOf = Boolean.valueOf(AbstractC1741c.y(interfaceC1820b, d9, d10));
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        InterfaceC1888e k8 = interfaceC1820b.k(d2);
        z P5 = interfaceC1820b.P(d3);
        H h11 = H.f15956c;
        H h12 = H.f15955b;
        if (!interfaceC1820b.m0(P5) && !interfaceC1820b.m(k8) && !interfaceC1820b.v(k8) && ((!(k8 instanceof InterfaceC1886c) || !interfaceC1820b.b((InterfaceC1886c) k8)) && !AbstractC1741c.g(i4, k8, h12))) {
            if (interfaceC1820b.m(P5) || AbstractC1741c.g(i4, P5, H.f15957d) || interfaceC1820b.c(k8)) {
                return false;
            }
            J c04 = interfaceC1820b.c0(P5);
            o6.j.e(c04, "end");
            if (!AbstractC1741c.i(i4, k8, c04)) {
                i4.c();
                ArrayDeque arrayDeque = i4.f15965g;
                o6.j.b(arrayDeque);
                F7.i iVar = i4.f15966h;
                o6.j.b(iVar);
                arrayDeque.push(k8);
                while (!arrayDeque.isEmpty()) {
                    InterfaceC1888e interfaceC1888e = (InterfaceC1888e) arrayDeque.pop();
                    o6.j.b(interfaceC1888e);
                    if (iVar.add(interfaceC1888e)) {
                        if (interfaceC1820b.m0(interfaceC1888e)) {
                            h10 = h11;
                        } else {
                            h10 = h12;
                        }
                        if (h10.equals(h11)) {
                            h10 = null;
                        }
                        if (h10 == null) {
                            continue;
                        } else {
                            Iterator it3 = interfaceC1820b.I(interfaceC1820b.c0(interfaceC1888e)).iterator();
                            while (it3.hasNext()) {
                                InterfaceC1888e C8 = h10.C(i4, (InterfaceC1887d) it3.next());
                                if (AbstractC1741c.i(i4, C8, c04)) {
                                    i4.a();
                                } else {
                                    arrayDeque.add(C8);
                                }
                            }
                        }
                    }
                }
                i4.a();
                return false;
            }
        }
        if (interfaceC1820b.K(k8) || interfaceC1820b.K(P5)) {
            if (b(interfaceC1820b, k8) && b(interfaceC1820b, P5)) {
                bool = Boolean.TRUE;
            } else if (interfaceC1820b.K(k8)) {
                if (c(interfaceC1820b, i4, k8, P5, false)) {
                    bool = Boolean.TRUE;
                }
            } else if (interfaceC1820b.K(P5)) {
                J c05 = interfaceC1820b.c0(k8);
                if (c05 instanceof C1758u) {
                    Collection I10 = interfaceC1820b.I(c05);
                    if (!I10.isEmpty()) {
                        Iterator it4 = I10.iterator();
                        while (it4.hasNext()) {
                            z e9 = interfaceC1820b.e((InterfaceC1887d) it4.next());
                            if (e9 != null && interfaceC1820b.K(e9)) {
                                break;
                            }
                        }
                    }
                }
            }
            if (bool == null) {
                return bool.booleanValue();
            }
            J c06 = interfaceC1820b.c0(P5);
            if ((interfaceC1820b.h(interfaceC1820b.c0(k8), c06) && interfaceC1820b.g(c06) == 0) || interfaceC1820b.W(interfaceC1820b.c0(P5))) {
                return true;
            }
            o6.j.e(c06, "superConstructor");
            if (interfaceC1820b.c(k8)) {
                list = e(i4, k8, c06);
            } else if (!interfaceC1820b.i0(c06) && !interfaceC1820b.D(c06)) {
                list = d(i4, k8, c06);
            } else {
                F7.f fVar = new F7.f();
                i4.c();
                ArrayDeque arrayDeque2 = i4.f15965g;
                o6.j.b(arrayDeque2);
                F7.i iVar2 = i4.f15966h;
                o6.j.b(iVar2);
                arrayDeque2.push(k8);
                while (!arrayDeque2.isEmpty()) {
                    InterfaceC1888e interfaceC1888e2 = (InterfaceC1888e) arrayDeque2.pop();
                    o6.j.b(interfaceC1888e2);
                    if (iVar2.add(interfaceC1888e2)) {
                        if (interfaceC1820b.c(interfaceC1888e2)) {
                            fVar.add(interfaceC1888e2);
                            h8 = h11;
                        } else {
                            h8 = h12;
                        }
                        if (h8.equals(h11)) {
                            h8 = null;
                        }
                        if (h8 != null) {
                            Iterator it5 = interfaceC1820b.I(interfaceC1820b.c0(interfaceC1888e2)).iterator();
                            while (it5.hasNext()) {
                                arrayDeque2.add(h8.C(i4, (InterfaceC1887d) it5.next()));
                            }
                        }
                    }
                }
                i4.a();
                ArrayList arrayList = new ArrayList();
                Iterator it6 = fVar.iterator();
                while (it6.hasNext()) {
                    InterfaceC1888e interfaceC1888e3 = (InterfaceC1888e) it6.next();
                    o6.j.b(interfaceC1888e3);
                    a6.q.f0(arrayList, e(i4, interfaceC1888e3, c06));
                }
                list = arrayList;
            }
            list.size();
            int i8 = 10;
            ArrayList<InterfaceC1888e> arrayList2 = new ArrayList(AbstractC0438m.d0(list, 10));
            for (InterfaceC1888e interfaceC1888e4 : list) {
                z e10 = interfaceC1820b.e(i4.d(interfaceC1888e4));
                if (e10 != null) {
                    interfaceC1888e4 = e10;
                }
                arrayList2.add(interfaceC1888e4);
            }
            int size = arrayList2.size();
            if (size != 0) {
                if (size != 1) {
                    ?? arrayList3 = new ArrayList(interfaceC1820b.g(c06));
                    int g8 = interfaceC1820b.g(c06);
                    int i9 = 0;
                    boolean z13 = false;
                    while (i9 < g8) {
                        if (!z13 && interfaceC1820b.B(interfaceC1820b.j(c06, i9)) == EnumC1892i.f16826f) {
                            z13 = z12;
                        } else {
                            z13 = z11;
                        }
                        if (!z13) {
                            ArrayList arrayList4 = new ArrayList(AbstractC0438m.d0(arrayList2, i8));
                            for (InterfaceC1888e interfaceC1888e5 : arrayList2) {
                                boolean z14 = z11;
                                M O8 = interfaceC1820b.O(interfaceC1888e5, i9);
                                if (O8 != null) {
                                    boolean z15 = z12;
                                    if (interfaceC1820b.y(O8) != EnumC1892i.f16827g) {
                                        O8 = null;
                                    }
                                    if (O8 != null && (w8 = interfaceC1820b.w(O8)) != null) {
                                        arrayList4.add(w8);
                                        z11 = z14;
                                        z12 = z15;
                                    }
                                }
                                throw new IllegalStateException(("Incorrect type: " + interfaceC1888e5 + ", subType: " + k8 + ", superType: " + P5).toString());
                            }
                            z8 = z11;
                            z9 = z12;
                            arrayList3.add(interfaceC1820b.Q(interfaceC1820b.o(arrayList4)));
                        } else {
                            z8 = z11;
                            z9 = z12;
                        }
                        i9++;
                        z11 = z8;
                        z12 = z9;
                        i8 = 10;
                    }
                    boolean z16 = z11;
                    boolean z17 = z12;
                    if (z13 || !m(i4, arrayList3, P5)) {
                        boolean z18 = z17;
                        for (InterfaceC1888e interfaceC1888e6 : arrayList2) {
                            if (!z18) {
                                z18 = m(i4, interfaceC1820b.q(interfaceC1888e6), P5);
                            }
                        }
                        return z18;
                    }
                    return z16;
                }
                return m(i4, interfaceC1820b.q((InterfaceC1888e) AbstractC0436k.o0(arrayList2)), P5);
            }
            J c07 = interfaceC1820b.c0(k8);
            if (interfaceC1820b.i0(c07)) {
                return interfaceC1820b.X(c07);
            }
            if (interfaceC1820b.X(interfaceC1820b.c0(k8))) {
                return true;
            }
            i4.c();
            ArrayDeque arrayDeque3 = i4.f15965g;
            o6.j.b(arrayDeque3);
            F7.i iVar3 = i4.f15966h;
            o6.j.b(iVar3);
            arrayDeque3.push(k8);
            while (!arrayDeque3.isEmpty()) {
                InterfaceC1888e interfaceC1888e7 = (InterfaceC1888e) arrayDeque3.pop();
                o6.j.b(interfaceC1888e7);
                if (iVar3.add(interfaceC1888e7)) {
                    if (interfaceC1820b.c(interfaceC1888e7)) {
                        h9 = h11;
                    } else {
                        h9 = h12;
                    }
                    if (h9.equals(h11)) {
                        h9 = null;
                    }
                    if (h9 == null) {
                        continue;
                    } else {
                        Iterator it7 = interfaceC1820b.I(interfaceC1820b.c0(interfaceC1888e7)).iterator();
                        while (it7.hasNext()) {
                            InterfaceC1888e C9 = h9.C(i4, (InterfaceC1887d) it7.next());
                            if (interfaceC1820b.X(interfaceC1820b.c0(C9))) {
                                i4.a();
                                return true;
                            }
                            arrayDeque3.add(C9);
                        }
                    }
                }
            }
            i4.a();
            return false;
        }
        bool = null;
        if (bool == null) {
        }
    }

    public static boolean h(I i4, InterfaceC1887d interfaceC1887d, InterfaceC1887d interfaceC1887d2) {
        o6.j.e(interfaceC1887d, "a");
        o6.j.e(interfaceC1887d2, "b");
        InterfaceC1820b interfaceC1820b = i4.f15961c;
        if (interfaceC1887d != interfaceC1887d2) {
            if (l(interfaceC1820b, interfaceC1887d) && l(interfaceC1820b, interfaceC1887d2)) {
                W d2 = i4.d(i4.e(interfaceC1887d));
                W d3 = i4.d(i4.e(interfaceC1887d2));
                z k = interfaceC1820b.k(d2);
                if (interfaceC1820b.h(interfaceC1820b.s(d2), interfaceC1820b.s(d3))) {
                    if (interfaceC1820b.b0(k) == 0) {
                        if (interfaceC1820b.a0(d2) || interfaceC1820b.a0(d3) || interfaceC1820b.m0(k) == interfaceC1820b.m0(interfaceC1820b.k(d3))) {
                            return true;
                        }
                        return false;
                    }
                } else {
                    return false;
                }
            }
            C1742d c1742d = f15989a;
            if (n(c1742d, i4, interfaceC1887d, interfaceC1887d2) && n(c1742d, i4, interfaceC1887d2, interfaceC1887d)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static C6.T k(InterfaceC1820b interfaceC1820b, InterfaceC1887d interfaceC1887d, InterfaceC1887d interfaceC1887d2) {
        W w8;
        boolean z8;
        int b02 = interfaceC1820b.b0(interfaceC1887d);
        int i4 = 0;
        while (true) {
            M m6 = null;
            if (i4 >= b02) {
                return null;
            }
            M C8 = interfaceC1820b.C(interfaceC1887d, i4);
            if (!interfaceC1820b.j0(C8)) {
                m6 = C8;
            }
            if (m6 != null && (w8 = interfaceC1820b.w(m6)) != null) {
                if (interfaceC1820b.p(interfaceC1820b.k(w8)) && interfaceC1820b.p(interfaceC1820b.k(interfaceC1887d2))) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (w8.equals(interfaceC1887d2) || (z8 && o6.j.a(interfaceC1820b.s(w8), interfaceC1820b.s(interfaceC1887d2)))) {
                    break;
                }
                C6.T k = k(interfaceC1820b, w8, interfaceC1887d2);
                if (k != null) {
                    return k;
                }
            }
            i4++;
        }
        return interfaceC1820b.j(interfaceC1820b.s(interfaceC1887d), i4);
    }

    public static boolean l(InterfaceC1820b interfaceC1820b, InterfaceC1887d interfaceC1887d) {
        if (interfaceC1820b.R(interfaceC1820b.s(interfaceC1887d))) {
            interfaceC1820b.T(interfaceC1887d);
            if (!interfaceC1820b.g0(interfaceC1887d) && !interfaceC1820b.v(interfaceC1887d) && !interfaceC1820b.f(interfaceC1887d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean m(I i4, InterfaceC1890g interfaceC1890g, InterfaceC1888e interfaceC1888e) {
        boolean n3;
        o6.j.e(interfaceC1890g, "capturedSubArguments");
        InterfaceC1820b interfaceC1820b = i4.f15961c;
        J c02 = interfaceC1820b.c0(interfaceC1888e);
        int f02 = interfaceC1820b.f0(interfaceC1890g);
        int g8 = interfaceC1820b.g(c02);
        if (f02 == g8 && f02 == interfaceC1820b.b0(interfaceC1888e)) {
            for (int i8 = 0; i8 < g8; i8++) {
                M C8 = interfaceC1820b.C(interfaceC1888e, i8);
                W w8 = interfaceC1820b.w(C8);
                if (w8 != null) {
                    M l6 = interfaceC1820b.l(interfaceC1890g, i8);
                    interfaceC1820b.y(l6);
                    W w9 = interfaceC1820b.w(l6);
                    o6.j.b(w9);
                    EnumC1892i B8 = interfaceC1820b.B(interfaceC1820b.j(c02, i8));
                    EnumC1892i y4 = interfaceC1820b.y(C8);
                    EnumC1892i enumC1892i = EnumC1892i.f16827g;
                    if (B8 == enumC1892i) {
                        B8 = y4;
                    } else if (y4 != enumC1892i && B8 != y4) {
                        B8 = null;
                    }
                    if (B8 == null) {
                        return i4.f15959a;
                    }
                    if (B8 == enumC1892i) {
                        o(interfaceC1820b, w9, w8);
                        o(interfaceC1820b, w8, w9);
                    }
                    int i9 = i4.f15964f;
                    if (i9 <= 100) {
                        i4.f15964f = i9 + 1;
                        int ordinal = B8.ordinal();
                        C1742d c1742d = f15989a;
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    n3 = h(i4, w9, w8);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                n3 = n(c1742d, i4, w9, w8);
                            }
                        } else {
                            n3 = n(c1742d, i4, w8, w9);
                        }
                        i4.f15964f--;
                        if (!n3) {
                        }
                    } else {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + w9).toString());
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean n(C1742d c1742d, I i4, InterfaceC1887d interfaceC1887d, InterfaceC1887d interfaceC1887d2) {
        o6.j.e(interfaceC1887d, "subType");
        o6.j.e(interfaceC1887d2, "superType");
        if (interfaceC1887d == interfaceC1887d2) {
            return true;
        }
        if (!i4.b(interfaceC1887d, interfaceC1887d2)) {
            return false;
        }
        return f(i4, interfaceC1887d, interfaceC1887d2);
    }

    public static void o(InterfaceC1820b interfaceC1820b, InterfaceC1887d interfaceC1887d, InterfaceC1887d interfaceC1887d2) {
        Object e9 = interfaceC1820b.e(interfaceC1887d);
        if (e9 instanceof InterfaceC1886c) {
            InterfaceC1886c interfaceC1886c = (InterfaceC1886c) e9;
            if (!interfaceC1820b.F(interfaceC1886c) && interfaceC1820b.j0(interfaceC1820b.e0(interfaceC1820b.S(interfaceC1886c))) && interfaceC1820b.h0(interfaceC1886c) == EnumC1885b.f16823d) {
                interfaceC1820b.s(interfaceC1887d2);
            }
        }
    }

    public static C1750l p(W w8, boolean z8) {
        F6.S s8;
        boolean z9;
        o6.j.e(w8, "type");
        if (w8 instanceof C1750l) {
            return (C1750l) w8;
        }
        w8.B0();
        if (!(w8.B0().c() instanceof C6.T) && !(w8 instanceof C1826h)) {
            z9 = false;
        } else {
            InterfaceC0007h c6 = w8.B0().c();
            if (c6 instanceof F6.S) {
                s8 = (F6.S) c6;
            } else {
                s8 = null;
            }
            z9 = true;
            if (s8 == null || s8.f1510p) {
                if (z8 && (w8.B0().c() instanceof C6.T)) {
                    z9 = U.e(w8);
                } else {
                    z9 = true ^ AbstractC1741c.g(x7.m.f16299a.q0(), AbstractC1741c.l(w8), H.f15955b);
                }
            }
        }
        if (!z9) {
            return null;
        }
        if (w8 instanceof AbstractC1754p) {
            AbstractC1754p abstractC1754p = (AbstractC1754p) w8;
            o6.j.a(abstractC1754p.f16006e.B0(), abstractC1754p.f16007f.B0());
        }
        return new C1750l(AbstractC1741c.l(w8).I0(false), z8);
    }

    public void a(D6.j jVar, D6.j jVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((D6.c) it.next()).a());
        }
        Iterator it2 = jVar2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((D6.c) it2.next()).a());
        }
    }

    public O g(J j, List list) {
        o6.j.e(j, "typeConstructor");
        o6.j.e(list, "arguments");
        List e9 = j.e();
        o6.j.d(e9, "getParameters(...)");
        C6.T t8 = (C6.T) AbstractC0436k.y0(e9);
        if (t8 != null && t8.Q()) {
            List e10 = j.e();
            o6.j.d(e10, "getParameters(...)");
            ArrayList arrayList = new ArrayList(AbstractC0438m.d0(e10, 10));
            Iterator it = e10.iterator();
            while (it.hasNext()) {
                arrayList.add(((C6.T) it.next()).B());
            }
            return new F(1, a6.x.R0(AbstractC0436k.X0(arrayList, list)));
        }
        return new C1756s((C6.T[]) e9.toArray(new C6.T[0]), (M[]) list.toArray(new M[0]), false);
    }

    public z i(b0 b0Var, G g8, boolean z8, int i4, boolean z9) {
        G g9;
        C6.S s8 = (C6.S) b0Var.f10988e;
        M j = j(new E(((u7.s) s8).O0(), X.INVARIANT), b0Var, null, i4);
        AbstractC1759v b4 = j.b();
        o6.j.d(b4, "getType(...)");
        z b9 = AbstractC1741c.b(b4);
        if (AbstractC1741c.j(b9)) {
            return b9;
        }
        j.a();
        a(b9.getAnnotations(), AbstractC1746h.a(g8));
        if (!AbstractC1741c.j(b9)) {
            if (AbstractC1741c.j(b9)) {
                g9 = b9.y0();
            } else {
                G y02 = b9.y0();
                C1536c c1536c = G.f15953e;
                o6.j.e(y02, "other");
                if (g8.isEmpty() && y02.isEmpty()) {
                    g9 = g8;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection values = ((ConcurrentHashMap) c1536c.f14808e).values();
                    o6.j.d(values, "<get-values>(...)");
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        C1745g c1745g = (C1745g) g8.f791d.get(intValue);
                        C1745g c1745g2 = (C1745g) y02.f791d.get(intValue);
                        if (c1745g == null) {
                            if (c1745g2 != null) {
                                if (c1745g != null) {
                                    c1745g2 = new C1745g(D2.f.d(c1745g2.f15994a, c1745g.f15994a));
                                }
                            } else {
                                c1745g2 = null;
                            }
                        } else {
                            if (c1745g2 != null) {
                                c1745g = new C1745g(D2.f.d(c1745g.f15994a, c1745g2.f15994a));
                            }
                            c1745g2 = c1745g;
                        }
                        F7.l.a(arrayList, c1745g2);
                    }
                    g9 = C1536c.g(arrayList);
                }
            }
            b9 = AbstractC1741c.q(b9, null, g9, 1);
        }
        z i8 = U.i(b9, z8);
        if (z9) {
            C0045e c0045e = ((AbstractC0046f) s8).f1525l;
            o6.j.d(c0045e, "getTypeConstructor(...)");
            return AbstractC1741c.E(i8, AbstractC1741c.u((List) b0Var.f10989f, C1332n.f13842b, g8, c0045e, z8));
        }
        return i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public M j(M m6, b0 b0Var, C6.T t8, int i4) {
        M m8;
        X x8;
        z i8;
        Object obj = (C6.S) b0Var.f10988e;
        if (i4 <= 100) {
            if (m6.c()) {
                o6.j.b(t8);
                return U.j(t8);
            }
            AbstractC1759v b4 = m6.b();
            o6.j.d(b4, "getType(...)");
            J B02 = b4.B0();
            o6.j.e(B02, "constructor");
            InterfaceC0007h c6 = B02.c();
            if (c6 instanceof C6.T) {
                m8 = (M) ((Map) b0Var.f10990g).get(c6);
            } else {
                m8 = null;
            }
            X x9 = X.INVARIANT;
            if (m8 == null) {
                z b9 = AbstractC1741c.b(m6.b().H0());
                if (!AbstractC1741c.j(b9) && U.c(b9, A7.a.f410f, null)) {
                    J B03 = b9.B0();
                    InterfaceC0007h c9 = B03.c();
                    B03.e().size();
                    b9.r0().size();
                    if (!(c9 instanceof C6.T)) {
                        int i9 = 0;
                        if (c9 instanceof C6.S) {
                            C6.S s8 = (C6.S) c9;
                            if (b0Var.m(s8)) {
                                return new E(y7.l.c(y7.k.RECURSIVE_TYPE_ALIAS, ((AbstractC0054n) s8).getName().f10804d), x9);
                            }
                            List r02 = b9.r0();
                            ArrayList arrayList = new ArrayList(AbstractC0438m.d0(r02, 10));
                            for (Object obj2 : r02) {
                                int i10 = i9 + 1;
                                if (i9 >= 0) {
                                    arrayList.add(j((M) obj2, b0Var, (C6.T) B03.e().get(i9), i4 + 1));
                                    i9 = i10;
                                } else {
                                    AbstractC0437l.c0();
                                    throw null;
                                }
                            }
                            List e9 = ((AbstractC0046f) s8).f1525l.e();
                            ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(e9, 10));
                            Iterator it = e9.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((C6.T) it.next()).a());
                            }
                            return new E(AbstractC1741c.E(i(new b0(b0Var, s8, arrayList, a6.x.R0(AbstractC0436k.X0(arrayList2, arrayList))), b9.y0(), b9.E0(), i4 + 1, false), q(b9, b0Var, i4)), m6.a());
                        }
                        z q6 = q(b9, b0Var, i4);
                        Q.d(q6);
                        for (Object obj3 : q6.r0()) {
                            int i11 = i9 + 1;
                            if (i9 >= 0) {
                                M m9 = (M) obj3;
                                if (!m9.c()) {
                                    AbstractC1759v b10 = m9.b();
                                    o6.j.d(b10, "getType(...)");
                                    if (!U.c(b10, A7.a.f409e, null)) {
                                    }
                                }
                                i9 = i11;
                            } else {
                                AbstractC0437l.c0();
                                throw null;
                            }
                        }
                        return new E(q6, m6.a());
                    }
                }
                return m6;
            }
            if (m8.c()) {
                o6.j.b(t8);
                return U.j(t8);
            }
            W H02 = m8.b().H0();
            X a3 = m8.a();
            o6.j.d(a3, "getProjectionKind(...)");
            X a4 = m6.a();
            o6.j.d(a4, "getProjectionKind(...)");
            if (a4 != a3 && a4 != x9) {
                if (a3 == x9) {
                    a3 = a4;
                } else {
                    o6.j.e(obj, "typeAlias");
                }
            }
            if (t8 == null || (x8 = t8.e0()) == null) {
                x8 = x9;
            }
            if (x8 != a3 && x8 != x9) {
                if (a3 != x9) {
                    o6.j.e(obj, "typeAlias");
                }
                a(b4.getAnnotations(), H02.getAnnotations());
                i8 = U.i(AbstractC1741c.b(H02), b4.E0());
                G y02 = b4.y0();
                if (!AbstractC1741c.j(i8)) {
                    if (AbstractC1741c.j(i8)) {
                        y02 = i8.y0();
                    } else {
                        G y03 = i8.y0();
                        y02.getClass();
                        C1536c c1536c = G.f15953e;
                        o6.j.e(y03, "other");
                        if (!y02.isEmpty() || !y03.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList();
                            Collection values = ((ConcurrentHashMap) c1536c.f14808e).values();
                            o6.j.d(values, "<get-values>(...)");
                            Iterator it2 = values.iterator();
                            while (it2.hasNext()) {
                                int intValue = ((Number) it2.next()).intValue();
                                C1745g c1745g = (C1745g) y02.f791d.get(intValue);
                                C1745g c1745g2 = (C1745g) y03.f791d.get(intValue);
                                if (c1745g == null) {
                                    if (c1745g2 != null) {
                                        if (c1745g != null) {
                                            c1745g2 = new C1745g(D2.f.d(c1745g2.f15994a, c1745g.f15994a));
                                        }
                                    } else {
                                        c1745g2 = null;
                                    }
                                } else {
                                    if (c1745g2 != null) {
                                        c1745g = new C1745g(D2.f.d(c1745g.f15994a, c1745g2.f15994a));
                                    }
                                    c1745g2 = c1745g;
                                }
                                F7.l.a(arrayList3, c1745g2);
                            }
                            y02 = C1536c.g(arrayList3);
                        }
                    }
                    i8 = AbstractC1741c.q(i8, null, y02, 1);
                }
                return new E(i8, x9);
            }
            x9 = a3;
            a(b4.getAnnotations(), H02.getAnnotations());
            i8 = U.i(AbstractC1741c.b(H02), b4.E0());
            G y022 = b4.y0();
            if (!AbstractC1741c.j(i8)) {
            }
            return new E(i8, x9);
        }
        throw new AssertionError("Too deep recursion while expanding type alias " + ((AbstractC0054n) obj).getName());
    }

    public z q(z zVar, b0 b0Var, int i4) {
        J B02 = zVar.B0();
        List r02 = zVar.r0();
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(r02, 10));
        int i8 = 0;
        for (Object obj : r02) {
            int i9 = i8 + 1;
            if (i8 >= 0) {
                M m6 = (M) obj;
                M j = j(m6, b0Var, (C6.T) B02.e().get(i8), i4 + 1);
                if (!j.c()) {
                    j = new E(U.h(j.b(), m6.b().E0()), j.a());
                }
                arrayList.add(j);
                i8 = i9;
            } else {
                AbstractC0437l.c0();
                throw null;
            }
        }
        return AbstractC1741c.q(zVar, arrayList, null, 2);
    }
}
