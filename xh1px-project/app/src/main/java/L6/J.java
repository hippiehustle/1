package L6;

/* loaded from: classes.dex */
public final class J extends C {

    /* renamed from: a, reason: collision with root package name */
    public final short f3056a;

    public J(short s8) {
        this.f3056a = s8;
    }

    @Override // L6.C
    public final Object a() {
        return new Z5.w(this.f3056a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof J) && this.f3056a == ((J) obj).f3056a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f3056a);
    }
}
