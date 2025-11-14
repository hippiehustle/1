package T3;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class C implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W0.d f5687e;

    public /* synthetic */ C(W0.d dVar, int i4) {
        this.f5686d = i4;
        this.f5687e = dVar;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f5686d) {
            case 0:
                Object x8 = this.f5687e.x(new x(interfaceC0234g, 3), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            default:
                Object x9 = this.f5687e.x(new x(interfaceC0234g, 5), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
        }
    }
}
