package I7;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2225a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f2226b;

    static {
        int[] iArr = new int[256];
        int i4 = 0;
        for (int i8 = 0; i8 < 256; i8++) {
            iArr[i8] = "0123456789abcdef".charAt(i8 & 15) | ("0123456789abcdef".charAt(i8 >> 4) << '\b');
        }
        f2225a = iArr;
        int[] iArr2 = new int[256];
        for (int i9 = 0; i9 < 256; i9++) {
            iArr2[i9] = "0123456789ABCDEF".charAt(i9 & 15) | ("0123456789ABCDEF".charAt(i9 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i10 = 0; i10 < 256; i10++) {
            iArr3[i10] = -1;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i11)] = i12;
            i11++;
            i12++;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i13)] = i14;
            i13++;
            i14++;
        }
        long[] jArr = new long[256];
        for (int i15 = 0; i15 < 256; i15++) {
            jArr[i15] = -1;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        int i18 = 0;
        while (i4 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i4)] = i18;
            i4++;
            i18++;
        }
        f2226b = jArr;
    }

    public static final void a(String str, int i4, int i8) {
        int i9 = i8 - i4;
        if (i9 >= 1) {
            if (i9 > 16) {
                int i10 = (i9 + i4) - 16;
                while (i4 < i10) {
                    if (str.charAt(i4) == '0') {
                        i4++;
                    } else {
                        StringBuilder j = AbstractC1149a.j(i4, "Expected the hexadecimal digit '0' at index ", ", but was '");
                        j.append(str.charAt(i4));
                        j.append("'.\nThe result won't fit the type being parsed.");
                        throw new NumberFormatException(j.toString());
                    }
                }
                return;
            }
            return;
        }
        String substring = str.substring(i4, i8);
        o6.j.d(substring, "substring(...)");
        throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i4 + ", but was \"" + substring + "\" of length " + i9);
    }

    public static long b(String str, int i4, int i8) {
        f fVar = f.f2230d;
        o6.j.e(fVar, "format");
        int length = str.length();
        if (i4 >= 0 && i8 <= length) {
            if (i4 <= i8) {
                if (fVar.f2233c.f2229a) {
                    a(str, i4, i8);
                    return c(str, i4, i8);
                }
                if (i8 - i4 > 0) {
                    a(str, i4, i8);
                    return c(str, i4, i8);
                }
                String substring = str.substring(i4, i8);
                o6.j.d(substring, "substring(...)");
                throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(substring));
            }
            throw new IllegalArgumentException(A.j.i(i4, i8, "startIndex: ", " > endIndex: "));
        }
        throw new IndexOutOfBoundsException("startIndex: " + i4 + ", endIndex: " + i8 + ", size: " + length);
    }

    public static final long c(String str, int i4, int i8) {
        long j = 0;
        while (i4 < i8) {
            long j5 = j << 4;
            char charAt = str.charAt(i4);
            if ((charAt >>> '\b') == 0) {
                long j8 = f2226b[charAt];
                if (j8 >= 0) {
                    j = j5 | j8;
                    i4++;
                }
            }
            StringBuilder j9 = AbstractC1149a.j(i4, "Expected a hexadecimal digit at index ", ", but was ");
            j9.append(str.charAt(i4));
            throw new NumberFormatException(j9.toString());
        }
        return j;
    }
}
