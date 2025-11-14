package com.google.android.material.datepicker;

import P.A;
import P.O;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.buzbuz.smartautoclicker.R;
import java.util.WeakHashMap;
import t0.s0;

/* loaded from: classes.dex */
public final class q extends s0 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f10142u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f10143v;

    public q(LinearLayout linearLayout, boolean z8) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f10142u = textView;
        WeakHashMap weakHashMap = O.f4214a;
        new A(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).h(textView, Boolean.TRUE);
        this.f10143v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z8) {
            textView.setVisibility(8);
        }
    }
}
