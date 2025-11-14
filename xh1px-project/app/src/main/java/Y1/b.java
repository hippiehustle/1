package Y1;

import android.graphics.Point;
import java.util.Map;
import n1.AbstractC1149a;
import o6.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Point f7094a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7095b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7096c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f7097d;

    public b(Point point, int i4, int i8, Map map) {
        this.f7094a = point;
        this.f7095b = i4;
        this.f7096c = i8;
        this.f7097d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.f7094a, bVar.f7094a) && this.f7095b == bVar.f7095b && this.f7096c == bVar.f7096c && j.a(this.f7097d, bVar.f7097d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7097d.hashCode() + AbstractC1149a.b(this.f7096c, AbstractC1149a.b(this.f7095b, this.f7094a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DisplayConfig(sizePx=" + this.f7094a + ", orientation=" + this.f7095b + ", safeInsetTopPx=" + this.f7096c + ", roundedCorners=" + this.f7097d + ")";
    }
}
