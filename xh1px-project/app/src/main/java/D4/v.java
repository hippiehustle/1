package D4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class v extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f992h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A f993i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(A a3, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f993i = a3;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        v vVar = (v) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        vVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        v vVar = new v(this.f993i, interfaceC0617c);
        vVar.f992h = obj;
        return vVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f992h;
        Z5.a.d(obj);
        AbstractC0166y.q(interfaceC0163v, null, null, new u(this.f993i, null), 3);
        return Z5.y.f7506a;
    }
}
