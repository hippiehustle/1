package G5;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f1746a;

    public a(float f8) {
        this.f1746a = f8;
    }

    @Override // G5.c
    public final float a(RectF rectF) {
        return this.f1746a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f1746a == ((a) obj).f1746a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1746a)});
    }
}
