package B5;

import A5.f;
import android.view.View;
import com.buzbuz.smartautoclicker.R;

/* loaded from: classes.dex */
public final class a extends f {
    @Override // A5.f
    public final int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_rail_icon_margin;
    }

    @Override // A5.f
    public final int getItemLayoutResId() {
        return R.layout.mtrl_navigation_rail_item;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i8) {
        super.onMeasure(i4, i8);
        if (View.MeasureSpec.getMode(i8) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i8)));
        }
    }
}
