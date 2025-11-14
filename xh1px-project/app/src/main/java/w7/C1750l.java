package w7;

import z7.InterfaceC1888e;

/* renamed from: w7.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1750l extends AbstractC1751m implements InterfaceC1748j, InterfaceC1888e {

    /* renamed from: e, reason: collision with root package name */
    public final z f16001e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16002f;

    public C1750l(z zVar, boolean z8) {
        this.f16001e = zVar;
        this.f16002f = z8;
    }

    @Override // w7.AbstractC1751m, w7.AbstractC1759v
    public final boolean E0() {
        return false;
    }

    @Override // w7.z
    /* renamed from: L0 */
    public final z I0(boolean z8) {
        if (z8) {
            return this.f16001e.I0(z8);
        }
        return this;
    }

    @Override // w7.z
    /* renamed from: M0 */
    public final z K0(G g8) {
        o6.j.e(g8, "newAttributes");
        return new C1750l(this.f16001e.K0(g8), this.f16002f);
    }

    @Override // w7.AbstractC1751m
    public final z N0() {
        return this.f16001e;
    }

    @Override // w7.AbstractC1751m
    public final AbstractC1751m P0(z zVar) {
        return new C1750l(zVar, this.f16002f);
    }

    @Override // w7.InterfaceC1748j
    public final boolean V() {
        z zVar = this.f16001e;
        zVar.B0();
        if (zVar.B0().c() instanceof C6.T) {
            return true;
        }
        return false;
    }

    @Override // w7.InterfaceC1748j
    public final W k(AbstractC1759v abstractC1759v) {
        o6.j.e(abstractC1759v, "replacement");
        return AbstractC1741c.m(abstractC1759v.H0(), this.f16002f);
    }

    @Override // w7.z
    public final String toString() {
        return this.f16001e + " & Any";
    }
}
