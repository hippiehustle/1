package n2;

import Z7.Q;
import m1.InterfaceC1052b;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class p implements InterfaceC1052b {
    public static final o Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final long f12919a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12920b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12921c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12922d;

    public /* synthetic */ p(int i4, long j, long j5, long j8, long j9) {
        if (15 != (i4 & 15)) {
            Q.f(i4, 15, n.f12918a.d());
            throw null;
        }
        this.f12919a = j;
        this.f12920b = j5;
        this.f12921c = j8;
        this.f12922d = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f12919a == pVar.f12919a && this.f12920b == pVar.f12920b && this.f12921c == pVar.f12921c && this.f12922d == pVar.f12922d) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1052b
    public final long getId() {
        return this.f12919a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12922d) + AbstractC1149a.d(this.f12921c, AbstractC1149a.d(this.f12920b, Long.hashCode(this.f12919a) * 31, 31), 31);
    }

    public final String toString() {
        return "DumbScenarioStatsEntity(id=" + this.f12919a + ", scenarioId=" + this.f12920b + ", lastStartTimestampMs=" + this.f12921c + ", startCount=" + this.f12922d + ")";
    }

    public p(long j, long j5, long j8, long j9) {
        this.f12919a = j;
        this.f12920b = j5;
        this.f12921c = j8;
        this.f12922d = j9;
    }
}
