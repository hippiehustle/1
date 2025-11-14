package X;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class a0 extends AbstractC0720j implements InterfaceC1164c {
    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        a0 a0Var = (a0) p((InterfaceC0617c) obj2, (InterfaceC0234g) obj);
        Z5.y yVar = Z5.y.f7506a;
        a0Var.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new AbstractC0720j(2, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        return Z5.y.f7506a;
    }
}
