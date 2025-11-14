package B2;

import o6.j;

/* loaded from: classes.dex */
public final class d extends E2.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f448d;

    public d(String str) {
        this.f448d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && j.a(this.f448d, ((d) obj).f448d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f448d.hashCode();
    }

    public final String toString() {
        return A.j.p("Loading(text=", this.f448d, ")");
    }
}
