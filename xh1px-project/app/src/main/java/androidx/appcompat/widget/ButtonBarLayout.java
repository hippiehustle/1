package androidx.appcompat.widget;

import P.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.buzbuz.smartautoclicker.R;
import h.AbstractC0805a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f8406d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8407e;

    /* renamed from: f, reason: collision with root package name */
    public int f8408f;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8408f = -1;
        int[] iArr = AbstractC0805a.k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        O.l(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f8406d = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f8406d);
        }
    }

    private void setStacked(boolean z8) {
        int i4;
        int i8;
        if (this.f8407e != z8) {
            if (!z8 || this.f8406d) {
                this.f8407e = z8;
                setOrientation(z8 ? 1 : 0);
                if (z8) {
                    i4 = 8388613;
                } else {
                    i4 = 80;
                }
                setGravity(i4);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    if (z8) {
                        i8 = 8;
                    } else {
                        i8 = 4;
                    }
                    findViewById.setVisibility(i8);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i8) {
        int i9;
        boolean z8;
        int i10;
        int size = View.MeasureSpec.getSize(i4);
        int i11 = 0;
        if (this.f8406d) {
            if (size > this.f8408f && this.f8407e) {
                setStacked(false);
            }
            this.f8408f = size;
        }
        if (!this.f8407e && View.MeasureSpec.getMode(i4) == 1073741824) {
            i9 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z8 = true;
        } else {
            i9 = i4;
            z8 = false;
        }
        super.onMeasure(i9, i8);
        if (this.f8406d && !this.f8407e && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z8 = true;
        }
        if (z8) {
            super.onMeasure(i4, i8);
        }
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 < childCount) {
                if (getChildAt(i12).getVisibility() == 0) {
                    break;
                } else {
                    i12++;
                }
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 >= 0) {
            View childAt = getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f8407e) {
                int i13 = i12 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i13 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i13).getVisibility() == 0) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
                if (i10 >= 0) {
                    i11 = getChildAt(i10).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    i11 = measuredHeight;
                }
            } else {
                i11 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = O.f4214a;
        if (getMinimumHeight() != i11) {
            setMinimumHeight(i11);
            if (i8 == 0) {
                super.onMeasure(i4, i8);
            }
        }
    }

    public void setAllowStacking(boolean z8) {
        if (this.f8406d != z8) {
            this.f8406d = z8;
            if (!z8 && this.f8407e) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
