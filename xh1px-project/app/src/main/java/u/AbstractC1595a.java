package u;

import o6.j;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1595a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f15143a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f15144b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f15145c = new Object[0];

    public static final int a(int i4, int i8, int[] iArr) {
        j.e(iArr, "array");
        int i9 = i4 - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i8) {
                i10 = i11 + 1;
            } else if (i12 > i8) {
                i9 = i11 - 1;
            } else {
                return i11;
            }
        }
        return ~i10;
    }

    public static final int b(long[] jArr, int i4, long j) {
        j.e(jArr, "array");
        int i8 = i4 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            long j5 = jArr[i10];
            if (j5 < j) {
                i9 = i10 + 1;
            } else if (j5 > j) {
                i8 = i10 - 1;
            } else {
                return i10;
            }
        }
        return ~i9;
    }
}
