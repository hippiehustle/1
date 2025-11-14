package u7;

import C6.InterfaceC0007h;
import C6.S;
import f7.C0722b;
import f7.C0725e;
import i.AbstractC0862a;
import i7.C0893h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import n1.AbstractC1149a;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import o6.w;
import p7.AbstractC1334p;
import p7.C1324f;
import p7.C1328j;
import s7.C1518i;

/* loaded from: classes.dex */
public abstract class o extends AbstractC1334p {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f15432f;

    /* renamed from: b, reason: collision with root package name */
    public final F3.m f15433b;

    /* renamed from: c, reason: collision with root package name */
    public final n f15434c;

    /* renamed from: d, reason: collision with root package name */
    public final v7.i f15435d;

    /* renamed from: e, reason: collision with root package name */
    public final v7.h f15436e;

    static {
        o6.p pVar = new o6.p(o.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0);
        w wVar = o6.v.f13643a;
        f15432f = new u6.s[]{wVar.f(pVar), AbstractC1149a.k(o.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0, wVar)};
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [v7.i, v7.h] */
    public o(F3.m mVar, List list, List list2, List list3, InterfaceC1162a interfaceC1162a) {
        o6.j.e(mVar, "c");
        o6.j.e(list, "functionList");
        o6.j.e(list2, "propertyList");
        o6.j.e(list3, "typeAliasList");
        this.f15433b = mVar;
        C1518i c1518i = (C1518i) mVar.f1371d;
        c1518i.f14575c.getClass();
        this.f15434c = new n(this, list, list2, list3);
        v7.k kVar = c1518i.f14573a;
        C1328j c1328j = new C1328j(1, interfaceC1162a);
        kVar.getClass();
        this.f15435d = new v7.h(kVar, c1328j);
        B6.j jVar = new B6.j(18, this);
        kVar.getClass();
        this.f15436e = new v7.h(kVar, jVar);
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Set b() {
        return (Set) AbstractC0862a.j(this.f15434c.f15429g, n.j[0]);
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Set c() {
        return (Set) AbstractC0862a.j(this.f15434c.f15430h, n.j[1]);
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1335q
    public InterfaceC0007h d(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        if (q(c0725e)) {
            return ((C1518i) this.f15433b.f1371d).b(l(c0725e));
        }
        n nVar = this.f15434c;
        if (nVar.f15425c.keySet().contains(c0725e)) {
            nVar.getClass();
            return (S) nVar.f15428f.m(c0725e);
        }
        return null;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Set e() {
        u6.s sVar = f15432f[1];
        v7.h hVar = this.f15436e;
        o6.j.e(hVar, "<this>");
        o6.j.e(sVar, "p");
        return (Set) hVar.a();
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public Collection f(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        n nVar = this.f15434c;
        nVar.getClass();
        o6.j.e(c0725e, "name");
        if (!((Set) AbstractC0862a.j(nVar.f15430h, n.j[1])).contains(c0725e)) {
            return a6.s.f7766d;
        }
        return (Collection) nVar.f15427e.m(c0725e);
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public Collection g(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        n nVar = this.f15434c;
        nVar.getClass();
        o6.j.e(c0725e, "name");
        if (!((Set) AbstractC0862a.j(nVar.f15429g, n.j[0])).contains(c0725e)) {
            return a6.s.f7766d;
        }
        return (Collection) nVar.f15426d.m(c0725e);
    }

    public abstract void h(ArrayList arrayList, InterfaceC1163b interfaceC1163b);

    public final List i(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        Collection collection;
        Collection collection2;
        o6.j.e(c1324f, "kindFilter");
        ArrayList arrayList = new ArrayList(0);
        if (c1324f.a(C1324f.f13812f)) {
            h(arrayList, interfaceC1163b);
        }
        n nVar = this.f15434c;
        nVar.getClass();
        v7.i iVar = nVar.f15429g;
        v7.i iVar2 = nVar.f15430h;
        boolean a3 = c1324f.a(C1324f.j);
        a6.s sVar = a6.s.f7766d;
        C0893h c0893h = C0893h.f11775b;
        if (a3) {
            Set<C0725e> set = (Set) AbstractC0862a.j(iVar2, n.j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (C0725e c0725e : set) {
                if (((Boolean) interfaceC1163b.m(c0725e)).booleanValue()) {
                    o6.j.e(c0725e, "name");
                    if (!((Set) AbstractC0862a.j(iVar2, n.j[1])).contains(c0725e)) {
                        collection2 = sVar;
                    } else {
                        collection2 = (Collection) nVar.f15427e.m(c0725e);
                    }
                    arrayList2.addAll(collection2);
                }
            }
            a6.p.e0(arrayList2, c0893h);
            arrayList.addAll(arrayList2);
        }
        if (c1324f.a(C1324f.f13815i)) {
            Set<C0725e> set2 = (Set) AbstractC0862a.j(iVar, n.j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (C0725e c0725e2 : set2) {
                if (((Boolean) interfaceC1163b.m(c0725e2)).booleanValue()) {
                    o6.j.e(c0725e2, "name");
                    if (!((Set) AbstractC0862a.j(iVar, n.j[0])).contains(c0725e2)) {
                        collection = sVar;
                    } else {
                        collection = (Collection) nVar.f15426d.m(c0725e2);
                    }
                    arrayList3.addAll(collection);
                }
            }
            a6.p.e0(arrayList3, c0893h);
            arrayList.addAll(arrayList3);
        }
        if (c1324f.a(C1324f.f13816l)) {
            for (C0725e c0725e3 : m()) {
                if (((Boolean) interfaceC1163b.m(c0725e3)).booleanValue()) {
                    F7.l.a(arrayList, ((C1518i) this.f15433b.f1371d).b(l(c0725e3)));
                }
            }
        }
        if (c1324f.a(C1324f.f13813g)) {
            for (C0725e c0725e4 : nVar.f15425c.keySet()) {
                if (((Boolean) interfaceC1163b.m(c0725e4)).booleanValue()) {
                    nVar.getClass();
                    o6.j.e(c0725e4, "name");
                    F7.l.a(arrayList, (S) nVar.f15428f.m(c0725e4));
                }
            }
        }
        return F7.l.d(arrayList);
    }

    public void j(C0725e c0725e, ArrayList arrayList) {
        o6.j.e(c0725e, "name");
    }

    public void k(C0725e c0725e, ArrayList arrayList) {
        o6.j.e(c0725e, "name");
    }

    public abstract C0722b l(C0725e c0725e);

    public final Set m() {
        return (Set) AbstractC0862a.j(this.f15435d, f15432f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(C0725e c0725e) {
        o6.j.e(c0725e, "name");
        return m().contains(c0725e);
    }

    public boolean r(r rVar) {
        return true;
    }
}
