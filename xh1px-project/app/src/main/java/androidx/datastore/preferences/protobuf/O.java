package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: c, reason: collision with root package name */
    public static final O f8627c = new O();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f8629b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final B f8628a = new B();

    public final S a(Class cls) {
        S w8;
        Class cls2;
        AbstractC0486w.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f8629b;
        S s8 = (S) concurrentHashMap.get(cls);
        if (s8 == null) {
            B b4 = this.f8628a;
            b4.getClass();
            Class cls3 = T.f8637a;
            if (!AbstractC0484u.class.isAssignableFrom(cls) && (cls2 = T.f8637a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            Q a3 = ((A) b4.f8597a).a(cls);
            int i4 = a3.f8636d;
            AbstractC0465a abstractC0465a = a3.f8633a;
            if ((i4 & 2) == 2) {
                if (AbstractC0484u.class.isAssignableFrom(cls)) {
                    w8 = new K(T.f8639c, AbstractC0479o.f8719a, abstractC0465a);
                } else {
                    Y y4 = T.f8638b;
                    C0478n c0478n = AbstractC0479o.f8720b;
                    if (c0478n != null) {
                        w8 = new K(y4, c0478n, abstractC0465a);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
            } else if (AbstractC0484u.class.isAssignableFrom(cls)) {
                C0478n c0478n2 = null;
                L l6 = M.f8626b;
                C0488y c0488y = AbstractC0489z.f8755b;
                a0 a0Var = T.f8639c;
                if (AbstractC1769h.b(a3.a()) != 1) {
                    c0478n2 = AbstractC0479o.f8719a;
                }
                C0478n c0478n3 = c0478n2;
                F f8 = G.f8606b;
                int[] iArr = J.f8609n;
                if (a3 instanceof Q) {
                    w8 = J.w(a3, l6, c0488y, a0Var, c0478n3, f8);
                } else {
                    a3.getClass();
                    throw new ClassCastException();
                }
            } else {
                C0478n c0478n4 = null;
                L l8 = M.f8625a;
                C0488y c0488y2 = AbstractC0489z.f8754a;
                Y y5 = T.f8638b;
                if (AbstractC1769h.b(a3.a()) == 1 || (c0478n4 = AbstractC0479o.f8720b) != null) {
                    C0478n c0478n5 = c0478n4;
                    F f9 = G.f8605a;
                    int[] iArr2 = J.f8609n;
                    if (a3 instanceof Q) {
                        w8 = J.w(a3, l8, c0488y2, y5, c0478n5, f9);
                    } else {
                        a3.getClass();
                        throw new ClassCastException();
                    }
                } else {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            }
            S s9 = (S) concurrentHashMap.putIfAbsent(cls, w8);
            if (s9 != null) {
                return s9;
            }
            return w8;
        }
        return s8;
    }
}
