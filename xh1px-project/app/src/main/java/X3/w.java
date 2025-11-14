package X3;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class w implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W5.a f6929e;

    public /* synthetic */ w(W5.a aVar, int i4) {
        this.f6928d = i4;
        this.f6929e = aVar;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f6928d) {
            case 0:
                Object x8 = this.f6929e.x(new t(interfaceC0234g, 1), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            default:
                Object x9 = this.f6929e.x(new t(interfaceC0234g, 3), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
        }
    }
}
