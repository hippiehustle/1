package w6;

import java.util.concurrent.ConcurrentHashMap;
import n6.InterfaceC1163b;
import t0.C1536c;

/* renamed from: w6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1716c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1536c f15845a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1536c f15846b;

    static {
        C1715b c1715b = C1715b.f15836e;
        int i4 = AbstractC1714a.f15833a;
        f15845a = new C1536c((InterfaceC1163b) c1715b);
        f15846b = new C1536c((InterfaceC1163b) C1715b.f15837f);
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static final C1710B a(Class cls) {
        Object putIfAbsent;
        o6.j.e(cls, "jClass");
        C1536c c1536c = f15845a;
        c1536c.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c1536c.f14809f;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(cls, (obj = ((InterfaceC1163b) c1536c.f14808e).m(cls)))) != null) {
            obj = putIfAbsent;
        }
        o6.j.c(obj, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (C1710B) obj;
    }
}
