package R3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class k extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5062h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f5063i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f5063i = nVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        k kVar = (k) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        kVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        k kVar = new k(this.f5063i, interfaceC0617c);
        kVar.f5062h = obj;
        return kVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f5062h;
        Z5.a.d(obj);
        n nVar = this.f5063i;
        AbstractC0166y.q(interfaceC0163v, null, null, new f(nVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new g(nVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new h(nVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new i(nVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new j(nVar, null), 3);
        return Z5.y.f7506a;
    }
}
