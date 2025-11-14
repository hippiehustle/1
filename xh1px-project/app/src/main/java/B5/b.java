package B5;

import A5.f;
import A5.i;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class b extends i {
    public int K;

    /* renamed from: L, reason: collision with root package name */
    public final FrameLayout.LayoutParams f451L;

    public b(Context context) {
        super(context);
        this.K = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f451L = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    @Override // A5.i
    public final f e(Context context) {
        return new f(context);
    }

    public final int g(int i4, int i8, int i9, View view) {
        int makeMeasureSpec;
        int i10;
        if (view == null) {
            int max = i8 / Math.max(1, i9);
            int i11 = this.K;
            if (i11 == -1) {
                i11 = View.MeasureSpec.getSize(i4);
            }
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i11, max), 0);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != view) {
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i4, makeMeasureSpec);
                    i10 = childAt.getMeasuredHeight();
                } else {
                    i10 = 0;
                }
                i12 += i10;
            }
        }
        return i12;
    }

    public int getItemMinimumHeight() {
        return this.K;
    }

    public int getMenuGravity() {
        return this.f451L.gravity;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int i11 = i9 - i4;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i12;
                childAt.layout(0, i12, i11, measuredHeight);
                i12 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i8) {
        int g8;
        int i9;
        int size = View.MeasureSpec.getSize(i8);
        int size2 = getMenu().l().size();
        if (size2 > 1 && i.f(getLabelVisibilityMode(), size2)) {
            View childAt = getChildAt(getSelectedItemPosition());
            if (childAt != null) {
                int max = size / Math.max(1, size2);
                int i10 = this.K;
                if (i10 == -1) {
                    i10 = View.MeasureSpec.getSize(i4);
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i10, max), 0);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i4, makeMeasureSpec);
                    i9 = childAt.getMeasuredHeight();
                } else {
                    i9 = 0;
                }
                size -= i9;
                size2--;
            } else {
                i9 = 0;
            }
            g8 = g(i4, size, size2, childAt) + i9;
        } else {
            g8 = g(i4, size, size2, null);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i4), View.resolveSizeAndState(g8, i8, 0));
    }

    public void setItemMinimumHeight(int i4) {
        if (this.K != i4) {
            this.K = i4;
            requestLayout();
        }
    }

    public void setMenuGravity(int i4) {
        FrameLayout.LayoutParams layoutParams = this.f451L;
        if (layoutParams.gravity != i4) {
            layoutParams.gravity = i4;
            setLayoutParams(layoutParams);
        }
    }
}
