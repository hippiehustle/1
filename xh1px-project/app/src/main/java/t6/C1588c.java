package t6;

/* renamed from: t6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1588c extends C1586a {

    /* renamed from: g, reason: collision with root package name */
    public static final C1588c f15130g = new C1586a(1, 0, 1);

    @Override // t6.C1586a
    public final boolean equals(Object obj) {
        if (obj instanceof C1588c) {
            if (!isEmpty() || !((C1588c) obj).isEmpty()) {
                C1588c c1588c = (C1588c) obj;
                if (this.f15123d == c1588c.f15123d && this.f15124e == c1588c.f15124e) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // t6.C1586a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f15123d * 31) + this.f15124e;
    }

    @Override // t6.C1586a
    public final boolean isEmpty() {
        if (this.f15123d > this.f15124e) {
            return true;
        }
        return false;
    }

    @Override // t6.C1586a
    public final String toString() {
        return this.f15123d + ".." + this.f15124e;
    }
}
