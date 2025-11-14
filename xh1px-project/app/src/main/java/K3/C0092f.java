package K3;

/* renamed from: K3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092f {

    /* renamed from: a, reason: collision with root package name */
    public final int f2675a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2676b;

    public C0092f(int i4, boolean z8) {
        this.f2675a = i4;
        this.f2676b = z8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0092f) {
                C0092f c0092f = (C0092f) obj;
                if (this.f2675a != c0092f.f2675a || this.f2676b != c0092f.f2676b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2676b) + (Integer.hashCode(this.f2675a) * 31);
    }

    public final String toString() {
        return "BriefVisualizationState(focusedIndex=" + this.f2675a + ", gestureCaptureStarted=" + this.f2676b + ")";
    }
}
