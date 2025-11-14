package n2;

import S1.C0295f;
import S1.v;
import java.util.List;
import q4.X;
import u0.u;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final u f12901a;

    /* renamed from: d, reason: collision with root package name */
    public final G5.e f12904d = new G5.e(23);

    /* renamed from: b, reason: collision with root package name */
    public final v f12902b = new v(7);

    /* renamed from: c, reason: collision with root package name */
    public final v f12903c = new v(8, this);

    /* renamed from: e, reason: collision with root package name */
    public final v f12905e = new v(9);

    /* renamed from: f, reason: collision with root package name */
    public final C0295f f12906f = new C0295f(17);

    /* renamed from: g, reason: collision with root package name */
    public final C0295f f12907g = new C0295f(18);

    /* renamed from: h, reason: collision with root package name */
    public final C0295f f12908h = new C0295f(19, this);

    /* renamed from: i, reason: collision with root package name */
    public final C0295f f12909i = new C0295f(20);

    public j(u uVar) {
        this.f12901a = uVar;
    }

    public final void a(D0.a aVar, t.g gVar) {
        Integer valueOf;
        Integer valueOf2;
        Boolean bool;
        Long valueOf3;
        Long valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        Long valueOf7;
        Integer valueOf8;
        Integer valueOf9;
        Integer valueOf10;
        Integer valueOf11;
        boolean z8;
        if (gVar.e()) {
            return;
        }
        int i4 = 1;
        if (gVar.h() > 999) {
            E2.d.D(gVar, true, new i(this, aVar, 0));
            return;
        }
        D0.c f8 = A.j.f(gVar, AbstractC1769h.a("SELECT `id`,`dumb_scenario_id`,`priority`,`name`,`type`,`repeat_count`,`is_repeat_infinite`,`repeat_delay`,`press_duration`,`x`,`y`,`swipe_duration`,`fromX`,`fromY`,`toX`,`toY`,`pause_duration` FROM `dumb_action_table` WHERE `dumb_scenario_id` IN ("), ")", "toString(...)", aVar);
        int h8 = gVar.h();
        int i8 = 1;
        for (int i9 = 0; i9 < h8; i9++) {
            i8 = A.j.e(gVar, i9, f8, i8, i8, 1);
        }
        try {
            int w8 = X.w(f8, "dumb_scenario_id");
            if (w8 == -1) {
                f8.close();
                return;
            }
            while (f8.H()) {
                List list = (List) gVar.c(f8.getLong(w8));
                if (list != null) {
                    long j = f8.getLong(0);
                    long j5 = f8.getLong(i4);
                    int i10 = (int) f8.getLong(2);
                    String l6 = f8.l(3);
                    String l8 = f8.l(4);
                    o6.j.e(l8, "value");
                    EnumC1156d valueOf12 = EnumC1156d.valueOf(l8);
                    Long l9 = null;
                    if (f8.isNull(5)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf((int) f8.getLong(5));
                    }
                    if (f8.isNull(6)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf((int) f8.getLong(6));
                    }
                    if (valueOf2 != null) {
                        if (valueOf2.intValue() != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        bool = Boolean.valueOf(z8);
                    } else {
                        bool = null;
                    }
                    if (f8.isNull(7)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(f8.getLong(7));
                    }
                    if (f8.isNull(8)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(f8.getLong(8));
                    }
                    if (f8.isNull(9)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Integer.valueOf((int) f8.getLong(9));
                    }
                    if (f8.isNull(10)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf((int) f8.getLong(10));
                    }
                    if (f8.isNull(11)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Long.valueOf(f8.getLong(11));
                    }
                    if (f8.isNull(12)) {
                        valueOf8 = null;
                    } else {
                        valueOf8 = Integer.valueOf((int) f8.getLong(12));
                    }
                    if (f8.isNull(13)) {
                        valueOf9 = null;
                    } else {
                        valueOf9 = Integer.valueOf((int) f8.getLong(13));
                    }
                    if (f8.isNull(14)) {
                        valueOf10 = null;
                    } else {
                        valueOf10 = Integer.valueOf((int) f8.getLong(14));
                    }
                    if (f8.isNull(15)) {
                        valueOf11 = null;
                    } else {
                        valueOf11 = Integer.valueOf((int) f8.getLong(15));
                    }
                    if (!f8.isNull(16)) {
                        l9 = Long.valueOf(f8.getLong(16));
                    }
                    list.add(new C1155c(j, j5, i10, l6, valueOf12, valueOf, bool, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, l9));
                    i4 = 1;
                }
            }
            f8.close();
        } catch (Throwable th) {
            f8.close();
            throw th;
        }
    }

    public final void b(D0.a aVar, t.g gVar) {
        if (gVar.e()) {
            return;
        }
        if (gVar.h() > 999) {
            E2.d.D(gVar, false, new i(this, aVar, 1));
            return;
        }
        D0.c f8 = A.j.f(gVar, AbstractC1769h.a("SELECT `id`,`dumb_scenario_id`,`last_start_timestamp_ms`,`start_count` FROM `dumb_scenario_stats_table` WHERE `dumb_scenario_id` IN ("), ")", "toString(...)", aVar);
        int h8 = gVar.h();
        int i4 = 1;
        for (int i8 = 0; i8 < h8; i8++) {
            i4 = A.j.e(gVar, i8, f8, i4, i4, 1);
        }
        try {
            int w8 = X.w(f8, "dumb_scenario_id");
            if (w8 == -1) {
                return;
            }
            while (f8.H()) {
                long j = f8.getLong(w8);
                if (gVar.b(j)) {
                    gVar.g(j, new p(f8.getLong(0), f8.getLong(1), f8.getLong(2), f8.getLong(3)));
                }
            }
        } finally {
            f8.close();
        }
    }
}
