package p4;

import L7.AbstractC0166y;
import a6.AbstractC0437l;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import j3.C0933s;
import l4.C1030j;
import l5.DialogC1035e;
import n6.InterfaceC1163b;
import q4.X;
import z1.ViewOnFocusChangeListenerC1853a;

/* loaded from: classes.dex */
public final class p extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final C1030j f13770u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.d f13771v;

    /* renamed from: w, reason: collision with root package name */
    public F3.a f13772w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C1030j c1030j) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        o6.j.e(c1030j, "listener");
        this.f13770u = c1030j;
        this.f13771v = new A4.d(o6.v.f13643a.b(B.class), new o(this, 0), new o(this, 1), new C0933s(14, this));
    }

    public static void G(p pVar, View view) {
        o6.j.e(view, "it");
        pVar.f13770u.a();
        super.a();
    }

    public static void H(p pVar) {
        pVar.f13770u.c();
        super.a();
    }

    public static void I(p pVar, View view) {
        o6.j.e(view, "it");
        pVar.f13770u.b();
        super.a();
    }

    @Override // z1.b
    public final ViewGroup E() {
        final int i4 = 0;
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_condition_timer, (ViewGroup) null, false);
        int i8 = R.id.card_is_reset;
        if (((MaterialCardView) E2.b.r(inflate, R.id.card_is_reset)) != null) {
            i8 = R.id.edit_duration_layout;
            View r8 = E2.b.r(inflate, R.id.edit_duration_layout);
            if (r8 != null) {
                A.i a3 = A.i.a(r8);
                TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
                View r9 = E2.b.r(inflate, R.id.field_is_reset);
                if (r9 != null) {
                    A4.c e9 = A4.c.e(r9);
                    A4.c cVar = (A4.c) e9.f292f;
                    int i9 = R.id.field_name;
                    View r10 = E2.b.r(inflate, R.id.field_name);
                    if (r10 != null) {
                        A.i a4 = A.i.a(r10);
                        TextInputEditText textInputEditText2 = (TextInputEditText) a4.f89f;
                        i9 = R.id.layout_top_bar;
                        View r11 = E2.b.r(inflate, R.id.layout_top_bar);
                        if (r11 != null) {
                            A4.d a9 = A4.d.a(r11);
                            i9 = R.id.time_unit_field;
                            View r12 = E2.b.r(inflate, R.id.time_unit_field);
                            if (r12 != null) {
                                A4.a f8 = A4.a.f(r12);
                                LinearLayout linearLayout = (LinearLayout) inflate;
                                F3.a aVar = new F3.a(linearLayout, a3, e9, a4, a9, f8);
                                ((MaterialTextView) a9.f298h).setText(R.string.dialog_title_timer_reached);
                                A((MaterialButton) a9.f297g, new InterfaceC1163b(this) { // from class: p4.a

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ p f13741e;

                                    {
                                        this.f13741e = this;
                                    }

                                    @Override // n6.InterfaceC1163b
                                    public final Object m(Object obj) {
                                        Long l6;
                                        switch (i4) {
                                            case 0:
                                                o6.j.e((View) obj, "it");
                                                this.f13741e.a();
                                                break;
                                            case 1:
                                                p.G(this.f13741e, (View) obj);
                                                break;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                p.I(this.f13741e, (View) obj);
                                                break;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                Editable editable = (Editable) obj;
                                                o6.j.e(editable, "it");
                                                B J6 = this.f13741e.J();
                                                String obj2 = editable.toString();
                                                o6.j.e(obj2, "name");
                                                H3.n nVar = J6.f13730b;
                                                j2.f fVar = (j2.f) nVar.f1950e.b();
                                                if (fVar != null) {
                                                    nVar.k(j2.f.i(fVar, null, null, obj2, 0L, false, 27));
                                                }
                                                return Z5.y.f7506a;
                                            default:
                                                Editable editable2 = (Editable) obj;
                                                o6.j.e(editable2, "it");
                                                B J8 = this.f13741e.J();
                                                j2.f fVar2 = null;
                                                if (editable2.length() > 0) {
                                                    l6 = Long.valueOf(Long.parseLong(editable2.toString()));
                                                } else {
                                                    l6 = null;
                                                }
                                                H3.n nVar2 = J8.f13730b;
                                                j2.f fVar3 = (j2.f) nVar2.f1950e.b();
                                                if (fVar3 != null) {
                                                    long C02 = E2.c.C0(l6, (D2.k) J8.f13736h.f());
                                                    if (fVar3.f11817d != C02) {
                                                        fVar2 = j2.f.i(fVar3, null, null, null, C02, false, 23);
                                                    }
                                                    if (fVar2 != null) {
                                                        nVar2.k(fVar2);
                                                    }
                                                }
                                                return Z5.y.f7506a;
                                        }
                                        return Z5.y.f7506a;
                                    }
                                });
                                MaterialButton materialButton = (MaterialButton) a9.f299i;
                                materialButton.setVisibility(0);
                                final int i10 = 1;
                                A(materialButton, new InterfaceC1163b(this) { // from class: p4.a

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ p f13741e;

                                    {
                                        this.f13741e = this;
                                    }

                                    @Override // n6.InterfaceC1163b
                                    public final Object m(Object obj) {
                                        Long l6;
                                        switch (i10) {
                                            case 0:
                                                o6.j.e((View) obj, "it");
                                                this.f13741e.a();
                                                break;
                                            case 1:
                                                p.G(this.f13741e, (View) obj);
                                                break;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                p.I(this.f13741e, (View) obj);
                                                break;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                Editable editable = (Editable) obj;
                                                o6.j.e(editable, "it");
                                                B J6 = this.f13741e.J();
                                                String obj2 = editable.toString();
                                                o6.j.e(obj2, "name");
                                                H3.n nVar = J6.f13730b;
                                                j2.f fVar = (j2.f) nVar.f1950e.b();
                                                if (fVar != null) {
                                                    nVar.k(j2.f.i(fVar, null, null, obj2, 0L, false, 27));
                                                }
                                                return Z5.y.f7506a;
                                            default:
                                                Editable editable2 = (Editable) obj;
                                                o6.j.e(editable2, "it");
                                                B J8 = this.f13741e.J();
                                                j2.f fVar2 = null;
                                                if (editable2.length() > 0) {
                                                    l6 = Long.valueOf(Long.parseLong(editable2.toString()));
                                                } else {
                                                    l6 = null;
                                                }
                                                H3.n nVar2 = J8.f13730b;
                                                j2.f fVar3 = (j2.f) nVar2.f1950e.b();
                                                if (fVar3 != null) {
                                                    long C02 = E2.c.C0(l6, (D2.k) J8.f13736h.f());
                                                    if (fVar3.f11817d != C02) {
                                                        fVar2 = j2.f.i(fVar3, null, null, null, C02, false, 23);
                                                    }
                                                    if (fVar2 != null) {
                                                        nVar2.k(fVar2);
                                                    }
                                                }
                                                return Z5.y.f7506a;
                                        }
                                        return Z5.y.f7506a;
                                    }
                                });
                                MaterialButton materialButton2 = (MaterialButton) a9.f296f;
                                materialButton2.setVisibility(0);
                                final int i11 = 2;
                                A(materialButton2, new InterfaceC1163b(this) { // from class: p4.a

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ p f13741e;

                                    {
                                        this.f13741e = this;
                                    }

                                    @Override // n6.InterfaceC1163b
                                    public final Object m(Object obj) {
                                        Long l6;
                                        switch (i11) {
                                            case 0:
                                                o6.j.e((View) obj, "it");
                                                this.f13741e.a();
                                                break;
                                            case 1:
                                                p.G(this.f13741e, (View) obj);
                                                break;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                p.I(this.f13741e, (View) obj);
                                                break;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                Editable editable = (Editable) obj;
                                                o6.j.e(editable, "it");
                                                B J6 = this.f13741e.J();
                                                String obj2 = editable.toString();
                                                o6.j.e(obj2, "name");
                                                H3.n nVar = J6.f13730b;
                                                j2.f fVar = (j2.f) nVar.f1950e.b();
                                                if (fVar != null) {
                                                    nVar.k(j2.f.i(fVar, null, null, obj2, 0L, false, 27));
                                                }
                                                return Z5.y.f7506a;
                                            default:
                                                Editable editable2 = (Editable) obj;
                                                o6.j.e(editable2, "it");
                                                B J8 = this.f13741e.J();
                                                j2.f fVar2 = null;
                                                if (editable2.length() > 0) {
                                                    l6 = Long.valueOf(Long.parseLong(editable2.toString()));
                                                } else {
                                                    l6 = null;
                                                }
                                                H3.n nVar2 = J8.f13730b;
                                                j2.f fVar3 = (j2.f) nVar2.f1950e.b();
                                                if (fVar3 != null) {
                                                    long C02 = E2.c.C0(l6, (D2.k) J8.f13736h.f());
                                                    if (fVar3.f11817d != C02) {
                                                        fVar2 = j2.f.i(fVar3, null, null, null, C02, false, 23);
                                                    }
                                                    if (fVar2 != null) {
                                                        nVar2.k(fVar2);
                                                    }
                                                }
                                                return Z5.y.f7506a;
                                        }
                                        return Z5.y.f7506a;
                                    }
                                });
                                ((TextInputLayout) a4.f88e).setHint(R.string.generic_name);
                                final int i12 = 3;
                                E2.c.x0(a4, new InterfaceC1163b(this) { // from class: p4.a

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ p f13741e;

                                    {
                                        this.f13741e = this;
                                    }

                                    @Override // n6.InterfaceC1163b
                                    public final Object m(Object obj) {
                                        Long l6;
                                        switch (i12) {
                                            case 0:
                                                o6.j.e((View) obj, "it");
                                                this.f13741e.a();
                                                break;
                                            case 1:
                                                p.G(this.f13741e, (View) obj);
                                                break;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                p.I(this.f13741e, (View) obj);
                                                break;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                Editable editable = (Editable) obj;
                                                o6.j.e(editable, "it");
                                                B J6 = this.f13741e.J();
                                                String obj2 = editable.toString();
                                                o6.j.e(obj2, "name");
                                                H3.n nVar = J6.f13730b;
                                                j2.f fVar = (j2.f) nVar.f1950e.b();
                                                if (fVar != null) {
                                                    nVar.k(j2.f.i(fVar, null, null, obj2, 0L, false, 27));
                                                }
                                                return Z5.y.f7506a;
                                            default:
                                                Editable editable2 = (Editable) obj;
                                                o6.j.e(editable2, "it");
                                                B J8 = this.f13741e.J();
                                                j2.f fVar2 = null;
                                                if (editable2.length() > 0) {
                                                    l6 = Long.valueOf(Long.parseLong(editable2.toString()));
                                                } else {
                                                    l6 = null;
                                                }
                                                H3.n nVar2 = J8.f13730b;
                                                j2.f fVar3 = (j2.f) nVar2.f1950e.b();
                                                if (fVar3 != null) {
                                                    long C02 = E2.c.C0(l6, (D2.k) J8.f13736h.f());
                                                    if (fVar3.f11817d != C02) {
                                                        fVar2 = j2.f.i(fVar3, null, null, null, C02, false, 23);
                                                    }
                                                    if (fVar2 != null) {
                                                        nVar2.k(fVar2);
                                                    }
                                                }
                                                return Z5.y.f7506a;
                                        }
                                        return Z5.y.f7506a;
                                    }
                                });
                                textInputEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                                textInputEditText2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText2, this));
                                textInputEditText.setFilters(new K2.i[]{new K2.i()});
                                ((TextInputLayout) a3.f88e).setHint(R.string.input_field_label_timer_duration_no_unit);
                                final int i13 = 4;
                                E2.c.x0(a3, new InterfaceC1163b(this) { // from class: p4.a

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ p f13741e;

                                    {
                                        this.f13741e = this;
                                    }

                                    @Override // n6.InterfaceC1163b
                                    public final Object m(Object obj) {
                                        Long l6;
                                        switch (i13) {
                                            case 0:
                                                o6.j.e((View) obj, "it");
                                                this.f13741e.a();
                                                break;
                                            case 1:
                                                p.G(this.f13741e, (View) obj);
                                                break;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                p.I(this.f13741e, (View) obj);
                                                break;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                Editable editable = (Editable) obj;
                                                o6.j.e(editable, "it");
                                                B J6 = this.f13741e.J();
                                                String obj2 = editable.toString();
                                                o6.j.e(obj2, "name");
                                                H3.n nVar = J6.f13730b;
                                                j2.f fVar = (j2.f) nVar.f1950e.b();
                                                if (fVar != null) {
                                                    nVar.k(j2.f.i(fVar, null, null, obj2, 0L, false, 27));
                                                }
                                                return Z5.y.f7506a;
                                            default:
                                                Editable editable2 = (Editable) obj;
                                                o6.j.e(editable2, "it");
                                                B J8 = this.f13741e.J();
                                                j2.f fVar2 = null;
                                                if (editable2.length() > 0) {
                                                    l6 = Long.valueOf(Long.parseLong(editable2.toString()));
                                                } else {
                                                    l6 = null;
                                                }
                                                H3.n nVar2 = J8.f13730b;
                                                j2.f fVar3 = (j2.f) nVar2.f1950e.b();
                                                if (fVar3 != null) {
                                                    long C02 = E2.c.C0(l6, (D2.k) J8.f13736h.f());
                                                    if (fVar3.f11817d != C02) {
                                                        fVar2 = j2.f.i(fVar3, null, null, null, C02, false, 23);
                                                    }
                                                    if (fVar2 != null) {
                                                        nVar2.k(fVar2);
                                                    }
                                                }
                                                return Z5.y.f7506a;
                                        }
                                        return Z5.y.f7506a;
                                    }
                                });
                                textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, this));
                                D2.f.J(f8, AbstractC0437l.X(D2.h.f878c, D2.j.f880c, D2.i.f879c, D2.g.f877c), new W4.i(1, J(), B.class, "setTimeUnit", "setTimeUnit(Lcom/buzbuz/smartautoclicker/core/ui/bindings/dropdown/TimeUnitDropDownItem;)V", 0, 0, 19), k().getString(R.string.dropdown_label_time_unit), 120);
                                String string = k().getString(R.string.field_timer_restart_title);
                                o6.j.d(string, "getString(...)");
                                X.W(cVar, string);
                                X.X(cVar, AbstractC0437l.X(k().getString(R.string.field_timer_restart_desc_off), k().getString(R.string.field_timer_restart_desc_on)));
                                E2.b.J(e9, new J3.s(0, J(), B.class, "toggleRestartWhenReached", "toggleRestartWhenReached()V", 0, 0, 19));
                                this.f13772w = aVar;
                                o6.j.d(linearLayout, "getRoot(...)");
                                return linearLayout;
                            }
                        }
                    }
                    i8 = i9;
                } else {
                    i8 = R.id.field_is_reset;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(U.e(this), null, null, new e(this, null), 3);
        AbstractC0166y.q(U.e(this), null, null, new n(this, null), 3);
    }

    public final B J() {
        return (B) this.f13771v.getValue();
    }

    @Override // w1.e
    public final void a() {
        if (((Boolean) J().f13732d.f4088d.f()).booleanValue()) {
            X.Y(k(), R.string.warning_dialog_message_close_without_saving, new B0.e(25, this));
        } else {
            this.f13770u.c();
            super.a();
        }
    }
}
