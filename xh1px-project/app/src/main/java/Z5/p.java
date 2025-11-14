package Z5;

/* loaded from: classes.dex */
public final class p implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final byte f7497d;

    public /* synthetic */ p(byte b4) {
        this.f7497d = b4;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return o6.j.f(this.f7497d & 255, ((p) obj).f7497d & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            if (this.f7497d != ((p) obj).f7497d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f7497d);
    }

    public final String toString() {
        return String.valueOf(this.f7497d & 255);
    }
}
