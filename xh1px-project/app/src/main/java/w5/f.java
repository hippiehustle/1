package w5;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public FloatEvaluator f15742a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f8, Object obj, Object obj2) {
        float floatValue = this.f15742a.evaluate(f8, (Number) obj, (Number) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
