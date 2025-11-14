package m3;

import L7.AbstractC0166y;
import O7.i0;
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
import e3.C0642a;
import j3.C0933s;
import l5.DialogC1035e;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import z1.ViewOnFocusChangeListenerC1853a;

/* renamed from: m3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1079s extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final p2.c f12471u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC1163b f12472v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC1163b f12473w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC1162a f12474x;

    /* renamed from: y, reason: collision with root package name */
    public final A4.d f12475y;

    /* renamed from: z, reason: collision with root package name */
    public C0642a f12476z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1079s(p2.c cVar, InterfaceC1163b interfaceC1163b, InterfaceC1163b interfaceC1163b2, InterfaceC1162a interfaceC1162a) {
        super(Integer.valueOf(R.style.AppTheme));
        o6.j.e(cVar, "dumbSwipe");
        this.f12471u = cVar;
        this.f12472v = interfaceC1163b;
        this.f12473w = interfaceC1163b2;
        this.f12474x = interfaceC1162a;
        this.f12475y = new A4.d(o6.v.f13643a.b(C1060E.class), new C1078r(this, 0), new C1078r(this, 1), new C0933s(8, this));
    }

    @Override // z1.b
    public final ViewGroup E() {
        C1060E G8 = G();
        p2.c cVar = this.f12471u;
        o6.j.e(cVar, "swipe");
        i0 i0Var = G8.f12425b;
        p2.c i4 = p2.c.i(cVar, null, null, null, 0, 0, false, 0L, null, null, 0L, 1023);
        i0Var.getClass();
        i0Var.h(null, i4);
        int i8 = 0;
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_dumb_action_swipe, (ViewGroup) null, false);
        int i9 = R.id.field_duration;
        View r8 = E2.b.r(inflate, R.id.field_duration);
        if (r8 != null) {
            A.i a3 = A.i.a(r8);
            TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
            View r9 = E2.b.r(inflate, R.id.field_name);
            if (r9 != null) {
                A.i a4 = A.i.a(r9);
                TextInputEditText textInputEditText2 = (TextInputEditText) a4.f89f;
                int i10 = R.id.field_repeat;
                View r10 = E2.b.r(inflate, R.id.field_repeat);
                if (r10 != null) {
                    A4.a e9 = A4.a.e(r10);
                    i10 = R.id.field_repeat_delay;
                    View r11 = E2.b.r(inflate, R.id.field_repeat_delay);
                    if (r11 != null) {
                        A.i a9 = A.i.a(r11);
                        TextInputEditText textInputEditText3 = (TextInputEditText) a9.f89f;
                        int i11 = R.id.field_selection_position;
                        View r12 = E2.b.r(inflate, R.id.field_selection_position);
                        if (r12 != null) {
                            A4.c d2 = A4.c.d(r12);
                            i11 = R.id.layout_top_bar;
                            View r13 = E2.b.r(inflate, R.id.layout_top_bar);
                            if (r13 != null) {
                                A4.d a10 = A4.d.a(r13);
                                LinearLayout linearLayout = (LinearLayout) inflate;
                                C0642a c0642a = new C0642a(linearLayout, a3, a4, e9, a9, d2, a10, 1);
                                ((MaterialTextView) a10.f298h).setText(R.string.item_title_dumb_swipe);
                                A((MaterialButton) a10.f297g, new C1061a(this, i8));
                                MaterialButton materialButton = (MaterialButton) a10.f299i;
                                materialButton.setVisibility(0);
                                A(materialButton, new C1061a(this, 1));
                                MaterialButton materialButton2 = (MaterialButton) a10.f296f;
                                materialButton2.setVisibility(0);
                                A(materialButton2, new C1061a(this, 2));
                                ((TextInputLayout) a4.f88e).setHint(R.string.input_field_label_name);
                                E2.c.x0(a4, new C1061a(this, 3));
                                textInputEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                                textInputEditText2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText2, this));
                                textInputEditText.setFilters(new K2.i[]{new K2.i(1, 59999)});
                                ((TextInputLayout) a3.f88e).setHint(R.string.input_field_label_swipe_duration);
                                E2.c.x0(a3, new C1061a(this, 4));
                                textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, this));
                                ((TextInputEditText) e9.f283h).setFilters(new K2.i[]{new K2.i(1, 99999)});
                                E2.d.P(e9, R.string.input_field_label_repeat_count, R.drawable.ic_infinite, true);
                                E2.d.N(e9, new C1061a(this, 5));
                                E2.d.M(e9, new J3.s(0, G(), C1060E.class, "toggleInfiniteRepeat", "toggleInfiniteRepeat()V", 0, 0, 18));
                                textInputEditText3.setFilters(new K2.i[]{new K2.i(0, 3600000)});
                                ((TextInputLayout) a9.f88e).setHint(R.string.input_field_label_repeat_delay);
                                E2.c.x0(a9, new C1061a(this, 6));
                                textInputEditText3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText3, this));
                                String string = k().getString(R.string.field_swipe_positions_title);
                                o6.j.d(string, "getString(...)");
                                E2.c.A0(d2, string);
                                E2.c.w0(d2, new C1062b(this, 0));
                                this.f12476z = c0642a;
                                o6.j.d(linearLayout, "getRoot(...)");
                                return linearLayout;
                            }
                        }
                        i9 = i11;
                    }
                }
                i9 = i10;
            } else {
                i9 = R.id.field_name;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i9)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(U.e(this), null, null, new C1077q(this, null), 3);
    }

    public final C1060E G() {
        return (C1060E) this.f12475y.getValue();
    }
}
