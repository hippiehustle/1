package com.google.android.material.button;

import F3.f;
import G5.l;
import G5.w;
import M5.a;
import P.O;
import a.AbstractC0405a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import e5.AbstractC0645a;
import h4.g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m5.InterfaceC1094a;
import m5.b;
import m5.c;
import o.C1209q;
import s3.AbstractC1492c;
import u6.AbstractC1638C;
import x5.p;

/* loaded from: classes.dex */
public class MaterialButton extends C1209q implements Checkable, w {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f9989u = {R.attr.state_checkable};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f9990v = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    public final c f9991g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f9992h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1094a f9993i;
    public PorterDuff.Mode j;
    public ColorStateList k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f9994l;

    /* renamed from: m, reason: collision with root package name */
    public String f9995m;

    /* renamed from: n, reason: collision with root package name */
    public int f9996n;

    /* renamed from: o, reason: collision with root package name */
    public int f9997o;

    /* renamed from: p, reason: collision with root package name */
    public int f9998p;

    /* renamed from: q, reason: collision with root package name */
    public int f9999q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10000r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10001s;

    /* renamed from: t, reason: collision with root package name */
    public int f10002t;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.buzbuz.smartautoclicker.R.attr.materialButtonStyle, com.buzbuz.smartautoclicker.R.style.Widget_MaterialComponents_Button), attributeSet, com.buzbuz.smartautoclicker.R.attr.materialButtonStyle);
        this.f9992h = new LinkedHashSet();
        this.f10000r = false;
        this.f10001s = false;
        Context context2 = getContext();
        TypedArray h8 = p.h(context2, attributeSet, AbstractC0645a.f10650u, com.buzbuz.smartautoclicker.R.attr.materialButtonStyle, com.buzbuz.smartautoclicker.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f9999q = h8.getDimensionPixelSize(12, 0);
        int i4 = h8.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.j = p.j(i4, mode);
        this.k = AbstractC0405a.C(getContext(), h8, 14);
        this.f9994l = AbstractC0405a.F(getContext(), h8, 10);
        this.f10002t = h8.getInteger(11, 1);
        this.f9996n = h8.getDimensionPixelSize(13, 0);
        c cVar = new c(this, l.b(context2, attributeSet, com.buzbuz.smartautoclicker.R.attr.materialButtonStyle, com.buzbuz.smartautoclicker.R.style.Widget_MaterialComponents_Button).a());
        this.f9991g = cVar;
        cVar.f12528c = h8.getDimensionPixelOffset(1, 0);
        cVar.f12529d = h8.getDimensionPixelOffset(2, 0);
        cVar.f12530e = h8.getDimensionPixelOffset(3, 0);
        cVar.f12531f = h8.getDimensionPixelOffset(4, 0);
        if (h8.hasValue(8)) {
            int dimensionPixelSize = h8.getDimensionPixelSize(8, -1);
            cVar.f12532g = dimensionPixelSize;
            f e9 = cVar.f12527b.e();
            e9.c(dimensionPixelSize);
            cVar.c(e9.a());
            cVar.f12539p = true;
        }
        cVar.f12533h = h8.getDimensionPixelSize(20, 0);
        cVar.f12534i = p.j(h8.getInt(7, -1), mode);
        cVar.j = AbstractC0405a.C(getContext(), h8, 6);
        cVar.k = AbstractC0405a.C(getContext(), h8, 19);
        cVar.f12535l = AbstractC0405a.C(getContext(), h8, 16);
        cVar.f12540q = h8.getBoolean(5, false);
        cVar.f12543t = h8.getDimensionPixelSize(9, 0);
        cVar.f12541r = h8.getBoolean(21, true);
        WeakHashMap weakHashMap = O.f4214a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (h8.hasValue(0)) {
            cVar.f12538o = true;
            setSupportBackgroundTintList(cVar.j);
            setSupportBackgroundTintMode(cVar.f12534i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f12528c, paddingTop + cVar.f12530e, paddingEnd + cVar.f12529d, paddingBottom + cVar.f12531f);
        h8.recycle();
        setCompoundDrawablePadding(this.f9999q);
        c(this.f9994l != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f8 = 0.0f;
        for (int i4 = 0; i4 < lineCount; i4++) {
            f8 = Math.max(f8, getLayout().getLineWidth(i4));
        }
        return (int) Math.ceil(f8);
    }

    public final boolean a() {
        c cVar = this.f9991g;
        if (cVar != null && !cVar.f12538o) {
            return true;
        }
        return false;
    }

    public final void b() {
        int i4 = this.f10002t;
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3 && i4 != 4) {
                if (i4 != 16 && i4 != 32) {
                    return;
                }
                setCompoundDrawablesRelative(null, this.f9994l, null, null);
                return;
            }
            setCompoundDrawablesRelative(null, null, this.f9994l, null);
            return;
        }
        setCompoundDrawablesRelative(this.f9994l, null, null, null);
    }

    public final void c(boolean z8) {
        Drawable drawable = this.f9994l;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f9994l = mutate;
            mutate.setTintList(this.k);
            PorterDuff.Mode mode = this.j;
            if (mode != null) {
                this.f9994l.setTintMode(mode);
            }
            int i4 = this.f9996n;
            if (i4 == 0) {
                i4 = this.f9994l.getIntrinsicWidth();
            }
            int i8 = this.f9996n;
            if (i8 == 0) {
                i8 = this.f9994l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f9994l;
            int i9 = this.f9997o;
            int i10 = this.f9998p;
            drawable2.setBounds(i9, i10, i4 + i9, i8 + i10);
            this.f9994l.setVisible(true, z8);
        }
        if (z8) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i11 = this.f10002t;
        if (((i11 != 1 && i11 != 2) || drawable3 == this.f9994l) && (((i11 != 3 && i11 != 4) || drawable5 == this.f9994l) && ((i11 != 16 && i11 != 32) || drawable4 == this.f9994l))) {
            return;
        }
        b();
    }

    public final void d(int i4, int i8) {
        boolean z8;
        if (this.f9994l != null && getLayout() != null) {
            int i9 = this.f10002t;
            boolean z9 = true;
            if (i9 != 1 && i9 != 2 && i9 != 3 && i9 != 4) {
                if (i9 != 16 && i9 != 32) {
                    return;
                }
                this.f9997o = 0;
                if (i9 == 16) {
                    this.f9998p = 0;
                    c(false);
                    return;
                }
                int i10 = this.f9996n;
                if (i10 == 0) {
                    i10 = this.f9994l.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i8 - getTextHeight()) - getPaddingTop()) - i10) - this.f9999q) - getPaddingBottom()) / 2);
                if (this.f9998p != max) {
                    this.f9998p = max;
                    c(false);
                    return;
                }
                return;
            }
            this.f9998p = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i11 = this.f10002t;
            if (i11 != 1 && i11 != 3 && ((i11 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i11 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i12 = this.f9996n;
                if (i12 == 0) {
                    i12 = this.f9994l.getIntrinsicWidth();
                }
                int textLayoutWidth = i4 - getTextLayoutWidth();
                WeakHashMap weakHashMap = O.f4214a;
                int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i12) - this.f9999q) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    paddingEnd /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (this.f10002t != 4) {
                    z9 = false;
                }
                if (z8 != z9) {
                    paddingEnd = -paddingEnd;
                }
                if (this.f9997o != paddingEnd) {
                    this.f9997o = paddingEnd;
                    c(false);
                    return;
                }
                return;
            }
            this.f9997o = 0;
            c(false);
        }
    }

    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.f9995m)) {
            return this.f9995m;
        }
        c cVar = this.f9991g;
        if (cVar != null && cVar.f12540q) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f9991g.f12532g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f9994l;
    }

    public int getIconGravity() {
        return this.f10002t;
    }

    public int getIconPadding() {
        return this.f9999q;
    }

    public int getIconSize() {
        return this.f9996n;
    }

    public ColorStateList getIconTint() {
        return this.k;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.j;
    }

    public int getInsetBottom() {
        return this.f9991g.f12531f;
    }

    public int getInsetTop() {
        return this.f9991g.f12530e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f9991g.f12535l;
        }
        return null;
    }

    public l getShapeAppearanceModel() {
        if (a()) {
            return this.f9991g.f12527b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f9991g.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f9991g.f12533h;
        }
        return 0;
    }

    @Override // o.C1209q
    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.f9991g.j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // o.C1209q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.f9991g.f12534i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f10000r;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            AbstractC1638C.L(this, this.f9991g.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        c cVar = this.f9991g;
        if (cVar != null && cVar.f12540q) {
            View.mergeDrawableStates(onCreateDrawableState, f9989u);
        }
        if (this.f10000r) {
            View.mergeDrawableStates(onCreateDrawableState, f9990v);
        }
        return onCreateDrawableState;
    }

    @Override // o.C1209q, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f10000r);
    }

    @Override // o.C1209q, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z8;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        c cVar = this.f9991g;
        if (cVar != null && cVar.f12540q) {
            z8 = true;
        } else {
            z8 = false;
        }
        accessibilityNodeInfo.setCheckable(z8);
        accessibilityNodeInfo.setChecked(this.f10000r);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // o.C1209q, android.widget.TextView, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        super.onLayout(z8, i4, i8, i9, i10);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f6209d);
        setChecked(bVar.f12525f);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, V.b, m5.b] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new V.b(super.onSaveInstanceState());
        bVar.f12525f = this.f10000r;
        return bVar;
    }

    @Override // o.C1209q, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i4, int i8, int i9) {
        super.onTextChanged(charSequence, i4, i8, i9);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f9991g.f12541r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f9994l != null) {
            if (this.f9994l.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f9995m = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        if (a()) {
            c cVar = this.f9991g;
            if (cVar.b(false) != null) {
                cVar.b(false).setTint(i4);
                return;
            }
            return;
        }
        super.setBackgroundColor(i4);
    }

    @Override // o.C1209q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                c cVar = this.f9991g;
                cVar.f12538o = true;
                MaterialButton materialButton = cVar.f12526a;
                materialButton.setSupportBackgroundTintList(cVar.j);
                materialButton.setSupportBackgroundTintMode(cVar.f12534i);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // o.C1209q, android.view.View
    public void setBackgroundResource(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = g.k(getContext(), i4);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z8) {
        if (a()) {
            this.f9991g.f12540q = z8;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        c cVar = this.f9991g;
        if (cVar != null && cVar.f12540q && isEnabled() && this.f10000r != z8) {
            this.f10000r = z8;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z9 = this.f10000r;
                if (!materialButtonToggleGroup.f10009i) {
                    materialButtonToggleGroup.b(getId(), z9);
                }
            }
            if (!this.f10001s) {
                this.f10001s = true;
                Iterator it = this.f9992h.iterator();
                if (!it.hasNext()) {
                    this.f10001s = false;
                } else {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public void setCornerRadius(int i4) {
        if (a()) {
            c cVar = this.f9991g;
            if (!cVar.f12539p || cVar.f12532g != i4) {
                cVar.f12532g = i4;
                cVar.f12539p = true;
                f e9 = cVar.f12527b.e();
                e9.c(i4);
                cVar.c(e9.a());
            }
        }
    }

    public void setCornerRadiusResource(int i4) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i4));
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        if (a()) {
            this.f9991g.b(false).l(f8);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f9994l != drawable) {
            this.f9994l = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i4) {
        if (this.f10002t != i4) {
            this.f10002t = i4;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i4) {
        if (this.f9999q != i4) {
            this.f9999q = i4;
            setCompoundDrawablePadding(i4);
        }
    }

    public void setIconResource(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = g.k(getContext(), i4);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i4) {
        if (i4 >= 0) {
            if (this.f9996n != i4) {
                this.f9996n = i4;
                c(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.j != mode) {
            this.j = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i4) {
        setIconTint(AbstractC1492c.o(getContext(), i4));
    }

    public void setInsetBottom(int i4) {
        c cVar = this.f9991g;
        cVar.d(cVar.f12530e, i4);
    }

    public void setInsetTop(int i4) {
        c cVar = this.f9991g;
        cVar.d(i4, cVar.f12531f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC1094a interfaceC1094a) {
        this.f9993i = interfaceC1094a;
    }

    @Override // android.view.View
    public void setPressed(boolean z8) {
        InterfaceC1094a interfaceC1094a = this.f9993i;
        if (interfaceC1094a != null) {
            ((MaterialButtonToggleGroup) ((W5.a) interfaceC1094a).f6634e).invalidate();
        }
        super.setPressed(z8);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f9991g;
            MaterialButton materialButton = cVar.f12526a;
            if (cVar.f12535l != colorStateList) {
                cVar.f12535l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(E5.a.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i4) {
        if (a()) {
            setRippleColor(AbstractC1492c.o(getContext(), i4));
        }
    }

    @Override // G5.w
    public void setShapeAppearanceModel(l lVar) {
        if (a()) {
            this.f9991g.c(lVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z8) {
        if (a()) {
            c cVar = this.f9991g;
            cVar.f12537n = z8;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f9991g;
            if (cVar.k != colorStateList) {
                cVar.k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i4) {
        if (a()) {
            setStrokeColor(AbstractC1492c.o(getContext(), i4));
        }
    }

    public void setStrokeWidth(int i4) {
        if (a()) {
            c cVar = this.f9991g;
            if (cVar.f12533h != i4) {
                cVar.f12533h = i4;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i4) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i4));
        }
    }

    @Override // o.C1209q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f9991g;
            if (cVar.j != colorStateList) {
                cVar.j = colorStateList;
                if (cVar.b(false) != null) {
                    cVar.b(false).setTintList(cVar.j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // o.C1209q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            c cVar = this.f9991g;
            if (cVar.f12534i != mode) {
                cVar.f12534i = mode;
                if (cVar.b(false) != null && cVar.f12534i != null) {
                    cVar.b(false).setTintMode(cVar.f12534i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i4) {
        super.setTextAlignment(i4);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z8) {
        this.f9991g.f12541r = z8;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f10000r);
    }
}
