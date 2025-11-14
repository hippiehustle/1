package Q2;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f4775a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f4776b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f4777c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4778d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4779e;

    public b(int i4, Paint paint, Paint paint2, float f8, float f9) {
        this.f4775a = i4;
        this.f4776b = paint;
        this.f4777c = paint2;
        this.f4778d = f8;
        this.f4779e = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4775a == bVar.f4775a && o6.j.a(this.f4776b, bVar.f4776b) && o6.j.a(this.f4777c, bVar.f4777c) && Float.compare(this.f4778d, bVar.f4778d) == 0 && Float.compare(this.f4779e, bVar.f4779e) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4779e) + ((Float.hashCode(this.f4778d) + ((this.f4777c.hashCode() + ((this.f4776b.hashCode() + (Integer.hashCode(this.f4775a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClickBriefRendererStyle(backgroundColor=" + this.f4775a + ", outerPaint=" + this.f4776b + ", innerPaint=" + this.f4777c + ", outerRadiusPx=" + this.f4778d + ", innerRadiusPx=" + this.f4779e + ")";
    }
}
