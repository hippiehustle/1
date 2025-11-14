package X3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class m extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6903h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f6904i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6904i = pVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        m mVar = (m) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        mVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        m mVar = new m(this.f6904i, interfaceC0617c);
        mVar.f6903h = obj;
        return mVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f6903h;
        Z5.a.d(obj);
        p pVar = this.f6904i;
        AbstractC0166y.q(interfaceC0163v, null, null, new g(pVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new h(pVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new i(pVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new j(pVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new k(pVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new l(pVar, null), 3);
        return Z5.y.f7506a;
    }
}
