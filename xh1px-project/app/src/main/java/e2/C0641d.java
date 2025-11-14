package e2;

/* renamed from: e2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0641d {

    /* renamed from: a, reason: collision with root package name */
    public final long f10599a;

    public C0641d(long j) {
        this.f10599a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0641d) && this.f10599a == ((C0641d) obj).f10599a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10599a);
    }

    public final String toString() {
        return "TutorialSuccessState(scenarioDatabaseId=" + this.f10599a + ")";
    }
}
