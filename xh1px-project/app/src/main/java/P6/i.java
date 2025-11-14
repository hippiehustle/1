package P6;

import C6.InterfaceC0001b;
import C6.InterfaceC0004e;
import F6.N;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import i7.C0895j;
import i7.C0896k;
import i7.InterfaceC0891f;
import java.util.List;
import n1.AbstractC1149a;
import w7.AbstractC1759v;
import w7.Q;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class i implements InterfaceC0891f {
    @Override // i7.InterfaceC0891f
    public final int a() {
        return 2;
    }

    @Override // i7.InterfaceC0891f
    public final int b(InterfaceC0001b interfaceC0001b, InterfaceC0001b interfaceC0001b2, InterfaceC0004e interfaceC0004e) {
        int i4;
        AbstractC1759v abstractC1759v;
        o6.j.e(interfaceC0001b, "superDescriptor");
        o6.j.e(interfaceC0001b2, "subDescriptor");
        if (interfaceC0001b2 instanceof R6.f) {
            R6.f fVar = (R6.f) interfaceC0001b2;
            if (fVar.getTypeParameters().isEmpty()) {
                C0895j i8 = C0896k.i(interfaceC0001b, interfaceC0001b2);
                if (i8 != null) {
                    i4 = i8.b();
                } else {
                    i4 = 0;
                }
                if (i4 == 0) {
                    List z02 = fVar.z0();
                    o6.j.d(z02, "getValueParameters(...)");
                    H7.t W7 = H7.m.W(AbstractC0436k.k0(z02), C0281d.f4556h);
                    AbstractC1759v abstractC1759v2 = fVar.k;
                    o6.j.b(abstractC1759v2);
                    H7.h S8 = H7.m.S(AbstractC0434i.L0(new H7.k[]{W7, new H7.p(1, abstractC1759v2)}));
                    F6.w wVar = fVar.f1589m;
                    if (wVar != null) {
                        abstractC1759v = wVar.b();
                    } else {
                        abstractC1759v = null;
                    }
                    H7.f fVar2 = new H7.f(H7.m.S(AbstractC0434i.L0(new H7.k[]{S8, AbstractC0436k.k0(AbstractC0437l.Y(abstractC1759v))})));
                    while (fVar2.hasNext()) {
                        AbstractC1759v abstractC1759v3 = (AbstractC1759v) fVar2.next();
                        if (!abstractC1759v3.r0().isEmpty() && !(abstractC1759v3.H0() instanceof U6.h)) {
                            return 3;
                        }
                    }
                    InterfaceC0001b interfaceC0001b3 = (InterfaceC0001b) interfaceC0001b.f(new Q(new U6.f()));
                    if (interfaceC0001b3 != null) {
                        if (interfaceC0001b3 instanceof N) {
                            N n3 = (N) interfaceC0001b3;
                            if (!n3.getTypeParameters().isEmpty()) {
                                interfaceC0001b3 = n3.s0().e().build();
                                o6.j.b(interfaceC0001b3);
                            }
                        }
                        int b4 = C0896k.f11782c.n(interfaceC0001b3, interfaceC0001b2, false).b();
                        AbstractC1149a.n("getResult(...)", b4);
                        if (h.f4564a[AbstractC1769h.b(b4)] == 1) {
                            return 1;
                        }
                        return 3;
                    }
                    return 3;
                }
                return 3;
            }
            return 3;
        }
        return 3;
    }
}
