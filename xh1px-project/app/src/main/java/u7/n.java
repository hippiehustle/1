package u7;

import Z5.y;
import a6.AbstractC0438m;
import a6.x;
import a7.C0439A;
import a7.I;
import a7.V;
import c7.InterfaceC0588g;
import f7.C0725e;
import g7.AbstractC0793b;
import h7.AbstractC0842e;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n1.AbstractC1149a;
import o6.w;
import s7.C1518i;

/* loaded from: classes.dex */
public final class n {
    public static final /* synthetic */ u6.s[] j;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f15423a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f15424b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f15425c;

    /* renamed from: d, reason: collision with root package name */
    public final v7.e f15426d;

    /* renamed from: e, reason: collision with root package name */
    public final v7.e f15427e;

    /* renamed from: f, reason: collision with root package name */
    public final U1.c f15428f;

    /* renamed from: g, reason: collision with root package name */
    public final v7.i f15429g;

    /* renamed from: h, reason: collision with root package name */
    public final v7.i f15430h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f15431i;

    static {
        o6.p pVar = new o6.p(n.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0);
        w wVar = o6.v.f13643a;
        j = new u6.s[]{wVar.f(pVar), AbstractC1149a.k(n.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0, wVar)};
    }

    /* JADX WARN: Type inference failed for: r5v30, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r5v32, types: [v7.i, v7.h] */
    public n(o oVar, List list, List list2, List list3) {
        o6.j.e(list, "functionList");
        o6.j.e(list2, "propertyList");
        o6.j.e(list3, "typeAliasList");
        this.f15431i = oVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C0725e t8 = AbstractC0842e.t((InterfaceC0588g) oVar.f15433b.f1372e, ((C0439A) ((AbstractC0793b) obj)).f7782i);
            Object obj2 = linkedHashMap.get(t8);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(t8, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f15423a = a(linkedHashMap);
        o oVar2 = this.f15431i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : list2) {
            C0725e t9 = AbstractC0842e.t((InterfaceC0588g) oVar2.f15433b.f1372e, ((I) ((AbstractC0793b) obj3)).f7858i);
            Object obj4 = linkedHashMap2.get(t9);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap2.put(t9, obj4);
            }
            ((List) obj4).add(obj3);
        }
        this.f15424b = a(linkedHashMap2);
        ((C1518i) this.f15431i.f15433b.f1371d).f14575c.getClass();
        o oVar3 = this.f15431i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj5 : list3) {
            C0725e t10 = AbstractC0842e.t((InterfaceC0588g) oVar3.f15433b.f1372e, ((V) ((AbstractC0793b) obj5)).f7964h);
            Object obj6 = linkedHashMap3.get(t10);
            if (obj6 == null) {
                obj6 = new ArrayList();
                linkedHashMap3.put(t10, obj6);
            }
            ((List) obj6).add(obj5);
        }
        this.f15425c = a(linkedHashMap3);
        this.f15426d = ((C1518i) this.f15431i.f15433b.f1371d).f14573a.b(new l(this, 0));
        this.f15427e = ((C1518i) this.f15431i.f15433b.f1371d).f14573a.b(new l(this, 1));
        this.f15428f = ((C1518i) this.f15431i.f15433b.f1371d).f14573a.c(new l(this, 2));
        o oVar4 = this.f15431i;
        v7.k kVar = ((C1518i) oVar4.f15433b.f1371d).f14573a;
        m mVar = new m(this, oVar4, 0);
        kVar.getClass();
        this.f15429g = new v7.h(kVar, mVar);
        o oVar5 = this.f15431i;
        v7.k kVar2 = ((C1518i) oVar5.f15433b.f1371d).f14573a;
        m mVar2 = new m(this, oVar5, 1);
        kVar2.getClass();
        this.f15430h = new v7.h(kVar2, mVar2);
    }

    public static LinkedHashMap a(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(x.N0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<AbstractC0793b> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC0438m.d0(iterable, 10));
            for (AbstractC0793b abstractC0793b : iterable) {
                int c6 = abstractC0793b.c();
                int f8 = L5.m.f(c6) + c6;
                if (f8 > 4096) {
                    f8 = 4096;
                }
                L5.m j5 = L5.m.j(byteArrayOutputStream, f8);
                j5.v(c6);
                abstractC0793b.f(j5);
                j5.i();
                arrayList.add(y.f7506a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
