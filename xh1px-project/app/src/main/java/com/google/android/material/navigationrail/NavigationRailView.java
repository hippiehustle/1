package com.google.android.material.navigationrail;

import A5.i;
import A5.q;
import B5.b;
import R.g;
import W0.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import f5.AbstractC0710a;
import x5.p;

/* loaded from: classes.dex */
public class NavigationRailView extends q {

    /* renamed from: i, reason: collision with root package name */
    public final int f10202i;
    public final View j;
    public final Boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f10203l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f10204m;

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.navigationRailStyle, R.style.Widget_MaterialComponents_NavigationRailView);
        this.k = null;
        this.f10203l = null;
        this.f10204m = null;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        this.f10202i = dimensionPixelSize;
        Context context2 = getContext();
        g i4 = p.i(context2, attributeSet, AbstractC0645a.f10621J, R.attr.navigationRailStyle, R.style.Widget_MaterialComponents_NavigationRailView, new int[0]);
        TypedArray typedArray = (TypedArray) i4.f4988f;
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
            View view = this.j;
            if (view != null) {
                removeView(view);
                this.j = null;
            }
            this.j = inflate;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = dimensionPixelSize;
            addView(inflate, 0, layoutParams);
        }
        setMenuGravity(typedArray.getInt(2, 49));
        if (typedArray.hasValue(1)) {
            setItemMinimumHeight(typedArray.getDimensionPixelSize(1, -1));
        }
        if (typedArray.hasValue(5)) {
            this.k = Boolean.valueOf(typedArray.getBoolean(5, false));
        }
        if (typedArray.hasValue(3)) {
            this.f10203l = Boolean.valueOf(typedArray.getBoolean(3, false));
        }
        if (typedArray.hasValue(4)) {
            this.f10204m = Boolean.valueOf(typedArray.getBoolean(4, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float b4 = AbstractC0710a.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f);
        float c6 = AbstractC0710a.c(b4, getItemPaddingTop(), dimensionPixelOffset);
        float c9 = AbstractC0710a.c(b4, getItemPaddingBottom(), dimensionPixelOffset2);
        setItemPaddingTop(Math.round(c6));
        setItemPaddingBottom(Math.round(c9));
        i4.L();
        p.d(this, new c(2, this));
    }

    private b getNavigationRailMenuView() {
        return (b) getMenuView();
    }

    @Override // A5.q
    public final i a(Context context) {
        return new b(context);
    }

    public View getHeaderView() {
        return this.j;
    }

    public int getItemMinimumHeight() {
        return ((b) getMenuView()).getItemMinimumHeight();
    }

    @Override // A5.q
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if ((r4.f451L.gravity & 112) == 48) goto L13;
     */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        super.onLayout(z8, i4, i8, i9, i10);
        b navigationRailMenuView = getNavigationRailMenuView();
        int i11 = this.f10202i;
        View view = this.j;
        if (view != null && view.getVisibility() != 8) {
            int bottom = this.j.getBottom() + i11;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i11 = bottom - top;
            }
            i11 = 0;
        }
        if (i11 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i11, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i11);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i8) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i4) != 1073741824 && suggestedMinimumWidth > 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i4), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
        }
        super.onMeasure(i4, i8);
        View view = this.j;
        if (view != null && view.getVisibility() != 8) {
            measureChild(getNavigationRailMenuView(), i4, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.j.getMeasuredHeight()) - this.f10202i, Integer.MIN_VALUE));
        }
    }

    public void setItemMinimumHeight(int i4) {
        ((b) getMenuView()).setItemMinimumHeight(i4);
    }

    public void setMenuGravity(int i4) {
        getNavigationRailMenuView().setMenuGravity(i4);
    }
}
