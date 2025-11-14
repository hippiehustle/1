package L6;

/* renamed from: L6.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140x extends C {

    /* renamed from: a, reason: collision with root package name */
    public final double f3168a;

    public C0140x(double d2) {
        this.f3168a = d2;
    }

    @Override // L6.C
    public final Object a() {
        return Double.valueOf(this.f3168a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0140x) && Double.compare(this.f3168a, ((C0140x) obj).f3168a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f3168a);
    }
}
