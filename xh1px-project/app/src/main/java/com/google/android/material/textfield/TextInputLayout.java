package com.google.android.material.textfield;

import E2.d;
import F3.f;
import G5.e;
import G5.h;
import G5.l;
import I5.b;
import J0.C0073g;
import J0.o;
import J0.t;
import L5.A;
import L5.i;
import L5.k;
import L5.n;
import L5.q;
import L5.r;
import L5.v;
import L5.w;
import L5.x;
import L5.y;
import L5.z;
import M5.a;
import P.I;
import P.O;
import R.g;
import a.AbstractC0405a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import e5.AbstractC0645a;
import f5.AbstractC0710a;
import g0.L;
import h4.AbstractC0832f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import n1.AbstractC1149a;
import o.AbstractC1202m0;
import o.C1178a0;
import o.C1216u;
import s3.AbstractC1492c;
import u6.AbstractC1638C;
import x5.C1792b;
import x5.c;
import x5.p;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: F0, reason: collision with root package name */
    public static final int[][] f10239F0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public C0073g f10240A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f10241A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f10242B;

    /* renamed from: B0, reason: collision with root package name */
    public ValueAnimator f10243B0;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f10244C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f10245C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f10246D;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f10247D0;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f10248E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f10249E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f10250F;

    /* renamed from: G, reason: collision with root package name */
    public CharSequence f10251G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f10252H;

    /* renamed from: I, reason: collision with root package name */
    public h f10253I;

    /* renamed from: J, reason: collision with root package name */
    public h f10254J;
    public StateListDrawable K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f10255L;

    /* renamed from: M, reason: collision with root package name */
    public h f10256M;

    /* renamed from: N, reason: collision with root package name */
    public h f10257N;

    /* renamed from: O, reason: collision with root package name */
    public l f10258O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f10259P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f10260Q;

    /* renamed from: R, reason: collision with root package name */
    public int f10261R;

    /* renamed from: S, reason: collision with root package name */
    public int f10262S;

    /* renamed from: T, reason: collision with root package name */
    public int f10263T;

    /* renamed from: U, reason: collision with root package name */
    public int f10264U;

    /* renamed from: V, reason: collision with root package name */
    public int f10265V;

    /* renamed from: W, reason: collision with root package name */
    public int f10266W;

    /* renamed from: a0, reason: collision with root package name */
    public int f10267a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Rect f10268b0;

    /* renamed from: c0, reason: collision with root package name */
    public final Rect f10269c0;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f10270d;

    /* renamed from: d0, reason: collision with root package name */
    public final RectF f10271d0;

    /* renamed from: e, reason: collision with root package name */
    public final v f10272e;

    /* renamed from: e0, reason: collision with root package name */
    public Typeface f10273e0;

    /* renamed from: f, reason: collision with root package name */
    public final n f10274f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f10275f0;

    /* renamed from: g, reason: collision with root package name */
    public EditText f10276g;

    /* renamed from: g0, reason: collision with root package name */
    public int f10277g0;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f10278h;

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f10279h0;

    /* renamed from: i, reason: collision with root package name */
    public int f10280i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorDrawable f10281i0;
    public int j;
    public int j0;
    public int k;

    /* renamed from: k0, reason: collision with root package name */
    public Drawable f10282k0;

    /* renamed from: l, reason: collision with root package name */
    public int f10283l;

    /* renamed from: l0, reason: collision with root package name */
    public ColorStateList f10284l0;

    /* renamed from: m, reason: collision with root package name */
    public final r f10285m;

    /* renamed from: m0, reason: collision with root package name */
    public ColorStateList f10286m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10287n;

    /* renamed from: n0, reason: collision with root package name */
    public int f10288n0;

    /* renamed from: o, reason: collision with root package name */
    public int f10289o;

    /* renamed from: o0, reason: collision with root package name */
    public int f10290o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10291p;

    /* renamed from: p0, reason: collision with root package name */
    public int f10292p0;

    /* renamed from: q, reason: collision with root package name */
    public z f10293q;

    /* renamed from: q0, reason: collision with root package name */
    public ColorStateList f10294q0;

    /* renamed from: r, reason: collision with root package name */
    public C1178a0 f10295r;

    /* renamed from: r0, reason: collision with root package name */
    public int f10296r0;

    /* renamed from: s, reason: collision with root package name */
    public int f10297s;

    /* renamed from: s0, reason: collision with root package name */
    public int f10298s0;

    /* renamed from: t, reason: collision with root package name */
    public int f10299t;

    /* renamed from: t0, reason: collision with root package name */
    public int f10300t0;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f10301u;

    /* renamed from: u0, reason: collision with root package name */
    public int f10302u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10303v;

    /* renamed from: v0, reason: collision with root package name */
    public int f10304v0;

    /* renamed from: w, reason: collision with root package name */
    public C1178a0 f10305w;

    /* renamed from: w0, reason: collision with root package name */
    public int f10306w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f10307x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f10308x0;

    /* renamed from: y, reason: collision with root package name */
    public int f10309y;

    /* renamed from: y0, reason: collision with root package name */
    public final C1792b f10310y0;

    /* renamed from: z, reason: collision with root package name */
    public C0073g f10311z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f10312z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.buzbuz.smartautoclicker.R.attr.textInputStyle, com.buzbuz.smartautoclicker.R.style.Widget_Design_TextInputLayout), attributeSet, com.buzbuz.smartautoclicker.R.attr.textInputStyle);
        this.f10280i = -1;
        this.j = -1;
        this.k = -1;
        this.f10283l = -1;
        this.f10285m = new r(this);
        this.f10293q = new o(5);
        this.f10268b0 = new Rect();
        this.f10269c0 = new Rect();
        this.f10271d0 = new RectF();
        this.f10279h0 = new LinkedHashSet();
        C1792b c1792b = new C1792b(this);
        this.f10310y0 = c1792b;
        this.f10249E0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f10270d = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0710a.f10766a;
        c1792b.f16149Q = linearInterpolator;
        c1792b.h(false);
        c1792b.f16148P = linearInterpolator;
        c1792b.h(false);
        if (c1792b.f16170g != 8388659) {
            c1792b.f16170g = 8388659;
            c1792b.h(false);
        }
        g i4 = p.i(context2, attributeSet, AbstractC0645a.f10629S, com.buzbuz.smartautoclicker.R.attr.textInputStyle, com.buzbuz.smartautoclicker.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        v vVar = new v(this, i4);
        this.f10272e = vVar;
        TypedArray typedArray = (TypedArray) i4.f4988f;
        this.f10250F = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.f10241A0 = typedArray.getBoolean(47, true);
        this.f10312z0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.f10258O = l.b(context2, attributeSet, com.buzbuz.smartautoclicker.R.attr.textInputStyle, com.buzbuz.smartautoclicker.R.style.Widget_Design_TextInputLayout).a();
        this.f10260Q = context2.getResources().getDimensionPixelOffset(com.buzbuz.smartautoclicker.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f10262S = typedArray.getDimensionPixelOffset(9, 0);
        this.f10264U = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.buzbuz.smartautoclicker.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f10265V = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.buzbuz.smartautoclicker.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f10263T = this.f10264U;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        f e9 = this.f10258O.e();
        if (dimension >= 0.0f) {
            e9.f1337i = new G5.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e9.j = new G5.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e9.k = new G5.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e9.f1338l = new G5.a(dimension4);
        }
        this.f10258O = e9.a();
        ColorStateList B8 = AbstractC0405a.B(context2, i4, 7);
        if (B8 != null) {
            int defaultColor = B8.getDefaultColor();
            this.f10296r0 = defaultColor;
            this.f10267a0 = defaultColor;
            if (B8.isStateful()) {
                this.f10298s0 = B8.getColorForState(new int[]{-16842910}, -1);
                this.f10300t0 = B8.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f10302u0 = B8.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f10300t0 = this.f10296r0;
                ColorStateList o7 = AbstractC1492c.o(context2, com.buzbuz.smartautoclicker.R.color.mtrl_filled_background_color);
                this.f10298s0 = o7.getColorForState(new int[]{-16842910}, -1);
                this.f10302u0 = o7.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f10267a0 = 0;
            this.f10296r0 = 0;
            this.f10298s0 = 0;
            this.f10300t0 = 0;
            this.f10302u0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList z8 = i4.z(1);
            this.f10286m0 = z8;
            this.f10284l0 = z8;
        }
        ColorStateList B9 = AbstractC0405a.B(context2, i4, 14);
        this.f10292p0 = typedArray.getColor(14, 0);
        this.f10288n0 = context2.getColor(com.buzbuz.smartautoclicker.R.color.mtrl_textinput_default_box_stroke_color);
        this.f10304v0 = context2.getColor(com.buzbuz.smartautoclicker.R.color.mtrl_textinput_disabled_color);
        this.f10290o0 = context2.getColor(com.buzbuz.smartautoclicker.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (B9 != null) {
            setBoxStrokeColorStateList(B9);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC0405a.B(context2, i4, 15));
        }
        if (typedArray.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(49, 0));
        }
        this.f10246D = i4.z(24);
        this.f10248E = i4.z(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i8 = typedArray.getInt(34, 1);
        boolean z9 = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z10 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(57, 0);
        CharSequence text3 = typedArray.getText(56);
        boolean z11 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.f10299t = typedArray.getResourceId(22, 0);
        this.f10297s = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i8);
        setCounterOverflowTextAppearance(this.f10297s);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f10299t);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(i4.z(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(i4.z(46));
        }
        if (typedArray.hasValue(50)) {
            setHintTextColor(i4.z(50));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(i4.z(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(i4.z(21));
        }
        if (typedArray.hasValue(58)) {
            setPlaceholderTextColor(i4.z(58));
        }
        n nVar = new n(this, i4);
        this.f10274f = nVar;
        boolean z12 = typedArray.getBoolean(0, true);
        i4.L();
        setImportantForAccessibility(2);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && i9 >= 26) {
            I.b(this, 1);
        }
        frameLayout.addView(vVar);
        frameLayout.addView(nVar);
        addView(frameLayout);
        setEnabled(z12);
        setHelperTextEnabled(z10);
        setErrorEnabled(z9);
        setCounterEnabled(z11);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f10276g;
        if ((editText instanceof AutoCompleteTextView) && !AbstractC1492c.x(editText)) {
            int o7 = AbstractC0832f.o(this.f10276g, com.buzbuz.smartautoclicker.R.attr.colorControlHighlight);
            int i4 = this.f10261R;
            int[][] iArr = f10239F0;
            if (i4 == 2) {
                Context context = getContext();
                h hVar = this.f10253I;
                int n3 = AbstractC0832f.n(context, com.buzbuz.smartautoclicker.R.attr.colorSurface, "TextInputLayout");
                h hVar2 = new h(hVar.f1769d.f1752a);
                int t8 = AbstractC0832f.t(0.1f, o7, n3);
                hVar2.m(new ColorStateList(iArr, new int[]{t8, 0}));
                hVar2.setTint(n3);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{t8, n3});
                h hVar3 = new h(hVar.f1769d.f1752a);
                hVar3.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hVar2, hVar3), hVar});
            }
            if (i4 == 1) {
                h hVar4 = this.f10253I;
                int i8 = this.f10267a0;
                return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0832f.t(0.1f, o7, i8), i8}), hVar4, hVar4);
            }
            return null;
        }
        return this.f10253I;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.K == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.K = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.K.addState(new int[0], f(false));
        }
        return this.K;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f10254J == null) {
            this.f10254J = f(true);
        }
        return this.f10254J;
    }

    public static void k(ViewGroup viewGroup, boolean z8) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            childAt.setEnabled(z8);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z8);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f10276g == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f10276g = editText;
            int i4 = this.f10280i;
            if (i4 != -1) {
                setMinEms(i4);
            } else {
                setMinWidth(this.k);
            }
            int i8 = this.j;
            if (i8 != -1) {
                setMaxEms(i8);
            } else {
                setMaxWidth(this.f10283l);
            }
            this.f10255L = false;
            i();
            setTextInputAccessibilityDelegate(new y(this));
            Typeface typeface = this.f10276g.getTypeface();
            C1792b c1792b = this.f10310y0;
            c1792b.m(typeface);
            float textSize = this.f10276g.getTextSize();
            if (c1792b.f16171h != textSize) {
                c1792b.f16171h = textSize;
                c1792b.h(false);
            }
            int i9 = Build.VERSION.SDK_INT;
            float letterSpacing = this.f10276g.getLetterSpacing();
            if (c1792b.f16155W != letterSpacing) {
                c1792b.f16155W = letterSpacing;
                c1792b.h(false);
            }
            int gravity = this.f10276g.getGravity();
            int i10 = (gravity & (-113)) | 48;
            if (c1792b.f16170g != i10) {
                c1792b.f16170g = i10;
                c1792b.h(false);
            }
            if (c1792b.f16168f != gravity) {
                c1792b.f16168f = gravity;
                c1792b.h(false);
            }
            WeakHashMap weakHashMap = O.f4214a;
            this.f10306w0 = editText.getMinimumHeight();
            this.f10276g.addTextChangedListener(new w(this, editText));
            if (this.f10284l0 == null) {
                this.f10284l0 = this.f10276g.getHintTextColors();
            }
            if (this.f10250F) {
                if (TextUtils.isEmpty(this.f10251G)) {
                    CharSequence hint = this.f10276g.getHint();
                    this.f10278h = hint;
                    setHint(hint);
                    this.f10276g.setHint((CharSequence) null);
                }
                this.f10252H = true;
            }
            if (i9 >= 29) {
                p();
            }
            if (this.f10295r != null) {
                n(this.f10276g.getText());
            }
            r();
            this.f10285m.b();
            this.f10272e.bringToFront();
            n nVar = this.f10274f;
            nVar.bringToFront();
            Iterator it = this.f10279h0.iterator();
            while (it.hasNext()) {
                ((k) it.next()).a(this);
            }
            nVar.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            u(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f10251G)) {
            this.f10251G = charSequence;
            C1792b c1792b = this.f10310y0;
            if (charSequence == null || !TextUtils.equals(c1792b.f16134A, charSequence)) {
                c1792b.f16134A = charSequence;
                c1792b.f16135B = null;
                Bitmap bitmap = c1792b.f16138E;
                if (bitmap != null) {
                    bitmap.recycle();
                    c1792b.f16138E = null;
                }
                c1792b.h(false);
            }
            if (!this.f10308x0) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z8) {
        if (this.f10303v == z8) {
            return;
        }
        if (z8) {
            C1178a0 c1178a0 = this.f10305w;
            if (c1178a0 != null) {
                this.f10270d.addView(c1178a0);
                this.f10305w.setVisibility(0);
            }
        } else {
            C1178a0 c1178a02 = this.f10305w;
            if (c1178a02 != null) {
                c1178a02.setVisibility(8);
            }
            this.f10305w = null;
        }
        this.f10303v = z8;
    }

    public final void a(float f8) {
        C1792b c1792b = this.f10310y0;
        if (c1792b.f16160b == f8) {
            return;
        }
        int i4 = 1;
        if (this.f10243B0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f10243B0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0832f.y(getContext(), com.buzbuz.smartautoclicker.R.attr.motionEasingEmphasizedInterpolator, AbstractC0710a.f10767b));
            this.f10243B0.setDuration(AbstractC0832f.x(getContext(), com.buzbuz.smartautoclicker.R.attr.motionDurationMedium4, 167));
            this.f10243B0.addUpdateListener(new b(i4, this));
        }
        this.f10243B0.setFloatValues(c1792b.f16160b, f8);
        this.f10243B0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.f10270d;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i4, layoutParams);
    }

    public final void b() {
        ColorStateList valueOf;
        int i4;
        int i8;
        h hVar = this.f10253I;
        if (hVar == null) {
            return;
        }
        l lVar = hVar.f1769d.f1752a;
        l lVar2 = this.f10258O;
        if (lVar != lVar2) {
            hVar.setShapeAppearanceModel(lVar2);
        }
        if (this.f10261R == 2 && (i4 = this.f10263T) > -1 && (i8 = this.f10266W) != 0) {
            h hVar2 = this.f10253I;
            hVar2.f1769d.j = i4;
            hVar2.invalidateSelf();
            hVar2.q(ColorStateList.valueOf(i8));
        }
        int i9 = this.f10267a0;
        if (this.f10261R == 1) {
            i9 = H.b.c(this.f10267a0, AbstractC0832f.m(getContext(), com.buzbuz.smartautoclicker.R.attr.colorSurface, 0));
        }
        this.f10267a0 = i9;
        this.f10253I.m(ColorStateList.valueOf(i9));
        h hVar3 = this.f10256M;
        if (hVar3 != null && this.f10257N != null) {
            if (this.f10263T > -1 && this.f10266W != 0) {
                if (this.f10276g.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.f10288n0);
                } else {
                    valueOf = ColorStateList.valueOf(this.f10266W);
                }
                hVar3.m(valueOf);
                this.f10257N.m(ColorStateList.valueOf(this.f10266W));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d2;
        if (!this.f10250F) {
            return 0;
        }
        int i4 = this.f10261R;
        C1792b c1792b = this.f10310y0;
        if (i4 != 0) {
            if (i4 != 2) {
                return 0;
            }
            d2 = c1792b.d() / 2.0f;
        } else {
            d2 = c1792b.d();
        }
        return (int) d2;
    }

    public final C0073g d() {
        C0073g c0073g = new C0073g();
        c0073g.f2315f = AbstractC0832f.x(getContext(), com.buzbuz.smartautoclicker.R.attr.motionDurationShort2, 87);
        c0073g.f2316g = AbstractC0832f.y(getContext(), com.buzbuz.smartautoclicker.R.attr.motionEasingLinearInterpolator, AbstractC0710a.f10766a);
        return c0073g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i4) {
        EditText editText = this.f10276g;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i4);
            return;
        }
        if (this.f10278h != null) {
            boolean z8 = this.f10252H;
            this.f10252H = false;
            CharSequence hint = editText.getHint();
            this.f10276g.setHint(this.f10278h);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i4);
                return;
            } finally {
                this.f10276g.setHint(hint);
                this.f10252H = z8;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i4);
        onProvideAutofillVirtualStructure(viewStructure, i4);
        FrameLayout frameLayout = this.f10270d;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i8 = 0; i8 < frameLayout.getChildCount(); i8++) {
            View childAt = frameLayout.getChildAt(i8);
            ViewStructure newChild = viewStructure.newChild(i8);
            childAt.dispatchProvideAutofillStructure(newChild, i4);
            if (childAt == this.f10276g) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f10247D0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f10247D0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        h hVar;
        super.draw(canvas);
        boolean z8 = this.f10250F;
        C1792b c1792b = this.f10310y0;
        if (z8) {
            TextPaint textPaint = c1792b.f16146N;
            RectF rectF = c1792b.f16166e;
            int save = canvas.save();
            if (c1792b.f16135B != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(c1792b.f16140G);
                float f8 = c1792b.f16177p;
                float f9 = c1792b.f16178q;
                float f10 = c1792b.f16139F;
                if (f10 != 1.0f) {
                    canvas.scale(f10, f10, f8, f9);
                }
                if (c1792b.f16165d0 > 1 && !c1792b.f16136C) {
                    float lineStart = c1792b.f16177p - c1792b.Y.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f9);
                    float f11 = alpha;
                    textPaint.setAlpha((int) (c1792b.f16161b0 * f11));
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 31) {
                        textPaint.setShadowLayer(c1792b.f16141H, c1792b.f16142I, c1792b.f16143J, AbstractC0832f.j(c1792b.K, textPaint.getAlpha()));
                    }
                    c1792b.Y.draw(canvas);
                    textPaint.setAlpha((int) (c1792b.f16159a0 * f11));
                    if (i4 >= 31) {
                        textPaint.setShadowLayer(c1792b.f16141H, c1792b.f16142I, c1792b.f16143J, AbstractC0832f.j(c1792b.K, textPaint.getAlpha()));
                    }
                    int lineBaseline = c1792b.Y.getLineBaseline(0);
                    CharSequence charSequence = c1792b.f16163c0;
                    float f12 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                    if (i4 >= 31) {
                        textPaint.setShadowLayer(c1792b.f16141H, c1792b.f16142I, c1792b.f16143J, c1792b.K);
                    }
                    String trim = c1792b.f16163c0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(c1792b.Y.getLineEnd(0), str.length()), 0.0f, f12, (Paint) textPaint);
                    canvas = canvas;
                } else {
                    canvas.translate(f8, f9);
                    c1792b.Y.draw(canvas);
                }
                canvas.restoreToCount(save);
            }
        }
        if (this.f10257N != null && (hVar = this.f10256M) != null) {
            hVar.draw(canvas);
            if (this.f10276g.isFocused()) {
                Rect bounds = this.f10257N.getBounds();
                Rect bounds2 = this.f10256M.getBounds();
                float f13 = c1792b.f16160b;
                int centerX = bounds2.centerX();
                bounds.left = AbstractC0710a.c(f13, centerX, bounds2.left);
                bounds.right = AbstractC0710a.c(f13, centerX, bounds2.right);
                this.f10257N.draw(canvas);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z8;
        ColorStateList colorStateList;
        if (this.f10245C0) {
            return;
        }
        boolean z9 = true;
        this.f10245C0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C1792b c1792b = this.f10310y0;
        if (c1792b != null) {
            c1792b.f16144L = drawableState;
            ColorStateList colorStateList2 = c1792b.k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c1792b.j) != null && colorStateList.isStateful())) {
                c1792b.h(false);
                z8 = true;
                if (this.f10276g != null) {
                    WeakHashMap weakHashMap = O.f4214a;
                    if (!isLaidOut() || !isEnabled()) {
                        z9 = false;
                    }
                    u(z9, false);
                }
                r();
                x();
                if (z8) {
                    invalidate();
                }
                this.f10245C0 = false;
            }
        }
        z8 = false;
        if (this.f10276g != null) {
        }
        r();
        x();
        if (z8) {
        }
        this.f10245C0 = false;
    }

    public final boolean e() {
        if (this.f10250F && !TextUtils.isEmpty(this.f10251G) && (this.f10253I instanceof L5.g)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, G5.l] */
    /* JADX WARN: Type inference failed for: r3v1, types: [s3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [s3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [s3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [s3.c, java.lang.Object] */
    public final h f(boolean z8) {
        float f8;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.buzbuz.smartautoclicker.R.dimen.mtrl_shape_corner_size_small_component);
        if (z8) {
            f8 = dimensionPixelOffset2;
        } else {
            f8 = 0.0f;
        }
        EditText editText = this.f10276g;
        if (editText instanceof MaterialAutoCompleteTextView) {
            dimensionPixelOffset = ((MaterialAutoCompleteTextView) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(com.buzbuz.smartautoclicker.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.buzbuz.smartautoclicker.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        e eVar = new e(0);
        e eVar2 = new e(0);
        e eVar3 = new e(0);
        e eVar4 = new e(0);
        G5.a aVar = new G5.a(f8);
        G5.a aVar2 = new G5.a(f8);
        G5.a aVar3 = new G5.a(dimensionPixelOffset2);
        G5.a aVar4 = new G5.a(dimensionPixelOffset2);
        ?? obj5 = new Object();
        obj5.f1794a = obj;
        obj5.f1795b = obj2;
        obj5.f1796c = obj3;
        obj5.f1797d = obj4;
        obj5.f1798e = aVar;
        obj5.f1799f = aVar2;
        obj5.f1800g = aVar4;
        obj5.f1801h = aVar3;
        obj5.f1802i = eVar;
        obj5.j = eVar2;
        obj5.k = eVar3;
        obj5.f1803l = eVar4;
        EditText editText2 = this.f10276g;
        if (editText2 instanceof MaterialAutoCompleteTextView) {
            colorStateList = ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        h d2 = h.d(getContext(), dimensionPixelOffset, colorStateList);
        d2.setShapeAppearanceModel(obj5);
        G5.g gVar = d2.f1769d;
        if (gVar.f1758g == null) {
            gVar.f1758g = new Rect();
        }
        d2.f1769d.f1758g.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        d2.invalidateSelf();
        return d2;
    }

    public final int g(int i4, boolean z8) {
        int compoundPaddingLeft;
        if (!z8 && getPrefixText() != null) {
            compoundPaddingLeft = this.f10272e.a();
        } else if (z8 && getSuffixText() != null) {
            compoundPaddingLeft = this.f10274f.c();
        } else {
            compoundPaddingLeft = this.f10276g.getCompoundPaddingLeft();
        }
        return compoundPaddingLeft + i4;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f10276g;
        if (editText != null) {
            return c() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public h getBoxBackground() {
        int i4 = this.f10261R;
        if (i4 != 1 && i4 != 2) {
            throw new IllegalStateException();
        }
        return this.f10253I;
    }

    public int getBoxBackgroundColor() {
        return this.f10267a0;
    }

    public int getBoxBackgroundMode() {
        return this.f10261R;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f10262S;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean g8 = p.g(this);
        RectF rectF = this.f10271d0;
        if (g8) {
            return this.f10258O.f1801h.a(rectF);
        }
        return this.f10258O.f1800g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean g8 = p.g(this);
        RectF rectF = this.f10271d0;
        if (g8) {
            return this.f10258O.f1800g.a(rectF);
        }
        return this.f10258O.f1801h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean g8 = p.g(this);
        RectF rectF = this.f10271d0;
        if (g8) {
            return this.f10258O.f1798e.a(rectF);
        }
        return this.f10258O.f1799f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean g8 = p.g(this);
        RectF rectF = this.f10271d0;
        if (g8) {
            return this.f10258O.f1799f.a(rectF);
        }
        return this.f10258O.f1798e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f10292p0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f10294q0;
    }

    public int getBoxStrokeWidth() {
        return this.f10264U;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f10265V;
    }

    public int getCounterMaxLength() {
        return this.f10289o;
    }

    public CharSequence getCounterOverflowDescription() {
        C1178a0 c1178a0;
        if (this.f10287n && this.f10291p && (c1178a0 = this.f10295r) != null) {
            return c1178a0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f10244C;
    }

    public ColorStateList getCounterTextColor() {
        return this.f10242B;
    }

    public ColorStateList getCursorColor() {
        return this.f10246D;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f10248E;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f10284l0;
    }

    public EditText getEditText() {
        return this.f10276g;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f10274f.j.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f10274f.j.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f10274f.f2980p;
    }

    public int getEndIconMode() {
        return this.f10274f.f2976l;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f10274f.f2981q;
    }

    public CheckableImageButton getEndIconView() {
        return this.f10274f.j;
    }

    public CharSequence getError() {
        r rVar = this.f10285m;
        if (rVar.f3016q) {
            return rVar.f3015p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f10285m.f3019t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f10285m.f3018s;
    }

    public int getErrorCurrentTextColors() {
        C1178a0 c1178a0 = this.f10285m.f3017r;
        if (c1178a0 != null) {
            return c1178a0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f10274f.f2972f.getDrawable();
    }

    public CharSequence getHelperText() {
        r rVar = this.f10285m;
        if (rVar.f3023x) {
            return rVar.f3022w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C1178a0 c1178a0 = this.f10285m.f3024y;
        if (c1178a0 != null) {
            return c1178a0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f10250F) {
            return this.f10251G;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f10310y0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C1792b c1792b = this.f10310y0;
        return c1792b.e(c1792b.k);
    }

    public ColorStateList getHintTextColor() {
        return this.f10286m0;
    }

    public z getLengthCounter() {
        return this.f10293q;
    }

    public int getMaxEms() {
        return this.j;
    }

    public int getMaxWidth() {
        return this.f10283l;
    }

    public int getMinEms() {
        return this.f10280i;
    }

    public int getMinWidth() {
        return this.k;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f10274f.j.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f10274f.j.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f10303v) {
            return this.f10301u;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f10309y;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f10307x;
    }

    public CharSequence getPrefixText() {
        return this.f10272e.f3036f;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f10272e.f3035e.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f10272e.f3035e;
    }

    public l getShapeAppearanceModel() {
        return this.f10258O;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f10272e.f3037g.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f10272e.f3037g.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f10272e.j;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f10272e.k;
    }

    public CharSequence getSuffixText() {
        return this.f10274f.f2983s;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f10274f.f2984t.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f10274f.f2984t;
    }

    public Typeface getTypeface() {
        return this.f10273e0;
    }

    public final int h(int i4, boolean z8) {
        int compoundPaddingRight;
        if (!z8 && getSuffixText() != null) {
            compoundPaddingRight = this.f10274f.c();
        } else if (z8 && getPrefixText() != null) {
            compoundPaddingRight = this.f10272e.a();
        } else {
            compoundPaddingRight = this.f10276g.getCompoundPaddingRight();
        }
        return i4 - compoundPaddingRight;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [L5.g, G5.h] */
    public final void i() {
        int i4 = this.f10261R;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    if (this.f10250F && !(this.f10253I instanceof L5.g)) {
                        l lVar = this.f10258O;
                        int i8 = L5.g.f2947C;
                        if (lVar == null) {
                            lVar = new l();
                        }
                        L5.f fVar = new L5.f(lVar, new RectF());
                        ?? hVar = new h(fVar);
                        hVar.f2948B = fVar;
                        this.f10253I = hVar;
                    } else {
                        this.f10253I = new h(this.f10258O);
                    }
                    this.f10256M = null;
                    this.f10257N = null;
                } else {
                    throw new IllegalArgumentException(AbstractC1149a.h(new StringBuilder(), this.f10261R, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
            } else {
                this.f10253I = new h(this.f10258O);
                this.f10256M = new h();
                this.f10257N = new h();
            }
        } else {
            this.f10253I = null;
            this.f10256M = null;
            this.f10257N = null;
        }
        s();
        x();
        if (this.f10261R == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f10262S = getResources().getDimensionPixelSize(com.buzbuz.smartautoclicker.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC0405a.a0(getContext())) {
                this.f10262S = getResources().getDimensionPixelSize(com.buzbuz.smartautoclicker.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f10276g != null && this.f10261R == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f10276g;
                WeakHashMap weakHashMap = O.f4214a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.buzbuz.smartautoclicker.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f10276g.getPaddingEnd(), getResources().getDimensionPixelSize(com.buzbuz.smartautoclicker.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC0405a.a0(getContext())) {
                EditText editText2 = this.f10276g;
                WeakHashMap weakHashMap2 = O.f4214a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.buzbuz.smartautoclicker.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f10276g.getPaddingEnd(), getResources().getDimensionPixelSize(com.buzbuz.smartautoclicker.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f10261R != 0) {
            t();
        }
        EditText editText3 = this.f10276g;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i9 = this.f10261R;
                if (i9 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i9 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f8;
        float f9;
        float f10;
        RectF rectF;
        float f11;
        int i4;
        float f12;
        int i8;
        if (e()) {
            int width = this.f10276g.getWidth();
            int gravity = this.f10276g.getGravity();
            C1792b c1792b = this.f10310y0;
            boolean b4 = c1792b.b(c1792b.f16134A);
            c1792b.f16136C = b4;
            Rect rect = c1792b.f16164d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                    if (b4) {
                        f8 = rect.right;
                        f9 = c1792b.f16157Z;
                    } else {
                        i8 = rect.left;
                        f10 = i8;
                    }
                } else if (b4) {
                    i8 = rect.left;
                    f10 = i8;
                } else {
                    f8 = rect.right;
                    f9 = c1792b.f16157Z;
                }
                float max = Math.max(f10, rect.left);
                rectF = this.f10271d0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity == 17 && (gravity & 7) != 1) {
                    if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                        if (c1792b.f16136C) {
                            i4 = rect.right;
                            f11 = i4;
                        } else {
                            f12 = c1792b.f16157Z;
                            f11 = f12 + max;
                        }
                    } else if (c1792b.f16136C) {
                        f12 = c1792b.f16157Z;
                        f11 = f12 + max;
                    } else {
                        i4 = rect.right;
                        f11 = i4;
                    }
                } else {
                    f11 = (width / 2.0f) + (c1792b.f16157Z / 2.0f);
                }
                rectF.right = Math.min(f11, rect.right);
                rectF.bottom = c1792b.d() + rect.top;
                if (rectF.width() <= 0.0f && rectF.height() > 0.0f) {
                    float f13 = rectF.left;
                    float f14 = this.f10260Q;
                    rectF.left = f13 - f14;
                    rectF.right += f14;
                    rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f10263T);
                    L5.g gVar = (L5.g) this.f10253I;
                    gVar.getClass();
                    gVar.u(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
            }
            f8 = width / 2.0f;
            f9 = c1792b.f16157Z / 2.0f;
            f10 = f8 - f9;
            float max2 = Math.max(f10, rect.left);
            rectF = this.f10271d0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity == 17) {
            }
            f11 = (width / 2.0f) + (c1792b.f16157Z / 2.0f);
            rectF.right = Math.min(f11, rect.right);
            rectF.bottom = c1792b.d() + rect.top;
            if (rectF.width() <= 0.0f) {
            }
        }
    }

    public final void l(C1178a0 c1178a0, int i4) {
        try {
            c1178a0.setTextAppearance(i4);
            if (c1178a0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c1178a0.setTextAppearance(com.buzbuz.smartautoclicker.R.style.TextAppearance_AppCompat_Caption);
        c1178a0.setTextColor(getContext().getColor(com.buzbuz.smartautoclicker.R.color.design_error));
    }

    public final boolean m() {
        r rVar = this.f10285m;
        if (rVar.f3014o == 1 && rVar.f3017r != null && !TextUtils.isEmpty(rVar.f3015p)) {
            return true;
        }
        return false;
    }

    public final void n(Editable editable) {
        int i4;
        boolean z8;
        int i8;
        N.b bVar;
        ((o) this.f10293q).getClass();
        if (editable != null) {
            i4 = editable.length();
        } else {
            i4 = 0;
        }
        boolean z9 = this.f10291p;
        int i9 = this.f10289o;
        String str = null;
        if (i9 == -1) {
            this.f10295r.setText(String.valueOf(i4));
            this.f10295r.setContentDescription(null);
            this.f10291p = false;
        } else {
            if (i4 > i9) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f10291p = z8;
            Context context = getContext();
            C1178a0 c1178a0 = this.f10295r;
            int i10 = this.f10289o;
            if (this.f10291p) {
                i8 = com.buzbuz.smartautoclicker.R.string.character_counter_overflowed_content_description;
            } else {
                i8 = com.buzbuz.smartautoclicker.R.string.character_counter_content_description;
            }
            c1178a0.setContentDescription(context.getString(i8, Integer.valueOf(i4), Integer.valueOf(i10)));
            if (z9 != this.f10291p) {
                o();
            }
            String str2 = N.b.f3513b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = N.b.f3516e;
            } else {
                bVar = N.b.f3515d;
            }
            C1178a0 c1178a02 = this.f10295r;
            String string = getContext().getString(com.buzbuz.smartautoclicker.R.string.character_counter_pattern, Integer.valueOf(i4), Integer.valueOf(this.f10289o));
            bVar.getClass();
            N.f fVar = N.g.f3526a;
            if (string != null) {
                str = bVar.c(string).toString();
            }
            c1178a02.setText(str);
        }
        if (this.f10276g != null && z9 != this.f10291p) {
            u(false, false);
            x();
            r();
        }
    }

    public final void o() {
        int i4;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C1178a0 c1178a0 = this.f10295r;
        if (c1178a0 != null) {
            if (this.f10291p) {
                i4 = this.f10297s;
            } else {
                i4 = this.f10299t;
            }
            l(c1178a0, i4);
            if (!this.f10291p && (colorStateList2 = this.f10242B) != null) {
                this.f10295r.setTextColor(colorStateList2);
            }
            if (this.f10291p && (colorStateList = this.f10244C) != null) {
                this.f10295r.setTextColor(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f10310y0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        n nVar = this.f10274f;
        nVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z8 = false;
        this.f10249E0 = false;
        if (this.f10276g != null && this.f10276g.getMeasuredHeight() < (max = Math.max(nVar.getMeasuredHeight(), this.f10272e.getMeasuredHeight()))) {
            this.f10276g.setMinimumHeight(max);
            z8 = true;
        }
        boolean q6 = q();
        if (!z8 && !q6) {
            return;
        }
        this.f10276g.post(new E.a(4, this));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z8, i4, i8, i9, i10);
        EditText editText = this.f10276g;
        if (editText != null) {
            ThreadLocal threadLocal = c.f16188a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f10268b0;
            rect.set(0, 0, width, height);
            c.b(this, editText, rect);
            h hVar = this.f10256M;
            if (hVar != null) {
                int i11 = rect.bottom;
                hVar.setBounds(rect.left, i11 - this.f10264U, rect.right, i11);
            }
            h hVar2 = this.f10257N;
            if (hVar2 != null) {
                int i12 = rect.bottom;
                hVar2.setBounds(rect.left, i12 - this.f10265V, rect.right, i12);
            }
            if (this.f10250F) {
                float textSize = this.f10276g.getTextSize();
                C1792b c1792b = this.f10310y0;
                if (c1792b.f16171h != textSize) {
                    c1792b.f16171h = textSize;
                    c1792b.h(false);
                }
                int gravity = this.f10276g.getGravity();
                int i13 = (gravity & (-113)) | 48;
                if (c1792b.f16170g != i13) {
                    c1792b.f16170g = i13;
                    c1792b.h(false);
                }
                if (c1792b.f16168f != gravity) {
                    c1792b.f16168f = gravity;
                    c1792b.h(false);
                }
                if (this.f10276g != null) {
                    boolean g8 = p.g(this);
                    int i14 = rect.bottom;
                    Rect rect2 = this.f10269c0;
                    rect2.bottom = i14;
                    int i15 = this.f10261R;
                    if (i15 != 1) {
                        if (i15 != 2) {
                            rect2.left = g(rect.left, g8);
                            rect2.top = getPaddingTop();
                            rect2.right = h(rect.right, g8);
                        } else {
                            rect2.left = this.f10276g.getPaddingLeft() + rect.left;
                            rect2.top = rect.top - c();
                            rect2.right = rect.right - this.f10276g.getPaddingRight();
                        }
                    } else {
                        rect2.left = g(rect.left, g8);
                        rect2.top = rect.top + this.f10262S;
                        rect2.right = h(rect.right, g8);
                    }
                    int i16 = rect2.left;
                    int i17 = rect2.top;
                    int i18 = rect2.right;
                    int i19 = rect2.bottom;
                    Rect rect3 = c1792b.f16164d;
                    if (rect3.left != i16 || rect3.top != i17 || rect3.right != i18 || rect3.bottom != i19) {
                        rect3.set(i16, i17, i18, i19);
                        c1792b.f16145M = true;
                    }
                    if (this.f10276g != null) {
                        TextPaint textPaint = c1792b.f16147O;
                        textPaint.setTextSize(c1792b.f16171h);
                        textPaint.setTypeface(c1792b.f16182u);
                        textPaint.setLetterSpacing(c1792b.f16155W);
                        float f8 = -textPaint.ascent();
                        rect2.left = this.f10276g.getCompoundPaddingLeft() + rect.left;
                        if (this.f10261R == 1 && this.f10276g.getMinLines() <= 1) {
                            compoundPaddingTop = (int) (rect.centerY() - (f8 / 2.0f));
                        } else {
                            compoundPaddingTop = rect.top + this.f10276g.getCompoundPaddingTop();
                        }
                        rect2.top = compoundPaddingTop;
                        rect2.right = rect.right - this.f10276g.getCompoundPaddingRight();
                        if (this.f10261R == 1 && this.f10276g.getMinLines() <= 1) {
                            compoundPaddingBottom = (int) (rect2.top + f8);
                        } else {
                            compoundPaddingBottom = rect.bottom - this.f10276g.getCompoundPaddingBottom();
                        }
                        rect2.bottom = compoundPaddingBottom;
                        int i20 = rect2.left;
                        int i21 = rect2.top;
                        int i22 = rect2.right;
                        Rect rect4 = c1792b.f16162c;
                        if (rect4.left != i20 || rect4.top != i21 || rect4.right != i22 || rect4.bottom != compoundPaddingBottom) {
                            rect4.set(i20, i21, i22, compoundPaddingBottom);
                            c1792b.f16145M = true;
                        }
                        c1792b.h(false);
                        if (e() && !this.f10308x0) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i8) {
        EditText editText;
        super.onMeasure(i4, i8);
        boolean z8 = this.f10249E0;
        n nVar = this.f10274f;
        if (!z8) {
            nVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f10249E0 = true;
        }
        if (this.f10305w != null && (editText = this.f10276g) != null) {
            this.f10305w.setGravity(editText.getGravity());
            this.f10305w.setPadding(this.f10276g.getCompoundPaddingLeft(), this.f10276g.getCompoundPaddingTop(), this.f10276g.getCompoundPaddingRight(), this.f10276g.getCompoundPaddingBottom());
        }
        nVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof A)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        A a3 = (A) parcelable;
        super.onRestoreInstanceState(a3.f6209d);
        setError(a3.f2930f);
        if (a3.f2931g) {
            post(new x(0, this));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, G5.l] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        boolean z8 = true;
        if (i4 != 1) {
            z8 = false;
        }
        if (z8 != this.f10259P) {
            G5.c cVar = this.f10258O.f1798e;
            RectF rectF = this.f10271d0;
            float a3 = cVar.a(rectF);
            float a4 = this.f10258O.f1799f.a(rectF);
            float a9 = this.f10258O.f1801h.a(rectF);
            float a10 = this.f10258O.f1800g.a(rectF);
            l lVar = this.f10258O;
            AbstractC1492c abstractC1492c = lVar.f1794a;
            AbstractC1492c abstractC1492c2 = lVar.f1795b;
            AbstractC1492c abstractC1492c3 = lVar.f1797d;
            AbstractC1492c abstractC1492c4 = lVar.f1796c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            f.b(abstractC1492c2);
            f.b(abstractC1492c);
            f.b(abstractC1492c4);
            f.b(abstractC1492c3);
            G5.a aVar = new G5.a(a4);
            G5.a aVar2 = new G5.a(a3);
            G5.a aVar3 = new G5.a(a10);
            G5.a aVar4 = new G5.a(a9);
            ?? obj = new Object();
            obj.f1794a = abstractC1492c2;
            obj.f1795b = abstractC1492c;
            obj.f1796c = abstractC1492c3;
            obj.f1797d = abstractC1492c4;
            obj.f1798e = aVar;
            obj.f1799f = aVar2;
            obj.f1800g = aVar4;
            obj.f1801h = aVar3;
            obj.f1802i = eVar;
            obj.j = eVar2;
            obj.k = eVar3;
            obj.f1803l = eVar4;
            this.f10259P = z8;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, V.b, L5.A] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z8;
        ?? bVar = new V.b(super.onSaveInstanceState());
        if (m()) {
            bVar.f2930f = getError();
        }
        n nVar = this.f10274f;
        if (nVar.f2976l != 0 && nVar.j.f10173g) {
            z8 = true;
        } else {
            z8 = false;
        }
        bVar.f2931g = z8;
        return bVar;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f10246D;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue E7 = d.E(context, com.buzbuz.smartautoclicker.R.attr.colorControlActivated);
            if (E7 != null) {
                int i4 = E7.resourceId;
                if (i4 != 0) {
                    colorStateList2 = AbstractC1492c.o(context, i4);
                } else {
                    int i8 = E7.data;
                    if (i8 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i8);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f10276g;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.f10276g.getTextCursorDrawable();
                Drawable mutate = textCursorDrawable2.mutate();
                if ((m() || (this.f10295r != null && this.f10291p)) && (colorStateList = this.f10248E) != null) {
                    colorStateList2 = colorStateList;
                }
                mutate.setTintList(colorStateList2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q() {
        boolean z8;
        n nVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.f10276g == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z9 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            v vVar = this.f10272e;
            if (vVar.getMeasuredWidth() > 0) {
                int measuredWidth = vVar.getMeasuredWidth() - this.f10276g.getPaddingLeft();
                if (this.f10275f0 == null || this.f10277g0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f10275f0 = colorDrawable3;
                    this.f10277g0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.f10276g.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f10275f0;
                if (drawable2 != colorDrawable4) {
                    this.f10276g.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z8 = true;
                    nVar = this.f10274f;
                    if ((!nVar.e() || ((nVar.f2976l != 0 && nVar.d()) || nVar.f2983s != null)) && nVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = nVar.f2984t.getMeasuredWidth() - this.f10276g.getPaddingRight();
                        if (!nVar.e()) {
                            checkableImageButton = nVar.f2972f;
                        } else if (nVar.f2976l != 0 && nVar.d()) {
                            checkableImageButton = nVar.j;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.f10276g.getCompoundDrawablesRelative();
                        colorDrawable = this.f10281i0;
                        if (colorDrawable == null && this.j0 != measuredWidth2) {
                            this.j0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.f10276g.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f10281i0, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.f10281i0 = colorDrawable5;
                            this.j0 = measuredWidth2;
                            colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.f10281i0;
                        if (drawable != colorDrawable2) {
                            this.f10282k0 = drawable;
                            this.f10276g.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.f10281i0 != null) {
                        Drawable[] compoundDrawablesRelative3 = this.f10276g.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f10281i0) {
                            this.f10276g.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f10282k0, compoundDrawablesRelative3[3]);
                        } else {
                            z9 = z8;
                        }
                        this.f10281i0 = null;
                        return z9;
                    }
                    return z8;
                }
                z8 = false;
                nVar = this.f10274f;
                if (!nVar.e()) {
                }
                int measuredWidth22 = nVar.f2984t.getMeasuredWidth() - this.f10276g.getPaddingRight();
                if (!nVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.f10276g.getCompoundDrawablesRelative();
                colorDrawable = this.f10281i0;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f10281i0;
                if (drawable != colorDrawable2) {
                }
                return z8;
            }
        }
        if (this.f10275f0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f10276g.getCompoundDrawablesRelative();
            this.f10276g.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f10275f0 = null;
            z8 = true;
            nVar = this.f10274f;
            if (!nVar.e()) {
            }
            int measuredWidth222 = nVar.f2984t.getMeasuredWidth() - this.f10276g.getPaddingRight();
            if (!nVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.f10276g.getCompoundDrawablesRelative();
            colorDrawable = this.f10281i0;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f10281i0;
            if (drawable != colorDrawable2) {
            }
            return z8;
        }
        z8 = false;
        nVar = this.f10274f;
        if (!nVar.e()) {
        }
        int measuredWidth2222 = nVar.f2984t.getMeasuredWidth() - this.f10276g.getPaddingRight();
        if (!nVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.f10276g.getCompoundDrawablesRelative();
        colorDrawable = this.f10281i0;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f10281i0;
        if (drawable != colorDrawable2) {
        }
        return z8;
    }

    public final void r() {
        Drawable background;
        C1178a0 c1178a0;
        EditText editText = this.f10276g;
        if (editText != null && this.f10261R == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = AbstractC1202m0.f13319a;
            Drawable mutate = background.mutate();
            if (m()) {
                mutate.setColorFilter(C1216u.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (this.f10291p && (c1178a0 = this.f10295r) != null) {
                mutate.setColorFilter(C1216u.c(c1178a0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                mutate.clearColorFilter();
                this.f10276g.refreshDrawableState();
            }
        }
    }

    public final void s() {
        EditText editText = this.f10276g;
        if (editText != null && this.f10253I != null) {
            if ((this.f10255L || editText.getBackground() == null) && this.f10261R != 0) {
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                EditText editText2 = this.f10276g;
                WeakHashMap weakHashMap = O.f4214a;
                editText2.setBackground(editTextBoxBackground);
                this.f10255L = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i4) {
        if (this.f10267a0 != i4) {
            this.f10267a0 = i4;
            this.f10296r0 = i4;
            this.f10300t0 = i4;
            this.f10302u0 = i4;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i4) {
        setBoxBackgroundColor(getContext().getColor(i4));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f10296r0 = defaultColor;
        this.f10267a0 = defaultColor;
        this.f10298s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f10300t0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f10302u0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i4) {
        if (i4 != this.f10261R) {
            this.f10261R = i4;
            if (this.f10276g != null) {
                i();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i4) {
        this.f10262S = i4;
    }

    public void setBoxCornerFamily(int i4) {
        f e9 = this.f10258O.e();
        G5.c cVar = this.f10258O.f1798e;
        AbstractC1492c r8 = AbstractC1638C.r(i4);
        e9.f1333e = r8;
        f.b(r8);
        e9.f1337i = cVar;
        G5.c cVar2 = this.f10258O.f1799f;
        AbstractC1492c r9 = AbstractC1638C.r(i4);
        e9.f1334f = r9;
        f.b(r9);
        e9.j = cVar2;
        G5.c cVar3 = this.f10258O.f1801h;
        AbstractC1492c r10 = AbstractC1638C.r(i4);
        e9.f1336h = r10;
        f.b(r10);
        e9.f1338l = cVar3;
        G5.c cVar4 = this.f10258O.f1800g;
        AbstractC1492c r11 = AbstractC1638C.r(i4);
        e9.f1335g = r11;
        f.b(r11);
        e9.k = cVar4;
        this.f10258O = e9.a();
        b();
    }

    public void setBoxStrokeColor(int i4) {
        if (this.f10292p0 != i4) {
            this.f10292p0 = i4;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f10288n0 = colorStateList.getDefaultColor();
            this.f10304v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f10290o0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f10292p0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f10292p0 != colorStateList.getDefaultColor()) {
            this.f10292p0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f10294q0 != colorStateList) {
            this.f10294q0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i4) {
        this.f10264U = i4;
        x();
    }

    public void setBoxStrokeWidthFocused(int i4) {
        this.f10265V = i4;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i4) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i4));
    }

    public void setBoxStrokeWidthResource(int i4) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i4));
    }

    public void setCounterEnabled(boolean z8) {
        if (this.f10287n != z8) {
            r rVar = this.f10285m;
            Editable editable = null;
            if (z8) {
                C1178a0 c1178a0 = new C1178a0(getContext(), null);
                this.f10295r = c1178a0;
                c1178a0.setId(com.buzbuz.smartautoclicker.R.id.textinput_counter);
                Typeface typeface = this.f10273e0;
                if (typeface != null) {
                    this.f10295r.setTypeface(typeface);
                }
                this.f10295r.setMaxLines(1);
                rVar.a(this.f10295r, 2);
                ((ViewGroup.MarginLayoutParams) this.f10295r.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.buzbuz.smartautoclicker.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f10295r != null) {
                    EditText editText = this.f10276g;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                rVar.g(this.f10295r, 2);
                this.f10295r = null;
            }
            this.f10287n = z8;
        }
    }

    public void setCounterMaxLength(int i4) {
        Editable text;
        if (this.f10289o != i4) {
            if (i4 > 0) {
                this.f10289o = i4;
            } else {
                this.f10289o = -1;
            }
            if (this.f10287n && this.f10295r != null) {
                EditText editText = this.f10276g;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                n(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i4) {
        if (this.f10297s != i4) {
            this.f10297s = i4;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f10244C != colorStateList) {
            this.f10244C = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i4) {
        if (this.f10299t != i4) {
            this.f10299t = i4;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f10242B != colorStateList) {
            this.f10242B = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f10246D != colorStateList) {
            this.f10246D = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f10248E != colorStateList) {
            this.f10248E = colorStateList;
            if (!m() && (this.f10295r == null || !this.f10291p)) {
                return;
            }
            p();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f10284l0 = colorStateList;
        this.f10286m0 = colorStateList;
        if (this.f10276g != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        k(this, z8);
        super.setEnabled(z8);
    }

    public void setEndIconActivated(boolean z8) {
        this.f10274f.j.setActivated(z8);
    }

    public void setEndIconCheckable(boolean z8) {
        this.f10274f.j.setCheckable(z8);
    }

    public void setEndIconContentDescription(int i4) {
        n nVar = this.f10274f;
        CharSequence text = i4 != 0 ? nVar.getResources().getText(i4) : null;
        CheckableImageButton checkableImageButton = nVar.j;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i4) {
        n nVar = this.f10274f;
        Drawable k = i4 != 0 ? h4.g.k(nVar.getContext(), i4) : null;
        TextInputLayout textInputLayout = nVar.f2970d;
        CheckableImageButton checkableImageButton = nVar.j;
        checkableImageButton.setImageDrawable(k);
        if (k != null) {
            AbstractC1638C.i(textInputLayout, checkableImageButton, nVar.f2978n, nVar.f2979o);
            AbstractC1638C.H(textInputLayout, checkableImageButton, nVar.f2978n);
        }
    }

    public void setEndIconMinSize(int i4) {
        n nVar = this.f10274f;
        if (i4 >= 0) {
            if (i4 != nVar.f2980p) {
                nVar.f2980p = i4;
                CheckableImageButton checkableImageButton = nVar.j;
                checkableImageButton.setMinimumWidth(i4);
                checkableImageButton.setMinimumHeight(i4);
                CheckableImageButton checkableImageButton2 = nVar.f2972f;
                checkableImageButton2.setMinimumWidth(i4);
                checkableImageButton2.setMinimumHeight(i4);
                return;
            }
            return;
        }
        nVar.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i4) {
        this.f10274f.g(i4);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        n nVar = this.f10274f;
        CheckableImageButton checkableImageButton = nVar.j;
        View.OnLongClickListener onLongClickListener = nVar.f2982r;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC1638C.K(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        n nVar = this.f10274f;
        nVar.f2982r = onLongClickListener;
        CheckableImageButton checkableImageButton = nVar.j;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC1638C.K(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        n nVar = this.f10274f;
        nVar.f2981q = scaleType;
        nVar.j.setScaleType(scaleType);
        nVar.f2972f.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        n nVar = this.f10274f;
        if (nVar.f2978n != colorStateList) {
            nVar.f2978n = colorStateList;
            AbstractC1638C.i(nVar.f2970d, nVar.j, colorStateList, nVar.f2979o);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        n nVar = this.f10274f;
        if (nVar.f2979o != mode) {
            nVar.f2979o = mode;
            AbstractC1638C.i(nVar.f2970d, nVar.j, nVar.f2978n, mode);
        }
    }

    public void setEndIconVisible(boolean z8) {
        this.f10274f.h(z8);
    }

    public void setError(CharSequence charSequence) {
        r rVar = this.f10285m;
        if (!rVar.f3016q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            rVar.c();
            rVar.f3015p = charSequence;
            rVar.f3017r.setText(charSequence);
            int i4 = rVar.f3013n;
            if (i4 != 1) {
                rVar.f3014o = 1;
            }
            rVar.i(i4, rVar.f3014o, rVar.h(rVar.f3017r, charSequence));
            return;
        }
        rVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i4) {
        r rVar = this.f10285m;
        rVar.f3019t = i4;
        C1178a0 c1178a0 = rVar.f3017r;
        if (c1178a0 != null) {
            WeakHashMap weakHashMap = O.f4214a;
            c1178a0.setAccessibilityLiveRegion(i4);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        r rVar = this.f10285m;
        rVar.f3018s = charSequence;
        C1178a0 c1178a0 = rVar.f3017r;
        if (c1178a0 != null) {
            c1178a0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z8) {
        r rVar = this.f10285m;
        TextInputLayout textInputLayout = rVar.f3009h;
        if (rVar.f3016q == z8) {
            return;
        }
        rVar.c();
        if (z8) {
            C1178a0 c1178a0 = new C1178a0(rVar.f3008g, null);
            rVar.f3017r = c1178a0;
            c1178a0.setId(com.buzbuz.smartautoclicker.R.id.textinput_error);
            rVar.f3017r.setTextAlignment(5);
            Typeface typeface = rVar.f3001B;
            if (typeface != null) {
                rVar.f3017r.setTypeface(typeface);
            }
            int i4 = rVar.f3020u;
            rVar.f3020u = i4;
            C1178a0 c1178a02 = rVar.f3017r;
            if (c1178a02 != null) {
                rVar.f3009h.l(c1178a02, i4);
            }
            ColorStateList colorStateList = rVar.f3021v;
            rVar.f3021v = colorStateList;
            C1178a0 c1178a03 = rVar.f3017r;
            if (c1178a03 != null && colorStateList != null) {
                c1178a03.setTextColor(colorStateList);
            }
            CharSequence charSequence = rVar.f3018s;
            rVar.f3018s = charSequence;
            C1178a0 c1178a04 = rVar.f3017r;
            if (c1178a04 != null) {
                c1178a04.setContentDescription(charSequence);
            }
            int i8 = rVar.f3019t;
            rVar.f3019t = i8;
            C1178a0 c1178a05 = rVar.f3017r;
            if (c1178a05 != null) {
                WeakHashMap weakHashMap = O.f4214a;
                c1178a05.setAccessibilityLiveRegion(i8);
            }
            rVar.f3017r.setVisibility(4);
            rVar.a(rVar.f3017r, 0);
        } else {
            rVar.f();
            rVar.g(rVar.f3017r, 0);
            rVar.f3017r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        rVar.f3016q = z8;
    }

    public void setErrorIconDrawable(int i4) {
        n nVar = this.f10274f;
        nVar.i(i4 != 0 ? h4.g.k(nVar.getContext(), i4) : null);
        AbstractC1638C.H(nVar.f2970d, nVar.f2972f, nVar.f2973g);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        n nVar = this.f10274f;
        CheckableImageButton checkableImageButton = nVar.f2972f;
        View.OnLongClickListener onLongClickListener = nVar.f2975i;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC1638C.K(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        n nVar = this.f10274f;
        nVar.f2975i = onLongClickListener;
        CheckableImageButton checkableImageButton = nVar.f2972f;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC1638C.K(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        n nVar = this.f10274f;
        if (nVar.f2973g != colorStateList) {
            nVar.f2973g = colorStateList;
            AbstractC1638C.i(nVar.f2970d, nVar.f2972f, colorStateList, nVar.f2974h);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        n nVar = this.f10274f;
        if (nVar.f2974h != mode) {
            nVar.f2974h = mode;
            AbstractC1638C.i(nVar.f2970d, nVar.f2972f, nVar.f2973g, mode);
        }
    }

    public void setErrorTextAppearance(int i4) {
        r rVar = this.f10285m;
        rVar.f3020u = i4;
        C1178a0 c1178a0 = rVar.f3017r;
        if (c1178a0 != null) {
            rVar.f3009h.l(c1178a0, i4);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        r rVar = this.f10285m;
        rVar.f3021v = colorStateList;
        C1178a0 c1178a0 = rVar.f3017r;
        if (c1178a0 != null && colorStateList != null) {
            c1178a0.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z8) {
        if (this.f10312z0 != z8) {
            this.f10312z0 = z8;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        r rVar = this.f10285m;
        if (isEmpty) {
            if (rVar.f3023x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!rVar.f3023x) {
            setHelperTextEnabled(true);
        }
        rVar.c();
        rVar.f3022w = charSequence;
        rVar.f3024y.setText(charSequence);
        int i4 = rVar.f3013n;
        if (i4 != 2) {
            rVar.f3014o = 2;
        }
        rVar.i(i4, rVar.f3014o, rVar.h(rVar.f3024y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        r rVar = this.f10285m;
        rVar.f3000A = colorStateList;
        C1178a0 c1178a0 = rVar.f3024y;
        if (c1178a0 != null && colorStateList != null) {
            c1178a0.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z8) {
        r rVar = this.f10285m;
        TextInputLayout textInputLayout = rVar.f3009h;
        if (rVar.f3023x == z8) {
            return;
        }
        rVar.c();
        if (z8) {
            C1178a0 c1178a0 = new C1178a0(rVar.f3008g, null);
            rVar.f3024y = c1178a0;
            c1178a0.setId(com.buzbuz.smartautoclicker.R.id.textinput_helper_text);
            rVar.f3024y.setTextAlignment(5);
            Typeface typeface = rVar.f3001B;
            if (typeface != null) {
                rVar.f3024y.setTypeface(typeface);
            }
            rVar.f3024y.setVisibility(4);
            rVar.f3024y.setAccessibilityLiveRegion(1);
            int i4 = rVar.f3025z;
            rVar.f3025z = i4;
            C1178a0 c1178a02 = rVar.f3024y;
            if (c1178a02 != null) {
                c1178a02.setTextAppearance(i4);
            }
            ColorStateList colorStateList = rVar.f3000A;
            rVar.f3000A = colorStateList;
            C1178a0 c1178a03 = rVar.f3024y;
            if (c1178a03 != null && colorStateList != null) {
                c1178a03.setTextColor(colorStateList);
            }
            rVar.a(rVar.f3024y, 1);
            rVar.f3024y.setAccessibilityDelegate(new q(rVar));
        } else {
            rVar.c();
            int i8 = rVar.f3013n;
            if (i8 == 2) {
                rVar.f3014o = 0;
            }
            rVar.i(i8, rVar.f3014o, rVar.h(rVar.f3024y, ""));
            rVar.g(rVar.f3024y, 1);
            rVar.f3024y = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        rVar.f3023x = z8;
    }

    public void setHelperTextTextAppearance(int i4) {
        r rVar = this.f10285m;
        rVar.f3025z = i4;
        C1178a0 c1178a0 = rVar.f3024y;
        if (c1178a0 != null) {
            c1178a0.setTextAppearance(i4);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f10250F) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z8) {
        this.f10241A0 = z8;
    }

    public void setHintEnabled(boolean z8) {
        if (z8 != this.f10250F) {
            this.f10250F = z8;
            if (!z8) {
                this.f10252H = false;
                if (!TextUtils.isEmpty(this.f10251G) && TextUtils.isEmpty(this.f10276g.getHint())) {
                    this.f10276g.setHint(this.f10251G);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f10276g.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f10251G)) {
                        setHint(hint);
                    }
                    this.f10276g.setHint((CharSequence) null);
                }
                this.f10252H = true;
            }
            if (this.f10276g != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i4) {
        C1792b c1792b = this.f10310y0;
        TextInputLayout textInputLayout = c1792b.f16158a;
        D5.d dVar = new D5.d(textInputLayout.getContext(), i4);
        ColorStateList colorStateList = dVar.j;
        if (colorStateList != null) {
            c1792b.k = colorStateList;
        }
        float f8 = dVar.k;
        if (f8 != 0.0f) {
            c1792b.f16172i = f8;
        }
        ColorStateList colorStateList2 = dVar.f1010a;
        if (colorStateList2 != null) {
            c1792b.f16153U = colorStateList2;
        }
        c1792b.f16151S = dVar.f1014e;
        c1792b.f16152T = dVar.f1015f;
        c1792b.f16150R = dVar.f1016g;
        c1792b.f16154V = dVar.f1018i;
        D5.a aVar = c1792b.f16186y;
        if (aVar != null) {
            aVar.f1003g = true;
        }
        L l6 = new L(24, c1792b);
        dVar.a();
        c1792b.f16186y = new D5.a(l6, dVar.f1021n);
        dVar.c(textInputLayout.getContext(), c1792b.f16186y);
        c1792b.h(false);
        this.f10286m0 = c1792b.k;
        if (this.f10276g != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f10286m0 != colorStateList) {
            if (this.f10284l0 == null) {
                C1792b c1792b = this.f10310y0;
                if (c1792b.k != colorStateList) {
                    c1792b.k = colorStateList;
                    c1792b.h(false);
                }
            }
            this.f10286m0 = colorStateList;
            if (this.f10276g != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(z zVar) {
        this.f10293q = zVar;
    }

    public void setMaxEms(int i4) {
        this.j = i4;
        EditText editText = this.f10276g;
        if (editText != null && i4 != -1) {
            editText.setMaxEms(i4);
        }
    }

    public void setMaxWidth(int i4) {
        this.f10283l = i4;
        EditText editText = this.f10276g;
        if (editText != null && i4 != -1) {
            editText.setMaxWidth(i4);
        }
    }

    public void setMaxWidthResource(int i4) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i4));
    }

    public void setMinEms(int i4) {
        this.f10280i = i4;
        EditText editText = this.f10276g;
        if (editText != null && i4 != -1) {
            editText.setMinEms(i4);
        }
    }

    public void setMinWidth(int i4) {
        this.k = i4;
        EditText editText = this.f10276g;
        if (editText != null && i4 != -1) {
            editText.setMinWidth(i4);
        }
    }

    public void setMinWidthResource(int i4) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i4));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i4) {
        n nVar = this.f10274f;
        nVar.j.setContentDescription(i4 != 0 ? nVar.getResources().getText(i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i4) {
        n nVar = this.f10274f;
        nVar.j.setImageDrawable(i4 != 0 ? h4.g.k(nVar.getContext(), i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z8) {
        n nVar = this.f10274f;
        if (z8 && nVar.f2976l != 1) {
            nVar.g(1);
        } else if (!z8) {
            nVar.g(0);
        } else {
            nVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        n nVar = this.f10274f;
        nVar.f2978n = colorStateList;
        AbstractC1638C.i(nVar.f2970d, nVar.j, colorStateList, nVar.f2979o);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        n nVar = this.f10274f;
        nVar.f2979o = mode;
        AbstractC1638C.i(nVar.f2970d, nVar.j, nVar.f2978n, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.f10305w == null) {
            C1178a0 c1178a0 = new C1178a0(getContext(), null);
            this.f10305w = c1178a0;
            c1178a0.setId(com.buzbuz.smartautoclicker.R.id.textinput_placeholder);
            this.f10305w.setImportantForAccessibility(2);
            C0073g d2 = d();
            this.f10311z = d2;
            d2.f2314e = 67L;
            this.f10240A = d();
            setPlaceholderTextAppearance(this.f10309y);
            setPlaceholderTextColor(this.f10307x);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f10303v) {
                setPlaceholderTextEnabled(true);
            }
            this.f10301u = charSequence;
        }
        EditText editText = this.f10276g;
        if (editText != null) {
            editable = editText.getText();
        }
        v(editable);
    }

    public void setPlaceholderTextAppearance(int i4) {
        this.f10309y = i4;
        C1178a0 c1178a0 = this.f10305w;
        if (c1178a0 != null) {
            c1178a0.setTextAppearance(i4);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f10307x != colorStateList) {
            this.f10307x = colorStateList;
            C1178a0 c1178a0 = this.f10305w;
            if (c1178a0 != null && colorStateList != null) {
                c1178a0.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        v vVar = this.f10272e;
        vVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        vVar.f3036f = charSequence2;
        vVar.f3035e.setText(charSequence);
        vVar.e();
    }

    public void setPrefixTextAppearance(int i4) {
        this.f10272e.f3035e.setTextAppearance(i4);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f10272e.f3035e.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(l lVar) {
        h hVar = this.f10253I;
        if (hVar != null && hVar.f1769d.f1752a != lVar) {
            this.f10258O = lVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z8) {
        this.f10272e.f3037g.setCheckable(z8);
    }

    public void setStartIconContentDescription(int i4) {
        setStartIconContentDescription(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setStartIconDrawable(int i4) {
        setStartIconDrawable(i4 != 0 ? h4.g.k(getContext(), i4) : null);
    }

    public void setStartIconMinSize(int i4) {
        v vVar = this.f10272e;
        if (i4 >= 0) {
            if (i4 != vVar.j) {
                vVar.j = i4;
                CheckableImageButton checkableImageButton = vVar.f3037g;
                checkableImageButton.setMinimumWidth(i4);
                checkableImageButton.setMinimumHeight(i4);
                return;
            }
            return;
        }
        vVar.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        v vVar = this.f10272e;
        CheckableImageButton checkableImageButton = vVar.f3037g;
        View.OnLongClickListener onLongClickListener = vVar.f3040l;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC1638C.K(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        v vVar = this.f10272e;
        vVar.f3040l = onLongClickListener;
        CheckableImageButton checkableImageButton = vVar.f3037g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC1638C.K(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        v vVar = this.f10272e;
        vVar.k = scaleType;
        vVar.f3037g.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        v vVar = this.f10272e;
        if (vVar.f3038h != colorStateList) {
            vVar.f3038h = colorStateList;
            AbstractC1638C.i(vVar.f3034d, vVar.f3037g, colorStateList, vVar.f3039i);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        v vVar = this.f10272e;
        if (vVar.f3039i != mode) {
            vVar.f3039i = mode;
            AbstractC1638C.i(vVar.f3034d, vVar.f3037g, vVar.f3038h, mode);
        }
    }

    public void setStartIconVisible(boolean z8) {
        this.f10272e.c(z8);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        n nVar = this.f10274f;
        nVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        nVar.f2983s = charSequence2;
        nVar.f2984t.setText(charSequence);
        nVar.n();
    }

    public void setSuffixTextAppearance(int i4) {
        this.f10274f.f2984t.setTextAppearance(i4);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f10274f.f2984t.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(y yVar) {
        EditText editText = this.f10276g;
        if (editText != null) {
            O.m(editText, yVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f10273e0) {
            this.f10273e0 = typeface;
            this.f10310y0.m(typeface);
            r rVar = this.f10285m;
            if (typeface != rVar.f3001B) {
                rVar.f3001B = typeface;
                C1178a0 c1178a0 = rVar.f3017r;
                if (c1178a0 != null) {
                    c1178a0.setTypeface(typeface);
                }
                C1178a0 c1178a02 = rVar.f3024y;
                if (c1178a02 != null) {
                    c1178a02.setTypeface(typeface);
                }
            }
            C1178a0 c1178a03 = this.f10295r;
            if (c1178a03 != null) {
                c1178a03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f10261R != 1) {
            FrameLayout frameLayout = this.f10270d;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c6 = c();
            if (c6 != layoutParams.topMargin) {
                layoutParams.topMargin = c6;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z8, boolean z9) {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        C1178a0 c1178a0;
        ColorStateList colorStateList2;
        int i4;
        boolean isEnabled = isEnabled();
        EditText editText = this.f10276g;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        EditText editText2 = this.f10276g;
        if (editText2 != null && editText2.hasFocus()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ColorStateList colorStateList3 = this.f10284l0;
        C1792b c1792b = this.f10310y0;
        if (colorStateList3 != null) {
            c1792b.i(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f10284l0;
            if (colorStateList4 != null) {
                i4 = colorStateList4.getColorForState(new int[]{-16842910}, this.f10304v0);
            } else {
                i4 = this.f10304v0;
            }
            c1792b.i(ColorStateList.valueOf(i4));
        } else if (m()) {
            C1178a0 c1178a02 = this.f10285m.f3017r;
            if (c1178a02 != null) {
                colorStateList2 = c1178a02.getTextColors();
            } else {
                colorStateList2 = null;
            }
            c1792b.i(colorStateList2);
        } else if (this.f10291p && (c1178a0 = this.f10295r) != null) {
            c1792b.i(c1178a0.getTextColors());
        } else if (z11 && (colorStateList = this.f10286m0) != null && c1792b.k != colorStateList) {
            c1792b.k = colorStateList;
            c1792b.h(false);
        }
        n nVar = this.f10274f;
        v vVar = this.f10272e;
        if (!z10 && this.f10312z0 && (!isEnabled() || !z11)) {
            if (z9 || !this.f10308x0) {
                ValueAnimator valueAnimator = this.f10243B0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f10243B0.cancel();
                }
                if (z8 && this.f10241A0) {
                    a(0.0f);
                } else {
                    c1792b.k(0.0f);
                }
                if (e() && !((L5.g) this.f10253I).f2948B.f2946s.isEmpty() && e()) {
                    ((L5.g) this.f10253I).u(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.f10308x0 = true;
                C1178a0 c1178a03 = this.f10305w;
                if (c1178a03 != null && this.f10303v) {
                    c1178a03.setText((CharSequence) null);
                    t.a(this.f10270d, this.f10240A);
                    this.f10305w.setVisibility(4);
                }
                vVar.f3041m = true;
                vVar.e();
                nVar.f2985u = true;
                nVar.n();
                return;
            }
            return;
        }
        if (!z9 && !this.f10308x0) {
            return;
        }
        ValueAnimator valueAnimator2 = this.f10243B0;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f10243B0.cancel();
        }
        if (z8 && this.f10241A0) {
            a(1.0f);
        } else {
            c1792b.k(1.0f);
        }
        this.f10308x0 = false;
        if (e()) {
            j();
        }
        EditText editText3 = this.f10276g;
        if (editText3 != null) {
            editable = editText3.getText();
        }
        v(editable);
        vVar.f3041m = false;
        vVar.e();
        nVar.f2985u = false;
        nVar.n();
    }

    public final void v(Editable editable) {
        int i4;
        ((o) this.f10293q).getClass();
        if (editable != null) {
            i4 = editable.length();
        } else {
            i4 = 0;
        }
        FrameLayout frameLayout = this.f10270d;
        if (i4 == 0 && !this.f10308x0) {
            if (this.f10305w != null && this.f10303v && !TextUtils.isEmpty(this.f10301u)) {
                this.f10305w.setText(this.f10301u);
                t.a(frameLayout, this.f10311z);
                this.f10305w.setVisibility(0);
                this.f10305w.bringToFront();
                announceForAccessibility(this.f10301u);
                return;
            }
            return;
        }
        C1178a0 c1178a0 = this.f10305w;
        if (c1178a0 != null && this.f10303v) {
            c1178a0.setText((CharSequence) null);
            t.a(frameLayout, this.f10240A);
            this.f10305w.setVisibility(4);
        }
    }

    public final void w(boolean z8, boolean z9) {
        int defaultColor = this.f10294q0.getDefaultColor();
        int colorForState = this.f10294q0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f10294q0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z8) {
            this.f10266W = colorForState2;
        } else if (z9) {
            this.f10266W = colorForState;
        } else {
            this.f10266W = defaultColor;
        }
    }

    public final void x() {
        boolean z8;
        C1178a0 c1178a0;
        EditText editText;
        EditText editText2;
        if (this.f10253I != null && this.f10261R != 0) {
            boolean z9 = false;
            if (!isFocused() && ((editText2 = this.f10276g) == null || !editText2.hasFocus())) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (isHovered() || ((editText = this.f10276g) != null && editText.isHovered())) {
                z9 = true;
            }
            if (!isEnabled()) {
                this.f10266W = this.f10304v0;
            } else if (m()) {
                if (this.f10294q0 != null) {
                    w(z8, z9);
                } else {
                    this.f10266W = getErrorCurrentTextColors();
                }
            } else if (this.f10291p && (c1178a0 = this.f10295r) != null) {
                if (this.f10294q0 != null) {
                    w(z8, z9);
                } else {
                    this.f10266W = c1178a0.getCurrentTextColor();
                }
            } else if (z8) {
                this.f10266W = this.f10292p0;
            } else if (z9) {
                this.f10266W = this.f10290o0;
            } else {
                this.f10266W = this.f10288n0;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                p();
            }
            n nVar = this.f10274f;
            TextInputLayout textInputLayout = nVar.f2970d;
            CheckableImageButton checkableImageButton = nVar.j;
            TextInputLayout textInputLayout2 = nVar.f2970d;
            nVar.l();
            AbstractC1638C.H(textInputLayout2, nVar.f2972f, nVar.f2973g);
            AbstractC1638C.H(textInputLayout2, checkableImageButton, nVar.f2978n);
            if (nVar.b() instanceof i) {
                if (textInputLayout.m() && checkableImageButton.getDrawable() != null) {
                    Drawable mutate = checkableImageButton.getDrawable().mutate();
                    mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton.setImageDrawable(mutate);
                } else {
                    AbstractC1638C.i(textInputLayout, checkableImageButton, nVar.f2978n, nVar.f2979o);
                }
            }
            v vVar = this.f10272e;
            AbstractC1638C.H(vVar.f3034d, vVar.f3037g, vVar.f3038h);
            if (this.f10261R == 2) {
                int i4 = this.f10263T;
                if (z8 && isEnabled()) {
                    this.f10263T = this.f10265V;
                } else {
                    this.f10263T = this.f10264U;
                }
                if (this.f10263T != i4 && e() && !this.f10308x0) {
                    if (e()) {
                        ((L5.g) this.f10253I).u(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    j();
                }
            }
            if (this.f10261R == 1) {
                if (!isEnabled()) {
                    this.f10267a0 = this.f10298s0;
                } else if (z9 && !z8) {
                    this.f10267a0 = this.f10302u0;
                } else if (z8) {
                    this.f10267a0 = this.f10300t0;
                } else {
                    this.f10267a0 = this.f10296r0;
                }
            }
            b();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f10272e.f3037g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f10272e.b(drawable);
    }

    public void setHint(int i4) {
        setHint(i4 != 0 ? getResources().getText(i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f10274f.j.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f10274f.j.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f10274f.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f10274f.j;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        n nVar = this.f10274f;
        TextInputLayout textInputLayout = nVar.f2970d;
        CheckableImageButton checkableImageButton = nVar.j;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC1638C.i(textInputLayout, checkableImageButton, nVar.f2978n, nVar.f2979o);
            AbstractC1638C.H(textInputLayout, checkableImageButton, nVar.f2978n);
        }
    }
}
