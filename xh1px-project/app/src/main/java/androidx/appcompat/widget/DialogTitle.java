package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import h.AbstractC0805a;
import o.C1178a0;

/* loaded from: classes.dex */
public class DialogTitle extends C1178a0 {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // o.C1178a0, android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i8) {
        int lineCount;
        super.onMeasure(i4, i8);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0805a.f11296x, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            super.onMeasure(i4, i8);
        }
    }
}
