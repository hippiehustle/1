package com.buzbuz.smartautoclicker.scenarios.list;

import A4.d;
import L7.AbstractC0166y;
import M1.e;
import P.F;
import P.O;
import V5.f;
import V5.j;
import W4.i;
import W4.n;
import W4.o;
import W4.x;
import X5.b;
import Z.g;
import Z4.q;
import Z5.a;
import Z5.h;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.U;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.RecyclerView;
import c3.C0573e;
import com.airbnb.lottie.LottieAnimationView;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.scenarios.list.ScenarioListFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textview.MaterialTextView;
import g0.AbstractComponentCallbacksC0755y;
import i.DialogInterfaceC0869h;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import o6.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/buzbuz/smartautoclicker/scenarios/list/ScenarioListFragment;", "Lg0/y;", "<init>", "()V", "W4/h", "smartautoclicker_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScenarioListFragment extends AbstractComponentCallbacksC0755y implements b {

    /* renamed from: c0, reason: collision with root package name */
    public j f9860c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f9861d0;

    /* renamed from: e0, reason: collision with root package name */
    public volatile f f9862e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Object f9863f0 = new Object();

    /* renamed from: g0, reason: collision with root package name */
    public boolean f9864g0 = false;

    /* renamed from: h0, reason: collision with root package name */
    public final d f9865h0;

    /* renamed from: i0, reason: collision with root package name */
    public F3.d f9866i0;
    public X4.g j0;

    /* renamed from: k0, reason: collision with root package name */
    public DialogInterfaceC0869h f9867k0;

    public ScenarioListFragment() {
        Z5.g c6 = a.c(h.f7483e, new e(9, new e(8, this)));
        this.f9865h0 = new d(v.f13643a.b(x.class), new M1.f(c6, 8), new M1.g(this, c6, 4), new M1.f(c6, 9));
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final LayoutInflater B(Bundle bundle) {
        LayoutInflater B8 = super.B(bundle);
        return B8.cloneInContext(new j(B8, this));
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void H(View view) {
        o6.j.e(view, "view");
        F3.d dVar = this.f9866i0;
        if (dVar != null) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) dVar.f1325g;
            RecyclerView recyclerView = (RecyclerView) dVar.k;
            X4.g gVar = this.j0;
            if (gVar != null) {
                recyclerView.setAdapter(gVar);
                final int i4 = 0;
                ((MaterialButton) dVar.f1327i).setOnClickListener(new View.OnClickListener(this) { // from class: W4.e

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ ScenarioListFragment f6592e;

                    {
                        this.f6592e = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i4) {
                            case 0:
                                new V4.k().V(this.f6592e.M().p(), "ScenarioCreationDialog");
                                return;
                            default:
                                new V4.k().V(this.f6592e.M().p(), "ScenarioCreationDialog");
                                return;
                        }
                    }
                });
                final int i8 = 1;
                floatingActionButton.setOnClickListener(new View.OnClickListener(this) { // from class: W4.e

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ ScenarioListFragment f6592e;

                    {
                        this.f6592e = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i8) {
                            case 0:
                                new V4.k().V(this.f6592e.M().p(), "ScenarioCreationDialog");
                                return;
                            default:
                                new V4.k().V(this.f6592e.M().p(), "ScenarioCreationDialog");
                                return;
                        }
                    }
                });
                ((AppBarLayout) dVar.f1326h).setStatusBarForeground(G5.h.d(j(), 0.0f, null));
                ((MaterialToolbar) dVar.f1328l).setOnMenuItemClickListener(new W4.f(this));
                int dimensionPixelSize = n().getDimensionPixelSize(R.dimen.margin_horizontal_mini);
                int dimensionPixelSize2 = n().getDimensionPixelSize(R.dimen.margin_horizontal_large);
                J1.b bVar = new J1.b(new Rect(dimensionPixelSize, 0, dimensionPixelSize, n().getDimensionPixelSize(R.dimen.margin_vertical_default)), new Rect(dimensionPixelSize2, 0, dimensionPixelSize2, n().getDimensionPixelSize(R.dimen.margin_vertical_extra_large)));
                WeakHashMap weakHashMap = O.f4214a;
                F.l(floatingActionButton, bVar);
                AbstractC0166y.q(U.e(this), null, null, new n(this, null), 3);
                return;
            }
            o6.j.i("scenariosAdapter");
            throw null;
        }
        o6.j.i("viewBinding");
        throw null;
    }

    public final x S() {
        return (x) this.f9865h0.getValue();
    }

    public final void T() {
        if (this.f9860c0 == null) {
            this.f9860c0 = new j(super.j(), this);
            this.f9861d0 = AbstractC0405a.b0(super.j());
        }
    }

    public final void U(boolean z8, List list, List list2) {
        C0573e c0573e = new C0573e();
        Bundle bundle = new Bundle();
        bundle.putBoolean(":backup:fragment_args_key_is_import", z8);
        if (list != null) {
            bundle.putLongArray(":backup:fragment_args_key_scenario_list", AbstractC0436k.R0(list));
        }
        if (list2 != null) {
            bundle.putLongArray(":backup:fragment_args_key_dumb_scenario_list", AbstractC0436k.R0(list2));
        }
        c0573e.R(bundle);
        c0573e.V(M().p(), "BackupDialog");
        S().e(q.f7464d);
    }

    @Override // X5.b
    public final Object a() {
        if (this.f9862e0 == null) {
            synchronized (this.f9863f0) {
                try {
                    if (this.f9862e0 == null) {
                        this.f9862e0 = new f(this);
                    }
                } finally {
                }
            }
        }
        return this.f9862e0.a();
    }

    @Override // g0.AbstractComponentCallbacksC0755y, androidx.lifecycle.InterfaceC0499j
    public final b0 d() {
        return E2.d.v(this, super.d());
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final Context j() {
        if (super.j() == null && !this.f9861d0) {
            return null;
        }
        T();
        return this.f9860c0;
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void u(Activity activity) {
        boolean z8;
        this.f11093I = true;
        j jVar = this.f9860c0;
        if (jVar != null && f.c(jVar) != activity) {
            z8 = false;
        } else {
            z8 = true;
        }
        E2.b.h(z8, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        T();
        if (!this.f9864g0) {
            this.f9864g0 = true;
            ((o) a()).getClass();
        }
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void v(Context context) {
        super.v(context);
        T();
        if (!this.f9864g0) {
            this.f9864g0 = true;
            ((o) a()).getClass();
        }
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void w(Bundle bundle) {
        super.w(bundle);
        int i4 = 0;
        A1.o oVar = new A1.o(2, S(), x.class, "getConditionBitmap", "getConditionBitmap(Lcom/buzbuz/smartautoclicker/core/domain/model/condition/ImageCondition;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", 0, i4, 7);
        A1.e eVar = new A1.e(1, this, ScenarioListFragment.class, "onStartClicked", "onStartClicked(Lcom/buzbuz/smartautoclicker/scenarios/list/model/ScenarioListUiState$Item$ScenarioItem;)V", i4, 0, 28);
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        A1.e eVar2 = new A1.e(i9, this, ScenarioListFragment.class, "onDeleteClicked", "onDeleteClicked(Lcom/buzbuz/smartautoclicker/scenarios/list/model/ScenarioListUiState$Item$ScenarioItem;)V", i10, i8, 29);
        i iVar = new i(i9, this, ScenarioListFragment.class, "onExportClicked", "onExportClicked(Lcom/buzbuz/smartautoclicker/scenarios/list/model/ScenarioListUiState$Item;)V", i10, i8, 0);
        i iVar2 = new i(i9, this, ScenarioListFragment.class, "showCopyScenarioDialog", "showCopyScenarioDialog(Lcom/buzbuz/smartautoclicker/scenarios/list/model/ScenarioListUiState$Item$ScenarioItem$Valid;)V", i10, i8, 1);
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        this.j0 = new X4.g(oVar, eVar, new i(i12, S(), x.class, "expandCollapseItem", "expandCollapseItem(Lcom/buzbuz/smartautoclicker/scenarios/list/model/ScenarioListUiState$Item;)V", i13, i11, 2), iVar, iVar2, eVar2, new i(i12, S(), x.class, "updateSortType", "updateSortType(Lcom/buzbuz/smartautoclicker/scenarios/list/sort/ScenarioSortType;)V", i13, i11, 3), new i(1, S(), x.class, "updateSmartVisible", "updateSmartVisible(Z)V", i11, i14, 4), new i(1, S(), x.class, "updateDumbVisible", "updateDumbVisible(Z)V", i14, i15, 5), new A1.e(1, S(), x.class, "updateSortOrder", "updateSortOrder(Z)V", i15, 0, 27));
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        o6.j.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_scenarios, viewGroup, false);
        int i4 = R.id.add;
        FloatingActionButton floatingActionButton = (FloatingActionButton) E2.b.r(inflate, R.id.add);
        if (floatingActionButton != null) {
            i4 = R.id.appBarLayout;
            AppBarLayout appBarLayout = (AppBarLayout) E2.b.r(inflate, R.id.appBarLayout);
            if (appBarLayout != null) {
                i4 = R.id.empty_create_button;
                MaterialButton materialButton = (MaterialButton) E2.b.r(inflate, R.id.empty_create_button);
                if (materialButton != null) {
                    i4 = R.id.empty_lottie_view;
                    if (((LottieAnimationView) E2.b.r(inflate, R.id.empty_lottie_view)) != null) {
                        i4 = R.id.empty_text_title;
                        if (((MaterialTextView) E2.b.r(inflate, R.id.empty_text_title)) != null) {
                            i4 = R.id.layout_empty;
                            ConstraintLayout constraintLayout = (ConstraintLayout) E2.b.r(inflate, R.id.layout_empty);
                            if (constraintLayout != null) {
                                i4 = R.id.list;
                                RecyclerView recyclerView = (RecyclerView) E2.b.r(inflate, R.id.list);
                                if (recyclerView != null) {
                                    i4 = R.id.loading;
                                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) E2.b.r(inflate, R.id.loading);
                                    if (circularProgressIndicator != null) {
                                        i4 = R.id.topAppBar;
                                        MaterialToolbar materialToolbar = (MaterialToolbar) E2.b.r(inflate, R.id.topAppBar);
                                        if (materialToolbar != null) {
                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                                            this.f9866i0 = new F3.d(coordinatorLayout, floatingActionButton, appBarLayout, materialButton, constraintLayout, recyclerView, circularProgressIndicator, materialToolbar, 2);
                                            o6.j.d(coordinatorLayout, "getRoot(...)");
                                            return coordinatorLayout;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }
}
