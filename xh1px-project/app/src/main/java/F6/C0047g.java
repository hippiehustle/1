package F6;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import L7.C0165x;
import a6.AbstractC0434i;
import g7.AbstractC0794c;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import n6.InterfaceC1162a;
import s7.C1518i;
import w6.C1710B;
import w6.C1737y;
import w6.y0;
import w7.AbstractC1759v;

/* renamed from: F6.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047g implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1526d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1527e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1528f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1529g;

    public /* synthetic */ C0047g(Object obj, Object obj2, Object obj3, int i4) {
        this.f1526d = i4;
        this.f1527e = obj;
        this.f1528f = obj2;
        this.f1529g = obj3;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f1526d) {
            case 0:
                return new C0048h((AbstractC0049i) this.f1529g, (v7.n) this.f1527e, (C6.P) this.f1528f);
            case 1:
                return ((AbstractC0794c) ((g7.v) this.f1527e)).b((ByteArrayInputStream) this.f1528f, ((C1518i) ((u7.o) this.f1529g).f15433b.f1371d).f14586p);
            default:
                AbstractC1759v abstractC1759v = (AbstractC1759v) this.f1527e;
                C1737y c1737y = (C1737y) this.f1528f;
                C1710B c1710b = (C1710B) this.f1529g;
                InterfaceC0007h c6 = abstractC1759v.B0().c();
                if (c6 instanceof InterfaceC0004e) {
                    Class k = y0.k((InterfaceC0004e) c6);
                    if (k != null) {
                        Class cls = c1710b.f15784e;
                        if (o6.j.a(cls.getSuperclass(), k)) {
                            Type genericSuperclass = cls.getGenericSuperclass();
                            o6.j.b(genericSuperclass);
                            return genericSuperclass;
                        }
                        Class<?>[] interfaces = cls.getInterfaces();
                        o6.j.d(interfaces, "getInterfaces(...)");
                        int Z02 = AbstractC0434i.Z0(k, interfaces);
                        if (Z02 >= 0) {
                            Type type = cls.getGenericInterfaces()[Z02];
                            o6.j.b(type);
                            return type;
                        }
                        throw new C0165x("No superclass of " + c1737y + " in Java reflection for " + c6);
                    }
                    throw new C0165x("Unsupported superclass of " + c1737y + ": " + c6);
                }
                throw new C0165x("Supertype not a class: " + c6);
        }
    }

    public C0047g(AbstractC0049i abstractC0049i, v7.n nVar, C6.P p8) {
        this.f1526d = 0;
        this.f1529g = abstractC0049i;
        this.f1527e = nVar;
        this.f1528f = p8;
    }
}
