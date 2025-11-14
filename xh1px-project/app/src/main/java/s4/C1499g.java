package s4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: s4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1499g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14536h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1502j f14537i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1499g(C1502j c1502j, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14537i = c1502j;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1499g c1499g = (C1499g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1499g.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1499g c1499g = new C1499g(this.f14537i, interfaceC0617c);
        c1499g.f14536h = obj;
        return c1499g;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f14536h;
        Z5.a.d(obj);
        C1502j c1502j = this.f14537i;
        AbstractC0166y.q(interfaceC0163v, null, null, new C1497e(c1502j, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1498f(c1502j, null), 3);
        return y.f7506a;
    }
}
