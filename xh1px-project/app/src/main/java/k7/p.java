package k7;

import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class p extends r {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1759v f12151a;

    public p(AbstractC1759v abstractC1759v) {
        this.f12151a = abstractC1759v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p) && o6.j.a(this.f12151a, ((p) obj).f12151a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12151a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.f12151a + ')';
    }
}
