package N7;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f3839a;

    public m(Throwable th) {
        this.f3839a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (o6.j.a(this.f3839a, ((m) obj).f3839a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f3839a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // N7.n
    public final String toString() {
        return "Closed(" + this.f3839a + ')';
    }
}
