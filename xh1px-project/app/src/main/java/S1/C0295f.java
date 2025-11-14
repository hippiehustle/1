package S1;

import T1.C0304c;
import T1.O;
import h6.AbstractC0837b;
import kotlin.NoWhenBranchMatchedException;
import n2.C1155c;
import n2.EnumC1156d;

/* renamed from: S1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295f extends AbstractC0837b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5256a;

    public /* synthetic */ C0295f(int i4) {
        this.f5256a = i4;
    }

    @Override // h6.AbstractC0837b
    public final void b(D0.c cVar, Object obj) {
        String str;
        Integer num;
        String str2;
        Integer num2;
        Integer num3;
        switch (this.f5256a) {
            case 0:
                C0304c c0304c = (C0304c) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(c0304c, "entity");
                cVar.c(1, c0304c.f5558a);
                return;
            case 1:
                T1.F f8 = (T1.F) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(f8, "entity");
                cVar.c(1, f8.f5512a);
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                T1.A a3 = (T1.A) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(a3, "entity");
                cVar.c(1, a3.f5499a);
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                C0304c c0304c2 = (C0304c) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(c0304c2, "entity");
                cVar.c(1, c0304c2.f5558a);
                return;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                T1.F f9 = (T1.F) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(f9, "entity");
                cVar.c(1, f9.f5512a);
                return;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                T1.A a4 = (T1.A) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(a4, "entity");
                cVar.c(1, a4.f5499a);
                return;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                T1.r rVar = (T1.r) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(rVar, "entity");
                cVar.c(1, rVar.f5613a);
                return;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                T1.r rVar2 = (T1.r) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(rVar2, "entity");
                cVar.c(1, rVar2.f5613a);
                return;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                T1.x xVar = (T1.x) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(xVar, "entity");
                cVar.c(1, xVar.f5652a);
                return;
            case 9:
                T1.x xVar2 = (T1.x) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(xVar2, "entity");
                long j = xVar2.f5652a;
                cVar.c(1, j);
                cVar.c(2, xVar2.f5653b);
                cVar.k(xVar2.f5654c, 3);
                cVar.c(4, xVar2.f5655d);
                cVar.c(5, xVar2.f5656e);
                cVar.c(6, xVar2.f5657f ? 1L : 0L);
                int ordinal = xVar2.f5658g.ordinal();
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
                Boolean bool = xVar2.f5659h;
                if (bool != null) {
                    num = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                } else {
                    num = null;
                }
                if (num == null) {
                    cVar.b(8);
                } else {
                    cVar.c(8, num.intValue());
                }
                cVar.c(9, j);
                return;
            case 10:
                T1.x xVar3 = (T1.x) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(xVar3, "entity");
                cVar.c(1, xVar3.f5652a);
                return;
            case 11:
                T1.x xVar4 = (T1.x) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(xVar4, "entity");
                long j5 = xVar4.f5652a;
                cVar.c(1, j5);
                cVar.c(2, xVar4.f5653b);
                cVar.k(xVar4.f5654c, 3);
                cVar.c(4, xVar4.f5655d);
                cVar.c(5, xVar4.f5656e);
                cVar.c(6, xVar4.f5657f ? 1L : 0L);
                int ordinal2 = xVar4.f5658g.ordinal();
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
                Boolean bool2 = xVar4.f5659h;
                if (bool2 != null) {
                    num2 = Integer.valueOf(bool2.booleanValue() ? 1 : 0);
                } else {
                    num2 = null;
                }
                if (num2 == null) {
                    cVar.b(8);
                } else {
                    cVar.c(8, num2.intValue());
                }
                cVar.c(9, j5);
                return;
            case 12:
                T1.K k = (T1.K) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(k, "entity");
                long j8 = k.f5528a;
                cVar.c(1, j8);
                cVar.k(k.f5529b, 2);
                cVar.c(3, k.f5530c);
                cVar.c(4, k.f5531d ? 1L : 0L);
                cVar.c(5, k.f5532e ? 1L : 0L);
                cVar.c(6, j8);
                return;
            case 13:
                T1.L l6 = (T1.L) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(l6, "entity");
                long j9 = l6.f5533a;
                cVar.c(1, j9);
                cVar.c(2, l6.f5534b);
                cVar.c(3, l6.f5535c);
                cVar.c(4, l6.f5536d);
                cVar.c(5, j9);
                return;
            case 14:
                T1.K k6 = (T1.K) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(k6, "entity");
                long j10 = k6.f5528a;
                cVar.c(1, j10);
                cVar.k(k6.f5529b, 2);
                cVar.c(3, k6.f5530c);
                cVar.c(4, k6.f5531d ? 1L : 0L);
                cVar.c(5, k6.f5532e ? 1L : 0L);
                cVar.c(6, j10);
                return;
            case 15:
                T1.L l8 = (T1.L) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(l8, "entity");
                long j11 = l8.f5533a;
                cVar.c(1, j11);
                cVar.c(2, l8.f5534b);
                cVar.c(3, l8.f5535c);
                cVar.c(4, l8.f5536d);
                cVar.c(5, j11);
                return;
            case 16:
                O o7 = (O) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(o7, "entity");
                long j12 = o7.f5544a;
                cVar.c(1, j12);
                cVar.c(2, o7.f5545b);
                cVar.c(3, j12);
                return;
            case 17:
                C1155c c1155c = (C1155c) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(c1155c, "entity");
                cVar.c(1, c1155c.f12867a);
                return;
            case 18:
                n2.m mVar = (n2.m) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(mVar, "entity");
                long j13 = mVar.f12911a;
                cVar.c(1, j13);
                cVar.k(mVar.f12912b, 2);
                cVar.c(3, mVar.f12913c);
                cVar.c(4, mVar.f12914d ? 1L : 0L);
                cVar.c(5, mVar.f12915e);
                cVar.c(6, mVar.f12916f ? 1L : 0L);
                cVar.c(7, mVar.f12917g ? 1L : 0L);
                cVar.c(8, j13);
                return;
            case 19:
                C1155c c1155c2 = (C1155c) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(c1155c2, "entity");
                long j14 = c1155c2.f12867a;
                cVar.c(1, j14);
                cVar.c(2, c1155c2.f12868b);
                cVar.c(3, c1155c2.f12869c);
                cVar.k(c1155c2.f12870d, 4);
                EnumC1156d enumC1156d = c1155c2.f12871e;
                o6.j.e(enumC1156d, "action");
                cVar.k(enumC1156d.toString(), 5);
                if (c1155c2.f12872f == null) {
                    cVar.b(6);
                } else {
                    cVar.c(6, r2.intValue());
                }
                Boolean bool3 = c1155c2.f12873g;
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
                Long l9 = c1155c2.f12874h;
                if (l9 == null) {
                    cVar.b(8);
                } else {
                    cVar.c(8, l9.longValue());
                }
                Long l10 = c1155c2.f12875i;
                if (l10 == null) {
                    cVar.b(9);
                } else {
                    cVar.c(9, l10.longValue());
                }
                if (c1155c2.j == null) {
                    cVar.b(10);
                } else {
                    cVar.c(10, r2.intValue());
                }
                if (c1155c2.k == null) {
                    cVar.b(11);
                } else {
                    cVar.c(11, r2.intValue());
                }
                Long l11 = c1155c2.f12876l;
                if (l11 == null) {
                    cVar.b(12);
                } else {
                    cVar.c(12, l11.longValue());
                }
                if (c1155c2.f12877m == null) {
                    cVar.b(13);
                } else {
                    cVar.c(13, r2.intValue());
                }
                if (c1155c2.f12878n == null) {
                    cVar.b(14);
                } else {
                    cVar.c(14, r2.intValue());
                }
                if (c1155c2.f12879o == null) {
                    cVar.b(15);
                } else {
                    cVar.c(15, r2.intValue());
                }
                if (c1155c2.f12880p == null) {
                    cVar.b(16);
                } else {
                    cVar.c(16, r2.intValue());
                }
                Long l12 = c1155c2.f12881q;
                if (l12 == null) {
                    cVar.b(17);
                } else {
                    cVar.c(17, l12.longValue());
                }
                cVar.c(18, j14);
                return;
            default:
                n2.p pVar = (n2.p) obj;
                o6.j.e(cVar, "statement");
                o6.j.e(pVar, "entity");
                long j15 = pVar.f12919a;
                cVar.c(1, j15);
                cVar.c(2, pVar.f12920b);
                cVar.c(3, pVar.f12921c);
                cVar.c(4, pVar.f12922d);
                cVar.c(5, j15);
                return;
        }
    }

    @Override // h6.AbstractC0837b
    public final String g() {
        switch (this.f5256a) {
            case 0:
                return "DELETE FROM `action_table` WHERE `id` = ?";
            case 1:
                return "DELETE FROM `intent_extra_table` WHERE `id` = ?";
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return "DELETE FROM `event_toggle_table` WHERE `id` = ?";
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return "DELETE FROM `action_table` WHERE `id` = ?";
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return "DELETE FROM `intent_extra_table` WHERE `id` = ?";
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return "DELETE FROM `event_toggle_table` WHERE `id` = ?";
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return "DELETE FROM `condition_table` WHERE `id` = ?";
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return "DELETE FROM `condition_table` WHERE `id` = ?";
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return "DELETE FROM `event_table` WHERE `id` = ?";
            case 9:
                return "UPDATE OR ABORT `event_table` SET `id` = ?,`scenario_id` = ?,`name` = ?,`operator` = ?,`priority` = ?,`enabled_on_start` = ?,`type` = ?,`keep_detecting` = ? WHERE `id` = ?";
            case 10:
                return "DELETE FROM `event_table` WHERE `id` = ?";
            case 11:
                return "UPDATE OR ABORT `event_table` SET `id` = ?,`scenario_id` = ?,`name` = ?,`operator` = ?,`priority` = ?,`enabled_on_start` = ?,`type` = ?,`keep_detecting` = ? WHERE `id` = ?";
            case 12:
                return "UPDATE OR ABORT `scenario_table` SET `id` = ?,`name` = ?,`detection_quality` = ?,`randomize` = ?,`keep_screen_on` = ? WHERE `id` = ?";
            case 13:
                return "UPDATE OR ABORT `scenario_usage_table` SET `id` = ?,`scenario_id` = ?,`last_start_timestamp_ms` = ?,`start_count` = ? WHERE `id` = ?";
            case 14:
                return "UPDATE OR ABORT `scenario_table` SET `id` = ?,`name` = ?,`detection_quality` = ?,`randomize` = ?,`keep_screen_on` = ? WHERE `id` = ?";
            case 15:
                return "UPDATE OR ABORT `scenario_usage_table` SET `id` = ?,`scenario_id` = ?,`last_start_timestamp_ms` = ?,`start_count` = ? WHERE `id` = ?";
            case 16:
                return "UPDATE `tutorial_success_table` SET `tutorial_index` = ?,`scenario_id` = ? WHERE `tutorial_index` = ?";
            case 17:
                return "DELETE FROM `dumb_action_table` WHERE `id` = ?";
            case 18:
                return "UPDATE OR ABORT `dumb_scenario_table` SET `id` = ?,`name` = ?,`repeat_count` = ?,`is_repeat_infinite` = ?,`max_duration_minutes` = ?,`is_duration_infinite` = ?,`randomize` = ? WHERE `id` = ?";
            case 19:
                return "UPDATE OR ABORT `dumb_action_table` SET `id` = ?,`dumb_scenario_id` = ?,`priority` = ?,`name` = ?,`type` = ?,`repeat_count` = ?,`is_repeat_infinite` = ?,`repeat_delay` = ?,`press_duration` = ?,`x` = ?,`y` = ?,`swipe_duration` = ?,`fromX` = ?,`fromY` = ?,`toX` = ?,`toY` = ?,`pause_duration` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `dumb_scenario_stats_table` SET `id` = ?,`dumb_scenario_id` = ?,`last_start_timestamp_ms` = ?,`start_count` = ? WHERE `id` = ?";
        }
    }

    public /* synthetic */ C0295f(int i4, Object obj) {
        this.f5256a = i4;
    }
}
