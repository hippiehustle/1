package l4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: l4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1028h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f12268h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f12269i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1028h(l lVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12269i = lVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1028h c1028h = (C1028h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1028h.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1028h c1028h = new C1028h(this.f12269i, interfaceC0617c);
        c1028h.f12268h = obj;
        return c1028h;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f12268h;
        Z5.a.d(obj);
        l lVar = this.f12269i;
        AbstractC0166y.q(interfaceC0163v, null, null, new C1025e(lVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1026f(lVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1027g(lVar, null), 3);
        return y.f7506a;
    }
}
