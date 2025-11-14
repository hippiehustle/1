package F4;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f1395a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1396b;

    public k(int i4, int i8) {
        this.f1395a = i4;
        this.f1396b = i8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (this.f1395a != kVar.f1395a || this.f1396b != kVar.f1396b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1396b) + (Integer.hashCode(this.f1395a) * 31);
    }

    public final String toString() {
        return "TutorialInfo(nameResId=" + this.f1395a + ", descResId=" + this.f1396b + ")";
    }
}
