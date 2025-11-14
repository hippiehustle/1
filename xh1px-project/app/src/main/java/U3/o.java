package U3;

import K3.C0091e;
import L7.AbstractC0166y;
import a6.AbstractC0437l;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import l5.DialogC1035e;
import n6.InterfaceC1163b;
import q4.X;
import z1.ViewOnFocusChangeListenerC1853a;

/* loaded from: classes.dex */
public final class o extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final C0091e f6123u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.d f6124v;

    /* renamed from: w, reason: collision with root package name */
    public F3.c f6125w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C0091e c0091e) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        o6.j.e(c0091e, "listener");
        this.f6123u = c0091e;
        this.f6124v = new A4.d(o6.v.f13643a.b(A.class), new n(this, 0), new n(this, 1), new D4.z(20, this));
    }

    public static void G(o oVar, View view) {
        o6.j.e(view, "it");
        oVar.f6123u.b();
        super.a();
    }

    public static void H(o oVar, View view) {
        long j;
        o6.j.e(view, "it");
        A J6 = oVar.J();
        f2.i iVar = (f2.i) J6.f6085b.f1950e.a();
        if (iVar != null) {
            SharedPreferences.Editor edit = J6.f6088e.edit();
            o6.j.d(edit, "edit(...)");
            Long l6 = iVar.f10723e;
            if (l6 != null) {
                j = l6.longValue();
            } else {
                j = 0;
            }
            SharedPreferences.Editor putLong = edit.putLong("Last_Pause_Duration", j);
            o6.j.d(putLong, "putLong(...)");
            putLong.apply();
        }
        oVar.f6123u.a();
        super.a();
    }

    public static void I(o oVar) {
        oVar.f6123u.c();
        super.a();
    }

    @Override // z1.b
    public final ViewGroup E() {
        final int i4 = 0;
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_action_pause, (ViewGroup) null, false);
        int i8 = R.id.edit_pause_duration_layout;
        View r8 = E2.b.r(inflate, R.id.edit_pause_duration_layout);
        if (r8 != null) {
            A.i a3 = A.i.a(r8);
            TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
            View r9 = E2.b.r(inflate, R.id.field_name);
            if (r9 != null) {
                A.i a4 = A.i.a(r9);
                TextInputEditText textInputEditText2 = (TextInputEditText) a4.f89f;
                int i9 = R.id.layout_top_bar;
                View r10 = E2.b.r(inflate, R.id.layout_top_bar);
                if (r10 != null) {
                    A4.d a9 = A4.d.a(r10);
                    i9 = R.id.time_unit_field;
                    View r11 = E2.b.r(inflate, R.id.time_unit_field);
                    if (r11 != null) {
                        A4.a f8 = A4.a.f(r11);
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        F3.c cVar = new F3.c(linearLayout, a3, a4, a9, f8, 0);
                        ((MaterialTextView) a9.f298h).setText(R.string.dialog_title_pause);
                        A((MaterialButton) a9.f297g, new InterfaceC1163b(this) { // from class: U3.a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ o f6096e;

                            {
                                this.f6096e = this;
                            }

                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj) {
                                Long l6;
                                switch (i4) {
                                    case 0:
                                        o6.j.e((View) obj, "it");
                                        this.f6096e.a();
                                        break;
                                    case 1:
                                        o.H(this.f6096e, (View) obj);
                                        break;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o.G(this.f6096e, (View) obj);
                                        break;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        Editable editable = (Editable) obj;
                                        o6.j.e(editable, "it");
                                        A J6 = this.f6096e.J();
                                        String obj2 = editable.toString();
                                        o6.j.e(obj2, "name");
                                        H3.n nVar = J6.f6085b;
                                        f2.i iVar = (f2.i) nVar.f1950e.a();
                                        if (iVar != null) {
                                            nVar.j(f2.i.i(iVar, null, null, obj2, 0, null, 27));
                                        }
                                        return Z5.y.f7506a;
                                    default:
                                        Editable editable2 = (Editable) obj;
                                        o6.j.e(editable2, "it");
                                        A J8 = this.f6096e.J();
                                        if (editable2.length() > 0) {
                                            l6 = Long.valueOf(Long.parseLong(editable2.toString()));
                                        } else {
                                            l6 = null;
                                        }
                                        H3.n nVar2 = J8.f6085b;
                                        f2.i iVar2 = (f2.i) nVar2.f1950e.a();
                                        if (iVar2 != null) {
                                            long C02 = E2.c.C0(l6, (D2.k) J8.f6092i.f());
                                            Long l8 = iVar2.f10723e;
                                            if (l8 == null || l8.longValue() != C02) {
                                                nVar2.j(f2.i.i(iVar2, null, null, null, 0, Long.valueOf(C02), 15));
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
                        A(materialButton, new InterfaceC1163b(this) { // from class: U3.a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ o f6096e;

                            {
                                this.f6096e = this;
                            }

                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj) {
                                Long l6;
                                switch (i10) {
                                    case 0:
                                        o6.j.e((View) obj, "it");
                                        this.f6096e.a();
                                        break;
                                    case 1:
                                        o.H(this.f6096e, (View) obj);
                                        break;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o.G(this.f6096e, (View) obj);
                                        break;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        Editable editable = (Editable) obj;
                                        o6.j.e(editable, "it");
                                        A J6 = this.f6096e.J();
                                        String obj2 = editable.toString();
                                        o6.j.e(obj2, "name");
                                        H3.n nVar = J6.f6085b;
                                        f2.i iVar = (f2.i) nVar.f1950e.a();
                                        if (iVar != null) {
                                            nVar.j(f2.i.i(iVar, null, null, obj2, 0, null, 27));
                                        }
                                        return Z5.y.f7506a;
                                    default:
                                        Editable editable2 = (Editable) obj;
                                        o6.j.e(editable2, "it");
                                        A J8 = this.f6096e.J();
                                        if (editable2.length() > 0) {
                                            l6 = Long.valueOf(Long.parseLong(editable2.toString()));
                                        } else {
                                            l6 = null;
                                        }
                                        H3.n nVar2 = J8.f6085b;
                                        f2.i iVar2 = (f2.i) nVar2.f1950e.a();
                                        if (iVar2 != null) {
                                            long C02 = E2.c.C0(l6, (D2.k) J8.f6092i.f());
                                            Long l8 = iVar2.f10723e;
                                            if (l8 == null || l8.longValue() != C02) {
                                                nVar2.j(f2.i.i(iVar2, null, null, null, 0, Long.valueOf(C02), 15));
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
                        A(materialButton2, new InterfaceC1163b(this) { // from class: U3.a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ o f6096e;

                            {
                                this.f6096e = this;
                            }

                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj) {
                                Long l6;
                                switch (i11) {
                                    case 0:
                                        o6.j.e((View) obj, "it");
                                        this.f6096e.a();
                                        break;
                                    case 1:
                                        o.H(this.f6096e, (View) obj);
                                        break;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o.G(this.f6096e, (View) obj);
                                        break;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        Editable editable = (Editable) obj;
                                        o6.j.e(editable, "it");
                                        A J6 = this.f6096e.J();
                                        String obj2 = editable.toString();
                                        o6.j.e(obj2, "name");
                                        H3.n nVar = J6.f6085b;
                                        f2.i iVar = (f2.i) nVar.f1950e.a();
                                        if (iVar != null) {
                                            nVar.j(f2.i.i(iVar, null, null, obj2, 0, null, 27));
                                        }
                                        return Z5.y.f7506a;
                                    default:
                                        Editable editable2 = (Editable) obj;
                                        o6.j.e(editable2, "it");
                                        A J8 = this.f6096e.J();
                                        if (editable2.length() > 0) {
                                            l6 = Long.valueOf(Long.parseLong(editable2.toString()));
                                        } else {
                                            l6 = null;
                                        }
                                        H3.n nVar2 = J8.f6085b;
                                        f2.i iVar2 = (f2.i) nVar2.f1950e.a();
                                        if (iVar2 != null) {
                                            long C02 = E2.c.C0(l6, (D2.k) J8.f6092i.f());
                                            Long l8 = iVar2.f10723e;
                                            if (l8 == null || l8.longValue() != C02) {
                                                nVar2.j(f2.i.i(iVar2, null, null, null, 0, Long.valueOf(C02), 15));
                                            }
                                        }
                                        return Z5.y.f7506a;
                                }
                                return Z5.y.f7506a;
                            }
                        });
                        ((TextInputLayout) a4.f88e).setHint(R.string.generic_name);
                        final int i12 = 3;
                        E2.c.x0(a4, new InterfaceC1163b(this) { // from class: U3.a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ o f6096e;

                            {
                                this.f6096e = this;
                            }

                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj) {
                                Long l6;
                                switch (i12) {
                                    case 0:
                                        o6.j.e((View) obj, "it");
                                        this.f6096e.a();
                                        break;
                                    case 1:
                                        o.H(this.f6096e, (View) obj);
                                        break;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o.G(this.f6096e, (View) obj);
                                        break;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        Editable editable = (Editable) obj;
                                        o6.j.e(editable, "it");
                                        A J6 = this.f6096e.J();
                                        String obj2 = editable.toString();
                                        o6.j.e(obj2, "name");
                                        H3.n nVar = J6.f6085b;
                                        f2.i iVar = (f2.i) nVar.f1950e.a();
                                        if (iVar != null) {
                                            nVar.j(f2.i.i(iVar, null, null, obj2, 0, null, 27));
                                        }
                                        return Z5.y.f7506a;
                                    default:
                                        Editable editable2 = (Editable) obj;
                                        o6.j.e(editable2, "it");
                                        A J8 = this.f6096e.J();
                                        if (editable2.length() > 0) {
                                            l6 = Long.valueOf(Long.parseLong(editable2.toString()));
                                        } else {
                                            l6 = null;
                                        }
                                        H3.n nVar2 = J8.f6085b;
                                        f2.i iVar2 = (f2.i) nVar2.f1950e.a();
                                        if (iVar2 != null) {
                                            long C02 = E2.c.C0(l6, (D2.k) J8.f6092i.f());
                                            Long l8 = iVar2.f10723e;
                                            if (l8 == null || l8.longValue() != C02) {
                                                nVar2.j(f2.i.i(iVar2, null, null, null, 0, Long.valueOf(C02), 15));
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
                        ((TextInputLayout) a3.f88e).setHint(R.string.input_field_label_pause_duration);
                        final int i13 = 4;
                        E2.c.x0(a3, new InterfaceC1163b(this) { // from class: U3.a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ o f6096e;

                            {
                                this.f6096e = this;
                            }

                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj) {
                                Long l6;
                                switch (i13) {
                                    case 0:
                                        o6.j.e((View) obj, "it");
                                        this.f6096e.a();
                                        break;
                                    case 1:
                                        o.H(this.f6096e, (View) obj);
                                        break;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o.G(this.f6096e, (View) obj);
                                        break;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        Editable editable = (Editable) obj;
                                        o6.j.e(editable, "it");
                                        A J6 = this.f6096e.J();
                                        String obj2 = editable.toString();
                                        o6.j.e(obj2, "name");
                                        H3.n nVar = J6.f6085b;
                                        f2.i iVar = (f2.i) nVar.f1950e.a();
                                        if (iVar != null) {
                                            nVar.j(f2.i.i(iVar, null, null, obj2, 0, null, 27));
                                        }
                                        return Z5.y.f7506a;
                                    default:
                                        Editable editable2 = (Editable) obj;
                                        o6.j.e(editable2, "it");
                                        A J8 = this.f6096e.J();
                                        if (editable2.length() > 0) {
                                            l6 = Long.valueOf(Long.parseLong(editable2.toString()));
                                        } else {
                                            l6 = null;
                                        }
                                        H3.n nVar2 = J8.f6085b;
                                        f2.i iVar2 = (f2.i) nVar2.f1950e.a();
                                        if (iVar2 != null) {
                                            long C02 = E2.c.C0(l6, (D2.k) J8.f6092i.f());
                                            Long l8 = iVar2.f10723e;
                                            if (l8 == null || l8.longValue() != C02) {
                                                nVar2.j(f2.i.i(iVar2, null, null, null, 0, Long.valueOf(C02), 15));
                                            }
                                        }
                                        return Z5.y.f7506a;
                                }
                                return Z5.y.f7506a;
                            }
                        });
                        textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, this));
                        D2.f.J(f8, AbstractC0437l.X(D2.h.f878c, D2.j.f880c, D2.i.f879c, D2.g.f877c), new A1.e(1, J(), A.class, "setTimeUnit", "setTimeUnit(Lcom/buzbuz/smartautoclicker/core/ui/bindings/dropdown/TimeUnitDropDownItem;)V", 0, 0, 25), k().getString(R.string.dropdown_label_time_unit), 120);
                        this.f6125w = cVar;
                        o6.j.d(linearLayout, "getRoot(...)");
                        return linearLayout;
                    }
                }
                i8 = i9;
            } else {
                i8 = R.id.field_name;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(U.e(this), null, null, new e(this, null), 3);
        AbstractC0166y.q(U.e(this), null, null, new m(this, null), 3);
    }

    public final A J() {
        return (A) this.f6124v.getValue();
    }

    @Override // w1.e
    public final void a() {
        if (((Boolean) J().f6087d.f4088d.f()).booleanValue()) {
            X.Y(k(), R.string.warning_dialog_message_close_without_saving, new B0.e(10, this));
        } else {
            this.f6123u.c();
            super.a();
        }
    }
}
