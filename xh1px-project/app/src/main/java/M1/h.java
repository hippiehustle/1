package M1;

import L7.AbstractC0166y;
import a.AbstractC0405a;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.U;
import androidx.lifecycle.b0;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textview.MaterialTextView;
import f.C0649a;
import g0.C0749s;
import g0.r;
import i.AbstractActivityC0870i;
import i.C0865d;
import kotlin.Metadata;
import o6.v;
import q4.X;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LM1/h;", "Lg0/r;", "<init>", "()V", "permissions_fDroidRelease"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, Z.g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h extends r implements X5.b {

    /* renamed from: s0, reason: collision with root package name */
    public V5.j f3316s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f3317t0;

    /* renamed from: u0, reason: collision with root package name */
    public volatile V5.f f3318u0;

    /* renamed from: v0, reason: collision with root package name */
    public final Object f3319v0 = new Object();

    /* renamed from: w0, reason: collision with root package name */
    public boolean f3320w0 = false;

    /* renamed from: x0, reason: collision with root package name */
    public final A4.d f3321x0;

    /* renamed from: y0, reason: collision with root package name */
    public A4.c f3322y0;

    public h() {
        Z5.g c6 = Z5.a.c(Z5.h.f7483e, new e(1, new e(0, this)));
        this.f3321x0 = new A4.d(v.f13643a.b(l.class), new f(c6, 0), new g(this, c6, 0), new f(c6, 1));
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final LayoutInflater B(Bundle bundle) {
        LayoutInflater B8 = super.B(bundle);
        return B8.cloneInContext(new V5.j(B8, this));
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void D() {
        this.f11093I = true;
        l lVar = (l) this.f3321x0.getValue();
        Context O8 = O();
        L1.b bVar = (L1.b) lVar.f3329b.f2360c.f();
        if (bVar != null && !bVar.a(O8) && (!bVar.f2756a || !bVar.b(O8))) {
            return;
        }
        S(false, false);
    }

    @Override // g0.r
    public final Dialog T() {
        View inflate = k().inflate(R.layout.dialog_permission, (ViewGroup) null, false);
        int i4 = R.id.button_deny_permission;
        MaterialButton materialButton = (MaterialButton) E2.b.r(inflate, R.id.button_deny_permission);
        if (materialButton != null) {
            i4 = R.id.button_request_permission;
            MaterialButton materialButton2 = (MaterialButton) E2.b.r(inflate, R.id.button_request_permission);
            if (materialButton2 != null) {
                i4 = R.id.desc_permission;
                MaterialTextView materialTextView = (MaterialTextView) E2.b.r(inflate, R.id.desc_permission);
                if (materialTextView != null) {
                    i4 = R.id.divider_top;
                    if (((MaterialDivider) E2.b.r(inflate, R.id.divider_top)) != null) {
                        i4 = R.id.title_permission;
                        MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(inflate, R.id.title_permission);
                        if (materialTextView2 != null) {
                            A4.c cVar = new A4.c((NestedScrollView) inflate, materialButton, materialButton2, materialTextView, materialTextView2);
                            final int i8 = 0;
                            materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: M1.a

                                /* renamed from: e, reason: collision with root package name */
                                public final /* synthetic */ h f3302e;

                                {
                                    this.f3302e = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i8) {
                                        case 0:
                                            h hVar = this.f3302e;
                                            l lVar = (l) hVar.f3321x0.getValue();
                                            AbstractActivityC0870i M8 = hVar.M();
                                            L1.b bVar = (L1.b) lVar.f3329b.f2360c.f();
                                            if (bVar != null) {
                                                if (bVar instanceof L1.e) {
                                                    int i9 = Build.VERSION.SDK_INT;
                                                    if (33 > i9 || i9 >= Integer.MAX_VALUE) {
                                                        return;
                                                    }
                                                }
                                                bVar.d(M8);
                                                M8.getSharedPreferences("permissions", 0).edit().putBoolean(bVar.getClass().getSimpleName(), true).apply();
                                                return;
                                            }
                                            return;
                                        default:
                                            this.f3302e.S(false, false);
                                            return;
                                    }
                                }
                            });
                            final int i9 = 1;
                            materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: M1.a

                                /* renamed from: e, reason: collision with root package name */
                                public final /* synthetic */ h f3302e;

                                {
                                    this.f3302e = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i9) {
                                        case 0:
                                            h hVar = this.f3302e;
                                            l lVar = (l) hVar.f3321x0.getValue();
                                            AbstractActivityC0870i M8 = hVar.M();
                                            L1.b bVar = (L1.b) lVar.f3329b.f2360c.f();
                                            if (bVar != null) {
                                                if (bVar instanceof L1.e) {
                                                    int i92 = Build.VERSION.SDK_INT;
                                                    if (33 > i92 || i92 >= Integer.MAX_VALUE) {
                                                        return;
                                                    }
                                                }
                                                bVar.d(M8);
                                                M8.getSharedPreferences("permissions", 0).edit().putBoolean(bVar.getClass().getSimpleName(), true).apply();
                                                return;
                                            }
                                            return;
                                        default:
                                            this.f3302e.S(false, false);
                                            return;
                                    }
                                }
                            });
                            this.f3322y0 = cVar;
                            s5.b bVar = new s5.b(O());
                            A4.c cVar2 = this.f3322y0;
                            if (cVar2 != null) {
                                ((C0865d) bVar.f3288e).f11674q = (NestedScrollView) cVar2.f291e;
                                return bVar.c();
                            }
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    public final void W() {
        if (this.f3316s0 == null) {
            this.f3316s0 = new V5.j(super.j(), this);
            this.f3317t0 = AbstractC0405a.b0(super.j());
        }
    }

    @Override // X5.b
    public final Object a() {
        if (this.f3318u0 == null) {
            synchronized (this.f3319v0) {
                try {
                    if (this.f3318u0 == null) {
                        this.f3318u0 = new V5.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f3318u0.a();
    }

    @Override // g0.AbstractComponentCallbacksC0755y, androidx.lifecycle.InterfaceC0499j
    public final b0 d() {
        return E2.d.v(this, super.d());
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final Context j() {
        if (super.j() == null && !this.f3317t0) {
            return null;
        }
        W();
        return this.f3316s0;
    }

    @Override // g0.r, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z8;
        o6.j.e(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        l lVar = (l) this.f3321x0.getValue();
        Context O8 = O();
        L1.b bVar = (L1.b) lVar.f3329b.f2360c.f();
        if (bVar != null) {
            z8 = bVar.a(O8);
        } else {
            z8 = false;
        }
        D2.f.I(this, ":PermissionDialog:state", X.k(new Z5.j(":PermissionDialog:state:isGranted", Boolean.valueOf(z8))));
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void u(Activity activity) {
        boolean z8;
        this.f11093I = true;
        V5.j jVar = this.f3316s0;
        if (jVar != null && V5.f.c(jVar) != activity) {
            z8 = false;
        } else {
            z8 = true;
        }
        E2.b.h(z8, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        W();
        if (!this.f3320w0) {
            this.f3320w0 = true;
            ((i) a()).getClass();
        }
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final void v(Context context) {
        super.v(context);
        W();
        if (!this.f3320w0) {
            this.f3320w0 = true;
            ((i) a()).getClass();
        }
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final void w(Bundle bundle) {
        super.w(bundle);
        l lVar = (l) this.f3321x0.getValue();
        C1.b bVar = new C1.b(4, this);
        L1.b bVar2 = (L1.b) lVar.f3329b.f2360c.f();
        if (bVar2 != null && (bVar2 instanceof L1.e)) {
            ((L1.e) bVar2).f2759b = (C0749s) K(new C0649a(1), new B1.b(1, new M7.c(bVar, 5, bVar2)));
        }
        AbstractC0166y.q(U.e(this), null, null, new d(this, null), 3);
    }
}
