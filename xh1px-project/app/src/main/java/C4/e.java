package C4;

import D4.C0027c;
import L3.E;
import O3.J;
import O7.C0248v;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import T3.x;
import X3.t;
import Z5.y;
import b2.p;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import l3.C1018q;
import o6.s;

/* loaded from: classes.dex */
public final class e implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0233f f630e;

    public /* synthetic */ e(InterfaceC0233f interfaceC0233f, int i4) {
        this.f629d = i4;
        this.f630e = interfaceC0233f;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0186  */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, o6.s] */
    @Override // O7.InterfaceC0233f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        C0248v c0248v;
        int i4;
        AbortFlowException e9;
        Object obj;
        switch (this.f629d) {
            case 0:
                Object x8 = this.f630e.x(new C1.e(interfaceC0234g, 1), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x8;
            case 1:
                Object x9 = this.f630e.x(new C1.e(interfaceC0234g, 3), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x9;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                Object x10 = this.f630e.x(new C1.e(interfaceC0234g, 8), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x10;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                Object x11 = this.f630e.x(new C1.e(interfaceC0234g, 18), interfaceC0617c);
                if (x11 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x11;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Object x12 = this.f630e.x(new C1.e(interfaceC0234g, 20), interfaceC0617c);
                if (x12 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x12;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Object x13 = this.f630e.x(new C1.e(interfaceC0234g, 28), interfaceC0617c);
                if (x13 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x13;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                Object x14 = this.f630e.x(new E(interfaceC0234g, 9), interfaceC0617c);
                if (x14 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x14;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                Object x15 = this.f630e.x(new E(interfaceC0234g, 11), interfaceC0617c);
                if (x15 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x15;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                Object x16 = this.f630e.x(new E(interfaceC0234g, 18), interfaceC0617c);
                if (x16 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x16;
            case 9:
                Object x17 = this.f630e.x(new E(interfaceC0234g, 26), interfaceC0617c);
                if (x17 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x17;
            case 10:
                Object x18 = this.f630e.x(new J(interfaceC0234g, 3), interfaceC0617c);
                if (x18 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x18;
            case 11:
                Object x19 = this.f630e.x(new J(interfaceC0234g, 12), interfaceC0617c);
                if (x19 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x19;
            case 12:
                if (interfaceC0617c instanceof C0248v) {
                    c0248v = (C0248v) interfaceC0617c;
                    int i8 = c0248v.f4189h;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0248v.f4189h = i8 - Integer.MIN_VALUE;
                        Object obj2 = c0248v.f4188g;
                        i4 = c0248v.f4189h;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                obj = c0248v.j;
                                try {
                                    Z5.a.d(obj2);
                                } catch (AbortFlowException e10) {
                                    e9 = e10;
                                    if (e9.f12159d != obj) {
                                        throw e9;
                                    }
                                    return y.f7506a;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj2);
                            Object obj3 = new Object();
                            ?? obj4 = new Object();
                            try {
                                InterfaceC0233f interfaceC0233f = this.f630e;
                                C0027c c0027c = new C0027c((s) obj4, interfaceC0234g, obj3);
                                c0248v.j = obj3;
                                c0248v.f4189h = 1;
                                Object x20 = interfaceC0233f.x(c0027c, c0248v);
                                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                                if (x20 == enumC0646a) {
                                    return enumC0646a;
                                }
                            } catch (AbortFlowException e11) {
                                e9 = e11;
                                obj = obj3;
                                if (e9.f12159d != obj) {
                                }
                                return y.f7506a;
                            }
                        }
                        return y.f7506a;
                    }
                }
                c0248v = new C0248v(this, interfaceC0617c);
                Object obj22 = c0248v.f4188g;
                i4 = c0248v.f4189h;
                if (i4 == 0) {
                }
                return y.f7506a;
            case 13:
                Object x21 = this.f630e.x(new J(interfaceC0234g, 26), interfaceC0617c);
                if (x21 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x21;
            case 14:
                Object x22 = this.f630e.x(new x(interfaceC0234g, 6), interfaceC0617c);
                if (x22 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x22;
            case 15:
                Object x23 = this.f630e.x(new x(interfaceC0234g, 9), interfaceC0617c);
                if (x23 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x23;
            case 16:
                Object x24 = this.f630e.x(new x(interfaceC0234g, 13), interfaceC0617c);
                if (x24 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x24;
            case 17:
                Object x25 = this.f630e.x(new x(interfaceC0234g, 24), interfaceC0617c);
                if (x25 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x25;
            case 18:
                Object x26 = this.f630e.x(new t(interfaceC0234g, 6), interfaceC0617c);
                if (x26 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x26;
            case 19:
                Object x27 = this.f630e.x(new t(interfaceC0234g, 8), interfaceC0617c);
                if (x27 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x27;
            case 20:
                Object x28 = this.f630e.x(new t(interfaceC0234g, 12), interfaceC0617c);
                if (x28 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x28;
            case 21:
                Object x29 = this.f630e.x(new t(interfaceC0234g, 21), interfaceC0617c);
                if (x29 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x29;
            case 22:
                Object x30 = this.f630e.x(new t(interfaceC0234g, 22), interfaceC0617c);
                if (x30 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x30;
            case 23:
                Object x31 = this.f630e.x(new t(interfaceC0234g, 28), interfaceC0617c);
                if (x31 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x31;
            case 24:
                Object x32 = this.f630e.x(new p(interfaceC0234g, 6), interfaceC0617c);
                if (x32 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x32;
            case 25:
                Object x33 = this.f630e.x(new p(interfaceC0234g, 19), interfaceC0617c);
                if (x33 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x33;
            case 26:
                Object x34 = this.f630e.x(new p(interfaceC0234g, 21), interfaceC0617c);
                if (x34 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x34;
            case 27:
                Object x35 = this.f630e.x(new p(interfaceC0234g, 25), interfaceC0617c);
                if (x35 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x35;
            case 28:
                Object x36 = this.f630e.x(new C1018q(interfaceC0234g, 16), interfaceC0617c);
                if (x36 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x36;
            default:
                Object x37 = this.f630e.x(new C1018q(interfaceC0234g, 22), interfaceC0617c);
                if (x37 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x37;
        }
    }
}
