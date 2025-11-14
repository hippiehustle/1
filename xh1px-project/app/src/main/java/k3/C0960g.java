package k3;

/* renamed from: k3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0960g extends AbstractC0961h {

    /* renamed from: a, reason: collision with root package name */
    public final int f11989a;

    public C0960g(int i4) {
        this.f11989a = i4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C0960g) || this.f11989a != ((C0960g) obj).f11989a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11989a);
    }

    public final String toString() {
        return A.j.j(this.f11989a, "HeaderItem(title=", ")");
    }
}
