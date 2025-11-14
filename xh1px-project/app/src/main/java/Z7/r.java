package Z7;

/* loaded from: classes.dex */
public final class r implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r f7634a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final X f7635b = new X("kotlin.time.Duration", X7.d.f7061m);

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        int i4 = J7.a.f2503g;
        String A2 = bVar.A();
        o6.j.e(A2, "value");
        try {
            return new J7.a(J7.f.a(A2));
        } catch (IllegalArgumentException e9) {
            throw new IllegalArgumentException(A.j.p("Invalid ISO duration string format: '", A2, "'."), e9);
        }
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        long j;
        long j5;
        int g8;
        int g9;
        boolean z8;
        boolean z9;
        long j8 = ((J7.a) obj).f2504d;
        int i4 = J7.a.f2503g;
        StringBuilder sb = new StringBuilder();
        if (j8 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        boolean z10 = true;
        if (j8 < 0) {
            j = ((-(j8 >> 1)) << 1) + (((int) j8) & 1);
            int i8 = J7.b.f2505a;
        } else {
            j = j8;
        }
        long g10 = J7.a.g(j, J7.c.HOURS);
        if (J7.a.e(j)) {
            j5 = 0;
            g8 = 0;
        } else {
            j5 = 0;
            g8 = (int) (J7.a.g(j, J7.c.MINUTES) % 60);
        }
        if (J7.a.e(j)) {
            g9 = 0;
        } else {
            g9 = (int) (J7.a.g(j, J7.c.SECONDS) % 60);
        }
        int d2 = J7.a.d(j);
        if (J7.a.e(j8)) {
            g10 = 9999999999999L;
        }
        if (g10 != j5) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (g9 == 0 && d2 == 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (g8 == 0 && (!z9 || !z8)) {
            z10 = false;
        }
        if (z8) {
            sb.append(g10);
            sb.append('H');
        }
        if (z10) {
            sb.append(g8);
            sb.append('M');
        }
        if (z9 || (!z8 && !z10)) {
            J7.a.b(sb, g9, d2, 9, "S", true);
        }
        cVar.t(sb.toString());
    }

    @Override // V7.a
    public final X7.f d() {
        return f7635b;
    }
}
