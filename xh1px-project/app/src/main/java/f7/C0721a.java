package f7;

import I7.v;
import o6.j;

/* renamed from: f7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721a {

    /* renamed from: a, reason: collision with root package name */
    public final C0723c f10791a;

    /* renamed from: b, reason: collision with root package name */
    public final C0725e f10792b;

    static {
        C0725e c0725e = AbstractC0727g.f10813f;
        C0723c c0723c = C0723c.f10796c;
        E2.d.U(c0725e);
    }

    public C0721a(C0723c c0723c, C0725e c0725e) {
        j.e(c0723c, "packageName");
        this.f10791a = c0723c;
        this.f10792b = c0725e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0721a) {
                C0721a c0721a = (C0721a) obj;
                if (j.a(this.f10791a, c0721a.f10791a) && this.f10792b.equals(c0721a.f10792b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10792b.hashCode() + ((this.f10791a.hashCode() + 527) * 961);
    }

    public final String toString() {
        return v.Y(this.f10791a.f10797a.f10800a, '.', '/') + "/" + this.f10792b;
    }
}
