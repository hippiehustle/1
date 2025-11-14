package w7;

import h7.C0845h;
import h7.C0849l;
import x7.C1824f;

/* loaded from: classes.dex */
public final class r extends AbstractC1754p implements V {

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1754p f16008g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC1759v f16009h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AbstractC1754p abstractC1754p, AbstractC1759v abstractC1759v) {
        super(abstractC1754p.f16006e, abstractC1754p.f16007f);
        o6.j.e(abstractC1754p, "origin");
        o6.j.e(abstractC1759v, "enhancement");
        this.f16008g = abstractC1754p;
        this.f16009h = abstractC1759v;
    }

    @Override // w7.V
    public final AbstractC1759v C() {
        return this.f16009h;
    }

    @Override // w7.AbstractC1759v
    public final AbstractC1759v G0(C1824f c1824f) {
        o6.j.e(c1824f, "kotlinTypeRefiner");
        AbstractC1754p abstractC1754p = this.f16008g;
        o6.j.e(abstractC1754p, "type");
        AbstractC1759v abstractC1759v = this.f16009h;
        o6.j.e(abstractC1759v, "type");
        return new r(abstractC1754p, abstractC1759v);
    }

    @Override // w7.W
    public final W I0(boolean z8) {
        return AbstractC1741c.F(this.f16008g.I0(z8), this.f16009h.H0().I0(z8));
    }

    @Override // w7.W
    /* renamed from: J0 */
    public final W G0(C1824f c1824f) {
        o6.j.e(c1824f, "kotlinTypeRefiner");
        AbstractC1754p abstractC1754p = this.f16008g;
        o6.j.e(abstractC1754p, "type");
        AbstractC1759v abstractC1759v = this.f16009h;
        o6.j.e(abstractC1759v, "type");
        return new r(abstractC1754p, abstractC1759v);
    }

    @Override // w7.W
    public final W K0(G g8) {
        o6.j.e(g8, "newAttributes");
        return AbstractC1741c.F(this.f16008g.K0(g8), this.f16009h);
    }

    @Override // w7.AbstractC1754p
    public final z L0() {
        return this.f16008g.L0();
    }

    @Override // w7.AbstractC1754p
    public final String M0(C0845h c0845h, C0845h c0845h2) {
        C0849l c0849l = c0845h2.f11449a;
        if (((Boolean) c0849l.f11502m.a(c0849l, C0849l.Y[11])).booleanValue()) {
            return c0845h.V(this.f16009h);
        }
        return this.f16008g.M0(c0845h, c0845h2);
    }

    @Override // w7.V
    public final W X() {
        return this.f16008g;
    }

    @Override // w7.AbstractC1754p
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f16009h + ")] " + this.f16008g;
    }
}
