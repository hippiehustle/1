package O7;

import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class P implements g0, InterfaceC0233f, P7.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f4088d;

    public P(i0 i0Var) {
        this.f4088d = i0Var;
    }

    @Override // P7.v
    public final InterfaceC0233f m(InterfaceC0622h interfaceC0622h, int i4, N7.a aVar) {
        if (((i4 >= 0 && i4 < 2) || i4 == -2) && aVar == N7.a.f3796e) {
            return this;
        }
        return V.r(this, interfaceC0622h, i4, aVar);
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        this.f4088d.x(interfaceC0234g, interfaceC0617c);
        return EnumC0646a.f10656d;
    }
}
