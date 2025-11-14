package M5;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import m.C1039b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3492a = {R.attr.theme, com.buzbuz.smartautoclicker.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3493b = {com.buzbuz.smartautoclicker.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i4, int i8) {
        boolean z8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3493b, i4, i8);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if ((context instanceof C1039b) && ((C1039b) context).f12317a == resourceId) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (resourceId != 0 && !z8) {
            C1039b c1039b = new C1039b(context, resourceId);
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f3492a);
            int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
            int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
            if (resourceId2 == 0) {
                resourceId2 = resourceId3;
            }
            if (resourceId2 != 0) {
                c1039b.getTheme().applyStyle(resourceId2, true);
            }
            return c1039b;
        }
        return context;
    }
}
