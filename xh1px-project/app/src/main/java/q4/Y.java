package q4;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final int f14088a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14089b;

    public Y(int i4, int i8) {
        this.f14088a = i4;
        this.f14089b = i8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Y) {
                Y y4 = (Y) obj;
                if (this.f14088a != y4.f14088a || this.f14089b != y4.f14089b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14089b) + (Integer.hashCode(this.f14088a) * 31);
    }

    public final String toString() {
        return "FieldTitles(titleRes=" + this.f14088a + ", emptyTitleRes=" + this.f14089b + ")";
    }
}
