package q4;

import L7.AbstractC0166y;
import a6.AbstractC0437l;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import b6.C0533a;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import d4.C0595a;
import i2.C0880a;
import j3.C0933s;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import k2.AbstractC0951a;
import k2.C0952b;
import l5.DialogC1035e;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import o6.C1282a;
import z1.ViewOnFocusChangeListenerC1853a;

/* renamed from: q4.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1419y extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final C1282a f14139u;

    /* renamed from: v, reason: collision with root package name */
    public final C1282a f14140v;

    /* renamed from: w, reason: collision with root package name */
    public final o6.i f14141w;

    /* renamed from: x, reason: collision with root package name */
    public final A4.d f14142x;

    /* renamed from: y, reason: collision with root package name */
    public F3.f f14143y;

    /* JADX WARN: Multi-variable type inference failed */
    public C1419y(InterfaceC1162a interfaceC1162a, InterfaceC1162a interfaceC1162a2, InterfaceC1162a interfaceC1162a3) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        this.f14139u = (C1282a) interfaceC1162a;
        this.f14140v = (C1282a) interfaceC1162a2;
        this.f14141w = (o6.i) interfaceC1162a3;
        this.f14142x = new A4.d(o6.v.f13643a.b(U.class), new C1418x(this, 0), new C1418x(this, 1), new C0933s(16, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o6.i, n6.a] */
    public static void G(C1419y c1419y) {
        c1419y.f14141w.a();
        super.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o6.a, n6.a] */
    public static void H(C1419y c1419y) {
        c1419y.f14140v.a();
        super.a();
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [o6.a, n6.a] */
    public static void I(C1419y c1419y, View view) {
        Object obj;
        Object obj2;
        o6.j.e(view, "it");
        H3.y yVar = c1419y.K().f14066c.f1950e;
        AbstractC0951a c6 = yVar.c();
        if (c6 != null) {
            ListIterator listIterator = yVar.f1980a.a().listIterator(0);
            while (true) {
                C0533a c0533a = (C0533a) listIterator;
                obj = null;
                if (!c0533a.hasNext()) {
                    break;
                }
                Object next = c0533a.next();
                AbstractC0951a abstractC0951a = (AbstractC0951a) next;
                if (!o6.j.a(abstractC0951a.getId(), c6.getId())) {
                    Iterator it = abstractC0951a.g().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next2 = it.next();
                        f2.a aVar = (f2.a) next2;
                        if (aVar instanceof f2.o) {
                            f2.o oVar = (f2.o) aVar;
                            if (oVar.f10754e) {
                                continue;
                            } else {
                                Iterator it2 = oVar.f10756g.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj2 = it2.next();
                                        if (o6.j.a(((C0880a) obj2).f11755c, c6.getId())) {
                                            break;
                                        }
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                if (obj2 != null) {
                                    obj = next2;
                                    break;
                                }
                            }
                        }
                    }
                    if (obj != null) {
                        obj = next;
                        break;
                    }
                }
            }
            if (obj != null) {
                X.Y(c1419y.k(), R.string.warning_dialog_message_event_delete_associated_action, new C1398d(c1419y, 4));
                return;
            }
        }
        c1419y.f14140v.a();
        super.a();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [o6.a, n6.a] */
    public static void J(C1419y c1419y, View view) {
        o6.j.e(view, "it");
        c1419y.f14139u.a();
        super.a();
    }

    @Override // z1.b
    public final ViewGroup E() {
        int i4;
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_event_config, (ViewGroup) null, false);
        int i8 = R.id.card_actions;
        if (((MaterialCardView) E2.b.r(inflate, R.id.card_actions)) != null) {
            i8 = R.id.card_conditions;
            if (((MaterialCardView) E2.b.r(inflate, R.id.card_conditions)) != null) {
                i8 = R.id.card_event_config;
                if (((MaterialCardView) E2.b.r(inflate, R.id.card_event_config)) != null) {
                    i8 = R.id.divider_keep_detecting;
                    MaterialDivider materialDivider = (MaterialDivider) E2.b.r(inflate, R.id.divider_keep_detecting);
                    if (materialDivider != null) {
                        i8 = R.id.divider_try_selector;
                        MaterialDivider materialDivider2 = (MaterialDivider) E2.b.r(inflate, R.id.divider_try_selector);
                        if (materialDivider2 != null) {
                            i8 = R.id.field_actions_selector;
                            View r8 = E2.b.r(inflate, R.id.field_actions_selector);
                            if (r8 != null) {
                                A4.a c6 = A4.a.c(r8);
                                i8 = R.id.field_conditions_operator;
                                View r9 = E2.b.r(inflate, R.id.field_conditions_operator);
                                if (r9 != null) {
                                    int i9 = R.id.dual_state_button;
                                    View r10 = E2.b.r(r9, R.id.dual_state_button);
                                    if (r10 != null) {
                                        int i10 = R.id.buttonLeft;
                                        MaterialButton materialButton = (MaterialButton) E2.b.r(r10, R.id.buttonLeft);
                                        if (materialButton != null) {
                                            i10 = R.id.buttonRight;
                                            MaterialButton materialButton2 = (MaterialButton) E2.b.r(r10, R.id.buttonRight);
                                            if (materialButton2 != null) {
                                                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) r10;
                                                A4.c cVar = new A4.c(materialButtonToggleGroup, materialButton, materialButton2, 11);
                                                int i11 = R.id.separator;
                                                if (((MaterialDivider) E2.b.r(r9, R.id.separator)) != null) {
                                                    i11 = R.id.title_and_description;
                                                    View r11 = E2.b.r(r9, R.id.title_and_description);
                                                    if (r11 != null) {
                                                        A4.c f8 = A4.c.f(r11);
                                                        A4.c cVar2 = new A4.c((ConstraintLayout) r9, cVar, f8, 13);
                                                        View r12 = E2.b.r(inflate, R.id.field_event_name);
                                                        if (r12 != null) {
                                                            A.i a3 = A.i.a(r12);
                                                            TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
                                                            View r13 = E2.b.r(inflate, R.id.field_image_conditions_selector);
                                                            if (r13 != null) {
                                                                A4.a c9 = A4.a.c(r13);
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) c9.f280e;
                                                                i8 = R.id.field_is_enabled;
                                                                View r14 = E2.b.r(inflate, R.id.field_is_enabled);
                                                                if (r14 != null) {
                                                                    A4.c e9 = A4.c.e(r14);
                                                                    A4.c cVar3 = (A4.c) e9.f292f;
                                                                    i8 = R.id.field_keep_detecting;
                                                                    View r15 = E2.b.r(inflate, R.id.field_keep_detecting);
                                                                    if (r15 != null) {
                                                                        A4.c e10 = A4.c.e(r15);
                                                                        A4.c cVar4 = (A4.c) e10.f292f;
                                                                        i8 = R.id.field_test_event;
                                                                        View r16 = E2.b.r(inflate, R.id.field_test_event);
                                                                        if (r16 != null) {
                                                                            A4.c d2 = A4.c.d(r16);
                                                                            i8 = R.id.field_trigger_conditions_selector;
                                                                            View r17 = E2.b.r(inflate, R.id.field_trigger_conditions_selector);
                                                                            if (r17 != null) {
                                                                                A4.a c10 = A4.a.c(r17);
                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) c10.f280e;
                                                                                i8 = R.id.layout_top_bar;
                                                                                View r18 = E2.b.r(inflate, R.id.layout_top_bar);
                                                                                if (r18 != null) {
                                                                                    A4.d a4 = A4.d.a(r18);
                                                                                    LinearLayout linearLayout = (LinearLayout) inflate;
                                                                                    F3.f fVar = new F3.f(linearLayout, materialDivider, materialDivider2, c6, cVar2, a3, c9, e9, e10, d2, c10, a4);
                                                                                    X.Q(a4, C2.a.f583f, 0);
                                                                                    X.Q(a4, C2.a.f582e, 0);
                                                                                    MaterialTextView materialTextView = (MaterialTextView) a4.f298h;
                                                                                    if (K().f14066c.f1950e.c() instanceof C0952b) {
                                                                                        i4 = R.string.dialog_title_image_event;
                                                                                    } else {
                                                                                        i4 = R.string.dialog_title_trigger_event;
                                                                                    }
                                                                                    materialTextView.setText(i4);
                                                                                    final int i12 = 2;
                                                                                    A((MaterialButton) a4.f297g, new InterfaceC1163b(this) { // from class: q4.e

                                                                                        /* renamed from: e, reason: collision with root package name */
                                                                                        public final /* synthetic */ C1419y f14100e;

                                                                                        {
                                                                                            this.f14100e = this;
                                                                                        }

                                                                                        @Override // n6.InterfaceC1163b
                                                                                        public final Object m(Object obj) {
                                                                                            int i13;
                                                                                            switch (i12) {
                                                                                                case 0:
                                                                                                    ((Integer) obj).getClass();
                                                                                                    C1419y c1419y = this.f14100e;
                                                                                                    c1419y.o().d(c1419y.k(), new m4.i(), false);
                                                                                                    break;
                                                                                                case 1:
                                                                                                    Integer num = (Integer) obj;
                                                                                                    U K = this.f14100e.K();
                                                                                                    if (num != null && num.intValue() == 0) {
                                                                                                        i13 = 1;
                                                                                                    } else {
                                                                                                        i13 = 2;
                                                                                                    }
                                                                                                    K.e(new S1.K(i13, 1));
                                                                                                    break;
                                                                                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                                    o6.j.e((View) obj, "it");
                                                                                                    this.f14100e.a();
                                                                                                    break;
                                                                                                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                                                                    C1419y.J(this.f14100e, (View) obj);
                                                                                                    break;
                                                                                                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                    C1419y.I(this.f14100e, (View) obj);
                                                                                                    break;
                                                                                                default:
                                                                                                    Editable editable = (Editable) obj;
                                                                                                    o6.j.e(editable, "it");
                                                                                                    U K8 = this.f14100e.K();
                                                                                                    String obj2 = editable.toString();
                                                                                                    o6.j.e(obj2, "newName");
                                                                                                    K8.e(new I7.n(obj2, 3));
                                                                                                    break;
                                                                                            }
                                                                                            return Z5.y.f7506a;
                                                                                        }
                                                                                    });
                                                                                    final int i13 = 3;
                                                                                    A((MaterialButton) a4.f299i, new InterfaceC1163b(this) { // from class: q4.e

                                                                                        /* renamed from: e, reason: collision with root package name */
                                                                                        public final /* synthetic */ C1419y f14100e;

                                                                                        {
                                                                                            this.f14100e = this;
                                                                                        }

                                                                                        @Override // n6.InterfaceC1163b
                                                                                        public final Object m(Object obj) {
                                                                                            int i132;
                                                                                            switch (i13) {
                                                                                                case 0:
                                                                                                    ((Integer) obj).getClass();
                                                                                                    C1419y c1419y = this.f14100e;
                                                                                                    c1419y.o().d(c1419y.k(), new m4.i(), false);
                                                                                                    break;
                                                                                                case 1:
                                                                                                    Integer num = (Integer) obj;
                                                                                                    U K = this.f14100e.K();
                                                                                                    if (num != null && num.intValue() == 0) {
                                                                                                        i132 = 1;
                                                                                                    } else {
                                                                                                        i132 = 2;
                                                                                                    }
                                                                                                    K.e(new S1.K(i132, 1));
                                                                                                    break;
                                                                                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                                    o6.j.e((View) obj, "it");
                                                                                                    this.f14100e.a();
                                                                                                    break;
                                                                                                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                                                                    C1419y.J(this.f14100e, (View) obj);
                                                                                                    break;
                                                                                                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                    C1419y.I(this.f14100e, (View) obj);
                                                                                                    break;
                                                                                                default:
                                                                                                    Editable editable = (Editable) obj;
                                                                                                    o6.j.e(editable, "it");
                                                                                                    U K8 = this.f14100e.K();
                                                                                                    String obj2 = editable.toString();
                                                                                                    o6.j.e(obj2, "newName");
                                                                                                    K8.e(new I7.n(obj2, 3));
                                                                                                    break;
                                                                                            }
                                                                                            return Z5.y.f7506a;
                                                                                        }
                                                                                    });
                                                                                    final int i14 = 4;
                                                                                    A((MaterialButton) a4.f296f, new InterfaceC1163b(this) { // from class: q4.e

                                                                                        /* renamed from: e, reason: collision with root package name */
                                                                                        public final /* synthetic */ C1419y f14100e;

                                                                                        {
                                                                                            this.f14100e = this;
                                                                                        }

                                                                                        @Override // n6.InterfaceC1163b
                                                                                        public final Object m(Object obj) {
                                                                                            int i132;
                                                                                            switch (i14) {
                                                                                                case 0:
                                                                                                    ((Integer) obj).getClass();
                                                                                                    C1419y c1419y = this.f14100e;
                                                                                                    c1419y.o().d(c1419y.k(), new m4.i(), false);
                                                                                                    break;
                                                                                                case 1:
                                                                                                    Integer num = (Integer) obj;
                                                                                                    U K = this.f14100e.K();
                                                                                                    if (num != null && num.intValue() == 0) {
                                                                                                        i132 = 1;
                                                                                                    } else {
                                                                                                        i132 = 2;
                                                                                                    }
                                                                                                    K.e(new S1.K(i132, 1));
                                                                                                    break;
                                                                                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                                    o6.j.e((View) obj, "it");
                                                                                                    this.f14100e.a();
                                                                                                    break;
                                                                                                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                                                                    C1419y.J(this.f14100e, (View) obj);
                                                                                                    break;
                                                                                                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                    C1419y.I(this.f14100e, (View) obj);
                                                                                                    break;
                                                                                                default:
                                                                                                    Editable editable = (Editable) obj;
                                                                                                    o6.j.e(editable, "it");
                                                                                                    U K8 = this.f14100e.K();
                                                                                                    String obj2 = editable.toString();
                                                                                                    o6.j.e(obj2, "newName");
                                                                                                    K8.e(new I7.n(obj2, 3));
                                                                                                    break;
                                                                                            }
                                                                                            return Z5.y.f7506a;
                                                                                        }
                                                                                    });
                                                                                    ((TextInputLayout) a3.f88e).setHint(R.string.generic_name);
                                                                                    final int i15 = 5;
                                                                                    E2.c.x0(a3, new InterfaceC1163b(this) { // from class: q4.e

                                                                                        /* renamed from: e, reason: collision with root package name */
                                                                                        public final /* synthetic */ C1419y f14100e;

                                                                                        {
                                                                                            this.f14100e = this;
                                                                                        }

                                                                                        @Override // n6.InterfaceC1163b
                                                                                        public final Object m(Object obj) {
                                                                                            int i132;
                                                                                            switch (i15) {
                                                                                                case 0:
                                                                                                    ((Integer) obj).getClass();
                                                                                                    C1419y c1419y = this.f14100e;
                                                                                                    c1419y.o().d(c1419y.k(), new m4.i(), false);
                                                                                                    break;
                                                                                                case 1:
                                                                                                    Integer num = (Integer) obj;
                                                                                                    U K = this.f14100e.K();
                                                                                                    if (num != null && num.intValue() == 0) {
                                                                                                        i132 = 1;
                                                                                                    } else {
                                                                                                        i132 = 2;
                                                                                                    }
                                                                                                    K.e(new S1.K(i132, 1));
                                                                                                    break;
                                                                                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                                    o6.j.e((View) obj, "it");
                                                                                                    this.f14100e.a();
                                                                                                    break;
                                                                                                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                                                                    C1419y.J(this.f14100e, (View) obj);
                                                                                                    break;
                                                                                                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                    C1419y.I(this.f14100e, (View) obj);
                                                                                                    break;
                                                                                                default:
                                                                                                    Editable editable = (Editable) obj;
                                                                                                    o6.j.e(editable, "it");
                                                                                                    U K8 = this.f14100e.K();
                                                                                                    String obj2 = editable.toString();
                                                                                                    o6.j.e(obj2, "newName");
                                                                                                    K8.e(new I7.n(obj2, 3));
                                                                                                    break;
                                                                                            }
                                                                                            return Z5.y.f7506a;
                                                                                        }
                                                                                    });
                                                                                    textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(k().getResources().getInteger(R.integer.name_max_length))});
                                                                                    textInputEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1853a(textInputEditText, this));
                                                                                    String string = k().getResources().getString(R.string.field_event_state_title);
                                                                                    o6.j.d(string, "getString(...)");
                                                                                    X.W(cVar3, string);
                                                                                    X.X(cVar3, AbstractC0437l.X(k().getString(R.string.field_event_state_desc_disabled), k().getString(R.string.field_event_state_desc_enabled)));
                                                                                    int i16 = 0;
                                                                                    int i17 = 0;
                                                                                    int i18 = 0;
                                                                                    E2.b.J(e9, new J3.s(i17, K(), U.class, "toggleEventState", "toggleEventState()V", i18, i16, 20));
                                                                                    String string2 = k().getResources().getString(R.string.field_event_keep_detecting_title);
                                                                                    o6.j.d(string2, "getString(...)");
                                                                                    X.W(cVar4, string2);
                                                                                    X.X(cVar4, AbstractC0437l.X(k().getString(R.string.field_event_keep_detecting_desc_disabled), k().getString(R.string.field_event_keep_detecting_desc_enabled)));
                                                                                    E2.b.J(e10, new J3.s(i17, K(), U.class, "toggleKeepDetectingState", "toggleKeepDetectingState()V", i18, i16, 21));
                                                                                    String string3 = k().getString(R.string.item_title_try_element, k().getString(R.string.dialog_title_image_event));
                                                                                    o6.j.d(string3, "getString(...)");
                                                                                    E2.c.A0(d2, string3);
                                                                                    E2.c.w0(d2, new C1398d(this, 1));
                                                                                    X.V(c6, R.string.menu_item_title_actions, R.string.message_empty_action_list_title);
                                                                                    ((MaterialTextView) c6.f281f).setText(R.string.message_empty_action_list_desc);
                                                                                    ((RecyclerView) c6.f282g).setAdapter(new R4.d((InterfaceC1163b) new W4.i(1, this, C1419y.class, "showActionsOverlay", "showActionsOverlay(I)V", 0, 0, 26)));
                                                                                    X.U(c6, new C1398d(this, 8));
                                                                                    if (K().f14066c.f1950e.c() instanceof C0952b) {
                                                                                        constraintLayout2.setVisibility(8);
                                                                                        constraintLayout.setVisibility(0);
                                                                                        X.V(c9, R.string.menu_item_title_conditions, R.string.message_empty_screen_condition_list_title);
                                                                                        ((MaterialTextView) c9.f281f).setText(R.string.message_empty_screen_condition_list_desc);
                                                                                        ((RecyclerView) c9.f282g).setAdapter(new C0595a(new W4.i(1, this, C1419y.class, "showImageConditionsBriefMenu", "showImageConditionsBriefMenu(I)V", 0, 0, 27), new k4.I(2, K(), U.class, "getConditionBitmap", "getConditionBitmap(Lcom/buzbuz/smartautoclicker/core/domain/model/condition/ImageCondition;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", 0, 0, 4)));
                                                                                        X.U(c9, new C1398d(this, 0));
                                                                                    } else {
                                                                                        final int i19 = 0;
                                                                                        constraintLayout.setVisibility(8);
                                                                                        constraintLayout2.setVisibility(0);
                                                                                        X.V(c10, R.string.menu_item_title_conditions, R.string.message_empty_trigger_condition_list_title);
                                                                                        ((MaterialTextView) c10.f281f).setText(R.string.message_empty_trigger_condition_list_desc);
                                                                                        ((RecyclerView) c10.f282g).setAdapter(new R4.d(new InterfaceC1163b(this) { // from class: q4.e

                                                                                            /* renamed from: e, reason: collision with root package name */
                                                                                            public final /* synthetic */ C1419y f14100e;

                                                                                            {
                                                                                                this.f14100e = this;
                                                                                            }

                                                                                            @Override // n6.InterfaceC1163b
                                                                                            public final Object m(Object obj) {
                                                                                                int i132;
                                                                                                switch (i19) {
                                                                                                    case 0:
                                                                                                        ((Integer) obj).getClass();
                                                                                                        C1419y c1419y = this.f14100e;
                                                                                                        c1419y.o().d(c1419y.k(), new m4.i(), false);
                                                                                                        break;
                                                                                                    case 1:
                                                                                                        Integer num = (Integer) obj;
                                                                                                        U K = this.f14100e.K();
                                                                                                        if (num != null && num.intValue() == 0) {
                                                                                                            i132 = 1;
                                                                                                        } else {
                                                                                                            i132 = 2;
                                                                                                        }
                                                                                                        K.e(new S1.K(i132, 1));
                                                                                                        break;
                                                                                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                                        o6.j.e((View) obj, "it");
                                                                                                        this.f14100e.a();
                                                                                                        break;
                                                                                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                                                                        C1419y.J(this.f14100e, (View) obj);
                                                                                                        break;
                                                                                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                        C1419y.I(this.f14100e, (View) obj);
                                                                                                        break;
                                                                                                    default:
                                                                                                        Editable editable = (Editable) obj;
                                                                                                        o6.j.e(editable, "it");
                                                                                                        U K8 = this.f14100e.K();
                                                                                                        String obj2 = editable.toString();
                                                                                                        o6.j.e(obj2, "newName");
                                                                                                        K8.e(new I7.n(obj2, 3));
                                                                                                        break;
                                                                                                }
                                                                                                return Z5.y.f7506a;
                                                                                            }
                                                                                        }));
                                                                                        X.U(c10, new C1398d(this, 7));
                                                                                    }
                                                                                    String string4 = k().getString(R.string.field_operator_title);
                                                                                    o6.j.d(string4, "getString(...)");
                                                                                    X.W(f8, string4);
                                                                                    X.X(f8, AbstractC0437l.X(k().getString(R.string.field_operator_desc_and), k().getString(R.string.field_operator_desc_or)));
                                                                                    String string5 = k().getString(R.string.field_operator_button_and);
                                                                                    o6.j.d(string5, "getString(...)");
                                                                                    String string6 = k().getString(R.string.field_operator_button_or);
                                                                                    o6.j.d(string6, "getString(...)");
                                                                                    materialButton.setText(string5);
                                                                                    materialButton2.setText(string6);
                                                                                    final int i20 = 1;
                                                                                    materialButtonToggleGroup.setSingleSelection(true);
                                                                                    materialButtonToggleGroup.setSelectionRequired(true);
                                                                                    InterfaceC1163b interfaceC1163b = new InterfaceC1163b(this) { // from class: q4.e

                                                                                        /* renamed from: e, reason: collision with root package name */
                                                                                        public final /* synthetic */ C1419y f14100e;

                                                                                        {
                                                                                            this.f14100e = this;
                                                                                        }

                                                                                        @Override // n6.InterfaceC1163b
                                                                                        public final Object m(Object obj) {
                                                                                            int i132;
                                                                                            switch (i20) {
                                                                                                case 0:
                                                                                                    ((Integer) obj).getClass();
                                                                                                    C1419y c1419y = this.f14100e;
                                                                                                    c1419y.o().d(c1419y.k(), new m4.i(), false);
                                                                                                    break;
                                                                                                case 1:
                                                                                                    Integer num = (Integer) obj;
                                                                                                    U K = this.f14100e.K();
                                                                                                    if (num != null && num.intValue() == 0) {
                                                                                                        i132 = 1;
                                                                                                    } else {
                                                                                                        i132 = 2;
                                                                                                    }
                                                                                                    K.e(new S1.K(i132, 1));
                                                                                                    break;
                                                                                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                                    o6.j.e((View) obj, "it");
                                                                                                    this.f14100e.a();
                                                                                                    break;
                                                                                                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                                                                    C1419y.J(this.f14100e, (View) obj);
                                                                                                    break;
                                                                                                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                                                                                    C1419y.I(this.f14100e, (View) obj);
                                                                                                    break;
                                                                                                default:
                                                                                                    Editable editable = (Editable) obj;
                                                                                                    o6.j.e(editable, "it");
                                                                                                    U K8 = this.f14100e.K();
                                                                                                    String obj2 = editable.toString();
                                                                                                    o6.j.e(obj2, "newName");
                                                                                                    K8.e(new I7.n(obj2, 3));
                                                                                                    break;
                                                                                            }
                                                                                            return Z5.y.f7506a;
                                                                                        }
                                                                                    };
                                                                                    LinkedHashSet linkedHashSet = materialButtonToggleGroup.f10006f;
                                                                                    Object tag = materialButtonToggleGroup.getTag();
                                                                                    if (tag instanceof m5.f) {
                                                                                        linkedHashSet.remove((m5.f) tag);
                                                                                    }
                                                                                    B2.a aVar = new B2.a(interfaceC1163b, cVar, 0);
                                                                                    linkedHashSet.add(aVar);
                                                                                    materialButtonToggleGroup.setTag(aVar);
                                                                                    this.f14143y = fVar;
                                                                                    o6.j.d(linearLayout, "getRoot(...)");
                                                                                    return linearLayout;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                i8 = R.id.field_image_conditions_selector;
                                                            }
                                                        } else {
                                                            i8 = R.id.field_event_name;
                                                        }
                                                    }
                                                }
                                                i9 = i11;
                                            }
                                        }
                                        throw new NullPointerException("Missing required view with ID: ".concat(r10.getResources().getResourceName(i10)));
                                    }
                                    throw new NullPointerException("Missing required view with ID: ".concat(r9.getResources().getResourceName(i9)));
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(androidx.lifecycle.U.e(this), null, null, new C1403i(this, null), 3);
        AbstractC0166y.q(androidx.lifecycle.U.e(this), null, null, new C1417w(this, null), 3);
    }

    public final U K() {
        return (U) this.f14142x.getValue();
    }

    public final void L(int i4) {
        if (((Boolean) K().f14068e.f16105c.f4088d.f()).booleanValue()) {
            o().d(k(), new K3.L(), true);
        } else {
            o().d(k(), new K3.s(i4), true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [o6.i, n6.a] */
    @Override // w1.e
    public final void a() {
        if (((Boolean) K().f14069f.f4088d.f()).booleanValue()) {
            X.Y(k(), R.string.warning_dialog_message_close_without_saving, new C1398d(this, 9));
        } else {
            this.f14141w.a();
            super.a();
        }
    }

    @Override // z1.b, w1.e
    public final void v() {
        super.v();
        U K = K();
        F3.f fVar = this.f14143y;
        if (fVar != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) ((A4.a) fVar.f1337i).f280e;
            if (fVar != null) {
                MaterialButton materialButton = (MaterialButton) ((A4.c) ((A4.c) fVar.k).f292f).f292f;
                if (fVar != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ((A4.a) fVar.f1336h).f280e;
                    if (fVar != null) {
                        MaterialButton materialButton2 = (MaterialButton) ((A4.d) fVar.f1342p).f299i;
                        J2.b bVar = K.f14067d;
                        bVar.a(J2.a.f2378t, constraintLayout);
                        bVar.a(J2.a.f2379u, materialButton);
                        bVar.a(J2.a.f2377s, constraintLayout2);
                        bVar.a(J2.a.f2376r, materialButton2);
                        return;
                    }
                    o6.j.i("viewBinding");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
            }
            o6.j.i("viewBinding");
            throw null;
        }
        o6.j.i("viewBinding");
        throw null;
    }

    @Override // z1.b, w1.e
    public final void w() {
        super.w();
        J2.b bVar = K().f14067d;
        bVar.b(J2.a.f2376r);
        bVar.b(J2.a.f2379u);
        bVar.b(J2.a.f2377s);
        bVar.b(J2.a.f2378t);
    }
}
