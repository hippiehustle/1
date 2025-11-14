package Q4;

import D4.C0040p;
import O3.J;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class p implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0040p f4887e;

    public /* synthetic */ p(C0040p c0040p, int i4) {
        this.f4886d = i4;
        this.f4887e = c0040p;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f4886d) {
            case 0:
                Object x8 = this.f4887e.x(new J(interfaceC0234g, 17), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x8;
            default:
                Object x9 = this.f4887e.x(new J(interfaceC0234g, 19), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x9;
        }
    }
}
