package com.google.android.material.materialswitch;

import H.b;
import M5.a;
import R.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import o.Z0;
import x5.p;

/* loaded from: classes.dex */
public class MaterialSwitch extends Z0 {

    /* renamed from: m0, reason: collision with root package name */
    public static final int[] f10189m0 = {R.attr.state_with_icon};

    /* renamed from: W, reason: collision with root package name */
    public Drawable f10190W;

    /* renamed from: a0, reason: collision with root package name */
    public Drawable f10191a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f10192b0;

    /* renamed from: c0, reason: collision with root package name */
    public Drawable f10193c0;

    /* renamed from: d0, reason: collision with root package name */
    public Drawable f10194d0;

    /* renamed from: e0, reason: collision with root package name */
    public ColorStateList f10195e0;

    /* renamed from: f0, reason: collision with root package name */
    public ColorStateList f10196f0;

    /* renamed from: g0, reason: collision with root package name */
    public PorterDuff.Mode f10197g0;

    /* renamed from: h0, reason: collision with root package name */
    public ColorStateList f10198h0;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f10199i0;
    public PorterDuff.Mode j0;

    /* renamed from: k0, reason: collision with root package name */
    public int[] f10200k0;

    /* renamed from: l0, reason: collision with root package name */
    public int[] f10201l0;

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialSwitchStyle, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet);
        this.f10192b0 = -1;
        Context context2 = getContext();
        this.f10190W = super.getThumbDrawable();
        this.f10195e0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f10193c0 = super.getTrackDrawable();
        this.f10198h0 = super.getTrackTintList();
        super.setTrackTintList(null);
        g i4 = p.i(context2, attributeSet, AbstractC0645a.f10615D, R.attr.materialSwitchStyle, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        this.f10191a0 = i4.A(0);
        TypedArray typedArray = (TypedArray) i4.f4988f;
        this.f10192b0 = typedArray.getDimensionPixelSize(1, -1);
        this.f10196f0 = i4.z(2);
        int i8 = typedArray.getInt(3, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f10197g0 = p.j(i8, mode);
        this.f10194d0 = i4.A(4);
        this.f10199i0 = i4.z(5);
        this.j0 = p.j(typedArray.getInt(6, -1), mode);
        i4.L();
        setEnforceSwitchWidth(false);
        e();
        f();
    }

    public static void g(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f8) {
        if (drawable != null && colorStateList != null) {
            drawable.setTint(b.b(f8, colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0)));
        }
    }

    public final void e() {
        this.f10190W = h2.a.e(this.f10190W, this.f10195e0, getThumbTintMode());
        this.f10191a0 = h2.a.e(this.f10191a0, this.f10196f0, this.f10197g0);
        h();
        Drawable drawable = this.f10190W;
        Drawable drawable2 = this.f10191a0;
        int i4 = this.f10192b0;
        super.setThumbDrawable(h2.a.c(drawable, drawable2, i4, i4));
        refreshDrawableState();
    }

    public final void f() {
        this.f10193c0 = h2.a.e(this.f10193c0, this.f10198h0, getTrackTintMode());
        this.f10194d0 = h2.a.e(this.f10194d0, this.f10199i0, this.j0);
        h();
        Drawable drawable = this.f10193c0;
        if (drawable != null && this.f10194d0 != null) {
            drawable = new LayerDrawable(new Drawable[]{this.f10193c0, this.f10194d0});
        } else if (drawable == null) {
            drawable = this.f10194d0;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    @Override // o.Z0
    public Drawable getThumbDrawable() {
        return this.f10190W;
    }

    public Drawable getThumbIconDrawable() {
        return this.f10191a0;
    }

    public int getThumbIconSize() {
        return this.f10192b0;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f10196f0;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f10197g0;
    }

    @Override // o.Z0
    public ColorStateList getThumbTintList() {
        return this.f10195e0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f10194d0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f10199i0;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.j0;
    }

    @Override // o.Z0
    public Drawable getTrackDrawable() {
        return this.f10193c0;
    }

    @Override // o.Z0
    public ColorStateList getTrackTintList() {
        return this.f10198h0;
    }

    public final void h() {
        if (this.f10195e0 != null || this.f10196f0 != null || this.f10198h0 != null || this.f10199i0 != null) {
            float thumbPosition = getThumbPosition();
            ColorStateList colorStateList = this.f10195e0;
            if (colorStateList != null) {
                g(this.f10190W, colorStateList, this.f10200k0, this.f10201l0, thumbPosition);
            }
            ColorStateList colorStateList2 = this.f10196f0;
            if (colorStateList2 != null) {
                g(this.f10191a0, colorStateList2, this.f10200k0, this.f10201l0, thumbPosition);
            }
            ColorStateList colorStateList3 = this.f10198h0;
            if (colorStateList3 != null) {
                g(this.f10193c0, colorStateList3, this.f10200k0, this.f10201l0, thumbPosition);
            }
            ColorStateList colorStateList4 = this.f10199i0;
            if (colorStateList4 != null) {
                g(this.f10194d0, colorStateList4, this.f10200k0, this.f10201l0, thumbPosition);
            }
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        h();
        super.invalidate();
    }

    @Override // o.Z0, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        if (this.f10191a0 != null) {
            View.mergeDrawableStates(onCreateDrawableState, f10189m0);
        }
        int[] iArr = new int[onCreateDrawableState.length];
        int i8 = 0;
        for (int i9 : onCreateDrawableState) {
            if (i9 != 16842912) {
                iArr[i8] = i9;
                i8++;
            }
        }
        this.f10200k0 = iArr;
        this.f10201l0 = h2.a.h(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // o.Z0
    public void setThumbDrawable(Drawable drawable) {
        this.f10190W = drawable;
        e();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.f10191a0 = drawable;
        e();
    }

    public void setThumbIconResource(int i4) {
        setThumbIconDrawable(h4.g.k(getContext(), i4));
    }

    public void setThumbIconSize(int i4) {
        if (this.f10192b0 != i4) {
            this.f10192b0 = i4;
            e();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f10196f0 = colorStateList;
        e();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.f10197g0 = mode;
        e();
    }

    @Override // o.Z0
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f10195e0 = colorStateList;
        e();
    }

    @Override // o.Z0
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        e();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f10194d0 = drawable;
        f();
    }

    public void setTrackDecorationResource(int i4) {
        setTrackDecorationDrawable(h4.g.k(getContext(), i4));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f10199i0 = colorStateList;
        f();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.j0 = mode;
        f();
    }

    @Override // o.Z0
    public void setTrackDrawable(Drawable drawable) {
        this.f10193c0 = drawable;
        f();
    }

    @Override // o.Z0
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f10198h0 = colorStateList;
        f();
    }

    @Override // o.Z0
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        f();
    }
}
