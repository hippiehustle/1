package k7;

import C6.A;
import C6.AbstractC0021w;
import C6.InterfaceC0004e;
import a.AbstractC0405a;
import f7.C0722b;
import kotlin.NoWhenBranchMatchedException;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.E;
import w7.G;
import w7.W;
import w7.z;

/* loaded from: classes.dex */
public final class s extends g {
    public s(C0722b c0722b, int i4) {
        super(new q(new f(c0722b, i4)));
    }

    @Override // k7.g
    public final AbstractC1759v a(A a3) {
        AbstractC1759v abstractC1759v;
        o6.j.e(a3, "module");
        G.f15953e.getClass();
        G g8 = G.f15954f;
        z6.h o7 = a3.o();
        o7.getClass();
        InterfaceC0004e j = o7.j(z6.m.f16753Q.g());
        Object obj = this.f12144a;
        r rVar = (r) obj;
        if (rVar instanceof p) {
            abstractC1759v = ((p) obj).f12151a;
        } else if (rVar instanceof q) {
            f fVar = ((q) obj).f12152a;
            C0722b c0722b = fVar.f12142a;
            int i4 = fVar.f12143b;
            InterfaceC0004e d2 = AbstractC0021w.d(a3, c0722b);
            if (d2 == null) {
                abstractC1759v = y7.l.c(y7.k.UNRESOLVED_KCLASS_CONSTANT_VALUE, c0722b.toString(), String.valueOf(i4));
            } else {
                z l6 = d2.l();
                o6.j.d(l6, "getDefaultType(...)");
                W m02 = AbstractC0405a.m0(l6);
                for (int i8 = 0; i8 < i4; i8++) {
                    m02 = a3.o().h(m02);
                }
                abstractC1759v = m02;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return AbstractC1741c.s(g8, j, E2.d.y(new E(abstractC1759v)));
    }
}
