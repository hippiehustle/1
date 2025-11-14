package j4;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final int f11931a;

    public j(int i4) {
        this.f11931a = i4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof j) || this.f11931a != ((j) obj).f11931a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11931a);
    }

    public final String toString() {
        return A.j.j(this.f11931a, "HeaderItem(title=", ")");
    }
}
