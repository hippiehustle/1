package f7;

import a6.AbstractC0425A;
import a6.AbstractC0434i;
import a6.AbstractC0438m;
import a6.x;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import o6.j;
import q4.X;

/* renamed from: f7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728h {

    /* renamed from: A, reason: collision with root package name */
    public static final C0722b f10815A;

    /* renamed from: a, reason: collision with root package name */
    public static final C0723c f10816a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0723c f10817b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0723c f10818c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0723c f10819d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0723c f10820e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0723c f10821f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0723c f10822g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0723c f10823h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0722b f10824i;
    public static final C0722b j;
    public static final C0722b k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0722b f10825l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0722b f10826m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0722b f10827n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0722b f10828o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0722b f10829p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0722b f10830q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0722b f10831r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0722b f10832s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0722b f10833t;

    /* renamed from: u, reason: collision with root package name */
    public static final C0722b f10834u;

    /* renamed from: v, reason: collision with root package name */
    public static final Set f10835v;

    /* renamed from: w, reason: collision with root package name */
    public static final Set f10836w;

    /* renamed from: x, reason: collision with root package name */
    public static final C0722b f10837x;

    /* renamed from: y, reason: collision with root package name */
    public static final C0722b f10838y;

    /* renamed from: z, reason: collision with root package name */
    public static final C0722b f10839z;

    static {
        C0723c c0723c = new C0723c("kotlin");
        f10816a = c0723c;
        C0723c a3 = c0723c.a(C0725e.e("reflect"));
        f10817b = a3;
        c0723c.a(C0725e.e("experimental"));
        C0723c a4 = c0723c.a(C0725e.e("collections"));
        f10818c = a4;
        c0723c.a(C0725e.e("sequences"));
        C0723c a9 = c0723c.a(C0725e.e("ranges"));
        f10819d = a9;
        C0723c a10 = c0723c.a(C0725e.e("jvm"));
        c0723c.a(C0725e.e("js"));
        c0723c.a(C0725e.e("annotations")).a(C0725e.e("jvm"));
        a10.a(C0725e.e("internal"));
        a10.a(C0725e.e("functions"));
        C0723c a11 = c0723c.a(C0725e.e("annotation"));
        f10820e = a11;
        C0723c a12 = c0723c.a(C0725e.e("internal"));
        a12.a(C0725e.e("ir"));
        C0723c a13 = c0723c.a(C0725e.e("coroutines"));
        f10821f = a13;
        a13.a(C0725e.e("intrinsics"));
        f10822g = c0723c.a(C0725e.e("enums"));
        c0723c.a(C0725e.e("contracts"));
        C0723c a14 = c0723c.a(C0725e.e("concurrent")).a(C0725e.e("atomics"));
        f10823h = a14;
        c0723c.a(C0725e.e("test"));
        c0723c.a(C0725e.e("text"));
        AbstractC0434i.l1(new C0723c[]{c0723c, a4, a9, a11});
        AbstractC0434i.l1(new C0723c[]{c0723c, a4, a9, a11, a3, a12, a13, a14});
        X.b("Nothing");
        f10824i = X.b("Unit");
        j = X.b("Any");
        k = X.b("Enum");
        X.b("Annotation");
        f10825l = X.b("Array");
        C0722b b4 = X.b("Boolean");
        f10826m = b4;
        C0722b b9 = X.b("Char");
        C0722b b10 = X.b("Byte");
        C0722b b11 = X.b("Short");
        C0722b b12 = X.b("Int");
        f10827n = b12;
        C0722b b13 = X.b("Long");
        f10828o = b13;
        C0722b b14 = X.b("Float");
        C0722b b15 = X.b("Double");
        f10829p = X.h(b10);
        f10830q = X.h(b11);
        f10831r = X.h(b12);
        f10832s = X.h(b13);
        X.b("CharSequence");
        f10833t = X.b("String");
        X.b("Throwable");
        X.b("Cloneable");
        X.g("KProperty");
        X.g("KMutableProperty");
        X.g("KProperty0");
        X.g("KMutableProperty0");
        X.g("KProperty1");
        X.g("KMutableProperty1");
        X.g("KProperty2");
        X.g("KMutableProperty2");
        f10834u = X.g("KFunction");
        X.g("KClass");
        X.g("KCallable");
        X.g("KType");
        X.b("Comparable");
        X.b("Number");
        X.b("Function");
        Set l12 = AbstractC0434i.l1(new C0722b[]{b4, b9, b10, b11, b12, b13, b14, b15});
        f10835v = l12;
        AbstractC0434i.l1(new C0722b[]{b10, b11, b12, b13});
        int N02 = x.N0(AbstractC0438m.d0(l12, 10));
        int i4 = 16;
        if (N02 < 16) {
            N02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(N02);
        for (Object obj : l12) {
            linkedHashMap.put(obj, X.f(((C0722b) obj).f()));
        }
        X.e(linkedHashMap);
        Set l13 = AbstractC0434i.l1(new C0722b[]{f10829p, f10830q, f10831r, f10832s});
        f10836w = l13;
        int N03 = x.N0(AbstractC0438m.d0(l13, 10));
        if (N03 >= 16) {
            i4 = N03;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i4);
        for (Object obj2 : l13) {
            linkedHashMap2.put(obj2, X.f(((C0722b) obj2).f()));
        }
        X.e(linkedHashMap2);
        Set set = f10835v;
        Set set2 = f10836w;
        LinkedHashSet g02 = AbstractC0425A.g0(set, set2);
        C0722b c0722b = f10833t;
        AbstractC0425A.h0(g02, c0722b);
        C0723c c0723c2 = f10821f;
        C0725e e9 = C0725e.e("Continuation");
        j.e(c0723c2, "packageFqName");
        C0723c c0723c3 = C0723c.f10796c;
        E2.d.U(e9).f10797a.c();
        X.c("Iterator");
        X.c("Iterable");
        X.c("Collection");
        X.c("List");
        X.c("ListIterator");
        X.c("Set");
        C0722b c6 = X.c("Map");
        X.c("AbstractMap");
        X.c("MutableIterator");
        X.c("CharIterator");
        X.c("MutableIterable");
        X.c("MutableCollection");
        f10837x = X.c("MutableList");
        X.c("MutableListIterator");
        f10838y = X.c("MutableSet");
        C0722b c9 = X.c("MutableMap");
        f10839z = c9;
        c6.d(C0725e.e("Entry"));
        c9.d(C0725e.e("MutableEntry"));
        X.b("Result");
        C0723c c0723c4 = f10819d;
        C0725e e10 = C0725e.e("IntRange");
        j.e(c0723c4, "packageFqName");
        E2.d.U(e10).f10797a.c();
        C0725e e11 = C0725e.e("LongRange");
        j.e(c0723c4, "packageFqName");
        E2.d.U(e11).f10797a.c();
        C0725e e12 = C0725e.e("CharRange");
        j.e(c0723c4, "packageFqName");
        E2.d.U(e12).f10797a.c();
        C0723c c0723c5 = f10820e;
        C0725e e13 = C0725e.e("AnnotationRetention");
        j.e(c0723c5, "packageFqName");
        E2.d.U(e13).f10797a.c();
        C0725e e14 = C0725e.e("AnnotationTarget");
        j.e(c0723c5, "packageFqName");
        E2.d.U(e14).f10797a.c();
        X.b("DeprecationLevel");
        f10815A = new C0722b(f10822g, C0725e.e("EnumEntries"));
        C0722b a15 = X.a("AtomicBoolean");
        C0722b a16 = X.a("AtomicInt");
        C0722b a17 = X.a("AtomicLong");
        X.a("AtomicReference");
        Z5.j jVar = new Z5.j(f10826m, a15);
        C0722b c0722b2 = f10827n;
        Z5.j jVar2 = new Z5.j(c0722b2, a16);
        C0722b c0722b3 = f10828o;
        x.P0(jVar, jVar2, new Z5.j(c0722b3, a17));
        X.a("AtomicArray");
        x.P0(new Z5.j(c0722b2, X.a("AtomicIntArray")), new Z5.j(c0722b3, X.a("AtomicLongArray")));
        AbstractC0425A.h0(AbstractC0425A.h0(AbstractC0425A.h0(AbstractC0425A.h0(AbstractC0425A.g0(set, set2), c0722b), f10824i), j), k);
    }
}
