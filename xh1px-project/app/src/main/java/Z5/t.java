package Z5;

/* loaded from: classes.dex */
public final class t implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f7501d;

    public /* synthetic */ t(long j) {
        this.f7501d = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((t) obj).f7501d;
        long j5 = this.f7501d ^ Long.MIN_VALUE;
        long j8 = j ^ Long.MIN_VALUE;
        if (j5 < j8) {
            return -1;
        }
        if (j5 == j8) {
            return 0;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            if (this.f7501d != ((t) obj).f7501d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7501d);
    }

    public final String toString() {
        return a.e(10, this.f7501d);
    }
}
