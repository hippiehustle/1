package c3;

import L7.AbstractC0166y;
import O7.i0;
import Z5.n;
import a.AbstractC0405a;
import a6.AbstractC0434i;
import a6.s;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.U;
import androidx.lifecycle.b0;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import f.C0649a;
import g0.C0749s;
import g0.r;
import i.C0865d;
import i.DialogInterfaceC0869h;
import kotlin.Metadata;
import n6.InterfaceC1162a;
import o6.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc3/e;", "Lg0/r;", "<init>", "()V", "backup_fDroidRelease"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, Z.g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* renamed from: c3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573e extends r implements X5.b {

    /* renamed from: A0, reason: collision with root package name */
    public final n f9617A0;

    /* renamed from: B0, reason: collision with root package name */
    public final n f9618B0;

    /* renamed from: C0, reason: collision with root package name */
    public final n f9619C0;

    /* renamed from: s0, reason: collision with root package name */
    public V5.j f9620s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f9621t0;

    /* renamed from: u0, reason: collision with root package name */
    public volatile V5.f f9622u0;

    /* renamed from: v0, reason: collision with root package name */
    public final Object f9623v0 = new Object();

    /* renamed from: w0, reason: collision with root package name */
    public boolean f9624w0 = false;

    /* renamed from: x0, reason: collision with root package name */
    public final A4.d f9625x0;

    /* renamed from: y0, reason: collision with root package name */
    public F3.a f9626y0;

    /* renamed from: z0, reason: collision with root package name */
    public C0749s f9627z0;

    public C0573e() {
        Z5.g c6 = Z5.a.c(Z5.h.f7483e, new M1.e(17, new M1.e(16, this)));
        this.f9625x0 = new A4.d(v.f13643a.b(j.class), new M1.f(c6, 14), new M1.g(this, c6, 7), new M1.f(c6, 15));
        final int i4 = 0;
        this.f9617A0 = new n(new InterfaceC1162a(this) { // from class: c3.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C0573e f9611e;

            {
                this.f9611e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                boolean z8;
                long[] longArray;
                long[] longArray2;
                switch (i4) {
                    case 0:
                        Bundle bundle = this.f9611e.f11115i;
                        if (bundle != null) {
                            z8 = bundle.getBoolean(":backup:fragment_args_key_is_import");
                        } else {
                            z8 = false;
                        }
                        return Boolean.valueOf(z8);
                    case 1:
                        Bundle bundle2 = this.f9611e.f11115i;
                        if (bundle2 != null && (longArray = bundle2.getLongArray(":backup:fragment_args_key_scenario_list")) != null) {
                            return AbstractC0434i.h1(longArray);
                        }
                        return s.f7766d;
                    default:
                        Bundle bundle3 = this.f9611e.f11115i;
                        if (bundle3 != null && (longArray2 = bundle3.getLongArray(":backup:fragment_args_key_dumb_scenario_list")) != null) {
                            return AbstractC0434i.h1(longArray2);
                        }
                        return s.f7766d;
                }
            }
        });
        final int i8 = 1;
        this.f9618B0 = new n(new InterfaceC1162a(this) { // from class: c3.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C0573e f9611e;

            {
                this.f9611e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                boolean z8;
                long[] longArray;
                long[] longArray2;
                switch (i8) {
                    case 0:
                        Bundle bundle = this.f9611e.f11115i;
                        if (bundle != null) {
                            z8 = bundle.getBoolean(":backup:fragment_args_key_is_import");
                        } else {
                            z8 = false;
                        }
                        return Boolean.valueOf(z8);
                    case 1:
                        Bundle bundle2 = this.f9611e.f11115i;
                        if (bundle2 != null && (longArray = bundle2.getLongArray(":backup:fragment_args_key_scenario_list")) != null) {
                            return AbstractC0434i.h1(longArray);
                        }
                        return s.f7766d;
                    default:
                        Bundle bundle3 = this.f9611e.f11115i;
                        if (bundle3 != null && (longArray2 = bundle3.getLongArray(":backup:fragment_args_key_dumb_scenario_list")) != null) {
                            return AbstractC0434i.h1(longArray2);
                        }
                        return s.f7766d;
                }
            }
        });
        final int i9 = 2;
        this.f9619C0 = new n(new InterfaceC1162a(this) { // from class: c3.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C0573e f9611e;

            {
                this.f9611e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                boolean z8;
                long[] longArray;
                long[] longArray2;
                switch (i9) {
                    case 0:
                        Bundle bundle = this.f9611e.f11115i;
                        if (bundle != null) {
                            z8 = bundle.getBoolean(":backup:fragment_args_key_is_import");
                        } else {
                            z8 = false;
                        }
                        return Boolean.valueOf(z8);
                    case 1:
                        Bundle bundle2 = this.f9611e.f11115i;
                        if (bundle2 != null && (longArray = bundle2.getLongArray(":backup:fragment_args_key_scenario_list")) != null) {
                            return AbstractC0434i.h1(longArray);
                        }
                        return s.f7766d;
                    default:
                        Bundle bundle3 = this.f9611e.f11115i;
                        if (bundle3 != null && (longArray2 = bundle3.getLongArray(":backup:fragment_args_key_dumb_scenario_list")) != null) {
                            return AbstractC0434i.h1(longArray2);
                        }
                        return s.f7766d;
                }
            }
        });
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final LayoutInflater B(Bundle bundle) {
        LayoutInflater B8 = super.B(bundle);
        return B8.cloneInContext(new V5.j(B8, this));
    }

    @Override // g0.r
    public final Dialog T() {
        int i4;
        View inflate = k().inflate(R.layout.dialog_backup, (ViewGroup) null, false);
        int i8 = R.id.icon_status;
        ImageView imageView = (ImageView) E2.b.r(inflate, R.id.icon_status);
        if (imageView != null) {
            i8 = R.id.layout_compat_warning;
            LinearLayout linearLayout = (LinearLayout) E2.b.r(inflate, R.id.layout_compat_warning);
            if (linearLayout != null) {
                i8 = R.id.loading;
                ProgressBar progressBar = (ProgressBar) E2.b.r(inflate, R.id.loading);
                if (progressBar != null) {
                    i8 = R.id.text_file_selection;
                    MaterialButton materialButton = (MaterialButton) E2.b.r(inflate, R.id.text_file_selection);
                    if (materialButton != null) {
                        i8 = R.id.text_status;
                        TextView textView = (TextView) E2.b.r(inflate, R.id.text_status);
                        if (textView != null) {
                            this.f9626y0 = new F3.a((NestedScrollView) inflate, imageView, linearLayout, progressBar, materialButton, textView, 7);
                            s5.b bVar = new s5.b(O());
                            if (Y()) {
                                i4 = R.string.dialog_title_import_backup;
                            } else {
                                i4 = R.string.dialog_title_create_backup;
                            }
                            bVar.l(i4);
                            F3.a aVar = this.f9626y0;
                            if (aVar != null) {
                                NestedScrollView nestedScrollView = (NestedScrollView) aVar.f1304e;
                                C0865d c0865d = (C0865d) bVar.f3288e;
                                c0865d.f11674q = nestedScrollView;
                                c0865d.k = false;
                                bVar.k(android.R.string.ok, null);
                                bVar.j(null);
                                DialogInterfaceC0869h c6 = bVar.c();
                                c6.setOnShowListener(new DialogInterface.OnShowListener() { // from class: c3.b
                                    @Override // android.content.DialogInterface.OnShowListener
                                    public final void onShow(DialogInterface dialogInterface) {
                                        C0573e c0573e = C0573e.this;
                                        g gVar = (g) c0573e.W().f9648e.f();
                                        if (gVar != null) {
                                            c0573e.Z(gVar);
                                        }
                                    }
                                });
                                return c6;
                            }
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    public final j W() {
        return (j) this.f9625x0.getValue();
    }

    public final void X() {
        if (this.f9620s0 == null) {
            this.f9620s0 = new V5.j(super.j(), this);
            this.f9621t0 = AbstractC0405a.b0(super.j());
        }
    }

    public final boolean Y() {
        return ((Boolean) this.f9617A0.getValue()).booleanValue();
    }

    public final void Z(g gVar) {
        F3.a aVar = this.f9626y0;
        if (aVar != null) {
            MaterialButton materialButton = (MaterialButton) aVar.f1305f;
            materialButton.setVisibility(gVar.f9628a);
            materialButton.setText(gVar.f9635h);
            materialButton.setOnClickListener(new D2.a(this, 12, materialButton));
            ((ProgressBar) aVar.f1308i).setVisibility(gVar.f9629b);
            TextView textView = (TextView) aVar.j;
            textView.setVisibility(gVar.f9630c);
            textView.setText(gVar.f9636i);
            ((LinearLayout) aVar.f1307h).setVisibility(gVar.f9631d);
            ImageView imageView = (ImageView) aVar.f1306g;
            imageView.setVisibility(gVar.f9632e);
            Integer num = gVar.j;
            if (num != null) {
                imageView.setImageResource(num.intValue());
            }
            Integer num2 = gVar.k;
            if (num2 != null) {
                imageView.getDrawable().setTint(num2.intValue());
            }
            boolean z8 = gVar.f9633f;
            boolean z9 = gVar.f9634g;
            Dialog dialog = this.f11062n0;
            if (dialog != null) {
                DialogInterfaceC0869h dialogInterfaceC0869h = (DialogInterfaceC0869h) dialog;
                dialogInterfaceC0869h.f(-1).setEnabled(z8);
                dialogInterfaceC0869h.f(-2).setEnabled(z9);
                return;
            }
            return;
        }
        o6.j.i("viewBinding");
        throw null;
    }

    @Override // X5.b
    public final Object a() {
        if (this.f9622u0 == null) {
            synchronized (this.f9623v0) {
                try {
                    if (this.f9622u0 == null) {
                        this.f9622u0 = new V5.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f9622u0.a();
    }

    @Override // g0.AbstractComponentCallbacksC0755y, androidx.lifecycle.InterfaceC0499j
    public final b0 d() {
        return E2.d.v(this, super.d());
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final Context j() {
        if (super.j() == null && !this.f9621t0) {
            return null;
        }
        X();
        return this.f9620s0;
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void u(Activity activity) {
        boolean z8;
        this.f11093I = true;
        V5.j jVar = this.f9620s0;
        if (jVar != null && V5.f.c(jVar) != activity) {
            z8 = false;
        } else {
            z8 = true;
        }
        E2.b.h(z8, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        X();
        if (!this.f9624w0) {
            this.f9624w0 = true;
            ((f) a()).getClass();
        }
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final void v(Context context) {
        super.v(context);
        X();
        if (!this.f9624w0) {
            this.f9624w0 = true;
            ((f) a()).getClass();
        }
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final void w(Bundle bundle) {
        super.w(bundle);
        j W7 = W();
        Context O8 = O();
        boolean Y = Y();
        i0 i0Var = W7.f9647d;
        g f8 = j.f(O8, Y);
        i0Var.getClass();
        i0Var.h(null, f8);
        this.f9627z0 = (C0749s) K(new C0649a(2), new B1.b(7, this));
        AbstractC0166y.q(U.e(this), null, null, new C0572d(this, null), 3);
    }
}
