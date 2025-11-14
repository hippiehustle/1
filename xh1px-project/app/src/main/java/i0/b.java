package i0;

import android.view.animation.Interpolator;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f11748a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11749b;

    public b(float[] fArr) {
        this.f11748a = fArr;
        this.f11749b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f8) {
        if (f8 >= 1.0f) {
            return 1.0f;
        }
        if (f8 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f11748a;
        int min = Math.min((int) ((fArr.length - 1) * f8), fArr.length - 2);
        float f9 = this.f11749b;
        float f10 = (f8 - (min * f9)) / f9;
        float f11 = fArr[min];
        return AbstractC1149a.a(fArr[min + 1], f11, f10, f11);
    }
}
