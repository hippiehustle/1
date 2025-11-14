package w7;

/* renamed from: w7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1745g {

    /* renamed from: a, reason: collision with root package name */
    public final D6.j f15994a;

    public C1745g(D6.j jVar) {
        o6.j.e(jVar, "annotations");
        this.f15994a = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1745g)) {
            return false;
        }
        return o6.j.a(((C1745g) obj).f15994a, this.f15994a);
    }

    public final int hashCode() {
        return this.f15994a.hashCode();
    }
}
