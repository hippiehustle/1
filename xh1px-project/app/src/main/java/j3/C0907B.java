package j3;

import D4.C0040p;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import l3.C1018q;
import q4.C1386K;

/* renamed from: j3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907B implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0040p f11823e;

    public /* synthetic */ C0907B(C0040p c0040p, int i4) {
        this.f11822d = i4;
        this.f11823e = c0040p;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f11822d) {
            case 0:
                Object x8 = this.f11823e.x(new b2.p(interfaceC0234g, 11), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            case 1:
                Object x9 = this.f11823e.x(new b2.p(interfaceC0234g, 13), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                Object x10 = this.f11823e.x(new b2.p(interfaceC0234g, 15), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x10;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                Object x11 = this.f11823e.x(new b2.p(interfaceC0234g, 17), interfaceC0617c);
                if (x11 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x11;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Object x12 = this.f11823e.x(new C1018q(interfaceC0234g, 0), interfaceC0617c);
                if (x12 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x12;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Object x13 = this.f11823e.x(new C1018q(interfaceC0234g, 8), interfaceC0617c);
                if (x13 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x13;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                Object x14 = this.f11823e.x(new C1018q(interfaceC0234g, 10), interfaceC0617c);
                if (x14 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x14;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                Object x15 = this.f11823e.x(new C1018q(interfaceC0234g, 12), interfaceC0617c);
                if (x15 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x15;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                Object x16 = this.f11823e.x(new C1018q(interfaceC0234g, 14), interfaceC0617c);
                if (x16 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x16;
            case 9:
                Object x17 = this.f11823e.x(new o4.z(interfaceC0234g, 26), interfaceC0617c);
                if (x17 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x17;
            default:
                Object x18 = this.f11823e.x(new C1386K(interfaceC0234g, 11), interfaceC0617c);
                if (x18 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x18;
        }
    }
}
