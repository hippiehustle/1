package L6;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f3119c = new a0(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final c0 f3120a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3121b;

    public a0(c0 c0Var, Y y4) {
        this.f3120a = c0Var;
        this.f3121b = y4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f3120a == a0Var.f3120a && o6.j.a(this.f3121b, a0Var.f3121b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        c0 c0Var = this.f3120a;
        if (c0Var == null) {
            hashCode = 0;
        } else {
            hashCode = c0Var.hashCode();
        }
        int i8 = hashCode * 31;
        Y y4 = this.f3121b;
        if (y4 != null) {
            i4 = y4.hashCode();
        }
        return i8 + i4;
    }

    public final String toString() {
        return "KmTypeProjection(variance=" + this.f3120a + ", type=" + this.f3121b + ')';
    }
}
