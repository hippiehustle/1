package M3;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W0.d f3393e;

    public /* synthetic */ Q(W0.d dVar, int i4) {
        this.f3392d = i4;
        this.f3393e = dVar;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f3392d) {
            case 0:
                Object x8 = this.f3393e.x(new L3.E(interfaceC0234g, 23), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            default:
                Object x9 = this.f3393e.x(new L3.E(interfaceC0234g, 25), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
        }
    }
}
