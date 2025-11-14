package o4;

import L7.AbstractC0166y;
import a6.AbstractC0437l;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import e2.AbstractC0640c;
import e2.C0638a;
import e2.C0639b;
import j3.C0933s;
import l4.C1030j;
import l5.DialogC1035e;
import n6.InterfaceC1163b;
import q4.X;
import z1.ViewOnFocusChangeListenerC1853a;

/* loaded from: classes.dex */
public final class t extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final C1030j f13595u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.d f13596v;

    /* renamed from: w, reason: collision with root package name */
    public F3.b f13597w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C1030j c1030j) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        o6.j.e(c1030j, "listener");
        this.f13595u = c1030j;
        this.f13596v = new A4.d(o6.v.f13643a.b(O.class), new s(this, 0), new s(this, 1), new C0933s(12, this));
    }

    public static void G(t tVar, View view) {
        o6.j.e(view, "it");
        tVar.f13595u.b();
        super.a();
    }

    public static void H(t tVar) {
        tVar.f13595u.c();
        super.a();
    }

    public static void I(t tVar, View view) {
        o6.j.e(view, "it");
        tVar.f13595u.a();
        super.a();
    }

    @Override // z1.b
    public final ViewGroup E() {
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_condition_counter, (ViewGroup) null, false);
        int i4 = R.id.comparison_operator_field;
        View r8 = E2.b.r(inflate, R.id.comparison_operator_field);
        if (r8 != null) {
            A4.a f8 = A4.a.f(r8);
            i4 = R.id.counter_operand_layout;
            if (((FrameLayout) E2.b.r(inflate, R.id.counter_operand_layout)) != null) {
                i4 = R.id.edit_counter_name_layout;
                View r9 = E2.b.r(inflate, R.id.edit_counter_name_layout);
                if (r9 != null) {
                    A4.a e9 = A4.a.e(r9);
                    TextInputEditText textInputEditText = (TextInputEditText) e9.f283h;
                    View r10 = E2.b.r(inflate, R.id.edit_value_counter_name);
                    if (r10 != null) {
                        A4.a e10 = A4.a.e(r10);
                        TextInputEditText textInputEditText2 = (TextInputEditText) e10.f283h;
                        int i8 = R.id.edit_value_layout;
                        View r11 = E2.b.r(inflate, R.id.edit_value_layout);
                        if (r11 != null) {
                            A.i a3 = A.i.a(r11);
                            TextInputEditText textInputEditText3 = (TextInputEditText) a3.f89f;
                            i8 = R.id.field_name;
                            View r12 = E2.b.r(inflate, R.id.field_name);
                            if (r12 != null) {
                                A.i a4 = A.i.a(r12);
                                TextInputEditText textInputEditText4 = (TextInputEditText) a4.f89f;
                                i8 = R.id.layout_top_bar;
                                View r13 = E2.b.r(inflate, R.id.layout_top_bar);
                                if (r13 != null) {
                                    A4.d a9 = A4.d.a(r13);
                                    i8 = R.id.value_type_multi_state_button;
                                    View r14 = E2.b.r(inflate, R.id.value_type_multi_state_button);
                                    if (r14 != null) {
                                        A4.a d2 = A4.a.d(r14);
                                        LinearLayout linearLayout = (LinearLayout) inflate;
                                        final F3.b bVar = new F3.b(linearLayout, f8, e9, e10, a3, a4, a9, d2);
                                        ((MaterialTextView) a9.f298h).setText(R.string.dialog_title_counter_reached);
                                        A((MaterialButton) a9.f297g, new C1265b(this, 1));
                                        MaterialButton materialButton = (MaterialButton) a9.f299i;
                                        materialButton.setVisibility(0);
                                        int i9 = 2;
                                        A(materialButton, new C1265b(this, i9));
                                        MaterialButton materialButton2 = (MaterialButton) a9.f296f;
                                        materialButton2.setVisibility(0);
                                        A(materialButton2, new C1265b(this, 3));
                                        ((TextInputLayout) a4.f88e).setHint(R.string.generic_name);
                                        E2.c.x0(a4, new C1265b(this, 4));
                                        textInputEditText4.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                                        textInputEditText4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText4, this));
                                        E2.d.P(e9, R.string.field_counter_name_label, R.drawable.ic_search, false);
                                        E2.d.N(e9, new C1265b(this, 5));
                                        textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                                        E2.d.M(e9, new C1264a(this, i9));
                                        textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, this));
                                        D2.f.J(f8, J().f13553q, new W4.i(1, J(), O.class, "setComparisonOperator", "setComparisonOperator(Lcom/buzbuz/smartautoclicker/core/ui/bindings/dropdown/DropdownItem;)V", 0, 0, 18), k().getString(R.string.dropdown_comparison_operator_label), 120);
                                        E2.c.B0(d2, new B2.e(AbstractC0437l.X(Integer.valueOf(R.drawable.ic_numbers), Integer.valueOf(R.drawable.ic_change_counter)), true));
                                        final int i10 = 0;
                                        E2.c.v0(d2, new InterfaceC1163b(this) { // from class: o4.c

                                            /* renamed from: e, reason: collision with root package name */
                                            public final /* synthetic */ t f13561e;

                                            {
                                                this.f13561e = this;
                                            }

                                            @Override // n6.InterfaceC1163b
                                            public final Object m(Object obj) {
                                                AbstractC0640c c0638a;
                                                String str;
                                                int i11;
                                                int i12;
                                                switch (i10) {
                                                    case 0:
                                                        F3.b bVar2 = bVar;
                                                        A4.a aVar = bVar2.f1313h;
                                                        A.i iVar = bVar2.f1314i;
                                                        Integer num = (Integer) obj;
                                                        O J6 = this.f13561e.J();
                                                        if (num != null && num.intValue() == 0) {
                                                            Editable text = ((TextInputEditText) iVar.f89f).getText();
                                                            if (text != null && text.length() != 0) {
                                                                i11 = Integer.parseInt(String.valueOf(((TextInputEditText) iVar.f89f).getText()));
                                                            } else {
                                                                i11 = 0;
                                                            }
                                                            c0638a = new C0639b(i11);
                                                        } else {
                                                            Editable text2 = ((TextInputEditText) aVar.f283h).getText();
                                                            if (text2 != null && text2.length() != 0) {
                                                                str = String.valueOf(((TextInputEditText) aVar.f283h).getText());
                                                            } else {
                                                                str = "";
                                                            }
                                                            c0638a = new C0638a(str);
                                                        }
                                                        J6.f(c0638a);
                                                        break;
                                                    default:
                                                        o6.j.e((Editable) obj, "it");
                                                        O J8 = this.f13561e.J();
                                                        A.i iVar2 = bVar.f1314i;
                                                        Editable text3 = ((TextInputEditText) iVar2.f89f).getText();
                                                        if (text3 != null && text3.length() != 0) {
                                                            i12 = Integer.parseInt(String.valueOf(((TextInputEditText) iVar2.f89f).getText()));
                                                        } else {
                                                            i12 = 0;
                                                        }
                                                        J8.f(new C0639b(i12));
                                                        break;
                                                }
                                                return Z5.y.f7506a;
                                            }
                                        });
                                        textInputEditText3.setFilters(new K2.i[]{new K2.i(0, Integer.MAX_VALUE)});
                                        ((TextInputLayout) a3.f88e).setHint(R.string.field_counter_operation_value_label);
                                        final int i11 = 1;
                                        E2.c.x0(a3, new InterfaceC1163b(this) { // from class: o4.c

                                            /* renamed from: e, reason: collision with root package name */
                                            public final /* synthetic */ t f13561e;

                                            {
                                                this.f13561e = this;
                                            }

                                            @Override // n6.InterfaceC1163b
                                            public final Object m(Object obj) {
                                                AbstractC0640c c0638a;
                                                String str;
                                                int i112;
                                                int i12;
                                                switch (i11) {
                                                    case 0:
                                                        F3.b bVar2 = bVar;
                                                        A4.a aVar = bVar2.f1313h;
                                                        A.i iVar = bVar2.f1314i;
                                                        Integer num = (Integer) obj;
                                                        O J6 = this.f13561e.J();
                                                        if (num != null && num.intValue() == 0) {
                                                            Editable text = ((TextInputEditText) iVar.f89f).getText();
                                                            if (text != null && text.length() != 0) {
                                                                i112 = Integer.parseInt(String.valueOf(((TextInputEditText) iVar.f89f).getText()));
                                                            } else {
                                                                i112 = 0;
                                                            }
                                                            c0638a = new C0639b(i112);
                                                        } else {
                                                            Editable text2 = ((TextInputEditText) aVar.f283h).getText();
                                                            if (text2 != null && text2.length() != 0) {
                                                                str = String.valueOf(((TextInputEditText) aVar.f283h).getText());
                                                            } else {
                                                                str = "";
                                                            }
                                                            c0638a = new C0638a(str);
                                                        }
                                                        J6.f(c0638a);
                                                        break;
                                                    default:
                                                        o6.j.e((Editable) obj, "it");
                                                        O J8 = this.f13561e.J();
                                                        A.i iVar2 = bVar.f1314i;
                                                        Editable text3 = ((TextInputEditText) iVar2.f89f).getText();
                                                        if (text3 != null && text3.length() != 0) {
                                                            i12 = Integer.parseInt(String.valueOf(((TextInputEditText) iVar2.f89f).getText()));
                                                        } else {
                                                            i12 = 0;
                                                        }
                                                        J8.f(new C0639b(i12));
                                                        break;
                                                }
                                                return Z5.y.f7506a;
                                            }
                                        });
                                        textInputEditText3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText3, this));
                                        E2.d.P(e10, R.string.field_counter_name_label, R.drawable.ic_search, false);
                                        E2.d.N(e10, new C1265b(this, 6));
                                        textInputEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                                        E2.d.M(e10, new C1264a(this, 1));
                                        textInputEditText2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText2, this));
                                        this.f13597w = bVar;
                                        o6.j.d(linearLayout, "getRoot(...)");
                                        return linearLayout;
                                    }
                                }
                            }
                        }
                        i4 = i8;
                    } else {
                        i4 = R.id.edit_value_counter_name;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(U.e(this), null, null, new C1270g(this, null), 3);
        AbstractC0166y.q(U.e(this), null, null, new r(this, null), 3);
    }

    public final O J() {
        return (O) this.f13596v.getValue();
    }

    @Override // w1.e
    public final void a() {
        if (((Boolean) J().f13546h.f4088d.f()).booleanValue()) {
            X.Y(k(), R.string.warning_dialog_message_close_without_saving, new C1264a(this, 0));
        } else {
            this.f13595u.c();
            super.a();
        }
    }
}
