package com.google.android.material.chip;

import G5.l;
import G5.w;
import M5.a;
import O7.C0235h;
import P.F;
import P.O;
import a.AbstractC0405a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import e5.AbstractC0645a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import o.r;
import q5.b;
import q5.c;
import q5.d;
import q5.e;
import q5.f;
import s3.AbstractC1492c;
import t2.C1562a;
import u6.AbstractC1638C;
import x5.g;
import x5.m;
import x5.p;

/* loaded from: classes.dex */
public class Chip extends r implements e, w, g {

    /* renamed from: A, reason: collision with root package name */
    public static final Rect f10043A = new Rect();

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f10044B = {R.attr.state_selected};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f10045C = {R.attr.state_checkable};

    /* renamed from: h, reason: collision with root package name */
    public f f10046h;

    /* renamed from: i, reason: collision with root package name */
    public InsetDrawable f10047i;
    public RippleDrawable j;
    public View.OnClickListener k;

    /* renamed from: l, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f10048l;

    /* renamed from: m, reason: collision with root package name */
    public x5.f f10049m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10050n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10051o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10052p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10053q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10054r;

    /* renamed from: s, reason: collision with root package name */
    public int f10055s;

    /* renamed from: t, reason: collision with root package name */
    public int f10056t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f10057u;

    /* renamed from: v, reason: collision with root package name */
    public final d f10058v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10059w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f10060x;

    /* renamed from: y, reason: collision with root package name */
    public final RectF f10061y;

    /* renamed from: z, reason: collision with root package name */
    public final b f10062z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.buzbuz.smartautoclicker.R.attr.chipStyle, com.buzbuz.smartautoclicker.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.buzbuz.smartautoclicker.R.attr.chipStyle);
        D5.d dVar;
        int resourceId;
        this.f10060x = new Rect();
        this.f10061y = new RectF();
        this.f10062z = new b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        f fVar = new f(context2, attributeSet);
        Context context3 = fVar.f14194i0;
        int[] iArr = AbstractC0645a.f10640i;
        TypedArray h8 = p.h(context3, attributeSet, iArr, com.buzbuz.smartautoclicker.R.attr.chipStyle, com.buzbuz.smartautoclicker.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        fVar.f14170I0 = h8.hasValue(37);
        Context context4 = fVar.f14194i0;
        ColorStateList C8 = AbstractC0405a.C(context4, h8, 24);
        if (fVar.f14155B != C8) {
            fVar.f14155B = C8;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList C9 = AbstractC0405a.C(context4, h8, 11);
        if (fVar.f14157C != C9) {
            fVar.f14157C = C9;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = h8.getDimension(19, 0.0f);
        if (fVar.f14159D != dimension) {
            fVar.f14159D = dimension;
            fVar.invalidateSelf();
            fVar.B();
        }
        if (h8.hasValue(12)) {
            fVar.H(h8.getDimension(12, 0.0f));
        }
        fVar.M(AbstractC0405a.C(context4, h8, 22));
        fVar.N(h8.getDimension(23, 0.0f));
        fVar.W(AbstractC0405a.C(context4, h8, 36));
        String text = h8.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(fVar.f14169I, text);
        m mVar = fVar.f14199o0;
        if (!equals) {
            fVar.f14169I = text;
            mVar.f16213e = true;
            fVar.invalidateSelf();
            fVar.B();
        }
        if (h8.hasValue(0) && (resourceId = h8.getResourceId(0, 0)) != 0) {
            dVar = new D5.d(context4, resourceId);
        } else {
            dVar = null;
        }
        dVar.k = h8.getDimension(1, dVar.k);
        mVar.c(dVar, context4);
        int i4 = h8.getInt(3, 0);
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    fVar.f14164F0 = TextUtils.TruncateAt.END;
                }
            } else {
                fVar.f14164F0 = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            fVar.f14164F0 = TextUtils.TruncateAt.START;
        }
        fVar.L(h8.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.L(h8.getBoolean(15, false));
        }
        fVar.I(AbstractC0405a.F(context4, h8, 14));
        if (h8.hasValue(17)) {
            fVar.K(AbstractC0405a.C(context4, h8, 17));
        }
        fVar.J(h8.getDimension(16, -1.0f));
        fVar.T(h8.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.T(h8.getBoolean(26, false));
        }
        fVar.O(AbstractC0405a.F(context4, h8, 25));
        fVar.S(AbstractC0405a.C(context4, h8, 30));
        fVar.Q(h8.getDimension(28, 0.0f));
        fVar.D(h8.getBoolean(6, false));
        fVar.G(h8.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.G(h8.getBoolean(8, false));
        }
        fVar.E(AbstractC0405a.F(context4, h8, 7));
        if (h8.hasValue(9)) {
            fVar.F(AbstractC0405a.C(context4, h8, 9));
        }
        fVar.Y = f5.e.a(context4, h8, 39);
        fVar.f14185Z = f5.e.a(context4, h8, 33);
        float dimension2 = h8.getDimension(21, 0.0f);
        if (fVar.f14186a0 != dimension2) {
            fVar.f14186a0 = dimension2;
            fVar.invalidateSelf();
            fVar.B();
        }
        fVar.V(h8.getDimension(35, 0.0f));
        fVar.U(h8.getDimension(34, 0.0f));
        float dimension3 = h8.getDimension(41, 0.0f);
        if (fVar.f14189d0 != dimension3) {
            fVar.f14189d0 = dimension3;
            fVar.invalidateSelf();
            fVar.B();
        }
        float dimension4 = h8.getDimension(40, 0.0f);
        if (fVar.f14190e0 != dimension4) {
            fVar.f14190e0 = dimension4;
            fVar.invalidateSelf();
            fVar.B();
        }
        fVar.R(h8.getDimension(29, 0.0f));
        fVar.P(h8.getDimension(27, 0.0f));
        float dimension5 = h8.getDimension(13, 0.0f);
        if (fVar.f14193h0 != dimension5) {
            fVar.f14193h0 = dimension5;
            fVar.invalidateSelf();
            fVar.B();
        }
        fVar.f14168H0 = h8.getDimensionPixelSize(4, Integer.MAX_VALUE);
        h8.recycle();
        p.a(context2, attributeSet, com.buzbuz.smartautoclicker.R.attr.chipStyle, com.buzbuz.smartautoclicker.R.style.Widget_MaterialComponents_Chip_Action);
        p.b(context2, attributeSet, iArr, com.buzbuz.smartautoclicker.R.attr.chipStyle, com.buzbuz.smartautoclicker.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.buzbuz.smartautoclicker.R.attr.chipStyle, com.buzbuz.smartautoclicker.R.style.Widget_MaterialComponents_Chip_Action);
        this.f10054r = obtainStyledAttributes.getBoolean(32, false);
        this.f10056t = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.l(F.e(this));
        p.a(context2, attributeSet, com.buzbuz.smartautoclicker.R.attr.chipStyle, com.buzbuz.smartautoclicker.R.style.Widget_MaterialComponents_Chip_Action);
        p.b(context2, attributeSet, iArr, com.buzbuz.smartautoclicker.R.attr.chipStyle, com.buzbuz.smartautoclicker.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.buzbuz.smartautoclicker.R.attr.chipStyle, com.buzbuz.smartautoclicker.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f10058v = new d(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.f10050n);
        setText(fVar.f14169I);
        setEllipsize(fVar.f14164F0);
        h();
        if (!this.f10046h.f14166G0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f10054r) {
            setMinHeight(this.f10056t);
        }
        this.f10055s = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: q5.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                Chip chip = Chip.this;
                x5.f fVar2 = chip.f10049m;
                if (fVar2 != null) {
                    X6.r rVar = (X6.r) ((C1562a) fVar2).f15048d;
                    if (!z8 ? rVar.j(chip, rVar.f7036c) : rVar.a(chip)) {
                        rVar.h();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f10048l;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z8);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f10061y;
        rectF.setEmpty();
        if (d() && this.k != null) {
            f fVar = this.f10046h;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.Z()) {
                float f8 = fVar.f14193h0 + fVar.f14192g0 + fVar.f14179S + fVar.f14191f0 + fVar.f14190e0;
                if (fVar.getLayoutDirection() == 0) {
                    float f9 = bounds.right;
                    rectF.right = f9;
                    rectF.left = f9 - f8;
                } else {
                    float f10 = bounds.left;
                    rectF.left = f10;
                    rectF.right = f10 + f8;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i4 = (int) closeIconTouchBounds.left;
        int i8 = (int) closeIconTouchBounds.top;
        int i9 = (int) closeIconTouchBounds.right;
        int i10 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f10060x;
        rect.set(i4, i8, i9, i10);
        return rect;
    }

    private D5.d getTextAppearance() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14199o0.f16215g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z8) {
        if (this.f10052p != z8) {
            this.f10052p = z8;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z8) {
        if (this.f10051o != z8) {
            this.f10051o = z8;
            refreshDrawableState();
        }
    }

    public final void c(int i4) {
        int i8;
        this.f10056t = i4;
        int i9 = 0;
        if (!this.f10054r) {
            InsetDrawable insetDrawable = this.f10047i;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f10047i = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr = E5.a.f1245a;
                    f();
                    return;
                }
                return;
            }
            int[] iArr2 = E5.a.f1245a;
            f();
            return;
        }
        int max = Math.max(0, i4 - ((int) this.f10046h.f14159D));
        int max2 = Math.max(0, i4 - this.f10046h.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f10047i;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f10047i = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr3 = E5.a.f1245a;
                    f();
                    return;
                }
                return;
            }
            int[] iArr4 = E5.a.f1245a;
            f();
            return;
        }
        if (max2 > 0) {
            i8 = max2 / 2;
        } else {
            i8 = 0;
        }
        if (max > 0) {
            i9 = max / 2;
        }
        int i10 = i9;
        if (this.f10047i != null) {
            Rect rect = new Rect();
            this.f10047i.getPadding(rect);
            if (rect.top == i10 && rect.bottom == i10 && rect.left == i8 && rect.right == i8) {
                int[] iArr5 = E5.a.f1245a;
                f();
                return;
            }
        }
        if (getMinHeight() != i4) {
            setMinHeight(i4);
        }
        if (getMinWidth() != i4) {
            setMinWidth(i4);
        }
        this.f10047i = new InsetDrawable((Drawable) this.f10046h, i8, i10, i8, i10);
        int[] iArr6 = E5.a.f1245a;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        f fVar = this.f10046h;
        if (fVar != null) {
            Object obj = fVar.f14176P;
            if (obj != null) {
                if (obj instanceof I.c) {
                }
                if (obj == null) {
                    return true;
                }
                return false;
            }
            obj = null;
            if (obj == null) {
            }
        } else {
            return false;
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f10059w) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!this.f10058v.m(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f10059w) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f10058v;
        dVar.getClass();
        boolean z8 = false;
        int i4 = 0;
        z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i8 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i8 = 130;
                                        }
                                    } else {
                                        i8 = 17;
                                    }
                                } else {
                                    i8 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z9 = false;
                                while (i4 < repeatCount && dVar.q(i8, null)) {
                                    i4++;
                                    z9 = true;
                                }
                                z8 = z9;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i9 = dVar.f6452l;
                    if (i9 != Integer.MIN_VALUE) {
                        dVar.s(i9, 16, null);
                    }
                    z8 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z8 = dVar.q(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z8 = dVar.q(1, null);
            }
        }
        if (z8 && dVar.f6452l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // o.r, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i4;
        super.drawableStateChanged();
        f fVar = this.f10046h;
        boolean z8 = false;
        if (fVar != null && f.A(fVar.f14176P)) {
            f fVar2 = this.f10046h;
            ?? isEnabled = isEnabled();
            int i8 = isEnabled;
            if (this.f10053q) {
                i8 = isEnabled + 1;
            }
            int i9 = i8;
            if (this.f10052p) {
                i9 = i8 + 1;
            }
            int i10 = i9;
            if (this.f10051o) {
                i10 = i9 + 1;
            }
            int i11 = i10;
            if (isChecked()) {
                i11 = i10 + 1;
            }
            int[] iArr = new int[i11];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (this.f10053q) {
                iArr[i4] = 16842908;
                i4++;
            }
            if (this.f10052p) {
                iArr[i4] = 16843623;
                i4++;
            }
            if (this.f10051o) {
                iArr[i4] = 16842919;
                i4++;
            }
            if (isChecked()) {
                iArr[i4] = 16842913;
            }
            if (!Arrays.equals(fVar2.f14158C0, iArr)) {
                fVar2.f14158C0 = iArr;
                if (fVar2.Z()) {
                    z8 = fVar2.C(fVar2.getState(), iArr);
                }
            }
        }
        if (z8) {
            invalidate();
        }
    }

    public final void e() {
        f fVar;
        if (d() && (fVar = this.f10046h) != null && fVar.f14175O && this.k != null) {
            O.m(this, this.f10058v);
            this.f10059w = true;
        } else {
            O.m(this, null);
            this.f10059w = false;
        }
    }

    public final void f() {
        this.j = new RippleDrawable(E5.a.b(this.f10046h.f14167H), getBackgroundDrawable(), null);
        this.f10046h.getClass();
        RippleDrawable rippleDrawable = this.j;
        WeakHashMap weakHashMap = O.f4214a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        f fVar;
        if (!TextUtils.isEmpty(getText()) && (fVar = this.f10046h) != null) {
            int x8 = (int) (fVar.x() + fVar.f14193h0 + fVar.f14190e0);
            f fVar2 = this.f10046h;
            int w8 = (int) (fVar2.w() + fVar2.f14186a0 + fVar2.f14189d0);
            if (this.f10047i != null) {
                Rect rect = new Rect();
                this.f10047i.getPadding(rect);
                w8 += rect.left;
                x8 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = O.f4214a;
            setPaddingRelative(w8, paddingTop, x8, paddingBottom);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f10057u)) {
            return this.f10057u;
        }
        f fVar = this.f10046h;
        if (fVar != null && fVar.f14181U) {
            ViewParent parent = getParent();
            if ((parent instanceof ChipGroup) && ((ChipGroup) parent).k.f7035b) {
                return "android.widget.RadioButton";
            }
            return "android.widget.Button";
        }
        if (isClickable()) {
            return "android.widget.Button";
        }
        return "android.view.View";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f10047i;
        if (insetDrawable == null) {
            return this.f10046h;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14183W;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14184X;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14157C;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f10046h;
        if (fVar == null) {
            return 0.0f;
        }
        return Math.max(0.0f, fVar.y());
    }

    public Drawable getChipDrawable() {
        return this.f10046h;
    }

    public float getChipEndPadding() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14193h0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f10046h;
        if (fVar == null || (drawable = fVar.K) == 0) {
            return null;
        }
        if (drawable instanceof I.c) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14173M;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14172L;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14159D;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14186a0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14163F;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14165G;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f10046h;
        if (fVar == null || (drawable = fVar.f14176P) == 0) {
            return null;
        }
        if (drawable instanceof I.c) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14180T;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14192g0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14179S;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14191f0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14178R;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14164F0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f10059w) {
            d dVar = this.f10058v;
            if (dVar.f6452l == 1 || dVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public f5.e getHideMotionSpec() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14185Z;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14188c0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14187b0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14167H;
        }
        return null;
    }

    public l getShapeAppearanceModel() {
        return this.f10046h.f1769d.f1752a;
    }

    public f5.e getShowMotionSpec() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.Y;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14190e0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f10046h;
        if (fVar != null) {
            return fVar.f14189d0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        f fVar = this.f10046h;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        D5.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f10062z);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1638C.L(this, this.f10046h);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f10044B);
        }
        f fVar = this.f10046h;
        if (fVar != null && fVar.f14181U) {
            View.mergeDrawableStates(onCreateDrawableState, f10045C);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z8, int i4, Rect rect) {
        super.onFocusChanged(z8, i4, rect);
        if (this.f10059w) {
            d dVar = this.f10058v;
            int i8 = dVar.f6452l;
            if (i8 != Integer.MIN_VALUE) {
                dVar.j(i8);
            }
            if (z8) {
                dVar.q(i4, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z8;
        int i4;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        f fVar = this.f10046h;
        if (fVar != null && fVar.f14181U) {
            z8 = true;
        } else {
            z8 = false;
        }
        accessibilityNodeInfo.setCheckable(z8);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i8 = -1;
            if (chipGroup.f16192f) {
                i4 = 0;
                for (int i9 = 0; i9 < chipGroup.getChildCount(); i9++) {
                    View childAt = chipGroup.getChildAt(i9);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i9).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
            i4 = -1;
            Object tag = getTag(com.buzbuz.smartautoclicker.R.id.row_index_key);
            if (tag instanceof Integer) {
                i8 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0235h.a(isChecked(), i8, 1, i4, 1).f4138d);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i4) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        if (this.f10055s != i4) {
            this.f10055s = i4;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f10051o) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z8 = true;
                    }
                }
                z8 = false;
            } else if (this.f10051o) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.k;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f10059w) {
                    this.f10058v.x(1, 1);
                }
                z8 = true;
                setCloseIconPressed(false);
            }
            z8 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z8 = true;
            }
            z8 = false;
        }
        if (z8 || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f10057u = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.j) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // o.r, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.j) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // o.r, android.view.View
    public void setBackgroundResource(int i4) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z8) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.D(z8);
        }
    }

    public void setCheckableResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.D(fVar.f14194i0.getResources().getBoolean(i4));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z8) {
        f fVar = this.f10046h;
        if (fVar == null) {
            this.f10050n = z8;
        } else if (fVar.f14181U) {
            super.setChecked(z8);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.E(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z8) {
        setCheckedIconVisible(z8);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i4) {
        setCheckedIconVisible(i4);
    }

    public void setCheckedIconResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.E(h4.g.k(fVar.f14194i0, i4));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.F(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.F(AbstractC1492c.o(fVar.f14194i0, i4));
        }
    }

    public void setCheckedIconVisible(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.G(fVar.f14194i0.getResources().getBoolean(i4));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f10046h;
        if (fVar != null && fVar.f14157C != colorStateList) {
            fVar.f14157C = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i4) {
        ColorStateList o7;
        f fVar = this.f10046h;
        if (fVar != null && fVar.f14157C != (o7 = AbstractC1492c.o(fVar.f14194i0, i4))) {
            fVar.f14157C = o7;
            fVar.onStateChange(fVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f8) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.H(f8);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.H(fVar.f14194i0.getResources().getDimension(i4));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f10046h;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f14162E0 = new WeakReference(null);
            }
            this.f10046h = fVar;
            fVar.f14166G0 = false;
            fVar.f14162E0 = new WeakReference(this);
            c(this.f10056t);
        }
    }

    public void setChipEndPadding(float f8) {
        f fVar = this.f10046h;
        if (fVar != null && fVar.f14193h0 != f8) {
            fVar.f14193h0 = f8;
            fVar.invalidateSelf();
            fVar.B();
        }
    }

    public void setChipEndPaddingResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            float dimension = fVar.f14194i0.getResources().getDimension(i4);
            if (fVar.f14193h0 != dimension) {
                fVar.f14193h0 = dimension;
                fVar.invalidateSelf();
                fVar.B();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.I(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z8) {
        setChipIconVisible(z8);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i4) {
        setChipIconVisible(i4);
    }

    public void setChipIconResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.I(h4.g.k(fVar.f14194i0, i4));
        }
    }

    public void setChipIconSize(float f8) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.J(f8);
        }
    }

    public void setChipIconSizeResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.J(fVar.f14194i0.getResources().getDimension(i4));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.K(colorStateList);
        }
    }

    public void setChipIconTintResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.K(AbstractC1492c.o(fVar.f14194i0, i4));
        }
    }

    public void setChipIconVisible(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.L(fVar.f14194i0.getResources().getBoolean(i4));
        }
    }

    public void setChipMinHeight(float f8) {
        f fVar = this.f10046h;
        if (fVar != null && fVar.f14159D != f8) {
            fVar.f14159D = f8;
            fVar.invalidateSelf();
            fVar.B();
        }
    }

    public void setChipMinHeightResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            float dimension = fVar.f14194i0.getResources().getDimension(i4);
            if (fVar.f14159D != dimension) {
                fVar.f14159D = dimension;
                fVar.invalidateSelf();
                fVar.B();
            }
        }
    }

    public void setChipStartPadding(float f8) {
        f fVar = this.f10046h;
        if (fVar != null && fVar.f14186a0 != f8) {
            fVar.f14186a0 = f8;
            fVar.invalidateSelf();
            fVar.B();
        }
    }

    public void setChipStartPaddingResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            float dimension = fVar.f14194i0.getResources().getDimension(i4);
            if (fVar.f14186a0 != dimension) {
                fVar.f14186a0 = dimension;
                fVar.invalidateSelf();
                fVar.B();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.M(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.M(AbstractC1492c.o(fVar.f14194i0, i4));
        }
    }

    public void setChipStrokeWidth(float f8) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.N(f8);
        }
    }

    public void setChipStrokeWidthResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.N(fVar.f14194i0.getResources().getDimension(i4));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i4) {
        setText(getResources().getString(i4));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.O(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        N.b bVar;
        f fVar = this.f10046h;
        if (fVar != null && fVar.f14180T != charSequence) {
            String str = N.b.f3513b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = N.b.f3516e;
            } else {
                bVar = N.b.f3515d;
            }
            bVar.getClass();
            N.f fVar2 = N.g.f3526a;
            fVar.f14180T = bVar.c(charSequence);
            fVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z8) {
        setCloseIconVisible(z8);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i4) {
        setCloseIconVisible(i4);
    }

    public void setCloseIconEndPadding(float f8) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.P(f8);
        }
    }

    public void setCloseIconEndPaddingResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.P(fVar.f14194i0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.O(h4.g.k(fVar.f14194i0, i4));
        }
        e();
    }

    public void setCloseIconSize(float f8) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.Q(f8);
        }
    }

    public void setCloseIconSizeResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.Q(fVar.f14194i0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconStartPadding(float f8) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.R(f8);
        }
    }

    public void setCloseIconStartPaddingResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.R(fVar.f14194i0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.S(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.S(AbstractC1492c.o(fVar.f14194i0, i4));
        }
    }

    public void setCloseIconVisible(int i4) {
        setCloseIconVisible(getResources().getBoolean(i4));
    }

    @Override // o.r, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // o.r, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i8, int i9, int i10) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i8, i9, i10);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i8, int i9, int i10) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i4, i8, i9, i10);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.l(f8);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f10046h != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                f fVar = this.f10046h;
                if (fVar != null) {
                    fVar.f14164F0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z8) {
        this.f10054r = z8;
        c(this.f10056t);
    }

    @Override // android.widget.TextView
    public void setGravity(int i4) {
        if (i4 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i4);
        }
    }

    public void setHideMotionSpec(f5.e eVar) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.f14185Z = eVar;
        }
    }

    public void setHideMotionSpecResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.f14185Z = f5.e.b(fVar.f14194i0, i4);
        }
    }

    public void setIconEndPadding(float f8) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.U(f8);
        }
    }

    public void setIconEndPaddingResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.U(fVar.f14194i0.getResources().getDimension(i4));
        }
    }

    public void setIconStartPadding(float f8) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.V(f8);
        }
    }

    public void setIconStartPaddingResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.V(fVar.f14194i0.getResources().getDimension(i4));
        }
    }

    @Override // x5.g
    public void setInternalOnCheckedChangeListener(x5.f fVar) {
        this.f10049m = fVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i4) {
        if (this.f10046h == null) {
            return;
        }
        super.setLayoutDirection(i4);
    }

    @Override // android.widget.TextView
    public void setLines(int i4) {
        if (i4 <= 1) {
            super.setLines(i4);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i4) {
        if (i4 <= 1) {
            super.setMaxLines(i4);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i4) {
        super.setMaxWidth(i4);
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.f14168H0 = i4;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i4) {
        if (i4 <= 1) {
            super.setMinLines(i4);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f10048l = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.k = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.W(colorStateList);
        }
        this.f10046h.getClass();
        f();
    }

    public void setRippleColorResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.W(AbstractC1492c.o(fVar.f14194i0, i4));
            this.f10046h.getClass();
            f();
        }
    }

    @Override // G5.w
    public void setShapeAppearanceModel(l lVar) {
        this.f10046h.setShapeAppearanceModel(lVar);
    }

    public void setShowMotionSpec(f5.e eVar) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.Y = eVar;
        }
    }

    public void setShowMotionSpecResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.Y = f5.e.b(fVar.f14194i0, i4);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z8) {
        if (z8) {
            super.setSingleLine(z8);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        f fVar = this.f10046h;
        if (fVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (fVar.f14166G0) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            f fVar2 = this.f10046h;
            if (fVar2 != null && !TextUtils.equals(fVar2.f14169I, charSequence)) {
                fVar2.f14169I = charSequence;
                fVar2.f14199o0.f16213e = true;
                fVar2.invalidateSelf();
                fVar2.B();
            }
        }
    }

    public void setTextAppearance(D5.d dVar) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.f14199o0.c(dVar, fVar.f14194i0);
        }
        h();
    }

    public void setTextAppearanceResource(int i4) {
        setTextAppearance(getContext(), i4);
    }

    public void setTextEndPadding(float f8) {
        f fVar = this.f10046h;
        if (fVar != null && fVar.f14190e0 != f8) {
            fVar.f14190e0 = f8;
            fVar.invalidateSelf();
            fVar.B();
        }
    }

    public void setTextEndPaddingResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            float dimension = fVar.f14194i0.getResources().getDimension(i4);
            if (fVar.f14190e0 != dimension) {
                fVar.f14190e0 = dimension;
                fVar.invalidateSelf();
                fVar.B();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f8) {
        super.setTextSize(i4, f8);
        f fVar = this.f10046h;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i4, f8, getResources().getDisplayMetrics());
            m mVar = fVar.f14199o0;
            D5.d dVar = mVar.f16215g;
            if (dVar != null) {
                dVar.k = applyDimension;
                mVar.f16209a.setTextSize(applyDimension);
                fVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f8) {
        f fVar = this.f10046h;
        if (fVar != null && fVar.f14189d0 != f8) {
            fVar.f14189d0 = f8;
            fVar.invalidateSelf();
            fVar.B();
        }
    }

    public void setTextStartPaddingResource(int i4) {
        f fVar = this.f10046h;
        if (fVar != null) {
            float dimension = fVar.f14194i0.getResources().getDimension(i4);
            if (fVar.f14189d0 != dimension) {
                fVar.f14189d0 = dimension;
                fVar.invalidateSelf();
                fVar.B();
            }
        }
    }

    public void setCloseIconVisible(boolean z8) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.T(z8);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z8) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.G(z8);
        }
    }

    public void setChipIconVisible(boolean z8) {
        f fVar = this.f10046h;
        if (fVar != null) {
            fVar.L(z8);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        f fVar = this.f10046h;
        if (fVar != null) {
            Context context2 = fVar.f14194i0;
            fVar.f14199o0.c(new D5.d(context2, i4), context2);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i4) {
        super.setTextAppearance(i4);
        f fVar = this.f10046h;
        if (fVar != null) {
            Context context = fVar.f14194i0;
            fVar.f14199o0.c(new D5.d(context, i4), context);
        }
        h();
    }
}
