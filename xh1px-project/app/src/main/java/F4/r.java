package F4;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import l3.C1018q;
import u0.C1621l;

/* loaded from: classes.dex */
public final class r implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1621l f1423e;

    public /* synthetic */ r(C1621l c1621l, int i4) {
        this.f1422d = i4;
        this.f1423e = c1621l;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f1422d) {
            case 0:
                Object x8 = this.f1423e.x(new C1.e(interfaceC0234g, 6), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x8;
            default:
                Object x9 = this.f1423e.x(new C1018q(interfaceC0234g, 4), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x9;
        }
    }
}
