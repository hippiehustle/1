package g7;

/* renamed from: g7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0798g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11233a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11234b;

    public C0798g(int i4, Object obj) {
        this.f11233a = obj;
        this.f11234b = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0798g)) {
            return false;
        }
        C0798g c0798g = (C0798g) obj;
        if (this.f11233a != c0798g.f11233a || this.f11234b != c0798g.f11234b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f11233a) * 65535) + this.f11234b;
    }
}
