package o4;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* renamed from: o4.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1258G implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0.L f13518e;

    public /* synthetic */ C1258G(g0.L l6, int i4) {
        this.f13517d = i4;
        this.f13518e = l6;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f13517d) {
            case 0:
                Object x8 = this.f13518e.x(new z(interfaceC0234g, 3), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            case 1:
                Object x9 = this.f13518e.x(new z(interfaceC0234g, 5), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                Object x10 = this.f13518e.x(new z(interfaceC0234g, 7), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x10;
            default:
                Object x11 = this.f13518e.x(new z(interfaceC0234g, 9), interfaceC0617c);
                if (x11 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x11;
        }
    }
}
