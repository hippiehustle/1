package G5;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f1792a;

    public j(float f8) {
        this.f1792a = f8;
    }

    @Override // G5.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f1792a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && this.f1792a == ((j) obj).f1792a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1792a)});
    }
}
