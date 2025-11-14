package V4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class i extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6390h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f6391i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6391i = kVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        i iVar = (i) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        iVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        i iVar = new i(this.f6391i, interfaceC0617c);
        iVar.f6390h = obj;
        return iVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f6390h;
        Z5.a.d(obj);
        k kVar = this.f6391i;
        AbstractC0166y.q(interfaceC0163v, null, null, new e(kVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new f(kVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new g(kVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new h(kVar, null), 3);
        return y.f7506a;
    }
}
