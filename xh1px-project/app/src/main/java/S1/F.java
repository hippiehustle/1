package S1;

import T1.C0304c;
import T1.C0310i;
import T1.C0313l;
import T1.EnumC0305d;
import T1.EnumC0306e;
import T1.EnumC0307f;
import T1.N;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import f6.AbstractC0720j;
import h6.AbstractC0837b;
import h7.AbstractC0842e;
import java.util.ArrayList;
import java.util.List;
import q4.X;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5221a;

    /* renamed from: b, reason: collision with root package name */
    public final u0.u f5222b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0842e f5223c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0842e f5224d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0837b f5225e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0837b f5226f;

    public F(u0.u uVar, int i4) {
        this.f5221a = i4;
        switch (i4) {
            case 1:
                this.f5222b = uVar;
                this.f5223c = new v(4);
                this.f5224d = new v(5);
                this.f5225e = new C0295f(14);
                this.f5226f = new C0295f(15);
                return;
            default:
                this.f5222b = uVar;
                this.f5223c = new v(2);
                this.f5224d = new v(3);
                this.f5225e = new C0295f(12);
                this.f5226f = new C0295f(13);
                return;
        }
    }

    public static EnumC0305d a(String str) {
        switch (str.hashCode()) {
            case -2130433380:
                if (str.equals("INTENT")) {
                    return EnumC0305d.f5585g;
                }
                break;
            case -1833998801:
                if (str.equals("SYSTEM")) {
                    return EnumC0305d.k;
                }
                break;
            case -1382453013:
                if (str.equals("NOTIFICATION")) {
                    return EnumC0305d.j;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    return EnumC0305d.f5588l;
                }
                break;
            case 64212328:
                if (str.equals("CLICK")) {
                    return EnumC0305d.f5582d;
                }
                break;
            case 75902422:
                if (str.equals("PAUSE")) {
                    return EnumC0305d.f5584f;
                }
                break;
            case 79316762:
                if (str.equals("SWIPE")) {
                    return EnumC0305d.f5583e;
                }
                break;
            case 388939215:
                if (str.equals("TOGGLE_EVENT")) {
                    return EnumC0305d.f5586h;
                }
                break;
            case 720494669:
                if (str.equals("CHANGE_COUNTER")) {
                    return EnumC0305d.f5587i;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static EnumC0305d b(String str) {
        switch (str.hashCode()) {
            case -2130433380:
                if (str.equals("INTENT")) {
                    return EnumC0305d.f5585g;
                }
                break;
            case -1833998801:
                if (str.equals("SYSTEM")) {
                    return EnumC0305d.k;
                }
                break;
            case -1382453013:
                if (str.equals("NOTIFICATION")) {
                    return EnumC0305d.j;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    return EnumC0305d.f5588l;
                }
                break;
            case 64212328:
                if (str.equals("CLICK")) {
                    return EnumC0305d.f5582d;
                }
                break;
            case 75902422:
                if (str.equals("PAUSE")) {
                    return EnumC0305d.f5584f;
                }
                break;
            case 79316762:
                if (str.equals("SWIPE")) {
                    return EnumC0305d.f5583e;
                }
                break;
            case 388939215:
                if (str.equals("TOGGLE_EVENT")) {
                    return EnumC0305d.f5586h;
                }
                break;
            case 720494669:
                if (str.equals("CHANGE_COUNTER")) {
                    return EnumC0305d.f5587i;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static EnumC0306e c(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 64641) {
            if (hashCode != 81986) {
                if (hashCode == 73363536 && str.equals("MINUS")) {
                    return EnumC0306e.f5591e;
                }
            } else if (str.equals("SET")) {
                return EnumC0306e.f5592f;
            }
        } else if (str.equals("ADD")) {
            return EnumC0306e.f5590d;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static EnumC0306e d(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 64641) {
            if (hashCode != 81986) {
                if (hashCode == 73363536 && str.equals("MINUS")) {
                    return EnumC0306e.f5591e;
                }
            } else if (str.equals("SET")) {
                return EnumC0306e.f5592f;
            }
        } else if (str.equals("ADD")) {
            return EnumC0306e.f5590d;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static T1.s e(String str) {
        switch (str.hashCode()) {
            case -1964928481:
                if (str.equals("ON_BROADCAST_RECEIVED")) {
                    return T1.s.f5636d;
                }
                break;
            case -1496628378:
                if (str.equals("ON_IMAGE_DETECTED")) {
                    return T1.s.f5638f;
                }
                break;
            case -605450385:
                if (str.equals("ON_COUNTER_REACHED")) {
                    return T1.s.f5637e;
                }
                break;
            case 1494436792:
                if (str.equals("ON_TIMER_REACHED")) {
                    return T1.s.f5639g;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static T1.s f(String str) {
        switch (str.hashCode()) {
            case -1964928481:
                if (str.equals("ON_BROADCAST_RECEIVED")) {
                    return T1.s.f5636d;
                }
                break;
            case -1496628378:
                if (str.equals("ON_IMAGE_DETECTED")) {
                    return T1.s.f5638f;
                }
                break;
            case -605450385:
                if (str.equals("ON_COUNTER_REACHED")) {
                    return T1.s.f5637e;
                }
                break;
            case 1494436792:
                if (str.equals("ON_TIMER_REACHED")) {
                    return T1.s.f5639g;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static T1.t g(String str) {
        switch (str.hashCode()) {
            case -41297475:
                if (str.equals("LOWER_OR_EQUALS")) {
                    return T1.t.f5643f;
                }
                break;
            case 45448054:
                if (str.equals("GREATER_OR_EQUALS")) {
                    return T1.t.f5645h;
                }
                break;
            case 72626913:
                if (str.equals("LOWER")) {
                    return T1.t.f5642e;
                }
                break;
            case 1001584602:
                if (str.equals("GREATER")) {
                    return T1.t.f5644g;
                }
                break;
            case 2052813759:
                if (str.equals("EQUALS")) {
                    return T1.t.f5641d;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static T1.t h(String str) {
        switch (str.hashCode()) {
            case -41297475:
                if (str.equals("LOWER_OR_EQUALS")) {
                    return T1.t.f5643f;
                }
                break;
            case 45448054:
                if (str.equals("GREATER_OR_EQUALS")) {
                    return T1.t.f5645h;
                }
                break;
            case 72626913:
                if (str.equals("LOWER")) {
                    return T1.t.f5642e;
                }
                break;
            case 1001584602:
                if (str.equals("GREATER")) {
                    return T1.t.f5644g;
                }
                break;
            case 2052813759:
                if (str.equals("EQUALS")) {
                    return T1.t.f5641d;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static T1.u i(String str) {
        if (o6.j.a(str, "NUMBER")) {
            return T1.u.f5647d;
        }
        if (o6.j.a(str, "COUNTER")) {
            return T1.u.f5648e;
        }
        throw new IllegalArgumentException(A.j.o("Can't convert value to enum, unknown value: ", str));
    }

    public static T1.u j(String str) {
        if (o6.j.a(str, "NUMBER")) {
            return T1.u.f5647d;
        }
        if (o6.j.a(str, "COUNTER")) {
            return T1.u.f5648e;
        }
        throw new IllegalArgumentException(A.j.o("Can't convert value to enum, unknown value: ", str));
    }

    public static T1.B k(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1905676600) {
            if (hashCode != -1814974636) {
                if (hashCode == 2049448323 && str.equals("ENABLE")) {
                    return T1.B.f5503d;
                }
            } else if (str.equals("TOGGLE")) {
                return T1.B.f5505f;
            }
        } else if (str.equals("DISABLE")) {
            return T1.B.f5504e;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static T1.B l(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1905676600) {
            if (hashCode != -1814974636) {
                if (hashCode == 2049448323 && str.equals("ENABLE")) {
                    return T1.B.f5503d;
                }
            } else if (str.equals("TOGGLE")) {
                return T1.B.f5505f;
            }
        } else if (str.equals("DISABLE")) {
            return T1.B.f5504e;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static T1.C m(String str) {
        if (o6.j.a(str, "IMAGE_EVENT")) {
            return T1.C.f5507d;
        }
        if (o6.j.a(str, "TRIGGER_EVENT")) {
            return T1.C.f5508e;
        }
        throw new IllegalArgumentException(A.j.o("Can't convert value to enum, unknown value: ", str));
    }

    public static T1.C n(String str) {
        if (o6.j.a(str, "IMAGE_EVENT")) {
            return T1.C.f5507d;
        }
        if (o6.j.a(str, "TRIGGER_EVENT")) {
            return T1.C.f5508e;
        }
        throw new IllegalArgumentException(A.j.o("Can't convert value to enum, unknown value: ", str));
    }

    public static T1.G o(String str) {
        switch (str.hashCode()) {
            case -1838656495:
                if (str.equals("STRING")) {
                    return T1.G.k;
                }
                break;
            case -1618932450:
                if (str.equals("INTEGER")) {
                    return T1.G.f5521h;
                }
                break;
            case 2054408:
                if (str.equals("BYTE")) {
                    return T1.G.f5518e;
                }
                break;
            case 2067286:
                if (str.equals("CHAR")) {
                    return T1.G.f5519f;
                }
                break;
            case 66988604:
                if (str.equals("FLOAT")) {
                    return T1.G.f5522i;
                }
                break;
            case 78875740:
                if (str.equals("SHORT")) {
                    return T1.G.j;
                }
                break;
            case 782694408:
                if (str.equals("BOOLEAN")) {
                    return T1.G.f5517d;
                }
                break;
            case 2022338513:
                if (str.equals("DOUBLE")) {
                    return T1.G.f5520g;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static T1.G p(String str) {
        switch (str.hashCode()) {
            case -1838656495:
                if (str.equals("STRING")) {
                    return T1.G.k;
                }
                break;
            case -1618932450:
                if (str.equals("INTEGER")) {
                    return T1.G.f5521h;
                }
                break;
            case 2054408:
                if (str.equals("BYTE")) {
                    return T1.G.f5518e;
                }
                break;
            case 2067286:
                if (str.equals("CHAR")) {
                    return T1.G.f5519f;
                }
                break;
            case 66988604:
                if (str.equals("FLOAT")) {
                    return T1.G.f5522i;
                }
                break;
            case 78875740:
                if (str.equals("SHORT")) {
                    return T1.G.j;
                }
                break;
            case 782694408:
                if (str.equals("BOOLEAN")) {
                    return T1.G.f5517d;
                }
                break;
            case 2022338513:
                if (str.equals("DOUBLE")) {
                    return T1.G.f5520g;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static N q(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 2030823) {
            if (hashCode != 2223327) {
                if (hashCode == 159220182 && str.equals("RECENT_APPS")) {
                    return N.f5542f;
                }
            } else if (str.equals("HOME")) {
                return N.f5541e;
            }
        } else if (str.equals("BACK")) {
            return N.f5540d;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static N r(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 2030823) {
            if (hashCode != 2223327) {
                if (hashCode == 159220182 && str.equals("RECENT_APPS")) {
                    return N.f5542f;
                }
            } else if (str.equals("HOME")) {
                return N.f5541e;
            }
        } else if (str.equals("BACK")) {
            return N.f5540d;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public void A(D0.a aVar, t.g gVar) {
        if (gVar.e()) {
            return;
        }
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new B(this, aVar, 0));
            return;
        }
        D0.c f8 = A.j.f(gVar, AbstractC1769h.a("SELECT `id`,`action_id`,`toggle_type`,`toggle_event_id` FROM `event_toggle_table` WHERE `action_id` IN ("), ")", "toString(...)", aVar);
        int h8 = gVar.h();
        int i4 = 1;
        for (int i8 = 0; i8 < h8; i8++) {
            i4 = A.j.e(gVar, i8, f8, i4, i4, 1);
        }
        try {
            int w8 = X.w(f8, "action_id");
            if (w8 == -1) {
                return;
            }
            while (f8.H()) {
                List list = (List) gVar.c(f8.getLong(w8));
                if (list != null) {
                    list.add(new T1.A(f8.getLong(0), f8.getLong(1), k(f8.l(2)), f8.getLong(3)));
                }
            }
        } finally {
            f8.close();
        }
    }

    public void B(D0.a aVar, t.g gVar) {
        if (gVar.e()) {
            return;
        }
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new G(this, aVar, 4));
            return;
        }
        D0.c f8 = A.j.f(gVar, AbstractC1769h.a("SELECT `id`,`action_id`,`toggle_type`,`toggle_event_id` FROM `event_toggle_table` WHERE `action_id` IN ("), ")", "toString(...)", aVar);
        int h8 = gVar.h();
        int i4 = 1;
        for (int i8 = 0; i8 < h8; i8++) {
            i4 = A.j.e(gVar, i8, f8, i4, i4, 1);
        }
        try {
            int w8 = X.w(f8, "action_id");
            if (w8 == -1) {
                return;
            }
            while (f8.H()) {
                List list = (List) gVar.c(f8.getLong(w8));
                if (list != null) {
                    list.add(new T1.A(f8.getLong(0), f8.getLong(1), l(f8.l(2)), f8.getLong(3)));
                }
            }
        } finally {
            f8.close();
        }
    }

    public void C(D0.a aVar, t.g gVar) {
        if (gVar.e()) {
            return;
        }
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new B(this, aVar, 3));
            return;
        }
        D0.c f8 = A.j.f(gVar, AbstractC1769h.a("SELECT `id`,`action_id`,`type`,`key`,`value` FROM `intent_extra_table` WHERE `action_id` IN ("), ")", "toString(...)", aVar);
        int h8 = gVar.h();
        int i4 = 1;
        for (int i8 = 0; i8 < h8; i8++) {
            i4 = A.j.e(gVar, i8, f8, i4, i4, 1);
        }
        try {
            int w8 = X.w(f8, "action_id");
            if (w8 == -1) {
                return;
            }
            while (f8.H()) {
                List list = (List) gVar.c(f8.getLong(w8));
                if (list != null) {
                    list.add(new T1.F(f8.getLong(0), f8.getLong(1), o(f8.l(2)), f8.l(3), f8.l(4)));
                }
            }
        } finally {
            f8.close();
        }
    }

    public void D(D0.a aVar, t.g gVar) {
        if (gVar.e()) {
            return;
        }
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new G(this, aVar, 0));
            return;
        }
        D0.c f8 = A.j.f(gVar, AbstractC1769h.a("SELECT `id`,`action_id`,`type`,`key`,`value` FROM `intent_extra_table` WHERE `action_id` IN ("), ")", "toString(...)", aVar);
        int h8 = gVar.h();
        int i4 = 1;
        for (int i8 = 0; i8 < h8; i8++) {
            i4 = A.j.e(gVar, i8, f8, i4, i4, 1);
        }
        try {
            int w8 = X.w(f8, "action_id");
            if (w8 == -1) {
                return;
            }
            while (f8.H()) {
                List list = (List) gVar.c(f8.getLong(w8));
                if (list != null) {
                    list.add(new T1.F(f8.getLong(0), f8.getLong(1), p(f8.l(2)), f8.l(3), f8.l(4)));
                }
            }
        } finally {
            f8.close();
        }
    }

    public void E(D0.a aVar, t.g gVar) {
        if (gVar.e()) {
            return;
        }
        if (gVar.h() > 999) {
            E2.d.D(gVar, false, new B(this, aVar, 5));
            return;
        }
        D0.c f8 = A.j.f(gVar, AbstractC1769h.a("SELECT `id`,`scenario_id`,`last_start_timestamp_ms`,`start_count` FROM `scenario_usage_table` WHERE `scenario_id` IN ("), ")", "toString(...)", aVar);
        int h8 = gVar.h();
        int i4 = 1;
        for (int i8 = 0; i8 < h8; i8++) {
            i4 = A.j.e(gVar, i8, f8, i4, i4, 1);
        }
        try {
            int w8 = X.w(f8, "scenario_id");
            if (w8 == -1) {
                return;
            }
            while (f8.H()) {
                long j = f8.getLong(w8);
                if (gVar.b(j)) {
                    gVar.g(j, new T1.L(f8.getLong(0), f8.getLong(1), f8.getLong(2), f8.getLong(3)));
                }
            }
        } finally {
            f8.close();
        }
    }

    public void F(D0.a aVar, t.g gVar) {
        if (gVar.e()) {
            return;
        }
        if (gVar.h() > 999) {
            E2.d.D(gVar, false, new G(this, aVar, 6));
            return;
        }
        D0.c f8 = A.j.f(gVar, AbstractC1769h.a("SELECT `id`,`scenario_id`,`last_start_timestamp_ms`,`start_count` FROM `scenario_usage_table` WHERE `scenario_id` IN ("), ")", "toString(...)", aVar);
        int h8 = gVar.h();
        int i4 = 1;
        for (int i8 = 0; i8 < h8; i8++) {
            i4 = A.j.e(gVar, i8, f8, i4, i4, 1);
        }
        try {
            int w8 = X.w(f8, "scenario_id");
            if (w8 == -1) {
                return;
            }
            while (f8.H()) {
                long j = f8.getLong(w8);
                if (gVar.b(j)) {
                    gVar.g(j, new T1.L(f8.getLong(0), f8.getLong(1), f8.getLong(2), f8.getLong(3)));
                }
            }
        } finally {
            f8.close();
        }
    }

    public final Object G(T1.K k, AbstractC0720j abstractC0720j) {
        switch (this.f5221a) {
            case 0:
                return D2.f.C(abstractC0720j, new C(this, k, 0), this.f5222b, false, true);
            default:
                return D2.f.C(abstractC0720j, new I(this, k, 1), this.f5222b, false, true);
        }
    }

    public final Object H(long j, AbstractC0713c abstractC0713c) {
        switch (this.f5221a) {
            case 0:
                Object C8 = D2.f.C(abstractC0713c, new C0290a(12, j), this.f5222b, false, true);
                if (C8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return C8;
            default:
                Object C9 = D2.f.C(abstractC0713c, new C0290a(14, j), this.f5222b, false, true);
                if (C9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return C9;
        }
    }

    public final Object I(long j, AbstractC0713c abstractC0713c) {
        switch (this.f5221a) {
            case 0:
                return D2.f.C(abstractC0713c, new E(j, this, 2), this.f5222b, true, true);
            default:
                return D2.f.C(abstractC0713c, new J(j, this, 2), this.f5222b, true, true);
        }
    }

    public void s(D0.a aVar, t.g gVar) {
        EnumC0307f enumC0307f;
        EnumC0307f enumC0307f2;
        Integer valueOf;
        Integer valueOf2;
        Long valueOf3;
        Long valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        Integer valueOf8;
        Integer valueOf9;
        Integer valueOf10;
        Long valueOf11;
        Long valueOf12;
        Integer valueOf13;
        Boolean bool;
        Integer valueOf14;
        Boolean bool2;
        String l6;
        String l8;
        Integer valueOf15;
        Integer valueOf16;
        Boolean bool3;
        T1.B k;
        String l9;
        EnumC0306e c6;
        T1.u i4;
        Integer valueOf17;
        String l10;
        T1.H h8;
        T1.H h9;
        String l11;
        String l12;
        Integer valueOf18;
        N q6;
        String l13;
        Integer valueOf19;
        Boolean bool4;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (gVar.e()) {
            return;
        }
        int i8 = 1;
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new B(this, aVar, 2));
            return;
        }
        D0.c f8 = A.j.f(gVar, AbstractC1769h.a("SELECT `id`,`eventId`,`priority`,`name`,`type`,`clickPositionType`,`x`,`y`,`clickOnConditionId`,`pressDuration`,`clickOffsetX`,`clickOffsetY`,`fromX`,`fromY`,`toX`,`toY`,`swipeDuration`,`pauseDuration`,`isAdvanced`,`isBroadcast`,`intent_action`,`component_name`,`flags`,`toggle_all`,`toggle_all_type`,`counter_name`,`counter_operation`,`counter_operation_value_type`,`counter_operation_value`,`counter_operation_counter_name`,`notification_message_type`,`notification_message_text`,`notification_message_counter_name`,`notification_importance`,`system_action_type`,`text_value`,`text_validate_input` FROM `action_table` WHERE `eventId` IN ("), ")", "toString(...)", aVar);
        int h10 = gVar.h();
        int i9 = 1;
        for (int i10 = 0; i10 < h10; i10++) {
            i9 = A.j.e(gVar, i10, f8, i9, i9, 1);
        }
        try {
            int w8 = X.w(f8, "eventId");
            if (w8 == -1) {
                f8.close();
                return;
            }
            Object obj = null;
            t.g gVar2 = new t.g(obj);
            t.g gVar3 = new t.g(obj);
            while (f8.H()) {
                long j = f8.getLong(0);
                if (!gVar2.b(j)) {
                    gVar2.g(j, new ArrayList());
                }
                long j5 = f8.getLong(0);
                if (!gVar3.b(j5)) {
                    gVar3.g(j5, new ArrayList());
                }
            }
            f8.reset();
            C(aVar, gVar2);
            A(aVar, gVar3);
            while (f8.H()) {
                List list = (List) gVar.c(f8.getLong(w8));
                if (list != null) {
                    long j8 = f8.getLong(0);
                    long j9 = f8.getLong(i8);
                    int i11 = (int) f8.getLong(2);
                    String l14 = f8.l(3);
                    EnumC0305d a3 = a(f8.l(4));
                    if (f8.isNull(5)) {
                        enumC0307f2 = null;
                    } else {
                        String l15 = f8.l(5);
                        if (o6.j.a(l15, "USER_SELECTED")) {
                            enumC0307f = EnumC0307f.f5594d;
                        } else if (o6.j.a(l15, "ON_DETECTED_CONDITION")) {
                            enumC0307f = EnumC0307f.f5595e;
                        } else {
                            throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + l15);
                        }
                        enumC0307f2 = enumC0307f;
                    }
                    if (f8.isNull(6)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf((int) f8.getLong(6));
                    }
                    if (f8.isNull(7)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf((int) f8.getLong(7));
                    }
                    if (f8.isNull(8)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(f8.getLong(8));
                    }
                    if (f8.isNull(9)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(f8.getLong(9));
                    }
                    if (f8.isNull(10)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Integer.valueOf((int) f8.getLong(10));
                    }
                    if (f8.isNull(11)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf((int) f8.getLong(11));
                    }
                    if (f8.isNull(12)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf((int) f8.getLong(12));
                    }
                    if (f8.isNull(13)) {
                        valueOf8 = null;
                    } else {
                        valueOf8 = Integer.valueOf((int) f8.getLong(13));
                    }
                    if (f8.isNull(14)) {
                        valueOf9 = null;
                    } else {
                        valueOf9 = Integer.valueOf((int) f8.getLong(14));
                    }
                    if (f8.isNull(15)) {
                        valueOf10 = null;
                    } else {
                        valueOf10 = Integer.valueOf((int) f8.getLong(15));
                    }
                    if (f8.isNull(16)) {
                        valueOf11 = null;
                    } else {
                        valueOf11 = Long.valueOf(f8.getLong(16));
                    }
                    if (f8.isNull(17)) {
                        valueOf12 = null;
                    } else {
                        valueOf12 = Long.valueOf(f8.getLong(17));
                    }
                    if (f8.isNull(18)) {
                        valueOf13 = null;
                    } else {
                        valueOf13 = Integer.valueOf((int) f8.getLong(18));
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
                    if (f8.isNull(19)) {
                        valueOf14 = null;
                    } else {
                        valueOf14 = Integer.valueOf((int) f8.getLong(19));
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
                    if (f8.isNull(20)) {
                        l6 = null;
                    } else {
                        l6 = f8.l(20);
                    }
                    if (f8.isNull(21)) {
                        l8 = null;
                    } else {
                        l8 = f8.l(21);
                    }
                    if (f8.isNull(22)) {
                        valueOf15 = null;
                    } else {
                        valueOf15 = Integer.valueOf((int) f8.getLong(22));
                    }
                    if (f8.isNull(23)) {
                        valueOf16 = null;
                    } else {
                        valueOf16 = Integer.valueOf((int) f8.getLong(23));
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
                    if (f8.isNull(24)) {
                        k = null;
                    } else {
                        k = k(f8.l(24));
                    }
                    if (f8.isNull(25)) {
                        l9 = null;
                    } else {
                        l9 = f8.l(25);
                    }
                    if (f8.isNull(26)) {
                        c6 = null;
                    } else {
                        c6 = c(f8.l(26));
                    }
                    if (f8.isNull(27)) {
                        i4 = null;
                    } else {
                        i4 = i(f8.l(27));
                    }
                    if (f8.isNull(28)) {
                        valueOf17 = null;
                    } else {
                        valueOf17 = Integer.valueOf((int) f8.getLong(28));
                    }
                    if (f8.isNull(29)) {
                        l10 = null;
                    } else {
                        l10 = f8.l(29);
                    }
                    if (f8.isNull(30)) {
                        h9 = null;
                    } else {
                        String l16 = f8.l(30);
                        if (o6.j.a(l16, "TEXT")) {
                            h8 = T1.H.f5524d;
                        } else if (o6.j.a(l16, "COUNTER_VALUE")) {
                            h8 = T1.H.f5525e;
                        } else {
                            throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + l16);
                        }
                        h9 = h8;
                    }
                    if (f8.isNull(31)) {
                        l11 = null;
                    } else {
                        l11 = f8.l(31);
                    }
                    if (f8.isNull(32)) {
                        l12 = null;
                    } else {
                        l12 = f8.l(32);
                    }
                    if (f8.isNull(33)) {
                        valueOf18 = null;
                    } else {
                        valueOf18 = Integer.valueOf((int) f8.getLong(33));
                    }
                    if (f8.isNull(34)) {
                        q6 = null;
                    } else {
                        q6 = q(f8.l(34));
                    }
                    if (f8.isNull(35)) {
                        l13 = null;
                    } else {
                        l13 = f8.l(35);
                    }
                    if (f8.isNull(36)) {
                        valueOf19 = null;
                    } else {
                        valueOf19 = Integer.valueOf((int) f8.getLong(36));
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
                    C0304c c0304c = new C0304c(j8, j9, i11, l14, a3, enumC0307f2, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, bool, bool2, l6, l8, valueOf15, bool3, k, l9, c6, i4, valueOf17, l10, h9, l11, l12, valueOf18, q6, l13, bool4);
                    Object c9 = gVar2.c(f8.getLong(0));
                    if (c9 != null) {
                        List list2 = (List) c9;
                        Object c10 = gVar3.c(f8.getLong(0));
                        if (c10 != null) {
                            list.add(new C0310i(c0304c, list2, (List) c10));
                            i8 = 1;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            f8.close();
        } catch (Throwable th) {
            f8.close();
            throw th;
        }
    }

    public void t(D0.a aVar, t.g gVar) {
        EnumC0307f enumC0307f;
        EnumC0307f enumC0307f2;
        Integer valueOf;
        Integer valueOf2;
        Long valueOf3;
        Long valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        Integer valueOf8;
        Integer valueOf9;
        Integer valueOf10;
        Long valueOf11;
        Long valueOf12;
        Integer valueOf13;
        Boolean bool;
        Integer valueOf14;
        Boolean bool2;
        String l6;
        String l8;
        Integer valueOf15;
        Integer valueOf16;
        Boolean bool3;
        T1.B l9;
        String l10;
        EnumC0306e d2;
        T1.u j;
        Integer valueOf17;
        String l11;
        T1.H h8;
        T1.H h9;
        String l12;
        String l13;
        Integer valueOf18;
        N r8;
        String l14;
        Integer valueOf19;
        Boolean bool4;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (gVar.e()) {
            return;
        }
        int i4 = 1;
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new G(this, aVar, 2));
            return;
        }
        D0.c f8 = A.j.f(gVar, AbstractC1769h.a("SELECT `id`,`eventId`,`priority`,`name`,`type`,`clickPositionType`,`x`,`y`,`clickOnConditionId`,`pressDuration`,`clickOffsetX`,`clickOffsetY`,`fromX`,`fromY`,`toX`,`toY`,`swipeDuration`,`pauseDuration`,`isAdvanced`,`isBroadcast`,`intent_action`,`component_name`,`flags`,`toggle_all`,`toggle_all_type`,`counter_name`,`counter_operation`,`counter_operation_value_type`,`counter_operation_value`,`counter_operation_counter_name`,`notification_message_type`,`notification_message_text`,`notification_message_counter_name`,`notification_importance`,`system_action_type`,`text_value`,`text_validate_input` FROM `action_table` WHERE `eventId` IN ("), ")", "toString(...)", aVar);
        int h10 = gVar.h();
        int i8 = 1;
        for (int i9 = 0; i9 < h10; i9++) {
            i8 = A.j.e(gVar, i9, f8, i8, i8, 1);
        }
        try {
            int w8 = X.w(f8, "eventId");
            if (w8 == -1) {
                f8.close();
                return;
            }
            Object obj = null;
            t.g gVar2 = new t.g(obj);
            t.g gVar3 = new t.g(obj);
            while (f8.H()) {
                long j5 = f8.getLong(0);
                if (!gVar2.b(j5)) {
                    gVar2.g(j5, new ArrayList());
                }
                long j8 = f8.getLong(0);
                if (!gVar3.b(j8)) {
                    gVar3.g(j8, new ArrayList());
                }
            }
            f8.reset();
            D(aVar, gVar2);
            B(aVar, gVar3);
            while (f8.H()) {
                List list = (List) gVar.c(f8.getLong(w8));
                if (list != null) {
                    long j9 = f8.getLong(0);
                    long j10 = f8.getLong(i4);
                    int i10 = (int) f8.getLong(2);
                    String l15 = f8.l(3);
                    EnumC0305d b4 = b(f8.l(4));
                    if (f8.isNull(5)) {
                        enumC0307f2 = null;
                    } else {
                        String l16 = f8.l(5);
                        if (o6.j.a(l16, "USER_SELECTED")) {
                            enumC0307f = EnumC0307f.f5594d;
                        } else if (o6.j.a(l16, "ON_DETECTED_CONDITION")) {
                            enumC0307f = EnumC0307f.f5595e;
                        } else {
                            throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + l16);
                        }
                        enumC0307f2 = enumC0307f;
                    }
                    if (f8.isNull(6)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf((int) f8.getLong(6));
                    }
                    if (f8.isNull(7)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf((int) f8.getLong(7));
                    }
                    if (f8.isNull(8)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(f8.getLong(8));
                    }
                    if (f8.isNull(9)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(f8.getLong(9));
                    }
                    if (f8.isNull(10)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Integer.valueOf((int) f8.getLong(10));
                    }
                    if (f8.isNull(11)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf((int) f8.getLong(11));
                    }
                    if (f8.isNull(12)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf((int) f8.getLong(12));
                    }
                    if (f8.isNull(13)) {
                        valueOf8 = null;
                    } else {
                        valueOf8 = Integer.valueOf((int) f8.getLong(13));
                    }
                    if (f8.isNull(14)) {
                        valueOf9 = null;
                    } else {
                        valueOf9 = Integer.valueOf((int) f8.getLong(14));
                    }
                    if (f8.isNull(15)) {
                        valueOf10 = null;
                    } else {
                        valueOf10 = Integer.valueOf((int) f8.getLong(15));
                    }
                    if (f8.isNull(16)) {
                        valueOf11 = null;
                    } else {
                        valueOf11 = Long.valueOf(f8.getLong(16));
                    }
                    if (f8.isNull(17)) {
                        valueOf12 = null;
                    } else {
                        valueOf12 = Long.valueOf(f8.getLong(17));
                    }
                    if (f8.isNull(18)) {
                        valueOf13 = null;
                    } else {
                        valueOf13 = Integer.valueOf((int) f8.getLong(18));
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
                    if (f8.isNull(19)) {
                        valueOf14 = null;
                    } else {
                        valueOf14 = Integer.valueOf((int) f8.getLong(19));
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
                    if (f8.isNull(20)) {
                        l6 = null;
                    } else {
                        l6 = f8.l(20);
                    }
                    if (f8.isNull(21)) {
                        l8 = null;
                    } else {
                        l8 = f8.l(21);
                    }
                    if (f8.isNull(22)) {
                        valueOf15 = null;
                    } else {
                        valueOf15 = Integer.valueOf((int) f8.getLong(22));
                    }
                    if (f8.isNull(23)) {
                        valueOf16 = null;
                    } else {
                        valueOf16 = Integer.valueOf((int) f8.getLong(23));
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
                    if (f8.isNull(24)) {
                        l9 = null;
                    } else {
                        l9 = l(f8.l(24));
                    }
                    if (f8.isNull(25)) {
                        l10 = null;
                    } else {
                        l10 = f8.l(25);
                    }
                    if (f8.isNull(26)) {
                        d2 = null;
                    } else {
                        d2 = d(f8.l(26));
                    }
                    if (f8.isNull(27)) {
                        j = null;
                    } else {
                        j = j(f8.l(27));
                    }
                    if (f8.isNull(28)) {
                        valueOf17 = null;
                    } else {
                        valueOf17 = Integer.valueOf((int) f8.getLong(28));
                    }
                    if (f8.isNull(29)) {
                        l11 = null;
                    } else {
                        l11 = f8.l(29);
                    }
                    if (f8.isNull(30)) {
                        h9 = null;
                    } else {
                        String l17 = f8.l(30);
                        if (o6.j.a(l17, "TEXT")) {
                            h8 = T1.H.f5524d;
                        } else if (o6.j.a(l17, "COUNTER_VALUE")) {
                            h8 = T1.H.f5525e;
                        } else {
                            throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + l17);
                        }
                        h9 = h8;
                    }
                    if (f8.isNull(31)) {
                        l12 = null;
                    } else {
                        l12 = f8.l(31);
                    }
                    if (f8.isNull(32)) {
                        l13 = null;
                    } else {
                        l13 = f8.l(32);
                    }
                    if (f8.isNull(33)) {
                        valueOf18 = null;
                    } else {
                        valueOf18 = Integer.valueOf((int) f8.getLong(33));
                    }
                    if (f8.isNull(34)) {
                        r8 = null;
                    } else {
                        r8 = r(f8.l(34));
                    }
                    if (f8.isNull(35)) {
                        l14 = null;
                    } else {
                        l14 = f8.l(35);
                    }
                    if (f8.isNull(36)) {
                        valueOf19 = null;
                    } else {
                        valueOf19 = Integer.valueOf((int) f8.getLong(36));
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
                    C0304c c0304c = new C0304c(j9, j10, i10, l15, b4, enumC0307f2, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, bool, bool2, l6, l8, valueOf15, bool3, l9, l10, d2, j, valueOf17, l11, h9, l12, l13, valueOf18, r8, l14, bool4);
                    Object c6 = gVar2.c(f8.getLong(0));
                    if (c6 != null) {
                        List list2 = (List) c6;
                        Object c9 = gVar3.c(f8.getLong(0));
                        if (c9 != null) {
                            list.add(new C0310i(c0304c, list2, (List) c9));
                            i4 = 1;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            f8.close();
        } catch (Throwable th) {
            f8.close();
            throw th;
        }
    }

    public void u(D0.a aVar, t.g gVar) {
        String l6;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        Boolean bool;
        Integer valueOf8;
        Integer valueOf9;
        Integer valueOf10;
        Integer valueOf11;
        String l8;
        String l9;
        T1.t g8;
        T1.u i4;
        Integer valueOf12;
        String l10;
        Long valueOf13;
        Integer valueOf14;
        boolean z8;
        boolean z9;
        if (gVar.e()) {
            return;
        }
        int i8 = 1;
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new B(this, aVar, 1));
            return;
        }
        D0.c f8 = A.j.f(gVar, AbstractC1769h.a("SELECT `id`,`eventId`,`name`,`type`,`priority`,`path`,`area_left`,`area_top`,`area_right`,`area_bottom`,`threshold`,`detection_type`,`shouldBeDetected`,`detection_area_left`,`detection_area_top`,`detection_area_right`,`detection_area_bottom`,`broadcast_action`,`counter_name`,`counter_comparison_operation`,`counter_operation_value_type`,`counter_value`,`counter_value_counter_name`,`timer_value_ms`,`timer_restart_when_reached` FROM `condition_table` WHERE `eventId` IN ("), ")", "toString(...)", aVar);
        int h8 = gVar.h();
        int i9 = 1;
        for (int i10 = 0; i10 < h8; i10++) {
            i9 = A.j.e(gVar, i10, f8, i9, i9, 1);
        }
        try {
            int w8 = X.w(f8, "eventId");
            if (w8 == -1) {
                f8.close();
                return;
            }
            while (f8.H()) {
                List list = (List) gVar.c(f8.getLong(w8));
                if (list != null) {
                    long j = f8.getLong(0);
                    long j5 = f8.getLong(i8);
                    String l11 = f8.l(2);
                    T1.s e9 = e(f8.l(3));
                    int i11 = (int) f8.getLong(4);
                    Boolean bool2 = null;
                    if (f8.isNull(5)) {
                        l6 = null;
                    } else {
                        l6 = f8.l(5);
                    }
                    if (f8.isNull(6)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf((int) f8.getLong(6));
                    }
                    if (f8.isNull(7)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf((int) f8.getLong(7));
                    }
                    if (f8.isNull(8)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf((int) f8.getLong(8));
                    }
                    if (f8.isNull(9)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Integer.valueOf((int) f8.getLong(9));
                    }
                    if (f8.isNull(10)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Integer.valueOf((int) f8.getLong(10));
                    }
                    if (f8.isNull(11)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf((int) f8.getLong(11));
                    }
                    if (f8.isNull(12)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf((int) f8.getLong(12));
                    }
                    if (valueOf7 != null) {
                        if (valueOf7.intValue() != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        bool = Boolean.valueOf(z9);
                    } else {
                        bool = null;
                    }
                    if (f8.isNull(13)) {
                        valueOf8 = null;
                    } else {
                        valueOf8 = Integer.valueOf((int) f8.getLong(13));
                    }
                    if (f8.isNull(14)) {
                        valueOf9 = null;
                    } else {
                        valueOf9 = Integer.valueOf((int) f8.getLong(14));
                    }
                    if (f8.isNull(15)) {
                        valueOf10 = null;
                    } else {
                        valueOf10 = Integer.valueOf((int) f8.getLong(15));
                    }
                    if (f8.isNull(16)) {
                        valueOf11 = null;
                    } else {
                        valueOf11 = Integer.valueOf((int) f8.getLong(16));
                    }
                    if (f8.isNull(17)) {
                        l8 = null;
                    } else {
                        l8 = f8.l(17);
                    }
                    if (f8.isNull(18)) {
                        l9 = null;
                    } else {
                        l9 = f8.l(18);
                    }
                    if (f8.isNull(19)) {
                        g8 = null;
                    } else {
                        g8 = g(f8.l(19));
                    }
                    if (f8.isNull(20)) {
                        i4 = null;
                    } else {
                        i4 = i(f8.l(20));
                    }
                    if (f8.isNull(21)) {
                        valueOf12 = null;
                    } else {
                        valueOf12 = Integer.valueOf((int) f8.getLong(21));
                    }
                    if (f8.isNull(22)) {
                        l10 = null;
                    } else {
                        l10 = f8.l(22);
                    }
                    if (f8.isNull(23)) {
                        valueOf13 = null;
                    } else {
                        valueOf13 = Long.valueOf(f8.getLong(23));
                    }
                    if (f8.isNull(24)) {
                        valueOf14 = null;
                    } else {
                        valueOf14 = Integer.valueOf((int) f8.getLong(24));
                    }
                    if (valueOf14 != null) {
                        if (valueOf14.intValue() != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        bool2 = Boolean.valueOf(z8);
                    }
                    list.add(new T1.r(j, j5, l11, e9, i11, l6, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, bool, valueOf8, valueOf9, valueOf10, valueOf11, l8, l9, g8, i4, valueOf12, l10, valueOf13, bool2));
                    i8 = 1;
                }
            }
            f8.close();
        } catch (Throwable th) {
            f8.close();
            throw th;
        }
    }

    public void v(D0.a aVar, t.g gVar) {
        String l6;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        Boolean bool;
        Integer valueOf8;
        Integer valueOf9;
        Integer valueOf10;
        Integer valueOf11;
        String l8;
        String l9;
        T1.t h8;
        T1.u j;
        Integer valueOf12;
        String l10;
        Long valueOf13;
        Integer valueOf14;
        boolean z8;
        boolean z9;
        if (gVar.e()) {
            return;
        }
        int i4 = 1;
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new G(this, aVar, 3));
            return;
        }
        D0.c f8 = A.j.f(gVar, AbstractC1769h.a("SELECT `id`,`eventId`,`name`,`type`,`priority`,`path`,`area_left`,`area_top`,`area_right`,`area_bottom`,`threshold`,`detection_type`,`shouldBeDetected`,`detection_area_left`,`detection_area_top`,`detection_area_right`,`detection_area_bottom`,`broadcast_action`,`counter_name`,`counter_comparison_operation`,`counter_operation_value_type`,`counter_value`,`counter_value_counter_name`,`timer_value_ms`,`timer_restart_when_reached` FROM `condition_table` WHERE `eventId` IN ("), ")", "toString(...)", aVar);
        int h9 = gVar.h();
        int i8 = 1;
        for (int i9 = 0; i9 < h9; i9++) {
            i8 = A.j.e(gVar, i9, f8, i8, i8, 1);
        }
        try {
            int w8 = X.w(f8, "eventId");
            if (w8 == -1) {
                f8.close();
                return;
            }
            while (f8.H()) {
                List list = (List) gVar.c(f8.getLong(w8));
                if (list != null) {
                    long j5 = f8.getLong(0);
                    long j8 = f8.getLong(i4);
                    String l11 = f8.l(2);
                    T1.s f9 = f(f8.l(3));
                    int i10 = (int) f8.getLong(4);
                    Boolean bool2 = null;
                    if (f8.isNull(5)) {
                        l6 = null;
                    } else {
                        l6 = f8.l(5);
                    }
                    if (f8.isNull(6)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf((int) f8.getLong(6));
                    }
                    if (f8.isNull(7)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf((int) f8.getLong(7));
                    }
                    if (f8.isNull(8)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf((int) f8.getLong(8));
                    }
                    if (f8.isNull(9)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Integer.valueOf((int) f8.getLong(9));
                    }
                    if (f8.isNull(10)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Integer.valueOf((int) f8.getLong(10));
                    }
                    if (f8.isNull(11)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf((int) f8.getLong(11));
                    }
                    if (f8.isNull(12)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf((int) f8.getLong(12));
                    }
                    if (valueOf7 != null) {
                        if (valueOf7.intValue() != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        bool = Boolean.valueOf(z9);
                    } else {
                        bool = null;
                    }
                    if (f8.isNull(13)) {
                        valueOf8 = null;
                    } else {
                        valueOf8 = Integer.valueOf((int) f8.getLong(13));
                    }
                    if (f8.isNull(14)) {
                        valueOf9 = null;
                    } else {
                        valueOf9 = Integer.valueOf((int) f8.getLong(14));
                    }
                    if (f8.isNull(15)) {
                        valueOf10 = null;
                    } else {
                        valueOf10 = Integer.valueOf((int) f8.getLong(15));
                    }
                    if (f8.isNull(16)) {
                        valueOf11 = null;
                    } else {
                        valueOf11 = Integer.valueOf((int) f8.getLong(16));
                    }
                    if (f8.isNull(17)) {
                        l8 = null;
                    } else {
                        l8 = f8.l(17);
                    }
                    if (f8.isNull(18)) {
                        l9 = null;
                    } else {
                        l9 = f8.l(18);
                    }
                    if (f8.isNull(19)) {
                        h8 = null;
                    } else {
                        h8 = h(f8.l(19));
                    }
                    if (f8.isNull(20)) {
                        j = null;
                    } else {
                        j = j(f8.l(20));
                    }
                    if (f8.isNull(21)) {
                        valueOf12 = null;
                    } else {
                        valueOf12 = Integer.valueOf((int) f8.getLong(21));
                    }
                    if (f8.isNull(22)) {
                        l10 = null;
                    } else {
                        l10 = f8.l(22);
                    }
                    if (f8.isNull(23)) {
                        valueOf13 = null;
                    } else {
                        valueOf13 = Long.valueOf(f8.getLong(23));
                    }
                    if (f8.isNull(24)) {
                        valueOf14 = null;
                    } else {
                        valueOf14 = Integer.valueOf((int) f8.getLong(24));
                    }
                    if (valueOf14 != null) {
                        if (valueOf14.intValue() != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        bool2 = Boolean.valueOf(z8);
                    }
                    list.add(new T1.r(j5, j8, l11, f9, i10, l6, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, bool, valueOf8, valueOf9, valueOf10, valueOf11, l8, l9, h8, j, valueOf12, l10, valueOf13, bool2));
                    i4 = 1;
                }
            }
            f8.close();
        } catch (Throwable th) {
            f8.close();
            throw th;
        }
    }

    public void w(D0.a aVar, t.g gVar) {
        boolean z8;
        Integer valueOf;
        Boolean bool;
        boolean z9;
        if (gVar.e()) {
            return;
        }
        int i4 = 1;
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new B(this, aVar, 6));
            return;
        }
        D0.c f8 = A.j.f(gVar, AbstractC1769h.a("SELECT `id`,`scenario_id`,`name`,`operator`,`priority`,`enabled_on_start`,`type`,`keep_detecting` FROM `event_table` WHERE `scenario_id` IN ("), ")", "toString(...)", aVar);
        int h8 = gVar.h();
        int i8 = 0;
        int i9 = 1;
        for (int i10 = 0; i10 < h8; i10++) {
            i9 = A.j.e(gVar, i10, f8, i9, i9, 1);
        }
        try {
            int w8 = X.w(f8, "scenario_id");
            if (w8 == -1) {
                f8.close();
                return;
            }
            Object obj = null;
            t.g gVar2 = new t.g(obj);
            t.g gVar3 = new t.g(obj);
            while (f8.H()) {
                long j = f8.getLong(0);
                if (!gVar2.b(j)) {
                    gVar2.g(j, new ArrayList());
                }
                long j5 = f8.getLong(0);
                if (!gVar3.b(j5)) {
                    gVar3.g(j5, new ArrayList());
                }
            }
            f8.reset();
            s(aVar, gVar2);
            u(aVar, gVar3);
            while (f8.H()) {
                List list = (List) gVar.c(f8.getLong(w8));
                if (list != null) {
                    long j8 = f8.getLong(i8);
                    long j9 = f8.getLong(i4);
                    String l6 = f8.l(2);
                    int i11 = (int) f8.getLong(3);
                    int i12 = (int) f8.getLong(4);
                    if (((int) f8.getLong(5)) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    T1.C m6 = m(f8.l(6));
                    if (f8.isNull(7)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf((int) f8.getLong(7));
                    }
                    if (valueOf != null) {
                        if (valueOf.intValue() != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        bool = Boolean.valueOf(z9);
                    } else {
                        bool = null;
                    }
                    T1.x xVar = new T1.x(j8, j9, l6, i11, i12, z8, m6, bool);
                    Object c6 = gVar2.c(f8.getLong(0));
                    if (c6 != null) {
                        List list2 = (List) c6;
                        Object c9 = gVar3.c(f8.getLong(0));
                        if (c9 != null) {
                            list.add(new C0313l(xVar, list2, (List) c9));
                            i8 = 0;
                            i4 = 1;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            f8.close();
        } catch (Throwable th) {
            f8.close();
            throw th;
        }
    }

    public void x(D0.a aVar, t.g gVar) {
        boolean z8;
        Integer valueOf;
        Boolean bool;
        boolean z9;
        if (gVar.e()) {
            return;
        }
        int i4 = 1;
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new G(this, aVar, 1));
            return;
        }
        D0.c f8 = A.j.f(gVar, AbstractC1769h.a("SELECT `id`,`scenario_id`,`name`,`operator`,`priority`,`enabled_on_start`,`type`,`keep_detecting` FROM `event_table` WHERE `scenario_id` IN ("), ")", "toString(...)", aVar);
        int h8 = gVar.h();
        int i8 = 0;
        int i9 = 1;
        for (int i10 = 0; i10 < h8; i10++) {
            i9 = A.j.e(gVar, i10, f8, i9, i9, 1);
        }
        try {
            int w8 = X.w(f8, "scenario_id");
            if (w8 == -1) {
                f8.close();
                return;
            }
            Object obj = null;
            t.g gVar2 = new t.g(obj);
            t.g gVar3 = new t.g(obj);
            while (f8.H()) {
                long j = f8.getLong(0);
                if (!gVar2.b(j)) {
                    gVar2.g(j, new ArrayList());
                }
                long j5 = f8.getLong(0);
                if (!gVar3.b(j5)) {
                    gVar3.g(j5, new ArrayList());
                }
            }
            f8.reset();
            t(aVar, gVar2);
            v(aVar, gVar3);
            while (f8.H()) {
                List list = (List) gVar.c(f8.getLong(w8));
                if (list != null) {
                    long j8 = f8.getLong(i8);
                    long j9 = f8.getLong(i4);
                    String l6 = f8.l(2);
                    int i11 = (int) f8.getLong(3);
                    int i12 = (int) f8.getLong(4);
                    if (((int) f8.getLong(5)) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    T1.C n3 = n(f8.l(6));
                    if (f8.isNull(7)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf((int) f8.getLong(7));
                    }
                    if (valueOf != null) {
                        if (valueOf.intValue() != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        bool = Boolean.valueOf(z9);
                    } else {
                        bool = null;
                    }
                    T1.x xVar = new T1.x(j8, j9, l6, i11, i12, z8, n3, bool);
                    Object c6 = gVar2.c(f8.getLong(0));
                    if (c6 != null) {
                        List list2 = (List) c6;
                        Object c9 = gVar3.c(f8.getLong(0));
                        if (c9 != null) {
                            list.add(new C0313l(xVar, list2, (List) c9));
                            i8 = 0;
                            i4 = 1;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            f8.close();
        } catch (Throwable th) {
            f8.close();
            throw th;
        }
    }

    public void y(D0.a aVar, t.g gVar) {
        boolean z8;
        Integer valueOf;
        boolean z9;
        if (gVar.e()) {
            return;
        }
        int i4 = 1;
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new B(this, aVar, 4));
            return;
        }
        D0.c f8 = A.j.f(gVar, AbstractC1769h.a("SELECT `id`,`scenario_id`,`name`,`operator`,`priority`,`enabled_on_start`,`type`,`keep_detecting` FROM `event_table` WHERE `scenario_id` IN ("), ")", "toString(...)", aVar);
        int h8 = gVar.h();
        int i8 = 1;
        for (int i9 = 0; i9 < h8; i9++) {
            i8 = A.j.e(gVar, i9, f8, i8, i8, 1);
        }
        try {
            int w8 = X.w(f8, "scenario_id");
            if (w8 == -1) {
                f8.close();
                return;
            }
            while (f8.H()) {
                List list = (List) gVar.c(f8.getLong(w8));
                if (list != null) {
                    long j = f8.getLong(0);
                    long j5 = f8.getLong(i4);
                    String l6 = f8.l(2);
                    int i10 = (int) f8.getLong(3);
                    int i11 = (int) f8.getLong(4);
                    if (((int) f8.getLong(5)) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    T1.C m6 = m(f8.l(6));
                    Boolean bool = null;
                    if (f8.isNull(7)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf((int) f8.getLong(7));
                    }
                    if (valueOf != null) {
                        if (valueOf.intValue() != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        bool = Boolean.valueOf(z9);
                    }
                    list.add(new T1.x(j, j5, l6, i10, i11, z8, m6, bool));
                    i4 = 1;
                }
            }
            f8.close();
        } catch (Throwable th) {
            f8.close();
            throw th;
        }
    }

    public void z(D0.a aVar, t.g gVar) {
        boolean z8;
        Integer valueOf;
        boolean z9;
        if (gVar.e()) {
            return;
        }
        int i4 = 1;
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new G(this, aVar, 5));
            return;
        }
        D0.c f8 = A.j.f(gVar, AbstractC1769h.a("SELECT `id`,`scenario_id`,`name`,`operator`,`priority`,`enabled_on_start`,`type`,`keep_detecting` FROM `event_table` WHERE `scenario_id` IN ("), ")", "toString(...)", aVar);
        int h8 = gVar.h();
        int i8 = 1;
        for (int i9 = 0; i9 < h8; i9++) {
            i8 = A.j.e(gVar, i9, f8, i8, i8, 1);
        }
        try {
            int w8 = X.w(f8, "scenario_id");
            if (w8 == -1) {
                f8.close();
                return;
            }
            while (f8.H()) {
                List list = (List) gVar.c(f8.getLong(w8));
                if (list != null) {
                    long j = f8.getLong(0);
                    long j5 = f8.getLong(i4);
                    String l6 = f8.l(2);
                    int i10 = (int) f8.getLong(3);
                    int i11 = (int) f8.getLong(4);
                    if (((int) f8.getLong(5)) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    T1.C n3 = n(f8.l(6));
                    Boolean bool = null;
                    if (f8.isNull(7)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf((int) f8.getLong(7));
                    }
                    if (valueOf != null) {
                        if (valueOf.intValue() != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        bool = Boolean.valueOf(z9);
                    }
                    list.add(new T1.x(j, j5, l6, i10, i11, z8, n3, bool));
                    i4 = 1;
                }
            }
            f8.close();
        } catch (Throwable th) {
            f8.close();
            throw th;
        }
    }
}
