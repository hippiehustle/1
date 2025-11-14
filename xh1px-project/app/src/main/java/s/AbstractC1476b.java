package s;

import android.graphics.drawable.Drawable;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1476b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f14442a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f8, float f9, boolean z8) {
        if (z8) {
            return (float) (((1.0d - f14442a) * f9) + f8);
        }
        return f8;
    }

    public static float b(float f8, float f9, boolean z8) {
        if (z8) {
            return (float) (((1.0d - f14442a) * f9) + (f8 * 1.5f));
        }
        return f8 * 1.5f;
    }
}
