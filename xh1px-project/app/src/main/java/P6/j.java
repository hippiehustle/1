package P6;

import f7.C0722b;
import f7.C0723c;
import f7.C0728h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f4565a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f4566b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f4565a = linkedHashMap;
        b(C0728h.f10837x, a("java.util.ArrayList", "java.util.LinkedList"));
        b(C0728h.f10838y, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(C0728h.f10839z, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C0723c c0723c = new C0723c("java.util.function.Function");
        b(new C0722b(c0723c.b(), c0723c.f10797a.f()), a("java.util.function.UnaryOperator"));
        C0723c c0723c2 = new C0723c("java.util.function.BiFunction");
        b(new C0722b(c0723c2.b(), c0723c2.f10797a.f()), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Z5.j(((C0722b) entry.getKey()).a(), ((C0722b) entry.getValue()).a()));
        }
        f4566b = a6.x.R0(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            C0723c c0723c = new C0723c(str);
            arrayList.add(new C0722b(c0723c.b(), c0723c.f10797a.f()));
        }
        return arrayList;
    }

    public static void b(C0722b c0722b, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            f4565a.put(next, c0722b);
        }
    }
}
