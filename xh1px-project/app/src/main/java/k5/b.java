package k5;

import A5.f;
import A5.i;
import P.O;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.buzbuz.smartautoclicker.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.m;

/* loaded from: classes.dex */
public final class b extends i {
    public final int K;

    /* renamed from: L, reason: collision with root package name */
    public final int f12135L;

    /* renamed from: M, reason: collision with root package name */
    public final int f12136M;

    /* renamed from: N, reason: collision with root package name */
    public final int f12137N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f12138O;

    /* renamed from: P, reason: collision with root package name */
    public final ArrayList f12139P;

    public b(Context context) {
        super(context);
        this.f12139P = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.K = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f12135L = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f12136M = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f12137N = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // A5.i
    public final f e(Context context) {
        return new f(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int i11 = i9 - i4;
        int i12 = i10 - i8;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                WeakHashMap weakHashMap = O.f4214a;
                if (getLayoutDirection() == 1) {
                    int i15 = i11 - i13;
                    childAt.layout(i15 - childAt.getMeasuredWidth(), 0, i15, i12);
                } else {
                    childAt.layout(i13, 0, childAt.getMeasuredWidth() + i13, i12);
                }
                i13 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i8) {
        int i9;
        int i10;
        int i11;
        m menu = getMenu();
        int size = View.MeasureSpec.getSize(i4);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.f12139P;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i8);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        boolean f8 = i.f(getLabelVisibilityMode(), size2);
        int i12 = this.f12136M;
        int i13 = 1;
        if (f8 && this.f12138O) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int i14 = this.f12137N;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), makeMeasureSpec);
                i14 = Math.max(i14, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            int i15 = size2 - i10;
            int min = Math.min(size - (this.f12135L * i15), Math.min(i14, i12));
            int i16 = size - min;
            if (i15 != 0) {
                i13 = i15;
            }
            int min2 = Math.min(i16 / i13, this.K);
            int i17 = i16 - (i15 * min2);
            for (int i18 = 0; i18 < childCount; i18++) {
                if (getChildAt(i18).getVisibility() != 8) {
                    if (i18 == getSelectedItemPosition()) {
                        i11 = min;
                    } else {
                        i11 = min2;
                    }
                    if (i17 > 0) {
                        i11++;
                        i17--;
                    }
                } else {
                    i11 = 0;
                }
                arrayList.add(Integer.valueOf(i11));
            }
        } else {
            if (size2 != 0) {
                i13 = size2;
            }
            int min3 = Math.min(size / i13, i12);
            int i19 = size - (size2 * min3);
            for (int i20 = 0; i20 < childCount; i20++) {
                if (getChildAt(i20).getVisibility() != 8) {
                    if (i19 > 0) {
                        i9 = min3 + 1;
                        i19--;
                    } else {
                        i9 = min3;
                    }
                } else {
                    i9 = 0;
                }
                arrayList.add(Integer.valueOf(i9));
            }
        }
        int i21 = 0;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i22)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i21 = childAt2.getMeasuredWidth() + i21;
            }
        }
        setMeasuredDimension(i21, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z8) {
        this.f12138O = z8;
    }
}
