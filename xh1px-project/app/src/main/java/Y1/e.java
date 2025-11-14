package Y1;

import android.graphics.Point;
import o6.j;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Point f7105a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7106b;

    public e(Point point, int i4) {
        this.f7105a = point;
        this.f7106b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.f7105a, eVar.f7105a) && this.f7106b == eVar.f7106b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7106b) + (this.f7105a.hashCode() * 31);
    }

    public final String toString() {
        return "DisplayRoundedCorner(centerPx=" + this.f7105a + ", radiusPx=" + this.f7106b + ")";
    }
}
