package I7;

import s3.AbstractC1492c;

/* loaded from: classes.dex */
public abstract class u extends t {
    public static final void T(String str) {
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static Integer U(String str) {
        boolean z8;
        int i4;
        int i8;
        o6.j.e(str, "<this>");
        AbstractC1492c.f(10);
        int length = str.length();
        if (length != 0) {
            int i9 = 0;
            char charAt = str.charAt(0);
            int i10 = -2147483647;
            if (o6.j.f(charAt, 48) < 0) {
                i4 = 1;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            i10 = Integer.MIN_VALUE;
                            z8 = true;
                        } else {
                            return null;
                        }
                    } else {
                        z8 = false;
                    }
                } else {
                    return null;
                }
            } else {
                z8 = false;
                i4 = 0;
            }
            int i11 = -59652323;
            while (i4 < length) {
                int digit = Character.digit((int) str.charAt(i4), 10);
                if (digit >= 0) {
                    if ((i9 < i11 && (i11 != -59652323 || i9 < (i11 = i10 / 10))) || (i8 = i9 * 10) < i10 + digit) {
                        return null;
                    }
                    i9 = i8 - digit;
                    i4++;
                } else {
                    return null;
                }
            }
            if (z8) {
                return Integer.valueOf(i9);
            }
            return Integer.valueOf(-i9);
        }
        return null;
    }

    public static Long V(String str) {
        boolean z8;
        o6.j.e(str, "<this>");
        AbstractC1492c.f(10);
        int length = str.length();
        if (length != 0) {
            int i4 = 0;
            char charAt = str.charAt(0);
            long j = -9223372036854775807L;
            if (o6.j.f(charAt, 48) < 0) {
                z8 = true;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            j = Long.MIN_VALUE;
                            i4 = 1;
                        } else {
                            return null;
                        }
                    } else {
                        z8 = false;
                        i4 = 1;
                    }
                } else {
                    return null;
                }
            } else {
                z8 = false;
            }
            long j5 = 0;
            long j8 = -256204778801521550L;
            while (i4 < length) {
                int digit = Character.digit((int) str.charAt(i4), 10);
                if (digit >= 0) {
                    if (j5 < j8) {
                        if (j8 == -256204778801521550L) {
                            j8 = j / 10;
                            if (j5 < j8) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    long j9 = j5 * 10;
                    long j10 = digit;
                    if (j9 < j + j10) {
                        return null;
                    }
                    j5 = j9 - j10;
                    i4++;
                } else {
                    return null;
                }
            }
            if (z8) {
                return Long.valueOf(j5);
            }
            return Long.valueOf(-j5);
        }
        return null;
    }
}
