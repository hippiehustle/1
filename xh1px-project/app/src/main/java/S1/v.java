package S1;

import T1.O;
import h7.AbstractC0842e;
import kotlin.NoWhenBranchMatchedException;
import n2.C1155c;
import n2.EnumC1156d;

/* loaded from: classes.dex */
public final class v extends AbstractC0842e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5304a;

    public /* synthetic */ v(int i4) {
        this.f5304a = i4;
    }

    @Override // h7.AbstractC0842e
    public final void c(D0.c cVar, Object obj) {
        String str;
        Integer num;
        String str2;
        Integer num2;
        Integer num3;
        switch (this.f5304a) {
            case 0:
                T1.x xVar = (T1.x) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(xVar, "entity");
                cVar.c(1, xVar.f5652a);
                cVar.c(2, xVar.f5653b);
                cVar.k(xVar.f5654c, 3);
                cVar.c(4, xVar.f5655d);
                cVar.c(5, xVar.f5656e);
                cVar.c(6, xVar.f5657f ? 1L : 0L);
                int ordinal = xVar.f5658g.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        str = "TRIGGER_EVENT";
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    str = "IMAGE_EVENT";
                }
                cVar.k(str, 7);
                Boolean bool = xVar.f5659h;
                if (bool != null) {
                    num = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                } else {
                    num = null;
                }
                if (num == null) {
                    cVar.b(8);
                    return;
                } else {
                    cVar.c(8, num.intValue());
                    return;
                }
            case 1:
                T1.x xVar2 = (T1.x) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(xVar2, "entity");
                cVar.c(1, xVar2.f5652a);
                cVar.c(2, xVar2.f5653b);
                cVar.k(xVar2.f5654c, 3);
                cVar.c(4, xVar2.f5655d);
                cVar.c(5, xVar2.f5656e);
                cVar.c(6, xVar2.f5657f ? 1L : 0L);
                int ordinal2 = xVar2.f5658g.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        str2 = "TRIGGER_EVENT";
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    str2 = "IMAGE_EVENT";
                }
                cVar.k(str2, 7);
                Boolean bool2 = xVar2.f5659h;
                if (bool2 != null) {
                    num2 = Integer.valueOf(bool2.booleanValue() ? 1 : 0);
                } else {
                    num2 = null;
                }
                if (num2 == null) {
                    cVar.b(8);
                    return;
                } else {
                    cVar.c(8, num2.intValue());
                    return;
                }
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                T1.K k = (T1.K) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(k, "entity");
                cVar.c(1, k.f5528a);
                cVar.k(k.f5529b, 2);
                cVar.c(3, k.f5530c);
                cVar.c(4, k.f5531d ? 1L : 0L);
                cVar.c(5, k.f5532e ? 1L : 0L);
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                T1.L l6 = (T1.L) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(l6, "entity");
                cVar.c(1, l6.f5533a);
                cVar.c(2, l6.f5534b);
                cVar.c(3, l6.f5535c);
                cVar.c(4, l6.f5536d);
                return;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                T1.K k6 = (T1.K) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(k6, "entity");
                cVar.c(1, k6.f5528a);
                cVar.k(k6.f5529b, 2);
                cVar.c(3, k6.f5530c);
                cVar.c(4, k6.f5531d ? 1L : 0L);
                cVar.c(5, k6.f5532e ? 1L : 0L);
                return;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                T1.L l8 = (T1.L) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(l8, "entity");
                cVar.c(1, l8.f5533a);
                cVar.c(2, l8.f5534b);
                cVar.c(3, l8.f5535c);
                cVar.c(4, l8.f5536d);
                return;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                O o7 = (O) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(o7, "entity");
                cVar.c(1, o7.f5544a);
                cVar.c(2, o7.f5545b);
                return;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                n2.m mVar = (n2.m) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(mVar, "entity");
                cVar.c(1, mVar.f12911a);
                cVar.k(mVar.f12912b, 2);
                cVar.c(3, mVar.f12913c);
                cVar.c(4, mVar.f12914d ? 1L : 0L);
                cVar.c(5, mVar.f12915e);
                cVar.c(6, mVar.f12916f ? 1L : 0L);
                cVar.c(7, mVar.f12917g ? 1L : 0L);
                return;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                C1155c c1155c = (C1155c) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(c1155c, "entity");
                cVar.c(1, c1155c.f12867a);
                cVar.c(2, c1155c.f12868b);
                cVar.c(3, c1155c.f12869c);
                cVar.k(c1155c.f12870d, 4);
                EnumC1156d enumC1156d = c1155c.f12871e;
                o6.j.e(enumC1156d, "action");
                cVar.k(enumC1156d.toString(), 5);
                if (c1155c.f12872f == null) {
                    cVar.b(6);
                } else {
                    cVar.c(6, r0.intValue());
                }
                Boolean bool3 = c1155c.f12873g;
                if (bool3 != null) {
                    num3 = Integer.valueOf(bool3.booleanValue() ? 1 : 0);
                } else {
                    num3 = null;
                }
                if (num3 == null) {
                    cVar.b(7);
                } else {
                    cVar.c(7, num3.intValue());
                }
                Long l9 = c1155c.f12874h;
                if (l9 == null) {
                    cVar.b(8);
                } else {
                    cVar.c(8, l9.longValue());
                }
                Long l10 = c1155c.f12875i;
                if (l10 == null) {
                    cVar.b(9);
                } else {
                    cVar.c(9, l10.longValue());
                }
                if (c1155c.j == null) {
                    cVar.b(10);
                } else {
                    cVar.c(10, r0.intValue());
                }
                if (c1155c.k == null) {
                    cVar.b(11);
                } else {
                    cVar.c(11, r0.intValue());
                }
                Long l11 = c1155c.f12876l;
                if (l11 == null) {
                    cVar.b(12);
                } else {
                    cVar.c(12, l11.longValue());
                }
                if (c1155c.f12877m == null) {
                    cVar.b(13);
                } else {
                    cVar.c(13, r0.intValue());
                }
                if (c1155c.f12878n == null) {
                    cVar.b(14);
                } else {
                    cVar.c(14, r0.intValue());
                }
                if (c1155c.f12879o == null) {
                    cVar.b(15);
                } else {
                    cVar.c(15, r0.intValue());
                }
                if (c1155c.f12880p == null) {
                    cVar.b(16);
                } else {
                    cVar.c(16, r0.intValue());
                }
                Long l12 = c1155c.f12881q;
                if (l12 == null) {
                    cVar.b(17);
                    return;
                } else {
                    cVar.c(17, l12.longValue());
                    return;
                }
            default:
                n2.p pVar = (n2.p) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(pVar, "entity");
                cVar.c(1, pVar.f12919a);
                cVar.c(2, pVar.f12920b);
                cVar.c(3, pVar.f12921c);
                cVar.c(4, pVar.f12922d);
                return;
        }
    }

    @Override // h7.AbstractC0842e
    public final String i() {
        switch (this.f5304a) {
            case 0:
                return "INSERT OR IGNORE INTO `event_table` (`id`,`scenario_id`,`name`,`operator`,`priority`,`enabled_on_start`,`type`,`keep_detecting`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `event_table` (`id`,`scenario_id`,`name`,`operator`,`priority`,`enabled_on_start`,`type`,`keep_detecting`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return "INSERT OR IGNORE INTO `scenario_table` (`id`,`name`,`detection_quality`,`randomize`,`keep_screen_on`) VALUES (nullif(?, 0),?,?,?,?)";
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return "INSERT OR IGNORE INTO `scenario_usage_table` (`id`,`scenario_id`,`last_start_timestamp_ms`,`start_count`) VALUES (nullif(?, 0),?,?,?)";
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return "INSERT OR IGNORE INTO `scenario_table` (`id`,`name`,`detection_quality`,`randomize`,`keep_screen_on`) VALUES (nullif(?, 0),?,?,?,?)";
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return "INSERT OR IGNORE INTO `scenario_usage_table` (`id`,`scenario_id`,`last_start_timestamp_ms`,`start_count`) VALUES (nullif(?, 0),?,?,?)";
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return "INSERT INTO `tutorial_success_table` (`tutorial_index`,`scenario_id`) VALUES (?,?)";
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return "INSERT OR IGNORE INTO `dumb_scenario_table` (`id`,`name`,`repeat_count`,`is_repeat_infinite`,`max_duration_minutes`,`is_duration_infinite`,`randomize`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return "INSERT OR IGNORE INTO `dumb_action_table` (`id`,`dumb_scenario_id`,`priority`,`name`,`type`,`repeat_count`,`is_repeat_infinite`,`repeat_delay`,`press_duration`,`x`,`y`,`swipe_duration`,`fromX`,`fromY`,`toX`,`toY`,`pause_duration`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `dumb_scenario_stats_table` (`id`,`dumb_scenario_id`,`last_start_timestamp_ms`,`start_count`) VALUES (nullif(?, 0),?,?,?)";
        }
    }

    public /* synthetic */ v(int i4, Object obj) {
        this.f5304a = i4;
    }
}
