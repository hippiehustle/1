package H;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1852a = 0;

    static {
        new ThreadLocal();
    }

    public static void a(int i4, O0.a aVar) {
        PorterDuff.Mode mode;
        PorterDuffXfermode porterDuffXfermode = null;
        Object obj = null;
        if (Build.VERSION.SDK_INT >= 29) {
            if (i4 != 0) {
                obj = a.b(i4);
            }
            a.d(aVar, obj);
            return;
        }
        if (i4 != 0) {
            switch (AbstractC1769h.b(i4)) {
                case 0:
                    mode = PorterDuff.Mode.CLEAR;
                    break;
                case 1:
                    mode = PorterDuff.Mode.SRC;
                    break;
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    mode = PorterDuff.Mode.DST;
                    break;
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    mode = PorterDuff.Mode.SRC_OVER;
                    break;
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    mode = PorterDuff.Mode.DST_OVER;
                    break;
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    mode = PorterDuff.Mode.SRC_IN;
                    break;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    mode = PorterDuff.Mode.DST_IN;
                    break;
                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    mode = PorterDuff.Mode.SRC_OUT;
                    break;
                case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    mode = PorterDuff.Mode.DST_OUT;
                    break;
                case 9:
                    mode = PorterDuff.Mode.SRC_ATOP;
                    break;
                case 10:
                    mode = PorterDuff.Mode.DST_ATOP;
                    break;
                case 11:
                    mode = PorterDuff.Mode.XOR;
                    break;
                case 12:
                    mode = PorterDuff.Mode.ADD;
                    break;
                case 13:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 14:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 15:
                    mode = PorterDuff.Mode.OVERLAY;
                    break;
                case 16:
                    mode = PorterDuff.Mode.DARKEN;
                    break;
                case 17:
                    mode = PorterDuff.Mode.LIGHTEN;
                    break;
                default:
                    mode = null;
                    break;
            }
            if (mode != null) {
                porterDuffXfermode = new PorterDuffXfermode(mode);
            }
            aVar.setXfermode(porterDuffXfermode);
            return;
        }
        aVar.setXfermode(null);
    }
}
