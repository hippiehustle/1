package com.google.android.material.textview;

import E2.d;
import M5.a;
import a.AbstractC0405a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import e5.AbstractC0645a;
import o.C1178a0;

/* loaded from: classes.dex */
public class MaterialTextView extends C1178a0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (d.F(context2, com.buzbuz.smartautoclicker.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0645a.f10617F;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int i4 = -1;
            for (int i8 = 0; i8 < 2 && i4 < 0; i8++) {
                i4 = AbstractC0405a.E(context2, obtainStyledAttributes, iArr2[i8], -1);
            }
            obtainStyledAttributes.recycle();
            if (i4 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0645a.f10616E);
                    Context context3 = getContext();
                    int[] iArr3 = {1, 2};
                    int i9 = -1;
                    for (int i10 = 0; i10 < 2 && i9 < 0; i10++) {
                        i9 = AbstractC0405a.E(context3, obtainStyledAttributes3, iArr3[i10], -1);
                    }
                    obtainStyledAttributes3.recycle();
                    if (i9 >= 0) {
                        setLineHeight(i9);
                    }
                }
            }
        }
    }

    @Override // o.C1178a0, android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        if (d.F(context, com.buzbuz.smartautoclicker.R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i4, AbstractC0645a.f10616E);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int i8 = -1;
            for (int i9 = 0; i9 < 2 && i8 < 0; i9++) {
                i8 = AbstractC0405a.E(context2, obtainStyledAttributes, iArr[i9], -1);
            }
            obtainStyledAttributes.recycle();
            if (i8 >= 0) {
                setLineHeight(i8);
            }
        }
    }
}
