package A6;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final k f405a;

    /* renamed from: b, reason: collision with root package name */
    public final int f406b;

    public l(k kVar, int i4) {
        this.f405a = kVar;
        this.f406b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (o6.j.a(this.f405a, lVar.f405a) && this.f406b == lVar.f406b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f406b) + (this.f405a.hashCode() * 31);
    }

    public final String toString() {
        return "KindWithArity(kind=" + this.f405a + ", arity=" + this.f406b + ')';
    }
}
