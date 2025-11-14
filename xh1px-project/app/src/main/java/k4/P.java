package k4;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class P implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y3.z f12045e;

    public /* synthetic */ P(Y3.z zVar, int i4) {
        this.f12044d = i4;
        this.f12045e = zVar;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f12044d) {
            case 0:
                Object x8 = this.f12045e.x(new b2.p(interfaceC0234g, 23), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            default:
                Object x9 = this.f12045e.x(new b2.p(interfaceC0234g, 27), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
        }
    }
}
