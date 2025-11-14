package w7;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final C6.T f15968a;

    /* renamed from: b, reason: collision with root package name */
    public final U6.a f15969b;

    public L(C6.T t8, U6.a aVar) {
        o6.j.e(t8, "typeParameter");
        o6.j.e(aVar, "typeAttr");
        this.f15968a = t8;
        this.f15969b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof L)) {
            return false;
        }
        L l6 = (L) obj;
        if (!o6.j.a(l6.f15968a, this.f15968a) || !o6.j.a(l6.f15969b, this.f15969b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f15968a.hashCode();
        return this.f15969b.hashCode() + (hashCode * 31) + hashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f15968a + ", typeAttr=" + this.f15969b + ')';
    }
}
