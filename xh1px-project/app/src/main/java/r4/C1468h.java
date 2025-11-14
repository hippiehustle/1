package r4;

import g4.C0780b;

/* renamed from: r4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1468h extends AbstractC1469i {

    /* renamed from: a, reason: collision with root package name */
    public final String f14398a;

    /* renamed from: b, reason: collision with root package name */
    public final C0780b f14399b;

    public C1468h(String str, C0780b c0780b) {
        o6.j.e(str, "name");
        this.f14398a = str;
        this.f14399b = c0780b;
    }

    @Override // r4.AbstractC1469i
    public final String a() {
        return this.f14398a;
    }

    @Override // r4.AbstractC1469i
    public final E2.d b() {
        return this.f14399b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1468h)) {
            return false;
        }
        C1468h c1468h = (C1468h) obj;
        if (o6.j.a(this.f14398a, c1468h.f14398a) && o6.j.a(this.f14399b, c1468h.f14399b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14399b.hashCode() + (this.f14398a.hashCode() * 31);
    }

    public final String toString() {
        return "Trigger(name=" + this.f14398a + ", uiEvent=" + this.f14399b + ")";
    }
}
