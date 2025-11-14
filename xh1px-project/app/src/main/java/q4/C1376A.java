package q4;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import o4.C1254C;

/* renamed from: q4.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1376A implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1254C f14013e;

    public /* synthetic */ C1376A(C1254C c1254c, int i4) {
        this.f14012d = i4;
        this.f14013e = c1254c;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f14012d) {
            case 0:
                Object x8 = this.f14013e.x(new o4.z(interfaceC0234g, 22), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            case 1:
                Object x9 = this.f14013e.x(new o4.z(interfaceC0234g, 28), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
            default:
                Object x10 = this.f14013e.x(new C1386K(interfaceC0234g, 0), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x10;
        }
    }
}
