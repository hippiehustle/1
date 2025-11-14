package Q2;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f4815a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f4816b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f4817c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4818d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4819e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4820f;

    public l(int i4, Paint paint, Paint paint2, float f8, float f9, float f10) {
        this.f4815a = i4;
        this.f4816b = paint;
        this.f4817c = paint2;
        this.f4818d = f8;
        this.f4819e = f9;
        this.f4820f = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f4815a == lVar.f4815a && o6.j.a(this.f4816b, lVar.f4816b) && o6.j.a(this.f4817c, lVar.f4817c) && Float.compare(this.f4818d, lVar.f4818d) == 0 && Float.compare(this.f4819e, lVar.f4819e) == 0 && Float.compare(this.f4820f, lVar.f4820f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4820f) + ((Float.hashCode(this.f4819e) + ((Float.hashCode(this.f4818d) + ((this.f4817c.hashCode() + ((this.f4816b.hashCode() + (Integer.hashCode(this.f4815a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PauseBriefRendererStyle(backgroundColor=" + this.f4815a + ", outerPaint=" + this.f4816b + ", linePaint=" + this.f4817c + ", thicknessPx=" + this.f4818d + ", outerRadiusPx=" + this.f4819e + ", innerRadiusPx=" + this.f4820f + ")";
    }
}
