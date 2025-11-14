package r3;

import L7.AbstractC0166y;
import Z5.y;
import a6.AbstractC0437l;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import j3.C0933s;
import n6.InterfaceC1163b;
import q4.X;
import z1.ViewOnFocusChangeListenerC1853a;

/* renamed from: r3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1450n extends B1.h {

    /* renamed from: l, reason: collision with root package name */
    public final A4.d f14340l;

    /* renamed from: m, reason: collision with root package name */
    public A4.d f14341m;

    public C1450n(Context context) {
        super(context);
        this.f14340l = new A4.d(o6.v.f13643a.b(C1460x.class), new C1449m(this, 0), new C1449m(this, 1), new C0933s(17, this));
    }

    @Override // B1.h
    public final ViewGroup n(ViewGroup viewGroup) {
        final int i4 = 1;
        final int i8 = 0;
        View inflate = LayoutInflater.from(h()).inflate(R.layout.content_dumb_scenario_config, viewGroup, false);
        int i9 = R.id.field_anti_detection;
        View r8 = E2.b.r(inflate, R.id.field_anti_detection);
        if (r8 != null) {
            A4.c e9 = A4.c.e(r8);
            A4.c cVar = (A4.c) e9.f292f;
            int i10 = R.id.field_max_duration;
            View r9 = E2.b.r(inflate, R.id.field_max_duration);
            if (r9 != null) {
                A4.a e10 = A4.a.e(r9);
                i10 = R.id.field_name;
                View r10 = E2.b.r(inflate, R.id.field_name);
                if (r10 != null) {
                    A.i a3 = A.i.a(r10);
                    TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
                    View r11 = E2.b.r(inflate, R.id.field_repeat_count);
                    if (r11 != null) {
                        A4.a e11 = A4.a.e(r11);
                        NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                        A4.d dVar = new A4.d(nestedScrollView, e9, e10, a3, e11, 19);
                        ((TextInputLayout) a3.f88e).setHint(R.string.input_field_label_scenario_name);
                        E2.c.x0(a3, new InterfaceC1163b(this) { // from class: r3.a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ C1450n f14315e;

                            {
                                this.f14315e = this;
                            }

                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj) {
                                int i11;
                                int i12;
                                Editable editable = (Editable) obj;
                                switch (i8) {
                                    case 0:
                                        o6.j.e(editable, "it");
                                        C1460x t8 = this.f14315e.t();
                                        String obj2 = editable.toString();
                                        o6.j.e(obj2, "name");
                                        p2.e eVar = (p2.e) t8.f14370c.f();
                                        if (eVar != null) {
                                            t8.f14369b.g(p2.e.g(eVar, obj2, null, 0, false, 0, false, false, 509));
                                        }
                                        return y.f7506a;
                                    case 1:
                                        o6.j.e(editable, "it");
                                        C1460x t9 = this.f14315e.t();
                                        if (editable.length() > 0) {
                                            i11 = Integer.parseInt(editable.toString());
                                        } else {
                                            i11 = 0;
                                        }
                                        int i13 = i11;
                                        p2.e eVar2 = (p2.e) t9.f14370c.f();
                                        if (eVar2 != null) {
                                            t9.f14369b.g(p2.e.g(eVar2, null, null, i13, false, 0, false, false, 503));
                                        }
                                        return y.f7506a;
                                    default:
                                        o6.j.e(editable, "it");
                                        C1460x t10 = this.f14315e.t();
                                        if (editable.length() > 0) {
                                            i12 = Integer.parseInt(editable.toString());
                                        } else {
                                            i12 = 0;
                                        }
                                        int i14 = i12;
                                        p2.e eVar3 = (p2.e) t10.f14370c.f();
                                        if (eVar3 != null) {
                                            t10.f14369b.g(p2.e.g(eVar3, null, null, 0, false, i14, false, false, 479));
                                        }
                                        return y.f7506a;
                                }
                            }
                        });
                        textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(h().getResources().getInteger(R.integer.name_max_length))});
                        textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, i()));
                        ((TextInputEditText) e11.f283h).setFilters(new K2.i[]{new K2.i(1, 99999)});
                        E2.d.P(e11, R.string.input_field_label_repeat_count, R.drawable.ic_infinite, true);
                        E2.d.N(e11, new InterfaceC1163b(this) { // from class: r3.a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ C1450n f14315e;

                            {
                                this.f14315e = this;
                            }

                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj) {
                                int i11;
                                int i12;
                                Editable editable = (Editable) obj;
                                switch (i4) {
                                    case 0:
                                        o6.j.e(editable, "it");
                                        C1460x t8 = this.f14315e.t();
                                        String obj2 = editable.toString();
                                        o6.j.e(obj2, "name");
                                        p2.e eVar = (p2.e) t8.f14370c.f();
                                        if (eVar != null) {
                                            t8.f14369b.g(p2.e.g(eVar, obj2, null, 0, false, 0, false, false, 509));
                                        }
                                        return y.f7506a;
                                    case 1:
                                        o6.j.e(editable, "it");
                                        C1460x t9 = this.f14315e.t();
                                        if (editable.length() > 0) {
                                            i11 = Integer.parseInt(editable.toString());
                                        } else {
                                            i11 = 0;
                                        }
                                        int i13 = i11;
                                        p2.e eVar2 = (p2.e) t9.f14370c.f();
                                        if (eVar2 != null) {
                                            t9.f14369b.g(p2.e.g(eVar2, null, null, i13, false, 0, false, false, 503));
                                        }
                                        return y.f7506a;
                                    default:
                                        o6.j.e(editable, "it");
                                        C1460x t10 = this.f14315e.t();
                                        if (editable.length() > 0) {
                                            i12 = Integer.parseInt(editable.toString());
                                        } else {
                                            i12 = 0;
                                        }
                                        int i14 = i12;
                                        p2.e eVar3 = (p2.e) t10.f14370c.f();
                                        if (eVar3 != null) {
                                            t10.f14369b.g(p2.e.g(eVar3, null, null, 0, false, i14, false, false, 479));
                                        }
                                        return y.f7506a;
                                }
                            }
                        });
                        E2.d.M(e11, new J3.s(0, t(), C1460x.class, "toggleInfiniteRepeat", "toggleInfiniteRepeat()V", 0, 0, 22));
                        ((TextInputEditText) e10.f283h).setFilters(new K2.i[]{new K2.i(1, 1440)});
                        E2.d.P(e10, R.string.input_field_label_maximum_duration, R.drawable.ic_infinite, true);
                        final int i11 = 2;
                        E2.d.N(e10, new InterfaceC1163b(this) { // from class: r3.a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ C1450n f14315e;

                            {
                                this.f14315e = this;
                            }

                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj) {
                                int i112;
                                int i12;
                                Editable editable = (Editable) obj;
                                switch (i11) {
                                    case 0:
                                        o6.j.e(editable, "it");
                                        C1460x t8 = this.f14315e.t();
                                        String obj2 = editable.toString();
                                        o6.j.e(obj2, "name");
                                        p2.e eVar = (p2.e) t8.f14370c.f();
                                        if (eVar != null) {
                                            t8.f14369b.g(p2.e.g(eVar, obj2, null, 0, false, 0, false, false, 509));
                                        }
                                        return y.f7506a;
                                    case 1:
                                        o6.j.e(editable, "it");
                                        C1460x t9 = this.f14315e.t();
                                        if (editable.length() > 0) {
                                            i112 = Integer.parseInt(editable.toString());
                                        } else {
                                            i112 = 0;
                                        }
                                        int i13 = i112;
                                        p2.e eVar2 = (p2.e) t9.f14370c.f();
                                        if (eVar2 != null) {
                                            t9.f14369b.g(p2.e.g(eVar2, null, null, i13, false, 0, false, false, 503));
                                        }
                                        return y.f7506a;
                                    default:
                                        o6.j.e(editable, "it");
                                        C1460x t10 = this.f14315e.t();
                                        if (editable.length() > 0) {
                                            i12 = Integer.parseInt(editable.toString());
                                        } else {
                                            i12 = 0;
                                        }
                                        int i14 = i12;
                                        p2.e eVar3 = (p2.e) t10.f14370c.f();
                                        if (eVar3 != null) {
                                            t10.f14369b.g(p2.e.g(eVar3, null, null, 0, false, i14, false, false, 479));
                                        }
                                        return y.f7506a;
                                }
                            }
                        });
                        int i12 = 0;
                        E2.d.M(e10, new J3.s(0, t(), C1460x.class, "toggleInfiniteMaxDuration", "toggleInfiniteMaxDuration()V", i12, 0, 23));
                        String string = h().getResources().getString(R.string.input_field_label_anti_detection);
                        o6.j.d(string, "getString(...)");
                        X.W(cVar, string);
                        X.X(cVar, AbstractC0437l.X(h().getString(R.string.dropdown_helper_text_anti_detection_disabled), h().getString(R.string.dropdown_helper_text_anti_detection_enabled)));
                        E2.b.J(e9, new J3.s(0, t(), C1460x.class, "toggleRandomization", "toggleRandomization()V", 0, i12, 24));
                        this.f14341m = dVar;
                        o6.j.d(nestedScrollView, "getRoot(...)");
                        return nestedScrollView;
                    }
                    i9 = R.id.field_repeat_count;
                }
            }
            i9 = i10;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i9)));
    }

    @Override // B1.h
    public final void q() {
        AbstractC0166y.q(U.e(this), null, null, new C1448l(this, null), 3);
    }

    public final C1460x t() {
        return (C1460x) this.f14340l.getValue();
    }
}
