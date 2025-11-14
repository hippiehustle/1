package q4;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import o4.C1254C;

/* renamed from: q4.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1378C implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1254C f14018e;

    public /* synthetic */ C1378C(C1254C c1254c, int i4) {
        this.f14017d = i4;
        this.f14018e = c1254c;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f14017d) {
            case 0:
                Object x8 = this.f14018e.x(new o4.z(interfaceC0234g, 23), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            case 1:
                Object x9 = this.f14018e.x(new o4.z(interfaceC0234g, 27), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
            default:
                Object x10 = this.f14018e.x(new o4.z(interfaceC0234g, 29), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x10;
        }
    }
}
