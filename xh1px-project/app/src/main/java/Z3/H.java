package Z3;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class H implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W5.a f7335e;

    public /* synthetic */ H(W5.a aVar, int i4) {
        this.f7334d = i4;
        this.f7335e = aVar;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f7334d) {
            case 0:
                Object x8 = this.f7335e.x(new X3.t(interfaceC0234g, 17), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            default:
                Object x9 = this.f7335e.x(new X3.t(interfaceC0234g, 19), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
        }
    }
}
