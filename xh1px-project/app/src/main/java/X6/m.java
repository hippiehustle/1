package X6;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final e f7017a = new e(h.f7005e, false);

    /* renamed from: b, reason: collision with root package name */
    public static final e f7018b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f7019c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f7020d;

    static {
        h hVar = h.f7006f;
        f7018b = new e(hVar, false);
        f7019c = new e(hVar, true);
        String concat = "java/lang/".concat("Object");
        String concat2 = "java/util/function/".concat("Predicate");
        String concat3 = "java/util/function/".concat("Function");
        String concat4 = "java/util/function/".concat("Consumer");
        String concat5 = "java/util/function/".concat("BiFunction");
        String concat6 = "java/util/function/".concat("BiConsumer");
        String concat7 = "java/util/function/".concat("UnaryOperator");
        String concat8 = "java/util/".concat("stream/Stream");
        String concat9 = "java/util/".concat("Optional");
        q qVar = new q(0);
        new R3.r(qVar, "java/util/".concat("Iterator")).Q("forEachRemaining", null, new j(concat4, 0));
        new R3.r(qVar, "java/lang/".concat("Iterable")).Q("spliterator", null, new o(4));
        R3.r rVar = new R3.r(qVar, "java/util/".concat("Collection"));
        rVar.Q("removeIf", null, new j(concat2, 17));
        rVar.Q("stream", null, new j(concat8, 26));
        rVar.Q("parallelStream", null, new l(concat8, 1));
        R3.r rVar2 = new R3.r(qVar, "java/util/".concat("List"));
        rVar2.Q("replaceAll", null, new l(concat7, 2));
        rVar2.Q("addFirst", "2.1", new l(concat, 3));
        rVar2.Q("addLast", "2.1", new l(concat, 4));
        rVar2.Q("removeFirst", "2.1", new l(concat, 5));
        rVar2.Q("removeLast", "2.1", new l(concat, 6));
        R3.r rVar3 = new R3.r(qVar, "java/util/".concat("LinkedList"));
        rVar3.Q("addFirst", "2.1", new j(concat, 1));
        rVar3.Q("addLast", "2.1", new j(concat, 2));
        rVar3.Q("removeFirst", "2.1", new j(concat, 3));
        rVar3.Q("removeLast", "2.1", new j(concat, 4));
        R3.r rVar4 = new R3.r(qVar, "java/util/".concat("LinkedHashSet"));
        rVar4.Q("addFirst", "2.2", new j(concat, 5));
        rVar4.Q("addLast", "2.2", new j(concat, 6));
        rVar4.Q("removeFirst", "2.2", new j(concat, 7));
        rVar4.Q("removeLast", "2.2", new j(concat, 8));
        rVar4.Q("getFirst", "2.2", new j(concat, 9));
        rVar4.Q("getLast", "2.2", new j(concat, 10));
        R3.r rVar5 = new R3.r(qVar, "java/util/".concat("Map"));
        rVar5.Q("forEach", null, new j(concat6, 11));
        rVar5.Q("putIfAbsent", null, new j(concat, 12));
        rVar5.Q("replace", null, new j(concat, 13));
        rVar5.Q("replace", null, new j(concat, 14));
        rVar5.Q("replaceAll", null, new j(concat5, 15));
        rVar5.Q("compute", null, new k(0, concat, concat5));
        rVar5.Q("computeIfAbsent", null, new k(1, concat, concat3));
        rVar5.Q("computeIfPresent", null, new k(2, concat, concat5));
        rVar5.Q("merge", null, new k(3, concat, concat5));
        R3.r rVar6 = new R3.r(qVar, "java/util/".concat("LinkedHashMap"));
        rVar6.Q("putFirst", "2.2", new j(concat, 16));
        rVar6.Q("putLast", "2.2", new j(concat, 18));
        R3.r rVar7 = new R3.r(qVar, concat9);
        rVar7.Q("empty", null, new j(concat9, 19));
        rVar7.Q("of", null, new k(4, concat, concat9));
        rVar7.Q("ofNullable", null, new k(5, concat, concat9));
        rVar7.Q("get", null, new j(concat, 20));
        rVar7.Q("ifPresent", null, new j(concat4, 21));
        new R3.r(qVar, "java/lang/".concat("ref/Reference")).Q("get", null, new j(concat, 22));
        new R3.r(qVar, concat2).Q("test", null, new j(concat, 23));
        new R3.r(qVar, "java/util/function/".concat("BiPredicate")).Q("test", null, new j(concat, 24));
        new R3.r(qVar, concat4).Q("accept", null, new j(concat, 25));
        new R3.r(qVar, concat6).Q("accept", null, new j(concat, 27));
        new R3.r(qVar, concat3).Q("apply", null, new j(concat, 28));
        new R3.r(qVar, concat5).Q("apply", null, new j(concat, 29));
        new R3.r(qVar, "java/util/function/".concat("Supplier")).Q("get", null, new l(concat, 0));
        f7020d = qVar.f7033a;
    }
}
