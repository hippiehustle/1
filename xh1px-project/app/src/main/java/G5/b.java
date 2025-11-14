package G5;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f1747a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1748b;

    public b(float f8, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f1747a;
            f8 += ((b) cVar).f1748b;
        }
        this.f1747a = cVar;
        this.f1748b = f8;
    }

    @Override // G5.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f1747a.a(rectF) + this.f1748b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1747a.equals(bVar.f1747a) && this.f1748b == bVar.f1748b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1747a, Float.valueOf(this.f1748b)});
    }
}
