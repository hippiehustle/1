package M3;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import android.content.Context;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class W implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0233f f3407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f3408f;

    public /* synthetic */ W(InterfaceC0233f interfaceC0233f, Context context, int i4) {
        this.f3406d = i4;
        this.f3407e = interfaceC0233f;
        this.f3408f = context;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f3406d) {
            case 0:
                Object x8 = this.f3407e.x(new V(interfaceC0234g, this.f3408f, 0), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            case 1:
                Object x9 = this.f3407e.x(new V(interfaceC0234g, this.f3408f, 3), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                Object x10 = this.f3407e.x(new V(interfaceC0234g, this.f3408f, 5), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x10;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                Object x11 = this.f3407e.x(new V(interfaceC0234g, this.f3408f, 7), interfaceC0617c);
                if (x11 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x11;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Object x12 = this.f3407e.x(new V(interfaceC0234g, this.f3408f, 8), interfaceC0617c);
                if (x12 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x12;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Object x13 = this.f3407e.x(new V(interfaceC0234g, this.f3408f, 9), interfaceC0617c);
                if (x13 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x13;
            default:
                Object x14 = this.f3407e.x(new V(interfaceC0234g, this.f3408f, 10), interfaceC0617c);
                if (x14 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x14;
        }
    }
}
