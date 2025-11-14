package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.buzbuz.smartautoclicker.R;
import java.util.Calendar;
import t0.U;
import t0.d0;
import t0.s0;

/* loaded from: classes.dex */
public final class r extends U {

    /* renamed from: d, reason: collision with root package name */
    public final b f10144d;

    /* renamed from: e, reason: collision with root package name */
    public final W0.c f10145e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10146f;

    public r(ContextThemeWrapper contextThemeWrapper, b bVar, W0.c cVar) {
        int i4;
        n nVar = bVar.f10070d;
        n nVar2 = bVar.f10071e;
        n nVar3 = bVar.f10073g;
        if (nVar.f10129d.compareTo(nVar3.f10129d) <= 0) {
            if (nVar3.f10129d.compareTo(nVar2.f10129d) <= 0) {
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * o.f10135g;
                if (l.Y(contextThemeWrapper, android.R.attr.windowFullscreen)) {
                    i4 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i4 = 0;
                }
                this.f10146f = dimensionPixelSize + i4;
                this.f10144d = bVar;
                this.f10145e = cVar;
                if (!this.f14788a.a()) {
                    this.f14789b = true;
                    return;
                }
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // t0.U
    public final int a() {
        return this.f10144d.j;
    }

    @Override // t0.U
    public final long b(int i4) {
        Calendar a3 = v.a(this.f10144d.f10070d.f10129d);
        a3.add(2, i4);
        a3.set(5, 1);
        Calendar a4 = v.a(a3);
        a4.get(2);
        a4.get(1);
        a4.getMaximum(7);
        a4.getActualMaximum(5);
        a4.getTimeInMillis();
        return a4.getTimeInMillis();
    }

    @Override // t0.U
    public final void d(s0 s0Var, int i4) {
        q qVar = (q) s0Var;
        b bVar = this.f10144d;
        Calendar a3 = v.a(bVar.f10070d.f10129d);
        a3.add(2, i4);
        n nVar = new n(a3);
        qVar.f10142u.setText(nVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) qVar.f10143v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() != null && nVar.equals(materialCalendarGridView.a().f10137d)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.a().getClass();
            throw null;
        }
        new o(nVar, bVar);
        throw null;
    }

    @Override // t0.U
    public final s0 e(ViewGroup viewGroup, int i4) {
        LinearLayout linearLayout = (LinearLayout) A.j.h(viewGroup, R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (l.Y(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            linearLayout.setLayoutParams(new d0(-1, this.f10146f));
            return new q(linearLayout, true);
        }
        return new q(linearLayout, false);
    }
}
