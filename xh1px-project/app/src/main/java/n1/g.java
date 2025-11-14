package n1;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f12850a = "id";

    /* renamed from: b, reason: collision with root package name */
    public final String f12851b = "INTEGER";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12852c = true;

    @Override // n1.i
    public final String a() {
        return this.f12850a;
    }

    @Override // n1.i
    public final String b() {
        return this.f12851b;
    }

    @Override // n1.i
    public final boolean c() {
        return this.f12852c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && o6.j.a(this.f12850a, ((g) obj).f12850a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12850a.hashCode();
    }

    public final String toString() {
        return A.j.p("PrimaryKey(name=", this.f12850a, ")");
    }
}
