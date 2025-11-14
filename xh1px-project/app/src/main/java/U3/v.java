package U3;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class v implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W0.c f6145e;

    public /* synthetic */ v(W0.c cVar, int i4) {
        this.f6144d = i4;
        this.f6145e = cVar;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f6144d) {
            case 0:
                Object x8 = this.f6145e.x(new T3.x(interfaceC0234g, 10), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            default:
                Object x9 = this.f6145e.x(new T3.x(interfaceC0234g, 12), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
        }
    }
}
