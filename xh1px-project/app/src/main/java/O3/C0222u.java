package O3;

import g2.C0777a;

/* renamed from: O3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222u extends AbstractC0223v {

    /* renamed from: a, reason: collision with root package name */
    public final C0777a f3996a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3997b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3998c;

    public C0222u(C0777a c0777a, String str, String str2) {
        this.f3996a = c0777a;
        this.f3997b = str;
        this.f3998c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0222u)) {
            return false;
        }
        C0222u c0222u = (C0222u) obj;
        if (o6.j.a(this.f3996a, c0222u.f3996a) && o6.j.a(this.f3997b, c0222u.f3997b) && o6.j.a(this.f3998c, c0222u.f3998c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3998c.hashCode() + A.j.c(this.f3997b, this.f3996a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtraItem(extra=");
        sb.append(this.f3996a);
        sb.append(", name=");
        sb.append(this.f3997b);
        sb.append(", value=");
        return A.j.r(sb, this.f3998c, ")");
    }
}
