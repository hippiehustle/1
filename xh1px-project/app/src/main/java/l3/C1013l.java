package l3;

import L7.AbstractC0166y;
import O7.i0;
import Z5.y;
import a6.AbstractC0437l;
import android.content.Context;
import android.content.SharedPreferences;
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
import j3.C0933s;
import l5.DialogC1035e;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import o6.v;
import z1.ViewOnFocusChangeListenerC1853a;

/* renamed from: l3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1013l extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final p2.b f12219u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC1163b f12220v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC1163b f12221w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC1162a f12222x;

    /* renamed from: y, reason: collision with root package name */
    public final A4.d f12223y;

    /* renamed from: z, reason: collision with root package name */
    public F3.c f12224z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1013l(p2.b bVar, InterfaceC1163b interfaceC1163b, InterfaceC1163b interfaceC1163b2, InterfaceC1162a interfaceC1162a) {
        super(Integer.valueOf(R.style.AppTheme));
        o6.j.e(bVar, "dumbPause");
        this.f12219u = bVar;
        this.f12220v = interfaceC1163b;
        this.f12221w = interfaceC1163b2;
        this.f12222x = interfaceC1162a;
        this.f12223y = new A4.d(v.f13643a.b(C1020s.class), new C1012k(this, 0), new C1012k(this, 1), new C0933s(6, this));
    }

    @Override // z1.b
    public final ViewGroup E() {
        C1020s G8 = G();
        p2.b bVar = this.f12219u;
        o6.j.e(bVar, "pause");
        i0 i0Var = G8.f12247g;
        D2.k T5 = E2.c.T(Long.valueOf(bVar.f13689e));
        i0Var.getClass();
        i0Var.h(null, T5);
        i0 i0Var2 = G8.f12242b;
        p2.b i4 = p2.b.i(bVar, null, null, null, 0, 0L, 31);
        i0Var2.getClass();
        i0Var2.h(null, i4);
        final int i8 = 0;
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_dumb_action_pause, (ViewGroup) null, false);
        int i9 = R.id.edit_name_layout;
        View r8 = E2.b.r(inflate, R.id.edit_name_layout);
        if (r8 != null) {
            A.i a3 = A.i.a(r8);
            TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
            View r9 = E2.b.r(inflate, R.id.edit_pause_duration_layout);
            if (r9 != null) {
                A.i a4 = A.i.a(r9);
                TextInputEditText textInputEditText2 = (TextInputEditText) a4.f89f;
                int i10 = R.id.layout_top_bar;
                View r10 = E2.b.r(inflate, R.id.layout_top_bar);
                if (r10 != null) {
                    A4.d a9 = A4.d.a(r10);
                    i10 = R.id.time_unit_field;
                    View r11 = E2.b.r(inflate, R.id.time_unit_field);
                    if (r11 != null) {
                        A4.a f8 = A4.a.f(r11);
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        F3.c cVar = new F3.c(linearLayout, a3, a4, a9, f8, 1);
                        ((MaterialTextView) a9.f298h).setText(R.string.item_title_dumb_pause);
                        A((MaterialButton) a9.f297g, new InterfaceC1163b(this) { // from class: l3.a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ C1013l f12198e;

                            {
                                this.f12198e = this;
                            }

                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj) {
                                p2.b bVar2;
                                long j;
                                p2.b bVar3;
                                switch (i8) {
                                    case 0:
                                        o6.j.e((View) obj, "it");
                                        C1013l c1013l = this.f12198e;
                                        c1013l.f12222x.a();
                                        c1013l.a();
                                        break;
                                    case 1:
                                        o6.j.e((View) obj, "it");
                                        C1013l c1013l2 = this.f12198e;
                                        p2.b bVar4 = (p2.b) c1013l2.G().f12242b.f();
                                        if (bVar4 != null) {
                                            C1020s G9 = c1013l2.G();
                                            Context k = c1013l2.k();
                                            p2.b bVar5 = (p2.b) G9.f12242b.f();
                                            if (bVar5 != null) {
                                                SharedPreferences.Editor edit = D2.f.r(k).edit();
                                                o6.j.d(edit, "edit(...)");
                                                SharedPreferences.Editor putLong = edit.putLong("Last_Pause_Duration", bVar5.f13689e);
                                                o6.j.d(putLong, "putLong(...)");
                                                putLong.apply();
                                            }
                                            c1013l2.f12220v.m(bVar4);
                                            c1013l2.a();
                                        }
                                        return y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e((View) obj, "it");
                                        C1013l c1013l3 = this.f12198e;
                                        p2.b bVar6 = (p2.b) c1013l3.G().f12242b.f();
                                        if (bVar6 != null) {
                                            c1013l3.f12221w.m(bVar6);
                                            c1013l3.a();
                                        }
                                        return y.f7506a;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        Editable editable = (Editable) obj;
                                        o6.j.e(editable, "it");
                                        C1020s G10 = this.f12198e.G();
                                        String obj2 = editable.toString();
                                        o6.j.e(obj2, "newName");
                                        i0 i0Var3 = G10.f12242b;
                                        p2.b bVar7 = (p2.b) i0Var3.f();
                                        if (bVar7 != null) {
                                            bVar2 = p2.b.i(bVar7, null, null, obj2, 0, 0L, 27);
                                        } else {
                                            bVar2 = null;
                                        }
                                        i0Var3.g(bVar2);
                                        break;
                                    default:
                                        Editable editable2 = (Editable) obj;
                                        o6.j.e(editable2, "it");
                                        C1020s G11 = this.f12198e.G();
                                        if (editable2.length() > 0) {
                                            j = Long.parseLong(editable2.toString());
                                        } else {
                                            j = 0;
                                        }
                                        i0 i0Var4 = G11.f12242b;
                                        p2.b bVar8 = (p2.b) i0Var4.f();
                                        if (bVar8 != null) {
                                            long C02 = E2.c.C0(Long.valueOf(j), (D2.k) G11.f12247g.f());
                                            if (bVar8.f13689e != C02) {
                                                bVar3 = p2.b.i(bVar8, null, null, null, 0, C02, 15);
                                            }
                                            return y.f7506a;
                                        }
                                        bVar3 = null;
                                        i0Var4.g(bVar3);
                                        return y.f7506a;
                                }
                                return y.f7506a;
                            }
                        });
                        MaterialButton materialButton = (MaterialButton) a9.f299i;
                        materialButton.setVisibility(0);
                        final int i11 = 1;
                        A(materialButton, new InterfaceC1163b(this) { // from class: l3.a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ C1013l f12198e;

                            {
                                this.f12198e = this;
                            }

                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj) {
                                p2.b bVar2;
                                long j;
                                p2.b bVar3;
                                switch (i11) {
                                    case 0:
                                        o6.j.e((View) obj, "it");
                                        C1013l c1013l = this.f12198e;
                                        c1013l.f12222x.a();
                                        c1013l.a();
                                        break;
                                    case 1:
                                        o6.j.e((View) obj, "it");
                                        C1013l c1013l2 = this.f12198e;
                                        p2.b bVar4 = (p2.b) c1013l2.G().f12242b.f();
                                        if (bVar4 != null) {
                                            C1020s G9 = c1013l2.G();
                                            Context k = c1013l2.k();
                                            p2.b bVar5 = (p2.b) G9.f12242b.f();
                                            if (bVar5 != null) {
                                                SharedPreferences.Editor edit = D2.f.r(k).edit();
                                                o6.j.d(edit, "edit(...)");
                                                SharedPreferences.Editor putLong = edit.putLong("Last_Pause_Duration", bVar5.f13689e);
                                                o6.j.d(putLong, "putLong(...)");
                                                putLong.apply();
                                            }
                                            c1013l2.f12220v.m(bVar4);
                                            c1013l2.a();
                                        }
                                        return y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e((View) obj, "it");
                                        C1013l c1013l3 = this.f12198e;
                                        p2.b bVar6 = (p2.b) c1013l3.G().f12242b.f();
                                        if (bVar6 != null) {
                                            c1013l3.f12221w.m(bVar6);
                                            c1013l3.a();
                                        }
                                        return y.f7506a;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        Editable editable = (Editable) obj;
                                        o6.j.e(editable, "it");
                                        C1020s G10 = this.f12198e.G();
                                        String obj2 = editable.toString();
                                        o6.j.e(obj2, "newName");
                                        i0 i0Var3 = G10.f12242b;
                                        p2.b bVar7 = (p2.b) i0Var3.f();
                                        if (bVar7 != null) {
                                            bVar2 = p2.b.i(bVar7, null, null, obj2, 0, 0L, 27);
                                        } else {
                                            bVar2 = null;
                                        }
                                        i0Var3.g(bVar2);
                                        break;
                                    default:
                                        Editable editable2 = (Editable) obj;
                                        o6.j.e(editable2, "it");
                                        C1020s G11 = this.f12198e.G();
                                        if (editable2.length() > 0) {
                                            j = Long.parseLong(editable2.toString());
                                        } else {
                                            j = 0;
                                        }
                                        i0 i0Var4 = G11.f12242b;
                                        p2.b bVar8 = (p2.b) i0Var4.f();
                                        if (bVar8 != null) {
                                            long C02 = E2.c.C0(Long.valueOf(j), (D2.k) G11.f12247g.f());
                                            if (bVar8.f13689e != C02) {
                                                bVar3 = p2.b.i(bVar8, null, null, null, 0, C02, 15);
                                            }
                                            return y.f7506a;
                                        }
                                        bVar3 = null;
                                        i0Var4.g(bVar3);
                                        return y.f7506a;
                                }
                                return y.f7506a;
                            }
                        });
                        MaterialButton materialButton2 = (MaterialButton) a9.f296f;
                        materialButton2.setVisibility(0);
                        final int i12 = 2;
                        A(materialButton2, new InterfaceC1163b(this) { // from class: l3.a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ C1013l f12198e;

                            {
                                this.f12198e = this;
                            }

                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj) {
                                p2.b bVar2;
                                long j;
                                p2.b bVar3;
                                switch (i12) {
                                    case 0:
                                        o6.j.e((View) obj, "it");
                                        C1013l c1013l = this.f12198e;
                                        c1013l.f12222x.a();
                                        c1013l.a();
                                        break;
                                    case 1:
                                        o6.j.e((View) obj, "it");
                                        C1013l c1013l2 = this.f12198e;
                                        p2.b bVar4 = (p2.b) c1013l2.G().f12242b.f();
                                        if (bVar4 != null) {
                                            C1020s G9 = c1013l2.G();
                                            Context k = c1013l2.k();
                                            p2.b bVar5 = (p2.b) G9.f12242b.f();
                                            if (bVar5 != null) {
                                                SharedPreferences.Editor edit = D2.f.r(k).edit();
                                                o6.j.d(edit, "edit(...)");
                                                SharedPreferences.Editor putLong = edit.putLong("Last_Pause_Duration", bVar5.f13689e);
                                                o6.j.d(putLong, "putLong(...)");
                                                putLong.apply();
                                            }
                                            c1013l2.f12220v.m(bVar4);
                                            c1013l2.a();
                                        }
                                        return y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e((View) obj, "it");
                                        C1013l c1013l3 = this.f12198e;
                                        p2.b bVar6 = (p2.b) c1013l3.G().f12242b.f();
                                        if (bVar6 != null) {
                                            c1013l3.f12221w.m(bVar6);
                                            c1013l3.a();
                                        }
                                        return y.f7506a;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        Editable editable = (Editable) obj;
                                        o6.j.e(editable, "it");
                                        C1020s G10 = this.f12198e.G();
                                        String obj2 = editable.toString();
                                        o6.j.e(obj2, "newName");
                                        i0 i0Var3 = G10.f12242b;
                                        p2.b bVar7 = (p2.b) i0Var3.f();
                                        if (bVar7 != null) {
                                            bVar2 = p2.b.i(bVar7, null, null, obj2, 0, 0L, 27);
                                        } else {
                                            bVar2 = null;
                                        }
                                        i0Var3.g(bVar2);
                                        break;
                                    default:
                                        Editable editable2 = (Editable) obj;
                                        o6.j.e(editable2, "it");
                                        C1020s G11 = this.f12198e.G();
                                        if (editable2.length() > 0) {
                                            j = Long.parseLong(editable2.toString());
                                        } else {
                                            j = 0;
                                        }
                                        i0 i0Var4 = G11.f12242b;
                                        p2.b bVar8 = (p2.b) i0Var4.f();
                                        if (bVar8 != null) {
                                            long C02 = E2.c.C0(Long.valueOf(j), (D2.k) G11.f12247g.f());
                                            if (bVar8.f13689e != C02) {
                                                bVar3 = p2.b.i(bVar8, null, null, null, 0, C02, 15);
                                            }
                                            return y.f7506a;
                                        }
                                        bVar3 = null;
                                        i0Var4.g(bVar3);
                                        return y.f7506a;
                                }
                                return y.f7506a;
                            }
                        });
                        ((TextInputLayout) a3.f88e).setHint(R.string.input_field_label_name);
                        final int i13 = 3;
                        E2.c.x0(a3, new InterfaceC1163b(this) { // from class: l3.a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ C1013l f12198e;

                            {
                                this.f12198e = this;
                            }

                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj) {
                                p2.b bVar2;
                                long j;
                                p2.b bVar3;
                                switch (i13) {
                                    case 0:
                                        o6.j.e((View) obj, "it");
                                        C1013l c1013l = this.f12198e;
                                        c1013l.f12222x.a();
                                        c1013l.a();
                                        break;
                                    case 1:
                                        o6.j.e((View) obj, "it");
                                        C1013l c1013l2 = this.f12198e;
                                        p2.b bVar4 = (p2.b) c1013l2.G().f12242b.f();
                                        if (bVar4 != null) {
                                            C1020s G9 = c1013l2.G();
                                            Context k = c1013l2.k();
                                            p2.b bVar5 = (p2.b) G9.f12242b.f();
                                            if (bVar5 != null) {
                                                SharedPreferences.Editor edit = D2.f.r(k).edit();
                                                o6.j.d(edit, "edit(...)");
                                                SharedPreferences.Editor putLong = edit.putLong("Last_Pause_Duration", bVar5.f13689e);
                                                o6.j.d(putLong, "putLong(...)");
                                                putLong.apply();
                                            }
                                            c1013l2.f12220v.m(bVar4);
                                            c1013l2.a();
                                        }
                                        return y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e((View) obj, "it");
                                        C1013l c1013l3 = this.f12198e;
                                        p2.b bVar6 = (p2.b) c1013l3.G().f12242b.f();
                                        if (bVar6 != null) {
                                            c1013l3.f12221w.m(bVar6);
                                            c1013l3.a();
                                        }
                                        return y.f7506a;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        Editable editable = (Editable) obj;
                                        o6.j.e(editable, "it");
                                        C1020s G10 = this.f12198e.G();
                                        String obj2 = editable.toString();
                                        o6.j.e(obj2, "newName");
                                        i0 i0Var3 = G10.f12242b;
                                        p2.b bVar7 = (p2.b) i0Var3.f();
                                        if (bVar7 != null) {
                                            bVar2 = p2.b.i(bVar7, null, null, obj2, 0, 0L, 27);
                                        } else {
                                            bVar2 = null;
                                        }
                                        i0Var3.g(bVar2);
                                        break;
                                    default:
                                        Editable editable2 = (Editable) obj;
                                        o6.j.e(editable2, "it");
                                        C1020s G11 = this.f12198e.G();
                                        if (editable2.length() > 0) {
                                            j = Long.parseLong(editable2.toString());
                                        } else {
                                            j = 0;
                                        }
                                        i0 i0Var4 = G11.f12242b;
                                        p2.b bVar8 = (p2.b) i0Var4.f();
                                        if (bVar8 != null) {
                                            long C02 = E2.c.C0(Long.valueOf(j), (D2.k) G11.f12247g.f());
                                            if (bVar8.f13689e != C02) {
                                                bVar3 = p2.b.i(bVar8, null, null, null, 0, C02, 15);
                                            }
                                            return y.f7506a;
                                        }
                                        bVar3 = null;
                                        i0Var4.g(bVar3);
                                        return y.f7506a;
                                }
                                return y.f7506a;
                            }
                        });
                        textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                        textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, this));
                        textInputEditText2.setFilters(new K2.i[]{new K2.i()});
                        ((TextInputLayout) a4.f88e).setHint(R.string.input_field_label_pause_duration);
                        final int i14 = 4;
                        E2.c.x0(a4, new InterfaceC1163b(this) { // from class: l3.a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ C1013l f12198e;

                            {
                                this.f12198e = this;
                            }

                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj) {
                                p2.b bVar2;
                                long j;
                                p2.b bVar3;
                                switch (i14) {
                                    case 0:
                                        o6.j.e((View) obj, "it");
                                        C1013l c1013l = this.f12198e;
                                        c1013l.f12222x.a();
                                        c1013l.a();
                                        break;
                                    case 1:
                                        o6.j.e((View) obj, "it");
                                        C1013l c1013l2 = this.f12198e;
                                        p2.b bVar4 = (p2.b) c1013l2.G().f12242b.f();
                                        if (bVar4 != null) {
                                            C1020s G9 = c1013l2.G();
                                            Context k = c1013l2.k();
                                            p2.b bVar5 = (p2.b) G9.f12242b.f();
                                            if (bVar5 != null) {
                                                SharedPreferences.Editor edit = D2.f.r(k).edit();
                                                o6.j.d(edit, "edit(...)");
                                                SharedPreferences.Editor putLong = edit.putLong("Last_Pause_Duration", bVar5.f13689e);
                                                o6.j.d(putLong, "putLong(...)");
                                                putLong.apply();
                                            }
                                            c1013l2.f12220v.m(bVar4);
                                            c1013l2.a();
                                        }
                                        return y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e((View) obj, "it");
                                        C1013l c1013l3 = this.f12198e;
                                        p2.b bVar6 = (p2.b) c1013l3.G().f12242b.f();
                                        if (bVar6 != null) {
                                            c1013l3.f12221w.m(bVar6);
                                            c1013l3.a();
                                        }
                                        return y.f7506a;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        Editable editable = (Editable) obj;
                                        o6.j.e(editable, "it");
                                        C1020s G10 = this.f12198e.G();
                                        String obj2 = editable.toString();
                                        o6.j.e(obj2, "newName");
                                        i0 i0Var3 = G10.f12242b;
                                        p2.b bVar7 = (p2.b) i0Var3.f();
                                        if (bVar7 != null) {
                                            bVar2 = p2.b.i(bVar7, null, null, obj2, 0, 0L, 27);
                                        } else {
                                            bVar2 = null;
                                        }
                                        i0Var3.g(bVar2);
                                        break;
                                    default:
                                        Editable editable2 = (Editable) obj;
                                        o6.j.e(editable2, "it");
                                        C1020s G11 = this.f12198e.G();
                                        if (editable2.length() > 0) {
                                            j = Long.parseLong(editable2.toString());
                                        } else {
                                            j = 0;
                                        }
                                        i0 i0Var4 = G11.f12242b;
                                        p2.b bVar8 = (p2.b) i0Var4.f();
                                        if (bVar8 != null) {
                                            long C02 = E2.c.C0(Long.valueOf(j), (D2.k) G11.f12247g.f());
                                            if (bVar8.f13689e != C02) {
                                                bVar3 = p2.b.i(bVar8, null, null, null, 0, C02, 15);
                                            }
                                            return y.f7506a;
                                        }
                                        bVar3 = null;
                                        i0Var4.g(bVar3);
                                        return y.f7506a;
                                }
                                return y.f7506a;
                            }
                        });
                        textInputEditText2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText2, this));
                        D2.f.J(f8, AbstractC0437l.X(D2.h.f878c, D2.j.f880c, D2.i.f879c, D2.g.f877c), new W4.i(i11, G(), C1020s.class, "setTimeUnit", "setTimeUnit(Lcom/buzbuz/smartautoclicker/core/ui/bindings/dropdown/TimeUnitDropDownItem;)V", 0, 0, 12), k().getString(R.string.dropdown_label_time_unit), 120);
                        this.f12224z = cVar;
                        o6.j.d(linearLayout, "getRoot(...)");
                        return linearLayout;
                    }
                }
                i9 = i10;
            } else {
                i9 = R.id.edit_pause_duration_layout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i9)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(U.e(this), null, null, new C1011j(this, null), 3);
    }

    public final C1020s G() {
        return (C1020s) this.f12223y.getValue();
    }
}
