package R3;

/* loaded from: classes.dex */
public final class y extends A {

    /* renamed from: a, reason: collision with root package name */
    public final D2.d f5113a;

    /* renamed from: b, reason: collision with root package name */
    public final D2.d f5114b;

    public y(D2.d dVar, D2.d dVar2) {
        o6.j.e(dVar, "typeItem");
        o6.j.e(dVar2, "value");
        this.f5113a = dVar;
        this.f5114b = dVar2;
    }

    @Override // R3.A
    public final D2.d a() {
        return this.f5113a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (o6.j.a(this.f5113a, yVar.f5113a) && o6.j.a(this.f5114b, yVar.f5114b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5114b.hashCode() + (this.f5113a.hashCode() * 31);
    }

    public final String toString() {
        return "BooleanInputTypeSelected(typeItem=" + this.f5113a + ", value=" + this.f5114b + ")";
    }
}
