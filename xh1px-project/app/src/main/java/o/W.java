package o;

import P.AbstractC0274w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import h.AbstractC0805a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f13136a;

    /* renamed from: b, reason: collision with root package name */
    public c1 f13137b;

    /* renamed from: c, reason: collision with root package name */
    public c1 f13138c;

    /* renamed from: d, reason: collision with root package name */
    public c1 f13139d;

    /* renamed from: e, reason: collision with root package name */
    public c1 f13140e;

    /* renamed from: f, reason: collision with root package name */
    public c1 f13141f;

    /* renamed from: g, reason: collision with root package name */
    public c1 f13142g;

    /* renamed from: h, reason: collision with root package name */
    public c1 f13143h;

    /* renamed from: i, reason: collision with root package name */
    public final C1188f0 f13144i;
    public int j = 0;
    public int k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f13145l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13146m;

    public W(TextView textView) {
        this.f13136a = textView;
        this.f13144i = new C1188f0(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, o.c1] */
    public static c1 c(Context context, C1216u c1216u, int i4) {
        ColorStateList f8;
        synchronized (c1216u) {
            f8 = c1216u.f13390a.f(context, i4);
        }
        if (f8 != null) {
            ?? obj = new Object();
            obj.f13238d = true;
            obj.f13235a = f8;
            return obj;
        }
        return null;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i4;
        int i8;
        CharSequence subSequence;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i9 >= 30) {
                R.b.a(editorInfo, text);
                return;
            }
            text.getClass();
            if (i9 >= 30) {
                R.b.a(editorInfo, text);
                return;
            }
            int i10 = editorInfo.initialSelStart;
            int i11 = editorInfo.initialSelEnd;
            if (i10 > i11) {
                i4 = i11;
            } else {
                i4 = i10;
            }
            if (i10 <= i11) {
                i10 = i11;
            }
            int length = text.length();
            if (i4 >= 0 && i10 <= length) {
                int i12 = editorInfo.inputType & 4095;
                if (i12 != 129 && i12 != 225 && i12 != 18) {
                    if (length <= 2048) {
                        R.c.a(editorInfo, text, i4, i10);
                        return;
                    }
                    int i13 = i10 - i4;
                    if (i13 > 1024) {
                        i8 = 0;
                    } else {
                        i8 = i13;
                    }
                    int i14 = 2048 - i8;
                    int min = Math.min(text.length() - i10, i14 - Math.min(i4, (int) (i14 * 0.8d)));
                    int min2 = Math.min(i4, i14 - min);
                    int i15 = i4 - min2;
                    if (Character.isLowSurrogate(text.charAt(i15))) {
                        i15++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i10 + min) - 1))) {
                        min--;
                    }
                    int i16 = min2 + i8;
                    int i17 = i16 + min;
                    if (i8 != i13) {
                        subSequence = TextUtils.concat(text.subSequence(i15, i15 + min2), text.subSequence(i10, min + i10));
                    } else {
                        subSequence = text.subSequence(i15, i17 + i15);
                    }
                    R.c.a(editorInfo, subSequence, min2, i16);
                    return;
                }
                R.c.a(editorInfo, null, 0, 0);
                return;
            }
            R.c.a(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, c1 c1Var) {
        if (drawable != null && c1Var != null) {
            C1216u.e(drawable, c1Var, this.f13136a.getDrawableState());
        }
    }

    public final void b() {
        c1 c1Var = this.f13137b;
        TextView textView = this.f13136a;
        if (c1Var != null || this.f13138c != null || this.f13139d != null || this.f13140e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f13137b);
            a(compoundDrawables[1], this.f13138c);
            a(compoundDrawables[2], this.f13139d);
            a(compoundDrawables[3], this.f13140e);
        }
        if (this.f13141f == null && this.f13142g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f13141f);
        a(compoundDrawablesRelative[2], this.f13142g);
    }

    public final ColorStateList d() {
        c1 c1Var = this.f13143h;
        if (c1Var != null) {
            return c1Var.f13235a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        c1 c1Var = this.f13143h;
        if (c1Var != null) {
            return c1Var.f13236b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i4) {
        boolean z8;
        boolean z9;
        String str;
        String str2;
        float f8;
        float f9;
        float f10;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i8;
        float f11;
        int i9;
        ColorStateList colorStateList;
        int resourceId;
        int i10;
        int resourceId2;
        TextView textView = this.f13136a;
        Context context = textView.getContext();
        C1216u a3 = C1216u.a();
        int[] iArr = AbstractC0805a.f11282h;
        R.g J6 = R.g.J(context, attributeSet, iArr, i4);
        P.O.l(textView, textView.getContext(), iArr, attributeSet, (TypedArray) J6.f4988f, i4);
        TypedArray typedArray = (TypedArray) J6.f4988f;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f13137b = c(context, a3, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f13138c = c(context, a3, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f13139d = c(context, a3, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f13140e = c(context, a3, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f13141f = c(context, a3, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f13142g = c(context, a3, typedArray.getResourceId(6, 0));
        }
        J6.L();
        boolean z10 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0805a.f11296x;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            R.g gVar = new R.g(context, obtainStyledAttributes);
            if (!z10 && obtainStyledAttributes.hasValue(14)) {
                z9 = obtainStyledAttributes.getBoolean(14, false);
                z8 = true;
            } else {
                z8 = false;
                z9 = false;
            }
            n(context, gVar);
            int i11 = Build.VERSION.SDK_INT;
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
            } else {
                str2 = null;
            }
            if (i11 >= 26 && obtainStyledAttributes.hasValue(13)) {
                str = obtainStyledAttributes.getString(13);
            } else {
                str = null;
            }
            gVar.L();
        } else {
            z8 = false;
            z9 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        R.g gVar2 = new R.g(context, obtainStyledAttributes2);
        if (!z10 && obtainStyledAttributes2.hasValue(14)) {
            z9 = obtainStyledAttributes2.getBoolean(14, false);
            z8 = true;
        }
        boolean z11 = z9;
        int i12 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i12 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i12 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, gVar2);
        gVar2.L();
        if (!z10 && z8) {
            textView.setAllCaps(z11);
        }
        Typeface typeface = this.f13145l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            U.d(textView, str);
        }
        if (str2 != null) {
            T.b(textView, T.a(str2));
        }
        C1188f0 c1188f0 = this.f13144i;
        Context context2 = c1188f0.j;
        int[] iArr3 = AbstractC0805a.f11283i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i4, 0);
        TextView textView2 = c1188f0.f13253i;
        P.O.l(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i4);
        if (obtainStyledAttributes3.hasValue(5)) {
            c1188f0.f13245a = obtainStyledAttributes3.getInt(5, 0);
        }
        if (obtainStyledAttributes3.hasValue(4)) {
            f8 = obtainStyledAttributes3.getDimension(4, -1.0f);
        } else {
            f8 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(2)) {
            f9 = obtainStyledAttributes3.getDimension(2, -1.0f);
        } else {
            f9 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(1)) {
            f10 = obtainStyledAttributes3.getDimension(1, -1.0f);
        } else {
            f10 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i13 = 0; i13 < length; i13++) {
                    iArr4[i13] = obtainTypedArray.getDimensionPixelSize(i13, -1);
                }
                c1188f0.f13250f = C1188f0.b(iArr4);
                c1188f0.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (c1188f0.j()) {
            if (c1188f0.f13245a == 1) {
                if (!c1188f0.f13251g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f9 == -1.0f) {
                        i10 = 2;
                        f9 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i10 = 2;
                    }
                    if (f10 == -1.0f) {
                        f10 = TypedValue.applyDimension(i10, 112.0f, displayMetrics);
                    }
                    float f12 = f10;
                    if (f8 == -1.0f) {
                        f8 = 1.0f;
                    }
                    c1188f0.k(f9, f12, f8);
                }
                c1188f0.h();
            }
        } else {
            c1188f0.f13245a = 0;
        }
        if (t1.f13387c && c1188f0.f13245a != 0) {
            int[] iArr5 = c1188f0.f13250f;
            if (iArr5.length > 0) {
                if (U.a(textView) != -1.0f) {
                    U.b(textView, Math.round(c1188f0.f13248d), Math.round(c1188f0.f13249e), Math.round(c1188f0.f13247c), 0);
                } else {
                    U.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        if (resourceId4 != -1) {
            drawable = a3.b(context, resourceId4);
        } else {
            drawable = null;
        }
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        if (resourceId5 != -1) {
            drawable2 = a3.b(context, resourceId5);
        } else {
            drawable2 = null;
        }
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        if (resourceId6 != -1) {
            drawable3 = a3.b(context, resourceId6);
        } else {
            drawable3 = null;
        }
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        if (resourceId7 != -1) {
            drawable4 = a3.b(context, resourceId7);
        } else {
            drawable4 = null;
        }
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        if (resourceId8 != -1) {
            drawable5 = a3.b(context, resourceId8);
        } else {
            drawable5 = null;
        }
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        if (resourceId9 != -1) {
            drawable6 = a3.b(context, resourceId9);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
                Drawable drawable7 = compoundDrawablesRelative[0];
                if (drawable7 == null && compoundDrawablesRelative[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative[1];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative[3];
                    }
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative[2], drawable4);
                }
            }
        } else {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative2[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative2[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC1492c.o(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(AbstractC1202m0.c(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i14 = peekValue.data;
                int i15 = i14 & 15;
                f11 = TypedValue.complexToFloat(i14);
                i9 = i15;
                i8 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i8) {
                    E2.c.s0(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i8) {
                    E2.c.t0(textView, dimensionPixelSize2);
                }
                if (f11 == -1.0f) {
                    if (i9 == i8) {
                        E2.c.u0(textView, (int) f11);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        AbstractC0274w.h(textView, i9, f11);
                        return;
                    } else {
                        E2.c.u0(textView, Math.round(TypedValue.applyDimension(i9, f11, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i8 = -1;
            f11 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i8 = -1;
            f11 = -1.0f;
        }
        i9 = i8;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i8) {
        }
        if (dimensionPixelSize2 != i8) {
        }
        if (f11 == -1.0f) {
        }
    }

    public final void g(Context context, int i4) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, AbstractC0805a.f11296x);
        R.g gVar = new R.g(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f13136a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, gVar);
        if (i8 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            U.d(textView, string);
        }
        gVar.L();
        Typeface typeface = this.f13145l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i4, int i8, int i9, int i10) {
        C1188f0 c1188f0 = this.f13144i;
        if (c1188f0.j()) {
            DisplayMetrics displayMetrics = c1188f0.j.getResources().getDisplayMetrics();
            c1188f0.k(TypedValue.applyDimension(i10, i4, displayMetrics), TypedValue.applyDimension(i10, i8, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (c1188f0.h()) {
                c1188f0.a();
            }
        }
    }

    public final void j(int[] iArr, int i4) {
        C1188f0 c1188f0 = this.f13144i;
        if (c1188f0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i4 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c1188f0.j.getResources().getDisplayMetrics();
                    for (int i8 = 0; i8 < length; i8++) {
                        iArr2[i8] = Math.round(TypedValue.applyDimension(i4, iArr[i8], displayMetrics));
                    }
                }
                c1188f0.f13250f = C1188f0.b(iArr2);
                if (!c1188f0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c1188f0.f13251g = false;
            }
            if (c1188f0.h()) {
                c1188f0.a();
            }
        }
    }

    public final void k(int i4) {
        C1188f0 c1188f0 = this.f13144i;
        if (c1188f0.j()) {
            if (i4 != 0) {
                if (i4 == 1) {
                    DisplayMetrics displayMetrics = c1188f0.j.getResources().getDisplayMetrics();
                    c1188f0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (c1188f0.h()) {
                        c1188f0.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(A.j.l("Unknown auto-size text type: ", i4));
            }
            c1188f0.f13245a = 0;
            c1188f0.f13248d = -1.0f;
            c1188f0.f13249e = -1.0f;
            c1188f0.f13247c = -1.0f;
            c1188f0.f13250f = new int[0];
            c1188f0.f13246b = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o.c1] */
    public final void l(ColorStateList colorStateList) {
        boolean z8;
        if (this.f13143h == null) {
            this.f13143h = new Object();
        }
        c1 c1Var = this.f13143h;
        c1Var.f13235a = colorStateList;
        if (colorStateList != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        c1Var.f13238d = z8;
        this.f13137b = c1Var;
        this.f13138c = c1Var;
        this.f13139d = c1Var;
        this.f13140e = c1Var;
        this.f13141f = c1Var;
        this.f13142g = c1Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o.c1] */
    public final void m(PorterDuff.Mode mode) {
        boolean z8;
        if (this.f13143h == null) {
            this.f13143h = new Object();
        }
        c1 c1Var = this.f13143h;
        c1Var.f13236b = mode;
        if (mode != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        c1Var.f13237c = z8;
        this.f13137b = c1Var;
        this.f13138c = c1Var;
        this.f13139d = c1Var;
        this.f13140e = c1Var;
        this.f13141f = c1Var;
        this.f13142g = c1Var;
    }

    public final void n(Context context, R.g gVar) {
        String string;
        boolean z8;
        boolean z9;
        int i4 = this.j;
        TypedArray typedArray = (TypedArray) gVar.f4988f;
        this.j = typedArray.getInt(2, i4);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            int i9 = typedArray.getInt(11, -1);
            this.k = i9;
            if (i9 != -1) {
                this.j &= 2;
            }
        }
        int i10 = 10;
        boolean z10 = false;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f13146m = false;
                int i11 = typedArray.getInt(1, 1);
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            this.f13145l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f13145l = Typeface.SERIF;
                    return;
                }
                this.f13145l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f13145l = null;
        if (typedArray.hasValue(12)) {
            i10 = 12;
        }
        int i12 = this.k;
        int i13 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface D7 = gVar.D(i10, this.j, new S(this, i12, i13, new WeakReference(this.f13136a)));
                if (D7 != null) {
                    if (i8 >= 28 && this.k != -1) {
                        Typeface create = Typeface.create(D7, 0);
                        int i14 = this.k;
                        if ((this.j & 2) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        this.f13145l = V.a(create, i14, z9);
                    } else {
                        this.f13145l = D7;
                    }
                }
                if (this.f13145l == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.f13146m = z8;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f13145l == null && (string = typedArray.getString(i10)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i15 = this.k;
                if ((this.j & 2) != 0) {
                    z10 = true;
                }
                this.f13145l = V.a(create2, i15, z10);
                return;
            }
            this.f13145l = Typeface.create(string, this.j);
        }
    }
}
