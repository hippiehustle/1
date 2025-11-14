package x7;

import C6.C0020v;
import C6.C0024z;
import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import C6.T;
import C6.U;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import f7.C0723c;
import h6.AbstractC0837b;
import h7.C0845h;
import j7.InterfaceC0943b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n1.AbstractC1149a;
import o6.v;
import u7.C1652e;
import w7.AbstractC1741c;
import w7.AbstractC1754p;
import w7.AbstractC1759v;
import w7.C;
import w7.C1750l;
import w7.C1758u;
import w7.E;
import w7.G;
import w7.I;
import w7.J;
import w7.K;
import w7.M;
import w7.Q;
import w7.W;
import w7.X;
import w7.z;
import z7.EnumC1885b;
import z7.EnumC1892i;
import z7.InterfaceC1886c;
import z7.InterfaceC1887d;
import z7.InterfaceC1888e;
import z7.InterfaceC1889f;
import z7.InterfaceC1890g;
import z7.InterfaceC1891h;

/* renamed from: x7.g */
/* loaded from: classes.dex */
public abstract class AbstractC1825g {

    /* renamed from: a */
    public static final C0024z f16283a = new C0024z("KotlinTypeRefiner", 0);

    public static boolean A(InterfaceC1891h interfaceC1891h) {
        o6.j.e(interfaceC1891h, "$receiver");
        if (interfaceC1891h instanceof J) {
            return ((J) interfaceC1891h).a();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1891h);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1891h.getClass(), sb).toString());
    }

    public static boolean B(InterfaceC1887d interfaceC1887d) {
        o6.j.e(interfaceC1887d, "$receiver");
        if (interfaceC1887d instanceof AbstractC1759v) {
            return AbstractC1741c.j((AbstractC1759v) interfaceC1887d);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1887d);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1887d.getClass(), sb).toString());
    }

    public static boolean C(InterfaceC1891h interfaceC1891h) {
        InterfaceC0004e interfaceC0004e;
        o6.j.e(interfaceC1891h, "$receiver");
        if (interfaceC1891h instanceof J) {
            InterfaceC0007h c6 = ((J) interfaceC1891h).c();
            U u8 = null;
            if (c6 instanceof InterfaceC0004e) {
                interfaceC0004e = (InterfaceC0004e) c6;
            } else {
                interfaceC0004e = null;
            }
            if (interfaceC0004e != null) {
                u8 = interfaceC0004e.l0();
            }
            return u8 instanceof C0020v;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1891h);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1891h.getClass(), sb).toString());
    }

    public static boolean D(InterfaceC1891h interfaceC1891h) {
        o6.j.e(interfaceC1891h, "$receiver");
        if (interfaceC1891h instanceof J) {
            return interfaceC1891h instanceof k7.n;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1891h);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1891h.getClass(), sb).toString());
    }

    public static boolean E(InterfaceC1891h interfaceC1891h) {
        o6.j.e(interfaceC1891h, "$receiver");
        if (interfaceC1891h instanceof J) {
            return interfaceC1891h instanceof C1758u;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1891h);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1891h.getClass(), sb).toString());
    }

    public static boolean F(InterfaceC1887d interfaceC1887d) {
        o6.j.e(interfaceC1887d, "$receiver");
        if ((interfaceC1887d instanceof z) && ((z) interfaceC1887d).E0()) {
            return true;
        }
        return false;
    }

    public static boolean G(InterfaceC1891h interfaceC1891h) {
        o6.j.e(interfaceC1891h, "$receiver");
        if (interfaceC1891h instanceof J) {
            return z6.h.I((J) interfaceC1891h, z6.m.f16764b);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1891h);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1891h.getClass(), sb).toString());
    }

    public static boolean H(InterfaceC1887d interfaceC1887d) {
        o6.j.e(interfaceC1887d, "$receiver");
        if (interfaceC1887d instanceof AbstractC1759v) {
            return w7.U.e((AbstractC1759v) interfaceC1887d);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1887d);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1887d.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean I(InterfaceC1889f interfaceC1889f) {
        o6.j.e(interfaceC1889f, "$receiver");
        if (interfaceC1889f instanceof AbstractC1759v) {
            return z6.h.G((AbstractC1759v) interfaceC1889f);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1889f);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1889f.getClass(), sb).toString());
    }

    public static boolean J(InterfaceC1886c interfaceC1886c) {
        if (interfaceC1886c instanceof C1826h) {
            return ((C1826h) interfaceC1886c).j;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1886c);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1886c.getClass(), sb).toString());
    }

    public static boolean K(M m6) {
        o6.j.e(m6, "$receiver");
        if (m6 instanceof M) {
            return m6.c();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(m6);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, m6.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void L(InterfaceC1888e interfaceC1888e) {
        o6.j.e(interfaceC1888e, "$receiver");
        if (interfaceC1888e instanceof z) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1888e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1888e.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(InterfaceC1888e interfaceC1888e) {
        o6.j.e(interfaceC1888e, "$receiver");
        if (interfaceC1888e instanceof z) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1888e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1888e.getClass(), sb).toString());
    }

    public static z N(AbstractC1754p abstractC1754p) {
        if (abstractC1754p instanceof AbstractC1754p) {
            return abstractC1754p.f16006e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(abstractC1754p);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, abstractC1754p.getClass(), sb).toString());
    }

    public static W O(InterfaceC1886c interfaceC1886c) {
        if (interfaceC1886c instanceof C1826h) {
            return ((C1826h) interfaceC1886c).f16286g;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1886c);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1886c.getClass(), sb).toString());
    }

    public static W P(InterfaceC1887d interfaceC1887d) {
        if (interfaceC1887d instanceof W) {
            return AbstractC1741c.m((W) interfaceC1887d, false);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1887d);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1887d.getClass(), sb).toString());
    }

    public static int Q(InterfaceC1891h interfaceC1891h) {
        o6.j.e(interfaceC1891h, "$receiver");
        if (interfaceC1891h instanceof J) {
            return ((J) interfaceC1891h).e().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1891h);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1891h.getClass(), sb).toString());
    }

    public static Set R(InterfaceC1820b interfaceC1820b, InterfaceC1888e interfaceC1888e) {
        J c02 = interfaceC1820b.c0(interfaceC1888e);
        if (c02 instanceof k7.n) {
            return ((k7.n) c02).f12149a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1888e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1888e.getClass(), sb).toString());
    }

    public static M S(InterfaceC0943b interfaceC0943b) {
        o6.j.e(interfaceC0943b, "$receiver");
        if (interfaceC0943b instanceof C1827i) {
            return ((C1827i) interfaceC0943b).f16289a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0943b);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC0943b.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1819a T(InterfaceC1820b interfaceC1820b, InterfaceC1888e interfaceC1888e) {
        if (interfaceC1888e instanceof z) {
            AbstractC1759v abstractC1759v = (AbstractC1759v) interfaceC1888e;
            return new C1819a(interfaceC1820b, new Q(K.f15967b.g(abstractC1759v.B0(), abstractC1759v.r0())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1888e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1888e.getClass(), sb).toString());
    }

    public static Collection U(InterfaceC1891h interfaceC1891h) {
        o6.j.e(interfaceC1891h, "$receiver");
        if (interfaceC1891h instanceof J) {
            Collection d2 = ((J) interfaceC1891h).d();
            o6.j.d(d2, "getSupertypes(...)");
            return d2;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1891h);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1891h.getClass(), sb).toString());
    }

    public static J V(InterfaceC1888e interfaceC1888e) {
        o6.j.e(interfaceC1888e, "$receiver");
        if (interfaceC1888e instanceof z) {
            return ((z) interfaceC1888e).B0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1888e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1888e.getClass(), sb).toString());
    }

    public static C1827i W(InterfaceC1886c interfaceC1886c) {
        o6.j.e(interfaceC1886c, "$receiver");
        if (interfaceC1886c instanceof C1826h) {
            return ((C1826h) interfaceC1886c).f16285f;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1886c);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1886c.getClass(), sb).toString());
    }

    public static z X(AbstractC1754p abstractC1754p) {
        if (abstractC1754p instanceof AbstractC1754p) {
            return abstractC1754p.f16007f;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(abstractC1754p);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, abstractC1754p.getClass(), sb).toString());
    }

    public static z Y(InterfaceC1888e interfaceC1888e, boolean z8) {
        o6.j.e(interfaceC1888e, "$receiver");
        if (interfaceC1888e instanceof z) {
            return ((z) interfaceC1888e).I0(z8);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1888e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1888e.getClass(), sb).toString());
    }

    public static InterfaceC1887d Z(InterfaceC1820b interfaceC1820b, InterfaceC1887d interfaceC1887d) {
        if (interfaceC1887d instanceof InterfaceC1888e) {
            return interfaceC1820b.a((InterfaceC1888e) interfaceC1887d);
        }
        if (interfaceC1887d instanceof AbstractC1754p) {
            AbstractC1754p abstractC1754p = (AbstractC1754p) interfaceC1887d;
            return interfaceC1820b.M(interfaceC1820b.a(interfaceC1820b.x(abstractC1754p)), interfaceC1820b.a(interfaceC1820b.n0(abstractC1754p)));
        }
        throw new IllegalStateException("sealed");
    }

    public static /* synthetic */ void a(int i4) {
        Object[] objArr = new Object[3];
        switch (i4) {
            case 1:
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "b";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "typeCheckingProcedure";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            default:
                objArr[0] = "a";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case 10:
                objArr[0] = "subtype";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case 11:
                objArr[0] = "supertype";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i4) {
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "assertSubtype";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(InterfaceC1891h interfaceC1891h, InterfaceC1891h interfaceC1891h2) {
        o6.j.e(interfaceC1891h, "c1");
        o6.j.e(interfaceC1891h2, "c2");
        if (interfaceC1891h instanceof J) {
            if (interfaceC1891h2 instanceof J) {
                return interfaceC1891h.equals(interfaceC1891h2);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC1891h2);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1891h2.getClass(), sb).toString());
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC1891h);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1891h.getClass(), sb2).toString());
    }

    public static int c(InterfaceC1887d interfaceC1887d) {
        o6.j.e(interfaceC1887d, "$receiver");
        if (interfaceC1887d instanceof AbstractC1759v) {
            return ((AbstractC1759v) interfaceC1887d).r0().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1887d);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1887d.getClass(), sb).toString());
    }

    public static InterfaceC1890g d(InterfaceC1888e interfaceC1888e) {
        o6.j.e(interfaceC1888e, "$receiver");
        if (interfaceC1888e instanceof z) {
            return (InterfaceC1890g) interfaceC1888e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1888e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1888e.getClass(), sb).toString());
    }

    public static InterfaceC1886c e(InterfaceC1820b interfaceC1820b, InterfaceC1889f interfaceC1889f) {
        o6.j.e(interfaceC1889f, "$receiver");
        if (interfaceC1889f instanceof z) {
            if (interfaceC1889f instanceof C) {
                return interfaceC1820b.r(((C) interfaceC1889f).f15945e);
            }
            if (interfaceC1889f instanceof C1826h) {
                return (C1826h) interfaceC1889f;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1889f);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1889f.getClass(), sb).toString());
    }

    public static C1750l f(InterfaceC1888e interfaceC1888e) {
        o6.j.e(interfaceC1888e, "$receiver");
        if (interfaceC1888e instanceof z) {
            if (interfaceC1888e instanceof C1750l) {
                return (C1750l) interfaceC1888e;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1888e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1888e.getClass(), sb).toString());
    }

    public static AbstractC1754p g(InterfaceC1887d interfaceC1887d) {
        o6.j.e(interfaceC1887d, "$receiver");
        if (interfaceC1887d instanceof AbstractC1759v) {
            W H02 = ((AbstractC1759v) interfaceC1887d).H0();
            if (H02 instanceof AbstractC1754p) {
                return (AbstractC1754p) H02;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1887d);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1887d.getClass(), sb).toString());
    }

    public static z h(InterfaceC1887d interfaceC1887d) {
        o6.j.e(interfaceC1887d, "$receiver");
        if (interfaceC1887d instanceof AbstractC1759v) {
            W H02 = ((AbstractC1759v) interfaceC1887d).H0();
            if (H02 instanceof z) {
                return (z) H02;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1887d);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1887d.getClass(), sb).toString());
    }

    public static E i(InterfaceC1887d interfaceC1887d) {
        o6.j.e(interfaceC1887d, "$receiver");
        if (interfaceC1887d instanceof AbstractC1759v) {
            return AbstractC0405a.e((AbstractC1759v) interfaceC1887d);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1887d);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1887d.getClass(), sb).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0168 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z j(InterfaceC1888e interfaceC1888e) {
        List r02;
        ArrayList arrayList;
        C1823e c1823e;
        W w8;
        if (interfaceC1888e instanceof z) {
            z zVar = (z) interfaceC1888e;
            C1652e c1652e = null;
            if (zVar.r0().size() == zVar.B0().e().size() && ((r02 = zVar.r0()) == null || !r02.isEmpty())) {
                Iterator it = r02.iterator();
                while (it.hasNext()) {
                    X a3 = ((M) it.next()).a();
                    X x8 = X.INVARIANT;
                    if (a3 != x8) {
                        List e9 = zVar.B0().e();
                        o6.j.d(e9, "getParameters(...)");
                        ArrayList X02 = AbstractC0436k.X0(r02, e9);
                        arrayList = new ArrayList(AbstractC0438m.d0(X02, 10));
                        Iterator it2 = X02.iterator();
                        while (it2.hasNext()) {
                            Z5.j jVar = (Z5.j) it2.next();
                            M m6 = (M) jVar.f7485d;
                            T t8 = (T) jVar.f7486e;
                            if (m6.a() != x8) {
                                if (!m6.c() && m6.a() == X.IN_VARIANCE) {
                                    w8 = m6.b().H0();
                                } else {
                                    w8 = null;
                                }
                                o6.j.b(t8);
                                m6 = AbstractC0405a.e(new C1826h(EnumC1885b.f16823d, new C1827i(m6, c1652e, t8, 6), w8, (G) null, false, 56));
                            }
                            arrayList.add(m6);
                        }
                        Q q6 = new Q(K.f15967b.g(zVar.B0(), arrayList));
                        int size = r02.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            M m8 = (M) r02.get(i4);
                            M m9 = (M) arrayList.get(i4);
                            if (m8.a() != x8) {
                                List upperBounds = ((T) zVar.B0().e().get(i4)).getUpperBounds();
                                o6.j.d(upperBounds, "getUpperBounds(...)");
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it3 = upperBounds.iterator();
                                while (true) {
                                    boolean hasNext = it3.hasNext();
                                    c1823e = C1823e.f16281a;
                                    if (!hasNext) {
                                        break;
                                    }
                                    arrayList2.add(c1823e.a(q6.g((AbstractC1759v) it3.next(), x8).H0()));
                                }
                                if (!m8.c() && m8.a() == X.OUT_VARIANCE) {
                                    arrayList2.add(c1823e.a(m8.b().H0()));
                                }
                                AbstractC1759v b4 = m9.b();
                                o6.j.c(b4, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                                C1827i c1827i = ((C1826h) b4).f16285f;
                                c1827i.getClass();
                                c1827i.f16290b = new C1652e(arrayList2, 2);
                            }
                        }
                        if (arrayList != null) {
                            return null;
                        }
                        return AbstractC1741c.t(arrayList, zVar.y0(), zVar.B0(), zVar.E0());
                    }
                }
            }
            arrayList = null;
            if (arrayList != null) {
            }
        } else {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC1888e);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1888e.getClass(), sb).toString());
        }
    }

    public static EnumC1885b k(InterfaceC1886c interfaceC1886c) {
        o6.j.e(interfaceC1886c, "$receiver");
        if (interfaceC1886c instanceof C1826h) {
            return ((C1826h) interfaceC1886c).f16284e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1886c);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1886c.getClass(), sb).toString());
    }

    public static I l(boolean z8, m mVar, C1823e c1823e, int i4) {
        if ((i4 & 4) != 0) {
            mVar = m.f16299a;
        }
        m mVar2 = mVar;
        if ((i4 & 8) != 0) {
            c1823e = C1823e.f16281a;
        }
        return new I(z8, true, mVar2, c1823e, C1824f.f16282a);
    }

    public static W m(InterfaceC1820b interfaceC1820b, InterfaceC1888e interfaceC1888e, InterfaceC1888e interfaceC1888e2) {
        o6.j.e(interfaceC1888e, "lowerBound");
        o6.j.e(interfaceC1888e2, "upperBound");
        if (interfaceC1888e instanceof z) {
            if (interfaceC1888e2 instanceof z) {
                return AbstractC1741c.e((z) interfaceC1888e, (z) interfaceC1888e2);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC1820b);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1820b.getClass(), sb).toString());
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC1820b);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1820b.getClass(), sb2).toString());
    }

    public static final String n(J j) {
        StringBuilder sb = new StringBuilder();
        o("type: " + j, sb);
        o("hashCode: " + j.hashCode(), sb);
        o("javaClass: " + j.getClass().getCanonicalName(), sb);
        for (InterfaceC0010k c6 = j.c(); c6 != null; c6 = c6.q()) {
            o("fqName: " + C0845h.f11446c.u(c6), sb);
            o("javaClass: " + c6.getClass().getCanonicalName(), sb);
        }
        return sb.toString();
    }

    public static final void o(String str, StringBuilder sb) {
        o6.j.e(str, "<this>");
        sb.append(str);
        sb.append('\n');
    }

    public static M p(InterfaceC1887d interfaceC1887d, int i4) {
        o6.j.e(interfaceC1887d, "$receiver");
        if (interfaceC1887d instanceof AbstractC1759v) {
            return (M) ((AbstractC1759v) interfaceC1887d).r0().get(i4);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1887d);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1887d.getClass(), sb).toString());
    }

    public static T q(InterfaceC1891h interfaceC1891h, int i4) {
        o6.j.e(interfaceC1891h, "$receiver");
        if (interfaceC1891h instanceof J) {
            Object obj = ((J) interfaceC1891h).e().get(i4);
            o6.j.d(obj, "get(...)");
            return (T) obj;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1891h);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1891h.getClass(), sb).toString());
    }

    public static W r(InterfaceC1820b interfaceC1820b, M m6) {
        o6.j.e(m6, "$receiver");
        if (interfaceC1820b.j0(m6)) {
            return null;
        }
        if (m6 instanceof M) {
            return m6.b().H0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(m6);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, m6.getClass(), sb).toString());
    }

    public static T s(InterfaceC1891h interfaceC1891h) {
        o6.j.e(interfaceC1891h, "$receiver");
        if (interfaceC1891h instanceof J) {
            InterfaceC0007h c6 = ((J) interfaceC1891h).c();
            if (c6 instanceof T) {
                return (T) c6;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1891h);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1891h.getClass(), sb).toString());
    }

    public static EnumC1892i t(M m6) {
        o6.j.e(m6, "$receiver");
        if (m6 instanceof M) {
            X a3 = m6.a();
            o6.j.d(a3, "getProjectionKind(...)");
            return AbstractC0837b.e(a3);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(m6);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, m6.getClass(), sb).toString());
    }

    public static boolean u(InterfaceC1887d interfaceC1887d, C0723c c0723c) {
        o6.j.e(interfaceC1887d, "$receiver");
        o6.j.e(c0723c, "fqName");
        if (interfaceC1887d instanceof AbstractC1759v) {
            return ((AbstractC1759v) interfaceC1887d).getAnnotations().a(c0723c);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1887d);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1887d.getClass(), sb).toString());
    }

    public static boolean v(T t8, InterfaceC1891h interfaceC1891h) {
        boolean z8;
        if (interfaceC1891h == null) {
            z8 = true;
        } else {
            z8 = interfaceC1891h instanceof J;
        }
        if (z8) {
            return AbstractC0405a.V(t8, (J) interfaceC1891h, 4);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(t8);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, t8.getClass(), sb).toString());
    }

    public static boolean w(InterfaceC1888e interfaceC1888e, InterfaceC1888e interfaceC1888e2) {
        o6.j.e(interfaceC1888e, "a");
        o6.j.e(interfaceC1888e2, "b");
        if (interfaceC1888e instanceof z) {
            if (interfaceC1888e2 instanceof z) {
                if (((z) interfaceC1888e).r0() == ((z) interfaceC1888e2).r0()) {
                    return true;
                }
                return false;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC1888e2);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1888e2.getClass(), sb).toString());
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC1888e);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1888e.getClass(), sb2).toString());
    }

    public static boolean x(InterfaceC1891h interfaceC1891h) {
        o6.j.e(interfaceC1891h, "$receiver");
        if (interfaceC1891h instanceof J) {
            return z6.h.I((J) interfaceC1891h, z6.m.f16762a);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1891h);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1891h.getClass(), sb).toString());
    }

    public static boolean y(InterfaceC1891h interfaceC1891h) {
        o6.j.e(interfaceC1891h, "$receiver");
        if (interfaceC1891h instanceof J) {
            return ((J) interfaceC1891h).c() instanceof InterfaceC0004e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1891h);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1891h.getClass(), sb).toString());
    }

    public static boolean z(InterfaceC1891h interfaceC1891h) {
        InterfaceC0004e interfaceC0004e;
        if (interfaceC1891h instanceof J) {
            InterfaceC0007h c6 = ((J) interfaceC1891h).c();
            if (c6 instanceof InterfaceC0004e) {
                interfaceC0004e = (InterfaceC0004e) c6;
            } else {
                interfaceC0004e = null;
            }
            if (interfaceC0004e == null || interfaceC0004e.j() != EnumC0023y.f778e || interfaceC0004e.e() == EnumC0005f.f743f || interfaceC0004e.e() == EnumC0005f.f744g || interfaceC0004e.e() == EnumC0005f.f745h) {
                return false;
            }
            return true;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1891h);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1891h.getClass(), sb).toString());
    }
}
