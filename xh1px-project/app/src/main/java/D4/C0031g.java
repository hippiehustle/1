package D4;

/* renamed from: D4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031g {

    /* renamed from: a, reason: collision with root package name */
    public final String f957a;

    /* renamed from: b, reason: collision with root package name */
    public final C0030f f958b;

    public C0031g(String str, C0030f c0030f) {
        o6.j.e(str, "resultText");
        o6.j.e(c0030f, "detectionResults");
        this.f957a = str;
        this.f958b = c0030f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0031g)) {
            return false;
        }
        C0031g c0031g = (C0031g) obj;
        if (o6.j.a(this.f957a, c0031g.f957a) && o6.j.a(this.f958b, c0031g.f958b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f958b.hashCode() + (this.f957a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageConditionResultsDisplay(resultText=" + this.f957a + ", detectionResults=" + this.f958b + ")";
    }
}
