package O3;

import L7.AbstractC0166y;
import android.content.Context;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import z1.ViewOnFocusChangeListenerC1853a;

/* loaded from: classes.dex */
public final class k0 extends B1.h {

    /* renamed from: l, reason: collision with root package name */
    public final A4.d f3979l;

    /* renamed from: m, reason: collision with root package name */
    public A4.c f3980m;

    public k0(Context context) {
        super(context);
        this.f3979l = new A4.d(o6.v.f13643a.b(a0.class), new j0(this, 0), new j0(this, 1), new D4.z(13, this));
    }

    @Override // B1.h
    public final ViewGroup n(ViewGroup viewGroup) {
        int i4 = 0;
        View inflate = LayoutInflater.from(h()).inflate(R.layout.content_intent_config_simple, (ViewGroup) null, false);
        int i8 = R.id.field_name;
        View r8 = E2.b.r(inflate, R.id.field_name);
        if (r8 != null) {
            A.i a3 = A.i.a(r8);
            TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
            View r9 = E2.b.r(inflate, R.id.field_selection_application);
            if (r9 != null) {
                A4.c d2 = A4.c.d(r9);
                NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                A4.c cVar = new A4.c(nestedScrollView, a3, d2, 5);
                ((TextInputLayout) a3.f88e).setHint(R.string.generic_name);
                E2.c.x0(a3, new b0(this, i4));
                textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(h().getResources().getInteger(R.integer.name_max_length))});
                textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, i()));
                E2.c.w0(d2, new c0(this, i4));
                this.f3980m = cVar;
                o6.j.d(nestedScrollView, "getRoot(...)");
                return nestedScrollView;
            }
            i8 = R.id.field_selection_application;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    @Override // B1.h
    public final void q() {
        AbstractC0166y.q(androidx.lifecycle.U.e(this), null, null, new i0(this, null), 3);
    }

    public final a0 t() {
        return (a0) this.f3979l.getValue();
    }
}
