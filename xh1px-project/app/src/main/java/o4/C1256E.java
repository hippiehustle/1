package o4;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* renamed from: o4.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1256E implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0.L f13513e;

    public /* synthetic */ C1256E(g0.L l6, int i4) {
        this.f13512d = i4;
        this.f13513e = l6;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f13512d) {
            case 0:
                Object x8 = this.f13513e.x(new z(interfaceC0234g, 2), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            case 1:
                Object x9 = this.f13513e.x(new z(interfaceC0234g, 4), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
            default:
                Object x10 = this.f13513e.x(new z(interfaceC0234g, 6), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x10;
        }
    }
}
