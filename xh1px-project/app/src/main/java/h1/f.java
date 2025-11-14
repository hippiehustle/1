package h1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f11322a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11323b;

    public f(long j, long j5) {
        this.f11322a = j;
        this.f11323b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f11322a == fVar.f11322a && this.f11323b == fVar.f11323b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11323b) + (Long.hashCode(this.f11322a) * 31);
    }

    public final String toString() {
        return "ScenarioStats(lastStartTimestampMs=" + this.f11322a + ", startCount=" + this.f11323b + ")";
    }
}
