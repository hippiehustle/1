package T6;

import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.O;
import F6.C0058s;
import F6.N;
import I6.AbstractC0065d;
import P6.C0279b;
import a6.AbstractC0436k;
import a7.C0460v;
import b6.C0535c;
import c7.C0587f;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import g0.b0;
import i7.AbstractC0898m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import m7.AbstractC1098d;
import n6.InterfaceC1163b;
import n7.C1168a;
import s3.AbstractC1492c;
import s7.C1513d;
import s7.C1518i;
import u6.AbstractC1638C;
import u7.C1648a;
import u7.C1655h;
import w7.AbstractC1759v;
import z7.InterfaceC1887d;

/* loaded from: classes.dex */
public final class l implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5857d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5858e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5859f;

    public l(N n3, o oVar) {
        this.f5857d = 1;
        this.f5859f = n3;
        this.f5858e = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (((P6.EnumC0278a) r7.f7039f) != P6.EnumC0278a.f4547i) goto L29;
     */
    /* JADX WARN: Type inference failed for: r11v0, types: [v7.i, v7.h] */
    @Override // n6.InterfaceC1163b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj) {
        I6.o oVar;
        W5.a k;
        H6.b bVar;
        C0722b c0722b;
        C0723c c0723c;
        InterfaceC0004e a3;
        String str;
        Class L8;
        H6.b q6;
        X6.e eVar;
        int i4 = this.f5857d;
        boolean z8 = true;
        Object obj2 = this.f5859f;
        Object obj3 = this.f5858e;
        switch (i4) {
            case 0:
                o oVar2 = (o) obj3;
                A4.a aVar = (A4.a) obj2;
                C0725e c0725e = (C0725e) obj;
                o6.j.e(c0725e, "name");
                v7.i iVar = oVar2.f5873r;
                InterfaceC0004e interfaceC0004e = oVar2.f5869n;
                if (((Set) iVar.a()).contains(c0725e)) {
                    W0.d dVar = ((S6.a) aVar.f280e).f5399b;
                    C0722b f8 = AbstractC1098d.f(interfaceC0004e);
                    o6.j.b(f8);
                    C0722b d2 = f8.d(c0725e);
                    dVar.getClass();
                    C0723c c0723c2 = d2.f10793a;
                    String Y = I7.v.Y(d2.f10794b.f10797a.f10800a, '.', '$');
                    if (!c0723c2.f10797a.c()) {
                        Y = c0723c2.f10797a.f10800a + '.' + Y;
                    }
                    Class L9 = AbstractC1492c.L((ClassLoader) dVar.f6489e, Y);
                    if (L9 != null) {
                        oVar = new I6.o(L9);
                    } else {
                        oVar = null;
                    }
                    if (oVar == null) {
                        return null;
                    }
                    i iVar2 = new i(aVar, interfaceC0004e, oVar, null);
                    ((S6.a) aVar.f280e).f5414s.getClass();
                    return iVar2;
                }
                if (((Set) oVar2.f5874s.a()).contains(c0725e)) {
                    C0535c i8 = E2.d.i();
                    ((C1168a) ((S6.a) aVar.f280e).f5419x).getClass();
                    o6.j.e(interfaceC0004e, "thisDescriptor");
                    o6.j.e(c0725e, "name");
                    o6.j.e(aVar, "c");
                    C0535c f9 = E2.d.f(i8);
                    int g8 = f9.g();
                    if (g8 == 0) {
                        return null;
                    }
                    if (g8 == 1) {
                        return (InterfaceC0004e) AbstractC0436k.G0(f9);
                    }
                    throw new IllegalStateException(("Multiple classes with same name are generated: " + f9).toString());
                }
                I6.u uVar = (I6.u) ((Map) oVar2.f5875t.a()).get(c0725e);
                if (uVar == null) {
                    return null;
                }
                S6.a aVar2 = (S6.a) aVar.f280e;
                v7.n nVar = aVar2.f5398a;
                k kVar = new k(oVar2, 2);
                v7.k kVar2 = (v7.k) nVar;
                kVar2.getClass();
                return C0058s.r0(aVar2.f5398a, oVar2.f5869n, c0725e, new v7.h(kVar2, kVar), AbstractC1492c.H(aVar, uVar), aVar2.j.b(uVar));
            case 1:
                N n3 = (N) obj2;
                o oVar3 = (o) obj3;
                C0725e c0725e2 = (C0725e) obj;
                o6.j.e(c0725e2, "accessorName");
                if (o6.j.a(n3.getName(), c0725e2)) {
                    return E2.d.y(n3);
                }
                return AbstractC0436k.C0(oVar3.N(c0725e2), oVar3.O(c0725e2));
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                v vVar = (v) obj3;
                A4.a aVar3 = vVar.f5793b;
                A4.a aVar4 = (A4.a) obj2;
                S6.a aVar5 = (S6.a) aVar4.f280e;
                r rVar = (r) obj;
                o6.j.e(rVar, "request");
                q qVar = vVar.f5891o;
                C0722b c0722b2 = new C0722b(qVar.f1461i, rVar.f5885a);
                I6.o oVar4 = rVar.f5886b;
                if (oVar4 != null) {
                    W0.c cVar = aVar5.f5400c;
                    ((S6.a) aVar3.f280e).f5401d.c().f14575c.getClass();
                    C0587f c0587f = C0587f.f9721g;
                    cVar.getClass();
                    o6.j.e(c0587f, "metadataVersion");
                    C0723c c6 = oVar4.c();
                    if (c6 != null && (str = c6.f10797a.f10800a) != null && (L8 = AbstractC1492c.L((ClassLoader) cVar.f6486e, str)) != null && (q6 = AbstractC1638C.q(L8)) != null) {
                        k = new W5.a(5, q6);
                    } else {
                        k = null;
                    }
                } else {
                    W0.c cVar2 = aVar5.f5400c;
                    ((S6.a) aVar3.f280e).f5401d.c().f14575c.getClass();
                    k = cVar2.k(c0722b2, C0587f.f9721g);
                }
                if (k != null) {
                    bVar = (H6.b) k.f6634e;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    c0722b = AbstractC0065d.a(bVar.f2037a);
                } else {
                    c0722b = null;
                }
                if (c0722b != null && (c0722b.g() || c0722b.f10795c)) {
                    return null;
                }
                E2.b bVar2 = t.f5888d;
                if (bVar != null) {
                    if (bVar.f2038b.f7517a == Z6.a.CLASS) {
                        Y6.e eVar2 = ((S6.a) aVar3.f280e).f5401d;
                        eVar2.getClass();
                        C1513d g9 = eVar2.g(bVar);
                        if (g9 == null) {
                            a3 = null;
                        } else {
                            a3 = eVar2.c().f14590t.a(AbstractC0065d.a(bVar.f2037a), g9);
                        }
                        if (a3 != null) {
                            bVar2 = new s(a3);
                        }
                    } else {
                        bVar2 = u.f5889d;
                    }
                }
                if (bVar2 instanceof s) {
                    return ((s) bVar2).f5887d;
                }
                if (bVar2 instanceof u) {
                    return null;
                }
                if (bVar2 instanceof t) {
                    if (oVar4 == null) {
                        W0.d dVar2 = aVar5.f5399b;
                        dVar2.getClass();
                        String Y2 = I7.v.Y(c0722b2.f10794b.f10797a.f10800a, '.', '$');
                        C0723c c0723c3 = c0722b2.f10793a;
                        if (!c0723c3.f10797a.c()) {
                            Y2 = c0723c3.f10797a.f10800a + '.' + Y2;
                        }
                        Class L10 = AbstractC1492c.L((ClassLoader) dVar2.f6489e, Y2);
                        if (L10 != null) {
                            oVar4 = new I6.o(L10);
                        } else {
                            oVar4 = null;
                        }
                    }
                    if (oVar4 != null) {
                        c0723c = oVar4.c();
                    } else {
                        c0723c = null;
                    }
                    if (c0723c == null || c0723c.f10797a.c() || !c0723c.b().equals(qVar.f1461i)) {
                        return null;
                    }
                    i iVar3 = new i(aVar4, qVar, oVar4, null);
                    aVar5.f5414s.getClass();
                    return iVar3;
                }
                throw new NoWhenBranchMatchedException();
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                X6.r rVar2 = (X6.r) obj3;
                A4.a aVar6 = (A4.a) rVar2.f7038e;
                o6.j.e(obj, "$this$extractNullability");
                InterfaceC1887d interfaceC1887d = ((X6.a) obj2).f6988a;
                D6.c cVar3 = (D6.c) obj;
                if (cVar3 instanceof R6.h) {
                }
                if (cVar3 instanceof C0331f) {
                    ((S6.a) aVar6.f280e).f5415t.getClass();
                    if (!((C0331f) cVar3).f5832g) {
                        break;
                    }
                    return Boolean.valueOf(z8);
                }
                if (interfaceC1887d != null) {
                    C0725e c0725e3 = z6.h.f16714e;
                    InterfaceC0007h c9 = ((AbstractC1759v) interfaceC1887d).B0().c();
                    if (c9 != null && z6.h.s(c9) != null) {
                        ((S6.a) aVar6.f280e).f5412q.getClass();
                        Object c10 = C0279b.c(cVar3, z6.m.f16786t);
                        if (c10 != null) {
                            ArrayList a4 = C0279b.a(c10, false);
                            if (!a4.isEmpty()) {
                                Iterator it = a4.iterator();
                                while (it.hasNext()) {
                                    if (o6.j.a((String) it.next(), "TYPE")) {
                                        ((S6.a) aVar6.f280e).f5415t.getClass();
                                        return Boolean.valueOf(z8);
                                    }
                                }
                            }
                        }
                    }
                }
                z8 = false;
                return Boolean.valueOf(z8);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                X6.t tVar = (X6.t) obj3;
                X6.e[] eVarArr = (X6.e[]) obj2;
                int intValue = ((Number) obj).intValue();
                if (tVar == null || (eVar = (X6.e) tVar.f7044a.get(Integer.valueOf(intValue))) == null) {
                    if (intValue >= 0 && intValue < eVarArr.length) {
                        return eVarArr[intValue];
                    }
                    return X6.e.f6995e;
                }
                return eVar;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0002c interfaceC0002c = (InterfaceC0002c) obj;
                o6.j.e(interfaceC0002c, "second");
                ((AbstractC0898m) obj3).d((InterfaceC0002c) obj2, interfaceC0002c);
                return Z5.y.f7506a;
            default:
                b0 b0Var = (b0) obj3;
                C1655h c1655h = (C1655h) obj2;
                F3.m mVar = c1655h.f15404o;
                C0725e c0725e4 = (C0725e) obj;
                o6.j.e(c0725e4, "name");
                C0460v c0460v = (C0460v) ((LinkedHashMap) b0Var.f10987d).get(c0725e4);
                if (c0460v == null) {
                    return null;
                }
                return C0058s.r0(((C1518i) mVar.f1371d).f14573a, c1655h, c0725e4, (v7.i) b0Var.f10989f, new C1648a(((C1518i) mVar.f1371d).f14573a, new B6.f(c1655h, 13, c0460v)), O.f726a);
        }
    }

    public /* synthetic */ l(Object obj, int i4, Object obj2) {
        this.f5857d = i4;
        this.f5858e = obj;
        this.f5859f = obj2;
    }
}
