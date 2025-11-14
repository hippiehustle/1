package Q2;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class p implements P2.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f4836a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f4837b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f4838c;

    public p(long j, PointF pointF, PointF pointF2) {
        this.f4836a = j;
        this.f4837b = pointF;
        this.f4838c = pointF2;
    }

    public static p a(p pVar, PointF pointF, PointF pointF2, int i4) {
        long j = pVar.f4836a;
        if ((i4 & 2) != 0) {
            pointF = pVar.f4837b;
        }
        if ((i4 & 4) != 0) {
            pointF2 = pVar.f4838c;
        }
        pVar.getClass();
        return new p(j, pointF, pointF2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f4836a == pVar.f4836a && o6.j.a(this.f4837b, pVar.f4837b) && o6.j.a(this.f4838c, pVar.f4838c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.f4836a) * 31;
        int i4 = 0;
        PointF pointF = this.f4837b;
        if (pointF == null) {
            hashCode = 0;
        } else {
            hashCode = pointF.hashCode();
        }
        int i8 = (hashCode2 + hashCode) * 31;
        PointF pointF2 = this.f4838c;
        if (pointF2 != null) {
            i4 = pointF2.hashCode();
        }
        return i8 + i4;
    }

    public final String toString() {
        return "SwipeDescription(swipeDurationMs=" + this.f4836a + ", from=" + this.f4837b + ", to=" + this.f4838c + ")";
    }
}
