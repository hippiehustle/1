package O2;

import android.graphics.PointF;
import o6.j;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f3853a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3854b;

    public a(PointF pointF, long j) {
        j.e(pointF, "position");
        this.f3853a = pointF;
        this.f3854b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.f3853a, aVar.f3853a) && this.f3854b == aVar.f3854b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3854b) + (this.f3853a.hashCode() * 31);
    }

    public final String toString() {
        return "Click(position=" + this.f3853a + ", durationMs=" + this.f3854b + ")";
    }
}
