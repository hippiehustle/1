package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: o.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1216u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f13388b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C1216u f13389c;

    /* renamed from: a, reason: collision with root package name */
    public L0 f13390a;

    public static synchronized C1216u a() {
        C1216u c1216u;
        synchronized (C1216u.class) {
            try {
                if (f13389c == null) {
                    d();
                }
                c1216u = f13389c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1216u;
    }

    public static synchronized PorterDuffColorFilter c(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter e9;
        synchronized (C1216u.class) {
            e9 = L0.e(i4, mode);
        }
        return e9;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [o.u, java.lang.Object] */
    public static synchronized void d() {
        synchronized (C1216u.class) {
            if (f13389c == null) {
                ?? obj = new Object();
                f13389c = obj;
                obj.f13390a = L0.b();
                L0 l02 = f13389c.f13390a;
                F3.a aVar = new F3.a();
                synchronized (l02) {
                    l02.f13107e = aVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, c1 c1Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = L0.f13100f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z8 = c1Var.f13238d;
            if (!z8 && !c1Var.f13237c) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z8) {
                colorStateList = c1Var.f13235a;
            } else {
                colorStateList = null;
            }
            if (c1Var.f13237c) {
                mode = c1Var.f13236b;
            } else {
                mode = L0.f13100f;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = L0.e(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
    }

    public final synchronized Drawable b(Context context, int i4) {
        return this.f13390a.c(context, i4);
    }
}
