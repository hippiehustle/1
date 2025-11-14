package P6;

import a6.AbstractC0436k;
import a6.AbstractC0438m;
import f7.C0722b;
import f7.C0723c;
import f7.C0724d;
import f7.C0725e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: P6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0283f {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4560a;

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f4561b;

    /* renamed from: c, reason: collision with root package name */
    public static final Set f4562c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f4563d;

    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.Map, java.lang.Object] */
    static {
        C0724d c0724d = z6.m.j;
        Z5.j jVar = new Z5.j(c0724d.a(C0725e.e("name")).g(), z6.n.f16796d);
        Z5.j jVar2 = new Z5.j(c0724d.a(C0725e.e("ordinal")).g(), C0725e.e("ordinal"));
        Z5.j jVar3 = new Z5.j(E2.b.a(z6.m.f16740C, "size"), C0725e.e("size"));
        C0723c c0723c = z6.m.f16744G;
        Map P02 = a6.x.P0(jVar, jVar2, jVar3, new Z5.j(E2.b.a(c0723c, "size"), C0725e.e("size")), new Z5.j(z6.m.f16770e.a(C0725e.e("length")).g(), C0725e.e("length")), new Z5.j(E2.b.a(c0723c, "keys"), C0725e.e("keySet")), new Z5.j(E2.b.a(c0723c, "values"), C0725e.e("values")), new Z5.j(E2.b.a(c0723c, "entries"), C0725e.e("entrySet")), new Z5.j(E2.b.a(z6.m.f16763a0, "size"), C0725e.e("length")), new Z5.j(E2.b.a(z6.m.f16765b0, "size"), C0725e.e("length")), new Z5.j(E2.b.a(z6.m.f16767c0, "size"), C0725e.e("length")));
        f4560a = P02;
        Set<Map.Entry> entrySet = P02.entrySet();
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new Z5.j(((C0723c) entry.getKey()).f10797a.f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Z5.j jVar4 = (Z5.j) it.next();
            C0725e c0725e = (C0725e) jVar4.f7486e;
            Object obj = linkedHashMap.get(c0725e);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c0725e, obj);
            }
            ((List) obj).add((C0725e) jVar4.f7485d);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a6.x.N0(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            o6.j.e(iterable, "<this>");
            linkedHashMap2.put(key, AbstractC0436k.Q0(AbstractC0436k.U0(iterable)));
        }
        f4561b = linkedHashMap2;
        ?? r02 = f4560a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r02.entrySet()) {
            String str = B6.d.f457a;
            C0722b f8 = B6.d.f(((C0723c) entry3.getKey()).b().f10797a);
            o6.j.b(f8);
            linkedHashSet.add(f8.a().a((C0725e) entry3.getValue()));
        }
        Set keySet = f4560a.keySet();
        f4562c = keySet;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(keySet, 10));
        Iterator it2 = keySet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C0723c) it2.next()).f10797a.f());
        }
        f4563d = AbstractC0436k.V0(arrayList2);
    }
}
