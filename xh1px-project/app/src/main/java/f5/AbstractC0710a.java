package f5;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import i0.C0878a;
import n1.AbstractC1149a;

/* renamed from: f5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0710a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f10766a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final C0878a f10767b = new C0878a(1);

    /* renamed from: c, reason: collision with root package name */
    public static final C0878a f10768c = new C0878a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final C0878a f10769d = new i0.b(C0878a.f11747e);

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f10770e = new DecelerateInterpolator();

    public static float a(float f8, float f9, float f10) {
        return AbstractC1149a.a(f9, f8, f10, f8);
    }

    public static float b(float f8, float f9, float f10, float f11, float f12) {
        if (f12 <= f10) {
            return f8;
        }
        if (f12 >= f11) {
            return f9;
        }
        return a(f8, f9, (f12 - f10) / (f11 - f10));
    }

    public static int c(float f8, int i4, int i8) {
        return Math.round(f8 * (i8 - i4)) + i4;
    }
}
