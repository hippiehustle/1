package X3;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class u implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W5.a f6924e;

    public /* synthetic */ u(W5.a aVar, int i4) {
        this.f6923d = i4;
        this.f6924e = aVar;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f6923d) {
            case 0:
                Object x8 = this.f6924e.x(new t(interfaceC0234g, 0), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            case 1:
                Object x9 = this.f6924e.x(new t(interfaceC0234g, 2), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
            default:
                Object x10 = this.f6924e.x(new t(interfaceC0234g, 4), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x10;
        }
    }
}
