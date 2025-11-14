package O2;

import android.graphics.PointF;
import o6.j;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f3855a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f3856b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3857c;

    public b(long j, PointF pointF, PointF pointF2) {
        j.e(pointF, "from");
        this.f3855a = pointF;
        this.f3856b = pointF2;
        this.f3857c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.f3855a, bVar.f3855a) && j.a(this.f3856b, bVar.f3856b) && this.f3857c == bVar.f3857c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3857c) + ((this.f3856b.hashCode() + (this.f3855a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Swipe(from=" + this.f3855a + ", to=" + this.f3856b + ", durationMs=" + this.f3857c + ")";
    }
}
