package q4;

/* renamed from: q4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1397c {

    /* renamed from: a, reason: collision with root package name */
    public final int f14095a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14096b;

    public C1397c(int i4, boolean z8) {
        this.f14095a = i4;
        this.f14096b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1397c)) {
            return false;
        }
        C1397c c1397c = (C1397c) obj;
        if (this.f14095a == c1397c.f14095a && this.f14096b == c1397c.f14096b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14096b) + (Integer.hashCode(this.f14095a) * 31);
    }

    public final String toString() {
        return "EventChildrenItem(iconRes=" + this.f14095a + ", isInError=" + this.f14096b + ")";
    }
}
