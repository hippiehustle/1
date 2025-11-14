package com.google.android.material.datepicker;

import P.O;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import t0.P;

/* loaded from: classes.dex */
public final class k<S> extends s {

    /* renamed from: d0, reason: collision with root package name */
    public int f10093d0;

    /* renamed from: e0, reason: collision with root package name */
    public b f10094e0;

    /* renamed from: f0, reason: collision with root package name */
    public n f10095f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f10096g0;

    /* renamed from: h0, reason: collision with root package name */
    public c f10097h0;

    /* renamed from: i0, reason: collision with root package name */
    public RecyclerView f10098i0;
    public RecyclerView j0;

    /* renamed from: k0, reason: collision with root package name */
    public View f10099k0;

    /* renamed from: l0, reason: collision with root package name */
    public View f10100l0;

    /* renamed from: m0, reason: collision with root package name */
    public View f10101m0;

    /* renamed from: n0, reason: collision with root package name */
    public View f10102n0;

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void E(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f10093d0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f10094e0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f10095f0);
    }

    public final void S(n nVar) {
        boolean z8;
        r rVar = (r) this.j0.getAdapter();
        int d2 = rVar.f10144d.f10070d.d(nVar);
        int d3 = d2 - rVar.f10144d.f10070d.d(this.f10095f0);
        boolean z9 = false;
        if (Math.abs(d3) > 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (d3 > 0) {
            z9 = true;
        }
        this.f10095f0 = nVar;
        if (z8 && z9) {
            this.j0.j0(d2 - 3);
            this.j0.post(new A5.c(this, d2, 4));
        } else if (z8) {
            this.j0.j0(d2 + 3);
            this.j0.post(new A5.c(this, d2, 4));
        } else {
            this.j0.post(new A5.c(this, d2, 4));
        }
    }

    public final void T(int i4) {
        this.f10096g0 = i4;
        if (i4 == 2) {
            this.f10098i0.getLayoutManager().v0(this.f10095f0.f10131f - ((x) this.f10098i0.getAdapter()).f10151d.f10094e0.f10070d.f10131f);
            this.f10101m0.setVisibility(0);
            this.f10102n0.setVisibility(8);
            this.f10099k0.setVisibility(8);
            this.f10100l0.setVisibility(8);
            return;
        }
        if (i4 == 1) {
            this.f10101m0.setVisibility(8);
            this.f10102n0.setVisibility(0);
            this.f10099k0.setVisibility(0);
            this.f10100l0.setVisibility(0);
            S(this.f10095f0);
        }
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void w(Bundle bundle) {
        super.w(bundle);
        if (bundle == null) {
            bundle = this.f11115i;
        }
        this.f10093d0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") == null) {
            this.f10094e0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.f10095f0 = (n) bundle.getParcelable("CURRENT_MONTH_KEY");
                return;
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v16, types: [t0.a0, java.lang.Object] */
    @Override // g0.AbstractComponentCallbacksC0755y
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i4;
        int i8;
        e eVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(j(), this.f10093d0);
        this.f10097h0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        n nVar = this.f10094e0.f10070d;
        if (l.Y(contextThemeWrapper, R.attr.windowFullscreen)) {
            i4 = com.buzbuz.smartautoclicker.R.layout.mtrl_calendar_vertical;
            i8 = 1;
        } else {
            i4 = com.buzbuz.smartautoclicker.R.layout.mtrl_calendar_horizontal;
            i8 = 0;
        }
        View inflate = cloneInContext.inflate(i4, viewGroup, false);
        Resources resources = O().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.buzbuz.smartautoclicker.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.buzbuz.smartautoclicker.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.buzbuz.smartautoclicker.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.buzbuz.smartautoclicker.R.dimen.mtrl_calendar_days_of_week_height);
        int i9 = o.f10135g;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.buzbuz.smartautoclicker.R.dimen.mtrl_calendar_month_vertical_padding) * (i9 - 1)) + (resources.getDimensionPixelSize(com.buzbuz.smartautoclicker.R.dimen.mtrl_calendar_day_height) * i9) + resources.getDimensionPixelOffset(com.buzbuz.smartautoclicker.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.buzbuz.smartautoclicker.R.id.mtrl_calendar_days_of_week);
        O.m(gridView, new S.e(1));
        int i10 = this.f10094e0.f10074h;
        if (i10 > 0) {
            eVar = new e(i10);
        } else {
            eVar = new e();
        }
        gridView.setAdapter((ListAdapter) eVar);
        gridView.setNumColumns(nVar.f10132g);
        gridView.setEnabled(false);
        this.j0 = (RecyclerView) inflate.findViewById(com.buzbuz.smartautoclicker.R.id.mtrl_calendar_months);
        this.j0.setLayoutManager(new g(this, i8, i8));
        this.j0.setTag("MONTHS_VIEW_GROUP_TAG");
        r rVar = new r(contextThemeWrapper, this.f10094e0, new W0.c(26, this));
        this.j0.setAdapter(rVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.buzbuz.smartautoclicker.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(com.buzbuz.smartautoclicker.R.id.mtrl_calendar_year_selector_frame);
        this.f10098i0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f10098i0.setLayoutManager(new GridLayoutManager(integer));
            this.f10098i0.setAdapter(new x(this));
            RecyclerView recyclerView2 = this.f10098i0;
            ?? obj = new Object();
            v.c(null);
            v.c(null);
            recyclerView2.i(obj);
        }
        if (inflate.findViewById(com.buzbuz.smartautoclicker.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.buzbuz.smartautoclicker.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            O.m(materialButton, new i(0, this));
            View findViewById = inflate.findViewById(com.buzbuz.smartautoclicker.R.id.month_navigation_previous);
            this.f10099k0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.buzbuz.smartautoclicker.R.id.month_navigation_next);
            this.f10100l0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f10101m0 = inflate.findViewById(com.buzbuz.smartautoclicker.R.id.mtrl_calendar_year_selector_frame);
            this.f10102n0 = inflate.findViewById(com.buzbuz.smartautoclicker.R.id.mtrl_calendar_day_selector_frame);
            T(1);
            materialButton.setText(this.f10095f0.c());
            this.j0.j(new j(this, rVar, materialButton));
            int i11 = 1;
            materialButton.setOnClickListener(new A5.h(i11, this));
            this.f10100l0.setOnClickListener(new f(this, rVar, i11));
            this.f10099k0.setOnClickListener(new f(this, rVar, 0));
        }
        if (!l.Y(contextThemeWrapper, R.attr.windowFullscreen)) {
            new P().a(this.j0);
        }
        this.j0.j0(rVar.f10144d.f10070d.d(this.f10095f0));
        O.m(this.j0, new S.e(2));
        return inflate;
    }
}
