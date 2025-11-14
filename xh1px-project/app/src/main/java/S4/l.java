package S4;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f5392a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5393b;

    public l(int i4, int i8) {
        this.f5392a = i4;
        this.f5393b = i8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (this.f5392a != lVar.f5392a || this.f5393b != lVar.f5393b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5393b) + (Integer.hashCode(this.f5392a) * 31);
    }

    public final String toString() {
        return "UiTutorialImage(imageResId=" + this.f5392a + ", imageDescResId=" + this.f5393b + ")";
    }
}
