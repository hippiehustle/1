package com.buzbuz.smartautoclicker.feature.tutorial.ui.list;

import A.i;
import A4.d;
import L7.AbstractC0166y;
import M1.e;
import V5.f;
import V5.j;
import X5.b;
import Z.g;
import Z5.a;
import Z5.h;
import a.AbstractC0405a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.U;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.RecyclerView;
import c1.C0563d;
import com.buzbuz.smartautoclicker.R;
import g0.AbstractComponentCallbacksC0755y;
import kotlin.Metadata;
import o6.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/buzbuz/smartautoclicker/feature/tutorial/ui/list/TutorialListFragment;", "Lg0/y;", "<init>", "()V", "tutorial_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TutorialListFragment extends AbstractComponentCallbacksC0755y implements b {

    /* renamed from: c0, reason: collision with root package name */
    public j f9840c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f9841d0;

    /* renamed from: e0, reason: collision with root package name */
    public volatile f f9842e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Object f9843f0 = new Object();

    /* renamed from: g0, reason: collision with root package name */
    public boolean f9844g0 = false;

    /* renamed from: h0, reason: collision with root package name */
    public final d f9845h0;

    /* renamed from: i0, reason: collision with root package name */
    public i f9846i0;
    public R4.d j0;

    /* renamed from: k0, reason: collision with root package name */
    public C1.g f9847k0;

    public TutorialListFragment() {
        Z5.g c6 = a.c(h.f7483e, new e(5, new e(4, this)));
        this.f9845h0 = new d(v.f13643a.b(R4.i.class), new M1.f(c6, 4), new M1.g(this, c6, 2), new M1.f(c6, 5));
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final LayoutInflater B(Bundle bundle) {
        LayoutInflater B8 = super.B(bundle);
        return B8.cloneInContext(new j(B8, this));
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void F() {
        this.f11093I = true;
        C1.g gVar = this.f9847k0;
        if (gVar != null) {
            gVar.b();
        } else {
            o6.j.i("overlayManager");
            throw null;
        }
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void H(View view) {
        o6.j.e(view, "view");
        i iVar = this.f9846i0;
        if (iVar != null) {
            RecyclerView recyclerView = (RecyclerView) iVar.f89f;
            R4.d dVar = this.j0;
            if (dVar != null) {
                recyclerView.setAdapter(dVar);
                AbstractC0166y.q(U.e(this), null, null, new R4.f(this, null), 3);
                return;
            } else {
                o6.j.i("adapter");
                throw null;
            }
        }
        o6.j.i("viewBinding");
        throw null;
    }

    public final void S() {
        if (this.f9840c0 == null) {
            this.f9840c0 = new j(super.j(), this);
            this.f9841d0 = AbstractC0405a.b0(super.j());
        }
    }

    public final void T() {
        if (!this.f9844g0) {
            this.f9844g0 = true;
            this.f9847k0 = (C1.g) ((C0563d) ((R4.g) a())).f9441a.f9473f.get();
        }
    }

    @Override // X5.b
    public final Object a() {
        if (this.f9842e0 == null) {
            synchronized (this.f9843f0) {
                try {
                    if (this.f9842e0 == null) {
                        this.f9842e0 = new f(this);
                    }
                } finally {
                }
            }
        }
        return this.f9842e0.a();
    }

    @Override // g0.AbstractComponentCallbacksC0755y, androidx.lifecycle.InterfaceC0499j
    public final b0 d() {
        return E2.d.v(this, super.d());
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final Context j() {
        if (super.j() == null && !this.f9841d0) {
            return null;
        }
        S();
        return this.f9840c0;
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void u(Activity activity) {
        boolean z8 = true;
        this.f11093I = true;
        j jVar = this.f9840c0;
        if (jVar != null && f.c(jVar) != activity) {
            z8 = false;
        }
        E2.b.h(z8, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S();
        T();
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void v(Context context) {
        super.v(context);
        S();
        T();
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        o6.j.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_tutorial_list, viewGroup, false);
        if (inflate != null) {
            RecyclerView recyclerView = (RecyclerView) inflate;
            this.f9846i0 = new i(recyclerView, 10, recyclerView);
            this.j0 = new R4.d(new A1.e(1, this, TutorialListFragment.class, "onGameClicked", "onGameClicked(I)V", 0, 0, 20));
            i iVar = this.f9846i0;
            if (iVar != null) {
                return (RecyclerView) iVar.f88e;
            }
            o6.j.i("viewBinding");
            throw null;
        }
        throw new NullPointerException("rootView");
    }
}
