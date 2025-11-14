package s4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: s4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1495c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14528h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1502j f14529i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1495c(C1502j c1502j, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14529i = c1502j;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1495c c1495c = (C1495c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1495c.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1495c c1495c = new C1495c(this.f14529i, interfaceC0617c);
        c1495c.f14528h = obj;
        return c1495c;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f14528h;
        Z5.a.d(obj);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1494b(this.f14529i, null), 3);
        return y.f7506a;
    }
}
