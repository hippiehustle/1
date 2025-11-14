package b0;

/* renamed from: b0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0521f {

    /* renamed from: a, reason: collision with root package name */
    public double f9040a;

    /* renamed from: b, reason: collision with root package name */
    public double f9041b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9042c;

    /* renamed from: d, reason: collision with root package name */
    public double f9043d;

    /* renamed from: e, reason: collision with root package name */
    public double f9044e;

    /* renamed from: f, reason: collision with root package name */
    public double f9045f;

    /* renamed from: g, reason: collision with root package name */
    public double f9046g;

    /* renamed from: h, reason: collision with root package name */
    public double f9047h;

    /* renamed from: i, reason: collision with root package name */
    public double f9048i;
    public final C0519d j;

    /* JADX WARN: Type inference failed for: r0v5, types: [b0.d, java.lang.Object] */
    public C0521f() {
        this.f9040a = Math.sqrt(1500.0d);
        this.f9041b = 0.5d;
        this.f9042c = false;
        this.f9048i = Double.MAX_VALUE;
        this.j = new Object();
    }

    public final void a(float f8) {
        if (f8 > 0.0f) {
            this.f9040a = Math.sqrt(f8);
            this.f9042c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final C0519d b(double d2, double d3, long j) {
        double sin;
        double cos;
        if (!this.f9042c) {
            if (this.f9048i != Double.MAX_VALUE) {
                double d9 = this.f9041b;
                if (d9 > 1.0d) {
                    double d10 = this.f9040a;
                    this.f9045f = (Math.sqrt((d9 * d9) - 1.0d) * d10) + ((-d9) * d10);
                    double d11 = this.f9041b;
                    double d12 = this.f9040a;
                    this.f9046g = ((-d11) * d12) - (Math.sqrt((d11 * d11) - 1.0d) * d12);
                } else if (d9 >= 0.0d && d9 < 1.0d) {
                    this.f9047h = Math.sqrt(1.0d - (d9 * d9)) * this.f9040a;
                }
                this.f9042c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d13 = j / 1000.0d;
        double d14 = d2 - this.f9048i;
        double d15 = this.f9041b;
        if (d15 > 1.0d) {
            double d16 = this.f9046g;
            double d17 = ((d16 * d14) - d3) / (d16 - this.f9045f);
            double d18 = d14 - d17;
            sin = (Math.pow(2.718281828459045d, this.f9045f * d13) * d17) + (Math.pow(2.718281828459045d, d16 * d13) * d18);
            double d19 = this.f9046g;
            double pow = Math.pow(2.718281828459045d, d19 * d13) * d18 * d19;
            double d20 = this.f9045f;
            cos = (Math.pow(2.718281828459045d, d20 * d13) * d17 * d20) + pow;
        } else if (d15 == 1.0d) {
            double d21 = this.f9040a;
            double d22 = (d21 * d14) + d3;
            double d23 = (d22 * d13) + d14;
            double pow2 = Math.pow(2.718281828459045d, (-d21) * d13) * d23;
            double pow3 = Math.pow(2.718281828459045d, (-this.f9040a) * d13) * d23;
            double d24 = -this.f9040a;
            cos = (Math.pow(2.718281828459045d, d24 * d13) * d22) + (pow3 * d24);
            sin = pow2;
        } else {
            double d25 = 1.0d / this.f9047h;
            double d26 = this.f9040a;
            double d27 = ((d15 * d26 * d14) + d3) * d25;
            sin = ((Math.sin(this.f9047h * d13) * d27) + (Math.cos(this.f9047h * d13) * d14)) * Math.pow(2.718281828459045d, (-d15) * d26 * d13);
            double d28 = this.f9040a;
            double d29 = this.f9041b;
            double d30 = (-d28) * sin * d29;
            double pow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d13);
            double d31 = this.f9047h;
            double sin2 = Math.sin(d31 * d13) * (-d31) * d14;
            double d32 = this.f9047h;
            cos = (((Math.cos(d32 * d13) * d27 * d32) + sin2) * pow4) + d30;
        }
        float f8 = (float) (sin + this.f9048i);
        C0519d c0519d = this.j;
        c0519d.f9019a = f8;
        c0519d.f9020b = (float) cos;
        return c0519d;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [b0.d, java.lang.Object] */
    public C0521f(float f8) {
        this.f9040a = Math.sqrt(1500.0d);
        this.f9041b = 0.5d;
        this.f9042c = false;
        this.j = new Object();
        this.f9048i = f8;
    }
}
