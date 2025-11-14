package Z3;

/* renamed from: Z3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373h extends AbstractC0375j {

    /* renamed from: a, reason: collision with root package name */
    public final String f7379a;

    public C0373h(String str) {
        this.f7379a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0373h) && o6.j.a(this.f7379a, ((C0373h) obj).f7379a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7379a.hashCode();
    }

    public final String toString() {
        return A.j.p("Header(title=", this.f7379a, ")");
    }
}
