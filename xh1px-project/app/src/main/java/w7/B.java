package w7;

/* loaded from: classes.dex */
public final class B extends AbstractC1752n {

    /* renamed from: f, reason: collision with root package name */
    public final G f15944f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(z zVar, G g8) {
        super(zVar);
        o6.j.e(g8, "attributes");
        this.f15944f = g8;
    }

    @Override // w7.AbstractC1751m
    public final AbstractC1751m P0(z zVar) {
        return new B(zVar, this.f15944f);
    }

    @Override // w7.AbstractC1751m, w7.AbstractC1759v
    public final G y0() {
        return this.f15944f;
    }
}
