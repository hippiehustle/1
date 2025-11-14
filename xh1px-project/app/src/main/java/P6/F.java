package P6;

import a6.AbstractC0425A;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import f7.C0725e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import n7.EnumC1170c;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f4534a;

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f4535b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4536c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f4537d;

    /* renamed from: e, reason: collision with root package name */
    public static final Set f4538e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set f4539f;

    /* renamed from: g, reason: collision with root package name */
    public static final B f4540g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f4541h;

    /* renamed from: i, reason: collision with root package name */
    public static final LinkedHashMap f4542i;
    public static final HashSet j;
    public static final LinkedHashMap k;

    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.Map, java.lang.Object] */
    static {
        Set<String> l12 = AbstractC0434i.l1(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(l12, 10));
        for (String str : l12) {
            String c6 = EnumC1170c.BOOLEAN.c();
            o6.j.d(c6, "getDesc(...)");
            arrayList.add(l.a("java/util/Collection", str, "Ljava/util/Collection;", c6));
        }
        f4534a = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((B) it.next()).f4523e);
        }
        f4535b = arrayList2;
        ArrayList arrayList3 = f4534a;
        ArrayList arrayList4 = new ArrayList(AbstractC0438m.d0(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((B) it2.next()).f4520b.b());
        }
        String concat = "java/util/".concat("Collection");
        EnumC1170c enumC1170c = EnumC1170c.BOOLEAN;
        String c9 = enumC1170c.c();
        o6.j.d(c9, "getDesc(...)");
        B a3 = l.a(concat, "contains", "Ljava/lang/Object;", c9);
        E e9 = E.FALSE;
        Z5.j jVar = new Z5.j(a3, e9);
        String concat2 = "java/util/".concat("Collection");
        String c10 = enumC1170c.c();
        o6.j.d(c10, "getDesc(...)");
        Z5.j jVar2 = new Z5.j(l.a(concat2, "remove", "Ljava/lang/Object;", c10), e9);
        String concat3 = "java/util/".concat("Map");
        String c11 = enumC1170c.c();
        o6.j.d(c11, "getDesc(...)");
        Z5.j jVar3 = new Z5.j(l.a(concat3, "containsKey", "Ljava/lang/Object;", c11), e9);
        String concat4 = "java/util/".concat("Map");
        String c12 = enumC1170c.c();
        o6.j.d(c12, "getDesc(...)");
        Z5.j jVar4 = new Z5.j(l.a(concat4, "containsValue", "Ljava/lang/Object;", c12), e9);
        String concat5 = "java/util/".concat("Map");
        String c13 = enumC1170c.c();
        o6.j.d(c13, "getDesc(...)");
        Z5.j jVar5 = new Z5.j(l.a(concat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", c13), e9);
        Z5.j jVar6 = new Z5.j(l.a("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), E.MAP_GET_OR_DEFAULT);
        B a4 = l.a("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        E e10 = E.NULL;
        Z5.j jVar7 = new Z5.j(a4, e10);
        Z5.j jVar8 = new Z5.j(l.a("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), e10);
        String concat6 = "java/util/".concat("List");
        EnumC1170c enumC1170c2 = EnumC1170c.INT;
        String c14 = enumC1170c2.c();
        o6.j.d(c14, "getDesc(...)");
        B a9 = l.a(concat6, "indexOf", "Ljava/lang/Object;", c14);
        E e11 = E.INDEX;
        Z5.j jVar9 = new Z5.j(a9, e11);
        String concat7 = "java/util/".concat("List");
        String c15 = enumC1170c2.c();
        o6.j.d(c15, "getDesc(...)");
        Map P02 = a6.x.P0(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, new Z5.j(l.a(concat7, "lastIndexOf", "Ljava/lang/Object;", c15), e11));
        f4536c = P02;
        LinkedHashMap linkedHashMap = new LinkedHashMap(a6.x.N0(P02.size()));
        for (Map.Entry entry : P02.entrySet()) {
            linkedHashMap.put(((B) entry.getKey()).f4523e, entry.getValue());
        }
        f4537d = linkedHashMap;
        LinkedHashSet g02 = AbstractC0425A.g0(f4536c.keySet(), f4534a);
        ArrayList arrayList5 = new ArrayList(AbstractC0438m.d0(g02, 10));
        Iterator it3 = g02.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((B) it3.next()).f4520b);
        }
        f4538e = AbstractC0436k.V0(arrayList5);
        ArrayList arrayList6 = new ArrayList(AbstractC0438m.d0(g02, 10));
        Iterator it4 = g02.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((B) it4.next()).f4523e);
        }
        f4539f = AbstractC0436k.V0(arrayList6);
        EnumC1170c enumC1170c3 = EnumC1170c.INT;
        String c16 = enumC1170c3.c();
        o6.j.d(c16, "getDesc(...)");
        B a10 = l.a("java/util/List", "removeAt", c16, "Ljava/lang/Object;");
        f4540g = a10;
        String concat8 = "java/lang/".concat("Number");
        String c17 = EnumC1170c.BYTE.c();
        o6.j.d(c17, "getDesc(...)");
        Z5.j jVar10 = new Z5.j(l.a(concat8, "toByte", "", c17), C0725e.e("byteValue"));
        String concat9 = "java/lang/".concat("Number");
        String c18 = EnumC1170c.SHORT.c();
        o6.j.d(c18, "getDesc(...)");
        Z5.j jVar11 = new Z5.j(l.a(concat9, "toShort", "", c18), C0725e.e("shortValue"));
        String concat10 = "java/lang/".concat("Number");
        String c19 = enumC1170c3.c();
        o6.j.d(c19, "getDesc(...)");
        Z5.j jVar12 = new Z5.j(l.a(concat10, "toInt", "", c19), C0725e.e("intValue"));
        String concat11 = "java/lang/".concat("Number");
        String c20 = EnumC1170c.LONG.c();
        o6.j.d(c20, "getDesc(...)");
        Z5.j jVar13 = new Z5.j(l.a(concat11, "toLong", "", c20), C0725e.e("longValue"));
        String concat12 = "java/lang/".concat("Number");
        String c21 = EnumC1170c.FLOAT.c();
        o6.j.d(c21, "getDesc(...)");
        Z5.j jVar14 = new Z5.j(l.a(concat12, "toFloat", "", c21), C0725e.e("floatValue"));
        String concat13 = "java/lang/".concat("Number");
        String c22 = EnumC1170c.DOUBLE.c();
        o6.j.d(c22, "getDesc(...)");
        Z5.j jVar15 = new Z5.j(l.a(concat13, "toDouble", "", c22), C0725e.e("doubleValue"));
        Z5.j jVar16 = new Z5.j(a10, C0725e.e("remove"));
        String concat14 = "java/lang/".concat("CharSequence");
        String c23 = enumC1170c3.c();
        o6.j.d(c23, "getDesc(...)");
        String c24 = EnumC1170c.CHAR.c();
        o6.j.d(c24, "getDesc(...)");
        Map P03 = a6.x.P0(jVar10, jVar11, jVar12, jVar13, jVar14, jVar15, jVar16, new Z5.j(l.a(concat14, "get", c23, c24), C0725e.e("charAt")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), C0725e.e("get")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "store", "I", "V"), C0725e.e("set")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), C0725e.e("getAndSet")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), C0725e.e("getAndAdd")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), C0725e.e("addAndGet")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), C0725e.e("get")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "store", "J", "V"), C0725e.e("set")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), C0725e.e("getAndSet")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), C0725e.e("getAndAdd")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), C0725e.e("addAndGet")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), C0725e.e("get")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "store", "Z", "V"), C0725e.e("set")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), C0725e.e("getAndSet")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", "Ljava/lang/Object;"), C0725e.e("get")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicReference"), "store", "Ljava/lang/Object;", "V"), C0725e.e("set")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), C0725e.e("getAndSet")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), C0725e.e("get")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), C0725e.e("set")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), C0725e.e("getAndSet")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), C0725e.e("compareAndSet")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), C0725e.e("getAndAdd")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), C0725e.e("addAndGet")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), C0725e.e("get")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), C0725e.e("set")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), C0725e.e("getAndSet")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), C0725e.e("compareAndSet")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), C0725e.e("getAndAdd")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), C0725e.e("addAndGet")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), C0725e.e("get")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), C0725e.e("set")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), C0725e.e("getAndSet")), new Z5.j(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), C0725e.e("compareAndSet")));
        f4541h = P03;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a6.x.N0(P03.size()));
        for (Map.Entry entry2 : P03.entrySet()) {
            linkedHashMap2.put(((B) entry2.getKey()).f4523e, entry2.getValue());
        }
        f4542i = linkedHashMap2;
        ?? r02 = f4541h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r02.entrySet()) {
            B b4 = (B) entry3.getKey();
            C0725e c0725e = (C0725e) entry3.getValue();
            String str2 = b4.f4519a;
            String str3 = b4.f4521c;
            String str4 = b4.f4522d;
            o6.j.e(str2, "classInternalName");
            o6.j.e(c0725e, "name");
            String str5 = c0725e + '(' + str3 + ')' + str4;
            o6.j.e(str5, "jvmDescriptor");
            linkedHashSet.add(str2 + '.' + str5);
        }
        Set keySet = f4541h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = keySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((B) it5.next()).f4520b);
        }
        j = hashSet;
        Set<Map.Entry> entrySet = f4541h.entrySet();
        ArrayList arrayList7 = new ArrayList(AbstractC0438m.d0(entrySet, 10));
        for (Map.Entry entry4 : entrySet) {
            arrayList7.add(new Z5.j(((B) entry4.getKey()).f4520b, entry4.getValue()));
        }
        int N02 = a6.x.N0(AbstractC0438m.d0(arrayList7, 10));
        if (N02 < 16) {
            N02 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(N02);
        Iterator it6 = arrayList7.iterator();
        while (it6.hasNext()) {
            Z5.j jVar17 = (Z5.j) it6.next();
            linkedHashMap3.put((C0725e) jVar17.f7486e, (C0725e) jVar17.f7485d);
        }
        k = linkedHashMap3;
    }
}
