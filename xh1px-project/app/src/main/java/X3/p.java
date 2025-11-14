package X3;

import K3.C0091e;
import L7.AbstractC0166y;
import android.content.SharedPreferences;
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
import q4.X;
import z1.ViewOnFocusChangeListenerC1853a;

/* loaded from: classes.dex */
public final class p extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final C0091e f6909u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.d f6910v;

    /* renamed from: w, reason: collision with root package name */
    public A4.d f6911w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C0091e c0091e) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        o6.j.e(c0091e, "listener");
        this.f6909u = c0091e;
        this.f6910v = new A4.d(o6.v.f13643a.b(C.class), new o(this, 0), new o(this, 1), new D4.z(23, this));
    }

    public static void G(p pVar) {
        pVar.f6909u.c();
        super.a();
    }

    public static void H(p pVar, View view) {
        long j;
        o6.j.e(view, "it");
        C J6 = pVar.J();
        f2.k kVar = (f2.k) J6.f6871b.f1950e.a();
        if (kVar != null) {
            SharedPreferences.Editor edit = J6.f6873d.edit();
            o6.j.d(edit, "edit(...)");
            Long l6 = kVar.f10734e;
            if (l6 != null) {
                j = l6.longValue();
            } else {
                j = 0;
            }
            SharedPreferences.Editor putLong = edit.putLong("Last_Swipe_Duration", j);
            o6.j.d(putLong, "putLong(...)");
            putLong.apply();
        }
        pVar.f6909u.a();
        super.a();
    }

    public static void I(p pVar, View view) {
        o6.j.e(view, "it");
        pVar.f6909u.b();
        super.a();
    }

    @Override // z1.b
    public final ViewGroup E() {
        int i4 = 0;
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_action_swipe, (ViewGroup) null, false);
        int i8 = R.id.field_name;
        View r8 = E2.b.r(inflate, R.id.field_name);
        if (r8 != null) {
            A.i a3 = A.i.a(r8);
            TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
            int i9 = R.id.field_selection_swipe_position;
            View r9 = E2.b.r(inflate, R.id.field_selection_swipe_position);
            if (r9 != null) {
                A4.c d2 = A4.c.d(r9);
                i9 = R.id.field_swipe_duration;
                View r10 = E2.b.r(inflate, R.id.field_swipe_duration);
                if (r10 != null) {
                    A.i a4 = A.i.a(r10);
                    TextInputEditText textInputEditText2 = (TextInputEditText) a4.f89f;
                    View r11 = E2.b.r(inflate, R.id.layout_top_bar);
                    if (r11 != null) {
                        A4.d a9 = A4.d.a(r11);
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        A4.d dVar = new A4.d(linearLayout, a3, d2, a4, a9, 2);
                        ((MaterialTextView) a9.f298h).setText(R.string.dialog_title_swipe);
                        A((MaterialButton) a9.f297g, new C0362a(this, i4));
                        MaterialButton materialButton = (MaterialButton) a9.f299i;
                        materialButton.setVisibility(0);
                        A(materialButton, new C0362a(this, 1));
                        MaterialButton materialButton2 = (MaterialButton) a9.f296f;
                        materialButton2.setVisibility(0);
                        A(materialButton2, new C0362a(this, 2));
                        ((TextInputLayout) a3.f88e).setHint(R.string.generic_name);
                        E2.c.x0(a3, new C0362a(this, 3));
                        textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                        textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, this));
                        textInputEditText2.setFilters(new K2.i[]{new K2.i(1, 59999)});
                        ((TextInputLayout) a4.f88e).setHint(R.string.input_field_label_swipe_duration);
                        E2.c.x0(a4, new C0362a(this, 4));
                        textInputEditText2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText2, this));
                        String string = k().getString(R.string.field_swipe_positions_title);
                        o6.j.d(string, "getString(...)");
                        E2.c.A0(d2, string);
                        E2.c.w0(d2, new C0363b(this, i4));
                        this.f6911w = dVar;
                        o6.j.d(linearLayout, "getRoot(...)");
                        return linearLayout;
                    }
                    i8 = R.id.layout_top_bar;
                }
            }
            i8 = i9;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(U.e(this), null, null, new f(this, null), 3);
        AbstractC0166y.q(U.e(this), null, null, new n(this, null), 3);
    }

    public final C J() {
        return (C) this.f6910v.getValue();
    }

    @Override // w1.e
    public final void a() {
        if (((Boolean) J().f6872c.f4088d.f()).booleanValue()) {
            X.Y(k(), R.string.warning_dialog_message_close_without_saving, new C0363b(this, 1));
        } else {
            this.f6909u.c();
            super.a();
        }
    }
}
