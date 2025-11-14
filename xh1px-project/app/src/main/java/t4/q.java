package t4;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import Y3.z;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import q4.C1386K;

/* loaded from: classes.dex */
public final class q implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f15096e;

    public /* synthetic */ q(z zVar, int i4) {
        this.f15095d = i4;
        this.f15096e = zVar;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f15095d) {
            case 0:
                Object x8 = this.f15096e.x(new C1386K(interfaceC0234g, 17), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            default:
                Object x9 = this.f15096e.x(new C1386K(interfaceC0234g, 19), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
        }
    }
}
