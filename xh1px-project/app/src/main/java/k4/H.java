package k4;

import L7.AbstractC0166y;
import a6.AbstractC0437l;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.slider.Slider;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import j3.C0933s;
import java.util.ArrayList;
import l4.C1030j;
import l5.DialogC1035e;
import z1.ViewOnFocusChangeListenerC1853a;

/* loaded from: classes.dex */
public final class H extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final C1030j f12020u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.d f12021v;

    /* renamed from: w, reason: collision with root package name */
    public F3.d f12022w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C1030j c1030j) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        o6.j.e(c1030j, "listener");
        this.f12020u = c1030j;
        this.f12021v = new A4.d(o6.v.f13643a.b(X.class), new G(this, 0), new G(this, 1), new C0933s(5, this));
    }

    public static void G(H h8, View view) {
        o6.j.e(view, "it");
        h8.f12020u.a();
        super.a();
    }

    public static void H(H h8) {
        h8.f12020u.c();
        super.a();
    }

    @Override // z1.b
    public final ViewGroup E() {
        E2.e eVar;
        D4.B b4;
        E2.e eVar2;
        E2.e eVar3;
        D4.B b9;
        E2.e eVar4;
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_condition_image, (ViewGroup) null, false);
        int i4 = R.id.field_detection_type;
        View r8 = E2.b.r(inflate, R.id.field_detection_type);
        if (r8 != null) {
            A4.c c6 = A4.c.c(r8);
            A4.a aVar = (A4.a) c6.f292f;
            A4.c cVar = (A4.c) c6.f293g;
            int i8 = R.id.field_edit_name;
            View r9 = E2.b.r(inflate, R.id.field_edit_name);
            if (r9 != null) {
                A.i a3 = A.i.a(r9);
                TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
                int i9 = R.id.field_select_area;
                View r10 = E2.b.r(inflate, R.id.field_select_area);
                if (r10 != null) {
                    A4.c d2 = A4.c.d(r10);
                    i9 = R.id.field_should_appear;
                    View r11 = E2.b.r(inflate, R.id.field_should_appear);
                    if (r11 != null) {
                        A4.c e9 = A4.c.e(r11);
                        A4.c cVar2 = (A4.c) e9.f292f;
                        View r12 = E2.b.r(inflate, R.id.field_slider_threshold);
                        if (r12 != null) {
                            int i10 = R.id.slider;
                            Slider slider = (Slider) E2.b.r(r12, R.id.slider);
                            if (slider != null) {
                                ArrayList arrayList = slider.f2157p;
                                MaterialTextView materialTextView = (MaterialTextView) E2.b.r(r12, R.id.title);
                                if (materialTextView != null) {
                                    MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(r12, R.id.value);
                                    if (materialTextView2 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) r12;
                                        A4.c cVar3 = new A4.c(constraintLayout, slider, materialTextView, materialTextView2);
                                        i8 = R.id.image_condition;
                                        ImageView imageView = (ImageView) E2.b.r(inflate, R.id.image_condition);
                                        if (imageView != null) {
                                            i8 = R.id.layout_top_bar;
                                            View r13 = E2.b.r(inflate, R.id.layout_top_bar);
                                            if (r13 != null) {
                                                A4.d a4 = A4.d.a(r13);
                                                LinearLayout linearLayout = (LinearLayout) inflate;
                                                F3.d dVar = new F3.d(linearLayout, c6, a3, d2, e9, cVar3, imageView, a4, 0);
                                                ((MaterialTextView) a4.f298h).setText(R.string.dialog_title_condition_config);
                                                A((MaterialButton) a4.f297g, new r(this, 0));
                                                MaterialButton materialButton = (MaterialButton) a4.f299i;
                                                materialButton.setVisibility(0);
                                                int i11 = 1;
                                                A(materialButton, new r(this, i11));
                                                MaterialButton materialButton2 = (MaterialButton) a4.f296f;
                                                materialButton2.setVisibility(0);
                                                int i12 = 2;
                                                A(materialButton2, new r(this, i12));
                                                ((TextInputLayout) a3.f88e).setHint(R.string.generic_name);
                                                E2.c.x0(a3, new r(this, 3));
                                                textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                                                textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, this));
                                                String string = k().getString(R.string.field_condition_visibility_title);
                                                o6.j.d(string, "getString(...)");
                                                q4.X.W(cVar2, string);
                                                q4.X.X(cVar2, AbstractC0437l.X(k().getString(R.string.field_condition_visibility_desc_absent), k().getString(R.string.field_condition_visibility_desc_present)));
                                                E2.b.J(e9, new C0986s(this, i11));
                                                String string2 = k().getString(R.string.field_detection_type_title);
                                                o6.j.d(string2, "getString(...)");
                                                q4.X.W(cVar, string2);
                                                E2.c.B0(aVar, new B2.e(AbstractC0437l.X(Integer.valueOf(R.drawable.ic_detect_exact), Integer.valueOf(R.drawable.ic_detect_whole_screen), Integer.valueOf(R.drawable.ic_detect_in_area)), true));
                                                q4.X.X(cVar, AbstractC0437l.X(k().getString(R.string.field_detection_type_desc_exact), k().getString(R.string.field_detection_type_desc_screen), k().getString(R.string.field_select_detection_area_title)));
                                                E2.c.v0(aVar, new r(this, 4));
                                                String string3 = k().getString(R.string.field_select_detection_area_title);
                                                o6.j.d(string3, "getString(...)");
                                                E2.c.A0(d2, string3);
                                                E2.c.w0(d2, new C0986s(this, i12));
                                                String string4 = k().getString(R.string.field_title_condition_threshold);
                                                o6.j.d(string4, "getString(...)");
                                                E2.c.z0(materialTextView, string4);
                                                Object tag = constraintLayout.getTag();
                                                if (tag instanceof E2.e) {
                                                    eVar = (E2.e) tag;
                                                } else {
                                                    eVar = null;
                                                }
                                                if (eVar != null) {
                                                    b4 = eVar.f1190b;
                                                } else {
                                                    b4 = null;
                                                }
                                                if (b4 != null) {
                                                    arrayList.remove(b4);
                                                }
                                                D4.B b10 = new D4.B(1, cVar3);
                                                if (eVar != null) {
                                                    eVar2 = E2.e.a(eVar, b10, null, 4);
                                                } else {
                                                    eVar2 = new E2.e(b10, (D4.B) null, 4);
                                                }
                                                constraintLayout.setTag(eVar2);
                                                arrayList.add(b10);
                                                int value = (int) slider.getValue();
                                                String str = value + " %";
                                                if (str == null) {
                                                    str = String.valueOf(value);
                                                }
                                                E2.c.z0(materialTextView2, str);
                                                slider.setValueFrom(0.0f);
                                                slider.setValueTo(20.0f);
                                                r rVar = new r(this, 5);
                                                Object tag2 = constraintLayout.getTag();
                                                if (tag2 instanceof E2.e) {
                                                    eVar3 = (E2.e) tag2;
                                                } else {
                                                    eVar3 = null;
                                                }
                                                if (eVar3 != null) {
                                                    b9 = eVar3.f1191c;
                                                } else {
                                                    b9 = null;
                                                }
                                                if (b9 != null) {
                                                    arrayList.remove(b9);
                                                }
                                                D4.B b11 = new D4.B(2, rVar);
                                                if (eVar3 != null) {
                                                    eVar4 = E2.e.a(eVar3, null, b11, 3);
                                                } else {
                                                    eVar4 = new E2.e((D4.B) null, b11, 3);
                                                }
                                                constraintLayout.setTag(eVar4);
                                                arrayList.add(b11);
                                                this.f12022w = dVar;
                                                o6.j.d(linearLayout, "getRoot(...)");
                                                return linearLayout;
                                            }
                                        }
                                    } else {
                                        i10 = R.id.value;
                                    }
                                } else {
                                    i10 = R.id.title;
                                }
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(r12.getResources().getResourceName(i10)));
                        }
                        i4 = R.id.field_slider_threshold;
                    }
                }
                i4 = i9;
            }
            i4 = i8;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(androidx.lifecycle.U.e(this), null, null, new C0990w(this, null), 3);
        AbstractC0166y.q(androidx.lifecycle.U.e(this), null, null, new F(this, null), 3);
    }

    public final void I() {
        this.f12020u.b();
        super.a();
    }

    public final X J() {
        return (X) this.f12021v.getValue();
    }

    @Override // w1.e
    public final void a() {
        if (((Boolean) J().f12067e.f4088d.f()).booleanValue()) {
            q4.X.Y(k(), R.string.warning_dialog_message_close_without_saving, new C0986s(this, 3));
        } else {
            this.f12020u.c();
            super.a();
        }
    }

    @Override // z1.b, w1.e
    public final void v() {
        super.v();
        X J6 = J();
        F3.d dVar = this.f12022w;
        if (dVar != null) {
            J6.f12066d.a(J2.a.f2370l, (MaterialButton) ((A4.d) dVar.f1328l).f299i);
            X J8 = J();
            F3.d dVar2 = this.f12022w;
            if (dVar2 != null) {
                J8.f12066d.a(J2.a.f2371m, (MaterialButton) ((A4.a) ((A4.c) dVar2.f1325g).f292f).f282g);
                return;
            } else {
                o6.j.i("viewBinding");
                throw null;
            }
        }
        o6.j.i("viewBinding");
        throw null;
    }

    @Override // z1.b, w1.e
    public final void w() {
        super.w();
        J2.b bVar = J().f12066d;
        bVar.b(J2.a.f2370l);
        bVar.b(J2.a.f2371m);
    }
}
