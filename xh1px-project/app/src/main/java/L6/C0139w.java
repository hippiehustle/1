package L6;

/* renamed from: L6.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139w extends C {

    /* renamed from: a, reason: collision with root package name */
    public final char f3167a;

    public C0139w(char c6) {
        this.f3167a = c6;
    }

    @Override // L6.C
    public final Object a() {
        return Character.valueOf(this.f3167a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0139w) && this.f3167a == ((C0139w) obj).f3167a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Character.hashCode(this.f3167a);
    }
}
