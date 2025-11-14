package w7;

/* loaded from: classes.dex */
public final class y extends AbstractC1752n {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16024f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z zVar, int i4) {
        super(zVar);
        this.f16024f = i4;
    }

    @Override // w7.AbstractC1751m, w7.AbstractC1759v
    public final boolean E0() {
        switch (this.f16024f) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // w7.AbstractC1751m
    public final AbstractC1751m P0(z zVar) {
        switch (this.f16024f) {
            case 0:
                return new y(zVar, 0);
            default:
                return new y(zVar, 1);
        }
    }
}
