package u7;

import C6.AbstractC0015p;
import C6.AbstractC0021w;
import C6.C0014o;
import C6.C0020v;
import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.F;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import C6.O;
import C6.U;
import F6.B;
import F6.C0050j;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import a7.C0450k;
import a7.C0453n;
import a7.T;
import c7.AbstractC0586e;
import c7.InterfaceC0588g;
import f7.C0725e;
import h7.AbstractC0842e;
import i7.AbstractC0890e;
import i7.AbstractC0898m;
import i7.C0893h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import n6.InterfaceC1162a;
import o.p1;
import s7.C1518i;
import w7.z;

/* renamed from: u7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1651d implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15390d;

    /* renamed from: e, reason: collision with root package name */
    public final C1655h f15391e;

    public /* synthetic */ C1651d(C1655h c1655h, int i4) {
        this.f15390d = i4;
        this.f15391e = c1655h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        Object obj;
        C0014o c0014o;
        U u8;
        z y02;
        ?? r42;
        int i4 = this.f15390d;
        int i8 = 1;
        C1655h c1655h = this.f15391e;
        switch (i4) {
            case 0:
                C1655h c1655h2 = this.f15391e;
                EnumC0005f enumC0005f = c1655h2.f15403n;
                if (enumC0005f.a()) {
                    C0050j c0050j = new C0050j(c1655h2, null, D6.i.f1043a, true, 1, O.f726a);
                    List list = Collections.EMPTY_LIST;
                    int i9 = AbstractC0890e.f11774a;
                    if (enumC0005f != EnumC0005f.f743f && !enumC0005f.a()) {
                        if (AbstractC0890e.p(c1655h2)) {
                            c0014o = AbstractC0015p.f754a;
                            if (c0014o == null) {
                                AbstractC0890e.a(51);
                                throw null;
                            }
                        } else if (AbstractC0890e.k(c1655h2)) {
                            c0014o = AbstractC0015p.j;
                            if (c0014o == null) {
                                AbstractC0890e.a(52);
                                throw null;
                            }
                        } else {
                            c0014o = AbstractC0015p.f758e;
                            if (c0014o == null) {
                                AbstractC0890e.a(53);
                                throw null;
                            }
                        }
                    } else {
                        c0014o = AbstractC0015p.f754a;
                        if (c0014o == null) {
                            AbstractC0890e.a(49);
                            throw null;
                        }
                    }
                    c0050j.a1(list, c0014o);
                    c0050j.k = c1655h2.l();
                    return c0050j;
                }
                List list2 = c1655h2.f15399h.f8169s;
                o6.j.d(list2, "getConstructorList(...)");
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (!AbstractC0586e.f9708n.c(((C0453n) obj).f8191g).booleanValue()) {
                        }
                    } else {
                        obj = null;
                    }
                }
                C0453n c0453n = (C0453n) obj;
                if (c0453n == null) {
                    return null;
                }
                return ((s7.s) c1655h2.f15404o.f1377l).d(c0453n, true);
            case 1:
                F3.m mVar = c1655h.f15404o;
                List list3 = c1655h.f15399h.f8169s;
                o6.j.d(list3, "getConstructorList(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    if (AbstractC0586e.f9708n.c(((C0453n) obj2).f8191g).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C0453n c0453n2 = (C0453n) it2.next();
                    s7.s sVar = (s7.s) mVar.f1377l;
                    o6.j.b(c0453n2);
                    arrayList2.add(sVar.d(c0453n2, false));
                }
                return AbstractC0436k.C0(AbstractC0436k.C0(arrayList2, AbstractC0437l.Y(c1655h.n0())), ((C1518i) mVar.f1371d).f14584n.b(c1655h));
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C0450k c0450k = c1655h.f15399h;
                if ((c0450k.f8158f & 4) != 4) {
                    return null;
                }
                InterfaceC0007h d2 = c1655h.r0().d(AbstractC0842e.t((InterfaceC0588g) c1655h.f15404o.f1372e, c0450k.f8161i), K6.b.j);
                if (!(d2 instanceof InterfaceC0004e)) {
                    return null;
                }
                return (InterfaceC0004e) d2;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                EnumC0023y enumC0023y = c1655h.f15401l;
                EnumC0023y enumC0023y2 = EnumC0023y.f779f;
                if (enumC0023y == enumC0023y2) {
                    List<Integer> list4 = c1655h.f15399h.f8174x;
                    o6.j.b(list4);
                    if (!list4.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Integer num : list4) {
                            F3.m mVar2 = c1655h.f15404o;
                            C1518i c1518i = (C1518i) mVar2.f1371d;
                            InterfaceC0588g interfaceC0588g = (InterfaceC0588g) mVar2.f1372e;
                            o6.j.b(num);
                            InterfaceC0004e b4 = c1518i.b(AbstractC0842e.m(interfaceC0588g, num.intValue()));
                            if (b4 != null) {
                                arrayList3.add(b4);
                            }
                        }
                        return arrayList3;
                    }
                    if (enumC0023y == enumC0023y2) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        InterfaceC0010k interfaceC0010k = c1655h.f15409t;
                        if (interfaceC0010k instanceof F) {
                            AbstractC0898m.c(c1655h, linkedHashSet, ((F) interfaceC0010k).w0(), false);
                        }
                        AbstractC0898m.c(c1655h, linkedHashSet, c1655h.k0(), true);
                        return AbstractC0436k.L0(linkedHashSet, new C0893h(i8));
                    }
                }
                return a6.s.f7766d;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                if (!c1655h.g() && !c1655h.m()) {
                    return null;
                }
                C0450k c0450k2 = c1655h.f15399h;
                F3.m mVar3 = c1655h.f15404o;
                InterfaceC0588g interfaceC0588g2 = (InterfaceC0588g) mVar3.f1372e;
                B b9 = (B) mVar3.f1374g;
                p1 p1Var = (p1) mVar3.k;
                o6.j.e(c0450k2, "<this>");
                o6.j.e(interfaceC0588g2, "nameResolver");
                if (c0450k2.f8146C.size() > 0) {
                    List<Integer> list5 = c0450k2.f8146C;
                    o6.j.d(list5, "getMultiFieldValueClassUnderlyingNameList(...)");
                    ArrayList arrayList4 = new ArrayList(AbstractC0438m.d0(list5, 10));
                    for (Integer num2 : list5) {
                        o6.j.b(num2);
                        arrayList4.add(AbstractC0842e.t(interfaceC0588g2, num2.intValue()));
                    }
                    Z5.j jVar = new Z5.j(Integer.valueOf(c0450k2.f8149F.size()), Integer.valueOf(c0450k2.f8148E.size()));
                    if (jVar.equals(new Z5.j(Integer.valueOf(arrayList4.size()), 0))) {
                        List<Integer> list6 = c0450k2.f8149F;
                        o6.j.d(list6, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
                        r42 = new ArrayList(AbstractC0438m.d0(list6, 10));
                        for (Integer num3 : list6) {
                            o6.j.b(num3);
                            r42.add(b9.a(num3.intValue()));
                        }
                    } else if (jVar.equals(new Z5.j(0, Integer.valueOf(arrayList4.size())))) {
                        r42 = c0450k2.f8148E;
                    } else {
                        throw new IllegalStateException(("class " + AbstractC0842e.t(interfaceC0588g2, c0450k2.f8160h) + " has illegal multi-field value class representation").toString());
                    }
                    ArrayList arrayList5 = new ArrayList(AbstractC0438m.d0(r42, 10));
                    for (T t8 : r42) {
                        o6.j.e(t8, "p0");
                        arrayList5.add(p1Var.f(t8, true));
                    }
                    u8 = new C6.B(AbstractC0436k.X0(arrayList4, arrayList5));
                } else if ((c0450k2.f8158f & 8) == 8) {
                    C0725e t9 = AbstractC0842e.t(interfaceC0588g2, c0450k2.f8176z);
                    T Y = AbstractC0405a.Y(c0450k2, b9);
                    if ((Y != null && (y02 = p1Var.f(Y, true)) != null) || (y02 = c1655h.y0(t9)) != null) {
                        u8 = new C0020v(t9, y02);
                    } else {
                        throw new IllegalStateException(("cannot determine underlying type for value class " + AbstractC0842e.t(interfaceC0588g2, c0450k2.f8160h) + " with property " + t9).toString());
                    }
                } else {
                    u8 = null;
                }
                if (u8 != null) {
                    return u8;
                }
                if (c1655h.f15400i.a(1, 5, 1)) {
                    return null;
                }
                C0050j n02 = c1655h.n0();
                if (n02 != null) {
                    List z02 = n02.z0();
                    o6.j.d(z02, "getValueParameters(...)");
                    C0725e name = ((F6.U) AbstractC0436k.p0(z02)).getName();
                    o6.j.d(name, "getName(...)");
                    z y03 = c1655h.y0(name);
                    if (y03 != null) {
                        return new C0020v(name, y03);
                    }
                    throw new IllegalStateException(("Value class has no underlying property: " + c1655h).toString());
                }
                throw new IllegalStateException(("Inline class has no primary constructor: " + c1655h).toString());
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return AbstractC0436k.Q0(((C1518i) c1655h.f15404o.f1371d).f14577e.b(c1655h.f15413x));
            default:
                return AbstractC0021w.c(c1655h);
        }
    }
}
