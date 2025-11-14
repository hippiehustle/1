package w7;

import x7.C1824f;

/* loaded from: classes.dex */
public final class C extends AbstractC1751m implements V {

    /* renamed from: e, reason: collision with root package name */
    public final z f15945e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1759v f15946f;

    public C(z zVar, AbstractC1759v abstractC1759v) {
        o6.j.e(zVar, "delegate");
        o6.j.e(abstractC1759v, "enhancement");
        this.f15945e = zVar;
        this.f15946f = abstractC1759v;
    }

    @Override // w7.V
    public final AbstractC1759v C() {
        return this.f15946f;
    }

    @Override // w7.z
    /* renamed from: L0 */
    public final z I0(boolean z8) {
        W F2 = AbstractC1741c.F(this.f15945e.I0(z8), this.f15946f.H0().I0(z8));
        o6.j.c(F2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (z) F2;
    }

    @Override // w7.z
    /* renamed from: M0 */
    public final z K0(G g8) {
        o6.j.e(g8, "newAttributes");
        W F2 = AbstractC1741c.F(this.f15945e.K0(g8), this.f15946f);
        o6.j.c(F2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (z) F2;
    }

    @Override // w7.AbstractC1751m
    public final z N0() {
        return this.f15945e;
    }

    @Override // w7.AbstractC1751m
    public final AbstractC1751m P0(z zVar) {
        return new C(zVar, this.f15946f);
    }

    @Override // w7.AbstractC1751m
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final C G0(C1824f c1824f) {
        o6.j.e(c1824f, "kotlinTypeRefiner");
        z zVar = this.f15945e;
        o6.j.e(zVar, "type");
        AbstractC1759v abstractC1759v = this.f15946f;
        o6.j.e(abstractC1759v, "type");
        return new C(zVar, abstractC1759v);
    }

    @Override // w7.V
    public final W X() {
        return this.f15945e;
    }

    @Override // w7.z
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f15946f + ")] " + this.f15945e;
    }
}
