package n4;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import g0.L;
import l3.C1018q;

/* loaded from: classes.dex */
public final class u implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f12974e;

    public /* synthetic */ u(L l6, int i4) {
        this.f12973d = i4;
        this.f12974e = l6;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f12973d) {
            case 0:
                Object x8 = this.f12974e.x(new C1018q(interfaceC0234g, 18), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            default:
                Object x9 = this.f12974e.x(new C1018q(interfaceC0234g, 20), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
        }
    }
}
