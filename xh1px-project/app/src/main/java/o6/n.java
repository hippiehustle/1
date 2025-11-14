package o6;

/* loaded from: classes.dex */
public final class n implements InterfaceC1285d {

    /* renamed from: d, reason: collision with root package name */
    public final Class f13638d;

    public n(Class cls) {
        j.e(cls, "jClass");
        this.f13638d = cls;
    }

    @Override // o6.InterfaceC1285d
    public final Class d() {
        return this.f13638d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            if (j.a(this.f13638d, ((n) obj).f13638d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13638d.hashCode();
    }

    public final String toString() {
        return this.f13638d + " (Kotlin reflection is not available)";
    }
}
