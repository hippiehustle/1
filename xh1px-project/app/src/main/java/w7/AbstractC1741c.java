package w7;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0008i;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import F6.AbstractC0054n;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import i.AbstractC0862a;
import i7.AbstractC0892g;
import j7.C0945d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m7.AbstractC1098d;
import n1.AbstractC1149a;
import n6.InterfaceC1163b;
import p7.InterfaceC1333o;
import t0.C1536c;
import u6.InterfaceC1642c;
import x7.AbstractC1825g;
import x7.C1824f;
import x7.InterfaceC1820b;
import z7.InterfaceC1887d;
import z7.InterfaceC1888e;
import z7.InterfaceC1889f;
import z7.InterfaceC1891h;

/* renamed from: w7.c */
/* loaded from: classes.dex */
public abstract class AbstractC1741c {
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Q A(List list, O o7, InterfaceC0010k interfaceC0010k, List list2, boolean[] zArr) {
        Q q6;
        AbstractC1759v i4;
        if (o7 != null) {
            if (interfaceC0010k != null) {
                if (list2 != null) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    Iterator it = list.iterator();
                    int i8 = 0;
                    while (it.hasNext()) {
                        C6.T t8 = (C6.T) it.next();
                        F6.S O02 = F6.S.O0(interfaceC0010k, t8.getAnnotations(), t8.R(), t8.e0(), t8.getName(), i8, t8.D());
                        hashMap.put(t8.B(), new E(O02.l()));
                        hashMap2.put(t8, O02);
                        list2.add(O02);
                        i8++;
                    }
                    F f8 = new F(1, hashMap);
                    Q e9 = Q.e(o7, f8);
                    Q e10 = Q.e(new C0945d(o7, 1), f8);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C6.T t9 = (C6.T) it2.next();
                        F6.S s8 = (F6.S) hashMap2.get(t9);
                        for (AbstractC1759v abstractC1759v : t9.getUpperBounds()) {
                            InterfaceC0007h c6 = abstractC1759v.B0().c();
                            if (c6 instanceof C6.T) {
                                C6.T t10 = (C6.T) c6;
                                o6.j.e(t10, "typeParameter");
                                if (AbstractC0405a.V(t10, null, 6)) {
                                    q6 = e9;
                                    i4 = q6.i(abstractC1759v, X.OUT_VARIANCE);
                                    if (i4 != null) {
                                        return null;
                                    }
                                    if (i4 != abstractC1759v && zArr != null) {
                                        zArr[0] = true;
                                    }
                                    if (!s8.f1510p) {
                                        if (!j(i4)) {
                                            s8.f1509o.add(i4);
                                        }
                                    } else {
                                        throw new IllegalStateException("Type parameter descriptor is already initialized: " + s8.Q0());
                                    }
                                }
                            }
                            q6 = e10;
                            i4 = q6.i(abstractC1759v, X.OUT_VARIANCE);
                            if (i4 != null) {
                            }
                        }
                        if (!s8.f1510p) {
                            s8.f1510p = true;
                        } else {
                            throw new IllegalStateException("Type parameter descriptor is already initialized: " + s8.Q0());
                        }
                    }
                    return e9;
                }
                a(8);
                throw null;
            }
            a(7);
            throw null;
        }
        a(6);
        throw null;
    }

    public static final G B(D6.j jVar) {
        o6.j.e(jVar, "<this>");
        if (jVar.isEmpty()) {
            G.f15953e.getClass();
            return G.f15954f;
        }
        C1536c c1536c = G.f15953e;
        List y4 = E2.d.y(new C1745g(jVar));
        c1536c.getClass();
        return C1536c.g(y4);
    }

    public static final z D(AbstractC1759v abstractC1759v) {
        o6.j.e(abstractC1759v, "<this>");
        W H02 = abstractC1759v.H0();
        if (H02 instanceof AbstractC1754p) {
            return ((AbstractC1754p) H02).f16007f;
        }
        if (H02 instanceof z) {
            return (z) H02;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final z E(z zVar, z zVar2) {
        o6.j.e(zVar, "<this>");
        o6.j.e(zVar2, "abbreviatedType");
        if (j(zVar)) {
            return zVar;
        }
        return new C1739a(zVar, zVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final W F(W w8, AbstractC1759v abstractC1759v) {
        o6.j.e(w8, "<this>");
        if (w8 instanceof V) {
            return F(((V) w8).X(), abstractC1759v);
        }
        if (abstractC1759v != null && !abstractC1759v.equals(w8)) {
            if (w8 instanceof z) {
                return new C((z) w8, abstractC1759v);
            }
            if (w8 instanceof AbstractC1754p) {
                return new r((AbstractC1754p) w8, abstractC1759v);
            }
            throw new NoWhenBranchMatchedException();
        }
        return w8;
    }

    public static /* synthetic */ void a(int i4) {
        String str;
        int i8;
        if (i4 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 4) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "originalSubstitution";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "newContainingDeclaration";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "result";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i4 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i4 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i4 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static final z b(AbstractC1759v abstractC1759v) {
        z zVar;
        o6.j.e(abstractC1759v, "<this>");
        W H02 = abstractC1759v.H0();
        if (H02 instanceof z) {
            zVar = (z) H02;
        } else {
            zVar = null;
        }
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException(("This is should be simple type: " + abstractC1759v).toString());
    }

    public static final AbstractC1759v c(ArrayList arrayList, List list, z6.h hVar) {
        AbstractC1759v i4 = new Q(new F(0, arrayList)).i((AbstractC1759v) AbstractC0436k.p0(list), X.OUT_VARIANCE);
        if (i4 == null) {
            return hVar.n();
        }
        return i4;
    }

    public static final InterfaceC1887d d(InterfaceC1887d interfaceC1887d, HashSet hashSet) {
        InterfaceC1887d d2;
        boolean z8;
        x7.m mVar = x7.m.f16299a;
        J s8 = mVar.s(interfaceC1887d);
        if (hashSet.add(s8)) {
            C6.T s9 = AbstractC1825g.s(s8);
            if (s9 != null) {
                InterfaceC1887d O8 = AbstractC0405a.O(s9);
                InterfaceC1887d d3 = d(O8, hashSet);
                if (d3 != null) {
                    if (!AbstractC1825g.C(mVar.s(O8)) && (!(O8 instanceof InterfaceC1889f) || !AbstractC1825g.I((InterfaceC1889f) O8))) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if ((d3 instanceof InterfaceC1889f) && AbstractC1825g.I((InterfaceC1889f) d3) && AbstractC1825g.H(interfaceC1887d) && z8) {
                        return mVar.p0(O8);
                    }
                    if (!AbstractC1825g.H(d3) && AbstractC1825g.F(interfaceC1887d)) {
                        return mVar.p0(d3);
                    }
                    return d3;
                }
                return null;
            }
            if (AbstractC1825g.C(s8)) {
                o6.j.e(interfaceC1887d, "$receiver");
                if (interfaceC1887d instanceof AbstractC1759v) {
                    z i4 = AbstractC0892g.i((AbstractC1759v) interfaceC1887d);
                    if (i4 == null || (d2 = d(i4, hashSet)) == null) {
                        return null;
                    }
                    if (!AbstractC1825g.H(interfaceC1887d)) {
                        return d2;
                    }
                    if (!AbstractC1825g.H(d2) && (!(d2 instanceof InterfaceC1889f) || !AbstractC1825g.I((InterfaceC1889f) d2))) {
                        return mVar.p0(d2);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb.append(interfaceC1887d);
                    sb.append(", ");
                    throw new IllegalArgumentException(AbstractC1149a.i(o6.v.f13643a, interfaceC1887d.getClass(), sb).toString());
                }
            }
            return interfaceC1887d;
        }
        return null;
    }

    public static final W e(z zVar, z zVar2) {
        o6.j.e(zVar, "lowerBound");
        o6.j.e(zVar2, "upperBound");
        if (zVar.equals(zVar2)) {
            return zVar;
        }
        return new C1755q(zVar, zVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC1759v f(AbstractC1759v abstractC1759v) {
        o6.j.e(abstractC1759v, "<this>");
        if (abstractC1759v instanceof V) {
            return ((V) abstractC1759v).C();
        }
        return null;
    }

    public static boolean g(I i4, InterfaceC1888e interfaceC1888e, AbstractC1741c abstractC1741c) {
        AbstractC1741c abstractC1741c2;
        H h8 = H.f15956c;
        o6.j.e(i4, "<this>");
        o6.j.e(interfaceC1888e, "type");
        InterfaceC1820b interfaceC1820b = i4.f15961c;
        if ((interfaceC1820b.c(interfaceC1888e) && !interfaceC1820b.m0(interfaceC1888e)) || interfaceC1820b.m(interfaceC1888e)) {
            return true;
        }
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
                if (interfaceC1820b.m0(interfaceC1888e2)) {
                    abstractC1741c2 = h8;
                } else {
                    abstractC1741c2 = abstractC1741c;
                }
                if (abstractC1741c2.equals(h8)) {
                    abstractC1741c2 = null;
                }
                if (abstractC1741c2 == null) {
                    continue;
                } else {
                    Iterator it = interfaceC1820b.I(interfaceC1820b.c0(interfaceC1888e2)).iterator();
                    while (it.hasNext()) {
                        InterfaceC1888e C8 = abstractC1741c2.C(i4, (InterfaceC1887d) it.next());
                        if ((interfaceC1820b.c(C8) && !interfaceC1820b.m0(C8)) || interfaceC1820b.m(C8)) {
                            i4.a();
                            return true;
                        }
                        arrayDeque.add(C8);
                    }
                }
            }
        }
        i4.a();
        return false;
    }

    public static final W h(W w8, AbstractC1759v abstractC1759v) {
        o6.j.e(w8, "<this>");
        o6.j.e(abstractC1759v, "origin");
        return F(w8, f(abstractC1759v));
    }

    public static boolean i(I i4, InterfaceC1888e interfaceC1888e, InterfaceC1891h interfaceC1891h) {
        InterfaceC1820b interfaceC1820b = i4.f15961c;
        if (interfaceC1820b.U(interfaceC1888e)) {
            return true;
        }
        if (interfaceC1820b.m0(interfaceC1888e)) {
            return false;
        }
        if (i4.f15960b) {
            interfaceC1820b.z(interfaceC1888e);
        }
        return interfaceC1820b.h(interfaceC1820b.c0(interfaceC1888e), interfaceC1891h);
    }

    public static final boolean j(AbstractC1759v abstractC1759v) {
        o6.j.e(abstractC1759v, "<this>");
        W H02 = abstractC1759v.H0();
        if (!(H02 instanceof y7.i)) {
            if (!(H02 instanceof AbstractC1754p) || !(((AbstractC1754p) H02).L0() instanceof y7.i)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean k(AbstractC1759v abstractC1759v) {
        o6.j.e(abstractC1759v, "<this>");
        return abstractC1759v.H0() instanceof AbstractC1754p;
    }

    public static final z l(AbstractC1759v abstractC1759v) {
        o6.j.e(abstractC1759v, "<this>");
        W H02 = abstractC1759v.H0();
        if (H02 instanceof AbstractC1754p) {
            return ((AbstractC1754p) H02).f16006e;
        }
        if (H02 instanceof z) {
            return (z) H02;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final W m(W w8, boolean z8) {
        o6.j.e(w8, "<this>");
        C1750l p8 = C1742d.p(w8, z8);
        if (p8 != null) {
            return p8;
        }
        z n3 = n(w8);
        if (n3 != null) {
            return n3;
        }
        return w8.I0(false);
    }

    public static final z n(W w8) {
        C1758u c1758u;
        C1758u c1758u2;
        J B02 = w8.B0();
        if (B02 instanceof C1758u) {
            c1758u = (C1758u) B02;
        } else {
            c1758u = null;
        }
        if (c1758u != null) {
            LinkedHashSet<AbstractC1759v> linkedHashSet = c1758u.f16016b;
            ArrayList arrayList = new ArrayList(AbstractC0438m.d0(linkedHashSet, 10));
            boolean z8 = false;
            for (AbstractC1759v abstractC1759v : linkedHashSet) {
                if (U.e(abstractC1759v)) {
                    abstractC1759v = m(abstractC1759v.H0(), false);
                    z8 = true;
                }
                arrayList.add(abstractC1759v);
            }
            if (!z8) {
                c1758u2 = null;
            } else {
                AbstractC1759v abstractC1759v2 = c1758u.f16015a;
                if (abstractC1759v2 != null) {
                    if (U.e(abstractC1759v2)) {
                        abstractC1759v2 = m(abstractC1759v2.H0(), false);
                    }
                } else {
                    abstractC1759v2 = null;
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                c1758u2 = new C1758u(linkedHashSet2);
                c1758u2.f16015a = abstractC1759v2;
            }
            if (c1758u2 != null) {
                return c1758u2.f();
            }
        }
        return null;
    }

    public static final z o(z zVar, List list, G g8) {
        o6.j.e(zVar, "<this>");
        o6.j.e(list, "newArguments");
        o6.j.e(g8, "newAttributes");
        if (list.isEmpty() && g8 == zVar.y0()) {
            return zVar;
        }
        if (list.isEmpty()) {
            return zVar.K0(g8);
        }
        if (zVar instanceof y7.i) {
            y7.i iVar = (y7.i) zVar;
            J j = iVar.f16529e;
            y7.g gVar = iVar.f16530f;
            y7.k kVar = iVar.f16531g;
            boolean z8 = iVar.f16533i;
            String[] strArr = iVar.j;
            return new y7.i(j, gVar, kVar, list, z8, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        return t(list, g8, zVar.B0(), zVar.E0());
    }

    public static AbstractC1759v p(AbstractC1759v abstractC1759v, List list, D6.j jVar, int i4) {
        if ((i4 & 2) != 0) {
            jVar = abstractC1759v.getAnnotations();
        }
        o6.j.e(abstractC1759v, "<this>");
        if ((list.isEmpty() || list == abstractC1759v.r0()) && jVar == abstractC1759v.getAnnotations()) {
            return abstractC1759v;
        }
        G y02 = abstractC1759v.y0();
        if ((jVar instanceof D6.n) && ((D6.n) jVar).isEmpty()) {
            jVar = D6.i.f1043a;
        }
        G r8 = r(y02, jVar);
        W H02 = abstractC1759v.H0();
        if (H02 instanceof AbstractC1754p) {
            AbstractC1754p abstractC1754p = (AbstractC1754p) H02;
            return e(o(abstractC1754p.f16006e, list, r8), o(abstractC1754p.f16007f, list, r8));
        }
        if (H02 instanceof z) {
            return o((z) H02, list, r8);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ z q(z zVar, List list, G g8, int i4) {
        if ((i4 & 1) != 0) {
            list = zVar.r0();
        }
        if ((i4 & 2) != 0) {
            g8 = zVar.y0();
        }
        return o(zVar, list, g8);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final G r(G g8, D6.j jVar) {
        G g9;
        o6.j.e(g8, "<this>");
        if (AbstractC1746h.a(g8) == jVar) {
            return g8;
        }
        C7.p pVar = AbstractC1746h.f15996b;
        u6.s sVar = AbstractC1746h.f15995a[0];
        pVar.getClass();
        o6.j.e(sVar, "property");
        C1745g c1745g = (C1745g) g8.f791d.get(pVar.f818a);
        if (c1745g != null) {
            if (!g8.isEmpty()) {
                C7.a aVar = g8.f791d;
                ArrayList arrayList = new ArrayList();
                for (Object obj : aVar) {
                    if (!o6.j.a((C1745g) obj, c1745g)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() != g8.f791d.g()) {
                    G.f15953e.getClass();
                    g9 = C1536c.g(arrayList);
                    if (g9 != null) {
                        g8 = g9;
                    }
                }
            }
            g9 = g8;
            if (g9 != null) {
            }
        }
        if (jVar.iterator().hasNext() || !jVar.isEmpty()) {
            C1745g c1745g2 = new C1745g(jVar);
            C1536c c1536c = G.f15953e;
            InterfaceC1642c b4 = o6.v.f13643a.b(C1745g.class);
            c1536c.getClass();
            String a3 = b4.a();
            o6.j.b(a3);
            if (g8.f791d.get(c1536c.l(a3)) == null) {
                if (g8.isEmpty()) {
                    return new G(E2.d.y(c1745g2));
                }
                return C1536c.g(AbstractC0436k.D0(AbstractC0436k.Q0(g8), c1745g2));
            }
        }
        return g8;
    }

    public static final z s(G g8, InterfaceC0004e interfaceC0004e, List list) {
        o6.j.e(g8, "attributes");
        o6.j.e(interfaceC0004e, "descriptor");
        o6.j.e(list, "arguments");
        J B8 = interfaceC0004e.B();
        o6.j.d(B8, "getTypeConstructor(...)");
        return t(list, g8, B8, false);
    }

    public static z t(List list, G g8, J j, boolean z8) {
        InterfaceC1333o d2;
        InterfaceC1333o k;
        InterfaceC1333o interfaceC1333o;
        InterfaceC1333o C8;
        o6.j.e(g8, "attributes");
        o6.j.e(j, "constructor");
        o6.j.e(list, "arguments");
        if (g8.isEmpty() && list.isEmpty() && !z8 && j.c() != null) {
            InterfaceC0007h c6 = j.c();
            o6.j.b(c6);
            z l6 = c6.l();
            o6.j.d(l6, "getDefaultType(...)");
            return l6;
        }
        InterfaceC0007h c9 = j.c();
        if (c9 instanceof C6.T) {
            d2 = ((C6.T) c9).l().w0();
        } else if (c9 instanceof InterfaceC0004e) {
            AbstractC1098d.i(AbstractC1098d.j(c9));
            boolean isEmpty = list.isEmpty();
            F6.A a3 = null;
            C1824f c1824f = C1824f.f16282a;
            if (isEmpty) {
                InterfaceC0004e interfaceC0004e = (InterfaceC0004e) c9;
                o6.j.e(interfaceC0004e, "<this>");
                if (interfaceC0004e instanceof F6.A) {
                    a3 = (F6.A) interfaceC0004e;
                }
                if (a3 != null && (C8 = a3.C(c1824f)) != null) {
                    interfaceC1333o = C8;
                    return v(g8, j, list, z8, interfaceC1333o, new C1760w(list, g8, j, z8));
                }
                d2 = interfaceC0004e.t0();
                o6.j.d(d2, "getUnsubstitutedMemberScope(...)");
            } else {
                InterfaceC0004e interfaceC0004e2 = (InterfaceC0004e) c9;
                O g9 = K.f15967b.g(j, list);
                o6.j.e(interfaceC0004e2, "<this>");
                if (interfaceC0004e2 instanceof F6.A) {
                    a3 = (F6.A) interfaceC0004e2;
                }
                if (a3 != null && (k = a3.k(g9, c1824f)) != null) {
                    interfaceC1333o = k;
                    return v(g8, j, list, z8, interfaceC1333o, new C1760w(list, g8, j, z8));
                }
                d2 = interfaceC0004e2.Y(g9);
                o6.j.d(d2, "getMemberScope(...)");
            }
        } else if (c9 instanceof C6.S) {
            d2 = y7.l.a(y7.h.f16525g, true, ((AbstractC0054n) ((C6.S) c9)).getName().f10804d);
        } else if (j instanceof C1758u) {
            d2 = AbstractC0862a.d("member scope for intersection type", ((C1758u) j).f16016b);
        } else {
            throw new IllegalStateException("Unsupported classifier: " + c9 + " for constructor: " + j);
        }
        interfaceC1333o = d2;
        return v(g8, j, list, z8, interfaceC1333o, new C1760w(list, g8, j, z8));
    }

    public static final z u(List list, InterfaceC1333o interfaceC1333o, G g8, J j, boolean z8) {
        o6.j.e(g8, "attributes");
        o6.j.e(j, "constructor");
        o6.j.e(list, "arguments");
        o6.j.e(interfaceC1333o, "memberScope");
        A a3 = new A(j, list, z8, interfaceC1333o, new C1760w(list, interfaceC1333o, g8, j, z8));
        if (g8.isEmpty()) {
            return a3;
        }
        return new B(a3, g8);
    }

    public static final z v(G g8, J j, List list, boolean z8, InterfaceC1333o interfaceC1333o, InterfaceC1163b interfaceC1163b) {
        o6.j.e(g8, "attributes");
        o6.j.e(j, "constructor");
        o6.j.e(list, "arguments");
        o6.j.e(interfaceC1333o, "memberScope");
        A a3 = new A(j, list, z8, interfaceC1333o, interfaceC1163b);
        if (g8.isEmpty()) {
            return a3;
        }
        return new B(a3, g8);
    }

    public static final AbstractC1759v w(C6.T t8) {
        o6.j.e(t8, "<this>");
        InterfaceC0010k q6 = t8.q();
        o6.j.d(q6, "getContainingDeclaration(...)");
        if (q6 instanceof InterfaceC0008i) {
            List e9 = ((InterfaceC0008i) q6).B().e();
            o6.j.d(e9, "getParameters(...)");
            ArrayList arrayList = new ArrayList(AbstractC0438m.d0(e9, 10));
            Iterator it = e9.iterator();
            while (it.hasNext()) {
                J B8 = ((C6.T) it.next()).B();
                o6.j.d(B8, "getTypeConstructor(...)");
                arrayList.add(B8);
            }
            List upperBounds = t8.getUpperBounds();
            o6.j.d(upperBounds, "getUpperBounds(...)");
            return c(arrayList, upperBounds, AbstractC1098d.e(t8));
        }
        if (q6 instanceof InterfaceC0019u) {
            List typeParameters = ((InterfaceC0019u) q6).getTypeParameters();
            o6.j.d(typeParameters, "getTypeParameters(...)");
            ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(typeParameters, 10));
            Iterator it2 = typeParameters.iterator();
            while (it2.hasNext()) {
                J B9 = ((C6.T) it2.next()).B();
                o6.j.d(B9, "getTypeConstructor(...)");
                arrayList2.add(B9);
            }
            List upperBounds2 = t8.getUpperBounds();
            o6.j.d(upperBounds2, "getUpperBounds(...)");
            return c(arrayList2, upperBounds2, AbstractC1098d.e(t8));
        }
        throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
    }

    public static boolean x(InterfaceC1820b interfaceC1820b, InterfaceC1888e interfaceC1888e, InterfaceC1888e interfaceC1888e2) {
        if (interfaceC1820b.b0(interfaceC1888e) == interfaceC1820b.b0(interfaceC1888e2) && interfaceC1820b.m0(interfaceC1888e) == interfaceC1820b.m0(interfaceC1888e2) && interfaceC1820b.m(interfaceC1888e) == interfaceC1820b.m(interfaceC1888e2) && interfaceC1820b.h(interfaceC1820b.c0(interfaceC1888e), interfaceC1820b.c0(interfaceC1888e2))) {
            if (!interfaceC1820b.E(interfaceC1888e, interfaceC1888e2)) {
                int b02 = interfaceC1820b.b0(interfaceC1888e);
                for (int i4 = 0; i4 < b02; i4++) {
                    M C8 = interfaceC1820b.C(interfaceC1888e, i4);
                    M C9 = interfaceC1820b.C(interfaceC1888e2, i4);
                    if (interfaceC1820b.j0(C8) == interfaceC1820b.j0(C9)) {
                        if (!interfaceC1820b.j0(C8)) {
                            if (interfaceC1820b.y(C8) == interfaceC1820b.y(C9)) {
                                W w8 = interfaceC1820b.w(C8);
                                o6.j.b(w8);
                                W w9 = interfaceC1820b.w(C9);
                                o6.j.b(w9);
                                if (!y(interfaceC1820b, w8, w9)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean y(InterfaceC1820b interfaceC1820b, InterfaceC1887d interfaceC1887d, InterfaceC1887d interfaceC1887d2) {
        if (interfaceC1887d != interfaceC1887d2) {
            z e9 = interfaceC1820b.e(interfaceC1887d);
            z e10 = interfaceC1820b.e(interfaceC1887d2);
            if (e9 != null && e10 != null) {
                return x(interfaceC1820b, e9, e10);
            }
            AbstractC1754p G8 = interfaceC1820b.G(interfaceC1887d);
            AbstractC1754p G9 = interfaceC1820b.G(interfaceC1887d2);
            if (G8 != null && G9 != null && x(interfaceC1820b, interfaceC1820b.l0(G8), interfaceC1820b.l0(G9)) && x(interfaceC1820b, interfaceC1820b.L(G8), interfaceC1820b.L(G9))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static Q z(List list, O o7, InterfaceC0010k interfaceC0010k, ArrayList arrayList) {
        if (o7 != null) {
            if (interfaceC0010k != null) {
                if (arrayList != null) {
                    Q A2 = A(list, o7, interfaceC0010k, arrayList, null);
                    if (A2 != null) {
                        return A2;
                    }
                    throw new AssertionError("Substitution failed");
                }
                a(3);
                throw null;
            }
            a(2);
            throw null;
        }
        a(1);
        throw null;
    }

    public abstract InterfaceC1888e C(I i4, InterfaceC1887d interfaceC1887d);
}
