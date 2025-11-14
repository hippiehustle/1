package x7;

import i7.C0896k;
import w7.AbstractC1759v;
import w7.C1742d;
import w7.I;
import w7.W;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: c, reason: collision with root package name */
    public final C1823e f16297c = C1823e.f16281a;

    /* renamed from: d, reason: collision with root package name */
    public final C0896k f16298d = new C0896k(C0896k.f11783d);

    public final boolean a(AbstractC1759v abstractC1759v, AbstractC1759v abstractC1759v2) {
        o6.j.e(abstractC1759v, "a");
        o6.j.e(abstractC1759v2, "b");
        return C1742d.h(AbstractC1825g.l(false, null, this.f16297c, 6), abstractC1759v.H0(), abstractC1759v2.H0());
    }

    public final boolean b(AbstractC1759v abstractC1759v, AbstractC1759v abstractC1759v2) {
        o6.j.e(abstractC1759v, "subtype");
        o6.j.e(abstractC1759v2, "supertype");
        I l6 = AbstractC1825g.l(true, null, this.f16297c, 6);
        W H02 = abstractC1759v.H0();
        W H03 = abstractC1759v2.H0();
        if (H02 == H03) {
            return true;
        }
        return C1742d.f(l6, H02, H03);
    }
}
