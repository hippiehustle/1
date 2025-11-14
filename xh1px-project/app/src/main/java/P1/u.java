package P1;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class u extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ U4.a f4485h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(U4.a aVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4485h = aVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        u uVar = (u) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        uVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new u(this.f4485h, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        this.f4485h.a();
        return y.f7506a;
    }
}
