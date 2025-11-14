package s7;

import f7.C0722b;

/* renamed from: s7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1515f {

    /* renamed from: a, reason: collision with root package name */
    public final C0722b f14567a;

    /* renamed from: b, reason: collision with root package name */
    public final C1513d f14568b;

    public C1515f(C0722b c0722b, C1513d c1513d) {
        o6.j.e(c0722b, "classId");
        this.f14567a = c0722b;
        this.f14568b = c1513d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1515f) {
            if (o6.j.a(this.f14567a, ((C1515f) obj).f14567a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14567a.hashCode();
    }
}
