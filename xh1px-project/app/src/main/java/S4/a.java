package S4;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class a extends E2.d {

    /* renamed from: e, reason: collision with root package name */
    public final J2.a f5362e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f5363f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(J2.a aVar, Rect rect) {
        super(16);
        o6.j.e(aVar, "type");
        o6.j.e(rect, "position");
        this.f5362e = aVar;
        this.f5363f = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f5362e == aVar.f5362e && o6.j.a(this.f5363f, aVar.f5363f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5363f.hashCode() + (this.f5362e.hashCode() * 31);
    }

    @Override // E2.d
    public final String toString() {
        return "MonitoredView(type=" + this.f5362e + ", position=" + this.f5363f + ")";
    }
}
