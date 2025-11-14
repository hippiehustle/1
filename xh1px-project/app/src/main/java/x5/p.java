package x5;

import P.D;
import P.F;
import P.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.appbar.MaterialToolbar;
import e5.AbstractC0645a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t0.C1536c;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f16216a = {R.attr.colorPrimary};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f16217b = {R.attr.colorPrimaryVariant};

    /* renamed from: c, reason: collision with root package name */
    public static final q f16218c = new q(0);

    public static void a(Context context, AttributeSet attributeSet, int i4, int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645a.f10630T, i4, i8);
        boolean z8 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z8) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f16217b, "Theme.MaterialComponents");
            }
        }
        c(context, f16216a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i8, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645a.f10630T, i4, i8);
        boolean z8 = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i4, i8);
            for (int i9 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i9, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z8 = true;
            obtainStyledAttributes.recycle();
            if (!z8) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
        }
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (!obtainStyledAttributes.hasValue(i4)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(A.j.p("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [x5.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void d(View view, s sVar) {
        WeakHashMap weakHashMap = O.f4214a;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        ?? obj = new Object();
        obj.f16220a = paddingStart;
        obj.f16221b = paddingTop;
        obj.f16222c = paddingEnd;
        obj.f16223d = paddingBottom;
        F.l(view, new C1536c(sVar, 22, (Object) obj));
        if (view.isAttachedToWindow()) {
            D.c(view);
        } else {
            view.addOnAttachStateChangeListener(new Object());
        }
    }

    public static ViewGroup e(View view) {
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView != view && (rootView instanceof ViewGroup)) {
            return (ViewGroup) rootView;
        }
        return null;
    }

    public static ArrayList f(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < materialToolbar.getChildCount(); i4++) {
            View childAt = materialToolbar.getChildAt(i4);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static boolean g(View view) {
        WeakHashMap weakHashMap = O.f4214a;
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static TypedArray h(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i8, int... iArr2) {
        a(context, attributeSet, i4, i8);
        b(context, attributeSet, iArr, i4, i8, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i4, i8);
    }

    public static R.g i(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i8, int... iArr2) {
        a(context, attributeSet, i4, i8);
        b(context, attributeSet, iArr, i4, i8, iArr2);
        return new R.g(context, context.obtainStyledAttributes(attributeSet, iArr, i4, i8));
    }

    public static PorterDuff.Mode j(int i4, PorterDuff.Mode mode) {
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
