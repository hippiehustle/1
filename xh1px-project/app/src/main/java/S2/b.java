package S2;

import android.graphics.RectF;

/* loaded from: classes.dex */
public abstract class b {
    public static boolean a(RectF rectF, float f8) {
        o6.j.e(rectF, "viewArea");
        if (rectF.height() > f8 && rectF.width() > f8) {
            return true;
        }
        return false;
    }
}
