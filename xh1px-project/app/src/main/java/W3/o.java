package W3;

import K3.C0091e;
import L7.AbstractC0166y;
import a6.AbstractC0437l;
import android.os.Build;
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
import l5.DialogC1035e;
import n6.InterfaceC1163b;
import q4.X;
import z1.ViewOnFocusChangeListenerC1853a;

/* loaded from: classes.dex */
public final class o extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final C0091e f6533u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.d f6534v;

    /* renamed from: w, reason: collision with root package name */
    public A4.d f6535w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C0091e c0091e) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        o6.j.e(c0091e, "listener");
        this.f6533u = c0091e;
        this.f6534v = new A4.d(o6.v.f13643a.b(z.class), new n(this, 0), new n(this, 1), new D4.z(22, this));
    }

    public static void G(o oVar, View view) {
        o6.j.e(view, "it");
        oVar.f6533u.b();
        super.a();
    }

    public static void H(o oVar) {
        oVar.f6533u.c();
        super.a();
    }

    public static void I(o oVar, View view) {
        o6.j.e(view, "it");
        oVar.f6533u.a();
        super.a();
    }

    @Override // z1.b
    public final ViewGroup E() {
        final int i4 = 0;
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_action_set_text, (ViewGroup) null, false);
        int i8 = R.id.field_name;
        View r8 = E2.b.r(inflate, R.id.field_name);
        if (r8 != null) {
            A.i a3 = A.i.a(r8);
            TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
            View r9 = E2.b.r(inflate, R.id.field_text_to_write);
            if (r9 != null) {
                A4.a e9 = A4.a.e(r9);
                TextInputEditText textInputEditText2 = (TextInputEditText) e9.f283h;
                int i9 = R.id.field_validate_text;
                View r10 = E2.b.r(inflate, R.id.field_validate_text);
                if (r10 != null) {
                    A4.c e10 = A4.c.e(r10);
                    A4.c cVar = (A4.c) e10.f292f;
                    i9 = R.id.layout_top_bar;
                    View r11 = E2.b.r(inflate, R.id.layout_top_bar);
                    if (r11 != null) {
                        A4.d a4 = A4.d.a(r11);
                        i9 = R.id.message_tips;
                        if (((MaterialTextView) E2.b.r(inflate, R.id.message_tips)) != null) {
                            i9 = R.id.tips_card;
                            if (((MaterialCardView) E2.b.r(inflate, R.id.tips_card)) != null) {
                                i9 = R.id.toggle_validate_text_card;
                                MaterialCardView materialCardView = (MaterialCardView) E2.b.r(inflate, R.id.toggle_validate_text_card);
                                if (materialCardView != null) {
                                    LinearLayout linearLayout = (LinearLayout) inflate;
                                    A4.d dVar = new A4.d(linearLayout, a3, e9, e10, a4, materialCardView);
                                    ((MaterialTextView) a4.f298h).setText(R.string.dialog_title_set_text_action);
                                    A((MaterialButton) a4.f297g, new InterfaceC1163b(this) { // from class: W3.a

                                        /* renamed from: e, reason: collision with root package name */
                                        public final /* synthetic */ o f6506e;

                                        {
                                            this.f6506e = this;
                                        }

                                        @Override // n6.InterfaceC1163b
                                        public final Object m(Object obj) {
                                            switch (i4) {
                                                case 0:
                                                    o6.j.e((View) obj, "it");
                                                    this.f6506e.a();
                                                    break;
                                                case 1:
                                                    o.I(this.f6506e, (View) obj);
                                                    break;
                                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                    o.G(this.f6506e, (View) obj);
                                                    break;
                                                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                    Editable editable = (Editable) obj;
                                                    o6.j.e(editable, "it");
                                                    z J6 = this.f6506e.J();
                                                    String obj2 = editable.toString();
                                                    o6.j.e(obj2, "newName");
                                                    H3.n nVar = J6.f6564b;
                                                    f2.j jVar = (f2.j) nVar.f1950e.a();
                                                    if (jVar != null) {
                                                        nVar.j(f2.j.i(jVar, null, null, obj2, 0, null, false, 59));
                                                    }
                                                    return Z5.y.f7506a;
                                                default:
                                                    Editable editable2 = (Editable) obj;
                                                    o6.j.e(editable2, "it");
                                                    z J8 = this.f6506e.J();
                                                    String obj3 = editable2.toString();
                                                    o6.j.e(obj3, "newText");
                                                    H3.n nVar2 = J8.f6564b;
                                                    f2.j jVar2 = (f2.j) nVar2.f1950e.a();
                                                    if (jVar2 != null) {
                                                        nVar2.j(f2.j.i(jVar2, null, null, null, 0, obj3, false, 47));
                                                    }
                                                    return Z5.y.f7506a;
                                            }
                                            return Z5.y.f7506a;
                                        }
                                    });
                                    MaterialButton materialButton = (MaterialButton) a4.f299i;
                                    materialButton.setVisibility(0);
                                    final int i10 = 1;
                                    A(materialButton, new InterfaceC1163b(this) { // from class: W3.a

                                        /* renamed from: e, reason: collision with root package name */
                                        public final /* synthetic */ o f6506e;

                                        {
                                            this.f6506e = this;
                                        }

                                        @Override // n6.InterfaceC1163b
                                        public final Object m(Object obj) {
                                            switch (i10) {
                                                case 0:
                                                    o6.j.e((View) obj, "it");
                                                    this.f6506e.a();
                                                    break;
                                                case 1:
                                                    o.I(this.f6506e, (View) obj);
                                                    break;
                                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                    o.G(this.f6506e, (View) obj);
                                                    break;
                                                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                    Editable editable = (Editable) obj;
                                                    o6.j.e(editable, "it");
                                                    z J6 = this.f6506e.J();
                                                    String obj2 = editable.toString();
                                                    o6.j.e(obj2, "newName");
                                                    H3.n nVar = J6.f6564b;
                                                    f2.j jVar = (f2.j) nVar.f1950e.a();
                                                    if (jVar != null) {
                                                        nVar.j(f2.j.i(jVar, null, null, obj2, 0, null, false, 59));
                                                    }
                                                    return Z5.y.f7506a;
                                                default:
                                                    Editable editable2 = (Editable) obj;
                                                    o6.j.e(editable2, "it");
                                                    z J8 = this.f6506e.J();
                                                    String obj3 = editable2.toString();
                                                    o6.j.e(obj3, "newText");
                                                    H3.n nVar2 = J8.f6564b;
                                                    f2.j jVar2 = (f2.j) nVar2.f1950e.a();
                                                    if (jVar2 != null) {
                                                        nVar2.j(f2.j.i(jVar2, null, null, null, 0, obj3, false, 47));
                                                    }
                                                    return Z5.y.f7506a;
                                            }
                                            return Z5.y.f7506a;
                                        }
                                    });
                                    MaterialButton materialButton2 = (MaterialButton) a4.f296f;
                                    materialButton2.setVisibility(0);
                                    final int i11 = 2;
                                    A(materialButton2, new InterfaceC1163b(this) { // from class: W3.a

                                        /* renamed from: e, reason: collision with root package name */
                                        public final /* synthetic */ o f6506e;

                                        {
                                            this.f6506e = this;
                                        }

                                        @Override // n6.InterfaceC1163b
                                        public final Object m(Object obj) {
                                            switch (i11) {
                                                case 0:
                                                    o6.j.e((View) obj, "it");
                                                    this.f6506e.a();
                                                    break;
                                                case 1:
                                                    o.I(this.f6506e, (View) obj);
                                                    break;
                                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                    o.G(this.f6506e, (View) obj);
                                                    break;
                                                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                    Editable editable = (Editable) obj;
                                                    o6.j.e(editable, "it");
                                                    z J6 = this.f6506e.J();
                                                    String obj2 = editable.toString();
                                                    o6.j.e(obj2, "newName");
                                                    H3.n nVar = J6.f6564b;
                                                    f2.j jVar = (f2.j) nVar.f1950e.a();
                                                    if (jVar != null) {
                                                        nVar.j(f2.j.i(jVar, null, null, obj2, 0, null, false, 59));
                                                    }
                                                    return Z5.y.f7506a;
                                                default:
                                                    Editable editable2 = (Editable) obj;
                                                    o6.j.e(editable2, "it");
                                                    z J8 = this.f6506e.J();
                                                    String obj3 = editable2.toString();
                                                    o6.j.e(obj3, "newText");
                                                    H3.n nVar2 = J8.f6564b;
                                                    f2.j jVar2 = (f2.j) nVar2.f1950e.a();
                                                    if (jVar2 != null) {
                                                        nVar2.j(f2.j.i(jVar2, null, null, null, 0, obj3, false, 47));
                                                    }
                                                    return Z5.y.f7506a;
                                            }
                                            return Z5.y.f7506a;
                                        }
                                    });
                                    ((TextInputLayout) a3.f88e).setHint(R.string.generic_name);
                                    textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                                    final int i12 = 3;
                                    E2.c.x0(a3, new InterfaceC1163b(this) { // from class: W3.a

                                        /* renamed from: e, reason: collision with root package name */
                                        public final /* synthetic */ o f6506e;

                                        {
                                            this.f6506e = this;
                                        }

                                        @Override // n6.InterfaceC1163b
                                        public final Object m(Object obj) {
                                            switch (i12) {
                                                case 0:
                                                    o6.j.e((View) obj, "it");
                                                    this.f6506e.a();
                                                    break;
                                                case 1:
                                                    o.I(this.f6506e, (View) obj);
                                                    break;
                                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                    o.G(this.f6506e, (View) obj);
                                                    break;
                                                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                    Editable editable = (Editable) obj;
                                                    o6.j.e(editable, "it");
                                                    z J6 = this.f6506e.J();
                                                    String obj2 = editable.toString();
                                                    o6.j.e(obj2, "newName");
                                                    H3.n nVar = J6.f6564b;
                                                    f2.j jVar = (f2.j) nVar.f1950e.a();
                                                    if (jVar != null) {
                                                        nVar.j(f2.j.i(jVar, null, null, obj2, 0, null, false, 59));
                                                    }
                                                    return Z5.y.f7506a;
                                                default:
                                                    Editable editable2 = (Editable) obj;
                                                    o6.j.e(editable2, "it");
                                                    z J8 = this.f6506e.J();
                                                    String obj3 = editable2.toString();
                                                    o6.j.e(obj3, "newText");
                                                    H3.n nVar2 = J8.f6564b;
                                                    f2.j jVar2 = (f2.j) nVar2.f1950e.a();
                                                    if (jVar2 != null) {
                                                        nVar2.j(f2.j.i(jVar2, null, null, null, 0, obj3, false, 47));
                                                    }
                                                    return Z5.y.f7506a;
                                            }
                                            return Z5.y.f7506a;
                                        }
                                    });
                                    textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, this));
                                    E2.d.P(e9, R.string.field_input_set_text_text_to_write_title, R.drawable.ic_change_counter, false);
                                    textInputEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.set_text_action_max_length))});
                                    final int i13 = 4;
                                    E2.d.N(e9, new InterfaceC1163b(this) { // from class: W3.a

                                        /* renamed from: e, reason: collision with root package name */
                                        public final /* synthetic */ o f6506e;

                                        {
                                            this.f6506e = this;
                                        }

                                        @Override // n6.InterfaceC1163b
                                        public final Object m(Object obj) {
                                            switch (i13) {
                                                case 0:
                                                    o6.j.e((View) obj, "it");
                                                    this.f6506e.a();
                                                    break;
                                                case 1:
                                                    o.I(this.f6506e, (View) obj);
                                                    break;
                                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                    o.G(this.f6506e, (View) obj);
                                                    break;
                                                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                    Editable editable = (Editable) obj;
                                                    o6.j.e(editable, "it");
                                                    z J6 = this.f6506e.J();
                                                    String obj2 = editable.toString();
                                                    o6.j.e(obj2, "newName");
                                                    H3.n nVar = J6.f6564b;
                                                    f2.j jVar = (f2.j) nVar.f1950e.a();
                                                    if (jVar != null) {
                                                        nVar.j(f2.j.i(jVar, null, null, obj2, 0, null, false, 59));
                                                    }
                                                    return Z5.y.f7506a;
                                                default:
                                                    Editable editable2 = (Editable) obj;
                                                    o6.j.e(editable2, "it");
                                                    z J8 = this.f6506e.J();
                                                    String obj3 = editable2.toString();
                                                    o6.j.e(obj3, "newText");
                                                    H3.n nVar2 = J8.f6564b;
                                                    f2.j jVar2 = (f2.j) nVar2.f1950e.a();
                                                    if (jVar2 != null) {
                                                        nVar2.j(f2.j.i(jVar2, null, null, null, 0, obj3, false, 47));
                                                    }
                                                    return Z5.y.f7506a;
                                            }
                                            return Z5.y.f7506a;
                                        }
                                    });
                                    E2.d.M(e9, new b(this, i4));
                                    textInputEditText2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText2, this));
                                    if (Build.VERSION.SDK_INT < 30) {
                                        materialCardView.setVisibility(8);
                                    } else {
                                        String string = k().getResources().getString(R.string.field_set_text_validate_title);
                                        o6.j.d(string, "getString(...)");
                                        X.W(cVar, string);
                                        X.X(cVar, AbstractC0437l.X(k().getString(R.string.field_set_text_validate_desc_disabled), k().getString(R.string.field_set_text_validate_desc_enabled)));
                                        E2.b.J(e10, new J3.s(0, J(), z.class, "toggleValidateInput", "toggleValidateInput()V", 0, 0, 3));
                                    }
                                    this.f6535w = dVar;
                                    o6.j.d(linearLayout, "getRoot(...)");
                                    return linearLayout;
                                }
                            }
                        }
                    }
                }
                i8 = i9;
            } else {
                i8 = R.id.field_text_to_write;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(U.e(this), null, null, new f(this, null), 3);
        AbstractC0166y.q(U.e(this), null, null, new m(this, null), 3);
    }

    public final z J() {
        return (z) this.f6534v.getValue();
    }

    @Override // w1.e
    public final void a() {
        if (((Boolean) J().f6565c.f4088d.f()).booleanValue()) {
            X.Y(k(), R.string.warning_dialog_message_close_without_saving, new b(this, 1));
        } else {
            this.f6533u.c();
            super.a();
        }
    }
}
