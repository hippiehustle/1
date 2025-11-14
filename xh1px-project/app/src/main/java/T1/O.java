package T1;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final int f5544a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5545b;

    public O(int i4, long j) {
        this.f5544a = i4;
        this.f5545b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o7 = (O) obj;
        if (this.f5544a == o7.f5544a && this.f5545b == o7.f5545b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5545b) + (Integer.hashCode(this.f5544a) * 31);
    }

    public final String toString() {
        return "TutorialSuccessEntity(tutorialIndex=" + this.f5544a + ", scenarioId=" + this.f5545b + ")";
    }
}
