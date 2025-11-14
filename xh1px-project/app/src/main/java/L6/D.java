package L6;

/* loaded from: classes.dex */
public final class D extends C {

    /* renamed from: a, reason: collision with root package name */
    public final long f3050a;

    public D(long j) {
        this.f3050a = j;
    }

    @Override // L6.C
    public final Object a() {
        return Long.valueOf(this.f3050a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof D) && this.f3050a == ((D) obj).f3050a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3050a);
    }
}
