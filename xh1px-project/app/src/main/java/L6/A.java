package L6;

/* loaded from: classes.dex */
public final class A extends C {

    /* renamed from: a, reason: collision with root package name */
    public final int f3048a;

    public A(int i4) {
        this.f3048a = i4;
    }

    @Override // L6.C
    public final Object a() {
        return Integer.valueOf(this.f3048a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof A) && this.f3048a == ((A) obj).f3048a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3048a);
    }
}
