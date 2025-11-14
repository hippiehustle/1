package Z3;

import K3.C0091e;
import L7.AbstractC0166y;
import a6.AbstractC0437l;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import l5.DialogC1035e;
import n6.InterfaceC1163b;
import q4.X;
import z1.ViewOnFocusChangeListenerC1853a;

/* loaded from: classes.dex */
public final class D extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final C0091e f7322u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.d f7323v;

    /* renamed from: w, reason: collision with root package name */
    public A4.d f7324w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C0091e c0091e) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        o6.j.e(c0091e, "listener");
        this.f7322u = c0091e;
        this.f7323v = new A4.d(o6.v.f13643a.b(N.class), new C(this, 0), new C(this, 1), new D4.z(26, this));
    }

    public static void G(D d2, View view) {
        o6.j.e(view, "it");
        d2.f7322u.b();
        super.a();
    }

    public static void H(D d2) {
        d2.f7322u.c();
        super.a();
    }

    public static void I(D d2, View view) {
        o6.j.e(view, "it");
        d2.f7322u.a();
        super.a();
    }

    @Override // z1.b
    public final ViewGroup E() {
        Integer valueOf = Integer.valueOf(R.drawable.ic_cancel);
        Integer valueOf2 = Integer.valueOf(R.drawable.ic_invert);
        Integer valueOf3 = Integer.valueOf(R.drawable.ic_confirm);
        final int i4 = 0;
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_action_toggle_event, (ViewGroup) null, false);
        int i8 = R.id.field_multi_state_toggle_all;
        View r8 = E2.b.r(inflate, R.id.field_multi_state_toggle_all);
        if (r8 != null) {
            A4.c c6 = A4.c.c(r8);
            A4.a aVar = (A4.a) c6.f292f;
            A4.c cVar = (A4.c) c6.f293g;
            View r9 = E2.b.r(inflate, R.id.field_name);
            if (r9 != null) {
                A.i a3 = A.i.a(r9);
                TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
                int i9 = R.id.field_selection_toggles;
                View r10 = E2.b.r(inflate, R.id.field_selection_toggles);
                if (r10 != null) {
                    int i10 = R.id.chevron;
                    if (((AppCompatImageView) E2.b.r(r10, R.id.chevron)) != null) {
                        i10 = R.id.children_container;
                        View r11 = E2.b.r(r10, R.id.children_container);
                        if (r11 != null) {
                            int i11 = R.id.icon_left;
                            ImageView imageView = (ImageView) E2.b.r(r11, R.id.icon_left);
                            if (imageView != null) {
                                i11 = R.id.icon_middle;
                                ImageView imageView2 = (ImageView) E2.b.r(r11, R.id.icon_middle);
                                if (imageView2 != null) {
                                    i11 = R.id.icon_right;
                                    ImageView imageView3 = (ImageView) E2.b.r(r11, R.id.icon_right);
                                    if (imageView3 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) r11;
                                        i11 = R.id.text_left;
                                        TextView textView = (TextView) E2.b.r(r11, R.id.text_left);
                                        if (textView != null) {
                                            i11 = R.id.text_middle;
                                            TextView textView2 = (TextView) E2.b.r(r11, R.id.text_middle);
                                            if (textView2 != null) {
                                                i11 = R.id.text_right;
                                                TextView textView3 = (TextView) E2.b.r(r11, R.id.text_right);
                                                if (textView3 != null) {
                                                    A4.a aVar2 = new A4.a(constraintLayout, imageView, imageView2, imageView3, textView, textView2, textView3);
                                                    i10 = R.id.description;
                                                    MaterialTextView materialTextView = (MaterialTextView) E2.b.r(r10, R.id.description);
                                                    if (materialTextView != null) {
                                                        i10 = R.id.title;
                                                        MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(r10, R.id.title);
                                                        if (materialTextView2 != null) {
                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) r10;
                                                            A4.a aVar3 = new A4.a(constraintLayout2, aVar2, materialTextView, materialTextView2, 13);
                                                            i9 = R.id.layout_top_bar;
                                                            View r12 = E2.b.r(inflate, R.id.layout_top_bar);
                                                            if (r12 != null) {
                                                                A4.d a4 = A4.d.a(r12);
                                                                i9 = R.id.toggle_type_card;
                                                                if (((MaterialCardView) E2.b.r(inflate, R.id.toggle_type_card)) != null) {
                                                                    LinearLayout linearLayout = (LinearLayout) inflate;
                                                                    A4.d dVar = new A4.d(linearLayout, c6, a3, aVar3, a4, 3);
                                                                    ((MaterialTextView) a4.f298h).setText(R.string.dialog_title_toggle_event);
                                                                    A((MaterialButton) a4.f297g, new InterfaceC1163b(this) { // from class: Z3.p

                                                                        /* renamed from: e, reason: collision with root package name */
                                                                        public final /* synthetic */ D f7395e;

                                                                        {
                                                                            this.f7395e = this;
                                                                        }

                                                                        @Override // n6.InterfaceC1163b
                                                                        public final Object m(Object obj) {
                                                                            switch (i4) {
                                                                                case 0:
                                                                                    o6.j.e((View) obj, "it");
                                                                                    this.f7395e.a();
                                                                                    break;
                                                                                case 1:
                                                                                    D.I(this.f7395e, (View) obj);
                                                                                    break;
                                                                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                    D.G(this.f7395e, (View) obj);
                                                                                    break;
                                                                                default:
                                                                                    Editable editable = (Editable) obj;
                                                                                    o6.j.e(editable, "it");
                                                                                    N J6 = this.f7395e.J();
                                                                                    String obj2 = editable.toString();
                                                                                    o6.j.e(obj2, "name");
                                                                                    H3.n nVar = J6.f7351b;
                                                                                    f2.o oVar = (f2.o) nVar.f1950e.a();
                                                                                    if (oVar != null) {
                                                                                        nVar.j(f2.o.i(oVar, null, null, obj2, 0, false, null, null, 123));
                                                                                    }
                                                                                    return Z5.y.f7506a;
                                                                            }
                                                                            return Z5.y.f7506a;
                                                                        }
                                                                    });
                                                                    MaterialButton materialButton = (MaterialButton) a4.f299i;
                                                                    materialButton.setVisibility(0);
                                                                    final int i12 = 1;
                                                                    A(materialButton, new InterfaceC1163b(this) { // from class: Z3.p

                                                                        /* renamed from: e, reason: collision with root package name */
                                                                        public final /* synthetic */ D f7395e;

                                                                        {
                                                                            this.f7395e = this;
                                                                        }

                                                                        @Override // n6.InterfaceC1163b
                                                                        public final Object m(Object obj) {
                                                                            switch (i12) {
                                                                                case 0:
                                                                                    o6.j.e((View) obj, "it");
                                                                                    this.f7395e.a();
                                                                                    break;
                                                                                case 1:
                                                                                    D.I(this.f7395e, (View) obj);
                                                                                    break;
                                                                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                    D.G(this.f7395e, (View) obj);
                                                                                    break;
                                                                                default:
                                                                                    Editable editable = (Editable) obj;
                                                                                    o6.j.e(editable, "it");
                                                                                    N J6 = this.f7395e.J();
                                                                                    String obj2 = editable.toString();
                                                                                    o6.j.e(obj2, "name");
                                                                                    H3.n nVar = J6.f7351b;
                                                                                    f2.o oVar = (f2.o) nVar.f1950e.a();
                                                                                    if (oVar != null) {
                                                                                        nVar.j(f2.o.i(oVar, null, null, obj2, 0, false, null, null, 123));
                                                                                    }
                                                                                    return Z5.y.f7506a;
                                                                            }
                                                                            return Z5.y.f7506a;
                                                                        }
                                                                    });
                                                                    MaterialButton materialButton2 = (MaterialButton) a4.f296f;
                                                                    materialButton2.setVisibility(0);
                                                                    final int i13 = 2;
                                                                    A(materialButton2, new InterfaceC1163b(this) { // from class: Z3.p

                                                                        /* renamed from: e, reason: collision with root package name */
                                                                        public final /* synthetic */ D f7395e;

                                                                        {
                                                                            this.f7395e = this;
                                                                        }

                                                                        @Override // n6.InterfaceC1163b
                                                                        public final Object m(Object obj) {
                                                                            switch (i13) {
                                                                                case 0:
                                                                                    o6.j.e((View) obj, "it");
                                                                                    this.f7395e.a();
                                                                                    break;
                                                                                case 1:
                                                                                    D.I(this.f7395e, (View) obj);
                                                                                    break;
                                                                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                    D.G(this.f7395e, (View) obj);
                                                                                    break;
                                                                                default:
                                                                                    Editable editable = (Editable) obj;
                                                                                    o6.j.e(editable, "it");
                                                                                    N J6 = this.f7395e.J();
                                                                                    String obj2 = editable.toString();
                                                                                    o6.j.e(obj2, "name");
                                                                                    H3.n nVar = J6.f7351b;
                                                                                    f2.o oVar = (f2.o) nVar.f1950e.a();
                                                                                    if (oVar != null) {
                                                                                        nVar.j(f2.o.i(oVar, null, null, obj2, 0, false, null, null, 123));
                                                                                    }
                                                                                    return Z5.y.f7506a;
                                                                            }
                                                                            return Z5.y.f7506a;
                                                                        }
                                                                    });
                                                                    ((TextInputLayout) a3.f88e).setHint(R.string.generic_name);
                                                                    final int i14 = 3;
                                                                    E2.c.x0(a3, new InterfaceC1163b(this) { // from class: Z3.p

                                                                        /* renamed from: e, reason: collision with root package name */
                                                                        public final /* synthetic */ D f7395e;

                                                                        {
                                                                            this.f7395e = this;
                                                                        }

                                                                        @Override // n6.InterfaceC1163b
                                                                        public final Object m(Object obj) {
                                                                            switch (i14) {
                                                                                case 0:
                                                                                    o6.j.e((View) obj, "it");
                                                                                    this.f7395e.a();
                                                                                    break;
                                                                                case 1:
                                                                                    D.I(this.f7395e, (View) obj);
                                                                                    break;
                                                                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                    D.G(this.f7395e, (View) obj);
                                                                                    break;
                                                                                default:
                                                                                    Editable editable = (Editable) obj;
                                                                                    o6.j.e(editable, "it");
                                                                                    N J6 = this.f7395e.J();
                                                                                    String obj2 = editable.toString();
                                                                                    o6.j.e(obj2, "name");
                                                                                    H3.n nVar = J6.f7351b;
                                                                                    f2.o oVar = (f2.o) nVar.f1950e.a();
                                                                                    if (oVar != null) {
                                                                                        nVar.j(f2.o.i(oVar, null, null, obj2, 0, false, null, null, 123));
                                                                                    }
                                                                                    return Z5.y.f7506a;
                                                                            }
                                                                            return Z5.y.f7506a;
                                                                        }
                                                                    });
                                                                    textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                                                                    textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, this));
                                                                    String string = k().getString(R.string.field_change_all_title);
                                                                    o6.j.d(string, "getString(...)");
                                                                    X.W(cVar, string);
                                                                    X.X(cVar, AbstractC0437l.X(k().getString(R.string.field_change_all_desc_manual), k().getString(R.string.field_change_all_desc_enable_all), k().getString(R.string.field_change_all_desc_invert_all), k().getString(R.string.field_change_all_desc_disable_all)));
                                                                    E2.c.B0(aVar, new B2.e(AbstractC0437l.X(valueOf3, valueOf2, valueOf), false));
                                                                    E2.c.v0(aVar, new W4.i(1, J(), N.class, "setToggleAllType", "setToggleAllType(Ljava/lang/Integer;)V", 0, 0, 7));
                                                                    List X8 = AbstractC0437l.X(valueOf3, valueOf2, valueOf);
                                                                    int size = X8.size();
                                                                    if (1 <= size && size < 4) {
                                                                        imageView.setImageResource(((Number) X8.get(0)).intValue());
                                                                        if (X8.size() > 1) {
                                                                            imageView2.setVisibility(0);
                                                                            textView2.setVisibility(0);
                                                                            imageView2.setImageResource(((Number) X8.get(1)).intValue());
                                                                        } else {
                                                                            imageView2.setVisibility(8);
                                                                            textView2.setVisibility(8);
                                                                        }
                                                                        if (X8.size() > 2) {
                                                                            imageView3.setVisibility(0);
                                                                            textView3.setVisibility(0);
                                                                            imageView3.setImageResource(((Number) X8.get(2)).intValue());
                                                                        } else {
                                                                            imageView3.setVisibility(8);
                                                                            textView3.setVisibility(8);
                                                                        }
                                                                        constraintLayout2.setOnClickListener(new B2.b(4, new q(this, i4)));
                                                                        this.f7324w = dVar;
                                                                        o6.j.d(linearLayout, "getRoot(...)");
                                                                        return linearLayout;
                                                                    }
                                                                    throw new IllegalArgumentException("Container Children should have 1 to 3 entries");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(r11.getResources().getResourceName(i11)));
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(r10.getResources().getResourceName(i10)));
                }
                i8 = i9;
            } else {
                i8 = R.id.field_name;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(U.e(this), null, null, new u(this, null), 3);
        AbstractC0166y.q(U.e(this), null, null, new B(this, null), 3);
    }

    public final N J() {
        return (N) this.f7323v.getValue();
    }

    @Override // w1.e
    public final void a() {
        if (((Boolean) J().f7352c.f4088d.f()).booleanValue()) {
            X.Y(k(), R.string.warning_dialog_message_close_without_saving, new q(this, 1));
        } else {
            this.f7322u.c();
            super.a();
        }
    }
}
