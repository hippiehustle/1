package u7;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import F6.C0057q;
import a6.AbstractC0438m;
import a7.C0450k;
import c7.InterfaceC0588g;
import f7.C0722b;
import f7.C0725e;
import g0.b0;
import h7.AbstractC0842e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import n6.InterfaceC1163b;
import p7.C1324f;
import s7.C1518i;
import w7.AbstractC1759v;
import x7.C1824f;

/* renamed from: u7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1654g extends o {

    /* renamed from: g, reason: collision with root package name */
    public final C1824f f15396g;

    /* renamed from: h, reason: collision with root package name */
    public final v7.i f15397h;

    /* renamed from: i, reason: collision with root package name */
    public final v7.i f15398i;
    public final /* synthetic */ C1655h j;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v6, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [v7.i, v7.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1654g(C1655h c1655h, C1824f c1824f) {
        super(r2, r3, r4, r5, new C1652e(r1, 0));
        o6.j.e(c1824f, "kotlinTypeRefiner");
        this.j = c1655h;
        F3.m mVar = c1655h.f15404o;
        C0450k c0450k = c1655h.f15399h;
        List list = c0450k.f8170t;
        o6.j.d(list, "getFunctionList(...)");
        List list2 = c0450k.f8171u;
        o6.j.d(list2, "getPropertyList(...)");
        List list3 = c0450k.f8172v;
        o6.j.d(list3, "getTypeAliasList(...)");
        List list4 = c0450k.f8164n;
        o6.j.d(list4, "getNestedClassNameList(...)");
        InterfaceC0588g interfaceC0588g = (InterfaceC0588g) c1655h.f15404o.f1372e;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0842e.t(interfaceC0588g, ((Number) it.next()).intValue()));
        }
        C1518i c1518i = (C1518i) mVar.f1371d;
        this.f15396g = c1824f;
        v7.k kVar = c1518i.f14573a;
        C1653f c1653f = new C1653f(this, 0);
        kVar.getClass();
        this.f15397h = new v7.h(kVar, c1653f);
        v7.k kVar2 = c1518i.f14573a;
        C1653f c1653f2 = new C1653f(this, 1);
        kVar2.getClass();
        this.f15398i = new v7.h(kVar2, c1653f2);
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1335q
    public final Collection a(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        return (Collection) this.f15397h.a();
    }

    @Override // u7.o, p7.AbstractC1334p, p7.InterfaceC1335q
    public final InterfaceC0007h d(C0725e c0725e, K6.b bVar) {
        InterfaceC0004e interfaceC0004e;
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        s(c0725e, bVar);
        b0 b0Var = this.j.f15408s;
        if (b0Var != null && (interfaceC0004e = (InterfaceC0004e) ((U1.c) b0Var.f10988e).m(c0725e)) != null) {
            return interfaceC0004e;
        }
        return super.d(c0725e, bVar);
    }

    @Override // u7.o, p7.AbstractC1334p, p7.InterfaceC1333o
    public final Collection f(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        s(c0725e, bVar);
        return super.f(c0725e, bVar);
    }

    @Override // u7.o, p7.AbstractC1334p, p7.InterfaceC1333o
    public final Collection g(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        s(c0725e, bVar);
        return super.g(c0725e, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [a6.s] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // u7.o
    public final void h(ArrayList arrayList, InterfaceC1163b interfaceC1163b) {
        ?? r12;
        b0 b0Var = this.j.f15408s;
        if (b0Var != null) {
            Set<C0725e> keySet = ((LinkedHashMap) b0Var.f10987d).keySet();
            r12 = new ArrayList();
            for (C0725e c0725e : keySet) {
                o6.j.e(c0725e, "name");
                InterfaceC0004e interfaceC0004e = (InterfaceC0004e) ((U1.c) b0Var.f10988e).m(c0725e);
                if (interfaceC0004e != null) {
                    r12.add(interfaceC0004e);
                }
            }
        } else {
            r12 = 0;
        }
        if (r12 == 0) {
            r12 = a6.s.f7766d;
        }
        arrayList.addAll(r12);
    }

    @Override // u7.o
    public final void j(C0725e c0725e, ArrayList arrayList) {
        o6.j.e(c0725e, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f15398i.a()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC1759v) it.next()).w0().g(c0725e, K6.b.f2732f));
        }
        F3.m mVar = this.f15433b;
        arrayList.addAll(((C1518i) mVar.f1371d).f14584n.c(c0725e, this.j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((x7.l) ((C1518i) mVar.f1371d).f14587q).f16298d.h(c0725e, arrayList2, arrayList3, this.j, new C0057q(arrayList, 1));
    }

    @Override // u7.o
    public final void k(C0725e c0725e, ArrayList arrayList) {
        o6.j.e(c0725e, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f15398i.a()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC1759v) it.next()).w0().f(c0725e, K6.b.f2732f));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((x7.l) ((C1518i) this.f15433b.f1371d).f14587q).f16298d.h(c0725e, arrayList2, arrayList3, this.j, new C0057q(arrayList, 1));
    }

    @Override // u7.o
    public final C0722b l(C0725e c0725e) {
        o6.j.e(c0725e, "name");
        return this.j.k.d(c0725e);
    }

    @Override // u7.o
    public final Set n() {
        List d2 = this.j.f15406q.d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = d2.iterator();
        while (it.hasNext()) {
            Set e9 = ((AbstractC1759v) it.next()).w0().e();
            if (e9 == null) {
                return null;
            }
            a6.q.f0(linkedHashSet, e9);
        }
        return linkedHashSet;
    }

    @Override // u7.o
    public final Set o() {
        C1655h c1655h = this.j;
        List d2 = c1655h.f15406q.d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = d2.iterator();
        while (it.hasNext()) {
            a6.q.f0(linkedHashSet, ((AbstractC1759v) it.next()).w0().b());
        }
        linkedHashSet.addAll(((C1518i) this.f15433b.f1371d).f14584n.a(c1655h));
        return linkedHashSet;
    }

    @Override // u7.o
    public final Set p() {
        List d2 = this.j.f15406q.d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = d2.iterator();
        while (it.hasNext()) {
            a6.q.f0(linkedHashSet, ((AbstractC1759v) it.next()).w0().c());
        }
        return linkedHashSet;
    }

    @Override // u7.o
    public final boolean r(r rVar) {
        return ((C1518i) this.f15433b.f1371d).f14585o.e(this.j, rVar);
    }

    public final void s(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        o6.j.e(((C1518i) this.f15433b.f1371d).f14581i, "<this>");
        o6.j.e(this.j, "scopeOwner");
    }
}
