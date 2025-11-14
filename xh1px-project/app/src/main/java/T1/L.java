package T1;

import m1.InterfaceC1052b;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class L implements InterfaceC1052b {

    /* renamed from: a, reason: collision with root package name */
    public final long f5533a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5534b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5535c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5536d;

    public L(long j, long j5, long j8, long j9) {
        this.f5533a = j;
        this.f5534b = j5;
        this.f5535c = j8;
        this.f5536d = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l6 = (L) obj;
        if (this.f5533a == l6.f5533a && this.f5534b == l6.f5534b && this.f5535c == l6.f5535c && this.f5536d == l6.f5536d) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1052b
    public final long getId() {
        return this.f5533a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5536d) + AbstractC1149a.d(this.f5535c, AbstractC1149a.d(this.f5534b, Long.hashCode(this.f5533a) * 31, 31), 31);
    }

    public final String toString() {
        return "ScenarioStatsEntity(id=" + this.f5533a + ", scenarioId=" + this.f5534b + ", lastStartTimestampMs=" + this.f5535c + ", startCount=" + this.f5536d + ")";
    }
}
