package T4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import O7.V;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import q2.C1365k;
import z3.EnumC1855a;

/* loaded from: classes.dex */
public final class e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f5763h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f5763h = kVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        e eVar = (e) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        eVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new e(this.f5763h, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        k kVar = this.f5763h;
        C1365k c1365k = kVar.f5779f;
        Q7.d dVar = kVar.k;
        A3.a aVar = kVar.f5780g;
        if (kVar.f5786o.f5791b && !kVar.f5778e.a()) {
            if (aVar.f277c.f() == EnumC1855a.f16626d) {
                kVar.f5784m = V.s(new A4.c(aVar.f278d, aVar.f277c, new g(kVar, null), 27), dVar);
            } else {
                AbstractC0166y.q(dVar, null, null, new i(kVar, null), 3);
            }
        } else if (!kVar.f5786o.f5791b && !((Boolean) c1365k.k.f()).booleanValue()) {
            c1365k.a();
        }
        return y.f7506a;
    }
}
