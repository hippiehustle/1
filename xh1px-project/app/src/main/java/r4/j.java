package r4;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final int f14400a;

    public j(int i4) {
        this.f14400a = i4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof j) || this.f14400a != ((j) obj).f14400a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14400a);
    }

    public final String toString() {
        return A.j.j(this.f14400a, "Header(title=", ")");
    }
}
