package L6;

/* loaded from: classes.dex */
public final class F extends C {

    /* renamed from: a, reason: collision with root package name */
    public final String f3052a;

    public F(String str) {
        o6.j.e(str, "value");
        this.f3052a = str;
    }

    @Override // L6.C
    public final Object a() {
        return this.f3052a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof F) && o6.j.a(this.f3052a, ((F) obj).f3052a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3052a.hashCode();
    }
}
