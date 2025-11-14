package Z7;

/* renamed from: Z7.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0397s {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f7638e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final X7.f f7639a;

    /* renamed from: b, reason: collision with root package name */
    public final A1.o f7640b;

    /* renamed from: c, reason: collision with root package name */
    public long f7641c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f7642d;

    public C0397s(X7.f fVar, A1.o oVar) {
        o6.j.e(fVar, "descriptor");
        this.f7639a = fVar;
        this.f7640b = oVar;
        int c6 = fVar.c();
        if (c6 <= 64) {
            this.f7641c = c6 != 64 ? (-1) << c6 : 0L;
            this.f7642d = f7638e;
            return;
        }
        this.f7641c = 0L;
        int i4 = (c6 - 1) >>> 6;
        long[] jArr = new long[i4];
        if ((c6 & 63) != 0) {
            jArr[i4 - 1] = (-1) << c6;
        }
        this.f7642d = jArr;
    }
}
