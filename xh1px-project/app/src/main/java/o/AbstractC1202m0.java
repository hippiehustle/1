package o;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: o.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1202m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f13319a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f13320b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f13321c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29 && i4 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(f13320b);
            } else {
                drawable.setState(f13319a);
            }
            drawable.setState(state);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        int i4;
        int i8;
        int i9;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            Insets a3 = AbstractC1200l0.a(drawable);
            i4 = a3.left;
            i8 = a3.top;
            i9 = a3.right;
            i10 = a3.bottom;
            return new Rect(i4, i8, i9, i10);
        }
        boolean z8 = drawable instanceof I.c;
        Object obj = drawable;
        if (z8) {
            ((I.d) ((I.c) drawable)).getClass();
            obj = null;
        }
        if (i11 < 29) {
            if (AbstractC1198k0.f13292a) {
                try {
                    Object invoke = AbstractC1198k0.f13293b.invoke(obj, null);
                    if (invoke != null) {
                        return new Rect(AbstractC1198k0.f13294c.getInt(invoke), AbstractC1198k0.f13295d.getInt(invoke), AbstractC1198k0.f13296e.getInt(invoke), AbstractC1198k0.f13297f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        } else {
            boolean z9 = AbstractC1198k0.f13292a;
        }
        return f13321c;
    }

    public static PorterDuff.Mode c(int i4, PorterDuff.Mode mode) {
        if (i4 != 3) {
            if (i4 != 5) {
                if (i4 != 9) {
                    switch (i4) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
