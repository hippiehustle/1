package w6;

import C6.InterfaceC0004e;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a7.C0439A;
import a7.C0447h;
import a7.C0450k;
import a7.C0453n;
import a7.C0455p;
import a7.C0458t;
import a7.C0460v;
import a7.C0463y;
import a7.EnumC0457s;
import c7.C0590i;
import c7.InterfaceC0588g;
import g7.C0799h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;
import n6.InterfaceC1162a;
import o.p1;
import s3.AbstractC1492c;
import u6.AbstractC1638C;
import u7.C1655h;

/* renamed from: w6.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1734v implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15917d;

    /* renamed from: e, reason: collision with root package name */
    public final C1737y f15918e;

    public /* synthetic */ C1734v(C1737y c1737y, int i4) {
        this.f15917d = i4;
        this.f15918e = c1737y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:253:0x06ec, code lost:
    
        if (r5 == false) goto L202;
     */
    @Override // n6.InterfaceC1162a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        C1655h c1655h;
        String str;
        p1 p1Var;
        L6.T t8;
        int i4 = this.f15917d;
        C1737y c1737y = this.f15918e;
        switch (i4) {
            case 0:
                InterfaceC0004e a3 = c1737y.a();
                if (a3 instanceof C1655h) {
                    c1655h = (C1655h) a3;
                } else {
                    c1655h = null;
                }
                if (c1655h != null) {
                    C0450k c0450k = c1655h.f15399h;
                    InterfaceC0588g interfaceC0588g = (InterfaceC0588g) c1655h.f15404o.f1372e;
                    o6.j.e(c0450k, "<this>");
                    o6.j.e(interfaceC0588g, "strings");
                    L6.L l6 = new L6.L();
                    a7.Z z8 = c0450k.f8152I;
                    o6.j.d(z8, "getTypeTable(...)");
                    F6.B b4 = new F6.B(z8);
                    C0590i c0590i = C0590i.f9728b;
                    a7.g0 g0Var = c0450k.K;
                    o6.j.d(g0Var, "getVersionRequirementTable(...)");
                    p1 p1Var2 = new p1(interfaceC0588g, b4, q4.X.r(g0Var), (p1) null, a6.s.f7766d);
                    List list = c0450k.j;
                    String str2 = "getTypeParameterList(...)";
                    o6.j.d(list, "getTypeParameterList(...)");
                    p1 m6 = p1Var2.m(list);
                    List list2 = (List) m6.k;
                    F6.B b9 = (F6.B) m6.f13350f;
                    l6.f3057a = c0450k.f8159g;
                    int i8 = c0450k.f8160h;
                    InterfaceC0588g interfaceC0588g2 = (InterfaceC0588g) m6.f13349e;
                    String n3 = AbstractC1492c.n(interfaceC0588g2, i8);
                    o6.j.e(n3, "<set-?>");
                    l6.f3058b = n3;
                    List<a7.Y> list3 = c0450k.j;
                    o6.j.d(list3, "getTypeParameterList(...)");
                    for (a7.Y y4 : list3) {
                        o6.j.b(y4);
                        l6.f3059c.add(AbstractC1638C.R(y4, m6));
                    }
                    Iterator it = AbstractC0405a.B0(c0450k, b9).iterator();
                    while (it.hasNext()) {
                        l6.f3060d.add(AbstractC1638C.Q((a7.T) it.next(), m6));
                    }
                    List list4 = c0450k.f8169s;
                    o6.j.d(list4, "getConstructorList(...)");
                    Iterator it2 = list4.iterator();
                    while (true) {
                        String str3 = "getValueParameterList(...)";
                        if (it2.hasNext()) {
                            C0453n c0453n = (C0453n) it2.next();
                            o6.j.b(c0453n);
                            List list5 = list2;
                            L6.P p8 = new L6.P(c0453n.f8191g);
                            List list6 = c0453n.f8192h;
                            o6.j.d(list6, "getValueParameterList(...)");
                            for (Iterator it3 = list6.iterator(); it3.hasNext(); it3 = it3) {
                                a7.b0 b0Var = (a7.b0) it3.next();
                                o6.j.b(b0Var);
                                p8.f3075b.add(AbstractC1638C.S(b0Var, m6));
                            }
                            List<Integer> list7 = c0453n.f8193i;
                            o6.j.d(list7, "getVersionRequirementList(...)");
                            for (Integer num : list7) {
                                o6.j.b(num);
                                p8.f3076c.add(AbstractC1638C.G(num.intValue(), m6));
                            }
                            Iterator it4 = list5.iterator();
                            while (it4.hasNext()) {
                                ((O6.d) ((N6.k) it4.next())).getClass();
                                N6.d dVar = O6.b.f4046a;
                                o6.j.e(dVar, "type");
                                List<C0447h> list8 = c0453n.k;
                                o6.j.d(list8, "getAnnotationList(...)");
                                for (C0447h c0447h : list8) {
                                    o6.j.b(c0447h);
                                    p8.f3077d.add(AbstractC1492c.D(c0447h, interfaceC0588g2));
                                    it4 = it4;
                                }
                                Iterator it5 = it4;
                                C0799h c0799h = e7.g.f10671a;
                                e7.e a4 = e7.g.a(c0453n, interfaceC0588g2, b9);
                                if (a4 != null) {
                                    String str4 = a4.f10665e;
                                    String str5 = a4.f10666f;
                                    o6.j.e(str4, "name");
                                    o6.j.e(str5, "descriptor");
                                }
                                it4 = it5;
                            }
                            l6.f3064h.add(p8);
                            list2 = list5;
                        } else {
                            List list9 = list2;
                            List list10 = c0450k.f8170t;
                            o6.j.d(list10, "getFunctionList(...)");
                            List list11 = c0450k.f8171u;
                            String str6 = "getPropertyList(...)";
                            o6.j.d(list11, "getPropertyList(...)");
                            List list12 = c0450k.f8172v;
                            o6.j.d(list12, "getTypeAliasList(...)");
                            Iterator it6 = list10.iterator();
                            while (true) {
                                Iterator it7 = it6;
                                int i9 = 4;
                                if (it6.hasNext()) {
                                    C0439A c0439a = (C0439A) it7.next();
                                    List list13 = list11;
                                    List list14 = list12;
                                    String str7 = str6;
                                    L6.V v8 = new L6.V(interfaceC0588g2.getString(c0439a.f7782i), c0439a.f7780g);
                                    List list15 = c0439a.f7783l;
                                    o6.j.d(list15, str2);
                                    p1 m8 = m6.m(list15);
                                    F6.B b10 = (F6.B) m8.f13350f;
                                    F6.B b11 = b9;
                                    List list16 = c0439a.f7783l;
                                    o6.j.d(list16, str2);
                                    Iterator it8 = list16.iterator();
                                    while (it8.hasNext()) {
                                        Iterator it9 = it8;
                                        a7.Y y5 = (a7.Y) it8.next();
                                        o6.j.b(y5);
                                        v8.f3089b.add(AbstractC1638C.R(y5, m8));
                                        c0450k = c0450k;
                                        it8 = it9;
                                    }
                                    C0450k c0450k2 = c0450k;
                                    a7.T j0 = AbstractC0405a.j0(c0439a, b10);
                                    if (j0 != null) {
                                        AbstractC1638C.Q(j0, m8);
                                    }
                                    for (Iterator it10 = AbstractC0405a.q(c0439a, b10).iterator(); it10.hasNext(); it10 = it10) {
                                        v8.f3091d.add(AbstractC1638C.Q((a7.T) it10.next(), m8));
                                    }
                                    List list17 = c0439a.f7790s;
                                    o6.j.d(list17, str3);
                                    for (Iterator it11 = list17.iterator(); it11.hasNext(); it11 = it11) {
                                        a7.b0 b0Var2 = (a7.b0) it11.next();
                                        o6.j.b(b0Var2);
                                        v8.f3092e.add(AbstractC1638C.S(b0Var2, m8));
                                    }
                                    AbstractC1638C.Q(AbstractC0405a.r0(c0439a, b10), m8);
                                    if ((c0439a.f7779f & 256) == 256) {
                                        C0455p c0455p = c0439a.f7793v;
                                        o6.j.d(c0455p, "getContract(...)");
                                        str = str3;
                                        int i10 = 1;
                                        ArrayList arrayList = new ArrayList(1);
                                        Iterator it12 = c0455p.f8202e.iterator();
                                        while (it12.hasNext()) {
                                            int i11 = i10;
                                            C0458t c0458t = (C0458t) it12.next();
                                            Iterator it13 = it12;
                                            String str8 = str2;
                                            if ((c0458t.f8223e & 1) == i11) {
                                                a7.r rVar = c0458t.f8224f;
                                                if (rVar != null) {
                                                    int ordinal = rVar.ordinal();
                                                    InterfaceC0588g interfaceC0588g3 = interfaceC0588g2;
                                                    if (ordinal != 0) {
                                                        p1Var = m6;
                                                        if (ordinal != 1) {
                                                            if (ordinal == 2) {
                                                                t8 = L6.T.f3084f;
                                                            } else {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                        } else {
                                                            t8 = L6.T.f3083e;
                                                        }
                                                    } else {
                                                        p1Var = m6;
                                                        t8 = L6.T.f3082d;
                                                    }
                                                    if ((c0458t.f8223e & 4) == i9) {
                                                        EnumC0457s enumC0457s = c0458t.f8227i;
                                                        if (enumC0457s != null) {
                                                            int ordinal2 = enumC0457s.ordinal();
                                                            if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 2) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                        } else {
                                                            throw new IllegalArgumentException("Required value was null.");
                                                        }
                                                    }
                                                    L6.Q q6 = new L6.Q(t8);
                                                    List<C0463y> list18 = c0458t.f8225g;
                                                    o6.j.d(list18, "getEffectConstructorArgumentList(...)");
                                                    for (C0463y c0463y : list18) {
                                                        o6.j.b(c0463y);
                                                        q6.f3079a.add(AbstractC1638C.O(c0463y, m8));
                                                    }
                                                    if ((c0458t.f8223e & 2) == 2) {
                                                        C0463y c0463y2 = c0458t.f8226h;
                                                        o6.j.d(c0463y2, "getConclusionOfConditionalEffect(...)");
                                                        AbstractC1638C.O(c0463y2, m8);
                                                    }
                                                    arrayList.add(q6);
                                                    interfaceC0588g2 = interfaceC0588g3;
                                                    it12 = it13;
                                                    str2 = str8;
                                                    m6 = p1Var;
                                                    i10 = 1;
                                                } else {
                                                    throw new IllegalArgumentException("Required value was null.");
                                                }
                                            } else {
                                                i10 = i11;
                                                it12 = it13;
                                                str2 = str8;
                                            }
                                            i9 = 4;
                                        }
                                    } else {
                                        str = str3;
                                    }
                                    p1 p1Var3 = m6;
                                    String str9 = str2;
                                    InterfaceC0588g interfaceC0588g4 = interfaceC0588g2;
                                    List<Integer> list19 = c0439a.f7792u;
                                    o6.j.d(list19, "getVersionRequirementList(...)");
                                    for (Integer num2 : list19) {
                                        o6.j.b(num2);
                                        v8.f3093f.add(AbstractC1638C.G(num2.intValue(), m8));
                                    }
                                    Iterator it14 = ((List) m8.k).iterator();
                                    while (it14.hasNext()) {
                                        ((O6.d) ((N6.k) it14.next())).getClass();
                                        InterfaceC0588g interfaceC0588g5 = (InterfaceC0588g) m8.f13349e;
                                        N6.d dVar2 = O6.c.f4047a;
                                        o6.j.e(dVar2, "type");
                                        List<C0447h> list20 = c0439a.f7795x;
                                        o6.j.d(list20, "getAnnotationList(...)");
                                        for (C0447h c0447h2 : list20) {
                                            o6.j.b(c0447h2);
                                            v8.f3094g.add(AbstractC1492c.D(c0447h2, interfaceC0588g5));
                                        }
                                        List<C0447h> list21 = c0439a.f7796y;
                                        o6.j.d(list21, "getExtensionReceiverAnnotationList(...)");
                                        for (C0447h c0447h3 : list21) {
                                            o6.j.b(c0447h3);
                                            v8.f3090c.add(AbstractC1492c.D(c0447h3, interfaceC0588g5));
                                        }
                                        C0799h c0799h2 = e7.g.f10671a;
                                        e7.e c6 = e7.g.c(c0439a, interfaceC0588g5, b10);
                                        if (c6 != null) {
                                            String str10 = c6.f10665e;
                                            String str11 = c6.f10666f;
                                            o6.j.e(str10, "name");
                                            o6.j.e(str11, "descriptor");
                                        }
                                        g7.n nVar = d7.k.f10514c;
                                        o6.j.d(nVar, "lambdaClassOriginName");
                                        Integer num3 = (Integer) E2.d.t(c0439a, nVar);
                                        if (num3 != null) {
                                            interfaceC0588g5.getString(num3.intValue());
                                        }
                                    }
                                    l6.f3061e.add(v8);
                                    list11 = list13;
                                    it6 = it7;
                                    list12 = list14;
                                    str6 = str7;
                                    b9 = b11;
                                    c0450k = c0450k2;
                                    str3 = str;
                                    interfaceC0588g2 = interfaceC0588g4;
                                    str2 = str9;
                                    m6 = p1Var3;
                                } else {
                                    C0450k c0450k3 = c0450k;
                                    p1 p1Var4 = m6;
                                    String str12 = str2;
                                    F6.B b12 = b9;
                                    String str13 = str6;
                                    InterfaceC0588g interfaceC0588g6 = interfaceC0588g2;
                                    List<a7.V> list22 = list12;
                                    Iterator it15 = list11.iterator();
                                    while (it15.hasNext()) {
                                        l6.f3062f.add(AbstractC1638C.P((a7.I) it15.next(), p1Var4));
                                    }
                                    for (a7.V v9 : list22) {
                                        InterfaceC0588g interfaceC0588g7 = interfaceC0588g6;
                                        L6.Z z9 = new L6.Z(interfaceC0588g7.getString(v9.f7964h), v9.f7963g);
                                        List list23 = v9.f7965i;
                                        String str14 = str12;
                                        o6.j.d(list23, str14);
                                        p1 m9 = p1Var4.m(list23);
                                        F6.B b13 = (F6.B) m9.f13350f;
                                        List<a7.Y> list24 = v9.f7965i;
                                        o6.j.d(list24, str14);
                                        for (a7.Y y8 : list24) {
                                            o6.j.b(y8);
                                            z9.f3116b.add(AbstractC1638C.R(y8, m9));
                                        }
                                        AbstractC1638C.Q(AbstractC0405a.H0(v9, b13), m9);
                                        AbstractC1638C.Q(AbstractC0405a.v(v9, b13), m9);
                                        List<C0447h> list25 = v9.f7968n;
                                        o6.j.d(list25, "getAnnotationList(...)");
                                        for (C0447h c0447h4 : list25) {
                                            o6.j.b(c0447h4);
                                            z9.f3117c.add(AbstractC1492c.D(c0447h4, (InterfaceC0588g) m9.f13349e));
                                        }
                                        List<Integer> list26 = v9.f7969o;
                                        o6.j.d(list26, "getVersionRequirementList(...)");
                                        for (Integer num4 : list26) {
                                            o6.j.b(num4);
                                            z9.f3118d.add(AbstractC1638C.G(num4.intValue(), m9));
                                        }
                                        Iterator it16 = ((List) m9.k).iterator();
                                        while (it16.hasNext()) {
                                            ((O6.d) ((N6.k) it16.next())).getClass();
                                        }
                                        l6.f3063g.add(z9);
                                        str12 = str14;
                                        interfaceC0588g6 = interfaceC0588g7;
                                    }
                                    InterfaceC0588g interfaceC0588g8 = interfaceC0588g6;
                                    if ((c0450k3.f8158f & 4) == 4) {
                                        interfaceC0588g8.getString(c0450k3.f8161i);
                                    }
                                    List<Integer> list27 = c0450k3.f8164n;
                                    o6.j.d(list27, "getNestedClassNameList(...)");
                                    for (Integer num5 : list27) {
                                        o6.j.b(num5);
                                        l6.f3065i.add(interfaceC0588g8.getString(num5.intValue()));
                                    }
                                    for (C0460v c0460v : c0450k3.f8173w) {
                                        if ((c0460v.f8233f & 1) == 1) {
                                            l6.j.add(interfaceC0588g8.getString(c0460v.f8234g));
                                            A.i iVar = new A.i(interfaceC0588g8.getString(c0460v.f8234g));
                                            Iterator it17 = list9.iterator();
                                            while (it17.hasNext()) {
                                                ((O6.d) ((N6.k) it17.next())).getClass();
                                                for (C0447h c0447h5 : c0460v.f8235h) {
                                                    ArrayList arrayList2 = (ArrayList) iVar.f89f;
                                                    o6.j.b(c0447h5);
                                                    arrayList2.add(AbstractC1492c.D(c0447h5, interfaceC0588g8));
                                                }
                                            }
                                            l6.k.add(iVar);
                                        } else {
                                            throw new InconsistentKotlinMetadataException("No name for EnumEntry");
                                        }
                                    }
                                    List<Integer> list28 = c0450k3.f8174x;
                                    o6.j.d(list28, "getSealedSubclassFqNameList(...)");
                                    for (Integer num6 : list28) {
                                        o6.j.b(num6);
                                        l6.f3066l.add(AbstractC1492c.n(interfaceC0588g8, num6.intValue()));
                                    }
                                    if ((c0450k3.f8158f & 8) == 8) {
                                        interfaceC0588g8.getString(c0450k3.f8176z);
                                    }
                                    a7.T Y = AbstractC0405a.Y(c0450k3, b12);
                                    if (Y == null) {
                                        if ((c0450k3.f8158f & 8) == 8) {
                                            List list29 = c0450k3.f8171u;
                                            o6.j.d(list29, str13);
                                            Iterator it18 = list29.iterator();
                                            boolean z10 = false;
                                            Object obj = null;
                                            while (true) {
                                                if (!it18.hasNext()) {
                                                    break;
                                                } else {
                                                    Object next = it18.next();
                                                    a7.I i12 = (a7.I) next;
                                                    o6.j.b(i12);
                                                    if (AbstractC0405a.k0(i12, b12) == null && interfaceC0588g8.getString(i12.f7858i).equals(interfaceC0588g8.getString(c0450k3.f8176z))) {
                                                        if (!z10) {
                                                            obj = next;
                                                            z10 = true;
                                                        }
                                                    }
                                                }
                                            }
                                            obj = null;
                                            a7.I i13 = (a7.I) obj;
                                            if (i13 != null) {
                                                Y = AbstractC0405a.s0(i13, b12);
                                            }
                                        }
                                        Y = null;
                                    }
                                    if (Y != null) {
                                        AbstractC1638C.Q(Y, p1Var4);
                                    }
                                    Iterator it19 = AbstractC0405a.p(c0450k3, b12).iterator();
                                    while (it19.hasNext()) {
                                        l6.f3068n.add(AbstractC1638C.Q((a7.T) it19.next(), p1Var4));
                                    }
                                    List<Integer> list30 = c0450k3.f8153J;
                                    o6.j.d(list30, "getVersionRequirementList(...)");
                                    for (Integer num7 : list30) {
                                        o6.j.b(num7);
                                        l6.f3069o.add(AbstractC1638C.G(num7.intValue(), p1Var4));
                                    }
                                    Iterator it20 = list9.iterator();
                                    while (it20.hasNext()) {
                                        ((O6.d) ((N6.k) it20.next())).getClass();
                                        N6.d dVar3 = O6.a.f4044b;
                                        o6.j.e(dVar3, "type");
                                        O6.a aVar = (O6.a) ((N6.a) E2.b.L(l6.f3070p, dVar3));
                                        List<C0447h> list31 = c0450k3.f8151H;
                                        o6.j.d(list31, "getAnnotationList(...)");
                                        for (C0447h c0447h6 : list31) {
                                            o6.j.b(c0447h6);
                                            l6.f3067m.add(AbstractC1492c.D(c0447h6, interfaceC0588g8));
                                        }
                                        g7.n nVar2 = d7.k.k;
                                        o6.j.d(nVar2, "anonymousObjectOriginName");
                                        Integer num8 = (Integer) E2.d.t(c0450k3, nVar2);
                                        if (num8 != null) {
                                            interfaceC0588g8.getString(num8.intValue());
                                        }
                                        for (a7.I i14 : (List) c0450k3.k(d7.k.j)) {
                                            ArrayList arrayList3 = aVar.f4045a;
                                            o6.j.b(i14);
                                            arrayList3.add(AbstractC1638C.P(i14, p1Var4));
                                        }
                                        g7.n nVar3 = d7.k.f10520i;
                                        o6.j.d(nVar3, "classModuleName");
                                        Integer num9 = (Integer) E2.d.t(c0450k3, nVar3);
                                        if (num9 != null) {
                                            interfaceC0588g8.getString(num9.intValue());
                                        }
                                        g7.n nVar4 = d7.k.f10521l;
                                        o6.j.d(nVar4, "jvmClassFlags");
                                    }
                                    return l6;
                                }
                            }
                        }
                    }
                } else {
                    return null;
                }
                break;
            case 1:
                s0 s0Var = c1737y.f15931g;
                u6.s[] sVarArr = C1737y.f15926m;
                u6.s sVar = sVarArr[9];
                Object a9 = s0Var.a();
                o6.j.d(a9, "getValue(...)");
                s0 s0Var2 = c1737y.f15933i;
                u6.s sVar2 = sVarArr[11];
                Object a10 = s0Var2.a();
                o6.j.d(a10, "getValue(...)");
                return AbstractC0436k.C0((Collection) a9, (Collection) a10);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                s0 s0Var3 = c1737y.f15932h;
                u6.s[] sVarArr2 = C1737y.f15926m;
                u6.s sVar3 = sVarArr2[10];
                Object a11 = s0Var3.a();
                o6.j.d(a11, "getValue(...)");
                s0 s0Var4 = c1737y.j;
                u6.s sVar4 = sVarArr2[12];
                Object a12 = s0Var4.a();
                o6.j.d(a12, "getValue(...)");
                return AbstractC0436k.C0((Collection) a11, (Collection) a12);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                s0 s0Var5 = c1737y.f15931g;
                u6.s[] sVarArr3 = C1737y.f15926m;
                u6.s sVar5 = sVarArr3[9];
                Object a13 = s0Var5.a();
                o6.j.d(a13, "getValue(...)");
                s0 s0Var6 = c1737y.f15932h;
                u6.s sVar6 = sVarArr3[10];
                Object a14 = s0Var6.a();
                o6.j.d(a14, "getValue(...)");
                return AbstractC0436k.C0((Collection) a13, (Collection) a14);
            default:
                s0 s0Var7 = c1737y.k;
                u6.s[] sVarArr4 = C1737y.f15926m;
                u6.s sVar7 = sVarArr4[13];
                Object a15 = s0Var7.a();
                o6.j.d(a15, "getValue(...)");
                s0 s0Var8 = c1737y.f15934l;
                u6.s sVar8 = sVarArr4[14];
                Object a16 = s0Var8.a();
                o6.j.d(a16, "getValue(...)");
                return AbstractC0436k.C0((Collection) a15, (Collection) a16);
        }
    }
}
