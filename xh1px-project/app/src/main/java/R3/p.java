package R3;

import O3.J;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class p implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4.e f5077e;

    public /* synthetic */ p(C4.e eVar, int i4) {
        this.f5076d = i4;
        this.f5077e = eVar;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f5076d) {
            case 0:
                Object x8 = this.f5077e.x(new J(interfaceC0234g, 21), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            default:
                Object x9 = this.f5077e.x(new J(interfaceC0234g, 24), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
        }
    }
}
