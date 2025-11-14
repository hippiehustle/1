package P7;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.C0623i;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class i extends h {
    public i(InterfaceC0233f interfaceC0233f, InterfaceC0622h interfaceC0622h, int i4, N7.a aVar, int i8) {
        super((i8 & 4) != 0 ? -3 : i4, (i8 & 8) != 0 ? N7.a.f3795d : aVar, interfaceC0233f, (i8 & 2) != 0 ? C0623i.f10448d : interfaceC0622h);
    }

    @Override // P7.f
    public final f b(InterfaceC0622h interfaceC0622h, int i4, N7.a aVar) {
        return new h(i4, aVar, this.f4652g, interfaceC0622h);
    }

    @Override // P7.f
    public final InterfaceC0233f c() {
        return this.f4652g;
    }

    @Override // P7.h
    public final Object d(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        Object x8 = this.f4652g.x(interfaceC0234g, interfaceC0617c);
        if (x8 == EnumC0646a.f10656d) {
            return x8;
        }
        return Z5.y.f7506a;
    }
}
