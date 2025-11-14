package D4;

import j2.C0902b;
import l2.C1001a;

/* renamed from: D4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034j {

    /* renamed from: a, reason: collision with root package name */
    public final C1001a f964a;

    /* renamed from: b, reason: collision with root package name */
    public final C0902b f965b;

    public C0034j(C1001a c1001a, C0902b c0902b) {
        o6.j.e(c1001a, "scenario");
        o6.j.e(c0902b, "imageCondition");
        this.f964a = c1001a;
        this.f965b = c0902b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0034j)) {
            return false;
        }
        C0034j c0034j = (C0034j) obj;
        if (o6.j.a(this.f964a, c0034j.f964a) && o6.j.a(this.f965b, c0034j.f965b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f965b.hashCode() + (this.f964a.hashCode() * 31);
    }

    public final String toString() {
        return "TriedImageCondition(scenario=" + this.f964a + ", imageCondition=" + this.f965b + ")";
    }
}
