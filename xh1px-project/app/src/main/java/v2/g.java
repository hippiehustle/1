package v2;

import J3.C0076a;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f15500h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15500h = hVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        g gVar = (g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        gVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new g(this.f15500h, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        C0076a c0076a = this.f15500h.f15506f;
        if (c0076a != null) {
            c0076a.a();
        }
        return y.f7506a;
    }
}
