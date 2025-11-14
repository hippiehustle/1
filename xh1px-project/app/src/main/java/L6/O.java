package L6;

/* loaded from: classes.dex */
public final class O extends D2.f {

    /* renamed from: i, reason: collision with root package name */
    public final int f3073i;

    public O(int i4) {
        this.f3073i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof O) && this.f3073i == ((O) obj).f3073i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3073i);
    }

    public final String toString() {
        return "TypeParameter(id=" + this.f3073i + ')';
    }
}
