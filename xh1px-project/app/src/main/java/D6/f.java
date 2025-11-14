package D6;

import C6.A;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import F6.C;
import F6.y;
import f7.C0723c;
import f7.C0725e;
import n6.InterfaceC1163b;
import p7.C1329k;

/* loaded from: classes.dex */
public final class f implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1036d;

    /* renamed from: e, reason: collision with root package name */
    public final z6.h f1037e;

    public /* synthetic */ f(z6.h hVar, int i4) {
        this.f1036d = i4;
        this.f1037e = hVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f1036d) {
            case 0:
                A a3 = (A) obj;
                o6.j.e(a3, "module");
                return a3.o().h(this.f1037e.v());
            default:
                C0725e c0725e = (C0725e) obj;
                C l6 = this.f1037e.l();
                C0723c c0723c = z6.n.k;
                C1329k c1329k = ((y) l6.U(c0723c)).k;
                if (c1329k != null) {
                    InterfaceC0007h d2 = c1329k.d(c0725e, K6.b.f2730d);
                    if (d2 != null) {
                        if (d2 instanceof InterfaceC0004e) {
                            return (InterfaceC0004e) d2;
                        }
                        throw new AssertionError("Must be a class descriptor " + c0725e + ", but was " + d2);
                    }
                    throw new AssertionError("Built-in class " + c0723c.a(c0725e) + " is not found");
                }
                z6.h.a(11);
                throw null;
        }
    }
}
