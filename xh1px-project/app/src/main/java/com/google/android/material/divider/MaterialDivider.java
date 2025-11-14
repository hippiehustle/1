package com.google.android.material.divider;

import G5.h;
import M5.a;
import P.O;
import a.AbstractC0405a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import java.util.WeakHashMap;
import x5.p;

/* loaded from: classes.dex */
public class MaterialDivider extends View {

    /* renamed from: d, reason: collision with root package name */
    public final h f10152d;

    /* renamed from: e, reason: collision with root package name */
    public int f10153e;

    /* renamed from: f, reason: collision with root package name */
    public int f10154f;

    /* renamed from: g, reason: collision with root package name */
    public int f10155g;

    /* renamed from: h, reason: collision with root package name */
    public int f10156h;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f10152d = new h();
        TypedArray h8 = p.h(context2, attributeSet, AbstractC0645a.f10612A, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f10153e = h8.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f10155g = h8.getDimensionPixelOffset(2, 0);
        this.f10156h = h8.getDimensionPixelOffset(1, 0);
        setDividerColor(AbstractC0405a.C(context2, h8, 0).getDefaultColor());
        h8.recycle();
    }

    public int getDividerColor() {
        return this.f10154f;
    }

    public int getDividerInsetEnd() {
        return this.f10156h;
    }

    public int getDividerInsetStart() {
        return this.f10155g;
    }

    public int getDividerThickness() {
        return this.f10153e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i4;
        int width;
        int i8;
        super.onDraw(canvas);
        WeakHashMap weakHashMap = O.f4214a;
        boolean z8 = true;
        if (getLayoutDirection() != 1) {
            z8 = false;
        }
        if (z8) {
            i4 = this.f10156h;
        } else {
            i4 = this.f10155g;
        }
        if (z8) {
            width = getWidth();
            i8 = this.f10155g;
        } else {
            width = getWidth();
            i8 = this.f10156h;
        }
        int i9 = width - i8;
        int bottom = getBottom() - getTop();
        h hVar = this.f10152d;
        hVar.setBounds(i4, 0, i9, bottom);
        hVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i8) {
        super.onMeasure(i4, i8);
        int mode = View.MeasureSpec.getMode(i8);
        int measuredHeight = getMeasuredHeight();
        if (mode != Integer.MIN_VALUE && mode != 0) {
            return;
        }
        int i9 = this.f10153e;
        if (i9 > 0 && measuredHeight != i9) {
            measuredHeight = i9;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public void setDividerColor(int i4) {
        if (this.f10154f != i4) {
            this.f10154f = i4;
            this.f10152d.m(ColorStateList.valueOf(i4));
            invalidate();
        }
    }

    public void setDividerColorResource(int i4) {
        setDividerColor(getContext().getColor(i4));
    }

    public void setDividerInsetEnd(int i4) {
        this.f10156h = i4;
    }

    public void setDividerInsetEndResource(int i4) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i4));
    }

    public void setDividerInsetStart(int i4) {
        this.f10155g = i4;
    }

    public void setDividerInsetStartResource(int i4) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i4));
    }

    public void setDividerThickness(int i4) {
        if (this.f10153e != i4) {
            this.f10153e = i4;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i4) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i4));
    }
}
