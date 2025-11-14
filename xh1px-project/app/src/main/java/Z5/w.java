package Z5;

/* loaded from: classes.dex */
public final class w implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final short f7504d;

    public /* synthetic */ w(short s8) {
        this.f7504d = s8;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return o6.j.f(this.f7504d & 65535, ((w) obj).f7504d & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            if (this.f7504d != ((w) obj).f7504d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f7504d);
    }

    public final String toString() {
        return String.valueOf(this.f7504d & 65535);
    }
}
