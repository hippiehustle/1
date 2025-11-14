package Y4;

import L7.AbstractC0166y;
import O7.i0;
import V5.j;
import Z5.n;
import a.AbstractC0405a;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.U;
import androidx.lifecycle.b0;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import g0.r;
import i.C0865d;
import kotlin.Metadata;
import o6.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LY4/d;", "Lg0/r;", "<init>", "()V", "smartautoclicker_fDroidRelease"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, Z.g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d extends r implements X5.b {

    /* renamed from: A0, reason: collision with root package name */
    public final n f7175A0;

    /* renamed from: B0, reason: collision with root package name */
    public final n f7176B0;

    /* renamed from: s0, reason: collision with root package name */
    public j f7177s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f7178t0;

    /* renamed from: u0, reason: collision with root package name */
    public volatile V5.f f7179u0;

    /* renamed from: v0, reason: collision with root package name */
    public final Object f7180v0 = new Object();

    /* renamed from: w0, reason: collision with root package name */
    public boolean f7181w0 = false;

    /* renamed from: x0, reason: collision with root package name */
    public final A4.d f7182x0;

    /* renamed from: y0, reason: collision with root package name */
    public U2.a f7183y0;

    /* renamed from: z0, reason: collision with root package name */
    public final n f7184z0;

    public d() {
        Z5.g c6 = Z5.a.c(Z5.h.f7483e, new M1.e(12, new M1.e(11, this)));
        this.f7182x0 = new A4.d(v.f13643a.b(i.class), new M1.f(c6, 10), new M1.g(this, c6, 5), new M1.f(c6, 11));
        this.f7184z0 = new n(new a(this, 0));
        this.f7175A0 = new n(new a(this, 1));
        this.f7176B0 = new n(new a(this, 2));
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final LayoutInflater B(Bundle bundle) {
        LayoutInflater B8 = super.B(bundle);
        return B8.cloneInContext(new j(B8, this));
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final void F() {
        Window window;
        super.F();
        U2.a aVar = this.f7183y0;
        if (aVar != null) {
            ((TextInputEditText) aVar.f6084f.f89f).requestFocus();
            Dialog dialog = this.f11062n0;
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setSoftInputMode(5);
                return;
            }
            return;
        }
        o6.j.i("viewBinding");
        throw null;
    }

    @Override // g0.r
    public final Dialog T() {
        View inflate = k().inflate(R.layout.dialog_scenario_copy, (ViewGroup) null, false);
        View r8 = E2.b.r(inflate, R.id.field_scenario_name);
        if (r8 != null) {
            A.i a3 = A.i.a(r8);
            U2.a aVar = new U2.a((FrameLayout) inflate, a3, 0);
            ((TextInputLayout) a3.f88e).setHint(R.string.default_click_name);
            E2.c.y0(a3, (String) this.f7176B0.getValue(), 1);
            E2.c.x0(a3, new A1.h(16, this));
            ((TextInputEditText) a3.f89f).setFilters(new InputFilter[]{new InputFilter.LengthFilter(O().getResources().getInteger(R.integer.name_max_length))});
            this.f7183y0 = aVar;
            s5.b bVar = new s5.b(O());
            C0865d c0865d = (C0865d) bVar.f3288e;
            c0865d.f11663d = "Copy Scenario";
            U2.a aVar2 = this.f7183y0;
            if (aVar2 != null) {
                c0865d.f11674q = aVar2.f6083e;
                c0865d.k = false;
                bVar.k(android.R.string.ok, new J1.c(2, this));
                bVar.j(null);
                return bVar.c();
            }
            o6.j.i("viewBinding");
            throw null;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.field_scenario_name)));
    }

    public final void W() {
        if (this.f7177s0 == null) {
            this.f7177s0 = new j(super.j(), this);
            this.f7178t0 = AbstractC0405a.b0(super.j());
        }
    }

    @Override // X5.b
    public final Object a() {
        if (this.f7179u0 == null) {
            synchronized (this.f7180v0) {
                try {
                    if (this.f7179u0 == null) {
                        this.f7179u0 = new V5.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f7179u0.a();
    }

    @Override // g0.AbstractComponentCallbacksC0755y, androidx.lifecycle.InterfaceC0499j
    public final b0 d() {
        return E2.d.v(this, super.d());
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final Context j() {
        if (super.j() == null && !this.f7178t0) {
            return null;
        }
        W();
        return this.f7177s0;
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void u(Activity activity) {
        boolean z8;
        this.f11093I = true;
        j jVar = this.f7177s0;
        if (jVar != null && V5.f.c(jVar) != activity) {
            z8 = false;
        } else {
            z8 = true;
        }
        E2.b.h(z8, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        W();
        if (!this.f7181w0) {
            this.f7181w0 = true;
            ((e) a()).getClass();
        }
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final void v(Context context) {
        super.v(context);
        W();
        if (!this.f7181w0) {
            this.f7181w0 = true;
            ((e) a()).getClass();
        }
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final void w(Bundle bundle) {
        super.w(bundle);
        AbstractC0166y.q(U.e(this), null, null, new c(this, null), 3);
        i iVar = (i) this.f7182x0.getValue();
        String str = (String) this.f7176B0.getValue();
        o6.j.e(str, "name");
        i0 i0Var = iVar.f7197f;
        i0Var.getClass();
        i0Var.h(null, str);
    }
}
