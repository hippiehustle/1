package Y3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class j extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7132h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f7133i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f7133i = mVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        j jVar = (j) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        jVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        j jVar = new j(this.f7133i, interfaceC0617c);
        jVar.f7132h = obj;
        return jVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f7132h;
        Z5.a.d(obj);
        m mVar = this.f7133i;
        AbstractC0166y.q(interfaceC0163v, null, null, new f(mVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new g(mVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new h(mVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new i(mVar, null), 3);
        return Z5.y.f7506a;
    }
}
