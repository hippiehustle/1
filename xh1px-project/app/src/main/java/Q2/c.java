package Q2;

import android.graphics.Bitmap;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class c implements P2.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f4780a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f4781b;

    /* renamed from: c, reason: collision with root package name */
    public final Bitmap f4782c;

    public /* synthetic */ c(long j, PointF pointF, int i4) {
        this((i4 & 1) != 0 ? 1L : j, (i4 & 2) != 0 ? null : pointF, (Bitmap) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4780a == cVar.f4780a && o6.j.a(this.f4781b, cVar.f4781b) && o6.j.a(this.f4782c, cVar.f4782c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.f4780a) * 31;
        int i4 = 0;
        PointF pointF = this.f4781b;
        if (pointF == null) {
            hashCode = 0;
        } else {
            hashCode = pointF.hashCode();
        }
        int i8 = (hashCode2 + hashCode) * 31;
        Bitmap bitmap = this.f4782c;
        if (bitmap != null) {
            i4 = bitmap.hashCode();
        }
        return i8 + i4;
    }

    public final String toString() {
        return "ClickDescription(pressDurationMs=" + this.f4780a + ", position=" + this.f4781b + ", imageConditionBitmap=" + this.f4782c + ")";
    }

    public c(long j, PointF pointF, Bitmap bitmap) {
        this.f4780a = j;
        this.f4781b = pointF;
        this.f4782c = bitmap;
    }
}
