package k4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: k4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0989v extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f12125h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H f12126i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0989v(H h8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12126i = h8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0989v c0989v = (C0989v) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c0989v.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0989v c0989v = new C0989v(this.f12126i, interfaceC0617c);
        c0989v.f12125h = obj;
        return c0989v;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f12125h;
        Z5.a.d(obj);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0988u(this.f12126i, null), 3);
        return Z5.y.f7506a;
    }
}
