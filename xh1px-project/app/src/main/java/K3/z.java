package K3;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import O7.i0;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import l3.C1018q;

/* loaded from: classes.dex */
public final class z implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f2727e;

    public /* synthetic */ z(i0 i0Var, int i4) {
        this.f2726d = i4;
        this.f2727e = i0Var;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f2726d) {
            case 0:
                this.f2727e.x(new C1.e(interfaceC0234g, 23), interfaceC0617c);
                return EnumC0646a.f10656d;
            case 1:
                this.f2727e.x(new O3.J(interfaceC0234g, 28), interfaceC0617c);
                return EnumC0646a.f10656d;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                this.f2727e.x(new T3.x(interfaceC0234g, 15), interfaceC0617c);
                return EnumC0646a.f10656d;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                this.f2727e.x(new T3.x(interfaceC0234g, 17), interfaceC0617c);
                return EnumC0646a.f10656d;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                this.f2727e.x(new X3.t(interfaceC0234g, 14), interfaceC0617c);
                return EnumC0646a.f10656d;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                this.f2727e.x(new b2.p(interfaceC0234g, 2), interfaceC0617c);
                return EnumC0646a.f10656d;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f2727e.x(new b2.p(interfaceC0234g, 4), interfaceC0617c);
                return EnumC0646a.f10656d;
            default:
                this.f2727e.x(new C1018q(interfaceC0234g, 24), interfaceC0617c);
                return EnumC0646a.f10656d;
        }
    }
}
