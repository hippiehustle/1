package b5;

import L7.AbstractC0166y;
import V5.j;
import a.AbstractC0405a;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.U;
import androidx.lifecycle.b0;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textview.MaterialTextView;
import g0.r;
import i.C0865d;
import kotlin.Metadata;
import o6.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb5/d;", "Lg0/r;", "<init>", "()V", "smartautoclicker_fDroidRelease"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, Z.g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d extends r implements X5.b {

    /* renamed from: s0, reason: collision with root package name */
    public j f9186s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f9187t0;

    /* renamed from: u0, reason: collision with root package name */
    public volatile V5.f f9188u0;

    /* renamed from: v0, reason: collision with root package name */
    public final Object f9189v0 = new Object();

    /* renamed from: w0, reason: collision with root package name */
    public boolean f9190w0 = false;

    /* renamed from: x0, reason: collision with root package name */
    public final A4.d f9191x0;

    /* renamed from: y0, reason: collision with root package name */
    public R.g f9192y0;

    public d() {
        Z5.g c6 = Z5.a.c(Z5.h.f7483e, new M1.e(15, new M1.e(14, this)));
        this.f9191x0 = new A4.d(v.f13643a.b(h.class), new M1.f(c6, 12), new M1.g(this, c6, 6), new M1.f(c6, 13));
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final LayoutInflater B(Bundle bundle) {
        LayoutInflater B8 = super.B(bundle);
        return B8.cloneInContext(new j(B8, this));
    }

    @Override // g0.r
    public final Dialog T() {
        View inflate = k().inflate(R.layout.dialog_conditions_migration, (ViewGroup) null, false);
        int i4 = R.id.button_migration;
        View r8 = E2.b.r(inflate, R.id.button_migration);
        if (r8 != null) {
            int i8 = R.id.button;
            MaterialButton materialButton = (MaterialButton) E2.b.r(r8, R.id.button);
            if (materialButton != null) {
                i8 = R.id.loading;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) E2.b.r(r8, R.id.loading);
                if (circularProgressIndicator != null) {
                    A4.c cVar = new A4.c((FrameLayout) r8, materialButton, circularProgressIndicator, 18);
                    int i9 = R.id.desc_migration;
                    if (((MaterialTextView) E2.b.r(inflate, R.id.desc_migration)) != null) {
                        i9 = R.id.divider_top;
                        if (((MaterialDivider) E2.b.r(inflate, R.id.divider_top)) != null) {
                            i9 = R.id.text_state;
                            MaterialTextView materialTextView = (MaterialTextView) E2.b.r(inflate, R.id.text_state);
                            if (materialTextView != null) {
                                i9 = R.id.title_migration;
                                if (((MaterialTextView) E2.b.r(inflate, R.id.title_migration)) != null) {
                                    this.f9192y0 = new R.g((NestedScrollView) inflate, cVar, materialTextView, 2);
                                    s5.b bVar = new s5.b(O());
                                    R.g gVar = this.f9192y0;
                                    if (gVar != null) {
                                        ((C0865d) bVar.f3288e).f11674q = (NestedScrollView) gVar.f4987e;
                                        return bVar.c();
                                    }
                                    o6.j.i("viewBinding");
                                    throw null;
                                }
                            }
                        }
                    }
                    i4 = i9;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(r8.getResources().getResourceName(i8)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    public final void W() {
        if (this.f9186s0 == null) {
            this.f9186s0 = new j(super.j(), this);
            this.f9187t0 = AbstractC0405a.b0(super.j());
        }
    }

    @Override // X5.b
    public final Object a() {
        if (this.f9188u0 == null) {
            synchronized (this.f9189v0) {
                try {
                    if (this.f9188u0 == null) {
                        this.f9188u0 = new V5.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f9188u0.a();
    }

    @Override // g0.AbstractComponentCallbacksC0755y, androidx.lifecycle.InterfaceC0499j
    public final b0 d() {
        return E2.d.v(this, super.d());
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final Context j() {
        if (super.j() == null && !this.f9187t0) {
            return null;
        }
        W();
        return this.f9186s0;
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void u(Activity activity) {
        boolean z8;
        this.f11093I = true;
        j jVar = this.f9186s0;
        if (jVar != null && V5.f.c(jVar) != activity) {
            z8 = false;
        } else {
            z8 = true;
        }
        E2.b.h(z8, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        W();
        if (!this.f9190w0) {
            this.f9190w0 = true;
            ((e) a()).getClass();
        }
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final void v(Context context) {
        super.v(context);
        W();
        if (!this.f9190w0) {
            this.f9190w0 = true;
            ((e) a()).getClass();
        }
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final void w(Bundle bundle) {
        super.w(bundle);
        this.f11058i0 = false;
        Dialog dialog = this.f11062n0;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        AbstractC0166y.q(U.e(this), null, null, new c(this, null), 3);
    }
}
