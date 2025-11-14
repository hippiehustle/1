package T4;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5790a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5791b;

    public m(boolean z8, boolean z9) {
        this.f5790a = z8;
        this.f5791b = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (this.f5790a != mVar.f5790a || this.f5791b != mVar.f5791b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5791b) + (Boolean.hashCode(this.f5790a) * 31);
    }

    public final String toString() {
        return "LocalServiceState(isStarted=" + this.f5790a + ", isSmartLoaded=" + this.f5791b + ")";
    }
}
