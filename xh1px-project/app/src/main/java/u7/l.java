package u7;

import C6.InterfaceC0010k;
import F6.B;
import F6.C0047g;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import a7.C0439A;
import a7.C0440a;
import a7.C0447h;
import a7.I;
import a7.V;
import a7.h0;
import c7.AbstractC0582a;
import c7.AbstractC0586e;
import c7.C0590i;
import c7.InterfaceC0588g;
import f7.C0725e;
import h7.AbstractC0842e;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import n6.InterfaceC1163b;
import o.p1;
import s7.C1518i;

/* loaded from: classes.dex */
public final class l implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15418d;

    /* renamed from: e, reason: collision with root package name */
    public final n f15419e;

    public /* synthetic */ l(n nVar, int i4) {
        this.f15418d = i4;
        this.f15419e = nVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.Map, java.lang.Object] */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        Collection<C0439A> collection;
        Collection<I> collection2;
        D6.j kVar;
        F3.m a3;
        C0725e c0725e = (C0725e) obj;
        switch (this.f15418d) {
            case 0:
                o6.j.e(c0725e, "it");
                n nVar = this.f15419e;
                LinkedHashMap linkedHashMap = nVar.f15423a;
                C0440a c0440a = C0439A.f7776C;
                o6.j.d(c0440a, "PARSER");
                o oVar = nVar.f15431i;
                byte[] bArr = (byte[]) linkedHashMap.get(c0725e);
                if (bArr != null) {
                    collection = H7.m.Y(H7.m.U(new C0047g(c0440a, new ByteArrayInputStream(bArr), oVar, 1)));
                } else {
                    collection = a6.s.f7766d;
                }
                ArrayList arrayList = new ArrayList(collection.size());
                for (C0439A c0439a : collection) {
                    s7.s sVar = (s7.s) oVar.f15433b.f1377l;
                    o6.j.b(c0439a);
                    r e9 = sVar.e(c0439a);
                    if (!oVar.r(e9)) {
                        e9 = null;
                    }
                    if (e9 != null) {
                        arrayList.add(e9);
                    }
                }
                oVar.j(c0725e, arrayList);
                return F7.l.d(arrayList);
            case 1:
                o6.j.e(c0725e, "it");
                n nVar2 = this.f15419e;
                LinkedHashMap linkedHashMap2 = nVar2.f15424b;
                C0440a c0440a2 = I.f7848G;
                o6.j.d(c0440a2, "PARSER");
                o oVar2 = nVar2.f15431i;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(c0725e);
                if (bArr2 != null) {
                    collection2 = H7.m.Y(H7.m.U(new C0047g(c0440a2, new ByteArrayInputStream(bArr2), oVar2, 1)));
                } else {
                    collection2 = a6.s.f7766d;
                }
                ArrayList arrayList2 = new ArrayList(collection2.size());
                for (I i4 : collection2) {
                    s7.s sVar2 = (s7.s) oVar2.f15433b.f1377l;
                    o6.j.b(i4);
                    arrayList2.add(sVar2.f(i4, false));
                }
                oVar2.k(c0725e, arrayList2);
                return F7.l.d(arrayList2);
            default:
                o6.j.e(c0725e, "it");
                n nVar3 = this.f15419e;
                F3.m mVar = nVar3.f15431i.f15433b;
                byte[] bArr3 = (byte[]) nVar3.f15425c.get(c0725e);
                if (bArr3 != null) {
                    V v8 = (V) V.f7960t.b(new ByteArrayInputStream(bArr3), ((C1518i) mVar.f1371d).f14586p);
                    if (v8 != null) {
                        s7.s sVar3 = (s7.s) mVar.f1377l;
                        F3.m mVar2 = sVar3.f14620a;
                        InterfaceC0588g interfaceC0588g = (InterfaceC0588g) mVar2.f1372e;
                        B b4 = (B) mVar2.f1374g;
                        List<C0447h> list = v8.f7968n;
                        o6.j.d(list, "getAnnotationList(...)");
                        ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(list, 10));
                        for (C0447h c0447h : list) {
                            R3.r rVar = sVar3.f14621b;
                            o6.j.b(c0447h);
                            arrayList3.add(rVar.z(c0447h, interfaceC0588g));
                        }
                        if (arrayList3.isEmpty()) {
                            kVar = D6.i.f1043a;
                        } else {
                            kVar = new D6.k(0, arrayList3);
                        }
                        D6.j jVar = kVar;
                        s sVar4 = new s(((C1518i) mVar2.f1371d).f14573a, (InterfaceC0010k) mVar2.f1373f, jVar, AbstractC0842e.t(interfaceC0588g, v8.f7964h), h7.u.c((h0) AbstractC0586e.f9700d.c(v8.f7963g)), v8, (InterfaceC0588g) mVar2.f1372e, b4, (C0590i) mVar2.f1375h, (InterfaceC1657j) mVar2.j);
                        List list2 = v8.f7965i;
                        o6.j.d(list2, "getTypeParameterList(...)");
                        a3 = mVar2.a(sVar4, list2, (InterfaceC0588g) mVar2.f1372e, (B) mVar2.f1374g, (C0590i) mVar2.f1375h, (AbstractC0582a) mVar2.f1376i);
                        p1 p1Var = (p1) a3.k;
                        sVar4.P0(AbstractC0436k.Q0(p1Var.k.values()), p1Var.f(AbstractC0405a.H0(v8, b4), false), p1Var.f(AbstractC0405a.v(v8, b4), false));
                        return sVar4;
                    }
                }
                return null;
        }
    }
}
