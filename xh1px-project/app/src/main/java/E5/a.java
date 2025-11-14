package E5;

import H.b;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1245a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1246b = {R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1247c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1248d = {R.attr.state_selected};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1249e = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    public static final String f1250f = a.class.getSimpleName();

    public static int a(ColorStateList colorStateList, int[] iArr) {
        int i4;
        if (colorStateList != null) {
            i4 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i4 = 0;
        }
        return b.e(i4, Math.min(Color.alpha(i4) * 2, 255));
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f1249e, 0)) != 0) {
                Log.w(f1250f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean c(int[] iArr) {
        boolean z8 = false;
        boolean z9 = false;
        for (int i4 : iArr) {
            if (i4 == 16842910) {
                z8 = true;
            } else if (i4 == 16842908 || i4 == 16842919 || i4 == 16843623) {
                z9 = true;
            }
        }
        if (!z8 || !z9) {
            return false;
        }
        return true;
    }
}
