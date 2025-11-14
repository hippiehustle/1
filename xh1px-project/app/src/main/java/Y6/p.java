package Y6;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f7237a;

    public p(String str) {
        this.f7237a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p) && o6.j.a(this.f7237a, ((p) obj).f7237a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7237a.hashCode();
    }

    public final String toString() {
        return A.j.q(new StringBuilder("MemberSignature(signature="), this.f7237a, ')');
    }
}
