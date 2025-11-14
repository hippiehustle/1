package r6;

import h4.g;

/* renamed from: r6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1473d {

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1470a f14417d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [r6.a] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static {
        ?? r02;
        Integer num = j6.a.f11941a;
        if (num != null && num.intValue() < 34) {
            r02 = new C1471b();
        } else {
            r02 = new Object();
        }
        f14417d = r02;
    }

    public abstract int a(int i4);

    public float b() {
        return a(24) / 1.6777216E7f;
    }

    public abstract int c();

    public int d(int i4, int i8) {
        int c6;
        int i9;
        int i10;
        if (i8 > i4) {
            int i11 = i8 - i4;
            if (i11 > 0 || i11 == Integer.MIN_VALUE) {
                if (((-i11) & i11) == i11) {
                    i10 = a(31 - Integer.numberOfLeadingZeros(i11));
                    return i4 + i10;
                }
                do {
                    c6 = c() >>> 1;
                    i9 = c6 % i11;
                } while ((i11 - 1) + (c6 - i9) < 0);
                i10 = i9;
                return i4 + i10;
            }
            while (true) {
                int c9 = c();
                if (i4 <= c9 && c9 < i8) {
                    return c9;
                }
            }
        } else {
            throw new IllegalArgumentException(g.c(Integer.valueOf(i4), Integer.valueOf(i8)).toString());
        }
    }

    public long e() {
        return (c() << 32) + c();
    }

    public long f(long j, long j5) {
        long e9;
        long j8;
        long j9;
        int c6;
        if (j5 > j) {
            long j10 = j5 - j;
            if (j10 > 0) {
                if (((-j10) & j10) == j10) {
                    int i4 = (int) j10;
                    int i8 = (int) (j10 >>> 32);
                    if (i4 != 0) {
                        c6 = a(31 - Integer.numberOfLeadingZeros(i4));
                    } else if (i8 == 1) {
                        c6 = c();
                    } else {
                        j9 = (a(31 - Integer.numberOfLeadingZeros(i8)) << 32) + (c() & 4294967295L);
                        return j + j9;
                    }
                    j9 = c6 & 4294967295L;
                    return j + j9;
                }
                do {
                    e9 = e() >>> 1;
                    j8 = e9 % j10;
                } while ((j10 - 1) + (e9 - j8) < 0);
                j9 = j8;
                return j + j9;
            }
            while (true) {
                long e10 = e();
                if (j <= e10 && e10 < j5) {
                    return e10;
                }
            }
        } else {
            throw new IllegalArgumentException(g.c(Long.valueOf(j), Long.valueOf(j5)).toString());
        }
    }
}
