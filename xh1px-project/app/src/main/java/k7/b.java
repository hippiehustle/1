package k7;

import C6.A;
import C6.InterfaceC0007h;
import java.util.List;
import n6.InterfaceC1163b;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public class b extends g {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1163b f12140b;

    public b(List list, InterfaceC1163b interfaceC1163b) {
        super(list);
        this.f12140b = interfaceC1163b;
    }

    @Override // k7.g
    public final AbstractC1759v a(A a3) {
        o6.j.e(a3, "module");
        AbstractC1759v abstractC1759v = (AbstractC1759v) this.f12140b.m(a3);
        if (!z6.h.z(abstractC1759v)) {
            InterfaceC0007h c6 = abstractC1759v.B0().c();
            if (c6 != null && z6.h.s(c6) != null) {
                return abstractC1759v;
            }
            if (!z6.h.C(abstractC1759v, z6.m.f16759W.f10797a) && !z6.h.C(abstractC1759v, z6.m.f16760X.f10797a) && !z6.h.C(abstractC1759v, z6.m.Y.f10797a)) {
                z6.h.C(abstractC1759v, z6.m.f16761Z.f10797a);
            }
        }
        return abstractC1759v;
    }
}
