package o3;

/* renamed from: o3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1230a {

    /* renamed from: a, reason: collision with root package name */
    public final int f13442a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13443b;

    public C1230a(int i4, boolean z8) {
        this.f13442a = i4;
        this.f13443b = z8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1230a) {
                C1230a c1230a = (C1230a) obj;
                if (this.f13442a != c1230a.f13442a || this.f13443b != c1230a.f13443b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13443b) + (Integer.hashCode(this.f13442a) * 31);
    }

    public final String toString() {
        return "BriefVisualizationState(focusedIndex=" + this.f13442a + ", gestureCaptureStarted=" + this.f13443b + ")";
    }
}
