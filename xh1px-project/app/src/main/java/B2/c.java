package B2;

import o6.j;

/* loaded from: classes.dex */
public final class c extends E2.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f447d;

    public c(String str) {
        this.f447d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && j.a(this.f447d, ((c) obj).f447d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f447d.hashCode();
    }

    public final String toString() {
        return A.j.p("Enabled(text=", this.f447d, ")");
    }
}
