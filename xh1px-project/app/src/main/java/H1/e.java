package H1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f1895a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1896b;

    public e(int i4, int i8) {
        this.f1895a = i4;
        this.f1896b = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f1895a == eVar.f1895a && this.f1896b == eVar.f1896b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1896b) + (Integer.hashCode(this.f1895a) * 31);
    }

    public final String toString() {
        return "OverlayTransition(viewId=" + this.f1895a + ", transitionType=" + this.f1896b + ")";
    }
}
