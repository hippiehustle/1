package N3;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public final int f3749a;

    public f(int i4) {
        this.f3749a = i4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof f) || this.f3749a != ((f) obj).f3749a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3749a);
    }

    public final String toString() {
        return A.j.j(this.f3749a, "HeaderItem(title=", ")");
    }
}
