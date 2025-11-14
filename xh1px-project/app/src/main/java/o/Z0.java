package o;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import h.AbstractC0805a;
import java.util.WeakHashMap;
import l.C0996a;
import s3.AbstractC1492c;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public abstract class Z0 extends CompoundButton {

    /* renamed from: U, reason: collision with root package name */
    public static final C5.g f13176U = new C5.g(Float.class, "thumbPos", 10);

    /* renamed from: V, reason: collision with root package name */
    public static final int[] f13177V = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public final VelocityTracker f13178A;

    /* renamed from: B, reason: collision with root package name */
    public final int f13179B;

    /* renamed from: C, reason: collision with root package name */
    public float f13180C;

    /* renamed from: D, reason: collision with root package name */
    public int f13181D;

    /* renamed from: E, reason: collision with root package name */
    public int f13182E;

    /* renamed from: F, reason: collision with root package name */
    public int f13183F;

    /* renamed from: G, reason: collision with root package name */
    public int f13184G;

    /* renamed from: H, reason: collision with root package name */
    public int f13185H;

    /* renamed from: I, reason: collision with root package name */
    public int f13186I;

    /* renamed from: J, reason: collision with root package name */
    public int f13187J;
    public boolean K;

    /* renamed from: L, reason: collision with root package name */
    public final TextPaint f13188L;

    /* renamed from: M, reason: collision with root package name */
    public final ColorStateList f13189M;

    /* renamed from: N, reason: collision with root package name */
    public StaticLayout f13190N;

    /* renamed from: O, reason: collision with root package name */
    public StaticLayout f13191O;

    /* renamed from: P, reason: collision with root package name */
    public final C0996a f13192P;

    /* renamed from: Q, reason: collision with root package name */
    public ObjectAnimator f13193Q;

    /* renamed from: R, reason: collision with root package name */
    public C1222x f13194R;

    /* renamed from: S, reason: collision with root package name */
    public e0.h f13195S;

    /* renamed from: T, reason: collision with root package name */
    public final Rect f13196T;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f13197d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f13198e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f13199f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13200g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13201h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f13202i;
    public ColorStateList j;
    public PorterDuff.Mode k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13203l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13204m;

    /* renamed from: n, reason: collision with root package name */
    public int f13205n;

    /* renamed from: o, reason: collision with root package name */
    public int f13206o;

    /* renamed from: p, reason: collision with root package name */
    public int f13207p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13208q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f13209r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f13210s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f13211t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f13212u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13213v;

    /* renamed from: w, reason: collision with root package name */
    public int f13214w;

    /* renamed from: x, reason: collision with root package name */
    public final int f13215x;

    /* renamed from: y, reason: collision with root package name */
    public float f13216y;

    /* renamed from: z, reason: collision with root package name */
    public float f13217z;

    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, l.a] */
    public Z0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.buzbuz.smartautoclicker.R.attr.materialSwitchStyle);
        Typeface typeface;
        Typeface create;
        int i4;
        int resourceId;
        this.f13198e = null;
        this.f13199f = null;
        this.f13200g = false;
        this.f13201h = false;
        this.j = null;
        this.k = null;
        this.f13203l = false;
        this.f13204m = false;
        this.f13178A = VelocityTracker.obtain();
        this.K = true;
        this.f13196T = new Rect();
        a1.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f13188L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC0805a.f11295w;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.buzbuz.smartautoclicker.R.attr.materialSwitchStyle, 0);
        R.g gVar = new R.g(context, obtainStyledAttributes);
        P.O.l(this, context, iArr, attributeSet, obtainStyledAttributes, com.buzbuz.smartautoclicker.R.attr.materialSwitchStyle);
        Drawable A2 = gVar.A(2);
        this.f13197d = A2;
        if (A2 != null) {
            A2.setCallback(this);
        }
        Drawable A8 = gVar.A(11);
        this.f13202i = A8;
        if (A8 != null) {
            A8.setCallback(this);
        }
        setTextOnInternal(obtainStyledAttributes.getText(0));
        setTextOffInternal(obtainStyledAttributes.getText(1));
        this.f13213v = obtainStyledAttributes.getBoolean(3, true);
        this.f13205n = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f13206o = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f13207p = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.f13208q = obtainStyledAttributes.getBoolean(4, false);
        ColorStateList z8 = gVar.z(9);
        if (z8 != null) {
            this.f13198e = z8;
            this.f13200g = true;
        }
        PorterDuff.Mode c6 = AbstractC1202m0.c(obtainStyledAttributes.getInt(10, -1), null);
        if (this.f13199f != c6) {
            this.f13199f = c6;
            this.f13201h = true;
        }
        if (this.f13200g || this.f13201h) {
            a();
        }
        ColorStateList z9 = gVar.z(12);
        if (z9 != null) {
            this.j = z9;
            this.f13203l = true;
        }
        PorterDuff.Mode c9 = AbstractC1202m0.c(obtainStyledAttributes.getInt(13, -1), null);
        if (this.k != c9) {
            this.k = c9;
            this.f13204m = true;
        }
        if (this.f13203l || this.f13204m) {
            b();
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId2, AbstractC0805a.f11296x);
            ColorStateList colorStateList = (!obtainStyledAttributes2.hasValue(3) || (resourceId = obtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC1492c.o(context, resourceId)) == null) ? obtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f13189M = colorStateList;
            } else {
                this.f13189M = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f8 = dimensionPixelSize;
                if (f8 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f8);
                    requestLayout();
                }
            }
            int i8 = obtainStyledAttributes2.getInt(1, -1);
            int i9 = obtainStyledAttributes2.getInt(2, -1);
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (i9 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i9);
                } else {
                    create = Typeface.create(typeface, i9);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i4 = create.getStyle();
                } else {
                    i4 = 0;
                }
                int i10 = (~i4) & i9;
                textPaint.setFakeBoldText((i10 & 1) != 0);
                textPaint.setTextSkewX((2 & i10) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes2.getBoolean(14, false)) {
                Context context2 = getContext();
                ?? obj = new Object();
                obj.f12181d = context2.getResources().getConfiguration().locale;
                this.f13192P = obj;
            } else {
                this.f13192P = null;
            }
            setTextOnInternal(this.f13209r);
            setTextOffInternal(this.f13211t);
            obtainStyledAttributes2.recycle();
        }
        new W(this).f(attributeSet, com.buzbuz.smartautoclicker.R.attr.materialSwitchStyle);
        gVar.L();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f13215x = viewConfiguration.getScaledTouchSlop();
        this.f13179B = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.buzbuz.smartautoclicker.R.attr.materialSwitchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C1222x getEmojiTextViewHelper() {
        if (this.f13194R == null) {
            this.f13194R = new C1222x(this);
        }
        return this.f13194R;
    }

    private boolean getTargetCheckedState() {
        if (this.f13180C > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f8;
        boolean z8 = t1.f13385a;
        if (getLayoutDirection() == 1) {
            f8 = 1.0f - this.f13180C;
        } else {
            f8 = this.f13180C;
        }
        return (int) ((f8 * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f13202i;
        if (drawable != null) {
            Rect rect2 = this.f13196T;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f13197d;
            if (drawable2 != null) {
                rect = AbstractC1202m0.b(drawable2);
            } else {
                rect = AbstractC1202m0.f13321c;
            }
            return ((((this.f13181D - this.f13183F) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f13211t = charSequence;
        TransformationMethod U8 = ((AbstractC1638C) getEmojiTextViewHelper().f13408b.f6634e).U(this.f13192P);
        if (U8 != null) {
            charSequence = U8.getTransformation(charSequence, this);
        }
        this.f13212u = charSequence;
        this.f13191O = null;
        if (this.f13213v) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f13209r = charSequence;
        TransformationMethod U8 = ((AbstractC1638C) getEmojiTextViewHelper().f13408b.f6634e).U(this.f13192P);
        if (U8 != null) {
            charSequence = U8.getTransformation(charSequence, this);
        }
        this.f13210s = charSequence;
        this.f13190N = null;
        if (this.f13213v) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f13197d;
        if (drawable != null) {
            if (this.f13200g || this.f13201h) {
                Drawable mutate = drawable.mutate();
                this.f13197d = mutate;
                if (this.f13200g) {
                    mutate.setTintList(this.f13198e);
                }
                if (this.f13201h) {
                    this.f13197d.setTintMode(this.f13199f);
                }
                if (this.f13197d.isStateful()) {
                    this.f13197d.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f13202i;
        if (drawable != null) {
            if (this.f13203l || this.f13204m) {
                Drawable mutate = drawable.mutate();
                this.f13202i = mutate;
                if (this.f13203l) {
                    mutate.setTintList(this.j);
                }
                if (this.f13204m) {
                    this.f13202i.setTintMode(this.k);
                }
                if (this.f13202i.isStateful()) {
                    this.f13202i.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f13209r);
        setTextOffInternal(this.f13211t);
        requestLayout();
    }

    public final void d() {
        if (this.f13195S == null && ((AbstractC1638C) this.f13194R.f13408b.f6634e).C() && c0.k.k != null) {
            c0.k a3 = c0.k.a();
            int b4 = a3.b();
            if (b4 == 3 || b4 == 0) {
                e0.h hVar = new e0.h(this);
                this.f13195S = hVar;
                a3.f(hVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i4;
        int i8;
        int i9 = this.f13184G;
        int i10 = this.f13185H;
        int i11 = this.f13186I;
        int i12 = this.f13187J;
        int thumbOffset = getThumbOffset() + i9;
        Drawable drawable = this.f13197d;
        if (drawable != null) {
            rect = AbstractC1202m0.b(drawable);
        } else {
            rect = AbstractC1202m0.f13321c;
        }
        Drawable drawable2 = this.f13202i;
        Rect rect2 = this.f13196T;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i13 = rect2.left;
            thumbOffset += i13;
            if (rect != null) {
                int i14 = rect.left;
                if (i14 > i13) {
                    i9 += i14 - i13;
                }
                int i15 = rect.top;
                int i16 = rect2.top;
                if (i15 > i16) {
                    i4 = (i15 - i16) + i10;
                } else {
                    i4 = i10;
                }
                int i17 = rect.right;
                int i18 = rect2.right;
                if (i17 > i18) {
                    i11 -= i17 - i18;
                }
                int i19 = rect.bottom;
                int i20 = rect2.bottom;
                if (i19 > i20) {
                    i8 = i12 - (i19 - i20);
                    this.f13202i.setBounds(i9, i4, i11, i8);
                }
            } else {
                i4 = i10;
            }
            i8 = i12;
            this.f13202i.setBounds(i9, i4, i11, i8);
        }
        Drawable drawable3 = this.f13197d;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i21 = thumbOffset - rect2.left;
            int i22 = thumbOffset + this.f13183F + rect2.right;
            this.f13197d.setBounds(i21, i10, i22, i12);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i21, i10, i22, i12);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f8, float f9) {
        super.drawableHotspotChanged(f8, f9);
        Drawable drawable = this.f13197d;
        if (drawable != null) {
            drawable.setHotspot(f8, f9);
        }
        Drawable drawable2 = this.f13202i;
        if (drawable2 != null) {
            drawable2.setHotspot(f8, f9);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        boolean z8;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f13197d;
        if (drawable != null && drawable.isStateful()) {
            z8 = drawable.setState(drawableState);
        } else {
            z8 = false;
        }
        Drawable drawable2 = this.f13202i;
        if (drawable2 != null && drawable2.isStateful()) {
            z8 |= drawable2.setState(drawableState);
        }
        if (z8) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z8 = t1.f13385a;
        if (getLayoutDirection() == 1) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f13181D;
            if (!TextUtils.isEmpty(getText())) {
                return compoundPaddingLeft + this.f13207p;
            }
            return compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z8 = t1.f13385a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f13181D;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f13207p;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return E2.c.F0(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f13213v;
    }

    public boolean getSplitTrack() {
        return this.f13208q;
    }

    public int getSwitchMinWidth() {
        return this.f13206o;
    }

    public int getSwitchPadding() {
        return this.f13207p;
    }

    public CharSequence getTextOff() {
        return this.f13211t;
    }

    public CharSequence getTextOn() {
        return this.f13209r;
    }

    public Drawable getThumbDrawable() {
        return this.f13197d;
    }

    public final float getThumbPosition() {
        return this.f13180C;
    }

    public int getThumbTextPadding() {
        return this.f13205n;
    }

    public ColorStateList getThumbTintList() {
        return this.f13198e;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f13199f;
    }

    public Drawable getTrackDrawable() {
        return this.f13202i;
    }

    public ColorStateList getTrackTintList() {
        return this.j;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.k;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f13197d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f13202i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f13193Q;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f13193Q.end();
            this.f13193Q = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f13177V);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f13202i;
        Rect rect = this.f13196T;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i4 = this.f13185H;
        int i8 = this.f13187J;
        int i9 = i4 + rect.top;
        int i10 = i8 - rect.bottom;
        Drawable drawable2 = this.f13197d;
        if (drawable != null) {
            if (this.f13208q && drawable2 != null) {
                Rect b4 = AbstractC1202m0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b4.left;
                rect.right -= b4.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.f13190N;
        } else {
            staticLayout = this.f13191O;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.f13188L;
            ColorStateList colorStateList = this.f13189M;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i9 + i10) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f13209r;
            } else {
                charSequence = this.f13211t;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        int i11;
        int width;
        int i12;
        int i13;
        int i14;
        super.onLayout(z8, i4, i8, i9, i10);
        int i15 = 0;
        if (this.f13197d != null) {
            Drawable drawable = this.f13202i;
            Rect rect = this.f13196T;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b4 = AbstractC1202m0.b(this.f13197d);
            i11 = Math.max(0, b4.left - rect.left);
            i15 = Math.max(0, b4.right - rect.right);
        } else {
            i11 = 0;
        }
        boolean z9 = t1.f13385a;
        if (getLayoutDirection() == 1) {
            i12 = getPaddingLeft() + i11;
            width = ((this.f13181D + i12) - i11) - i15;
        } else {
            width = (getWidth() - getPaddingRight()) - i15;
            i12 = (width - this.f13181D) + i11 + i15;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i14 = getPaddingTop();
                i13 = this.f13182E + i14;
            } else {
                i13 = getHeight() - getPaddingBottom();
                i14 = i13 - this.f13182E;
            }
        } else {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i16 = this.f13182E;
            int i17 = height - (i16 / 2);
            i13 = i16 + i17;
            i14 = i17;
        }
        this.f13184G = i12;
        this.f13185H = i14;
        this.f13187J = i13;
        this.f13186I = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (this.f13213v) {
            StaticLayout staticLayout = this.f13190N;
            TextPaint textPaint = this.f13188L;
            if (staticLayout == null) {
                CharSequence charSequence = this.f13210s;
                if (charSequence != null) {
                    i14 = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
                } else {
                    i14 = 0;
                }
                this.f13190N = new StaticLayout(charSequence, textPaint, i14, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f13191O == null) {
                CharSequence charSequence2 = this.f13212u;
                if (charSequence2 != null) {
                    i13 = (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint));
                } else {
                    i13 = 0;
                }
                this.f13191O = new StaticLayout(charSequence2, textPaint, i13, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f13197d;
        Rect rect = this.f13196T;
        if (drawable != null) {
            drawable.getPadding(rect);
            i9 = (this.f13197d.getIntrinsicWidth() - rect.left) - rect.right;
            i10 = this.f13197d.getIntrinsicHeight();
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (this.f13213v) {
            i11 = (this.f13205n * 2) + Math.max(this.f13190N.getWidth(), this.f13191O.getWidth());
        } else {
            i11 = 0;
        }
        this.f13183F = Math.max(i11, i9);
        Drawable drawable2 = this.f13202i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i15 = this.f13202i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i16 = rect.left;
        int i17 = rect.right;
        Drawable drawable3 = this.f13197d;
        if (drawable3 != null) {
            Rect b4 = AbstractC1202m0.b(drawable3);
            i16 = Math.max(i16, b4.left);
            i17 = Math.max(i17, b4.right);
        }
        if (this.K) {
            i12 = Math.max(this.f13206o, (this.f13183F * 2) + i16 + i17);
        } else {
            i12 = this.f13206o;
        }
        int max = Math.max(i15, i10);
        this.f13181D = i12;
        this.f13182E = max;
        super.onMeasure(i4, i8);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f13209r;
        } else {
            charSequence = this.f13211t;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        boolean z9;
        float f8;
        VelocityTracker velocityTracker = this.f13178A;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i4 = this.f13215x;
        if (actionMasked != 0) {
            float f9 = 0.0f;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i8 = this.f13214w;
                    if (i8 != 1) {
                        if (i8 == 2) {
                            float x8 = motionEvent.getX();
                            int thumbScrollRange = getThumbScrollRange();
                            float f10 = x8 - this.f13216y;
                            if (thumbScrollRange != 0) {
                                f8 = f10 / thumbScrollRange;
                            } else if (f10 > 0.0f) {
                                f8 = 1.0f;
                            } else {
                                f8 = -1.0f;
                            }
                            boolean z10 = t1.f13385a;
                            if (getLayoutDirection() == 1) {
                                f8 = -f8;
                            }
                            float f11 = this.f13180C;
                            float f12 = f8 + f11;
                            if (f12 >= 0.0f) {
                                if (f12 > 1.0f) {
                                    f9 = 1.0f;
                                } else {
                                    f9 = f12;
                                }
                            }
                            if (f9 != f11) {
                                this.f13216y = x8;
                                setThumbPosition(f9);
                            }
                            return true;
                        }
                    } else {
                        float x9 = motionEvent.getX();
                        float y4 = motionEvent.getY();
                        float f13 = i4;
                        if (Math.abs(x9 - this.f13216y) > f13 || Math.abs(y4 - this.f13217z) > f13) {
                            this.f13214w = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f13216y = x9;
                            this.f13217z = y4;
                            return true;
                        }
                    }
                }
            }
            if (this.f13214w == 2) {
                this.f13214w = 0;
                if (motionEvent.getAction() == 1 && isEnabled()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean isChecked = isChecked();
                if (z8) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker.getXVelocity();
                    if (Math.abs(xVelocity) > this.f13179B) {
                        boolean z11 = t1.f13385a;
                        if (getLayoutDirection() != 1 ? xVelocity > 0.0f : xVelocity < 0.0f) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } else {
                        z9 = getTargetCheckedState();
                    }
                } else {
                    z9 = isChecked;
                }
                if (z9 != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z9);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f13214w = 0;
            velocityTracker.clear();
        } else {
            float x10 = motionEvent.getX();
            float y5 = motionEvent.getY();
            if (isEnabled() && this.f13197d != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f13197d;
                Rect rect = this.f13196T;
                drawable.getPadding(rect);
                int i9 = this.f13185H - i4;
                int i10 = (this.f13184G + thumbOffset) - i4;
                int i11 = this.f13183F + i10 + rect.left + rect.right + i4;
                int i12 = this.f13187J + i4;
                if (x10 > i10 && x10 < i11 && y5 > i9 && y5 < i12) {
                    this.f13214w = 1;
                    this.f13216y = x10;
                    this.f13217z = y5;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z8) {
        super.setChecked(z8);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f13209r;
                if (obj == null) {
                    obj = getResources().getString(com.buzbuz.smartautoclicker.R.string.abc_capital_on);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = P.O.f4214a;
                new P.A(com.buzbuz.smartautoclicker.R.id.tag_state_description, CharSequence.class, 64, 30, 2).h(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.f13211t;
            if (obj3 == null) {
                obj3 = getResources().getString(com.buzbuz.smartautoclicker.R.string.abc_capital_off);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = P.O.f4214a;
            new P.A(com.buzbuz.smartautoclicker.R.id.tag_state_description, CharSequence.class, 64, 30, 2).h(this, obj4);
        }
        float f8 = 0.0f;
        if (getWindowToken() != null && isLaidOut()) {
            if (isChecked) {
                f8 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f13176U, f8);
            this.f13193Q = ofFloat;
            ofFloat.setDuration(250L);
            this.f13193Q.setAutoCancel(true);
            this.f13193Q.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f13193Q;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f8 = 1.0f;
        }
        setThumbPosition(f8);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(E2.c.H0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().d(z8);
        setTextOnInternal(this.f13209r);
        setTextOffInternal(this.f13211t);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z8) {
        this.K = z8;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z8) {
        if (this.f13213v != z8) {
            this.f13213v = z8;
            requestLayout();
            if (z8) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z8) {
        this.f13208q = z8;
        invalidate();
    }

    public void setSwitchMinWidth(int i4) {
        this.f13206o = i4;
        requestLayout();
    }

    public void setSwitchPadding(int i4) {
        this.f13207p = i4;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f13188L;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f13211t;
            if (obj == null) {
                obj = getResources().getString(com.buzbuz.smartautoclicker.R.string.abc_capital_off);
            }
            WeakHashMap weakHashMap = P.O.f4214a;
            new P.A(com.buzbuz.smartautoclicker.R.id.tag_state_description, CharSequence.class, 64, 30, 2).h(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f13209r;
            if (obj == null) {
                obj = getResources().getString(com.buzbuz.smartautoclicker.R.string.abc_capital_on);
            }
            WeakHashMap weakHashMap = P.O.f4214a;
            new P.A(com.buzbuz.smartautoclicker.R.id.tag_state_description, CharSequence.class, 64, 30, 2).h(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f13197d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f13197d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f8) {
        this.f13180C = f8;
        invalidate();
    }

    public void setThumbResource(int i4) {
        setThumbDrawable(h4.g.k(getContext(), i4));
    }

    public void setThumbTextPadding(int i4) {
        this.f13205n = i4;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f13198e = colorStateList;
        this.f13200g = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f13199f = mode;
        this.f13201h = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f13202i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f13202i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i4) {
        setTrackDrawable(h4.g.k(getContext(), i4));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.f13203l = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.f13204m = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f13197d && drawable != this.f13202i) {
            return false;
        }
        return true;
    }
}
