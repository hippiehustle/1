package N6;

import u6.InterfaceC1642c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1642c f3790a;

    public d(InterfaceC1642c interfaceC1642c) {
        o6.j.e(interfaceC1642c, "klass");
        this.f3790a = interfaceC1642c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (o6.j.a(this.f3790a, ((d) obj).f3790a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3790a.hashCode();
    }

    public final String toString() {
        return h2.a.k(this.f3790a).getName();
    }
}
