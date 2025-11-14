package P6;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final r f4582d = new r(A.f4517f, 6);

    /* renamed from: a, reason: collision with root package name */
    public final A f4583a;

    /* renamed from: b, reason: collision with root package name */
    public final Z5.f f4584b;

    /* renamed from: c, reason: collision with root package name */
    public final A f4585c;

    public r(A a3, Z5.f fVar, A a4) {
        this.f4583a = a3;
        this.f4584b = fVar;
        this.f4585c = a4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f4583a == rVar.f4583a && o6.j.a(this.f4584b, rVar.f4584b) && this.f4585c == rVar.f4585c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.f4583a.hashCode() * 31;
        Z5.f fVar = this.f4584b;
        if (fVar == null) {
            i4 = 0;
        } else {
            i4 = fVar.f7481f;
        }
        return this.f4585c.hashCode() + ((hashCode + i4) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f4583a + ", sinceVersion=" + this.f4584b + ", reportLevelAfter=" + this.f4585c + ')';
    }

    public r(A a3, int i4) {
        this(a3, (i4 & 2) != 0 ? new Z5.f(1, 0, 0) : null, a3);
    }
}
