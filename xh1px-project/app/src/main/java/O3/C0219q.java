package O3;

import L7.AbstractC0166y;
import android.content.Context;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import g2.C0777a;
import z1.ViewOnFocusChangeListenerC1853a;

/* renamed from: O3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219q extends B1.h {

    /* renamed from: l, reason: collision with root package name */
    public final A4.d f3989l;

    /* renamed from: m, reason: collision with root package name */
    public F3.a f3990m;

    /* renamed from: n, reason: collision with root package name */
    public C0224w f3991n;

    public C0219q(Context context) {
        super(context);
        this.f3989l = new A4.d(o6.v.f13643a.b(a0.class), new C0218p(this, 0), new C0218p(this, 1), new D4.z(11, this));
    }

    @Override // B1.h
    public final ViewGroup n(ViewGroup viewGroup) {
        int i4 = 2;
        this.f3991n = new C0224w(new C0204b(this, 0), new C0205c(this, 2));
        View inflate = LayoutInflater.from(h()).inflate(R.layout.content_intent_config_advanced, (ViewGroup) null, false);
        int i8 = R.id.edit_action_layout;
        View r8 = E2.b.r(inflate, R.id.edit_action_layout);
        if (r8 != null) {
            A4.a e9 = A4.a.e(r8);
            i8 = R.id.edit_component_name_layout;
            View r9 = E2.b.r(inflate, R.id.edit_component_name_layout);
            if (r9 != null) {
                A4.a e10 = A4.a.e(r9);
                i8 = R.id.edit_flags_layout;
                View r10 = E2.b.r(inflate, R.id.edit_flags_layout);
                if (r10 != null) {
                    A4.a e11 = A4.a.e(r10);
                    i8 = R.id.extras_card;
                    if (((MaterialCardView) E2.b.r(inflate, R.id.extras_card)) != null) {
                        i8 = R.id.extras_list;
                        RecyclerView recyclerView = (RecyclerView) E2.b.r(inflate, R.id.extras_list);
                        if (recyclerView != null) {
                            i8 = R.id.extras_title;
                            if (((MaterialTextView) E2.b.r(inflate, R.id.extras_title)) != null) {
                                i8 = R.id.field_name;
                                View r11 = E2.b.r(inflate, R.id.field_name);
                                if (r11 != null) {
                                    A.i a3 = A.i.a(r11);
                                    TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
                                    View r12 = E2.b.r(inflate, R.id.intent_sending_type_field);
                                    if (r12 != null) {
                                        A4.a f8 = A4.a.f(r12);
                                        NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                        F3.a aVar = new F3.a(nestedScrollView, e9, e10, e11, recyclerView, a3, f8);
                                        ((TextInputLayout) a3.f88e).setHint(R.string.generic_name);
                                        E2.c.x0(a3, new C0205c(this, 3));
                                        textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(h().getResources().getInteger(R.integer.name_max_length))});
                                        textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, i()));
                                        D2.f.J(f8, t().f3936p, new A1.e(1, t(), a0.class, "setSendingType", "setSendingType(Lcom/buzbuz/smartautoclicker/core/ui/bindings/dropdown/DropdownItem;)V", 0, 0, 17), h().getString(R.string.dropdown_intent_sending_type_label), 120);
                                        E2.d.P(e9, R.string.field_intent_action_label, R.drawable.ic_search, false);
                                        E2.d.N(e9, new C0205c(this, 4));
                                        E2.d.M(e9, new C0204b(this, i4));
                                        B1.c i9 = i();
                                        TextInputEditText textInputEditText2 = (TextInputEditText) e9.f283h;
                                        textInputEditText2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText2, i9));
                                        E2.d.P(e11, R.string.field_intent_flags_label, R.drawable.ic_search, false);
                                        E2.d.N(e11, new C0205c(this, 5));
                                        E2.d.M(e11, new C0204b(this, 3));
                                        B1.c i10 = i();
                                        TextInputEditText textInputEditText3 = (TextInputEditText) e11.f283h;
                                        textInputEditText3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText3, i10));
                                        E2.d.P(e10, R.string.field_intent_component_name_label, R.drawable.ic_search, false);
                                        E2.d.N(e10, new C0205c(this, 6));
                                        E2.d.M(e10, new C0204b(this, 4));
                                        B1.c i11 = i();
                                        TextInputEditText textInputEditText4 = (TextInputEditText) e10.f283h;
                                        textInputEditText4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText4, i11));
                                        C0224w c0224w = this.f3991n;
                                        if (c0224w != null) {
                                            recyclerView.setAdapter(c0224w);
                                            this.f3990m = aVar;
                                            o6.j.d(nestedScrollView, "getRoot(...)");
                                            return nestedScrollView;
                                        }
                                        o6.j.i("extrasAdapter");
                                        throw null;
                                    }
                                    i8 = R.id.intent_sending_type_field;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    @Override // B1.h
    public final void q() {
        AbstractC0166y.q(androidx.lifecycle.U.e(this), null, null, new C0216n(this, null), 3);
    }

    public final a0 t() {
        return (a0) this.f3989l.getValue();
    }

    public final void u(C0777a c0777a) {
        C3.a aVar;
        D3.d dVar;
        a0 t8 = t();
        o6.j.e(c0777a, "extra");
        H3.n nVar = t8.f3924b;
        nVar.getClass();
        E3.a aVar2 = (E3.a) nVar.f1948c.f601h.f();
        if (aVar2 != null && (aVar = aVar2.f1193m) != null && (dVar = aVar.k) != null) {
            dVar.e(c0777a);
        }
        i().o().d(h(), new R3.n(new C0217o(0, t(), a0.class, "saveIntentExtraEdition", "saveIntentExtraEdition()Lkotlin/Unit;", 8, 0), new C0217o(0, t(), a0.class, "deleteIntentExtraEvent", "deleteIntentExtraEvent()Lkotlin/Unit;", 8, 1), new C0217o(0, t(), a0.class, "dismissIntentExtraEvent", "dismissIntentExtraEvent()Lkotlin/Unit;", 8, 2)), false);
    }
}
