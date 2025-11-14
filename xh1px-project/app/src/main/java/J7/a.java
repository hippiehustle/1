package J7;

import h4.AbstractC0832f;
import o6.j;

/* loaded from: classes.dex */
public final class a implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final long f2501e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f2502f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f2503g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final long f2504d;

    static {
        int i4 = b.f2505a;
        f2501e = f.d(4611686018427387903L);
        f2502f = f.d(-4611686018427387903L);
    }

    public static final long a(long j, long j5) {
        long j8 = 1000000;
        long j9 = j5 / j8;
        long j10 = j + j9;
        if (-4611686018426L <= j10 && j10 < 4611686018427L) {
            return f.f((j10 * j8) + (j5 - (j9 * j8)));
        }
        return f.d(AbstractC0832f.h(j10));
    }

    public static final void b(StringBuilder sb, int i4, int i8, int i9, String str, boolean z8) {
        CharSequence charSequence;
        sb.append(i4);
        if (i8 != 0) {
            sb.append('.');
            String valueOf = String.valueOf(i8);
            j.e(valueOf, "<this>");
            if (i9 >= 0) {
                if (i9 <= valueOf.length()) {
                    charSequence = valueOf.subSequence(0, valueOf.length());
                } else {
                    StringBuilder sb2 = new StringBuilder(i9);
                    int length = i9 - valueOf.length();
                    int i10 = 1;
                    if (1 <= length) {
                        while (true) {
                            sb2.append('0');
                            if (i10 == length) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                    sb2.append((CharSequence) valueOf);
                    charSequence = sb2;
                }
                String obj = charSequence.toString();
                int i11 = -1;
                int length2 = obj.length() - 1;
                if (length2 >= 0) {
                    while (true) {
                        int i12 = length2 - 1;
                        if (obj.charAt(length2) != '0') {
                            i11 = length2;
                            break;
                        } else if (i12 < 0) {
                            break;
                        } else {
                            length2 = i12;
                        }
                    }
                }
                int i13 = i11 + 1;
                if (!z8 && i13 < 3) {
                    sb.append((CharSequence) obj, 0, i13);
                } else {
                    sb.append((CharSequence) obj, 0, ((i11 + 3) / 3) * 3);
                }
            } else {
                throw new IllegalArgumentException(A.j.j(i9, "Desired length ", " is less than zero."));
            }
        }
        sb.append(str);
    }

    public static final long c(long j) {
        if ((((int) j) & 1) == 1 && !e(j)) {
            return j >> 1;
        }
        return g(j, c.MILLISECONDS);
    }

    public static final int d(long j) {
        long j5;
        if (e(j)) {
            return 0;
        }
        if ((((int) j) & 1) == 1) {
            j5 = ((j >> 1) % 1000) * 1000000;
        } else {
            j5 = (j >> 1) % 1000000000;
        }
        return (int) j5;
    }

    public static final boolean e(long j) {
        if (j != f2501e && j != f2502f) {
            return false;
        }
        return true;
    }

    public static final long f(long j, long j5) {
        if (e(j)) {
            if (e(j5) && (j5 ^ j) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j;
        }
        if (e(j5)) {
            return j5;
        }
        int i4 = ((int) j) & 1;
        if (i4 == (((int) j5) & 1)) {
            long j8 = (j >> 1) + (j5 >> 1);
            if (i4 == 0) {
                if (-4611686018426999999L <= j8 && j8 < 4611686018427000000L) {
                    return f.f(j8);
                }
                return f.d(j8 / 1000000);
            }
            return f.e(j8);
        }
        if (i4 == 1) {
            return a(j >> 1, j5 >> 1);
        }
        return a(j5 >> 1, j >> 1);
    }

    public static final long g(long j, c cVar) {
        c cVar2;
        j.e(cVar, "unit");
        if (j == f2501e) {
            return Long.MAX_VALUE;
        }
        if (j == f2502f) {
            return Long.MIN_VALUE;
        }
        long j5 = j >> 1;
        if ((((int) j) & 1) == 0) {
            cVar2 = c.NANOSECONDS;
        } else {
            cVar2 = c.MILLISECONDS;
        }
        j.e(cVar2, "sourceUnit");
        return cVar.f2511d.convert(j5, cVar2.f2511d);
    }

    public static String h(long j) {
        boolean z8;
        int g8;
        long j5;
        int g9;
        int g10;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        long j8 = j;
        if (j8 == 0) {
            return "0s";
        }
        if (j8 == f2501e) {
            return "Infinity";
        }
        if (j8 == f2502f) {
            return "-Infinity";
        }
        int i4 = 0;
        if (j8 < 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z8) {
            sb.append('-');
        }
        if (j8 < 0) {
            j8 = (((int) j8) & 1) + ((-(j8 >> 1)) << 1);
            int i8 = b.f2505a;
        }
        long g11 = g(j8, c.DAYS);
        if (e(j8)) {
            g8 = 0;
        } else {
            g8 = (int) (g(j8, c.HOURS) % 24);
        }
        if (e(j8)) {
            j5 = 0;
            g9 = 0;
        } else {
            j5 = 0;
            g9 = (int) (g(j8, c.MINUTES) % 60);
        }
        if (e(j8)) {
            g10 = 0;
        } else {
            g10 = (int) (g(j8, c.SECONDS) % 60);
        }
        int d2 = d(j8);
        if (g11 != j5) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (g8 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g9 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (g10 == 0 && d2 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z9) {
            sb.append(g11);
            sb.append('d');
            i4 = 1;
        }
        if (z10 || (z9 && (z11 || z12))) {
            int i9 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(g8);
            sb.append('h');
            i4 = i9;
        }
        if (z11 || (z12 && (z10 || z9))) {
            int i10 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(g9);
            sb.append('m');
            i4 = i10;
        }
        if (z12) {
            int i11 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            if (g10 == 0 && !z9 && !z10 && !z11) {
                if (d2 >= 1000000) {
                    b(sb, d2 / 1000000, d2 % 1000000, 6, "ms", false);
                } else if (d2 >= 1000) {
                    b(sb, d2 / 1000, d2 % 1000, 3, "us", false);
                } else {
                    sb.append(d2);
                    sb.append("ns");
                }
            } else {
                b(sb, g10, d2, 9, "s", false);
            }
            i4 = i11;
        }
        if (z8 && i4 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((a) obj).f2504d;
        long j5 = this.f2504d;
        long j8 = j5 ^ j;
        if (j8 >= 0 && (((int) j8) & 1) != 0) {
            int i4 = (((int) j5) & 1) - (((int) j) & 1);
            if (j5 < 0) {
                return -i4;
            }
            return i4;
        }
        if (j5 < j) {
            return -1;
        }
        if (j5 != j) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (this.f2504d != ((a) obj).f2504d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2504d);
    }

    public final String toString() {
        return h(this.f2504d);
    }
}
