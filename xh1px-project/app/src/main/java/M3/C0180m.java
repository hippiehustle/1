package M3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: M3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180m extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3450h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0183p f3451i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0180m(C0183p c0183p, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f3451i = c0183p;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0180m c0180m = (C0180m) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c0180m.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0180m c0180m = new C0180m(this.f3451i, interfaceC0617c);
        c0180m.f3450h = obj;
        return c0180m;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f3450h;
        Z5.a.d(obj);
        C0183p c0183p = this.f3451i;
        AbstractC0166y.q(interfaceC0163v, null, null, new C0174g(c0183p, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0175h(c0183p, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0176i(c0183p, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0177j(c0183p, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0178k(c0183p, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0179l(c0183p, null), 3);
        return Z5.y.f7506a;
    }
}
