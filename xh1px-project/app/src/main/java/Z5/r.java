package Z5;

/* loaded from: classes.dex */
public final class r implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f7499d;

    public /* synthetic */ r(int i4) {
        this.f7499d = i4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return o6.j.f(this.f7499d ^ Integer.MIN_VALUE, ((r) obj).f7499d ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            if (this.f7499d != ((r) obj).f7499d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7499d);
    }

    public final String toString() {
        return String.valueOf(this.f7499d & 4294967295L);
    }
}
