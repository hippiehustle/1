package w3;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1692a {

    /* renamed from: a, reason: collision with root package name */
    public final long f15677a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15678b;

    public C1692a(long j, boolean z8) {
        this.f15677a = j;
        this.f15678b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1692a)) {
            return false;
        }
        C1692a c1692a = (C1692a) obj;
        if (this.f15677a == c1692a.f15677a && this.f15678b == c1692a.f15678b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15678b) + (Long.hashCode(this.f15677a) * 31);
    }

    public final String toString() {
        return "QSTileScenarioInfo(id=" + this.f15677a + ", isSmart=" + this.f15678b + ")";
    }
}
