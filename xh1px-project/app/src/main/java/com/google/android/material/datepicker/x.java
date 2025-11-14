package com.google.android.material.datepicker;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.buzbuz.smartautoclicker.R;
import java.util.Locale;
import t0.U;
import t0.s0;
import t7.C1594d;

/* loaded from: classes.dex */
public final class x extends U {

    /* renamed from: d, reason: collision with root package name */
    public final k f10151d;

    public x(k kVar) {
        this.f10151d = kVar;
    }

    @Override // t0.U
    public final int a() {
        return this.f10151d.f10094e0.f10075i;
    }

    @Override // t0.U
    public final void d(s0 s0Var, int i4) {
        String format;
        k kVar = this.f10151d;
        int i8 = kVar.f10094e0.f10070d.f10131f + i4;
        TextView textView = ((w) s0Var).f10150u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i8)));
        Context context = textView.getContext();
        if (v.b().get(1) == i8) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i8));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i8));
        }
        textView.setContentDescription(format);
        c cVar = kVar.f10097h0;
        if (v.b().get(1) == i8) {
            C1594d c1594d = cVar.f10077b;
        } else {
            C1594d c1594d2 = cVar.f10076a;
        }
        throw null;
    }

    @Override // t0.U
    public final s0 e(ViewGroup viewGroup, int i4) {
        return new w((TextView) A.j.h(viewGroup, R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
