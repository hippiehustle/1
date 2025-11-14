package Z3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: Z3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369d extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7369h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0372g f7370i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0369d(C0372g c0372g, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f7370i = c0372g;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0369d c0369d = (C0369d) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c0369d.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0369d c0369d = new C0369d(this.f7370i, interfaceC0617c);
        c0369d.f7369h = obj;
        return c0369d;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f7369h;
        Z5.a.d(obj);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0368c(this.f7370i, null), 3);
        return Z5.y.f7506a;
    }
}
