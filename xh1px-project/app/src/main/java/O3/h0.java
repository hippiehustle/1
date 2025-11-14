package O3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class h0 extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3967h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k0 f3968i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f3968i = k0Var;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        h0 h0Var = (h0) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        h0Var.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        h0 h0Var = new h0(this.f3968i, interfaceC0617c);
        h0Var.f3967h = obj;
        return h0Var;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f3967h;
        Z5.a.d(obj);
        k0 k0Var = this.f3968i;
        AbstractC0166y.q(interfaceC0163v, null, null, new e0(k0Var, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new f0(k0Var, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new g0(k0Var, null), 3);
        return Z5.y.f7506a;
    }
}
