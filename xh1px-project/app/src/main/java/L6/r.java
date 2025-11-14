package L6;

/* loaded from: classes.dex */
public final class r extends K {

    /* renamed from: a, reason: collision with root package name */
    public final C0134q f3160a;

    public r(C0134q c0134q) {
        this.f3160a = c0134q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r) && o6.j.a(this.f3160a, ((r) obj).f3160a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3160a.hashCode();
    }

    public final String toString() {
        return "AnnotationValue(" + this.f3160a + ')';
    }
}
