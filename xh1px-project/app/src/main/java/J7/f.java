package J7;

import I7.m;
import I7.v;
import h4.AbstractC0832f;
import n6.InterfaceC1163b;
import o6.j;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2516a = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2517b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2518c = {3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2519d = {1, 2, 4, 5, 7, 8};

    public static final long a(String str) {
        int i4;
        boolean z8;
        c cVar;
        long e9;
        char charAt;
        int length = str.length();
        if (length != 0) {
            int i8 = a.f2503g;
            char charAt2 = str.charAt(0);
            if (charAt2 != '+' && charAt2 != '-') {
                i4 = 0;
            } else {
                i4 = 1;
            }
            if (i4 > 0 && m.q0(str, '-')) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (length > i4) {
                if (str.charAt(i4) == 'P') {
                    int i9 = i4 + 1;
                    if (i9 != length) {
                        c cVar2 = null;
                        long j = 0;
                        boolean z9 = false;
                        while (i9 < length) {
                            if (str.charAt(i9) == 'T') {
                                if (!z9 && (i9 = i9 + 1) != length) {
                                    z9 = true;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                int i10 = i9;
                                while (i10 < str.length() && (('0' <= (charAt = str.charAt(i10)) && charAt < ':') || m.c0("+-.", charAt))) {
                                    i10++;
                                }
                                String substring = str.substring(i9, i10);
                                j.d(substring, "substring(...)");
                                if (substring.length() != 0) {
                                    int length2 = substring.length() + i9;
                                    if (length2 >= 0 && length2 < str.length()) {
                                        char charAt3 = str.charAt(length2);
                                        int i11 = length2 + 1;
                                        if (!z9) {
                                            if (charAt3 == 'D') {
                                                cVar = c.DAYS;
                                            } else {
                                                throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                                            }
                                        } else if (charAt3 != 'H') {
                                            if (charAt3 != 'M') {
                                                if (charAt3 == 'S') {
                                                    cVar = c.SECONDS;
                                                } else {
                                                    throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                                                }
                                            } else {
                                                cVar = c.MINUTES;
                                            }
                                        } else {
                                            cVar = c.HOURS;
                                        }
                                        if (cVar2 != null && cVar2.compareTo(cVar) <= 0) {
                                            throw new IllegalArgumentException("Unexpected order of duration components");
                                        }
                                        int h02 = m.h0(substring, '.', 0, 6);
                                        if (cVar == c.SECONDS && h02 > 0) {
                                            String substring2 = substring.substring(0, h02);
                                            j.d(substring2, "substring(...)");
                                            long f8 = a.f(j, m(k(substring2), cVar));
                                            String substring3 = substring.substring(h02);
                                            j.d(substring3, "substring(...)");
                                            double parseDouble = Double.parseDouble(substring3);
                                            double b4 = b(parseDouble, cVar, c.NANOSECONDS);
                                            if (!Double.isNaN(b4)) {
                                                if (!Double.isNaN(b4)) {
                                                    long round = Math.round(b4);
                                                    if (-4611686018426999999L <= round && round < 4611686018427000000L) {
                                                        e9 = f(round);
                                                    } else {
                                                        double b9 = b(parseDouble, cVar, c.MILLISECONDS);
                                                        if (!Double.isNaN(b9)) {
                                                            e9 = e(Math.round(b9));
                                                        } else {
                                                            throw new IllegalArgumentException("Cannot round NaN value.");
                                                        }
                                                    }
                                                    j = a.f(f8, e9);
                                                } else {
                                                    throw new IllegalArgumentException("Cannot round NaN value.");
                                                }
                                            } else {
                                                throw new IllegalArgumentException("Duration value cannot be NaN.");
                                            }
                                        } else {
                                            j = a.f(j, m(k(substring), cVar));
                                        }
                                        cVar2 = cVar;
                                        i9 = i11;
                                    } else {
                                        throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                        if (z8) {
                            long j5 = ((-(j >> 1)) << 1) + (((int) j) & 1);
                            int i12 = b.f2505a;
                            return j5;
                        }
                        return j;
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("No components");
        }
        throw new IllegalArgumentException("The string is empty");
    }

    public static final double b(double d2, c cVar, c cVar2) {
        j.e(cVar2, "targetUnit");
        long convert = cVar2.f2511d.convert(1L, cVar.f2511d);
        if (convert > 0) {
            return d2 * convert;
        }
        return d2 / r8.convert(1L, r9);
    }

    public static final long c(long j, c cVar, c cVar2) {
        j.e(cVar, "sourceUnit");
        j.e(cVar2, "targetUnit");
        return cVar2.f2511d.convert(j, cVar.f2511d);
    }

    public static final long d(long j) {
        long j5 = (j << 1) + 1;
        int i4 = a.f2503g;
        int i8 = b.f2505a;
        return j5;
    }

    public static final long e(long j) {
        if (-4611686018426L <= j && j < 4611686018427L) {
            return f(j * 1000000);
        }
        return d(AbstractC0832f.h(j));
    }

    public static final long f(long j) {
        long j5 = j << 1;
        int i4 = a.f2503g;
        int i8 = b.f2505a;
        return j5;
    }

    public static final void g(StringBuilder sb, StringBuilder sb2, int i4) {
        if (i4 < 10) {
            sb.append('0');
        }
        sb2.append(i4);
    }

    public static final g h(String str, String str2, int i4, InterfaceC1163b interfaceC1163b) {
        char charAt = str.charAt(i4);
        if (((Boolean) interfaceC1163b.m(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return i(str, "Expected " + str2 + ", but got '" + charAt + "' at position " + i4);
    }

    public static final g i(String str, String str2) {
        return new g(str2 + " when parsing an Instant from \"" + n(str, 64) + '\"', str);
    }

    public static final int j(String str, int i4) {
        return (str.charAt(i4 + 1) - '0') + ((str.charAt(i4) - '0') * 10);
    }

    public static final long k(String str) {
        int i4;
        char charAt;
        int length = str.length();
        if (length > 0 && m.c0("+-", str.charAt(0))) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (length - i4 > 16) {
            int i8 = i4;
            while (true) {
                if (i4 < length) {
                    char charAt2 = str.charAt(i4);
                    if (charAt2 == '0') {
                        if (i8 == i4) {
                            i8++;
                        }
                    } else if ('1' > charAt2 || charAt2 >= ':') {
                        break;
                    }
                    i4++;
                } else if (length - i8 > 16) {
                    if (str.charAt(0) == '-') {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
            }
        }
        if (v.a0(str, "+") && length > 1 && '0' <= (charAt = str.charAt(1)) && charAt < ':') {
            return Long.parseLong(m.d0(str, 1));
        }
        return Long.parseLong(str);
    }

    public static final long l(int i4, c cVar) {
        j.e(cVar, "unit");
        if (cVar.compareTo(c.SECONDS) <= 0) {
            return f(c(i4, cVar, c.NANOSECONDS));
        }
        return m(i4, cVar);
    }

    public static final long m(long j, c cVar) {
        j.e(cVar, "unit");
        c cVar2 = c.NANOSECONDS;
        long c6 = c(4611686018426999999L, cVar2, cVar);
        if ((-c6) <= j && j <= c6) {
            return f(c(j, cVar, cVar2));
        }
        c cVar3 = c.MILLISECONDS;
        j.e(cVar3, "targetUnit");
        return d(AbstractC0832f.h(cVar3.f2511d.convert(j, cVar.f2511d)));
    }

    public static final String n(String str, int i4) {
        if (str.length() <= i4) {
            return str.toString();
        }
        return str.subSequence(0, i4).toString() + "...";
    }
}
