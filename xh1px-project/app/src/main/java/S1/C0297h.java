package S1;

import T1.EnumC0305d;
import T1.EnumC0306e;
import T1.EnumC0307f;
import T1.N;
import h6.AbstractC0837b;
import h7.AbstractC0842e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import q4.X;
import x.AbstractC1769h;

/* renamed from: S1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5259a;

    /* renamed from: b, reason: collision with root package name */
    public final u0.u f5260b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0842e f5261c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0842e f5262d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0842e f5263e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0837b f5264f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0837b f5265g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0837b f5266h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0837b f5267i;
    public final AbstractC0837b j;
    public final AbstractC0837b k;

    public C0297h(u0.u uVar, int i4) {
        this.f5259a = i4;
        switch (i4) {
            case 1:
                this.f5260b = uVar;
                this.f5261c = new C0300k(this, 0);
                this.f5262d = new C0300k(this, 1);
                this.f5263e = new C0300k(this, 2);
                this.f5264f = new C0295f(3);
                this.f5265g = new C0295f(4);
                this.f5266h = new C0295f(5);
                this.f5267i = new C0301l(this, 0);
                this.j = new C0301l(this, 1);
                this.k = new C0301l(this, 2);
                return;
            default:
                this.f5260b = uVar;
                this.f5261c = new C0294e(this, 0);
                this.f5262d = new C0294e(this, 1);
                this.f5263e = new C0294e(this, 2);
                this.f5264f = new C0295f(0);
                this.f5265g = new C0295f(1);
                this.f5266h = new C0295f(2);
                this.f5267i = new C0296g(this, 0);
                this.j = new C0296g(this, 1);
                this.k = new C0296g(this, 2);
                return;
        }
    }

    public static final String A(C0297h c0297h, T1.G g8) {
        switch (g8.ordinal()) {
            case 0:
                return "BOOLEAN";
            case 1:
                return "BYTE";
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return "CHAR";
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return "DOUBLE";
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return "INTEGER";
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return "FLOAT";
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return "SHORT";
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return "STRING";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String B(C0297h c0297h, T1.G g8) {
        switch (g8.ordinal()) {
            case 0:
                return "BOOLEAN";
            case 1:
                return "BYTE";
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return "CHAR";
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return "DOUBLE";
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return "INTEGER";
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return "FLOAT";
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return "SHORT";
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return "STRING";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String C(C0297h c0297h, N n3) {
        int ordinal = n3.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return "RECENT_APPS";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "HOME";
        }
        return "BACK";
    }

    public static final String D(C0297h c0297h, N n3) {
        int ordinal = n3.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return "RECENT_APPS";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "HOME";
        }
        return "BACK";
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

    public static EnumC0307f e(String str) {
        if (o6.j.a(str, "USER_SELECTED")) {
            return EnumC0307f.f5594d;
        }
        if (o6.j.a(str, "ON_DETECTED_CONDITION")) {
            return EnumC0307f.f5595e;
        }
        throw new IllegalArgumentException(A.j.o("Can't convert value to enum, unknown value: ", str));
    }

    public static EnumC0307f f(String str) {
        if (o6.j.a(str, "USER_SELECTED")) {
            return EnumC0307f.f5594d;
        }
        if (o6.j.a(str, "ON_DETECTED_CONDITION")) {
            return EnumC0307f.f5595e;
        }
        throw new IllegalArgumentException(A.j.o("Can't convert value to enum, unknown value: ", str));
    }

    public static T1.u g(String str) {
        if (o6.j.a(str, "NUMBER")) {
            return T1.u.f5647d;
        }
        if (o6.j.a(str, "COUNTER")) {
            return T1.u.f5648e;
        }
        throw new IllegalArgumentException(A.j.o("Can't convert value to enum, unknown value: ", str));
    }

    public static T1.u h(String str) {
        if (o6.j.a(str, "NUMBER")) {
            return T1.u.f5647d;
        }
        if (o6.j.a(str, "COUNTER")) {
            return T1.u.f5648e;
        }
        throw new IllegalArgumentException(A.j.o("Can't convert value to enum, unknown value: ", str));
    }

    public static T1.B i(String str) {
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

    public static T1.B j(String str) {
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

    public static T1.G k(String str) {
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

    public static T1.G l(String str) {
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

    public static T1.H m(String str) {
        if (o6.j.a(str, "TEXT")) {
            return T1.H.f5524d;
        }
        if (o6.j.a(str, "COUNTER_VALUE")) {
            return T1.H.f5525e;
        }
        throw new IllegalArgumentException(A.j.o("Can't convert value to enum, unknown value: ", str));
    }

    public static T1.H n(String str) {
        if (o6.j.a(str, "TEXT")) {
            return T1.H.f5524d;
        }
        if (o6.j.a(str, "COUNTER_VALUE")) {
            return T1.H.f5525e;
        }
        throw new IllegalArgumentException(A.j.o("Can't convert value to enum, unknown value: ", str));
    }

    public static N o(String str) {
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

    public static N p(String str) {
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

    public static final String u(C0297h c0297h, EnumC0305d enumC0305d) {
        switch (enumC0305d.ordinal()) {
            case 0:
                return "CLICK";
            case 1:
                return "SWIPE";
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return "PAUSE";
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return "INTENT";
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return "TOGGLE_EVENT";
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return "CHANGE_COUNTER";
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return "NOTIFICATION";
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return "SYSTEM";
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return "TEXT";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String v(C0297h c0297h, EnumC0305d enumC0305d) {
        switch (enumC0305d.ordinal()) {
            case 0:
                return "CLICK";
            case 1:
                return "SWIPE";
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return "PAUSE";
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return "INTENT";
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return "TOGGLE_EVENT";
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return "CHANGE_COUNTER";
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return "NOTIFICATION";
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return "SYSTEM";
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return "TEXT";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String w(C0297h c0297h, EnumC0306e enumC0306e) {
        int ordinal = enumC0306e.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return "SET";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "MINUS";
        }
        return "ADD";
    }

    public static final String x(C0297h c0297h, EnumC0306e enumC0306e) {
        int ordinal = enumC0306e.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return "SET";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "MINUS";
        }
        return "ADD";
    }

    public static final String y(C0297h c0297h, T1.B b4) {
        int ordinal = b4.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return "TOGGLE";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "DISABLE";
        }
        return "ENABLE";
    }

    public static final String z(C0297h c0297h, T1.B b4) {
        int ordinal = b4.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return "TOGGLE";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "DISABLE";
        }
        return "ENABLE";
    }

    public void q(D0.a aVar, t.g gVar) {
        if (gVar.e()) {
            return;
        }
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new C0292c(this, aVar, 1));
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
                    list.add(new T1.A(f8.getLong(0), f8.getLong(1), i(f8.l(2)), f8.getLong(3)));
                }
            }
        } finally {
            f8.close();
        }
    }

    public void r(D0.a aVar, t.g gVar) {
        if (gVar.e()) {
            return;
        }
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new C0299j(this, aVar, 1));
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
                    list.add(new T1.A(f8.getLong(0), f8.getLong(1), j(f8.l(2)), f8.getLong(3)));
                }
            }
        } finally {
            f8.close();
        }
    }

    public void s(D0.a aVar, t.g gVar) {
        if (gVar.e()) {
            return;
        }
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new C0292c(this, aVar, 0));
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
                    list.add(new T1.F(f8.getLong(0), f8.getLong(1), k(f8.l(2)), f8.l(3), f8.l(4)));
                }
            }
        } finally {
            f8.close();
        }
    }

    public void t(D0.a aVar, t.g gVar) {
        if (gVar.e()) {
            return;
        }
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new C0299j(this, aVar, 0));
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
                    list.add(new T1.F(f8.getLong(0), f8.getLong(1), l(f8.l(2)), f8.l(3), f8.l(4)));
                }
            }
        } finally {
            f8.close();
        }
    }
}
