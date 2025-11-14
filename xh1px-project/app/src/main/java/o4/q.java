package o4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class q extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f13589h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f13590i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13590i = tVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        q qVar = (q) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        qVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        q qVar = new q(this.f13590i, interfaceC0617c);
        qVar.f13589h = obj;
        return qVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f13589h;
        Z5.a.d(obj);
        t tVar = this.f13590i;
        AbstractC0166y.q(interfaceC0163v, null, null, new C1271h(tVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1272i(tVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1273j(tVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1274k(tVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1275l(tVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1276m(tVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1277n(tVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1278o(tVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new p(tVar, null), 3);
        return Z5.y.f7506a;
    }
}
