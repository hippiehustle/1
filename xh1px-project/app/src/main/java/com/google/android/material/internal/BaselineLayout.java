package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class BaselineLayout extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f10172d;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f10172d = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f10172d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        int i11;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i9 - i4) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                if (this.f10172d != -1 && childAt.getBaseline() != -1) {
                    i11 = (this.f10172d + paddingTop) - childAt.getBaseline();
                } else {
                    i11 = paddingTop;
                }
                childAt.layout(i13, i11, measuredWidth + i13, measuredHeight + i11);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i8) {
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i4, i8);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i12 = Math.max(i12, baseline);
                    i13 = Math.max(i13, childAt.getMeasuredHeight() - baseline);
                }
                i10 = Math.max(i10, childAt.getMeasuredWidth());
                i9 = Math.max(i9, childAt.getMeasuredHeight());
                i11 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
            }
        }
        if (i12 != -1) {
            i9 = Math.max(i9, Math.max(i13, getPaddingBottom()) + i12);
            this.f10172d = i12;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i10, getSuggestedMinimumWidth()), i4, i11), View.resolveSizeAndState(Math.max(i9, getSuggestedMinimumHeight()), i8, i11 << 16));
    }
}
