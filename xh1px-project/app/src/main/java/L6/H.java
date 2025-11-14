package L6;

/* loaded from: classes.dex */
public final class H extends C {

    /* renamed from: a, reason: collision with root package name */
    public final int f3054a;

    public H(int i4) {
        this.f3054a = i4;
    }

    @Override // L6.C
    public final Object a() {
        return new Z5.r(this.f3054a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof H) && this.f3054a == ((H) obj).f3054a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3054a);
    }
}
