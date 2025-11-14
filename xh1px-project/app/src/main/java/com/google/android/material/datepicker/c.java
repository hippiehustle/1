package com.google.android.material.datepicker;

import a.AbstractC0405a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import t7.C1594d;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C1594d f10076a;

    /* renamed from: b, reason: collision with root package name */
    public final C1594d f10077b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(E2.d.G(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0645a.f10652w);
        C1594d.j(context, obtainStyledAttributes.getResourceId(4, 0));
        C1594d.j(context, obtainStyledAttributes.getResourceId(2, 0));
        C1594d.j(context, obtainStyledAttributes.getResourceId(3, 0));
        C1594d.j(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList C8 = AbstractC0405a.C(context, obtainStyledAttributes, 7);
        this.f10076a = C1594d.j(context, obtainStyledAttributes.getResourceId(9, 0));
        C1594d.j(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f10077b = C1594d.j(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(C8.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
