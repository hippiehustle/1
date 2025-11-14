package D4;

import android.graphics.Rect;

/* renamed from: D4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f954a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f955b;

    /* renamed from: c, reason: collision with root package name */
    public final double f956c;

    public C0030f(boolean z8, Rect rect, double d2) {
        this.f954a = z8;
        this.f955b = rect;
        this.f956c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0030f)) {
            return false;
        }
        C0030f c0030f = (C0030f) obj;
        if (this.f954a == c0030f.f954a && o6.j.a(this.f955b, c0030f.f955b) && Double.compare(this.f956c, c0030f.f956c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f956c) + ((this.f955b.hashCode() + (Boolean.hashCode(this.f954a) * 31)) * 31);
    }

    public final String toString() {
        return "DetectionResultInfo(positive=" + this.f954a + ", coordinates=" + this.f955b + ", confidenceRate=" + this.f956c + ")";
    }
}
