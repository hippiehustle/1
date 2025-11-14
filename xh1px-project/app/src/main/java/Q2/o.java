package Q2;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f4828a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f4829b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f4830c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f4831d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f4832e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f4833f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4834g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4835h;

    public o(int i4, Paint paint, Paint paint2, Paint paint3, Paint paint4, Paint paint5, float f8, float f9) {
        this.f4828a = i4;
        this.f4829b = paint;
        this.f4830c = paint2;
        this.f4831d = paint3;
        this.f4832e = paint4;
        this.f4833f = paint5;
        this.f4834g = f8;
        this.f4835h = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f4828a == oVar.f4828a && o6.j.a(this.f4829b, oVar.f4829b) && o6.j.a(this.f4830c, oVar.f4830c) && o6.j.a(this.f4831d, oVar.f4831d) && o6.j.a(this.f4832e, oVar.f4832e) && o6.j.a(this.f4833f, oVar.f4833f) && Float.compare(this.f4834g, oVar.f4834g) == 0 && Float.compare(this.f4835h, oVar.f4835h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4835h) + ((Float.hashCode(this.f4834g) + ((this.f4833f.hashCode() + ((this.f4832e.hashCode() + ((this.f4831d.hashCode() + ((this.f4830c.hashCode() + ((this.f4829b.hashCode() + (Integer.hashCode(this.f4828a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SwipeBriefRendererStyle(backgroundColor=" + this.f4828a + ", linePaint=" + this.f4829b + ", outerFromPaint=" + this.f4830c + ", outerToPaint=" + this.f4831d + ", innerFromPaint=" + this.f4832e + ", innerToPaint=" + this.f4833f + ", outerRadiusPx=" + this.f4834g + ", innerRadiusPx=" + this.f4835h + ")";
    }
}
