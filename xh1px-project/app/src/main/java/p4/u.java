package p4;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import g0.L;

/* loaded from: classes.dex */
public final class u implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f13786e;

    public /* synthetic */ u(L l6, int i4) {
        this.f13785d = i4;
        this.f13786e = l6;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f13785d) {
            case 0:
                Object x8 = this.f13786e.x(new o4.z(interfaceC0234g, 15), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            default:
                Object x9 = this.f13786e.x(new o4.z(interfaceC0234g, 17), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
        }
    }
}
