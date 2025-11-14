package Q2;

/* loaded from: classes.dex */
public final class m implements P2.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f4821a;

    public m(long j) {
        this.f4821a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && this.f4821a == ((m) obj).f4821a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4821a);
    }

    public final String toString() {
        return "PauseDescription(pauseDurationMs=" + this.f4821a + ")";
    }
}
