package w7;

import x7.C1824f;

/* renamed from: w7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1739a extends AbstractC1751m {

    /* renamed from: e, reason: collision with root package name */
    public final z f15987e;

    /* renamed from: f, reason: collision with root package name */
    public final z f15988f;

    public C1739a(z zVar, z zVar2) {
        o6.j.e(zVar, "delegate");
        o6.j.e(zVar2, "abbreviation");
        this.f15987e = zVar;
        this.f15988f = zVar2;
    }

    @Override // w7.z
    /* renamed from: M0 */
    public final z K0(G g8) {
        o6.j.e(g8, "newAttributes");
        return new C1739a(this.f15987e.K0(g8), this.f15988f);
    }

    @Override // w7.AbstractC1751m
    public final z N0() {
        return this.f15987e;
    }

    @Override // w7.AbstractC1751m
    public final AbstractC1751m P0(z zVar) {
        return new C1739a(zVar, this.f15988f);
    }

    @Override // w7.z
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final C1739a I0(boolean z8) {
        return new C1739a(this.f15987e.I0(z8), this.f15988f.I0(z8));
    }

    @Override // w7.AbstractC1751m
    /* renamed from: R0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C1739a G0(C1824f c1824f) {
        o6.j.e(c1824f, "kotlinTypeRefiner");
        z zVar = this.f15987e;
        o6.j.e(zVar, "type");
        z zVar2 = this.f15988f;
        o6.j.e(zVar2, "type");
        return new C1739a(zVar, zVar2);
    }
}
