package F4;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f1432a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1433b;

    public w(int i4, int i8) {
        this.f1432a = i4;
        this.f1433b = i8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                if (this.f1432a != wVar.f1432a || this.f1433b != wVar.f1433b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1433b) + (Integer.hashCode(this.f1432a) * 31);
    }

    public final String toString() {
        return "TutorialStepImage(imageResId=" + this.f1432a + ", imageDescResId=" + this.f1433b + ")";
    }
}
