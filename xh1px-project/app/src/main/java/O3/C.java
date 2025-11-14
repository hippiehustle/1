package O3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class C extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3862h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F f3863i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(F f8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f3863i = f8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C c6 = (C) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c6.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C c6 = new C(this.f3863i, interfaceC0617c);
        c6.f3862h = obj;
        return c6;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f3862h;
        Z5.a.d(obj);
        AbstractC0166y.q(interfaceC0163v, null, null, new B(this.f3863i, null), 3);
        return Z5.y.f7506a;
    }
}
