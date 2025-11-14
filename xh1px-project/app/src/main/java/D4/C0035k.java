package D4;

import k2.C0952b;
import l2.C1001a;

/* renamed from: D4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035k {

    /* renamed from: a, reason: collision with root package name */
    public final C1001a f966a;

    /* renamed from: b, reason: collision with root package name */
    public final C0952b f967b;

    public C0035k(C1001a c1001a, C0952b c0952b) {
        o6.j.e(c1001a, "scenario");
        o6.j.e(c0952b, "imageEvent");
        this.f966a = c1001a;
        this.f967b = c0952b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0035k)) {
            return false;
        }
        C0035k c0035k = (C0035k) obj;
        if (o6.j.a(this.f966a, c0035k.f966a) && o6.j.a(this.f967b, c0035k.f967b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f967b.hashCode() + (this.f966a.hashCode() * 31);
    }

    public final String toString() {
        return "TriedImageEvent(scenario=" + this.f966a + ", imageEvent=" + this.f967b + ")";
    }
}
