package K3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class p extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2701h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f2702i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2702i = sVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        p pVar = (p) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        pVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        p pVar = new p(this.f2702i, interfaceC0617c);
        pVar.f2701h = obj;
        return pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f2701h;
        Z5.a.d(obj);
        s sVar = this.f2702i;
        AbstractC0166y.q(interfaceC0163v, null, null, new C0098l(sVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new m(sVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new n(sVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new o(sVar, null), 3);
        return Z5.y.f7506a;
    }
}
