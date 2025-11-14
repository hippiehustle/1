package L6;

/* loaded from: classes.dex */
public final class I extends C {

    /* renamed from: a, reason: collision with root package name */
    public final long f3055a;

    public I(long j) {
        this.f3055a = j;
    }

    @Override // L6.C
    public final Object a() {
        return new Z5.t(this.f3055a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof I) && this.f3055a == ((I) obj).f3055a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3055a);
    }
}
