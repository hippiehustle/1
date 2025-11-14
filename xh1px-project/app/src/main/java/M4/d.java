package M4;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f3487a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3488b;

    public d(int i4, int i8) {
        this.f3487a = i4;
        this.f3488b = i8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f3487a != dVar.f3487a || this.f3488b != dVar.f3488b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3488b) + (Integer.hashCode(this.f3487a) * 31);
    }

    public final String toString() {
        return "TutorialImage(tutorialImageResId=" + this.f3487a + ", tutorialImageDescResId=" + this.f3488b + ")";
    }
}
