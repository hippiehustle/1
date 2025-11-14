package L6;

/* loaded from: classes.dex */
public final class N extends D2.f {

    /* renamed from: i, reason: collision with root package name */
    public final String f3072i;

    public N(String str) {
        o6.j.e(str, "name");
        this.f3072i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof N) && o6.j.a(this.f3072i, ((N) obj).f3072i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3072i.hashCode();
    }

    public final String toString() {
        return A.j.q(new StringBuilder("TypeAlias(name="), this.f3072i, ')');
    }
}
