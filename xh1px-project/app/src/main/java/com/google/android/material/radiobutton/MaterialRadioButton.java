package com.google.android.material.radiobutton;

import M5.a;
import a.AbstractC0405a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import e5.AbstractC0645a;
import h4.AbstractC0832f;
import o.C1175C;
import x5.p;

/* loaded from: classes.dex */
public class MaterialRadioButton extends C1175C {
    public static final int[][] j = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f10205h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10206i;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.buzbuz.smartautoclicker.R.attr.radioButtonStyle, com.buzbuz.smartautoclicker.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray h8 = p.h(context2, attributeSet, AbstractC0645a.f10613B, com.buzbuz.smartautoclicker.R.attr.radioButtonStyle, com.buzbuz.smartautoclicker.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (h8.hasValue(0)) {
            setButtonTintList(AbstractC0405a.C(context2, h8, 0));
        }
        this.f10206i = h8.getBoolean(1, false);
        h8.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f10205h == null) {
            int o7 = AbstractC0832f.o(this, com.buzbuz.smartautoclicker.R.attr.colorControlActivated);
            int o8 = AbstractC0832f.o(this, com.buzbuz.smartautoclicker.R.attr.colorOnSurface);
            int o9 = AbstractC0832f.o(this, com.buzbuz.smartautoclicker.R.attr.colorSurface);
            this.f10205h = new ColorStateList(j, new int[]{AbstractC0832f.t(1.0f, o9, o7), AbstractC0832f.t(0.54f, o9, o8), AbstractC0832f.t(0.38f, o9, o8), AbstractC0832f.t(0.38f, o9, o8)});
        }
        return this.f10205h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10206i && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z8) {
        this.f10206i = z8;
        if (z8) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
