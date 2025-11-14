package com.google.android.material.snackbar;

import P.O;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.buzbuz.smartautoclicker.R;
import f5.AbstractC0710a;
import h4.AbstractC0832f;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public TextView f10230d;

    /* renamed from: e, reason: collision with root package name */
    public Button f10231e;

    /* renamed from: f, reason: collision with root package name */
    public int f10232f;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0832f.y(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0710a.f10767b);
    }

    public final boolean a(int i4, int i8, int i9) {
        boolean z8;
        if (i4 != getOrientation()) {
            setOrientation(i4);
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f10230d.getPaddingTop() == i8 && this.f10230d.getPaddingBottom() == i9) {
            return z8;
        }
        TextView textView = this.f10230d;
        WeakHashMap weakHashMap = O.f4214a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i8, textView.getPaddingEnd(), i9);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i8, textView.getPaddingRight(), i9);
        return true;
    }

    public Button getActionView() {
        return this.f10231e;
    }

    public TextView getMessageView() {
        return this.f10230d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f10230d = (TextView) findViewById(R.id.snackbar_text);
        this.f10231e = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i8) {
        boolean z8;
        super.onMeasure(i4, i8);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
            Layout layout = this.f10230d.getLayout();
            if (layout != null && layout.getLineCount() > 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8 && this.f10232f > 0 && this.f10231e.getMeasuredWidth() > this.f10232f) {
                if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    return;
                }
            } else {
                if (!z8) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            }
            super.onMeasure(i4, i8);
        }
    }

    public void setMaxInlineActionWidth(int i4) {
        this.f10232f = i4;
    }
}
