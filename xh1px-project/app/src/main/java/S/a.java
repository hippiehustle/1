package S;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f5142a;

    /* renamed from: b, reason: collision with root package name */
    public int f5143b;

    /* renamed from: c, reason: collision with root package name */
    public float f5144c;

    /* renamed from: d, reason: collision with root package name */
    public float f5145d;

    /* renamed from: e, reason: collision with root package name */
    public long f5146e;

    /* renamed from: f, reason: collision with root package name */
    public long f5147f;

    /* renamed from: g, reason: collision with root package name */
    public long f5148g;

    /* renamed from: h, reason: collision with root package name */
    public float f5149h;

    /* renamed from: i, reason: collision with root package name */
    public int f5150i;

    public final float a(long j) {
        long j5 = this.f5146e;
        if (j < j5) {
            return 0.0f;
        }
        long j8 = this.f5148g;
        if (j8 >= 0 && j >= j8) {
            float f8 = this.f5149h;
            return (d.b(((float) (j - j8)) / this.f5150i, 0.0f, 1.0f) * f8) + (1.0f - f8);
        }
        return d.b(((float) (j - j5)) / this.f5142a, 0.0f, 1.0f) * 0.5f;
    }
}
