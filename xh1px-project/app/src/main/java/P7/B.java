package P7;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class B implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final N7.v f4630d;

    public B(N7.s sVar) {
        this.f4630d = sVar;
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        Object b4 = this.f4630d.b(interfaceC0617c, obj);
        if (b4 == EnumC0646a.f10656d) {
            return b4;
        }
        return Z5.y.f7506a;
    }
}
