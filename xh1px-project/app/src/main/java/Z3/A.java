package Z3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class A extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7316h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ D f7317i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(D d2, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f7317i = d2;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        A a3 = (A) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        a3.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        A a3 = new A(this.f7317i, interfaceC0617c);
        a3.f7316h = obj;
        return a3;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f7316h;
        Z5.a.d(obj);
        D d2 = this.f7317i;
        AbstractC0166y.q(interfaceC0163v, null, null, new v(d2, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new w(d2, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new x(d2, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new y(d2, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new z(d2, null), 3);
        return Z5.y.f7506a;
    }
}
