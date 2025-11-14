package com.google.android.material.slider;

import F3.f;
import G5.a;
import G5.h;
import I5.e;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.util.Iterator;
import s3.AbstractC1492c;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public class Slider extends e {
    public Slider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (obtainStyledAttributes.hasValue(0)) {
            setValue(obtainStyledAttributes.getFloat(0, 0.0f));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.f2132W;
    }

    public int getFocusedThumbIndex() {
        return this.f2133a0;
    }

    public int getHaloRadius() {
        return this.f2120J;
    }

    public ColorStateList getHaloTintList() {
        return this.j0;
    }

    public int getLabelBehavior() {
        return this.f2115E;
    }

    public float getStepSize() {
        return this.f2134b0;
    }

    public float getThumbElevation() {
        return this.f2162r0.f1769d.f1762m;
    }

    public int getThumbHeight() {
        return this.f2119I;
    }

    @Override // I5.e
    public int getThumbRadius() {
        return this.f2118H / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f2162r0.f1769d.f1755d;
    }

    public float getThumbStrokeWidth() {
        return this.f2162r0.f1769d.j;
    }

    public ColorStateList getThumbTintList() {
        return this.f2162r0.f1769d.f1754c;
    }

    public int getThumbTrackGapSize() {
        return this.K;
    }

    public int getThumbWidth() {
        return this.f2118H;
    }

    public int getTickActiveRadius() {
        return this.f2139e0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f2148k0;
    }

    public int getTickInactiveRadius() {
        return this.f2141f0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f2150l0;
    }

    public ColorStateList getTickTintList() {
        if (this.f2150l0.equals(this.f2148k0)) {
            return this.f2148k0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f2152m0;
    }

    public int getTrackHeight() {
        return this.f2116F;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f2154n0;
    }

    public int getTrackInsideCornerSize() {
        return this.f2124O;
    }

    public int getTrackSidePadding() {
        return this.f2117G;
    }

    public int getTrackStopIndicatorSize() {
        return this.f2123N;
    }

    public ColorStateList getTrackTintList() {
        if (this.f2154n0.equals(this.f2152m0)) {
            return this.f2152m0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f2143g0;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public float getValueFrom() {
        return this.f2129T;
    }

    public float getValueTo() {
        return this.f2130U;
    }

    public void setCustomThumbDrawable(int i4) {
        setCustomThumbDrawable(getResources().getDrawable(i4));
    }

    @Override // I5.e, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z8) {
        super.setEnabled(z8);
    }

    public void setFocusedThumbIndex(int i4) {
        if (i4 >= 0 && i4 < this.f2131V.size()) {
            this.f2133a0 = i4;
            this.k.w(i4);
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("index out of range");
    }

    @Override // I5.e
    public void setHaloRadius(int i4) {
        if (i4 == this.f2120J) {
            return;
        }
        this.f2120J = i4;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.f2120J);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i4) {
        setHaloRadius(getResources().getDimensionPixelSize(i4));
    }

    @Override // I5.e
    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.j0)) {
            return;
        }
        this.j0 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int h8 = h(colorStateList);
        Paint paint = this.f2142g;
        paint.setColor(h8);
        paint.setAlpha(63);
        invalidate();
    }

    @Override // I5.e
    public void setLabelBehavior(int i4) {
        if (this.f2115E != i4) {
            this.f2115E = i4;
            requestLayout();
        }
    }

    public void setStepSize(float f8) {
        if (f8 >= 0.0f) {
            if (this.f2134b0 != f8) {
                this.f2134b0 = f8;
                this.f2147i0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f8 + ") must be 0, or a factor of the valueFrom(" + this.f2129T + ")-valueTo(" + this.f2130U + ") range");
    }

    @Override // I5.e
    public void setThumbElevation(float f8) {
        this.f2162r0.l(f8);
    }

    public void setThumbElevationResource(int i4) {
        setThumbElevation(getResources().getDimension(i4));
    }

    @Override // I5.e
    public void setThumbHeight(int i4) {
        if (i4 == this.f2119I) {
            return;
        }
        this.f2119I = i4;
        this.f2162r0.setBounds(0, 0, this.f2118H, i4);
        Drawable drawable = this.f2164s0;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.f2166t0.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        y();
    }

    public void setThumbHeightResource(int i4) {
        setThumbHeight(getResources().getDimensionPixelSize(i4));
    }

    public void setThumbRadius(int i4) {
        int i8 = i4 * 2;
        setThumbWidth(i8);
        setThumbHeight(i8);
    }

    public void setThumbRadiusResource(int i4) {
        setThumbRadius(getResources().getDimensionPixelSize(i4));
    }

    @Override // I5.e
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f2162r0.q(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i4) {
        if (i4 != 0) {
            setThumbStrokeColor(AbstractC1492c.o(getContext(), i4));
        }
    }

    @Override // I5.e
    public void setThumbStrokeWidth(float f8) {
        h hVar = this.f2162r0;
        hVar.f1769d.j = f8;
        hVar.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i4) {
        if (i4 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i4));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        h hVar = this.f2162r0;
        if (colorStateList.equals(hVar.f1769d.f1754c)) {
            return;
        }
        hVar.m(colorStateList);
        invalidate();
    }

    @Override // I5.e
    public void setThumbTrackGapSize(int i4) {
        if (this.K == i4) {
            return;
        }
        this.K = i4;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, G5.l] */
    @Override // I5.e
    public void setThumbWidth(int i4) {
        if (i4 == this.f2118H) {
            return;
        }
        this.f2118H = i4;
        G5.e eVar = new G5.e(0);
        G5.e eVar2 = new G5.e(0);
        G5.e eVar3 = new G5.e(0);
        G5.e eVar4 = new G5.e(0);
        float f8 = this.f2118H / 2.0f;
        AbstractC1492c r8 = AbstractC1638C.r(0);
        f.b(r8);
        f.b(r8);
        f.b(r8);
        f.b(r8);
        a aVar = new a(f8);
        a aVar2 = new a(f8);
        a aVar3 = new a(f8);
        a aVar4 = new a(f8);
        ?? obj = new Object();
        obj.f1794a = r8;
        obj.f1795b = r8;
        obj.f1796c = r8;
        obj.f1797d = r8;
        obj.f1798e = aVar;
        obj.f1799f = aVar2;
        obj.f1800g = aVar3;
        obj.f1801h = aVar4;
        obj.f1802i = eVar;
        obj.j = eVar2;
        obj.k = eVar3;
        obj.f1803l = eVar4;
        h hVar = this.f2162r0;
        hVar.setShapeAppearanceModel(obj);
        hVar.setBounds(0, 0, this.f2118H, this.f2119I);
        Drawable drawable = this.f2164s0;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.f2166t0.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        y();
    }

    public void setThumbWidthResource(int i4) {
        setThumbWidth(getResources().getDimensionPixelSize(i4));
    }

    @Override // I5.e
    public void setTickActiveRadius(int i4) {
        if (this.f2139e0 != i4) {
            this.f2139e0 = i4;
            this.f2146i.setStrokeWidth(i4 * 2);
            y();
        }
    }

    @Override // I5.e
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f2148k0)) {
            return;
        }
        this.f2148k0 = colorStateList;
        this.f2146i.setColor(h(colorStateList));
        invalidate();
    }

    @Override // I5.e
    public void setTickInactiveRadius(int i4) {
        if (this.f2141f0 != i4) {
            this.f2141f0 = i4;
            this.f2144h.setStrokeWidth(i4 * 2);
            y();
        }
    }

    @Override // I5.e
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f2150l0)) {
            return;
        }
        this.f2150l0 = colorStateList;
        this.f2144h.setColor(h(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z8) {
        if (this.f2137d0 != z8) {
            this.f2137d0 = z8;
            postInvalidate();
        }
    }

    @Override // I5.e
    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f2152m0)) {
            return;
        }
        this.f2152m0 = colorStateList;
        this.f2138e.setColor(h(colorStateList));
        this.j.setColor(h(this.f2152m0));
        invalidate();
    }

    @Override // I5.e
    public void setTrackHeight(int i4) {
        if (this.f2116F != i4) {
            this.f2116F = i4;
            this.f2136d.setStrokeWidth(i4);
            this.f2138e.setStrokeWidth(this.f2116F);
            y();
        }
    }

    @Override // I5.e
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f2154n0)) {
            return;
        }
        this.f2154n0 = colorStateList;
        this.f2136d.setColor(h(colorStateList));
        invalidate();
    }

    @Override // I5.e
    public void setTrackInsideCornerSize(int i4) {
        if (this.f2124O == i4) {
            return;
        }
        this.f2124O = i4;
        invalidate();
    }

    @Override // I5.e
    public void setTrackStopIndicatorSize(int i4) {
        if (this.f2123N == i4) {
            return;
        }
        this.f2123N = i4;
        this.j.setStrokeWidth(i4);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f8) {
        setValues(Float.valueOf(f8));
    }

    public void setValueFrom(float f8) {
        this.f2129T = f8;
        this.f2147i0 = true;
        postInvalidate();
    }

    public void setValueTo(float f8) {
        this.f2130U = f8;
        this.f2147i0 = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        a(newDrawable);
        this.f2164s0 = newDrawable;
        this.f2166t0.clear();
        postInvalidate();
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(I5.f fVar) {
    }
}
