package S1;

import h7.AbstractC0842e;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class n extends AbstractC0842e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f5282b;

    public /* synthetic */ n(p pVar, int i4) {
        this.f5281a = i4;
        this.f5282b = pVar;
    }

    @Override // h7.AbstractC0842e
    public final void c(D0.c cVar, Object obj) {
        Integer num;
        String str;
        Integer num2;
        String str2;
        switch (this.f5281a) {
            case 0:
                T1.r rVar = (T1.r) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(rVar, "entity");
                cVar.c(1, rVar.f5613a);
                cVar.c(2, rVar.f5614b);
                cVar.k(rVar.f5615c, 3);
                p pVar = this.f5282b;
                cVar.k(p.g(pVar, rVar.f5616d), 4);
                cVar.c(5, rVar.f5617e);
                String str3 = rVar.f5618f;
                if (str3 == null) {
                    cVar.b(6);
                } else {
                    cVar.k(str3, 6);
                }
                if (rVar.f5619g == null) {
                    cVar.b(7);
                } else {
                    cVar.c(7, r1.intValue());
                }
                if (rVar.f5620h == null) {
                    cVar.b(8);
                } else {
                    cVar.c(8, r1.intValue());
                }
                if (rVar.f5621i == null) {
                    cVar.b(9);
                } else {
                    cVar.c(9, r1.intValue());
                }
                if (rVar.j == null) {
                    cVar.b(10);
                } else {
                    cVar.c(10, r1.intValue());
                }
                if (rVar.k == null) {
                    cVar.b(11);
                } else {
                    cVar.c(11, r1.intValue());
                }
                if (rVar.f5622l == null) {
                    cVar.b(12);
                } else {
                    cVar.c(12, r1.intValue());
                }
                Boolean bool = rVar.f5623m;
                Integer num3 = null;
                if (bool != null) {
                    num = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                } else {
                    num = null;
                }
                if (num == null) {
                    cVar.b(13);
                } else {
                    cVar.c(13, num.intValue());
                }
                if (rVar.f5624n == null) {
                    cVar.b(14);
                } else {
                    cVar.c(14, r1.intValue());
                }
                if (rVar.f5625o == null) {
                    cVar.b(15);
                } else {
                    cVar.c(15, r1.intValue());
                }
                if (rVar.f5626p == null) {
                    cVar.b(16);
                } else {
                    cVar.c(16, r1.intValue());
                }
                if (rVar.f5627q == null) {
                    cVar.b(17);
                } else {
                    cVar.c(17, r1.intValue());
                }
                String str4 = rVar.f5628r;
                if (str4 == null) {
                    cVar.b(18);
                } else {
                    cVar.k(str4, 18);
                }
                String str5 = rVar.f5629s;
                if (str5 == null) {
                    cVar.b(19);
                } else {
                    cVar.k(str5, 19);
                }
                T1.t tVar = rVar.f5630t;
                if (tVar == null) {
                    cVar.b(20);
                } else {
                    cVar.k(p.i(pVar, tVar), 20);
                }
                T1.u uVar = rVar.f5631u;
                if (uVar == null) {
                    cVar.b(21);
                } else {
                    int ordinal = uVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            str = "COUNTER";
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        str = "NUMBER";
                    }
                    cVar.k(str, 21);
                }
                if (rVar.f5632v == null) {
                    cVar.b(22);
                } else {
                    cVar.c(22, r0.intValue());
                }
                String str6 = rVar.f5633w;
                if (str6 == null) {
                    cVar.b(23);
                } else {
                    cVar.k(str6, 23);
                }
                Long l6 = rVar.f5634x;
                if (l6 == null) {
                    cVar.b(24);
                } else {
                    cVar.c(24, l6.longValue());
                }
                Boolean bool2 = rVar.f5635y;
                if (bool2 != null) {
                    num3 = Integer.valueOf(bool2.booleanValue() ? 1 : 0);
                }
                if (num3 == null) {
                    cVar.b(25);
                    return;
                } else {
                    cVar.c(25, num3.intValue());
                    return;
                }
            default:
                T1.r rVar2 = (T1.r) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(rVar2, "entity");
                cVar.c(1, rVar2.f5613a);
                cVar.c(2, rVar2.f5614b);
                cVar.k(rVar2.f5615c, 3);
                p pVar2 = this.f5282b;
                cVar.k(p.h(pVar2, rVar2.f5616d), 4);
                cVar.c(5, rVar2.f5617e);
                String str7 = rVar2.f5618f;
                if (str7 == null) {
                    cVar.b(6);
                } else {
                    cVar.k(str7, 6);
                }
                if (rVar2.f5619g == null) {
                    cVar.b(7);
                } else {
                    cVar.c(7, r1.intValue());
                }
                if (rVar2.f5620h == null) {
                    cVar.b(8);
                } else {
                    cVar.c(8, r1.intValue());
                }
                if (rVar2.f5621i == null) {
                    cVar.b(9);
                } else {
                    cVar.c(9, r1.intValue());
                }
                if (rVar2.j == null) {
                    cVar.b(10);
                } else {
                    cVar.c(10, r1.intValue());
                }
                if (rVar2.k == null) {
                    cVar.b(11);
                } else {
                    cVar.c(11, r1.intValue());
                }
                if (rVar2.f5622l == null) {
                    cVar.b(12);
                } else {
                    cVar.c(12, r1.intValue());
                }
                Boolean bool3 = rVar2.f5623m;
                Integer num4 = null;
                if (bool3 != null) {
                    num2 = Integer.valueOf(bool3.booleanValue() ? 1 : 0);
                } else {
                    num2 = null;
                }
                if (num2 == null) {
                    cVar.b(13);
                } else {
                    cVar.c(13, num2.intValue());
                }
                if (rVar2.f5624n == null) {
                    cVar.b(14);
                } else {
                    cVar.c(14, r1.intValue());
                }
                if (rVar2.f5625o == null) {
                    cVar.b(15);
                } else {
                    cVar.c(15, r1.intValue());
                }
                if (rVar2.f5626p == null) {
                    cVar.b(16);
                } else {
                    cVar.c(16, r1.intValue());
                }
                if (rVar2.f5627q == null) {
                    cVar.b(17);
                } else {
                    cVar.c(17, r1.intValue());
                }
                String str8 = rVar2.f5628r;
                if (str8 == null) {
                    cVar.b(18);
                } else {
                    cVar.k(str8, 18);
                }
                String str9 = rVar2.f5629s;
                if (str9 == null) {
                    cVar.b(19);
                } else {
                    cVar.k(str9, 19);
                }
                T1.t tVar2 = rVar2.f5630t;
                if (tVar2 == null) {
                    cVar.b(20);
                } else {
                    cVar.k(p.j(pVar2, tVar2), 20);
                }
                T1.u uVar2 = rVar2.f5631u;
                if (uVar2 == null) {
                    cVar.b(21);
                } else {
                    int ordinal2 = uVar2.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            str2 = "COUNTER";
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        str2 = "NUMBER";
                    }
                    cVar.k(str2, 21);
                }
                if (rVar2.f5632v == null) {
                    cVar.b(22);
                } else {
                    cVar.c(22, r0.intValue());
                }
                String str10 = rVar2.f5633w;
                if (str10 == null) {
                    cVar.b(23);
                } else {
                    cVar.k(str10, 23);
                }
                Long l8 = rVar2.f5634x;
                if (l8 == null) {
                    cVar.b(24);
                } else {
                    cVar.c(24, l8.longValue());
                }
                Boolean bool4 = rVar2.f5635y;
                if (bool4 != null) {
                    num4 = Integer.valueOf(bool4.booleanValue() ? 1 : 0);
                }
                if (num4 == null) {
                    cVar.b(25);
                    return;
                } else {
                    cVar.c(25, num4.intValue());
                    return;
                }
        }
    }

    @Override // h7.AbstractC0842e
    public final String i() {
        switch (this.f5281a) {
            case 0:
                return "INSERT OR IGNORE INTO `condition_table` (`id`,`eventId`,`name`,`type`,`priority`,`path`,`area_left`,`area_top`,`area_right`,`area_bottom`,`threshold`,`detection_type`,`shouldBeDetected`,`detection_area_left`,`detection_area_top`,`detection_area_right`,`detection_area_bottom`,`broadcast_action`,`counter_name`,`counter_comparison_operation`,`counter_operation_value_type`,`counter_value`,`counter_value_counter_name`,`timer_value_ms`,`timer_restart_when_reached`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `condition_table` (`id`,`eventId`,`name`,`type`,`priority`,`path`,`area_left`,`area_top`,`area_right`,`area_bottom`,`threshold`,`detection_type`,`shouldBeDetected`,`detection_area_left`,`detection_area_top`,`detection_area_right`,`detection_area_bottom`,`broadcast_action`,`counter_name`,`counter_comparison_operation`,`counter_operation_value_type`,`counter_value`,`counter_value_counter_name`,`timer_value_ms`,`timer_restart_when_reached`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
