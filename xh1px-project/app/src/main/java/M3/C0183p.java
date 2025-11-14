package M3;

import K3.C0091e;
import L7.AbstractC0166y;
import a6.AbstractC0437l;
import android.content.SharedPreferences;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import l5.DialogC1035e;
import o.p1;
import z1.ViewOnFocusChangeListenerC1853a;

/* renamed from: M3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183p extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final C0091e f3456u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.d f3457v;

    /* renamed from: w, reason: collision with root package name */
    public p1 f3458w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0183p(C0091e c0091e) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        o6.j.e(c0091e, "listener");
        this.f3456u = c0091e;
        this.f3457v = new A4.d(o6.v.f13643a.b(Z.class), new C0182o(this, 0), new C0182o(this, 1), new D4.z(8, this));
    }

    public static void G(C0183p c0183p, View view) {
        long j;
        o6.j.e(view, "it");
        Z J6 = c0183p.J();
        f2.e eVar = (f2.e) J6.f3416c.f1950e.a();
        if (eVar != null) {
            SharedPreferences.Editor edit = J6.f3418e.edit();
            Long l6 = eVar.f10694e;
            if (l6 != null) {
                j = l6.longValue();
            } else {
                j = 0;
            }
            o6.j.e(edit, "<this>");
            o6.j.d(edit.putLong("Last_Click_Press_Duration", j), "putLong(...)");
            edit.apply();
        }
        c0183p.f3456u.a();
        super.a();
    }

    public static void H(C0183p c0183p) {
        c0183p.f3456u.c();
        super.a();
    }

    public static void I(C0183p c0183p, View view) {
        o6.j.e(view, "it");
        c0183p.f3456u.b();
        super.a();
    }

    @Override // z1.b
    public final ViewGroup E() {
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_action_click, (ViewGroup) null, false);
        int i4 = R.id.divider_click_offset;
        if (((MaterialDivider) E2.b.r(inflate, R.id.divider_click_offset)) != null) {
            i4 = R.id.field_click_offset;
            View r8 = E2.b.r(inflate, R.id.field_click_offset);
            if (r8 != null) {
                A4.c d2 = A4.c.d(r8);
                i4 = R.id.field_click_selection;
                View r9 = E2.b.r(inflate, R.id.field_click_selection);
                if (r9 != null) {
                    A4.c d3 = A4.c.d(r9);
                    i4 = R.id.field_click_type;
                    View r10 = E2.b.r(inflate, R.id.field_click_type);
                    if (r10 != null) {
                        A4.c c6 = A4.c.c(r10);
                        A4.a aVar = (A4.a) c6.f292f;
                        A4.c cVar = (A4.c) c6.f293g;
                        int i8 = R.id.field_name;
                        View r11 = E2.b.r(inflate, R.id.field_name);
                        if (r11 != null) {
                            A.i a3 = A.i.a(r11);
                            TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
                            i8 = R.id.field_press_duration;
                            View r12 = E2.b.r(inflate, R.id.field_press_duration);
                            if (r12 != null) {
                                A.i a4 = A.i.a(r12);
                                TextInputEditText textInputEditText2 = (TextInputEditText) a4.f89f;
                                i8 = R.id.layout_top_bar;
                                View r13 = E2.b.r(inflate, R.id.layout_top_bar);
                                if (r13 != null) {
                                    A4.d a9 = A4.d.a(r13);
                                    LinearLayout linearLayout = (LinearLayout) inflate;
                                    p1 p1Var = new p1(linearLayout, d2, d3, c6, a3, a4, a9, 2);
                                    ((MaterialTextView) a9.f298h).setText(R.string.dialog_title_click);
                                    A((MaterialButton) a9.f297g, new C0169b(this, 1));
                                    MaterialButton materialButton = (MaterialButton) a9.f299i;
                                    materialButton.setVisibility(0);
                                    A(materialButton, new C0169b(this, 2));
                                    MaterialButton materialButton2 = (MaterialButton) a9.f296f;
                                    materialButton2.setVisibility(0);
                                    A(materialButton2, new C0169b(this, 3));
                                    ((TextInputLayout) a3.f88e).setHint(R.string.generic_name);
                                    E2.c.x0(a3, new C0169b(this, 4));
                                    textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                                    textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, this));
                                    textInputEditText2.setFilters(new K2.i[]{new K2.i(1, 59999)});
                                    ((TextInputLayout) a4.f88e).setHint(R.string.input_field_label_click_press_duration);
                                    int i9 = 5;
                                    E2.c.x0(a4, new C0169b(this, i9));
                                    textInputEditText2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText2, this));
                                    String string = k().getString(R.string.field_click_type_title);
                                    o6.j.d(string, "getString(...)");
                                    q4.X.W(cVar, string);
                                    q4.X.X(cVar, AbstractC0437l.X(k().getString(R.string.field_click_type_desc_on_position), k().getString(R.string.field_click_type_desc_on_condition)));
                                    E2.c.B0(aVar, new B2.e(AbstractC0437l.X(Integer.valueOf(R.drawable.ic_click_on_condition), Integer.valueOf(R.drawable.ic_condition)), true));
                                    E2.c.v0(aVar, new C0169b(this, 6));
                                    String string2 = k().getString(R.string.field_click_offset_title);
                                    o6.j.d(string2, "getString(...)");
                                    E2.c.A0(d2, string2);
                                    E2.c.w0(d2, new C0168a(this, i9));
                                    this.f3458w = p1Var;
                                    o6.j.d(linearLayout, "getRoot(...)");
                                    return linearLayout;
                                }
                            }
                        }
                        i4 = i8;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(androidx.lifecycle.U.e(this), null, null, new C0173f(this, null), 3);
        AbstractC0166y.q(androidx.lifecycle.U.e(this), null, null, new C0181n(this, null), 3);
    }

    public final Z J() {
        return (Z) this.f3457v.getValue();
    }

    @Override // w1.e
    public final void a() {
        if (((Boolean) J().f3419f.f4088d.f()).booleanValue()) {
            q4.X.Y(k(), R.string.warning_dialog_message_close_without_saving, new C0168a(this, 4));
        } else {
            this.f3456u.c();
            super.a();
        }
    }

    @Override // z1.b, w1.e
    public final void v() {
        super.v();
        Z J6 = J();
        p1 p1Var = this.f3458w;
        if (p1Var != null) {
            MaterialButton materialButton = (MaterialButton) ((A4.a) ((A4.c) p1Var.f13352h).f292f).f282g;
            if (p1Var != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) ((A4.c) p1Var.f13351g).f291e;
                if (p1Var != null) {
                    MaterialButton materialButton2 = (MaterialButton) ((A4.d) p1Var.k).f299i;
                    J2.b bVar = J6.f3417d;
                    bVar.a(J2.a.f2369i, materialButton);
                    bVar.a(J2.a.j, constraintLayout);
                    bVar.a(J2.a.f2368h, materialButton2);
                    return;
                }
                o6.j.i("viewBinding");
                throw null;
            }
            o6.j.i("viewBinding");
            throw null;
        }
        o6.j.i("viewBinding");
        throw null;
    }

    @Override // z1.b, w1.e
    public final void w() {
        super.w();
        J2.b bVar = J().f3417d;
        bVar.b(J2.a.f2368h);
        bVar.b(J2.a.j);
        bVar.b(J2.a.f2369i);
    }
}
