package y7;

import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0000a;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import C6.InterfaceC0018t;
import C6.InterfaceC0019u;
import C6.O;
import F6.AbstractC0061v;
import F6.N;
import f7.C0725e;
import java.util.Collection;
import n1.AbstractC1149a;
import t2.C1562a;

/* loaded from: classes.dex */
public final class c extends N {
    @Override // F6.AbstractC0061v, C6.InterfaceC0001b
    public final Object L(InterfaceC0000a interfaceC0000a) {
        return null;
    }

    @Override // F6.AbstractC0061v
    /* renamed from: N0 */
    public final N x(InterfaceC0010k interfaceC0010k, EnumC0023y enumC0023y, C0014o c0014o) {
        o6.j.e(interfaceC0010k, "newOwner");
        o6.j.e(c0014o, "visibility");
        AbstractC1149a.l("kind", 2);
        return this;
    }

    @Override // F6.N, F6.AbstractC0061v
    public final AbstractC0061v O0(int i4, InterfaceC0010k interfaceC0010k, InterfaceC0019u interfaceC0019u, O o7, D6.j jVar, C0725e c0725e) {
        o6.j.e(interfaceC0010k, "newOwner");
        AbstractC1149a.l("kind", i4);
        o6.j.e(jVar, "annotations");
        return this;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0002c
    public final void h0(Collection collection) {
        o6.j.e(collection, "overriddenDescriptors");
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0019u
    public final boolean p() {
        return false;
    }

    @Override // F6.N, F6.AbstractC0061v, C6.InterfaceC0019u
    public final InterfaceC0018t s0() {
        return new C1562a(this);
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0002c
    public final /* bridge */ /* synthetic */ InterfaceC0002c x(InterfaceC0004e interfaceC0004e, EnumC0023y enumC0023y, C0014o c0014o) {
        x(interfaceC0004e, enumC0023y, c0014o);
        return this;
    }
}
