package w7;

/* renamed from: w7.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1752n extends AbstractC1751m {

    /* renamed from: e, reason: collision with root package name */
    public final z f16003e;

    public AbstractC1752n(z zVar) {
        this.f16003e = zVar;
    }

    @Override // w7.z
    /* renamed from: L0 */
    public final z I0(boolean z8) {
        if (z8 == E0()) {
            return this;
        }
        return this.f16003e.I0(z8).K0(y0());
    }

    @Override // w7.z
    /* renamed from: M0 */
    public final z K0(G g8) {
        o6.j.e(g8, "newAttributes");
        if (g8 != y0()) {
            return new B(this, g8);
        }
        return this;
    }

    @Override // w7.AbstractC1751m
    public final z N0() {
        return this.f16003e;
    }
}
