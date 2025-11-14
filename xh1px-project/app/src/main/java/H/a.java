package H;

import android.graphics.BlendMode;
import android.graphics.Insets;
import android.graphics.Paint;
import android.os.Trace;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public abstract class a {
    public static boolean a() {
        return Trace.isEnabled();
    }

    public static Object b(int i4) {
        switch (AbstractC1769h.b(i4)) {
            case 0:
                return BlendMode.CLEAR;
            case 1:
                return BlendMode.SRC;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return BlendMode.DST;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return BlendMode.SRC_OVER;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return BlendMode.DST_OVER;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return BlendMode.SRC_IN;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return BlendMode.DST_IN;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return BlendMode.SRC_OUT;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return BlendMode.DST_OUT;
            case 9:
                return BlendMode.SRC_ATOP;
            case 10:
                return BlendMode.DST_ATOP;
            case 11:
                return BlendMode.XOR;
            case 12:
                return BlendMode.PLUS;
            case 13:
                return BlendMode.MODULATE;
            case 14:
                return BlendMode.SCREEN;
            case 15:
                return BlendMode.OVERLAY;
            case 16:
                return BlendMode.DARKEN;
            case 17:
                return BlendMode.LIGHTEN;
            case 18:
                return BlendMode.COLOR_DODGE;
            case 19:
                return BlendMode.COLOR_BURN;
            case 20:
                return BlendMode.HARD_LIGHT;
            case 21:
                return BlendMode.SOFT_LIGHT;
            case 22:
                return BlendMode.DIFFERENCE;
            case 23:
                return BlendMode.EXCLUSION;
            case 24:
                return BlendMode.MULTIPLY;
            case 25:
                return BlendMode.HUE;
            case 26:
                return BlendMode.SATURATION;
            case 27:
                return BlendMode.COLOR;
            case 28:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static Insets c(int i4, int i8, int i9, int i10) {
        return Insets.of(i4, i8, i9, i10);
    }

    public static void d(Paint paint, Object obj) {
        paint.setBlendMode((BlendMode) obj);
    }
}
