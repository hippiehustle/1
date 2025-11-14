package Z4;

import j2.C0902b;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f7433a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7434b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7435c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7436d;

    /* renamed from: e, reason: collision with root package name */
    public final C0902b f7437e;

    public f(long j, String str, int i4, int i8, C0902b c0902b) {
        o6.j.e(str, "eventName");
        this.f7433a = j;
        this.f7434b = str;
        this.f7435c = i4;
        this.f7436d = i8;
        this.f7437e = c0902b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f7433a == fVar.f7433a && o6.j.a(this.f7434b, fVar.f7434b) && this.f7435c == fVar.f7435c && this.f7436d == fVar.f7436d && o6.j.a(this.f7437e, fVar.f7437e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b4 = AbstractC1149a.b(this.f7436d, AbstractC1149a.b(this.f7435c, A.j.c(this.f7434b, Long.hashCode(this.f7433a) * 31, 31), 31), 31);
        C0902b c0902b = this.f7437e;
        if (c0902b == null) {
            hashCode = 0;
        } else {
            hashCode = c0902b.hashCode();
        }
        return b4 + hashCode;
    }

    public final String toString() {
        return "EventItem(id=" + this.f7433a + ", eventName=" + this.f7434b + ", actionsCount=" + this.f7435c + ", conditionsCount=" + this.f7436d + ", firstCondition=" + this.f7437e + ")";
    }
}
