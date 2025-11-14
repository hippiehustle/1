package T3;

import K3.C0091e;
import L7.AbstractC0166y;
import a6.AbstractC0437l;
import android.os.Build;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import l5.DialogC1035e;
import o.p1;
import q4.X;
import z1.ViewOnFocusChangeListenerC1853a;

/* loaded from: classes.dex */
public final class o extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final C0091e f5738u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.d f5739v;

    /* renamed from: w, reason: collision with root package name */
    public p1 f5740w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C0091e c0091e) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        o6.j.e(c0091e, "listener");
        this.f5738u = c0091e;
        this.f5739v = new A4.d(o6.v.f13643a.b(H.class), new n(this, 0), new n(this, 1), new D4.z(19, this));
    }

    public static void G(o oVar, View view) {
        o6.j.e(view, "it");
        oVar.f5738u.b();
        super.a();
    }

    public static void H(o oVar) {
        oVar.f5738u.c();
        super.a();
    }

    public static void I(o oVar, View view) {
        o6.j.e(view, "it");
        oVar.f5738u.a();
        super.a();
    }

    @Override // z1.b
    public final ViewGroup E() {
        int i4 = 0;
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_action_notification, (ViewGroup) null, false);
        int i8 = R.id.button_notification_settings;
        MaterialButton materialButton = (MaterialButton) E2.b.r(inflate, R.id.button_notification_settings);
        if (materialButton != null) {
            i8 = R.id.field_dropdown_channel_type;
            View r8 = E2.b.r(inflate, R.id.field_dropdown_channel_type);
            if (r8 != null) {
                A4.a f8 = A4.a.f(r8);
                i8 = R.id.field_dropdown_message_type;
                View r9 = E2.b.r(inflate, R.id.field_dropdown_message_type);
                if (r9 != null) {
                    A4.a f9 = A4.a.f(r9);
                    i8 = R.id.field_message_counter_name;
                    View r10 = E2.b.r(inflate, R.id.field_message_counter_name);
                    if (r10 != null) {
                        A4.a e9 = A4.a.e(r10);
                        i8 = R.id.field_message_text;
                        View r11 = E2.b.r(inflate, R.id.field_message_text);
                        if (r11 != null) {
                            A.i a3 = A.i.a(r11);
                            i8 = R.id.field_name;
                            View r12 = E2.b.r(inflate, R.id.field_name);
                            if (r12 != null) {
                                A.i a4 = A.i.a(r12);
                                TextInputEditText textInputEditText = (TextInputEditText) a4.f89f;
                                int i9 = R.id.layout_top_bar;
                                View r13 = E2.b.r(inflate, R.id.layout_top_bar);
                                if (r13 != null) {
                                    A4.d a9 = A4.d.a(r13);
                                    i9 = R.id.message_notification_config;
                                    if (((MaterialTextView) E2.b.r(inflate, R.id.message_notification_config)) != null) {
                                        i9 = R.id.separator;
                                        if (((MaterialDivider) E2.b.r(inflate, R.id.separator)) != null) {
                                            LinearLayout linearLayout = (LinearLayout) inflate;
                                            p1 p1Var = new p1(linearLayout, materialButton, f8, f9, e9, a3, a4, a9);
                                            ((MaterialTextView) a9.f298h).setText(R.string.dialog_title_notification);
                                            A((MaterialButton) a9.f297g, new C0318b(this, i4));
                                            View view = (MaterialButton) a9.f299i;
                                            view.setVisibility(0);
                                            int i10 = 1;
                                            A(view, new C0318b(this, i10));
                                            View view2 = (MaterialButton) a9.f296f;
                                            view2.setVisibility(0);
                                            A(view2, new C0318b(this, 2));
                                            ((TextInputLayout) a4.f88e).setHint(R.string.generic_name);
                                            textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                                            E2.c.x0(a4, new C0318b(this, 3));
                                            textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, this));
                                            D2.f.J(f9, AbstractC0437l.X(u.f5745c, t.f5744c), new A1.e(1, J(), H.class, "setNotificationMessageType", "setNotificationMessageType(Lcom/buzbuz/smartautoclicker/feature/smart/config/ui/action/notification/NotificationMessageTypeItem;)V", 0, 0, 21), k().getString(R.string.field_dropdown_notification_message_type_title), 120);
                                            ((TextInputLayout) a3.f88e).setHint(R.string.field_notification_message_text_label);
                                            ((TextInputEditText) a3.f89f).setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                                            E2.c.x0(a3, new C0318b(this, 4));
                                            E2.d.P(e9, R.string.field_notification_message_counter_label, R.drawable.ic_search, false);
                                            E2.d.M(e9, new C0317a(this, i10));
                                            E2.d.N(e9, new C0318b(this, 5));
                                            D2.f.J(f8, AbstractC0437l.X(q.f5742c, p.f5741c, r.f5743c), new A1.e(1, J(), H.class, "setNotificationImportance", "setNotificationImportance(Lcom/buzbuz/smartautoclicker/feature/smart/config/ui/action/notification/NotificationImportanceItem;)V", 0, 0, 22), k().getString(R.string.field_dropdown_notification_importance_title), 120);
                                            J();
                                            if (Build.VERSION.SDK_INT < 26) {
                                                i4 = 8;
                                            }
                                            materialButton.setVisibility(i4);
                                            A(materialButton, new C0318b(this, 6));
                                            this.f5740w = p1Var;
                                            o6.j.d(linearLayout, "getRoot(...)");
                                            return linearLayout;
                                        }
                                    }
                                }
                                i8 = i9;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(U.e(this), null, null, new C0322f(this, null), 3);
        AbstractC0166y.q(U.e(this), null, null, new m(this, null), 3);
    }

    public final H J() {
        return (H) this.f5739v.getValue();
    }

    @Override // w1.e
    public final void a() {
        if (((Boolean) J().f5701c.f4088d.f()).booleanValue()) {
            X.Y(k(), R.string.warning_dialog_message_close_without_saving, new C0317a(this, 0));
        } else {
            this.f5738u.c();
            super.a();
        }
    }
}
