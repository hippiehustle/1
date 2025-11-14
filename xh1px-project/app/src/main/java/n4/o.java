package n4;

import L7.AbstractC0166y;
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
import j3.C0933s;
import l4.C1030j;
import l5.DialogC1035e;
import q4.X;
import z1.ViewOnFocusChangeListenerC1853a;

/* loaded from: classes.dex */
public final class o extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final C1030j f12956u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.d f12957v;

    /* renamed from: w, reason: collision with root package name */
    public A4.a f12958w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C1030j c1030j) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        o6.j.e(c1030j, "listener");
        this.f12956u = c1030j;
        this.f12957v = new A4.d(o6.v.f13643a.b(z.class), new n(this, 0), new n(this, 1), new C0933s(10, this));
    }

    public static void G(o oVar) {
        oVar.f12956u.c();
        super.a();
    }

    public static void H(o oVar, View view) {
        o6.j.e(view, "it");
        oVar.f12956u.b();
        super.a();
    }

    public static void I(o oVar, View view) {
        o6.j.e(view, "it");
        oVar.f12956u.a();
        super.a();
    }

    @Override // z1.b
    public final ViewGroup E() {
        int i4 = 0;
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_condition_broadcast, (ViewGroup) null, false);
        int i8 = R.id.edit_broadcast_action;
        View r8 = E2.b.r(inflate, R.id.edit_broadcast_action);
        if (r8 != null) {
            A4.a e9 = A4.a.e(r8);
            TextInputEditText textInputEditText = (TextInputEditText) e9.f283h;
            View r9 = E2.b.r(inflate, R.id.field_name);
            if (r9 != null) {
                A.i a3 = A.i.a(r9);
                TextInputEditText textInputEditText2 = (TextInputEditText) a3.f89f;
                View r10 = E2.b.r(inflate, R.id.layout_top_bar);
                if (r10 != null) {
                    A4.d a4 = A4.d.a(r10);
                    LinearLayout linearLayout = (LinearLayout) inflate;
                    A4.a aVar = new A4.a(linearLayout, e9, a3, a4, 7);
                    ((MaterialTextView) a4.f298h).setText(R.string.dialog_title_broadcast_received);
                    A((MaterialButton) a4.f297g, new C1158b(this, i4));
                    MaterialButton materialButton = (MaterialButton) a4.f299i;
                    materialButton.setVisibility(0);
                    int i9 = 1;
                    A(materialButton, new C1158b(this, i9));
                    MaterialButton materialButton2 = (MaterialButton) a4.f296f;
                    materialButton2.setVisibility(0);
                    A(materialButton2, new C1158b(this, 2));
                    ((TextInputLayout) a3.f88e).setHint(R.string.generic_name);
                    E2.c.x0(a3, new C1158b(this, 3));
                    textInputEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                    textInputEditText2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText2, this));
                    E2.d.P(e9, R.string.field_intent_broadcast_action_label, R.drawable.ic_search, false);
                    E2.d.N(e9, new C1158b(this, 4));
                    textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                    E2.d.M(e9, new C1157a(this, i9));
                    textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, this));
                    this.f12958w = aVar;
                    o6.j.d(linearLayout, "getRoot(...)");
                    return linearLayout;
                }
                i8 = R.id.layout_top_bar;
            } else {
                i8 = R.id.field_name;
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
        return (z) this.f12957v.getValue();
    }

    @Override // w1.e
    public final void a() {
        if (((Boolean) J().f12988c.f4088d.f()).booleanValue()) {
            X.Y(k(), R.string.warning_dialog_message_close_without_saving, new C1157a(this, 0));
        } else {
            this.f12956u.c();
            super.a();
        }
    }
}
