package S1;

import T1.C0304c;
import T1.EnumC0305d;
import T1.EnumC0306e;
import T1.EnumC0307f;
import T1.N;
import h7.AbstractC0842e;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: S1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300k extends AbstractC0842e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0297h f5275b;

    public /* synthetic */ C0300k(C0297h c0297h, int i4) {
        this.f5274a = i4;
        this.f5275b = c0297h;
    }

    @Override // h7.AbstractC0842e
    public final void c(D0.c cVar, Object obj) {
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        String str2;
        String str3;
        switch (this.f5274a) {
            case 0:
                C0304c c0304c = (C0304c) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(c0304c, "entity");
                cVar.c(1, c0304c.f5558a);
                cVar.c(2, c0304c.f5559b);
                cVar.c(3, c0304c.f5560c);
                cVar.k(c0304c.f5561d, 4);
                EnumC0305d enumC0305d = c0304c.f5562e;
                C0297h c0297h = this.f5275b;
                cVar.k(C0297h.v(c0297h, enumC0305d), 5);
                EnumC0307f enumC0307f = c0304c.f5563f;
                if (enumC0307f == null) {
                    cVar.b(6);
                } else {
                    int ordinal = enumC0307f.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            str = "ON_DETECTED_CONDITION";
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        str = "USER_SELECTED";
                    }
                    cVar.k(str, 6);
                }
                if (c0304c.f5564g == null) {
                    cVar.b(7);
                } else {
                    cVar.c(7, r0.intValue());
                }
                if (c0304c.f5565h == null) {
                    cVar.b(8);
                } else {
                    cVar.c(8, r0.intValue());
                }
                Long l6 = c0304c.f5566i;
                if (l6 == null) {
                    cVar.b(9);
                } else {
                    cVar.c(9, l6.longValue());
                }
                Long l8 = c0304c.j;
                if (l8 == null) {
                    cVar.b(10);
                } else {
                    cVar.c(10, l8.longValue());
                }
                if (c0304c.k == null) {
                    cVar.b(11);
                } else {
                    cVar.c(11, r0.intValue());
                }
                if (c0304c.f5567l == null) {
                    cVar.b(12);
                } else {
                    cVar.c(12, r0.intValue());
                }
                if (c0304c.f5568m == null) {
                    cVar.b(13);
                } else {
                    cVar.c(13, r0.intValue());
                }
                if (c0304c.f5569n == null) {
                    cVar.b(14);
                } else {
                    cVar.c(14, r0.intValue());
                }
                if (c0304c.f5570o == null) {
                    cVar.b(15);
                } else {
                    cVar.c(15, r0.intValue());
                }
                if (c0304c.f5571p == null) {
                    cVar.b(16);
                } else {
                    cVar.c(16, r0.intValue());
                }
                Long l9 = c0304c.f5572q;
                if (l9 == null) {
                    cVar.b(17);
                } else {
                    cVar.c(17, l9.longValue());
                }
                Long l10 = c0304c.f5573r;
                if (l10 == null) {
                    cVar.b(18);
                } else {
                    cVar.c(18, l10.longValue());
                }
                Boolean bool = c0304c.f5574s;
                Integer num4 = null;
                if (bool != null) {
                    num = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                } else {
                    num = null;
                }
                if (num == null) {
                    cVar.b(19);
                } else {
                    cVar.c(19, num.intValue());
                }
                Boolean bool2 = c0304c.f5575t;
                if (bool2 != null) {
                    num2 = Integer.valueOf(bool2.booleanValue() ? 1 : 0);
                } else {
                    num2 = null;
                }
                if (num2 == null) {
                    cVar.b(20);
                } else {
                    cVar.c(20, num2.intValue());
                }
                String str4 = c0304c.f5576u;
                if (str4 == null) {
                    cVar.b(21);
                } else {
                    cVar.k(str4, 21);
                }
                String str5 = c0304c.f5577v;
                if (str5 == null) {
                    cVar.b(22);
                } else {
                    cVar.k(str5, 22);
                }
                if (c0304c.f5578w == null) {
                    cVar.b(23);
                } else {
                    cVar.c(23, r0.intValue());
                }
                Boolean bool3 = c0304c.f5579x;
                if (bool3 != null) {
                    num3 = Integer.valueOf(bool3.booleanValue() ? 1 : 0);
                } else {
                    num3 = null;
                }
                if (num3 == null) {
                    cVar.b(24);
                } else {
                    cVar.c(24, num3.intValue());
                }
                T1.B b4 = c0304c.f5580y;
                if (b4 == null) {
                    cVar.b(25);
                } else {
                    cVar.k(C0297h.z(c0297h, b4), 25);
                }
                String str6 = c0304c.f5581z;
                if (str6 == null) {
                    cVar.b(26);
                } else {
                    cVar.k(str6, 26);
                }
                EnumC0306e enumC0306e = c0304c.f5548A;
                if (enumC0306e == null) {
                    cVar.b(27);
                } else {
                    cVar.k(C0297h.x(c0297h, enumC0306e), 27);
                }
                T1.u uVar = c0304c.f5549B;
                if (uVar == null) {
                    cVar.b(28);
                } else {
                    int ordinal2 = uVar.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            str2 = "COUNTER";
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        str2 = "NUMBER";
                    }
                    cVar.k(str2, 28);
                }
                if (c0304c.f5550C == null) {
                    cVar.b(29);
                } else {
                    cVar.c(29, r0.intValue());
                }
                String str7 = c0304c.f5551D;
                if (str7 == null) {
                    cVar.b(30);
                } else {
                    cVar.k(str7, 30);
                }
                T1.H h8 = c0304c.f5552E;
                if (h8 == null) {
                    cVar.b(31);
                } else {
                    int ordinal3 = h8.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 == 1) {
                            str3 = "COUNTER_VALUE";
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        str3 = "TEXT";
                    }
                    cVar.k(str3, 31);
                }
                String str8 = c0304c.f5553F;
                if (str8 == null) {
                    cVar.b(32);
                } else {
                    cVar.k(str8, 32);
                }
                String str9 = c0304c.f5554G;
                if (str9 == null) {
                    cVar.b(33);
                } else {
                    cVar.k(str9, 33);
                }
                if (c0304c.f5555H == null) {
                    cVar.b(34);
                } else {
                    cVar.c(34, r0.intValue());
                }
                N n3 = c0304c.f5556I;
                if (n3 == null) {
                    cVar.b(35);
                } else {
                    cVar.k(C0297h.D(c0297h, n3), 35);
                }
                String str10 = c0304c.f5557J;
                if (str10 == null) {
                    cVar.b(36);
                } else {
                    cVar.k(str10, 36);
                }
                Boolean bool4 = c0304c.K;
                if (bool4 != null) {
                    num4 = Integer.valueOf(bool4.booleanValue() ? 1 : 0);
                }
                if (num4 == null) {
                    cVar.b(37);
                    return;
                } else {
                    cVar.c(37, num4.intValue());
                    return;
                }
            case 1:
                T1.F f8 = (T1.F) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(f8, "entity");
                cVar.c(1, f8.f5512a);
                cVar.c(2, f8.f5513b);
                cVar.k(C0297h.B(this.f5275b, f8.f5514c), 3);
                cVar.k(f8.f5515d, 4);
                cVar.k(f8.f5516e, 5);
                return;
            default:
                T1.A a3 = (T1.A) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(a3, "entity");
                cVar.c(1, a3.f5499a);
                cVar.c(2, a3.f5500b);
                cVar.k(C0297h.z(this.f5275b, a3.f5501c), 3);
                cVar.c(4, a3.f5502d);
                return;
        }
    }

    @Override // h7.AbstractC0842e
    public final String i() {
        switch (this.f5274a) {
            case 0:
                return "INSERT OR IGNORE INTO `action_table` (`id`,`eventId`,`priority`,`name`,`type`,`clickPositionType`,`x`,`y`,`clickOnConditionId`,`pressDuration`,`clickOffsetX`,`clickOffsetY`,`fromX`,`fromY`,`toX`,`toY`,`swipeDuration`,`pauseDuration`,`isAdvanced`,`isBroadcast`,`intent_action`,`component_name`,`flags`,`toggle_all`,`toggle_all_type`,`counter_name`,`counter_operation`,`counter_operation_value_type`,`counter_operation_value`,`counter_operation_counter_name`,`notification_message_type`,`notification_message_text`,`notification_message_counter_name`,`notification_importance`,`system_action_type`,`text_value`,`text_validate_input`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `intent_extra_table` (`id`,`action_id`,`type`,`key`,`value`) VALUES (nullif(?, 0),?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `event_toggle_table` (`id`,`action_id`,`toggle_type`,`toggle_event_id`) VALUES (nullif(?, 0),?,?,?)";
        }
    }
}
