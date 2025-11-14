package H3;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import l3.C1018q;

/* loaded from: classes.dex */
public final class v implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A4.c f1973e;

    public /* synthetic */ v(A4.c cVar, int i4) {
        this.f1972d = i4;
        this.f1973e = cVar;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f1972d) {
            case 0:
                Object x8 = this.f1973e.x(new C1.e(interfaceC0234g, 15), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            case 1:
                Object x9 = this.f1973e.x(new C1.e(interfaceC0234g, 22), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
            default:
                Object x10 = this.f1973e.x(new C1018q(interfaceC0234g, 23), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x10;
        }
    }
}
