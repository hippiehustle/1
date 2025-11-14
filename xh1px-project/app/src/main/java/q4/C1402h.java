package q4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: q4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1402h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14105h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1419y f14106i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1402h(C1419y c1419y, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14106i = c1419y;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1402h c1402h = (C1402h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c1402h.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1402h c1402h = new C1402h(this.f14106i, interfaceC0617c);
        c1402h.f14105h = obj;
        return c1402h;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f14105h;
        Z5.a.d(obj);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1401g(this.f14106i, null), 3);
        return Z5.y.f7506a;
    }
}
