package k4;

/* renamed from: k4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0978j {

    /* renamed from: a, reason: collision with root package name */
    public final int f12100a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12101b;

    public C0978j(String str, int i4) {
        this.f12100a = i4;
        this.f12101b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0978j)) {
            return false;
        }
        C0978j c0978j = (C0978j) obj;
        if (this.f12100a == c0978j.f12100a && o6.j.a(this.f12101b, c0978j.f12101b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12101b.hashCode() + (Integer.hashCode(this.f12100a) * 31);
    }

    public final String toString() {
        return "DetectionTypeState(type=" + this.f12100a + ", areaText=" + this.f12101b + ")";
    }
}
