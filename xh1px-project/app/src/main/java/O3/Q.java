package O3;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W0.d f3899e;

    public /* synthetic */ Q(W0.d dVar, int i4) {
        this.f3898d = i4;
        this.f3899e = dVar;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f3898d) {
            case 0:
                Object x8 = this.f3899e.x(new J(interfaceC0234g, 4), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            case 1:
                Object x9 = this.f3899e.x(new J(interfaceC0234g, 6), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                Object x10 = this.f3899e.x(new J(interfaceC0234g, 8), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x10;
            default:
                Object x11 = this.f3899e.x(new J(interfaceC0234g, 10), interfaceC0617c);
                if (x11 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x11;
        }
    }
}
