package L6;

/* loaded from: classes.dex */
public final class E extends C {

    /* renamed from: a, reason: collision with root package name */
    public final short f3051a;

    public E(short s8) {
        this.f3051a = s8;
    }

    @Override // L6.C
    public final Object a() {
        return Short.valueOf(this.f3051a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof E) && this.f3051a == ((E) obj).f3051a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f3051a);
    }
}
