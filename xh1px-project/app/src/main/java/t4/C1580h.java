package t4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: t4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1580h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f15075h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1583k f15076i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1580h(C1583k c1583k, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15076i = c1583k;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1580h c1580h = (C1580h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c1580h.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1580h c1580h = new C1580h(this.f15076i, interfaceC0617c);
        c1580h.f15075h = obj;
        return c1580h;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f15075h;
        Z5.a.d(obj);
        C1583k c1583k = this.f15076i;
        AbstractC0166y.q(interfaceC0163v, null, null, new C1575c(c1583k, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1576d(c1583k, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1577e(c1583k, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1578f(c1583k, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1579g(c1583k, null), 3);
        return Z5.y.f7506a;
    }
}
