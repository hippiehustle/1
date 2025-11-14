package s2;

import v2.InterfaceC1661a;

/* loaded from: classes.dex */
public final class o implements InterfaceC1661a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14492a;

    public o(boolean z8) {
        this.f14492a = z8;
    }

    @Override // v2.InterfaceC1661a
    public final boolean a() {
        return this.f14492a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof o) || this.f14492a != ((o) obj).f14492a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14492a);
    }

    public final String toString() {
        return "DefaultResult(isFulfilled=" + this.f14492a + ")";
    }
}
