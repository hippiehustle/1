package U3;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class r implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0233f f6133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D2.k f6134f;

    public /* synthetic */ r(InterfaceC0233f interfaceC0233f, D2.k kVar, int i4) {
        this.f6132d = i4;
        this.f6133e = interfaceC0233f;
        this.f6134f = kVar;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f6132d) {
            case 0:
                Object x8 = this.f6133e.x(new q(interfaceC0234g, this.f6134f, 0), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            case 1:
                Object x9 = this.f6133e.x(new q(interfaceC0234g, this.f6134f, 1), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
            default:
                Object x10 = this.f6133e.x(new q(interfaceC0234g, this.f6134f, 2), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x10;
        }
    }
}
