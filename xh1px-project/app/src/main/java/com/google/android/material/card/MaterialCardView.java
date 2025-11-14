package com.google.android.material.card;

import F3.f;
import G5.h;
import G5.l;
import G5.w;
import M5.a;
import a.AbstractC0405a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import e5.AbstractC0645a;
import h4.AbstractC0832f;
import h4.g;
import n5.InterfaceC1161a;
import n5.c;
import s3.AbstractC1492c;
import u6.AbstractC1638C;
import x5.p;

/* loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, w {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f10012o = {R.attr.state_checkable};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f10013p = {R.attr.state_checked};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f10014q = {com.buzbuz.smartautoclicker.R.attr.state_dragged};
    public final c k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f10015l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10016m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10017n;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.buzbuz.smartautoclicker.R.attr.materialCardViewStyle, com.buzbuz.smartautoclicker.R.style.Widget_MaterialComponents_CardView), attributeSet, com.buzbuz.smartautoclicker.R.attr.materialCardViewStyle);
        this.f10016m = false;
        this.f10017n = false;
        this.f10015l = true;
        TypedArray h8 = p.h(getContext(), attributeSet, AbstractC0645a.f10654y, com.buzbuz.smartautoclicker.R.attr.materialCardViewStyle, com.buzbuz.smartautoclicker.R.style.Widget_MaterialComponents_CardView, new int[0]);
        c cVar = new c(this, attributeSet);
        this.k = cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        h hVar = cVar.f12999c;
        hVar.m(cardBackgroundColor);
        cVar.f12998b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.l();
        MaterialCardView materialCardView = cVar.f12997a;
        ColorStateList C8 = AbstractC0405a.C(materialCardView.getContext(), h8, 11);
        cVar.f13008n = C8;
        if (C8 == null) {
            cVar.f13008n = ColorStateList.valueOf(-1);
        }
        cVar.f13004h = h8.getDimensionPixelSize(12, 0);
        boolean z8 = h8.getBoolean(0, false);
        cVar.f13013s = z8;
        materialCardView.setLongClickable(z8);
        cVar.f13006l = AbstractC0405a.C(materialCardView.getContext(), h8, 6);
        cVar.g(AbstractC0405a.F(materialCardView.getContext(), h8, 2));
        cVar.f13002f = h8.getDimensionPixelSize(5, 0);
        cVar.f13001e = h8.getDimensionPixelSize(4, 0);
        cVar.f13003g = h8.getInteger(3, 8388661);
        ColorStateList C9 = AbstractC0405a.C(materialCardView.getContext(), h8, 7);
        cVar.k = C9;
        if (C9 == null) {
            cVar.k = ColorStateList.valueOf(AbstractC0832f.o(materialCardView, com.buzbuz.smartautoclicker.R.attr.colorControlHighlight));
        }
        ColorStateList C10 = AbstractC0405a.C(materialCardView.getContext(), h8, 1);
        C10 = C10 == null ? ColorStateList.valueOf(0) : C10;
        h hVar2 = cVar.f13000d;
        hVar2.m(C10);
        int[] iArr = E5.a.f1245a;
        RippleDrawable rippleDrawable = cVar.f13009o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cVar.k);
        }
        hVar.l(materialCardView.getCardElevation());
        float f8 = cVar.f13004h;
        ColorStateList colorStateList = cVar.f13008n;
        hVar2.f1769d.j = f8;
        hVar2.invalidateSelf();
        hVar2.q(colorStateList);
        materialCardView.setBackgroundInternal(cVar.d(hVar));
        Drawable c6 = cVar.j() ? cVar.c() : hVar2;
        cVar.f13005i = c6;
        materialCardView.setForeground(cVar.d(c6));
        h8.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.k.f12999c.getBounds());
        return rectF;
    }

    public final void b() {
        c cVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT > 26 && (rippleDrawable = (cVar = this.k).f13009o) != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i4 = bounds.bottom;
            cVar.f13009o.setBounds(bounds.left, bounds.top, bounds.right, i4 - 1);
            cVar.f13009o.setBounds(bounds.left, bounds.top, bounds.right, i4);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.k.f12999c.f1769d.f1754c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.k.f13000d.f1769d.f1754c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.k.j;
    }

    public int getCheckedIconGravity() {
        return this.k.f13003g;
    }

    public int getCheckedIconMargin() {
        return this.k.f13001e;
    }

    public int getCheckedIconSize() {
        return this.k.f13002f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.k.f13006l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.k.f12998b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.k.f12998b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.k.f12998b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.k.f12998b.top;
    }

    public float getProgress() {
        return this.k.f12999c.f1769d.f1760i;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.k.f12999c.i();
    }

    public ColorStateList getRippleColor() {
        return this.k.k;
    }

    public l getShapeAppearanceModel() {
        return this.k.f13007m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.k.f13008n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.k.f13008n;
    }

    public int getStrokeWidth() {
        return this.k.f13004h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f10016m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.k;
        cVar.k();
        AbstractC1638C.L(this, cVar.f12999c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 3);
        c cVar = this.k;
        if (cVar != null && cVar.f13013s) {
            View.mergeDrawableStates(onCreateDrawableState, f10012o);
        }
        if (this.f10016m) {
            View.mergeDrawableStates(onCreateDrawableState, f10013p);
        }
        if (this.f10017n) {
            View.mergeDrawableStates(onCreateDrawableState, f10014q);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f10016m);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z8;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        c cVar = this.k;
        if (cVar != null && cVar.f13013s) {
            z8 = true;
        } else {
            z8 = false;
        }
        accessibilityNodeInfo.setCheckable(z8);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f10016m);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i8) {
        super.onMeasure(i4, i8);
        this.k.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f10015l) {
            c cVar = this.k;
            if (!cVar.f13012r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                cVar.f13012r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i4) {
        this.k.f12999c.m(ColorStateList.valueOf(i4));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f8) {
        super.setCardElevation(f8);
        c cVar = this.k;
        cVar.f12999c.l(cVar.f12997a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        h hVar = this.k.f13000d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        hVar.m(colorStateList);
    }

    public void setCheckable(boolean z8) {
        this.k.f13013s = z8;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        if (this.f10016m != z8) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.k.g(drawable);
    }

    public void setCheckedIconGravity(int i4) {
        c cVar = this.k;
        if (cVar.f13003g != i4) {
            cVar.f13003g = i4;
            MaterialCardView materialCardView = cVar.f12997a;
            cVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i4) {
        this.k.f13001e = i4;
    }

    public void setCheckedIconMarginResource(int i4) {
        if (i4 != -1) {
            this.k.f13001e = getResources().getDimensionPixelSize(i4);
        }
    }

    public void setCheckedIconResource(int i4) {
        this.k.g(g.k(getContext(), i4));
    }

    public void setCheckedIconSize(int i4) {
        this.k.f13002f = i4;
    }

    public void setCheckedIconSizeResource(int i4) {
        if (i4 != 0) {
            this.k.f13002f = getResources().getDimensionPixelSize(i4);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.k;
        cVar.f13006l = colorStateList;
        Drawable drawable = cVar.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z8) {
        super.setClickable(z8);
        c cVar = this.k;
        if (cVar != null) {
            cVar.k();
        }
    }

    public void setDragged(boolean z8) {
        if (this.f10017n != z8) {
            this.f10017n = z8;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f8) {
        super.setMaxCardElevation(f8);
        this.k.m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z8) {
        super.setPreventCornerOverlap(z8);
        c cVar = this.k;
        cVar.m();
        cVar.l();
    }

    public void setProgress(float f8) {
        c cVar = this.k;
        cVar.f12999c.n(f8);
        h hVar = cVar.f13000d;
        if (hVar != null) {
            hVar.n(f8);
        }
        h hVar2 = cVar.f13011q;
        if (hVar2 != null) {
            hVar2.n(f8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (r3.f1769d.f1752a.d(r3.h()) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    @Override // androidx.cardview.widget.CardView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setRadius(float f8) {
        super.setRadius(f8);
        c cVar = this.k;
        f e9 = cVar.f13007m.e();
        e9.c(f8);
        cVar.h(e9.a());
        cVar.f13005i.invalidateSelf();
        if (!cVar.i()) {
            if (cVar.f12997a.getPreventCornerOverlap()) {
                h hVar = cVar.f12999c;
            }
            if (!cVar.i()) {
                cVar.m();
                return;
            }
            return;
        }
        cVar.l();
        if (!cVar.i()) {
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.k;
        cVar.k = colorStateList;
        int[] iArr = E5.a.f1245a;
        RippleDrawable rippleDrawable = cVar.f13009o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i4) {
        ColorStateList o7 = AbstractC1492c.o(getContext(), i4);
        c cVar = this.k;
        cVar.k = o7;
        int[] iArr = E5.a.f1245a;
        RippleDrawable rippleDrawable = cVar.f13009o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(o7);
        }
    }

    @Override // G5.w
    public void setShapeAppearanceModel(l lVar) {
        setClipToOutline(lVar.d(getBoundsAsRectF()));
        this.k.h(lVar);
    }

    public void setStrokeColor(int i4) {
        setStrokeColor(ColorStateList.valueOf(i4));
    }

    public void setStrokeWidth(int i4) {
        c cVar = this.k;
        if (i4 != cVar.f13004h) {
            cVar.f13004h = i4;
            h hVar = cVar.f13000d;
            ColorStateList colorStateList = cVar.f13008n;
            hVar.f1769d.j = i4;
            hVar.invalidateSelf();
            hVar.q(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z8) {
        super.setUseCompatPadding(z8);
        c cVar = this.k;
        cVar.m();
        cVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        c cVar = this.k;
        if (cVar != null && cVar.f13013s && isEnabled()) {
            this.f10016m = !this.f10016m;
            refreshDrawableState();
            b();
            cVar.f(this.f10016m, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.k;
        if (cVar.f13008n != colorStateList) {
            cVar.f13008n = colorStateList;
            h hVar = cVar.f13000d;
            hVar.f1769d.j = cVar.f13004h;
            hVar.invalidateSelf();
            hVar.q(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.k.f12999c.m(colorStateList);
    }

    public void setOnCheckedChangeListener(InterfaceC1161a interfaceC1161a) {
    }
}
