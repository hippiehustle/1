package w7;

import a.AbstractC0405a;
import h7.C0845h;
import kotlin.NoWhenBranchMatchedException;
import x7.C1824f;

/* renamed from: w7.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1755q extends AbstractC1754p implements InterfaceC1748j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1755q(z zVar, z zVar2) {
        super(zVar, zVar2);
        o6.j.e(zVar, "lowerBound");
        o6.j.e(zVar2, "upperBound");
    }

    @Override // w7.AbstractC1759v
    public final AbstractC1759v G0(C1824f c1824f) {
        o6.j.e(c1824f, "kotlinTypeRefiner");
        z zVar = this.f16006e;
        o6.j.e(zVar, "type");
        z zVar2 = this.f16007f;
        o6.j.e(zVar2, "type");
        return new C1755q(zVar, zVar2);
    }

    @Override // w7.W
    public final W I0(boolean z8) {
        return AbstractC1741c.e(this.f16006e.I0(z8), this.f16007f.I0(z8));
    }

    @Override // w7.W
    /* renamed from: J0 */
    public final W G0(C1824f c1824f) {
        o6.j.e(c1824f, "kotlinTypeRefiner");
        z zVar = this.f16006e;
        o6.j.e(zVar, "type");
        z zVar2 = this.f16007f;
        o6.j.e(zVar2, "type");
        return new C1755q(zVar, zVar2);
    }

    @Override // w7.W
    public final W K0(G g8) {
        o6.j.e(g8, "newAttributes");
        return AbstractC1741c.e(this.f16006e.K0(g8), this.f16007f.K0(g8));
    }

    @Override // w7.AbstractC1754p
    public final z L0() {
        return this.f16006e;
    }

    @Override // w7.AbstractC1754p
    public final String M0(C0845h c0845h, C0845h c0845h2) {
        boolean l6 = c0845h2.f11449a.l();
        z zVar = this.f16007f;
        z zVar2 = this.f16006e;
        if (l6) {
            return "(" + c0845h.V(zVar2) + ".." + c0845h.V(zVar) + ')';
        }
        return c0845h.D(c0845h.V(zVar2), c0845h.V(zVar), AbstractC0405a.A(this));
    }

    @Override // w7.InterfaceC1748j
    public final boolean V() {
        z zVar = this.f16006e;
        if ((zVar.B0().c() instanceof C6.T) && o6.j.a(zVar.B0(), this.f16007f.B0())) {
            return true;
        }
        return false;
    }

    @Override // w7.InterfaceC1748j
    public final W k(AbstractC1759v abstractC1759v) {
        W e9;
        o6.j.e(abstractC1759v, "replacement");
        W H02 = abstractC1759v.H0();
        if (H02 instanceof AbstractC1754p) {
            e9 = H02;
        } else if (H02 instanceof z) {
            z zVar = (z) H02;
            e9 = AbstractC1741c.e(zVar, zVar.I0(true));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return AbstractC1741c.h(e9, H02);
    }

    @Override // w7.AbstractC1754p
    public final String toString() {
        return "(" + this.f16006e + ".." + this.f16007f + ')';
    }
}
