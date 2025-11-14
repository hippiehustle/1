package k3;

/* renamed from: k3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0959f extends AbstractC0961h {

    /* renamed from: a, reason: collision with root package name */
    public final C0965l f11988a;

    public C0959f(C0965l c0965l) {
        this.f11988a = c0965l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0959f) && o6.j.a(this.f11988a, ((C0959f) obj).f11988a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11988a.hashCode();
    }

    public final String toString() {
        return "DumbActionItem(dumbActionDetails=" + this.f11988a + ")";
    }
}
