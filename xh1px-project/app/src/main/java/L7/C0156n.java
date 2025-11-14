package L7;

import f6.AbstractC0720j;

/* renamed from: L7.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156n extends d0 implements InterfaceC0155m {
    public final Object e0(AbstractC0720j abstractC0720j) {
        Object obj;
        do {
            obj = d0.f3210d.get(this);
            if (!(obj instanceof U)) {
                if (!(obj instanceof C0158p)) {
                    return AbstractC0166y.y(obj);
                }
                throw ((C0158p) obj).f3235a;
            }
        } while (a0(obj) < 0);
        a0 a0Var = new a0(this, E2.c.d0(abstractC0720j));
        a0Var.v();
        a0Var.x(new C0147e(2, AbstractC0166y.o(this, true, new I(2, a0Var))));
        return a0Var.u();
    }
}
