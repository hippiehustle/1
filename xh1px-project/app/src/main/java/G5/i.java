package G5;

/* loaded from: classes.dex */
public final class i extends e {

    /* renamed from: f, reason: collision with root package name */
    public final f f1790f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1791g;

    public i(f fVar, float f8) {
        super(0);
        this.f1790f = fVar;
        this.f1791g = f8;
    }

    @Override // G5.e
    public final boolean q() {
        return true;
    }

    @Override // G5.e
    public final void r(float f8, float f9, float f10, v vVar) {
        this.f1790f.r(f8, f9 - this.f1791g, f10, vVar);
    }
}
