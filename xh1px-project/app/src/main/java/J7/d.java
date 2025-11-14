package J7;

import java.io.Serializable;
import o6.j;

/* loaded from: classes.dex */
public final class d implements Comparable, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final d f2512f = new d(0, -31557014167219200L);

    /* renamed from: g, reason: collision with root package name */
    public static final d f2513g = new d(999999999, 31556889864403199L);

    /* renamed from: d, reason: collision with root package name */
    public final long f2514d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2515e;

    public d(int i4, long j) {
        this.f2514d = j;
        this.f2515e = i4;
        if (-31557014167219200L <= j && j < 31556889864403200L) {
        } else {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i4;
        d dVar = (d) obj;
        j.e(dVar, "other");
        long j = this.f2514d;
        long j5 = dVar.f2514d;
        if (j < j5) {
            i4 = -1;
        } else if (j == j5) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        if (i4 != 0) {
            return i4;
        }
        return j.f(this.f2515e, dVar.f2515e);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f2514d != dVar.f2514d || this.f2515e != dVar.f2515e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f2515e * 51) + Long.hashCode(this.f2514d);
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j5 = this.f2514d;
        long j8 = j5 / 86400;
        long j9 = 0;
        if ((j5 ^ 86400) < 0 && j8 * 86400 != j5) {
            j8--;
        }
        long j10 = j5 % 86400;
        int i4 = (int) (j10 + (86400 & (((j10 ^ 86400) & ((-j10) | j10)) >> 63)));
        long j11 = (j8 + 719528) - 60;
        if (j11 < 0) {
            long j12 = 146097;
            long j13 = ((j11 + 1) / j12) - 1;
            j = 0;
            j9 = 400 * j13;
            j11 += (-j13) * j12;
        } else {
            j = 0;
        }
        long j14 = 400;
        long j15 = ((j14 * j11) + 591) / 146097;
        long j16 = 365;
        long j17 = 4;
        long j18 = 100;
        long j19 = j11 - ((j15 / j14) + (((j15 / j17) + (j16 * j15)) - (j15 / j18)));
        if (j19 < j) {
            j15--;
            j19 = j11 - ((j15 / j14) + (((j15 / j17) + (j16 * j15)) - (j15 / j18)));
        }
        int i8 = (int) j19;
        int i9 = ((i8 * 5) + 2) / 153;
        int i10 = ((i9 + 2) % 12) + 1;
        int i11 = (i8 - (((i9 * 306) + 5) / 10)) + 1;
        int i12 = (int) (j15 + j9 + (i9 / 10));
        int i13 = i4 / 3600;
        int i14 = i4 - (i13 * 3600);
        int i15 = i14 / 60;
        int i16 = i14 - (i15 * 60);
        int i17 = 0;
        if (Math.abs(i12) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i12 >= 0) {
                sb2.append(i12 + 10000);
                j.d(sb2.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb2.append(i12 - 10000);
                j.d(sb2.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i12 >= 10000) {
                sb.append('+');
            }
            sb.append(i12);
        }
        sb.append('-');
        f.g(sb, sb, i10);
        sb.append('-');
        f.g(sb, sb, i11);
        sb.append('T');
        f.g(sb, sb, i13);
        sb.append(':');
        f.g(sb, sb, i15);
        sb.append(':');
        f.g(sb, sb, i16);
        int i18 = this.f2515e;
        if (i18 != 0) {
            sb.append('.');
            while (true) {
                int i19 = i17 + 1;
                iArr = f.f2516a;
                if (i18 % iArr[i19] != 0) {
                    break;
                }
                i17 = i19;
            }
            int i20 = i17 - (i17 % 3);
            String valueOf = String.valueOf((i18 / iArr[i20]) + iArr[9 - i20]);
            j.c(valueOf, "null cannot be cast to non-null type java.lang.String");
            String substring = valueOf.substring(1);
            j.d(substring, "substring(...)");
            sb.append(substring);
        }
        sb.append('Z');
        return sb.toString();
    }
}
