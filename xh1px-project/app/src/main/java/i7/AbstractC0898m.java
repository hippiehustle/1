package i7;

import C6.A;
import C6.AbstractC0015p;
import C6.AbstractC0021w;
import C6.C0014o;
import C6.C0024z;
import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.InterfaceC0001b;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import C6.M;
import C6.O;
import C6.S;
import F6.AbstractC0042b;
import F6.K;
import F6.L;
import F6.N;
import F6.U;
import F6.w;
import a6.AbstractC0436k;
import f7.AbstractC0726f;
import f7.C0725e;
import f7.C0728h;
import h7.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import m7.AbstractC1098d;
import n6.InterfaceC1163b;
import p7.C1324f;
import p7.InterfaceC1333o;
import q7.C1420a;
import q7.C1421b;
import u7.s;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.E;
import w7.G;
import w7.J;
import w7.z;

/* renamed from: i7.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0898m {

    /* renamed from: a, reason: collision with root package name */
    public static final C0024z f11787a = new C0024z("ResolutionAnchorProvider", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final C0024z f11788b = new C0024z("StdlibClassFinder", 0);

    public static /* synthetic */ void a(int i4) {
        String str;
        int i8;
        if (i4 != 12 && i4 != 23 && i4 != 25) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 12 && i4 != 23 && i4 != 25) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i4 != 12) {
            if (i4 != 23) {
                if (i4 != 25) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                } else {
                    objArr[1] = "createEnumValueOfMethod";
                }
            } else {
                objArr[1] = "createEnumValuesMethod";
            }
        } else {
            objArr[1] = "createSetter";
        }
        switch (i4) {
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 12 || i4 == 23 || i4 == 25) {
            throw new IllegalStateException(format);
        }
    }

    public static final void c(InterfaceC0004e interfaceC0004e, LinkedHashSet linkedHashSet, InterfaceC1333o interfaceC1333o, boolean z8) {
        for (InterfaceC0010k interfaceC0010k : u.d(interfaceC1333o, C1324f.f13819o, 2)) {
            if (interfaceC0010k instanceof InterfaceC0004e) {
                InterfaceC0004e interfaceC0004e2 = (InterfaceC0004e) interfaceC0010k;
                if (interfaceC0004e2.c0()) {
                    C0725e name = interfaceC0004e2.getName();
                    o6.j.d(name, "getName(...)");
                    InterfaceC0007h d2 = interfaceC1333o.d(name, K6.b.f2733g);
                    if (d2 instanceof InterfaceC0004e) {
                        interfaceC0004e2 = (InterfaceC0004e) d2;
                    } else if (d2 instanceof S) {
                        interfaceC0004e2 = ((s) ((S) d2)).M0();
                    } else {
                        interfaceC0004e2 = null;
                    }
                }
                if (interfaceC0004e2 != null) {
                    int i4 = AbstractC0890e.f11774a;
                    Iterator it = interfaceC0004e2.B().d().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AbstractC0890e.o((AbstractC1759v) it.next(), interfaceC0004e.a())) {
                                linkedHashSet.add(interfaceC0004e2);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z8) {
                        InterfaceC1333o k02 = interfaceC0004e2.k0();
                        o6.j.d(k02, "getUnsubstitutedInnerClassesScope(...)");
                        c(interfaceC0004e, linkedHashSet, k02, z8);
                    }
                }
            }
        }
    }

    public static w e(InterfaceC0001b interfaceC0001b, AbstractC1759v abstractC1759v, C0725e c0725e, D6.j jVar, int i4) {
        if (jVar != null) {
            if (abstractC1759v == null) {
                return null;
            }
            C1420a c1420a = new C1420a(interfaceC0001b, abstractC1759v, c0725e);
            I7.k kVar = AbstractC0726f.f10806a;
            return new w(interfaceC0001b, c1420a, jVar, C0725e.e(AbstractC0726f.f10807b + '_' + i4));
        }
        a(33);
        throw null;
    }

    public static L f(M m6, D6.j jVar) {
        return l(m6, jVar, true, m6.h());
    }

    public static F6.M g(M m6, D6.j jVar) {
        O h8 = m6.h();
        if (h8 != null) {
            return m(m6, jVar, D6.i.f1043a, true, m6.d(), h8);
        }
        a(6);
        throw null;
    }

    public static K h(AbstractC0042b abstractC0042b) {
        if (abstractC0042b != null) {
            A d2 = AbstractC0890e.d(abstractC0042b);
            o6.j.e(d2, "<this>");
            InterfaceC0004e d3 = AbstractC0021w.d(d2, C0728h.f10815A);
            if (d3 == null) {
                return null;
            }
            C0014o c0014o = AbstractC0015p.f758e;
            C0725e c0725e = z6.n.f16794b;
            O h8 = abstractC0042b.h();
            EnumC0023y enumC0023y = EnumC0023y.f778e;
            K N02 = K.N0(abstractC0042b, enumC0023y, c0014o, false, c0725e, 4, h8);
            L l6 = new L(N02, D6.i.f1043a, enumC0023y, c0014o, false, false, false, 4, null, abstractC0042b.h());
            N02.Q0(l6, null, null, null);
            G.f15953e.getClass();
            G g8 = G.f15954f;
            J B8 = d3.B();
            List singletonList = Collections.singletonList(new E(abstractC0042b.l()));
            o6.j.e(g8, "attributes");
            o6.j.e(B8, "constructor");
            o6.j.e(singletonList, "arguments");
            z t8 = AbstractC1741c.t(singletonList, g8, B8, false);
            List list = Collections.EMPTY_LIST;
            N02.T0(t8, list, null, null, list);
            l6.P0(N02.r());
            return N02;
        }
        a(26);
        throw null;
    }

    public static N i(AbstractC0042b abstractC0042b) {
        if (abstractC0042b != null) {
            N X02 = N.X0(abstractC0042b, z6.n.f16795c, 4, abstractC0042b.h());
            U u8 = new U(X02, null, 0, D6.i.f1043a, C0725e.e("value"), AbstractC1098d.e(abstractC0042b).v(), false, false, false, null, abstractC0042b.h());
            List list = Collections.EMPTY_LIST;
            return X02.R0(null, null, list, list, Collections.singletonList(u8), abstractC0042b.l(), EnumC0023y.f778e, AbstractC0015p.f758e);
        }
        a(24);
        throw null;
    }

    public static N j(AbstractC0042b abstractC0042b) {
        if (abstractC0042b != null) {
            N X02 = N.X0(abstractC0042b, z6.n.f16793a, 4, abstractC0042b.h());
            List list = Collections.EMPTY_LIST;
            return X02.R0(null, null, list, list, list, AbstractC1098d.e(abstractC0042b).h(abstractC0042b.l()), EnumC0023y.f778e, AbstractC0015p.f758e);
        }
        a(22);
        throw null;
    }

    public static w k(InterfaceC0001b interfaceC0001b, AbstractC1759v abstractC1759v, D6.j jVar) {
        if (abstractC1759v == null) {
            return null;
        }
        return new w(interfaceC0001b, new C1421b(interfaceC0001b, abstractC1759v), jVar);
    }

    public static L l(M m6, D6.j jVar, boolean z8, O o7) {
        if (jVar != null) {
            if (o7 != null) {
                return new L(m6, jVar, m6.j(), m6.d(), z8, false, false, 1, null, o7);
            }
            a(19);
            throw null;
        }
        a(18);
        throw null;
    }

    public static F6.M m(M m6, D6.j jVar, D6.j jVar2, boolean z8, C0014o c0014o, O o7) {
        if (jVar != null) {
            if (jVar2 != null) {
                if (c0014o != null) {
                    if (o7 != null) {
                        F6.M m8 = new F6.M(m6, jVar, m6.j(), c0014o, z8, false, false, 1, null, o7);
                        m8.f1502q = F6.M.O0(m8, m6.b(), jVar2);
                        return m8;
                    }
                    a(11);
                    throw null;
                }
                a(10);
                throw null;
            }
            a(9);
            throw null;
        }
        a(8);
        throw null;
    }

    public static boolean n(InterfaceC0019u interfaceC0019u) {
        if (interfaceC0019u.e() == 4) {
            InterfaceC0010k q6 = interfaceC0019u.q();
            int i4 = AbstractC0890e.f11774a;
            if (AbstractC0890e.m(q6, EnumC0005f.f743f)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final Collection o(Collection collection, InterfaceC1163b interfaceC1163b) {
        o6.j.e(collection, "<this>");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        int i4 = F7.i.f1630f;
        F7.i e9 = F7.l.e();
        while (!linkedList.isEmpty()) {
            Object p02 = AbstractC0436k.p0(linkedList);
            int i8 = F7.i.f1630f;
            F7.i e10 = F7.l.e();
            ArrayList g8 = C0896k.g(p02, linkedList, interfaceC1163b, new B6.n(18, e10));
            if (g8.size() == 1 && e10.isEmpty()) {
                Object F02 = AbstractC0436k.F0(g8);
                o6.j.d(F02, "single(...)");
                e9.add(F02);
            } else {
                Object s8 = C0896k.s(g8, interfaceC1163b);
                InterfaceC0001b interfaceC0001b = (InterfaceC0001b) interfaceC1163b.m(s8);
                Iterator it = g8.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    o6.j.b(next);
                    if (!C0896k.k(interfaceC0001b, (InterfaceC0001b) interfaceC1163b.m(next))) {
                        e10.add(next);
                    }
                }
                if (!e10.isEmpty()) {
                    e9.addAll(e10);
                }
                e9.add(s8);
            }
        }
        return e9;
    }

    public abstract void b(InterfaceC0002c interfaceC0002c);

    public abstract void d(InterfaceC0002c interfaceC0002c, InterfaceC0002c interfaceC0002c2);

    public void p(InterfaceC0002c interfaceC0002c, Collection collection) {
        o6.j.e(interfaceC0002c, "member");
        interfaceC0002c.h0(collection);
    }
}
