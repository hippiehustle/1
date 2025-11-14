package k7;

/* loaded from: classes.dex */
public final class q extends r {

    /* renamed from: a, reason: collision with root package name */
    public final f f12152a;

    public q(f fVar) {
        this.f12152a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q) && o6.j.a(this.f12152a, ((q) obj).f12152a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12152a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.f12152a + ')';
    }
}
