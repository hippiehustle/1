package H;

import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1846a = new ThreadLocal();

    public static int a(double d2, double d3, double d9) {
        double d10;
        double d11;
        double d12;
        int min;
        int min2;
        double d13 = (((-0.4986d) * d9) + (((-1.5372d) * d3) + (3.2406d * d2))) / 100.0d;
        double d14 = ((0.0415d * d9) + ((1.8758d * d3) + ((-0.9689d) * d2))) / 100.0d;
        double d15 = ((1.057d * d9) + (((-0.204d) * d3) + (0.0557d * d2))) / 100.0d;
        if (d13 > 0.0031308d) {
            d10 = (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d10 = d13 * 12.92d;
        }
        if (d14 > 0.0031308d) {
            d11 = (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d11 = d14 * 12.92d;
        }
        if (d15 > 0.0031308d) {
            d12 = (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d12 = d15 * 12.92d;
        }
        int round = (int) Math.round(d10 * 255.0d);
        int i4 = 0;
        if (round < 0) {
            min = 0;
        } else {
            min = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d11 * 255.0d);
        if (round2 < 0) {
            min2 = 0;
        } else {
            min2 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d12 * 255.0d);
        if (round3 >= 0) {
            i4 = Math.min(round3, 255);
        }
        return Color.rgb(min, min2, i4);
    }

    public static int b(float f8, int i4, int i8) {
        float f9 = 1.0f - f8;
        return Color.argb((int) ((Color.alpha(i8) * f8) + (Color.alpha(i4) * f9)), (int) ((Color.red(i8) * f8) + (Color.red(i4) * f9)), (int) ((Color.green(i8) * f8) + (Color.green(i4) * f9)), (int) ((Color.blue(i8) * f8) + (Color.blue(i4) * f9)));
    }

    public static int c(int i4, int i8) {
        int alpha = Color.alpha(i8);
        int alpha2 = Color.alpha(i4);
        int i9 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i9, d(Color.red(i4), alpha2, Color.red(i8), alpha, i9), d(Color.green(i4), alpha2, Color.green(i8), alpha, i9), d(Color.blue(i4), alpha2, Color.blue(i8), alpha, i9));
    }

    public static int d(int i4, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        return (((255 - i8) * (i9 * i10)) + ((i4 * 255) * i8)) / (i11 * 255);
    }

    public static int e(int i4, int i8) {
        if (i8 >= 0 && i8 <= 255) {
            return (i4 & 16777215) | (i8 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
