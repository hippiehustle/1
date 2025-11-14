package Q2;

import android.graphics.Paint;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f4786a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4787b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4788c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f4789d;

    public e(int i4, int i8, float f8, Paint paint) {
        this.f4786a = i4;
        this.f4787b = i8;
        this.f4788c = f8;
        this.f4789d = paint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f4786a == eVar.f4786a && this.f4787b == eVar.f4787b && Float.compare(this.f4788c, eVar.f4788c) == 0 && o6.j.a(this.f4789d, eVar.f4789d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4789d.hashCode() + ((Float.hashCode(this.f4788c) + AbstractC1149a.b(this.f4787b, Integer.hashCode(this.f4786a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "DefaultBriefRendererStyle(backgroundColor=" + this.f4786a + ", iconColor=" + this.f4787b + ", iconSize=" + this.f4788c + ", outerPaint=" + this.f4789d + ")";
    }
}
