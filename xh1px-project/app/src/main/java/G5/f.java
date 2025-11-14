package G5;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: f, reason: collision with root package name */
    public final float f1751f;

    public f(float f8) {
        super(0);
        this.f1751f = f8 - 0.001f;
    }

    @Override // G5.e
    public final void r(float f8, float f9, float f10, v vVar) {
        double d2 = this.f1751f;
        float sqrt = (float) ((Math.sqrt(2.0d) * d2) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(d2, 2.0d) - Math.pow(sqrt, 2.0d));
        vVar.d(f9 - sqrt, ((float) (-((Math.sqrt(2.0d) * d2) - d2))) + sqrt2, 270.0f, 0.0f);
        vVar.c(f9, (float) (-((Math.sqrt(2.0d) * d2) - d2)));
        vVar.c(f9 + sqrt, ((float) (-((Math.sqrt(2.0d) * d2) - d2))) + sqrt2);
    }
}
