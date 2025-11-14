package G;

/* loaded from: classes.dex */
public final class o {
    public static final o k;

    /* renamed from: a, reason: collision with root package name */
    public final float f1679a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1680b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1681c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1682d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1683e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1684f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f1685g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1686h;

    /* renamed from: i, reason: collision with root package name */
    public final float f1687i;
    public final float j;

    static {
        float f8;
        float[] fArr = b.f1643c;
        float l6 = (float) ((b.l() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f1641a;
        float f9 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f10 = fArr3[0] * f9;
        float f11 = fArr[1];
        float f12 = (fArr3[1] * f11) + f10;
        float f13 = fArr[2];
        float f14 = (fArr3[2] * f13) + f12;
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f11) + (fArr4[0] * f9);
        float[] fArr5 = fArr2[2];
        float f16 = (f13 * fArr5[2]) + (f11 * fArr5[1]) + (f9 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f8 = 0.69f;
        } else {
            f8 = 0.655f;
        }
        float f17 = f8;
        float exp = (1.0f - (((float) Math.exp(((-l6) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d2 = exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float f18 = 1.0f / ((5.0f * l6) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(l6 * 5.0d))) + (f19 * l6);
        float l8 = b.l() / fArr[1];
        double d3 = l8;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * cbrt) * f16) / 100.0d, 0.42d)};
        float f21 = fArr6[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr6[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr6[2];
        float[] fArr7 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        k = new o(l8, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f17, 1.0f, new float[]{(((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public o(float f8, float f9, float f10, float f11, float f12, float f13, float[] fArr, float f14, float f15, float f16) {
        this.f1684f = f8;
        this.f1679a = f9;
        this.f1680b = f10;
        this.f1681c = f11;
        this.f1682d = f12;
        this.f1683e = f13;
        this.f1685g = fArr;
        this.f1686h = f14;
        this.f1687i = f15;
        this.j = f16;
    }
}
