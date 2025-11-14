package H3;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class i implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P7.n f1931e;

    public /* synthetic */ i(P7.n nVar, int i4) {
        this.f1930d = i4;
        this.f1931e = nVar;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f1930d) {
            case 0:
                Object x8 = this.f1931e.x(new C1.e(interfaceC0234g, 10), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            case 1:
                Object x9 = this.f1931e.x(new C1.e(interfaceC0234g, 12), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                Object x10 = this.f1931e.x(new X3.t(interfaceC0234g, 24), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x10;
            default:
                Object x11 = this.f1931e.x(new b2.p(interfaceC0234g, 0), interfaceC0617c);
                if (x11 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x11;
        }
    }
}
