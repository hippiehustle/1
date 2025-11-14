package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import h.AbstractC0805a;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f13225a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f13226b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f13227c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f13228d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f13229e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f13230f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f13231g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0805a.j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i4) {
        ColorStateList d2 = d(context, i4);
        if (d2 != null && d2.isStateful()) {
            return d2.getColorForState(f13226b, d2.getDefaultColor());
        }
        ThreadLocal threadLocal = f13225a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f8 = typedValue.getFloat();
        return H.b.e(c(context, i4), Math.round(Color.alpha(r4) * f8));
    }

    public static int c(Context context, int i4) {
        int[] iArr = f13231g;
        iArr[0] = i4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i4) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f13231g;
        iArr[0] = i4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC1492c.o(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
