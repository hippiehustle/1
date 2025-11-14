package P7;

import D4.C0027c;
import L7.AbstractC0166y;
import L7.C0159q;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.C0618d;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public abstract class h extends f {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0233f f4652g;

    public h(int i4, N7.a aVar, InterfaceC0233f interfaceC0233f, InterfaceC0622h interfaceC0622h) {
        super(interfaceC0622h, i4, aVar);
        this.f4652g = interfaceC0233f;
    }

    @Override // P7.f
    public final Object a(N7.s sVar, C0288e c0288e) {
        Object d2 = d(new B(sVar), c0288e);
        if (d2 == EnumC0646a.f10656d) {
            return d2;
        }
        return Z5.y.f7506a;
    }

    public abstract Object d(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c);

    @Override // P7.f
    public final String toString() {
        return this.f4652g + " -> " + super.toString();
    }

    @Override // P7.f, O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        InterfaceC0622h j;
        int i4 = this.f4648e;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 == -3) {
            InterfaceC0622h h8 = interfaceC0617c.h();
            Boolean bool = Boolean.FALSE;
            C0159q c0159q = new C0159q(0);
            InterfaceC0622h interfaceC0622h = this.f4647d;
            if (!((Boolean) interfaceC0622h.n(bool, c0159q)).booleanValue()) {
                j = h8.D(interfaceC0622h);
            } else {
                j = AbstractC0166y.j(h8, interfaceC0622h, false);
            }
            if (o6.j.a(j, h8)) {
                Object d2 = d(interfaceC0234g, interfaceC0617c);
                if (d2 == enumC0646a) {
                    return d2;
                }
            } else {
                C0618d c0618d = C0618d.f10447d;
                if (o6.j.a(j.B(c0618d), h8.B(c0618d))) {
                    InterfaceC0622h h9 = interfaceC0617c.h();
                    if (!(interfaceC0234g instanceof B) && !(interfaceC0234g instanceof x)) {
                        interfaceC0234g = new C0027c(interfaceC0234g, h9);
                    }
                    Object c6 = AbstractC0285b.c(j, interfaceC0234g, Q7.b.m(j), new g(this, null), interfaceC0617c);
                    if (c6 == enumC0646a) {
                        return c6;
                    }
                }
            }
            return Z5.y.f7506a;
        }
        Object x8 = super.x(interfaceC0234g, interfaceC0617c);
        if (x8 == enumC0646a) {
            return x8;
        }
        return Z5.y.f7506a;
    }
}
