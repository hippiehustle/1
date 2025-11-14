package V4;

import L7.AbstractC0166y;
import L7.F;
import O7.i0;
import a.AbstractC0405a;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.U;
import androidx.lifecycle.b0;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l0.C0997a;
import l5.DialogC1035e;
import o.p1;
import o6.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LV4/k;", "Lg0/r;", "<init>", "()V", "smartautoclicker_fDroidRelease"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, Z.g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k extends g0.r implements X5.b {

    /* renamed from: s0, reason: collision with root package name */
    public V5.j f6394s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f6395t0;

    /* renamed from: u0, reason: collision with root package name */
    public volatile V5.f f6396u0;

    /* renamed from: v0, reason: collision with root package name */
    public final Object f6397v0 = new Object();

    /* renamed from: w0, reason: collision with root package name */
    public boolean f6398w0 = false;

    /* renamed from: x0, reason: collision with root package name */
    public final A4.d f6399x0;

    /* renamed from: y0, reason: collision with root package name */
    public p1 f6400y0;

    public k() {
        Z5.g c6 = Z5.a.c(Z5.h.f7483e, new M1.e(7, new M1.e(6, this)));
        this.f6399x0 = new A4.d(v.f13643a.b(q.class), new M1.f(c6, 6), new M1.g(this, c6, 3), new M1.f(c6, 7));
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final LayoutInflater B(Bundle bundle) {
        LayoutInflater B8 = super.B(bundle);
        return B8.cloneInContext(new V5.j(B8, this));
    }

    @Override // g0.r
    public final Dialog T() {
        final int i4 = 0;
        View inflate = k().inflate(R.layout.dialog_scenario_creation, (ViewGroup) null, false);
        int i8 = R.id.card_type_selection;
        if (((MaterialCardView) E2.b.r(inflate, R.id.card_type_selection)) != null) {
            i8 = R.id.layout_scenario_type;
            if (((ConstraintLayout) E2.b.r(inflate, R.id.layout_scenario_type)) != null) {
                i8 = R.id.layout_top_bar;
                View r8 = E2.b.r(inflate, R.id.layout_top_bar);
                if (r8 != null) {
                    A4.d a3 = A4.d.a(r8);
                    i8 = R.id.scenario_name_input_layout;
                    View r9 = E2.b.r(inflate, R.id.scenario_name_input_layout);
                    if (r9 != null) {
                        A.i a4 = A.i.a(r9);
                        i8 = R.id.scenario_type_description;
                        MaterialTextView materialTextView = (MaterialTextView) E2.b.r(inflate, R.id.scenario_type_description);
                        if (materialTextView != null) {
                            i8 = R.id.scenario_type_description_not_purchased;
                            MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(inflate, R.id.scenario_type_description_not_purchased);
                            if (materialTextView2 != null) {
                                i8 = R.id.scenario_type_dumb;
                                View r10 = E2.b.r(inflate, R.id.scenario_type_dumb);
                                if (r10 != null) {
                                    R.g j = R.g.j(r10);
                                    i8 = R.id.scenario_type_smart;
                                    View r11 = E2.b.r(inflate, R.id.scenario_type_smart);
                                    if (r11 != null) {
                                        R.g j5 = R.g.j(r11);
                                        i8 = R.id.scenario_type_title;
                                        if (((MaterialTextView) E2.b.r(inflate, R.id.scenario_type_title)) != null) {
                                            LinearLayout linearLayout = (LinearLayout) inflate;
                                            p1 p1Var = new p1(linearLayout, a3, a4, materialTextView, materialTextView2, j, j5, 8);
                                            ((MaterialTextView) a3.f298h).setText(R.string.dialog_title_add_scenario);
                                            MaterialButton materialButton = (MaterialButton) a3.f297g;
                                            materialButton.setVisibility(0);
                                            materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: V4.c

                                                /* renamed from: e, reason: collision with root package name */
                                                public final /* synthetic */ k f6379e;

                                                {
                                                    this.f6379e = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i9 = i4;
                                                    k kVar = this.f6379e;
                                                    switch (i9) {
                                                        case 0:
                                                            kVar.S(false, false);
                                                            return;
                                                        default:
                                                            q W7 = kVar.W();
                                                            i0 i0Var = W7.j;
                                                            CharSequence charSequence = (CharSequence) W7.f6415e.f();
                                                            if (charSequence != null && charSequence.length() != 0 && i0Var.f() == a.f6371e) {
                                                                i0Var.h(null, a.f6372f);
                                                                C0997a g8 = U.g(W7);
                                                                S7.e eVar = F.f3175a;
                                                                AbstractC0166y.q(g8, S7.d.f5456f, null, new m(W7, null), 2);
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            MaterialButton materialButton2 = (MaterialButton) a3.f299i;
                                            materialButton2.setVisibility(0);
                                            final int i9 = 1;
                                            materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: V4.c

                                                /* renamed from: e, reason: collision with root package name */
                                                public final /* synthetic */ k f6379e;

                                                {
                                                    this.f6379e = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i92 = i9;
                                                    k kVar = this.f6379e;
                                                    switch (i92) {
                                                        case 0:
                                                            kVar.S(false, false);
                                                            return;
                                                        default:
                                                            q W7 = kVar.W();
                                                            i0 i0Var = W7.j;
                                                            CharSequence charSequence = (CharSequence) W7.f6415e.f();
                                                            if (charSequence != null && charSequence.length() != 0 && i0Var.f() == a.f6371e) {
                                                                i0Var.h(null, a.f6372f);
                                                                C0997a g8 = U.g(W7);
                                                                S7.e eVar = F.f3175a;
                                                                AbstractC0166y.q(g8, S7.d.f5456f, null, new m(W7, null), 2);
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            ((MaterialButton) a3.f296f).setVisibility(8);
                                            ((TextInputLayout) a4.f88e).setHint(R.string.input_field_label_scenario_name);
                                            E2.c.x0(a4, new A1.h(15, this));
                                            ((TextInputEditText) a4.f89f).setFilters(new InputFilter[]{new InputFilter.LengthFilter(O().getResources().getInteger(R.integer.name_max_length))});
                                            X(j, t.f6422d);
                                            X(j5, t.f6423e);
                                            this.f6400y0 = p1Var;
                                            o6.j.d(linearLayout, "getRoot(...)");
                                            DialogC1035e dialogC1035e = new DialogC1035e(O());
                                            dialogC1035e.setContentView(linearLayout);
                                            dialogC1035e.setCancelable(false);
                                            dialogC1035e.setOnKeyListener(new A1.i(1, this));
                                            dialogC1035e.create();
                                            if (dialogC1035e.f12304i == null) {
                                                dialogC1035e.f();
                                            }
                                            dialogC1035e.f12304i.I(3);
                                            return dialogC1035e;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    public final q W() {
        return (q) this.f6399x0.getValue();
    }

    public final void X(R.g gVar, t tVar) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) gVar.f4988f;
        MaterialTextView materialTextView = (MaterialTextView) gVar.f4989g;
        int ordinal = tVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                materialTextView.setText(R.string.item_title_smart_scenario);
                appCompatImageView.setImageResource(R.drawable.ic_smart);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            materialTextView.setText(R.string.item_title_dumb_scenario);
            appCompatImageView.setImageResource(R.drawable.ic_dumb);
        }
        ((MaterialCardView) gVar.f4987e).setOnClickListener(new b(this, tVar, 0));
    }

    public final void Y() {
        if (this.f6394s0 == null) {
            this.f6394s0 = new V5.j(super.j(), this);
            this.f6395t0 = AbstractC0405a.b0(super.j());
        }
    }

    @Override // X5.b
    public final Object a() {
        if (this.f6396u0 == null) {
            synchronized (this.f6397v0) {
                try {
                    if (this.f6396u0 == null) {
                        this.f6396u0 = new V5.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f6396u0.a();
    }

    @Override // g0.AbstractComponentCallbacksC0755y, androidx.lifecycle.InterfaceC0499j
    public final b0 d() {
        return E2.d.v(this, super.d());
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final Context j() {
        if (super.j() == null && !this.f6395t0) {
            return null;
        }
        Y();
        return this.f6394s0;
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void u(Activity activity) {
        boolean z8;
        this.f11093I = true;
        V5.j jVar = this.f6394s0;
        if (jVar != null && V5.f.c(jVar) != activity) {
            z8 = false;
        } else {
            z8 = true;
        }
        E2.b.h(z8, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Y();
        if (!this.f6398w0) {
            this.f6398w0 = true;
            ((l) a()).getClass();
        }
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final void v(Context context) {
        super.v(context);
        Y();
        if (!this.f6398w0) {
            this.f6398w0 = true;
            ((l) a()).getClass();
        }
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final void w(Bundle bundle) {
        super.w(bundle);
        Object systemService = O().getSystemService((Class<Object>) InputMethodManager.class);
        o6.j.d(systemService, "getSystemService(...)");
        AbstractC0166y.q(U.e(this), null, null, new j(this, null), 3);
    }
}
