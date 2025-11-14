package S1;

import e6.EnumC0646a;
import f6.AbstractC0713c;
import h6.AbstractC0837b;
import h7.AbstractC0842e;
import i.AbstractC0863b;
import kotlin.NoWhenBranchMatchedException;
import u0.C1621l;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5285a;

    /* renamed from: b, reason: collision with root package name */
    public final u0.u f5286b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0842e f5287c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0837b f5288d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0837b f5289e;

    public p(u0.u uVar, int i4) {
        this.f5285a = i4;
        switch (i4) {
            case 1:
                this.f5286b = uVar;
                this.f5287c = new n(this, 1);
                this.f5288d = new C0295f(7);
                this.f5289e = new o(this, 1);
                return;
            default:
                this.f5286b = uVar;
                this.f5287c = new n(this, 0);
                this.f5288d = new C0295f(6);
                this.f5289e = new o(this, 0);
                return;
        }
    }

    public static T1.s a(String str) {
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

    public static T1.s b(String str) {
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

    public static T1.t c(String str) {
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

    public static T1.t d(String str) {
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

    public static T1.u e(String str) {
        if (o6.j.a(str, "NUMBER")) {
            return T1.u.f5647d;
        }
        if (o6.j.a(str, "COUNTER")) {
            return T1.u.f5648e;
        }
        throw new IllegalArgumentException(A.j.o("Can't convert value to enum, unknown value: ", str));
    }

    public static T1.u f(String str) {
        if (o6.j.a(str, "NUMBER")) {
            return T1.u.f5647d;
        }
        if (o6.j.a(str, "COUNTER")) {
            return T1.u.f5648e;
        }
        throw new IllegalArgumentException(A.j.o("Can't convert value to enum, unknown value: ", str));
    }

    public static final String g(p pVar, T1.s sVar) {
        int ordinal = sVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return "ON_TIMER_REACHED";
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return "ON_IMAGE_DETECTED";
            }
            return "ON_COUNTER_REACHED";
        }
        return "ON_BROADCAST_RECEIVED";
    }

    public static final String h(p pVar, T1.s sVar) {
        int ordinal = sVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return "ON_TIMER_REACHED";
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return "ON_IMAGE_DETECTED";
            }
            return "ON_COUNTER_REACHED";
        }
        return "ON_BROADCAST_RECEIVED";
    }

    public static final String i(p pVar, T1.t tVar) {
        int ordinal = tVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return "GREATER_OR_EQUALS";
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return "GREATER";
                }
                return "LOWER_OR_EQUALS";
            }
            return "LOWER";
        }
        return "EQUALS";
    }

    public static final String j(p pVar, T1.t tVar) {
        int ordinal = tVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return "GREATER_OR_EQUALS";
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return "GREATER";
                }
                return "LOWER_OR_EQUALS";
            }
            return "LOWER";
        }
        return "EQUALS";
    }

    public final Object k(long j, AbstractC0713c abstractC0713c) {
        switch (this.f5285a) {
            case 0:
                return D2.f.C(abstractC0713c, new C0290a(5, j), this.f5286b, true, false);
            default:
                return D2.f.C(abstractC0713c, new C0290a(7, j), this.f5286b, true, false);
        }
    }

    public final Object l(b2.j jVar) {
        switch (this.f5285a) {
            case 0:
                return D2.f.C(jVar, new H7.o(this, 13), this.f5286b, true, false);
            default:
                return D2.f.C(jVar, new H7.o(this, 16), this.f5286b, true, false);
        }
    }

    public final C1621l m() {
        switch (this.f5285a) {
            case 0:
                H7.o oVar = new H7.o(this, 11);
                return AbstractC0863b.c(this.f5286b, false, new String[]{"condition_table"}, oVar);
            default:
                H7.o oVar2 = new H7.o(this, 15);
                return AbstractC0863b.c(this.f5286b, false, new String[]{"condition_table"}, oVar2);
        }
    }

    public final Object n(String str, AbstractC0713c abstractC0713c) {
        switch (this.f5285a) {
            case 0:
                return D2.f.C(abstractC0713c, new I7.n(str, 1), this.f5286b, true, false);
            default:
                return D2.f.C(abstractC0713c, new I7.n(str, 2), this.f5286b, true, false);
        }
    }

    public final Object o(T1.r rVar, b2.j jVar) {
        switch (this.f5285a) {
            case 0:
                Object C8 = D2.f.C(jVar, new M7.c(this, 6, rVar), this.f5286b, false, true);
                if (C8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return C8;
            default:
                Object C9 = D2.f.C(jVar, new M7.c(this, 7, rVar), this.f5286b, false, true);
                if (C9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return C9;
        }
    }
}
