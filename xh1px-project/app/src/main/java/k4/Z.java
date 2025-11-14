package k4;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f12075a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f12076b;

    public Z(Rect rect, Rect rect2) {
        o6.j.e(rect, "initialArea");
        o6.j.e(rect2, "minimalArea");
        this.f12075a = rect;
        this.f12076b = rect2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z8 = (Z) obj;
        if (o6.j.a(this.f12075a, z8.f12075a) && o6.j.a(this.f12076b, z8.f12076b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12076b.hashCode() + (this.f12075a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectorUiState(initialArea=" + this.f12075a + ", minimalArea=" + this.f12076b + ")";
    }
}
