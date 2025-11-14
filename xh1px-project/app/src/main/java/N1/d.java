package N1;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f3715a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3716b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3717c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3718d;

    public d(int i4, int i8, long j, long j5) {
        this.f3715a = j;
        this.f3716b = j5;
        this.f3717c = i4;
        this.f3718d = i8;
    }

    public static d a(d dVar, long j, long j5, int i4, int i8, int i9) {
        if ((i9 & 1) != 0) {
            j = dVar.f3715a;
        }
        long j8 = j;
        if ((i9 & 2) != 0) {
            j5 = dVar.f3716b;
        }
        long j9 = j5;
        if ((i9 & 4) != 0) {
            i4 = dVar.f3717c;
        }
        int i10 = i4;
        if ((i9 & 8) != 0) {
            i8 = dVar.f3718d;
        }
        dVar.getClass();
        return new d(i10, i8, j8, j9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3715a == dVar.f3715a && this.f3716b == dVar.f3716b && this.f3717c == dVar.f3717c && this.f3718d == dVar.f3718d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3718d) + AbstractC1149a.b(this.f3717c, AbstractC1149a.d(this.f3716b, Long.hashCode(this.f3715a) * 31, 31), 31);
    }

    public final String toString() {
        return "QualityMetrics(lastServiceStartTimeMs=" + this.f3715a + ", lastScenarioStartTimeMs=" + this.f3716b + ", accessibilityLossCount=" + this.f3717c + ", troubleshootingDisplayCount=" + this.f3718d + ")";
    }
}
