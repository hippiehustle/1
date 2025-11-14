package M3;

import android.graphics.Point;

/* renamed from: M3.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191y {

    /* renamed from: a, reason: collision with root package name */
    public final Point f3476a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC0192z f3477b;

    public C0191y(Point point, EnumC0192z enumC0192z) {
        o6.j.e(point, "offset");
        this.f3476a = point;
        this.f3477b = enumC0192z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0191y)) {
            return false;
        }
        C0191y c0191y = (C0191y) obj;
        if (o6.j.a(this.f3476a, c0191y.f3476a) && this.f3477b == c0191y.f3477b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3477b.hashCode() + (this.f3476a.hashCode() * 31);
    }

    public final String toString() {
        return "ClickOffsetState(offset=" + this.f3476a + ", updateFrom=" + this.f3477b + ")";
    }
}
