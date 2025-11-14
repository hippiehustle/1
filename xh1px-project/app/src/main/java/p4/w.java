package p4;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import g0.L;

/* loaded from: classes.dex */
public final class w implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f13791e;

    public /* synthetic */ w(L l6, int i4) {
        this.f13790d = i4;
        this.f13791e = l6;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f13790d) {
            case 0:
                Object x8 = this.f13791e.x(new o4.z(interfaceC0234g, 16), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            default:
                Object x9 = this.f13791e.x(new o4.z(interfaceC0234g, 18), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
        }
    }
}
