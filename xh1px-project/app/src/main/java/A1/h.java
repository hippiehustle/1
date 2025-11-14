package A1;

import D4.C0030f;
import D4.P;
import F4.x;
import L7.AbstractC0166y;
import O7.i0;
import S1.C0297h;
import S1.F;
import T1.B;
import T1.C0304c;
import T1.C0310i;
import T1.EnumC0305d;
import T1.EnumC0306e;
import T1.EnumC0307f;
import T1.H;
import T1.K;
import T1.L;
import T1.M;
import T1.N;
import T1.u;
import Z5.y;
import a6.AbstractC0426a;
import a6.AbstractC0437l;
import a6.C0433h;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.EnumC0503n;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.InterfaceC0508t;
import androidx.lifecycle.InterfaceC0510v;
import androidx.lifecycle.U;
import b6.C0533a;
import b6.C0535c;
import c5.C0581a;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import d4.C0600f;
import h3.C0820h;
import h3.C0825m;
import h3.C0826n;
import i.DialogInterfaceC0869h;
import j2.AbstractC0901a;
import j2.C0902b;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import k3.C0958e;
import k3.C0959f;
import k4.J;
import n0.C1131i;
import n2.s;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import p0.C1299g;
import q4.V;
import q4.X;
import v2.InterfaceC1661a;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f250e;

    public /* synthetic */ h(int i4, Object obj) {
        this.f249d = i4;
        this.f250e = obj;
    }

    private final Object f(Object obj) {
        EnumC0307f f8;
        Integer valueOf;
        Integer valueOf2;
        Long valueOf3;
        Long valueOf4;
        int i4;
        int i8;
        Integer valueOf5;
        int i9;
        Integer valueOf6;
        int i10;
        Integer valueOf7;
        int i11;
        int i12;
        Integer valueOf8;
        int i13;
        Integer valueOf9;
        int i14;
        Integer valueOf10;
        Long valueOf11;
        Long valueOf12;
        int i15;
        int i16;
        Integer valueOf13;
        Boolean bool;
        int i17;
        Integer valueOf14;
        Boolean bool2;
        String l6;
        String l8;
        int i18;
        int i19;
        Integer valueOf15;
        int i20;
        Integer valueOf16;
        Boolean bool3;
        B j;
        String l9;
        EnumC0306e d2;
        u h8;
        int i21;
        int i22;
        Integer valueOf17;
        String l10;
        H n3;
        String l11;
        String l12;
        int i23;
        int i24;
        Integer valueOf18;
        N p8;
        String l13;
        int i25;
        int i26;
        Integer valueOf19;
        Boolean bool4;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        C0297h c0297h = (C0297h) this.f250e;
        D0.a aVar = (D0.a) obj;
        o6.j.e(aVar, "_connection");
        D0.c L8 = aVar.L("SELECT * FROM action_table ORDER BY name");
        try {
            int x8 = X.x(L8, "id");
            int x9 = X.x(L8, "eventId");
            int x10 = X.x(L8, "priority");
            int x11 = X.x(L8, "name");
            int x12 = X.x(L8, "type");
            int x13 = X.x(L8, "clickPositionType");
            int x14 = X.x(L8, "x");
            int x15 = X.x(L8, "y");
            int x16 = X.x(L8, "clickOnConditionId");
            int x17 = X.x(L8, "pressDuration");
            int x18 = X.x(L8, "clickOffsetX");
            int x19 = X.x(L8, "clickOffsetY");
            int x20 = X.x(L8, "fromX");
            int x21 = X.x(L8, "fromY");
            int x22 = X.x(L8, "toX");
            int x23 = X.x(L8, "toY");
            int x24 = X.x(L8, "swipeDuration");
            int x25 = X.x(L8, "pauseDuration");
            int x26 = X.x(L8, "isAdvanced");
            int x27 = X.x(L8, "isBroadcast");
            int x28 = X.x(L8, "intent_action");
            int x29 = X.x(L8, "component_name");
            int x30 = X.x(L8, "flags");
            int x31 = X.x(L8, "toggle_all");
            int x32 = X.x(L8, "toggle_all_type");
            int x33 = X.x(L8, "counter_name");
            int x34 = X.x(L8, "counter_operation");
            int x35 = X.x(L8, "counter_operation_value_type");
            int x36 = X.x(L8, "counter_operation_value");
            int x37 = X.x(L8, "counter_operation_counter_name");
            int x38 = X.x(L8, "notification_message_type");
            int x39 = X.x(L8, "notification_message_text");
            int x40 = X.x(L8, "notification_message_counter_name");
            int x41 = X.x(L8, "notification_importance");
            int x42 = X.x(L8, "system_action_type");
            int x43 = X.x(L8, "text_value");
            int x44 = X.x(L8, "text_validate_input");
            int i27 = x19;
            Object obj2 = null;
            t.g gVar = new t.g(obj2);
            int i28 = x18;
            t.g gVar2 = new t.g(obj2);
            while (L8.H()) {
                int i29 = x16;
                int i30 = x17;
                long j5 = L8.getLong(x8);
                if (!gVar.b(j5)) {
                    gVar.g(j5, new ArrayList());
                }
                long j8 = L8.getLong(x8);
                if (!gVar2.b(j8)) {
                    gVar2.g(j8, new ArrayList());
                }
                x16 = i29;
                x17 = i30;
            }
            int i31 = x16;
            int i32 = x17;
            L8.reset();
            c0297h.t(aVar, gVar);
            c0297h.r(aVar, gVar2);
            ArrayList arrayList = new ArrayList();
            while (L8.H()) {
                long j9 = L8.getLong(x8);
                long j10 = L8.getLong(x9);
                int i33 = (int) L8.getLong(x10);
                String l14 = L8.l(x11);
                EnumC0305d b4 = C0297h.b(L8.l(x12));
                if (L8.isNull(x13)) {
                    f8 = null;
                } else {
                    f8 = C0297h.f(L8.l(x13));
                }
                if (L8.isNull(x14)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf((int) L8.getLong(x14));
                }
                if (L8.isNull(x15)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf((int) L8.getLong(x15));
                }
                int i34 = i31;
                if (L8.isNull(i34)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(L8.getLong(i34));
                }
                int i35 = i32;
                if (L8.isNull(i35)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(L8.getLong(i35));
                }
                int i36 = i28;
                if (L8.isNull(i36)) {
                    i4 = x9;
                    i8 = x10;
                    valueOf5 = null;
                } else {
                    i4 = x9;
                    i8 = x10;
                    valueOf5 = Integer.valueOf((int) L8.getLong(i36));
                }
                int i37 = i27;
                if (L8.isNull(i37)) {
                    i9 = x11;
                    valueOf6 = null;
                } else {
                    i9 = x11;
                    valueOf6 = Integer.valueOf((int) L8.getLong(i37));
                }
                int i38 = x20;
                if (L8.isNull(i38)) {
                    i10 = x12;
                    valueOf7 = null;
                } else {
                    i10 = x12;
                    valueOf7 = Integer.valueOf((int) L8.getLong(i38));
                }
                int i39 = x21;
                if (L8.isNull(i39)) {
                    i11 = i37;
                    i12 = i38;
                    valueOf8 = null;
                } else {
                    i11 = i37;
                    i12 = i38;
                    valueOf8 = Integer.valueOf((int) L8.getLong(i39));
                }
                int i40 = x22;
                if (L8.isNull(i40)) {
                    i13 = i39;
                    valueOf9 = null;
                } else {
                    i13 = i39;
                    valueOf9 = Integer.valueOf((int) L8.getLong(i40));
                }
                int i41 = x23;
                if (L8.isNull(i41)) {
                    i14 = i11;
                    valueOf10 = null;
                } else {
                    i14 = i11;
                    valueOf10 = Integer.valueOf((int) L8.getLong(i41));
                }
                int i42 = x24;
                if (L8.isNull(i42)) {
                    valueOf11 = null;
                } else {
                    valueOf11 = Long.valueOf(L8.getLong(i42));
                }
                int i43 = x25;
                if (L8.isNull(i43)) {
                    valueOf12 = null;
                } else {
                    valueOf12 = Long.valueOf(L8.getLong(i43));
                }
                int i44 = x26;
                if (L8.isNull(i44)) {
                    i15 = i40;
                    i16 = i41;
                    valueOf13 = null;
                } else {
                    i15 = i40;
                    i16 = i41;
                    valueOf13 = Integer.valueOf((int) L8.getLong(i44));
                }
                if (valueOf13 != null) {
                    if (valueOf13.intValue() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bool = Boolean.valueOf(z11);
                } else {
                    bool = null;
                }
                int i45 = x27;
                if (L8.isNull(i45)) {
                    i17 = i42;
                    valueOf14 = null;
                } else {
                    i17 = i42;
                    valueOf14 = Integer.valueOf((int) L8.getLong(i45));
                }
                if (valueOf14 != null) {
                    if (valueOf14.intValue() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bool2 = Boolean.valueOf(z10);
                } else {
                    bool2 = null;
                }
                int i46 = x28;
                if (L8.isNull(i46)) {
                    l6 = null;
                } else {
                    l6 = L8.l(i46);
                }
                int i47 = x29;
                if (L8.isNull(i47)) {
                    l8 = null;
                } else {
                    l8 = L8.l(i47);
                }
                int i48 = x30;
                if (L8.isNull(i48)) {
                    i18 = i45;
                    i19 = i46;
                    valueOf15 = null;
                } else {
                    i18 = i45;
                    i19 = i46;
                    valueOf15 = Integer.valueOf((int) L8.getLong(i48));
                }
                int i49 = x31;
                if (L8.isNull(i49)) {
                    i20 = i47;
                    valueOf16 = null;
                } else {
                    i20 = i47;
                    valueOf16 = Integer.valueOf((int) L8.getLong(i49));
                }
                if (valueOf16 != null) {
                    if (valueOf16.intValue() != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    bool3 = Boolean.valueOf(z9);
                } else {
                    bool3 = null;
                }
                int i50 = x32;
                if (L8.isNull(i50)) {
                    j = null;
                } else {
                    j = C0297h.j(L8.l(i50));
                }
                int i51 = x33;
                if (L8.isNull(i51)) {
                    l9 = null;
                } else {
                    l9 = L8.l(i51);
                }
                int i52 = x34;
                if (L8.isNull(i52)) {
                    d2 = null;
                } else {
                    d2 = C0297h.d(L8.l(i52));
                }
                x34 = i52;
                int i53 = x35;
                if (L8.isNull(i53)) {
                    h8 = null;
                } else {
                    h8 = C0297h.h(L8.l(i53));
                }
                x35 = i53;
                int i54 = x36;
                if (L8.isNull(i54)) {
                    i21 = i49;
                    i22 = i50;
                    valueOf17 = null;
                } else {
                    i21 = i49;
                    i22 = i50;
                    valueOf17 = Integer.valueOf((int) L8.getLong(i54));
                }
                int i55 = x37;
                if (L8.isNull(i55)) {
                    l10 = null;
                } else {
                    l10 = L8.l(i55);
                }
                int i56 = x38;
                if (L8.isNull(i56)) {
                    n3 = null;
                } else {
                    n3 = C0297h.n(L8.l(i56));
                }
                int i57 = x39;
                if (L8.isNull(i57)) {
                    l11 = null;
                } else {
                    l11 = L8.l(i57);
                }
                x39 = i57;
                int i58 = x40;
                if (L8.isNull(i58)) {
                    l12 = null;
                } else {
                    l12 = L8.l(i58);
                }
                x40 = i58;
                int i59 = x41;
                if (L8.isNull(i59)) {
                    i23 = i55;
                    i24 = i56;
                    valueOf18 = null;
                } else {
                    i23 = i55;
                    i24 = i56;
                    valueOf18 = Integer.valueOf((int) L8.getLong(i59));
                }
                int i60 = x42;
                if (L8.isNull(i60)) {
                    p8 = null;
                } else {
                    p8 = C0297h.p(L8.l(i60));
                }
                int i61 = x43;
                if (L8.isNull(i61)) {
                    l13 = null;
                } else {
                    l13 = L8.l(i61);
                }
                int i62 = x44;
                if (L8.isNull(i62)) {
                    i25 = i60;
                    i26 = i61;
                    valueOf19 = null;
                } else {
                    i25 = i60;
                    i26 = i61;
                    valueOf19 = Integer.valueOf((int) L8.getLong(i62));
                }
                if (valueOf19 != null) {
                    if (valueOf19.intValue() != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    bool4 = Boolean.valueOf(z8);
                } else {
                    bool4 = null;
                }
                C0304c c0304c = new C0304c(j9, j10, i33, l14, b4, f8, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, bool, bool2, l6, l8, valueOf15, bool3, j, l9, d2, h8, valueOf17, l10, n3, l11, l12, valueOf18, p8, l13, bool4);
                Object c6 = gVar.c(L8.getLong(x8));
                if (c6 != null) {
                    List list = (List) c6;
                    t.g gVar3 = gVar;
                    Object c9 = gVar2.c(L8.getLong(x8));
                    if (c9 != null) {
                        arrayList.add(new C0310i(c0304c, list, (List) c9));
                        x11 = i9;
                        x9 = i4;
                        x10 = i8;
                        gVar = gVar3;
                        i31 = i34;
                        i32 = i35;
                        i28 = i36;
                        i27 = i14;
                        x23 = i16;
                        x25 = i43;
                        x12 = i10;
                        x20 = i12;
                        x21 = i13;
                        x22 = i15;
                        x24 = i17;
                        x27 = i18;
                        x29 = i20;
                        x31 = i21;
                        x33 = i51;
                        x26 = i44;
                        x28 = i19;
                        x30 = i48;
                        x32 = i22;
                        x36 = i54;
                        x37 = i23;
                        x38 = i24;
                        x41 = i59;
                        x42 = i25;
                        x43 = i26;
                        x44 = i62;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            L8.close();
            return arrayList;
        } catch (Throwable th) {
            L8.close();
            throw th;
        }
    }

    private final Object g(Object obj) {
        if (obj == ((AbstractC0426a) this.f250e)) {
            return "(this Collection)";
        }
        return String.valueOf(obj);
    }

    private final Object h(Object obj) {
        ((C0581a) this.f250e).f9672g = (T4.k) obj;
        return y.f7506a;
    }

    private final Object k(Object obj) {
        C0600f c0600f = (C0600f) this.f250e;
        Uri uri = (Uri) obj;
        o6.j.e(uri, "uri");
        c0600f.h(new n(c0600f, 17, uri));
        return y.f7506a;
    }

    private final Object n(Object obj) {
        C0820h c0820h = (C0820h) this.f250e;
        if (!((Boolean) obj).booleanValue()) {
            SharedPreferences.Editor edit = c0820h.S().f11360d.f2924g.edit();
            o6.j.d(edit, "edit(...)");
            SharedPreferences.Editor putBoolean = edit.putBoolean("Tutorial_Stop_Volume_Down_dont_show_again", true);
            o6.j.d(putBoolean, "putBoolean(...)");
            putBoolean.apply();
        }
        C0826n S8 = c0820h.S();
        AbstractC0166y.q(U.g(S8), null, null, new C0825m(S8, null), 3);
        return y.f7506a;
    }

    private final Object o(Object obj) {
        j4.f fVar = (j4.f) this.f250e;
        AbstractC0901a abstractC0901a = (AbstractC0901a) obj;
        o6.j.e(abstractC0901a, "selectedCondition");
        fVar.a();
        fVar.f11924v.m(abstractC0901a);
        return y.f7506a;
    }

    private final Object p(Object obj) {
        C0958e c0958e = (C0958e) this.f250e;
        C0959f c0959f = (C0959f) obj;
        o6.j.e(c0959f, "selectedAction");
        c0958e.h(new n(c0958e, 19, c0959f));
        return y.f7506a;
    }

    private final Object r(Object obj) {
        J j = (J) this.f250e;
        o6.j.e((View) obj, "it");
        j.a();
        return y.f7506a;
    }

    private final Object s(Object obj) {
        boolean z8;
        boolean z9;
        boolean z10;
        n2.j jVar = (n2.j) this.f250e;
        D0.a aVar = (D0.a) obj;
        o6.j.e(aVar, "_connection");
        D0.c L8 = aVar.L("SELECT * FROM dumb_scenario_table ORDER BY name ASC");
        try {
            int x8 = X.x(L8, "id");
            int x9 = X.x(L8, "name");
            int x10 = X.x(L8, "repeat_count");
            int x11 = X.x(L8, "is_repeat_infinite");
            int x12 = X.x(L8, "max_duration_minutes");
            int x13 = X.x(L8, "is_duration_infinite");
            int x14 = X.x(L8, "randomize");
            Object obj2 = null;
            t.g gVar = new t.g(obj2);
            t.g gVar2 = new t.g(obj2);
            while (L8.H()) {
                long j = L8.getLong(x8);
                if (!gVar.b(j)) {
                    gVar.g(j, new ArrayList());
                }
                gVar2.g(L8.getLong(x8), null);
            }
            L8.reset();
            jVar.a(aVar, gVar);
            jVar.b(aVar, gVar2);
            ArrayList arrayList = new ArrayList();
            while (L8.H()) {
                long j5 = L8.getLong(x8);
                String l6 = L8.l(x9);
                int i4 = (int) L8.getLong(x10);
                if (((int) L8.getLong(x11)) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                t.g gVar3 = gVar2;
                int i8 = (int) L8.getLong(x12);
                if (((int) L8.getLong(x13)) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (((int) L8.getLong(x14)) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.m mVar = new n2.m(j5, l6, i4, z8, i8, z9, z10);
                Object c6 = gVar.c(L8.getLong(x8));
                if (c6 != null) {
                    arrayList.add(new s(mVar, (List) c6, (n2.p) gVar3.c(L8.getLong(x8))));
                    gVar2 = gVar3;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            L8.close();
            return arrayList;
        } catch (Throwable th) {
            L8.close();
            throw th;
        }
    }

    private final Object t(Object obj) {
        final C1299g c1299g = (C1299g) this.f250e;
        final C1131i c1131i = (C1131i) obj;
        o6.j.e(c1131i, "entry");
        return new InterfaceC0508t() { // from class: p0.e
            @Override // androidx.lifecycle.InterfaceC0508t
            public final void a(InterfaceC0510v interfaceC0510v, EnumC0503n enumC0503n) {
                EnumC0503n enumC0503n2 = EnumC0503n.ON_RESUME;
                C1299g c1299g2 = C1299g.this;
                C1131i c1131i2 = c1131i;
                if (enumC0503n == enumC0503n2 && ((List) c1299g2.b().f12771e.f4088d.f()).contains(c1131i2)) {
                    if (C1299g.n()) {
                        Objects.toString(c1131i2);
                        interfaceC0510v.toString();
                    }
                    c1299g2.b().c(c1131i2);
                }
                if (enumC0503n == EnumC0503n.ON_DESTROY) {
                    if (C1299g.n()) {
                        Objects.toString(c1131i2);
                        interfaceC0510v.toString();
                    }
                    c1299g2.b().c(c1131i2);
                }
            }
        };
    }

    private final Object u(Object obj) {
        q3.j jVar = (q3.j) this.f250e;
        Point point = (Point) obj;
        o6.j.e(point, "position");
        q3.m t8 = jVar.t();
        return t8.f14007b.f11153f.u(jVar.h(), point);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object, X7.f] */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        Button f8;
        boolean z8;
        Rect rect;
        x xVar;
        EnumC0307f e9;
        Integer valueOf;
        Integer valueOf2;
        Long valueOf3;
        Long valueOf4;
        int i4;
        int i8;
        Integer valueOf5;
        int i9;
        Integer valueOf6;
        int i10;
        Integer valueOf7;
        int i11;
        int i12;
        Integer valueOf8;
        int i13;
        Integer valueOf9;
        int i14;
        Integer valueOf10;
        Long valueOf11;
        Long valueOf12;
        int i15;
        int i16;
        Integer valueOf13;
        Boolean bool;
        int i17;
        Integer valueOf14;
        Boolean bool2;
        String l6;
        String l8;
        int i18;
        int i19;
        Integer valueOf15;
        int i20;
        Integer valueOf16;
        Boolean bool3;
        B i21;
        String l9;
        EnumC0306e c6;
        u g8;
        int i22;
        int i23;
        Integer valueOf17;
        String l10;
        H m6;
        String l11;
        String l12;
        int i24;
        int i25;
        Integer valueOf18;
        N o7;
        String l13;
        int i26;
        int i27;
        Integer valueOf19;
        Boolean bool4;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j;
        boolean z14;
        boolean z15;
        boolean z16;
        long j5;
        boolean z17;
        boolean z18;
        switch (this.f249d) {
            case 0:
                l lVar = (l) this.f250e;
                o6.j.e((Editable) obj, "it");
                DialogInterfaceC0869h dialogInterfaceC0869h = lVar.f262u;
                if (dialogInterfaceC0869h != null && (f8 = dialogInterfaceC0869h.f(-1)) != null) {
                    U2.a aVar = lVar.f260s;
                    Integer num = null;
                    if (aVar != null) {
                        Editable text = ((TextInputEditText) aVar.f6084f.f89f).getText();
                        if (text != null) {
                            try {
                                num = Integer.valueOf(Integer.parseInt(text.toString()));
                            } catch (NumberFormatException unused) {
                            }
                        }
                        if (num != null) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        f8.setEnabled(z8);
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                }
                return y.f7506a;
            case 1:
                C1.g gVar = (C1.g) this.f250e;
                o6.j.e((Context) obj, "it");
                A4.c cVar = gVar.f575d;
                for (int W7 = AbstractC0437l.W((C0433h) cVar.f291e); -1 < W7; W7--) {
                    w1.e eVar = (w1.e) ((C0433h) cVar.f291e).get(W7);
                    eVar.hashCode();
                    eVar.s();
                    if (eVar.f15663e) {
                        eVar.f15671o = true;
                        EnumC0504o enumC0504o = eVar.j.f8862d;
                        if (enumC0504o.compareTo(EnumC0504o.f8849g) >= 0) {
                            eVar.y();
                            eVar.B();
                            if (enumC0504o == EnumC0504o.f8850h) {
                                eVar.z();
                            }
                        } else {
                            eVar.hashCode();
                        }
                    }
                }
                return y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                i0 i0Var = ((D4.s) this.f250e).f986e;
                C0535c a3 = ((s2.k) obj).a();
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = a3.listIterator(0);
                while (true) {
                    C0533a c0533a = (C0533a) listIterator;
                    C0030f c0030f = null;
                    if (c0533a.hasNext()) {
                        InterfaceC1661a interfaceC1661a = (InterfaceC1661a) c0533a.next();
                        if (interfaceC1661a instanceof s2.p) {
                            s2.p pVar = (s2.p) interfaceC1661a;
                            int width = pVar.f14495c.f11794f.width() / 2;
                            int height = pVar.f14495c.f11794f.height() / 2;
                            boolean z19 = pVar.f14493a;
                            Point point = pVar.f14496d;
                            if (point.x == 0 && point.y == 0) {
                                rect = new Rect();
                            } else {
                                int i28 = point.x;
                                int i29 = point.y;
                                rect = new Rect(i28 - width, i29 - height, i28 + width, i29 + height);
                            }
                            c0030f = new C0030f(z19, rect, pVar.f14497e);
                        }
                        if (c0030f != null) {
                            arrayList.add(c0030f);
                        }
                    } else {
                        i0Var.getClass();
                        i0Var.h(null, arrayList);
                        return y.f7506a;
                    }
                }
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                ((P) this.f250e).f933e.g((s2.p) obj);
                return y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                E1.c cVar2 = (E1.c) this.f250e;
                View view = (View) obj;
                o6.j.e(view, "v");
                H1.d dVar = cVar2.f1174z;
                if (dVar != null) {
                    if (!dVar.f1892e) {
                        cVar2.K(view.getId());
                    }
                    return y.f7506a;
                }
                o6.j.i("resizeController");
                throw null;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                A4.a aVar2 = (A4.a) this.f250e;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    ((ImageView) aVar2.f281f).setImageBitmap(bitmap);
                } else {
                    ImageView imageView = (ImageView) aVar2.f281f;
                    Drawable drawable = ((MaterialCardView) aVar2.f280e).getContext().getDrawable(R.drawable.ic_cancel);
                    if (drawable != null) {
                        drawable.setTint(-65536);
                    } else {
                        drawable = null;
                    }
                    imageView.setImageDrawable(drawable);
                }
                return y.f7506a;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                F4.j jVar = (F4.j) this.f250e;
                Boolean bool5 = (Boolean) obj;
                bool5.getClass();
                i0 i0Var2 = jVar.f1393f;
                x xVar2 = (x) i0Var2.f();
                if (xVar2 != null) {
                    xVar = x.a(xVar2, bool5, 11);
                } else {
                    xVar = null;
                }
                i0Var2.g(xVar);
                return y.f7506a;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                InterfaceC1162a interfaceC1162a = (InterfaceC1162a) this.f250e;
                o6.j.e(obj, "it");
                return interfaceC1162a.a();
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return ((I7.j) this.f250e).h(((Integer) obj).intValue());
            case 9:
                N3.d dVar2 = (N3.d) this.f250e;
                N3.e eVar2 = (N3.e) obj;
                o6.j.e(eVar2, "selectedAction");
                dVar2.h(new n(dVar2, 8, eVar2));
                return y.f7506a;
            case 10:
                C0297h c0297h = (C0297h) this.f250e;
                D0.a aVar3 = (D0.a) obj;
                o6.j.e(aVar3, "_connection");
                D0.c L8 = aVar3.L("SELECT * FROM action_table ORDER BY name");
                try {
                    int x8 = X.x(L8, "id");
                    int x9 = X.x(L8, "eventId");
                    int x10 = X.x(L8, "priority");
                    int x11 = X.x(L8, "name");
                    int x12 = X.x(L8, "type");
                    int x13 = X.x(L8, "clickPositionType");
                    int x14 = X.x(L8, "x");
                    int x15 = X.x(L8, "y");
                    int x16 = X.x(L8, "clickOnConditionId");
                    int x17 = X.x(L8, "pressDuration");
                    int x18 = X.x(L8, "clickOffsetX");
                    int x19 = X.x(L8, "clickOffsetY");
                    int x20 = X.x(L8, "fromX");
                    int x21 = X.x(L8, "fromY");
                    int x22 = X.x(L8, "toX");
                    int x23 = X.x(L8, "toY");
                    int x24 = X.x(L8, "swipeDuration");
                    int x25 = X.x(L8, "pauseDuration");
                    int x26 = X.x(L8, "isAdvanced");
                    int x27 = X.x(L8, "isBroadcast");
                    int x28 = X.x(L8, "intent_action");
                    int x29 = X.x(L8, "component_name");
                    int x30 = X.x(L8, "flags");
                    int x31 = X.x(L8, "toggle_all");
                    int x32 = X.x(L8, "toggle_all_type");
                    int x33 = X.x(L8, "counter_name");
                    int x34 = X.x(L8, "counter_operation");
                    int x35 = X.x(L8, "counter_operation_value_type");
                    int x36 = X.x(L8, "counter_operation_value");
                    int x37 = X.x(L8, "counter_operation_counter_name");
                    int x38 = X.x(L8, "notification_message_type");
                    int x39 = X.x(L8, "notification_message_text");
                    int x40 = X.x(L8, "notification_message_counter_name");
                    int x41 = X.x(L8, "notification_importance");
                    int x42 = X.x(L8, "system_action_type");
                    int x43 = X.x(L8, "text_value");
                    int x44 = X.x(L8, "text_validate_input");
                    int i30 = x19;
                    Object obj2 = null;
                    t.g gVar2 = new t.g(obj2);
                    int i31 = x18;
                    t.g gVar3 = new t.g(obj2);
                    while (L8.H()) {
                        int i32 = x16;
                        int i33 = x17;
                        long j8 = L8.getLong(x8);
                        if (!gVar2.b(j8)) {
                            gVar2.g(j8, new ArrayList());
                        }
                        long j9 = L8.getLong(x8);
                        if (!gVar3.b(j9)) {
                            gVar3.g(j9, new ArrayList());
                        }
                        x16 = i32;
                        x17 = i33;
                    }
                    int i34 = x16;
                    int i35 = x17;
                    L8.reset();
                    c0297h.s(aVar3, gVar2);
                    c0297h.q(aVar3, gVar3);
                    ArrayList arrayList2 = new ArrayList();
                    while (L8.H()) {
                        long j10 = L8.getLong(x8);
                        long j11 = L8.getLong(x9);
                        int i36 = (int) L8.getLong(x10);
                        String l14 = L8.l(x11);
                        EnumC0305d a4 = C0297h.a(L8.l(x12));
                        if (L8.isNull(x13)) {
                            e9 = null;
                        } else {
                            e9 = C0297h.e(L8.l(x13));
                        }
                        if (L8.isNull(x14)) {
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf((int) L8.getLong(x14));
                        }
                        if (L8.isNull(x15)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Integer.valueOf((int) L8.getLong(x15));
                        }
                        int i37 = i34;
                        if (L8.isNull(i37)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Long.valueOf(L8.getLong(i37));
                        }
                        int i38 = i35;
                        if (L8.isNull(i38)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Long.valueOf(L8.getLong(i38));
                        }
                        int i39 = i31;
                        if (L8.isNull(i39)) {
                            i4 = x9;
                            i8 = x10;
                            valueOf5 = null;
                        } else {
                            i4 = x9;
                            i8 = x10;
                            valueOf5 = Integer.valueOf((int) L8.getLong(i39));
                        }
                        int i40 = i30;
                        if (L8.isNull(i40)) {
                            i9 = x11;
                            valueOf6 = null;
                        } else {
                            i9 = x11;
                            valueOf6 = Integer.valueOf((int) L8.getLong(i40));
                        }
                        int i41 = x20;
                        if (L8.isNull(i41)) {
                            i10 = x12;
                            valueOf7 = null;
                        } else {
                            i10 = x12;
                            valueOf7 = Integer.valueOf((int) L8.getLong(i41));
                        }
                        int i42 = x21;
                        if (L8.isNull(i42)) {
                            i11 = i40;
                            i12 = i41;
                            valueOf8 = null;
                        } else {
                            i11 = i40;
                            i12 = i41;
                            valueOf8 = Integer.valueOf((int) L8.getLong(i42));
                        }
                        int i43 = x22;
                        if (L8.isNull(i43)) {
                            i13 = i42;
                            valueOf9 = null;
                        } else {
                            i13 = i42;
                            valueOf9 = Integer.valueOf((int) L8.getLong(i43));
                        }
                        int i44 = x23;
                        if (L8.isNull(i44)) {
                            i14 = i11;
                            valueOf10 = null;
                        } else {
                            i14 = i11;
                            valueOf10 = Integer.valueOf((int) L8.getLong(i44));
                        }
                        int i45 = x24;
                        if (L8.isNull(i45)) {
                            valueOf11 = null;
                        } else {
                            valueOf11 = Long.valueOf(L8.getLong(i45));
                        }
                        int i46 = x25;
                        if (L8.isNull(i46)) {
                            valueOf12 = null;
                        } else {
                            valueOf12 = Long.valueOf(L8.getLong(i46));
                        }
                        int i47 = x26;
                        if (L8.isNull(i47)) {
                            i15 = i43;
                            i16 = i44;
                            valueOf13 = null;
                        } else {
                            i15 = i43;
                            i16 = i44;
                            valueOf13 = Integer.valueOf((int) L8.getLong(i47));
                        }
                        if (valueOf13 != null) {
                            if (valueOf13.intValue() != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bool = Boolean.valueOf(z12);
                        } else {
                            bool = null;
                        }
                        int i48 = x27;
                        if (L8.isNull(i48)) {
                            i17 = i45;
                            valueOf14 = null;
                        } else {
                            i17 = i45;
                            valueOf14 = Integer.valueOf((int) L8.getLong(i48));
                        }
                        if (valueOf14 != null) {
                            if (valueOf14.intValue() != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            bool2 = Boolean.valueOf(z11);
                        } else {
                            bool2 = null;
                        }
                        int i49 = x28;
                        if (L8.isNull(i49)) {
                            l6 = null;
                        } else {
                            l6 = L8.l(i49);
                        }
                        int i50 = x29;
                        if (L8.isNull(i50)) {
                            l8 = null;
                        } else {
                            l8 = L8.l(i50);
                        }
                        int i51 = x30;
                        if (L8.isNull(i51)) {
                            i18 = i48;
                            i19 = i49;
                            valueOf15 = null;
                        } else {
                            i18 = i48;
                            i19 = i49;
                            valueOf15 = Integer.valueOf((int) L8.getLong(i51));
                        }
                        int i52 = x31;
                        if (L8.isNull(i52)) {
                            i20 = i50;
                            valueOf16 = null;
                        } else {
                            i20 = i50;
                            valueOf16 = Integer.valueOf((int) L8.getLong(i52));
                        }
                        if (valueOf16 != null) {
                            if (valueOf16.intValue() != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            bool3 = Boolean.valueOf(z10);
                        } else {
                            bool3 = null;
                        }
                        int i53 = x32;
                        if (L8.isNull(i53)) {
                            i21 = null;
                        } else {
                            i21 = C0297h.i(L8.l(i53));
                        }
                        int i54 = x33;
                        if (L8.isNull(i54)) {
                            l9 = null;
                        } else {
                            l9 = L8.l(i54);
                        }
                        int i55 = x34;
                        if (L8.isNull(i55)) {
                            c6 = null;
                        } else {
                            c6 = C0297h.c(L8.l(i55));
                        }
                        x34 = i55;
                        int i56 = x35;
                        if (L8.isNull(i56)) {
                            g8 = null;
                        } else {
                            g8 = C0297h.g(L8.l(i56));
                        }
                        x35 = i56;
                        int i57 = x36;
                        if (L8.isNull(i57)) {
                            i22 = i52;
                            i23 = i53;
                            valueOf17 = null;
                        } else {
                            i22 = i52;
                            i23 = i53;
                            valueOf17 = Integer.valueOf((int) L8.getLong(i57));
                        }
                        int i58 = x37;
                        if (L8.isNull(i58)) {
                            l10 = null;
                        } else {
                            l10 = L8.l(i58);
                        }
                        int i59 = x38;
                        if (L8.isNull(i59)) {
                            m6 = null;
                        } else {
                            m6 = C0297h.m(L8.l(i59));
                        }
                        int i60 = x39;
                        if (L8.isNull(i60)) {
                            l11 = null;
                        } else {
                            l11 = L8.l(i60);
                        }
                        x39 = i60;
                        int i61 = x40;
                        if (L8.isNull(i61)) {
                            l12 = null;
                        } else {
                            l12 = L8.l(i61);
                        }
                        x40 = i61;
                        int i62 = x41;
                        if (L8.isNull(i62)) {
                            i24 = i58;
                            i25 = i59;
                            valueOf18 = null;
                        } else {
                            i24 = i58;
                            i25 = i59;
                            valueOf18 = Integer.valueOf((int) L8.getLong(i62));
                        }
                        int i63 = x42;
                        if (L8.isNull(i63)) {
                            o7 = null;
                        } else {
                            o7 = C0297h.o(L8.l(i63));
                        }
                        int i64 = x43;
                        if (L8.isNull(i64)) {
                            l13 = null;
                        } else {
                            l13 = L8.l(i64);
                        }
                        int i65 = x44;
                        if (L8.isNull(i65)) {
                            i26 = i63;
                            i27 = i64;
                            valueOf19 = null;
                        } else {
                            i26 = i63;
                            i27 = i64;
                            valueOf19 = Integer.valueOf((int) L8.getLong(i65));
                        }
                        if (valueOf19 != null) {
                            if (valueOf19.intValue() != 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            bool4 = Boolean.valueOf(z9);
                        } else {
                            bool4 = null;
                        }
                        C0304c c0304c = new C0304c(j10, j11, i36, l14, a4, e9, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, bool, bool2, l6, l8, valueOf15, bool3, i21, l9, c6, g8, valueOf17, l10, m6, l11, l12, valueOf18, o7, l13, bool4);
                        Object c9 = gVar2.c(L8.getLong(x8));
                        if (c9 != null) {
                            List list = (List) c9;
                            t.g gVar4 = gVar2;
                            Object c10 = gVar3.c(L8.getLong(x8));
                            if (c10 != null) {
                                arrayList2.add(new C0310i(c0304c, list, (List) c10));
                                x11 = i9;
                                x9 = i4;
                                x10 = i8;
                                gVar2 = gVar4;
                                i34 = i37;
                                i35 = i38;
                                i31 = i39;
                                i30 = i14;
                                x23 = i16;
                                x25 = i46;
                                x12 = i10;
                                x20 = i12;
                                x21 = i13;
                                x22 = i15;
                                x24 = i17;
                                x27 = i18;
                                x29 = i20;
                                x31 = i22;
                                x33 = i54;
                                x26 = i47;
                                x28 = i19;
                                x30 = i51;
                                x32 = i23;
                                x36 = i57;
                                x37 = i24;
                                x38 = i25;
                                x41 = i62;
                                x42 = i26;
                                x43 = i27;
                                x44 = i65;
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    L8.close();
                    return arrayList2;
                } catch (Throwable th) {
                    L8.close();
                    throw th;
                }
            case 11:
                return f(obj);
            case 12:
                F f9 = (F) this.f250e;
                D0.a aVar4 = (D0.a) obj;
                o6.j.e(aVar4, "_connection");
                D0.c L9 = aVar4.L("SELECT * FROM scenario_table ORDER BY name ASC");
                try {
                    int x45 = X.x(L9, "id");
                    int x46 = X.x(L9, "name");
                    int x47 = X.x(L9, "detection_quality");
                    int x48 = X.x(L9, "randomize");
                    int x49 = X.x(L9, "keep_screen_on");
                    Object obj3 = null;
                    t.g gVar5 = new t.g(obj3);
                    t.g gVar6 = new t.g(obj3);
                    while (L9.H()) {
                        long j12 = L9.getLong(x45);
                        if (!gVar5.b(j12)) {
                            gVar5.g(j12, new ArrayList());
                        }
                        gVar6.g(L9.getLong(x45), null);
                    }
                    L9.reset();
                    f9.y(aVar4, gVar5);
                    f9.E(aVar4, gVar6);
                    ArrayList arrayList3 = new ArrayList();
                    while (L9.H()) {
                        long j13 = L9.getLong(x45);
                        String l15 = L9.l(x46);
                        int i66 = (int) L9.getLong(x47);
                        if (((int) L9.getLong(x48)) != 0) {
                            z13 = false;
                            j = j13;
                            z14 = true;
                        } else {
                            z13 = false;
                            j = j13;
                            z14 = false;
                        }
                        if (((int) L9.getLong(x49)) != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        K k = new K(j, l15, i66, z14, z15);
                        Object c11 = gVar5.c(L9.getLong(x45));
                        if (c11 != null) {
                            arrayList3.add(new M(k, (List) c11, (L) gVar6.c(L9.getLong(x45))));
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    L9.close();
                    return arrayList3;
                } catch (Throwable th2) {
                    L9.close();
                    throw th2;
                }
            case 13:
                F f10 = (F) this.f250e;
                D0.a aVar5 = (D0.a) obj;
                o6.j.e(aVar5, "_connection");
                D0.c L10 = aVar5.L("SELECT * FROM scenario_table ORDER BY name ASC");
                try {
                    int x50 = X.x(L10, "id");
                    int x51 = X.x(L10, "name");
                    int x52 = X.x(L10, "detection_quality");
                    int x53 = X.x(L10, "randomize");
                    int x54 = X.x(L10, "keep_screen_on");
                    Object obj4 = null;
                    t.g gVar7 = new t.g(obj4);
                    t.g gVar8 = new t.g(obj4);
                    while (L10.H()) {
                        long j14 = L10.getLong(x50);
                        if (!gVar7.b(j14)) {
                            gVar7.g(j14, new ArrayList());
                        }
                        gVar8.g(L10.getLong(x50), null);
                    }
                    L10.reset();
                    f10.z(aVar5, gVar7);
                    f10.F(aVar5, gVar8);
                    ArrayList arrayList4 = new ArrayList();
                    while (L10.H()) {
                        long j15 = L10.getLong(x50);
                        String l16 = L10.l(x51);
                        int i67 = (int) L10.getLong(x52);
                        if (((int) L10.getLong(x53)) != 0) {
                            z16 = false;
                            j5 = j15;
                            z17 = true;
                        } else {
                            z16 = false;
                            j5 = j15;
                            z17 = false;
                        }
                        if (((int) L10.getLong(x54)) != 0) {
                            z18 = true;
                        } else {
                            z18 = z16;
                        }
                        K k6 = new K(j5, l16, i67, z17, z18);
                        Object c12 = gVar7.c(L10.getLong(x50));
                        if (c12 != null) {
                            arrayList4.add(new M(k6, (List) c12, (L) gVar8.c(L10.getLong(x50))));
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    L10.close();
                    return arrayList4;
                } catch (Throwable th3) {
                    L10.close();
                    throw th3;
                }
            case 14:
                ((U7.c) this.f250e).a(null);
                return y.f7506a;
            case 15:
                V4.k kVar = (V4.k) this.f250e;
                Editable editable = (Editable) obj;
                o6.j.e(editable, "it");
                kVar.W().f6415e.g(editable.toString());
                return y.f7506a;
            case 16:
                Y4.d dVar3 = (Y4.d) this.f250e;
                Editable editable2 = (Editable) obj;
                o6.j.e(editable2, "it");
                Y4.i iVar = (Y4.i) dVar3.f7182x0.getValue();
                String obj5 = editable2.toString();
                o6.j.e(obj5, "name");
                i0 i0Var3 = iVar.f7197f;
                i0Var3.getClass();
                i0Var3.h(null, obj5);
                return y.f7506a;
            case 17:
                int intValue = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                ?? r32 = this.f250e;
                sb.append(r32.d(intValue));
                sb.append(": ");
                sb.append(r32.j(intValue).b());
                return sb.toString();
            case 18:
                F3.a aVar6 = (F3.a) this.f250e;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 != null) {
                    ((ImageView) aVar6.f1307h).setImageBitmap(bitmap2);
                } else {
                    ImageView imageView2 = (ImageView) aVar6.f1307h;
                    Drawable drawable2 = ((ConstraintLayout) aVar6.f1304e).getContext().getDrawable(R.drawable.ic_cancel);
                    if (drawable2 != null) {
                        drawable2.setTint(-65536);
                    } else {
                        drawable2 = null;
                    }
                    imageView2.setImageDrawable(drawable2);
                }
                return y.f7506a;
            case 19:
                return g(obj);
            case 20:
                return h(obj);
            case 21:
                return k(obj);
            case 22:
                return n(obj);
            case 23:
                return o(obj);
            case 24:
                return p(obj);
            case 25:
                return r(obj);
            case 26:
                return s(obj);
            case 27:
                return t(obj);
            case 28:
                return u(obj);
            default:
                V v8 = (V) this.f250e;
                o6.j.e((C0902b) obj, "it");
                v8.f14082w.m(Integer.valueOf(v8.c()));
                return y.f7506a;
        }
    }

    public /* synthetic */ h(U7.c cVar, U7.b bVar) {
        this.f249d = 14;
        this.f250e = cVar;
    }
}
