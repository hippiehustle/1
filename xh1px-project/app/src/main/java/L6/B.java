package L6;

/* loaded from: classes.dex */
public final class B extends K {

    /* renamed from: a, reason: collision with root package name */
    public final String f3049a;

    public B(String str) {
        o6.j.e(str, "className");
        this.f3049a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof B) && o6.j.a(this.f3049a, ((B) obj).f3049a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3049a.hashCode();
    }

    public final String toString() {
        return A.j.q(new StringBuilder("KClassValue("), this.f3049a, ')');
    }
}
