package L6;

/* loaded from: classes.dex */
public final class M extends D2.f {

    /* renamed from: i, reason: collision with root package name */
    public final String f3071i;

    public M(String str) {
        o6.j.e(str, "name");
        this.f3071i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof M) && o6.j.a(this.f3071i, ((M) obj).f3071i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3071i.hashCode();
    }

    public final String toString() {
        return A.j.q(new StringBuilder("Class(name="), this.f3071i, ')');
    }
}
