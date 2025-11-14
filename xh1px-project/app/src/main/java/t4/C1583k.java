package t4;

import D4.B;
import L7.AbstractC0166y;
import a6.AbstractC0437l;
import android.content.Context;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.slider.Slider;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import j3.C0933s;
import l2.C1001a;
import q4.X;
import r2.C1429a;
import z1.ViewOnFocusChangeListenerC1853a;

/* renamed from: t4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1583k extends B1.h {

    /* renamed from: l, reason: collision with root package name */
    public final A4.d f15081l;

    /* renamed from: m, reason: collision with root package name */
    public F3.a f15082m;

    public C1583k(Context context) {
        super(context);
        this.f15081l = new A4.d(o6.v.f13643a.b(x.class), new C1582j(this, 0), new C1582j(this, 1), new C0933s(20, this));
    }

    @Override // B1.h
    public final ViewGroup n(ViewGroup viewGroup) {
        final int i4 = 0;
        View inflate = LayoutInflater.from(h()).inflate(R.layout.content_scenario_config, viewGroup, false);
        int i8 = R.id.detection_quality_card;
        if (((MaterialCardView) E2.b.r(inflate, R.id.detection_quality_card)) != null) {
            i8 = R.id.detection_quality_title;
            if (((MaterialTextView) E2.b.r(inflate, R.id.detection_quality_title)) != null) {
                i8 = R.id.detection_quality_value_card;
                if (((MaterialCardView) E2.b.r(inflate, R.id.detection_quality_value_card)) != null) {
                    i8 = R.id.detection_resolution_description;
                    if (((MaterialTextView) E2.b.r(inflate, R.id.detection_resolution_description)) != null) {
                        i8 = R.id.divider_resolution;
                        if (((MaterialDivider) E2.b.r(inflate, R.id.divider_resolution)) != null) {
                            i8 = R.id.field_anti_detection;
                            View r8 = E2.b.r(inflate, R.id.field_anti_detection);
                            if (r8 != null) {
                                A4.c e9 = A4.c.e(r8);
                                A4.c cVar = (A4.c) e9.f292f;
                                View r9 = E2.b.r(inflate, R.id.field_keep_screen_on);
                                if (r9 != null) {
                                    A4.c e10 = A4.c.e(r9);
                                    A4.c cVar2 = (A4.c) e10.f292f;
                                    int i9 = R.id.field_scenario_name;
                                    View r10 = E2.b.r(inflate, R.id.field_scenario_name);
                                    if (r10 != null) {
                                        A.i a3 = A.i.a(r10);
                                        TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
                                        i9 = R.id.seekbar_resolution;
                                        Slider slider = (Slider) E2.b.r(inflate, R.id.seekbar_resolution);
                                        if (slider != null) {
                                            i9 = R.id.text_precision;
                                            MaterialButton materialButton = (MaterialButton) E2.b.r(inflate, R.id.text_precision);
                                            if (materialButton != null) {
                                                i9 = R.id.text_quality_value;
                                                MaterialTextView materialTextView = (MaterialTextView) E2.b.r(inflate, R.id.text_quality_value);
                                                if (materialTextView != null) {
                                                    i9 = R.id.text_speed;
                                                    MaterialButton materialButton2 = (MaterialButton) E2.b.r(inflate, R.id.text_speed);
                                                    if (materialButton2 != null) {
                                                        NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                                        F3.a aVar = new F3.a(nestedScrollView, e9, e10, a3, slider, materialButton, materialTextView, materialButton2);
                                                        ((TextInputLayout) a3.f88e).setHint(R.string.input_field_label_scenario_name);
                                                        E2.c.x0(a3, new C1429a(2, this));
                                                        final int i10 = 1;
                                                        textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(h().getResources().getInteger(R.integer.name_max_length))});
                                                        textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, i()));
                                                        String string = h().getResources().getString(R.string.input_field_label_anti_detection);
                                                        o6.j.d(string, "getString(...)");
                                                        X.W(cVar, string);
                                                        X.X(cVar, AbstractC0437l.X(h().getString(R.string.dropdown_helper_text_anti_detection_disabled), h().getString(R.string.dropdown_helper_text_anti_detection_enabled)));
                                                        int i11 = 0;
                                                        int i12 = 0;
                                                        int i13 = 0;
                                                        E2.b.J(e9, new J3.s(i12, t(), x.class, "toggleRandomization", "toggleRandomization()V", i13, i11, 25));
                                                        String string2 = h().getResources().getString(R.string.field_scenario_keep_screen_on_title);
                                                        o6.j.d(string2, "getString(...)");
                                                        X.W(cVar2, string2);
                                                        X.X(cVar2, AbstractC0437l.X(h().getString(R.string.field_scenario_keep_screen_on_disabled), h().getString(R.string.field_scenario_keep_screen_on_enabled)));
                                                        E2.b.J(e10, new J3.s(i12, t(), x.class, "toggleKeepScreenOn", "toggleKeepScreenOn()V", i13, i11, 26));
                                                        materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: t4.a

                                                            /* renamed from: e, reason: collision with root package name */
                                                            public final /* synthetic */ C1583k f15062e;

                                                            {
                                                                this.f15062e = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                switch (i4) {
                                                                    case 0:
                                                                        x t8 = this.f15062e.t();
                                                                        if (t8.f15114c.f1950e.g() != null) {
                                                                            t8.e(r0.f12192c - 1);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    default:
                                                                        x t9 = this.f15062e.t();
                                                                        C1001a g8 = t9.f15114c.f1950e.g();
                                                                        if (g8 != null) {
                                                                            t9.e(g8.f12192c + 1);
                                                                            return;
                                                                        }
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: t4.a

                                                            /* renamed from: e, reason: collision with root package name */
                                                            public final /* synthetic */ C1583k f15062e;

                                                            {
                                                                this.f15062e = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                switch (i10) {
                                                                    case 0:
                                                                        x t8 = this.f15062e.t();
                                                                        if (t8.f15114c.f1950e.g() != null) {
                                                                            t8.e(r0.f12192c - 1);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    default:
                                                                        x t9 = this.f15062e.t();
                                                                        C1001a g8 = t9.f15114c.f1950e.g();
                                                                        if (g8 != null) {
                                                                            t9.e(g8.f12192c + 1);
                                                                            return;
                                                                        }
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        slider.f2157p.add(new B(3, this));
                                                        this.f15082m = aVar;
                                                        o6.j.d(nestedScrollView, "getRoot(...)");
                                                        return nestedScrollView;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i8 = i9;
                                } else {
                                    i8 = R.id.field_keep_screen_on;
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
        AbstractC0166y.q(U.e(this), null, null, new C1581i(this, null), 3);
    }

    public final x t() {
        return (x) this.f15081l.getValue();
    }
}
