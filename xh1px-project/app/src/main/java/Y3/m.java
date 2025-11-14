package Y3;

import K3.C0091e;
import L7.AbstractC0166y;
import a6.AbstractC0437l;
import android.text.Editable;
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
import n6.InterfaceC1163b;
import q4.X;
import z1.ViewOnFocusChangeListenerC1853a;

/* loaded from: classes.dex */
public final class m extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final C0091e f7138u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.d f7139v;

    /* renamed from: w, reason: collision with root package name */
    public A4.a f7140w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C0091e c0091e) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        o6.j.e(c0091e, "listener");
        this.f7138u = c0091e;
        this.f7139v = new A4.d(o6.v.f13643a.b(A.class), new l(this, 0), new l(this, 1), new D4.z(24, this));
    }

    public static void G(m mVar, View view) {
        o6.j.e(view, "it");
        mVar.f7138u.a();
        super.a();
    }

    public static void H(m mVar) {
        mVar.f7138u.c();
        super.a();
    }

    public static void I(m mVar, View view) {
        o6.j.e(view, "it");
        mVar.f7138u.b();
        super.a();
    }

    @Override // z1.b
    public final ViewGroup E() {
        final int i4 = 0;
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_action_system, (ViewGroup) null, false);
        int i8 = R.id.field_name;
        View r8 = E2.b.r(inflate, R.id.field_name);
        if (r8 != null) {
            A.i a3 = A.i.a(r8);
            TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
            int i9 = R.id.field_type;
            View r9 = E2.b.r(inflate, R.id.field_type);
            if (r9 != null) {
                A4.a f8 = A4.a.f(r9);
                i9 = R.id.layout_top_bar;
                View r10 = E2.b.r(inflate, R.id.layout_top_bar);
                if (r10 != null) {
                    A4.d a4 = A4.d.a(r10);
                    LinearLayout linearLayout = (LinearLayout) inflate;
                    A4.a aVar = new A4.a(linearLayout, a3, f8, a4, 5);
                    ((MaterialTextView) a4.f298h).setText(R.string.dialog_title_system_action);
                    A((MaterialButton) a4.f297g, new InterfaceC1163b(this) { // from class: Y3.a

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ m f7115e;

                        {
                            this.f7115e = this;
                        }

                        @Override // n6.InterfaceC1163b
                        public final Object m(Object obj) {
                            switch (i4) {
                                case 0:
                                    o6.j.e((View) obj, "it");
                                    this.f7115e.a();
                                    break;
                                case 1:
                                    m.G(this.f7115e, (View) obj);
                                    break;
                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                    m.I(this.f7115e, (View) obj);
                                    break;
                                default:
                                    Editable editable = (Editable) obj;
                                    o6.j.e(editable, "it");
                                    A J6 = this.f7115e.J();
                                    String obj2 = editable.toString();
                                    o6.j.e(obj2, "name");
                                    H3.n nVar = J6.f7107b;
                                    f2.m mVar = (f2.m) nVar.f1950e.a();
                                    if (mVar != null) {
                                        nVar.j(f2.m.i(mVar, null, null, obj2, 0, null, 27));
                                    }
                                    return Z5.y.f7506a;
                            }
                            return Z5.y.f7506a;
                        }
                    });
                    MaterialButton materialButton = (MaterialButton) a4.f299i;
                    materialButton.setVisibility(0);
                    final int i10 = 1;
                    A(materialButton, new InterfaceC1163b(this) { // from class: Y3.a

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ m f7115e;

                        {
                            this.f7115e = this;
                        }

                        @Override // n6.InterfaceC1163b
                        public final Object m(Object obj) {
                            switch (i10) {
                                case 0:
                                    o6.j.e((View) obj, "it");
                                    this.f7115e.a();
                                    break;
                                case 1:
                                    m.G(this.f7115e, (View) obj);
                                    break;
                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                    m.I(this.f7115e, (View) obj);
                                    break;
                                default:
                                    Editable editable = (Editable) obj;
                                    o6.j.e(editable, "it");
                                    A J6 = this.f7115e.J();
                                    String obj2 = editable.toString();
                                    o6.j.e(obj2, "name");
                                    H3.n nVar = J6.f7107b;
                                    f2.m mVar = (f2.m) nVar.f1950e.a();
                                    if (mVar != null) {
                                        nVar.j(f2.m.i(mVar, null, null, obj2, 0, null, 27));
                                    }
                                    return Z5.y.f7506a;
                            }
                            return Z5.y.f7506a;
                        }
                    });
                    MaterialButton materialButton2 = (MaterialButton) a4.f296f;
                    materialButton2.setVisibility(0);
                    final int i11 = 2;
                    A(materialButton2, new InterfaceC1163b(this) { // from class: Y3.a

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ m f7115e;

                        {
                            this.f7115e = this;
                        }

                        @Override // n6.InterfaceC1163b
                        public final Object m(Object obj) {
                            switch (i11) {
                                case 0:
                                    o6.j.e((View) obj, "it");
                                    this.f7115e.a();
                                    break;
                                case 1:
                                    m.G(this.f7115e, (View) obj);
                                    break;
                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                    m.I(this.f7115e, (View) obj);
                                    break;
                                default:
                                    Editable editable = (Editable) obj;
                                    o6.j.e(editable, "it");
                                    A J6 = this.f7115e.J();
                                    String obj2 = editable.toString();
                                    o6.j.e(obj2, "name");
                                    H3.n nVar = J6.f7107b;
                                    f2.m mVar = (f2.m) nVar.f1950e.a();
                                    if (mVar != null) {
                                        nVar.j(f2.m.i(mVar, null, null, obj2, 0, null, 27));
                                    }
                                    return Z5.y.f7506a;
                            }
                            return Z5.y.f7506a;
                        }
                    });
                    ((TextInputLayout) a3.f88e).setHint(R.string.generic_name);
                    textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                    final int i12 = 3;
                    E2.c.x0(a3, new InterfaceC1163b(this) { // from class: Y3.a

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ m f7115e;

                        {
                            this.f7115e = this;
                        }

                        @Override // n6.InterfaceC1163b
                        public final Object m(Object obj) {
                            switch (i12) {
                                case 0:
                                    o6.j.e((View) obj, "it");
                                    this.f7115e.a();
                                    break;
                                case 1:
                                    m.G(this.f7115e, (View) obj);
                                    break;
                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                    m.I(this.f7115e, (View) obj);
                                    break;
                                default:
                                    Editable editable = (Editable) obj;
                                    o6.j.e(editable, "it");
                                    A J6 = this.f7115e.J();
                                    String obj2 = editable.toString();
                                    o6.j.e(obj2, "name");
                                    H3.n nVar = J6.f7107b;
                                    f2.m mVar = (f2.m) nVar.f1950e.a();
                                    if (mVar != null) {
                                        nVar.j(f2.m.i(mVar, null, null, obj2, 0, null, 27));
                                    }
                                    return Z5.y.f7506a;
                            }
                            return Z5.y.f7506a;
                        }
                    });
                    textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, this));
                    D2.f.J(f8, AbstractC0437l.X(n.f7141c, o.f7142c, p.f7143c), new W4.i(i10, J(), A.class, "setType", "setType(Lcom/buzbuz/smartautoclicker/feature/smart/config/ui/action/system/SystemActionTypeItem;)V", 0, 0, 6), k().getString(R.string.field_dropdown_system_action_type_title), 120);
                    this.f7140w = aVar;
                    o6.j.d(linearLayout, "getRoot(...)");
                    return linearLayout;
                }
            }
            i8 = i9;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(U.e(this), null, null, new e(this, null), 3);
        AbstractC0166y.q(U.e(this), null, null, new k(this, null), 3);
    }

    public final A J() {
        return (A) this.f7139v.getValue();
    }

    @Override // w1.e
    public final void a() {
        if (((Boolean) J().f7108c.f4088d.f()).booleanValue()) {
            X.Y(k(), R.string.warning_dialog_message_close_without_saving, new B0.e(13, this));
        } else {
            this.f7138u.c();
            super.a();
        }
    }
}
