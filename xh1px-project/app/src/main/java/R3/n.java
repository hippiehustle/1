package R3;

import L7.AbstractC0166y;
import O3.C0217o;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import g2.C0777a;
import l5.DialogC1035e;
import n6.InterfaceC1163b;
import o.p1;
import z1.ViewOnFocusChangeListenerC1853a;

/* loaded from: classes.dex */
public final class n extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final C0217o f5068u;

    /* renamed from: v, reason: collision with root package name */
    public final C0217o f5069v;

    /* renamed from: w, reason: collision with root package name */
    public final C0217o f5070w;

    /* renamed from: x, reason: collision with root package name */
    public final A4.d f5071x;

    /* renamed from: y, reason: collision with root package name */
    public p1 f5072y;

    public n(C0217o c0217o, C0217o c0217o2, C0217o c0217o3) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        this.f5068u = c0217o;
        this.f5069v = c0217o2;
        this.f5070w = c0217o3;
        this.f5071x = new A4.d(o6.v.f13643a.b(w.class), new m(this, 0), new m(this, 1), new D4.z(16, this));
    }

    @Override // z1.b
    public final ViewGroup E() {
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_action_intent_extra, (ViewGroup) null, false);
        int i4 = R.id.edit_boolean_value_field;
        View r8 = E2.b.r(inflate, R.id.edit_boolean_value_field);
        if (r8 != null) {
            A4.a f8 = A4.a.f(r8);
            i4 = R.id.edit_key_layout;
            View r9 = E2.b.r(inflate, R.id.edit_key_layout);
            if (r9 != null) {
                A.i a3 = A.i.a(r9);
                i4 = R.id.edit_value_field;
                View r10 = E2.b.r(inflate, R.id.edit_value_field);
                if (r10 != null) {
                    A.i a4 = A.i.a(r10);
                    i4 = R.id.extra_value_type_field;
                    View r11 = E2.b.r(inflate, R.id.extra_value_type_field);
                    if (r11 != null) {
                        A4.a f9 = A4.a.f(r11);
                        i4 = R.id.layout_top_bar;
                        View r12 = E2.b.r(inflate, R.id.layout_top_bar);
                        if (r12 != null) {
                            A4.d a9 = A4.d.a(r12);
                            i4 = R.id.layout_value_input;
                            FrameLayout frameLayout = (FrameLayout) E2.b.r(inflate, R.id.layout_value_input);
                            if (frameLayout != null) {
                                LinearLayout linearLayout = (LinearLayout) inflate;
                                p1 p1Var = new p1(linearLayout, f8, a3, a4, f9, a9, frameLayout, 3);
                                ((MaterialTextView) a9.f298h).setText(R.string.dialog_intent_extra_title);
                                final int i8 = 0;
                                A((MaterialButton) a9.f297g, new InterfaceC1163b(this) { // from class: R3.a

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ n f5043e;

                                    {
                                        this.f5043e = this;
                                    }

                                    @Override // n6.InterfaceC1163b
                                    public final Object m(Object obj) {
                                        C0777a b4;
                                        float f10;
                                        double d2;
                                        char c6;
                                        int i9 = i8;
                                        Z5.y yVar = Z5.y.f7506a;
                                        n nVar = this.f5043e;
                                        switch (i9) {
                                            case 0:
                                                o6.j.e((View) obj, "it");
                                                nVar.f5070w.a();
                                                nVar.a();
                                                return yVar;
                                            case 1:
                                                o6.j.e((View) obj, "it");
                                                nVar.f5068u.a();
                                                nVar.a();
                                                return yVar;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                o6.j.e((View) obj, "it");
                                                nVar.f5069v.a();
                                                nVar.a();
                                                return yVar;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                Editable editable = (Editable) obj;
                                                o6.j.e(editable, "it");
                                                w G8 = nVar.G();
                                                String obj2 = editable.toString();
                                                o6.j.e(obj2, "key");
                                                H3.n nVar2 = G8.f5096b;
                                                C0777a f11 = nVar2.f1950e.f();
                                                if (f11 != null) {
                                                    nVar2.l(C0777a.e(f11, null, null, obj2, 11));
                                                }
                                                return yVar;
                                            default:
                                                Editable editable2 = (Editable) obj;
                                                o6.j.e(editable2, "it");
                                                w G9 = nVar.G();
                                                String obj3 = editable2.toString();
                                                o6.j.e(obj3, "value");
                                                H3.n nVar3 = G9.f5096b;
                                                C0777a f12 = nVar3.f1950e.f();
                                                if (f12 != null) {
                                                    D2.d dVar = x.f5104a;
                                                    Object obj4 = f12.f11136d;
                                                    short s8 = 0;
                                                    r5 = 0;
                                                    byte b9 = 0;
                                                    r5 = 0;
                                                    int i10 = 0;
                                                    s8 = 0;
                                                    if (obj4 instanceof Byte) {
                                                        if (obj3.length() != 0 && !obj3.equals("-")) {
                                                            b9 = Byte.parseByte(obj3);
                                                        }
                                                        b4 = f12.b(Byte.valueOf(b9));
                                                    } else if (obj4 instanceof Boolean) {
                                                        b4 = f12.b(Boolean.valueOf(Boolean.parseBoolean(obj3)));
                                                    } else if (obj4 instanceof Character) {
                                                        if (obj3.length() == 0) {
                                                            c6 = ' ';
                                                        } else {
                                                            char[] charArray = obj3.toCharArray();
                                                            o6.j.d(charArray, "toCharArray(...)");
                                                            c6 = charArray[0];
                                                        }
                                                        b4 = f12.b(Character.valueOf(c6));
                                                    } else if (obj4 instanceof Double) {
                                                        if (obj3.length() == 0 || obj3.equals("-")) {
                                                            d2 = 0.0d;
                                                        } else {
                                                            d2 = Double.parseDouble(obj3);
                                                        }
                                                        b4 = f12.b(Double.valueOf(d2));
                                                    } else if (obj4 instanceof Integer) {
                                                        if (obj3.length() != 0 && !obj3.equals("-")) {
                                                            i10 = Integer.parseInt(obj3);
                                                        }
                                                        b4 = f12.b(Integer.valueOf(i10));
                                                    } else if (obj4 instanceof Float) {
                                                        if (obj3.length() == 0 || obj3.equals("-")) {
                                                            f10 = 0.0f;
                                                        } else {
                                                            f10 = Float.parseFloat(obj3);
                                                        }
                                                        b4 = f12.b(Float.valueOf(f10));
                                                    } else if (obj4 instanceof Short) {
                                                        if (obj3.length() != 0 && !obj3.equals("-")) {
                                                            s8 = Short.parseShort(obj3);
                                                        }
                                                        b4 = f12.b(Short.valueOf(s8));
                                                    } else if (obj4 instanceof String) {
                                                        b4 = f12.b(obj3);
                                                    } else {
                                                        throw new IllegalArgumentException("Unsupported value type");
                                                    }
                                                    nVar3.l(b4);
                                                }
                                                return yVar;
                                        }
                                    }
                                });
                                MaterialButton materialButton = (MaterialButton) a9.f299i;
                                materialButton.setVisibility(0);
                                final int i9 = 1;
                                A(materialButton, new InterfaceC1163b(this) { // from class: R3.a

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ n f5043e;

                                    {
                                        this.f5043e = this;
                                    }

                                    @Override // n6.InterfaceC1163b
                                    public final Object m(Object obj) {
                                        C0777a b4;
                                        float f10;
                                        double d2;
                                        char c6;
                                        int i92 = i9;
                                        Z5.y yVar = Z5.y.f7506a;
                                        n nVar = this.f5043e;
                                        switch (i92) {
                                            case 0:
                                                o6.j.e((View) obj, "it");
                                                nVar.f5070w.a();
                                                nVar.a();
                                                return yVar;
                                            case 1:
                                                o6.j.e((View) obj, "it");
                                                nVar.f5068u.a();
                                                nVar.a();
                                                return yVar;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                o6.j.e((View) obj, "it");
                                                nVar.f5069v.a();
                                                nVar.a();
                                                return yVar;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                Editable editable = (Editable) obj;
                                                o6.j.e(editable, "it");
                                                w G8 = nVar.G();
                                                String obj2 = editable.toString();
                                                o6.j.e(obj2, "key");
                                                H3.n nVar2 = G8.f5096b;
                                                C0777a f11 = nVar2.f1950e.f();
                                                if (f11 != null) {
                                                    nVar2.l(C0777a.e(f11, null, null, obj2, 11));
                                                }
                                                return yVar;
                                            default:
                                                Editable editable2 = (Editable) obj;
                                                o6.j.e(editable2, "it");
                                                w G9 = nVar.G();
                                                String obj3 = editable2.toString();
                                                o6.j.e(obj3, "value");
                                                H3.n nVar3 = G9.f5096b;
                                                C0777a f12 = nVar3.f1950e.f();
                                                if (f12 != null) {
                                                    D2.d dVar = x.f5104a;
                                                    Object obj4 = f12.f11136d;
                                                    short s8 = 0;
                                                    b9 = 0;
                                                    byte b9 = 0;
                                                    i10 = 0;
                                                    int i10 = 0;
                                                    s8 = 0;
                                                    if (obj4 instanceof Byte) {
                                                        if (obj3.length() != 0 && !obj3.equals("-")) {
                                                            b9 = Byte.parseByte(obj3);
                                                        }
                                                        b4 = f12.b(Byte.valueOf(b9));
                                                    } else if (obj4 instanceof Boolean) {
                                                        b4 = f12.b(Boolean.valueOf(Boolean.parseBoolean(obj3)));
                                                    } else if (obj4 instanceof Character) {
                                                        if (obj3.length() == 0) {
                                                            c6 = ' ';
                                                        } else {
                                                            char[] charArray = obj3.toCharArray();
                                                            o6.j.d(charArray, "toCharArray(...)");
                                                            c6 = charArray[0];
                                                        }
                                                        b4 = f12.b(Character.valueOf(c6));
                                                    } else if (obj4 instanceof Double) {
                                                        if (obj3.length() == 0 || obj3.equals("-")) {
                                                            d2 = 0.0d;
                                                        } else {
                                                            d2 = Double.parseDouble(obj3);
                                                        }
                                                        b4 = f12.b(Double.valueOf(d2));
                                                    } else if (obj4 instanceof Integer) {
                                                        if (obj3.length() != 0 && !obj3.equals("-")) {
                                                            i10 = Integer.parseInt(obj3);
                                                        }
                                                        b4 = f12.b(Integer.valueOf(i10));
                                                    } else if (obj4 instanceof Float) {
                                                        if (obj3.length() == 0 || obj3.equals("-")) {
                                                            f10 = 0.0f;
                                                        } else {
                                                            f10 = Float.parseFloat(obj3);
                                                        }
                                                        b4 = f12.b(Float.valueOf(f10));
                                                    } else if (obj4 instanceof Short) {
                                                        if (obj3.length() != 0 && !obj3.equals("-")) {
                                                            s8 = Short.parseShort(obj3);
                                                        }
                                                        b4 = f12.b(Short.valueOf(s8));
                                                    } else if (obj4 instanceof String) {
                                                        b4 = f12.b(obj3);
                                                    } else {
                                                        throw new IllegalArgumentException("Unsupported value type");
                                                    }
                                                    nVar3.l(b4);
                                                }
                                                return yVar;
                                        }
                                    }
                                });
                                MaterialButton materialButton2 = (MaterialButton) a9.f296f;
                                materialButton2.setVisibility(0);
                                final int i10 = 2;
                                A(materialButton2, new InterfaceC1163b(this) { // from class: R3.a

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ n f5043e;

                                    {
                                        this.f5043e = this;
                                    }

                                    @Override // n6.InterfaceC1163b
                                    public final Object m(Object obj) {
                                        C0777a b4;
                                        float f10;
                                        double d2;
                                        char c6;
                                        int i92 = i10;
                                        Z5.y yVar = Z5.y.f7506a;
                                        n nVar = this.f5043e;
                                        switch (i92) {
                                            case 0:
                                                o6.j.e((View) obj, "it");
                                                nVar.f5070w.a();
                                                nVar.a();
                                                return yVar;
                                            case 1:
                                                o6.j.e((View) obj, "it");
                                                nVar.f5068u.a();
                                                nVar.a();
                                                return yVar;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                o6.j.e((View) obj, "it");
                                                nVar.f5069v.a();
                                                nVar.a();
                                                return yVar;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                Editable editable = (Editable) obj;
                                                o6.j.e(editable, "it");
                                                w G8 = nVar.G();
                                                String obj2 = editable.toString();
                                                o6.j.e(obj2, "key");
                                                H3.n nVar2 = G8.f5096b;
                                                C0777a f11 = nVar2.f1950e.f();
                                                if (f11 != null) {
                                                    nVar2.l(C0777a.e(f11, null, null, obj2, 11));
                                                }
                                                return yVar;
                                            default:
                                                Editable editable2 = (Editable) obj;
                                                o6.j.e(editable2, "it");
                                                w G9 = nVar.G();
                                                String obj3 = editable2.toString();
                                                o6.j.e(obj3, "value");
                                                H3.n nVar3 = G9.f5096b;
                                                C0777a f12 = nVar3.f1950e.f();
                                                if (f12 != null) {
                                                    D2.d dVar = x.f5104a;
                                                    Object obj4 = f12.f11136d;
                                                    short s8 = 0;
                                                    b9 = 0;
                                                    byte b9 = 0;
                                                    i10 = 0;
                                                    int i102 = 0;
                                                    s8 = 0;
                                                    if (obj4 instanceof Byte) {
                                                        if (obj3.length() != 0 && !obj3.equals("-")) {
                                                            b9 = Byte.parseByte(obj3);
                                                        }
                                                        b4 = f12.b(Byte.valueOf(b9));
                                                    } else if (obj4 instanceof Boolean) {
                                                        b4 = f12.b(Boolean.valueOf(Boolean.parseBoolean(obj3)));
                                                    } else if (obj4 instanceof Character) {
                                                        if (obj3.length() == 0) {
                                                            c6 = ' ';
                                                        } else {
                                                            char[] charArray = obj3.toCharArray();
                                                            o6.j.d(charArray, "toCharArray(...)");
                                                            c6 = charArray[0];
                                                        }
                                                        b4 = f12.b(Character.valueOf(c6));
                                                    } else if (obj4 instanceof Double) {
                                                        if (obj3.length() == 0 || obj3.equals("-")) {
                                                            d2 = 0.0d;
                                                        } else {
                                                            d2 = Double.parseDouble(obj3);
                                                        }
                                                        b4 = f12.b(Double.valueOf(d2));
                                                    } else if (obj4 instanceof Integer) {
                                                        if (obj3.length() != 0 && !obj3.equals("-")) {
                                                            i102 = Integer.parseInt(obj3);
                                                        }
                                                        b4 = f12.b(Integer.valueOf(i102));
                                                    } else if (obj4 instanceof Float) {
                                                        if (obj3.length() == 0 || obj3.equals("-")) {
                                                            f10 = 0.0f;
                                                        } else {
                                                            f10 = Float.parseFloat(obj3);
                                                        }
                                                        b4 = f12.b(Float.valueOf(f10));
                                                    } else if (obj4 instanceof Short) {
                                                        if (obj3.length() != 0 && !obj3.equals("-")) {
                                                            s8 = Short.parseShort(obj3);
                                                        }
                                                        b4 = f12.b(Short.valueOf(s8));
                                                    } else if (obj4 instanceof String) {
                                                        b4 = f12.b(obj3);
                                                    } else {
                                                        throw new IllegalArgumentException("Unsupported value type");
                                                    }
                                                    nVar3.l(b4);
                                                }
                                                return yVar;
                                        }
                                    }
                                });
                                ((TextInputLayout) a3.f88e).setHint(R.string.field_intent_extra_key_label);
                                final int i11 = 3;
                                E2.c.x0(a3, new InterfaceC1163b(this) { // from class: R3.a

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ n f5043e;

                                    {
                                        this.f5043e = this;
                                    }

                                    @Override // n6.InterfaceC1163b
                                    public final Object m(Object obj) {
                                        C0777a b4;
                                        float f10;
                                        double d2;
                                        char c6;
                                        int i92 = i11;
                                        Z5.y yVar = Z5.y.f7506a;
                                        n nVar = this.f5043e;
                                        switch (i92) {
                                            case 0:
                                                o6.j.e((View) obj, "it");
                                                nVar.f5070w.a();
                                                nVar.a();
                                                return yVar;
                                            case 1:
                                                o6.j.e((View) obj, "it");
                                                nVar.f5068u.a();
                                                nVar.a();
                                                return yVar;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                o6.j.e((View) obj, "it");
                                                nVar.f5069v.a();
                                                nVar.a();
                                                return yVar;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                Editable editable = (Editable) obj;
                                                o6.j.e(editable, "it");
                                                w G8 = nVar.G();
                                                String obj2 = editable.toString();
                                                o6.j.e(obj2, "key");
                                                H3.n nVar2 = G8.f5096b;
                                                C0777a f11 = nVar2.f1950e.f();
                                                if (f11 != null) {
                                                    nVar2.l(C0777a.e(f11, null, null, obj2, 11));
                                                }
                                                return yVar;
                                            default:
                                                Editable editable2 = (Editable) obj;
                                                o6.j.e(editable2, "it");
                                                w G9 = nVar.G();
                                                String obj3 = editable2.toString();
                                                o6.j.e(obj3, "value");
                                                H3.n nVar3 = G9.f5096b;
                                                C0777a f12 = nVar3.f1950e.f();
                                                if (f12 != null) {
                                                    D2.d dVar = x.f5104a;
                                                    Object obj4 = f12.f11136d;
                                                    short s8 = 0;
                                                    b9 = 0;
                                                    byte b9 = 0;
                                                    i102 = 0;
                                                    int i102 = 0;
                                                    s8 = 0;
                                                    if (obj4 instanceof Byte) {
                                                        if (obj3.length() != 0 && !obj3.equals("-")) {
                                                            b9 = Byte.parseByte(obj3);
                                                        }
                                                        b4 = f12.b(Byte.valueOf(b9));
                                                    } else if (obj4 instanceof Boolean) {
                                                        b4 = f12.b(Boolean.valueOf(Boolean.parseBoolean(obj3)));
                                                    } else if (obj4 instanceof Character) {
                                                        if (obj3.length() == 0) {
                                                            c6 = ' ';
                                                        } else {
                                                            char[] charArray = obj3.toCharArray();
                                                            o6.j.d(charArray, "toCharArray(...)");
                                                            c6 = charArray[0];
                                                        }
                                                        b4 = f12.b(Character.valueOf(c6));
                                                    } else if (obj4 instanceof Double) {
                                                        if (obj3.length() == 0 || obj3.equals("-")) {
                                                            d2 = 0.0d;
                                                        } else {
                                                            d2 = Double.parseDouble(obj3);
                                                        }
                                                        b4 = f12.b(Double.valueOf(d2));
                                                    } else if (obj4 instanceof Integer) {
                                                        if (obj3.length() != 0 && !obj3.equals("-")) {
                                                            i102 = Integer.parseInt(obj3);
                                                        }
                                                        b4 = f12.b(Integer.valueOf(i102));
                                                    } else if (obj4 instanceof Float) {
                                                        if (obj3.length() == 0 || obj3.equals("-")) {
                                                            f10 = 0.0f;
                                                        } else {
                                                            f10 = Float.parseFloat(obj3);
                                                        }
                                                        b4 = f12.b(Float.valueOf(f10));
                                                    } else if (obj4 instanceof Short) {
                                                        if (obj3.length() != 0 && !obj3.equals("-")) {
                                                            s8 = Short.parseShort(obj3);
                                                        }
                                                        b4 = f12.b(Short.valueOf(s8));
                                                    } else if (obj4 instanceof String) {
                                                        b4 = f12.b(obj3);
                                                    } else {
                                                        throw new IllegalArgumentException("Unsupported value type");
                                                    }
                                                    nVar3.l(b4);
                                                }
                                                return yVar;
                                        }
                                    }
                                });
                                TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
                                textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, this));
                                D2.f.J(f9, G().f5100f, new A1.e(1, G(), w.class, "setType", "setType(Lcom/buzbuz/smartautoclicker/core/ui/bindings/dropdown/DropdownItem;)V", 0, 0, 18), k().getString(R.string.dropdown_intent_extra_type_title), 120);
                                final int i12 = 4;
                                E2.c.x0(a4, new InterfaceC1163b(this) { // from class: R3.a

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ n f5043e;

                                    {
                                        this.f5043e = this;
                                    }

                                    @Override // n6.InterfaceC1163b
                                    public final Object m(Object obj) {
                                        C0777a b4;
                                        float f10;
                                        double d2;
                                        char c6;
                                        int i92 = i12;
                                        Z5.y yVar = Z5.y.f7506a;
                                        n nVar = this.f5043e;
                                        switch (i92) {
                                            case 0:
                                                o6.j.e((View) obj, "it");
                                                nVar.f5070w.a();
                                                nVar.a();
                                                return yVar;
                                            case 1:
                                                o6.j.e((View) obj, "it");
                                                nVar.f5068u.a();
                                                nVar.a();
                                                return yVar;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                o6.j.e((View) obj, "it");
                                                nVar.f5069v.a();
                                                nVar.a();
                                                return yVar;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                Editable editable = (Editable) obj;
                                                o6.j.e(editable, "it");
                                                w G8 = nVar.G();
                                                String obj2 = editable.toString();
                                                o6.j.e(obj2, "key");
                                                H3.n nVar2 = G8.f5096b;
                                                C0777a f11 = nVar2.f1950e.f();
                                                if (f11 != null) {
                                                    nVar2.l(C0777a.e(f11, null, null, obj2, 11));
                                                }
                                                return yVar;
                                            default:
                                                Editable editable2 = (Editable) obj;
                                                o6.j.e(editable2, "it");
                                                w G9 = nVar.G();
                                                String obj3 = editable2.toString();
                                                o6.j.e(obj3, "value");
                                                H3.n nVar3 = G9.f5096b;
                                                C0777a f12 = nVar3.f1950e.f();
                                                if (f12 != null) {
                                                    D2.d dVar = x.f5104a;
                                                    Object obj4 = f12.f11136d;
                                                    short s8 = 0;
                                                    b9 = 0;
                                                    byte b9 = 0;
                                                    i102 = 0;
                                                    int i102 = 0;
                                                    s8 = 0;
                                                    if (obj4 instanceof Byte) {
                                                        if (obj3.length() != 0 && !obj3.equals("-")) {
                                                            b9 = Byte.parseByte(obj3);
                                                        }
                                                        b4 = f12.b(Byte.valueOf(b9));
                                                    } else if (obj4 instanceof Boolean) {
                                                        b4 = f12.b(Boolean.valueOf(Boolean.parseBoolean(obj3)));
                                                    } else if (obj4 instanceof Character) {
                                                        if (obj3.length() == 0) {
                                                            c6 = ' ';
                                                        } else {
                                                            char[] charArray = obj3.toCharArray();
                                                            o6.j.d(charArray, "toCharArray(...)");
                                                            c6 = charArray[0];
                                                        }
                                                        b4 = f12.b(Character.valueOf(c6));
                                                    } else if (obj4 instanceof Double) {
                                                        if (obj3.length() == 0 || obj3.equals("-")) {
                                                            d2 = 0.0d;
                                                        } else {
                                                            d2 = Double.parseDouble(obj3);
                                                        }
                                                        b4 = f12.b(Double.valueOf(d2));
                                                    } else if (obj4 instanceof Integer) {
                                                        if (obj3.length() != 0 && !obj3.equals("-")) {
                                                            i102 = Integer.parseInt(obj3);
                                                        }
                                                        b4 = f12.b(Integer.valueOf(i102));
                                                    } else if (obj4 instanceof Float) {
                                                        if (obj3.length() == 0 || obj3.equals("-")) {
                                                            f10 = 0.0f;
                                                        } else {
                                                            f10 = Float.parseFloat(obj3);
                                                        }
                                                        b4 = f12.b(Float.valueOf(f10));
                                                    } else if (obj4 instanceof Short) {
                                                        if (obj3.length() != 0 && !obj3.equals("-")) {
                                                            s8 = Short.parseShort(obj3);
                                                        }
                                                        b4 = f12.b(Short.valueOf(s8));
                                                    } else if (obj4 instanceof String) {
                                                        b4 = f12.b(obj3);
                                                    } else {
                                                        throw new IllegalArgumentException("Unsupported value type");
                                                    }
                                                    nVar3.l(b4);
                                                }
                                                return yVar;
                                        }
                                    }
                                });
                                D2.f.J(f8, G().f5101g, new A1.e(1, G(), w.class, "setBooleanValue", "setBooleanValue(Lcom/buzbuz/smartautoclicker/core/ui/bindings/dropdown/DropdownItem;)V", 0, 0, 19), null, 124);
                                this.f5072y = p1Var;
                                o6.j.d(linearLayout, "getRoot(...)");
                                return linearLayout;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(U.e(this), null, null, new e(this, null), 3);
        AbstractC0166y.q(U.e(this), null, null, new l(this, null), 3);
    }

    public final w G() {
        return (w) this.f5071x.getValue();
    }
}
