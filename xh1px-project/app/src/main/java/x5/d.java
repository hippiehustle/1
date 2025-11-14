package x5;

import P.O;
import android.view.View;
import android.view.ViewGroup;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.chip.ChipGroup;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class d extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f16190d;

    /* renamed from: e, reason: collision with root package name */
    public int f16191e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16192f;

    /* renamed from: g, reason: collision with root package name */
    public int f16193g;

    public int getItemSpacing() {
        return this.f16191e;
    }

    public int getLineSpacing() {
        return this.f16190d;
    }

    public int getRowCount() {
        return this.f16193g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        boolean z9;
        int paddingLeft;
        int paddingRight;
        int i11;
        int i12;
        if (getChildCount() == 0) {
            this.f16193g = 0;
            return;
        }
        this.f16193g = 1;
        WeakHashMap weakHashMap = O.f4214a;
        if (getLayoutDirection() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z9) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i13 = (i9 - i4) - paddingRight;
        int i14 = paddingLeft;
        int i15 = paddingTop;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.getMarginStart();
                    i11 = marginLayoutParams.getMarginEnd();
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i14 + i12;
                if (!this.f16192f && measuredWidth > i13) {
                    i15 = this.f16190d + paddingTop;
                    this.f16193g++;
                    i14 = paddingLeft;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f16193g - 1));
                int i17 = i14 + i12;
                int measuredWidth2 = childAt.getMeasuredWidth() + i17;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (z9) {
                    childAt.layout(i13 - measuredWidth2, i15, (i13 - i14) - i12, measuredHeight);
                } else {
                    childAt.layout(i17, i15, measuredWidth2, measuredHeight);
                }
                i14 += childAt.getMeasuredWidth() + i12 + i11 + this.f16191e;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i8);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i9 = Integer.MAX_VALUE;
        } else {
            i9 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i9 - getPaddingRight();
        int i13 = paddingTop;
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i4, i8);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.leftMargin;
                    i11 = marginLayoutParams.rightMargin;
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                int i16 = i11;
                if (childAt.getMeasuredWidth() + paddingLeft + i12 > paddingRight && !((ChipGroup) this).f16192f) {
                    paddingLeft = getPaddingLeft();
                    i13 = paddingTop + this.f16190d;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i12;
                int measuredHeight = childAt.getMeasuredHeight() + i13;
                if (measuredWidth > i14) {
                    i14 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i12 + i16 + this.f16191e + paddingLeft;
                if (i15 == getChildCount() - 1) {
                    i14 += i16;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i14;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i10 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i10 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != i10) {
                size2 = paddingBottom;
            }
        } else {
            size2 = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i4) {
        this.f16191e = i4;
    }

    public void setLineSpacing(int i4) {
        this.f16190d = i4;
    }

    public void setSingleLine(boolean z8) {
        this.f16192f = z8;
    }
}
