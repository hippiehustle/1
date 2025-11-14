package C4;

import android.graphics.Point;
import android.graphics.Rect;
import j2.C0902b;
import k2.C0952b;
import n1.AbstractC1149a;
import o6.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0952b f613a;

    /* renamed from: b, reason: collision with root package name */
    public final C0902b f614b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f615c;

    /* renamed from: d, reason: collision with root package name */
    public final Point f616d;

    /* renamed from: e, reason: collision with root package name */
    public final double f617e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f618f;

    public b(C0952b c0952b, C0902b c0902b, boolean z8, Point point, double d2, Rect rect) {
        j.e(c0952b, "event");
        this.f613a = c0952b;
        this.f614b = c0902b;
        this.f615c = z8;
        this.f616d = point;
        this.f617e = d2;
        this.f618f = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.f613a, bVar.f613a) && j.a(this.f614b, bVar.f614b) && this.f615c == bVar.f615c && j.a(this.f616d, bVar.f616d) && Double.compare(this.f617e, bVar.f617e) == 0 && j.a(this.f618f, bVar.f618f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f618f.hashCode() + ((Double.hashCode(this.f617e) + ((this.f616d.hashCode() + AbstractC1149a.c((this.f614b.hashCode() + (this.f613a.hashCode() * 31)) * 31, 31, this.f615c)) * 31)) * 31);
    }

    public final String toString() {
        return "DebugInfo(event=" + this.f613a + ", condition=" + this.f614b + ", isDetected=" + this.f615c + ", position=" + this.f616d + ", confidenceRate=" + this.f617e + ", conditionArea=" + this.f618f + ")";
    }
}
