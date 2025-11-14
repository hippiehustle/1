package r3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: r3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1447k extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14334h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1450n f14335i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1447k(C1450n c1450n, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14335i = c1450n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1447k c1447k = (C1447k) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1447k.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1447k c1447k = new C1447k(this.f14335i, interfaceC0617c);
        c1447k.f14334h = obj;
        return c1447k;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f14334h;
        Z5.a.d(obj);
        C1450n c1450n = this.f14335i;
        AbstractC0166y.q(interfaceC0163v, null, null, new C1438b(c1450n, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1439c(c1450n, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1440d(c1450n, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1441e(c1450n, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1442f(c1450n, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1443g(c1450n, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1444h(c1450n, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1445i(c1450n, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1446j(c1450n, null), 3);
        return y.f7506a;
    }
}
