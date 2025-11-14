package Q2;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class j implements P2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f4806a;

    /* renamed from: b, reason: collision with root package name */
    public final i f4807b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f4808c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4809d;

    public j(Bitmap bitmap, i iVar, Rect rect, Rect rect2) {
        o6.j.e(rect, "conditionPosition");
        this.f4806a = bitmap;
        this.f4807b = iVar;
        this.f4808c = rect;
        this.f4809d = rect2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (o6.j.a(this.f4806a, jVar.f4806a) && this.f4807b == jVar.f4807b && o6.j.a(this.f4808c, jVar.f4808c) && o6.j.a(this.f4809d, jVar.f4809d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        Bitmap bitmap = this.f4806a;
        if (bitmap == null) {
            hashCode = 0;
        } else {
            hashCode = bitmap.hashCode();
        }
        int hashCode2 = (this.f4808c.hashCode() + ((this.f4807b.hashCode() + (hashCode * 31)) * 31)) * 31;
        Rect rect = this.f4809d;
        if (rect != null) {
            i4 = rect.hashCode();
        }
        return hashCode2 + i4;
    }

    public final String toString() {
        return "ImageConditionDescription(conditionBitmap=" + this.f4806a + ", conditionDetectionType=" + this.f4807b + ", conditionPosition=" + this.f4808c + ", conditionDetectionArea=" + this.f4809d + ")";
    }
}
