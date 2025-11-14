package W;

import Z.g;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6458a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f8) {
        switch (this.f6458a) {
            case 0:
            case g.FLOAT_FIELD_NUMBER /* 2 */:
            default:
                float f9 = f8 - 1.0f;
                return (f9 * f9 * f9 * f9 * f9) + 1.0f;
            case 1:
                return f8 * f8 * f8 * f8 * f8;
        }
    }
}
