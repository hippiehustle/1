package w6;

import C6.InterfaceC0019u;
import I6.AbstractC0065d;
import h7.C0845h;
import java.lang.reflect.Method;
import n6.InterfaceC1163b;
import t0.C1536c;
import w7.AbstractC1759v;

/* renamed from: w6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1715b implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public static final C1715b f15836e = new C1715b(0);

    /* renamed from: f, reason: collision with root package name */
    public static final C1715b f15837f = new C1715b(1);

    /* renamed from: g, reason: collision with root package name */
    public static final C1715b f15838g = new C1715b(2);

    /* renamed from: h, reason: collision with root package name */
    public static final C1715b f15839h = new C1715b(3);

    /* renamed from: i, reason: collision with root package name */
    public static final C1715b f15840i = new C1715b(4);
    public static final C1715b j = new C1715b(5);
    public static final C1715b k = new C1715b(6);

    /* renamed from: l, reason: collision with root package name */
    public static final C1715b f15841l = new C1715b(7);

    /* renamed from: m, reason: collision with root package name */
    public static final C1715b f15842m = new C1715b(8);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15843d;

    public /* synthetic */ C1715b(int i4) {
        this.f15843d = i4;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f15843d) {
            case 0:
                Class cls = (Class) obj;
                C1536c c1536c = AbstractC1716c.f15845a;
                o6.j.e(cls, "it");
                return new C1710B(cls);
            case 1:
                Class cls2 = (Class) obj;
                C1536c c1536c2 = AbstractC1716c.f15845a;
                o6.j.e(cls2, "it");
                return new T(cls2);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                Class<?> returnType = ((Method) obj).getReturnType();
                o6.j.d(returnType, "getReturnType(...)");
                return AbstractC0065d.b(returnType);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                Class cls3 = (Class) obj;
                o6.j.b(cls3);
                return AbstractC0065d.b(cls3);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                C6.M m6 = (C6.M) obj;
                I7.k kVar = F.f15791d;
                o6.j.e(m6, "descriptor");
                return C0845h.f11448e.u(m6) + " | " + w0.b(m6).a();
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0019u interfaceC0019u = (InterfaceC0019u) obj;
                I7.k kVar2 = F.f15791d;
                o6.j.e(interfaceC0019u, "descriptor");
                return C0845h.f11448e.u(interfaceC0019u) + " | " + w0.c(interfaceC0019u).b();
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                C0845h c0845h = v0.f15919a;
                AbstractC1759v b4 = ((F6.U) obj).b();
                o6.j.d(b4, "getType(...)");
                return v0.d(b4);
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                C0845h c0845h2 = v0.f15919a;
                AbstractC1759v b9 = ((F6.U) obj).b();
                o6.j.d(b9, "getType(...)");
                return v0.d(b9);
            default:
                Class cls4 = (Class) obj;
                o6.j.b(cls4);
                return AbstractC0065d.b(cls4);
        }
    }
}
