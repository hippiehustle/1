package S1;

import java.util.ArrayList;
import n6.InterfaceC1163b;
import q4.X;

/* renamed from: S1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0290a implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f5244e;

    public /* synthetic */ C0290a(int i4, long j) {
        this.f5243d = i4;
        this.f5244e = j;
    }

    private final Object f(Object obj) {
        boolean z8;
        int i4;
        Integer valueOf;
        boolean z9;
        long j = this.f5244e;
        D0.a aVar = (D0.a) obj;
        o6.j.e(aVar, "_connection");
        D0.c L8 = aVar.L("SELECT * FROM event_table WHERE scenario_id=? ORDER BY priority");
        try {
            L8.c(1, j);
            int x8 = X.x(L8, "id");
            int x9 = X.x(L8, "scenario_id");
            int x10 = X.x(L8, "name");
            int x11 = X.x(L8, "operator");
            int x12 = X.x(L8, "priority");
            int x13 = X.x(L8, "enabled_on_start");
            int x14 = X.x(L8, "type");
            int x15 = X.x(L8, "keep_detecting");
            ArrayList arrayList = new ArrayList();
            while (L8.H()) {
                long j5 = L8.getLong(x8);
                long j8 = L8.getLong(x9);
                String l6 = L8.l(x10);
                int i8 = (int) L8.getLong(x11);
                int i9 = (int) L8.getLong(x12);
                if (((int) L8.getLong(x13)) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                T1.C m6 = w.m(L8.l(x14));
                Boolean bool = null;
                if (L8.isNull(x15)) {
                    i4 = x8;
                    valueOf = null;
                } else {
                    i4 = x8;
                    valueOf = Integer.valueOf((int) L8.getLong(x15));
                }
                if (valueOf != null) {
                    if (valueOf.intValue() != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    bool = Boolean.valueOf(z9);
                }
                arrayList.add(new T1.x(j5, j8, l6, i8, i9, z8, m6, bool));
                x8 = i4;
            }
            L8.close();
            return arrayList;
        } catch (Throwable th) {
            L8.close();
            throw th;
        }
    }

    private final Object g(Object obj) {
        boolean z8;
        int i4;
        Integer valueOf;
        boolean z9;
        long j = this.f5244e;
        D0.a aVar = (D0.a) obj;
        o6.j.e(aVar, "_connection");
        D0.c L8 = aVar.L("SELECT * FROM event_table WHERE scenario_id=? ORDER BY priority");
        try {
            L8.c(1, j);
            int x8 = X.x(L8, "id");
            int x9 = X.x(L8, "scenario_id");
            int x10 = X.x(L8, "name");
            int x11 = X.x(L8, "operator");
            int x12 = X.x(L8, "priority");
            int x13 = X.x(L8, "enabled_on_start");
            int x14 = X.x(L8, "type");
            int x15 = X.x(L8, "keep_detecting");
            ArrayList arrayList = new ArrayList();
            while (L8.H()) {
                long j5 = L8.getLong(x8);
                long j8 = L8.getLong(x9);
                String l6 = L8.l(x10);
                int i8 = (int) L8.getLong(x11);
                int i9 = (int) L8.getLong(x12);
                if (((int) L8.getLong(x13)) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                T1.C n3 = w.n(L8.l(x14));
                Boolean bool = null;
                if (L8.isNull(x15)) {
                    i4 = x8;
                    valueOf = null;
                } else {
                    i4 = x8;
                    valueOf = Integer.valueOf((int) L8.getLong(x15));
                }
                if (valueOf != null) {
                    if (valueOf.intValue() != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    bool = Boolean.valueOf(z9);
                }
                arrayList.add(new T1.x(j5, j8, l6, i8, i9, z8, n3, bool));
                x8 = i4;
            }
            L8.close();
            return arrayList;
        } catch (Throwable th) {
            L8.close();
            throw th;
        }
    }

    private final Object h(Object obj) {
        long j = this.f5244e;
        D0.a aVar = (D0.a) obj;
        o6.j.e(aVar, "_connection");
        D0.c L8 = aVar.L("DELETE FROM scenario_table WHERE id = ?");
        try {
            L8.c(1, j);
            L8.H();
            L8.close();
            return Z5.y.f7506a;
        } catch (Throwable th) {
            L8.close();
            throw th;
        }
    }

    private final Object k(Object obj) {
        T1.L l6;
        long j = this.f5244e;
        D0.a aVar = (D0.a) obj;
        o6.j.e(aVar, "_connection");
        D0.c L8 = aVar.L("SELECT * FROM scenario_usage_table WHERE id=?");
        try {
            L8.c(1, j);
            int x8 = X.x(L8, "id");
            int x9 = X.x(L8, "scenario_id");
            int x10 = X.x(L8, "last_start_timestamp_ms");
            int x11 = X.x(L8, "start_count");
            if (L8.H()) {
                l6 = new T1.L(L8.getLong(x8), L8.getLong(x9), L8.getLong(x10), L8.getLong(x11));
            } else {
                l6 = null;
            }
            return l6;
        } finally {
            L8.close();
        }
    }

    private final Object n(Object obj) {
        n2.p pVar;
        long j = this.f5244e;
        D0.a aVar = (D0.a) obj;
        o6.j.e(aVar, "_connection");
        D0.c L8 = aVar.L("SELECT * FROM dumb_scenario_stats_table WHERE id=?");
        try {
            L8.c(1, j);
            int x8 = X.x(L8, "id");
            int x9 = X.x(L8, "dumb_scenario_id");
            int x10 = X.x(L8, "last_start_timestamp_ms");
            int x11 = X.x(L8, "start_count");
            if (L8.H()) {
                pVar = new n2.p(L8.getLong(x8), L8.getLong(x9), L8.getLong(x10), L8.getLong(x11));
            } else {
                pVar = null;
            }
            return pVar;
        } finally {
            L8.close();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        D0.c L8;
        String l6;
        int i4;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        Boolean bool;
        Integer valueOf8;
        int i8;
        int i9;
        Integer valueOf9;
        Integer num;
        int i10;
        Integer valueOf10;
        int i11;
        Integer num2;
        Integer valueOf11;
        String l8;
        String l9;
        T1.t c6;
        T1.u e9;
        int i12;
        int i13;
        Integer valueOf12;
        String l10;
        Long valueOf13;
        int i14;
        int i15;
        Integer valueOf14;
        boolean z8;
        boolean z9;
        String l11;
        int i16;
        Integer valueOf15;
        Integer valueOf16;
        Integer valueOf17;
        Integer valueOf18;
        Integer valueOf19;
        Integer valueOf20;
        Integer valueOf21;
        Boolean bool2;
        Integer valueOf22;
        int i17;
        int i18;
        Integer valueOf23;
        Integer num3;
        int i19;
        Integer valueOf24;
        int i20;
        Integer num4;
        Integer valueOf25;
        String l12;
        String l13;
        T1.t d2;
        T1.u f8;
        int i21;
        int i22;
        Integer valueOf26;
        String l14;
        Long valueOf27;
        int i23;
        int i24;
        Integer valueOf28;
        boolean z10;
        boolean z11;
        T1.L l15;
        switch (this.f5243d) {
            case 0:
                long j = this.f5244e;
                D0.a aVar = (D0.a) obj;
                o6.j.e(aVar, "_connection");
                L8 = aVar.L("SELECT * FROM event_toggle_table WHERE action_id=? ORDER BY id");
                try {
                    L8.c(1, j);
                    int x8 = X.x(L8, "id");
                    int x9 = X.x(L8, "action_id");
                    int x10 = X.x(L8, "toggle_type");
                    int x11 = X.x(L8, "toggle_event_id");
                    ArrayList arrayList = new ArrayList();
                    while (L8.H()) {
                        arrayList.add(new T1.A(L8.getLong(x8), L8.getLong(x9), C0297h.i(L8.l(x10)), L8.getLong(x11)));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                long j5 = this.f5244e;
                D0.a aVar2 = (D0.a) obj;
                o6.j.e(aVar2, "_connection");
                L8 = aVar2.L("SELECT * FROM intent_extra_table WHERE action_id=? ORDER BY id");
                try {
                    L8.c(1, j5);
                    int x12 = X.x(L8, "id");
                    int x13 = X.x(L8, "action_id");
                    int x14 = X.x(L8, "type");
                    int x15 = X.x(L8, "key");
                    int x16 = X.x(L8, "value");
                    ArrayList arrayList2 = new ArrayList();
                    while (L8.H()) {
                        arrayList2.add(new T1.F(L8.getLong(x12), L8.getLong(x13), C0297h.k(L8.l(x14)), L8.l(x15), L8.l(x16)));
                    }
                    return arrayList2;
                } finally {
                }
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                long j8 = this.f5244e;
                D0.a aVar3 = (D0.a) obj;
                o6.j.e(aVar3, "_connection");
                L8 = aVar3.L("SELECT * FROM intent_extra_table WHERE action_id=? ORDER BY id");
                try {
                    L8.c(1, j8);
                    int x17 = X.x(L8, "id");
                    int x18 = X.x(L8, "action_id");
                    int x19 = X.x(L8, "type");
                    int x20 = X.x(L8, "key");
                    int x21 = X.x(L8, "value");
                    ArrayList arrayList3 = new ArrayList();
                    while (L8.H()) {
                        arrayList3.add(new T1.F(L8.getLong(x17), L8.getLong(x18), C0297h.l(L8.l(x19)), L8.l(x20), L8.l(x21)));
                    }
                    return arrayList3;
                } finally {
                }
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                long j9 = this.f5244e;
                D0.a aVar4 = (D0.a) obj;
                o6.j.e(aVar4, "_connection");
                L8 = aVar4.L("SELECT * FROM event_toggle_table WHERE action_id=? ORDER BY id");
                try {
                    L8.c(1, j9);
                    int x22 = X.x(L8, "id");
                    int x23 = X.x(L8, "action_id");
                    int x24 = X.x(L8, "toggle_type");
                    int x25 = X.x(L8, "toggle_event_id");
                    ArrayList arrayList4 = new ArrayList();
                    while (L8.H()) {
                        arrayList4.add(new T1.A(L8.getLong(x22), L8.getLong(x23), C0297h.j(L8.l(x24)), L8.getLong(x25)));
                    }
                    return arrayList4;
                } finally {
                }
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                long j10 = this.f5244e;
                D0.a aVar5 = (D0.a) obj;
                o6.j.e(aVar5, "_connection");
                L8 = aVar5.L("SELECT * FROM condition_table WHERE eventId=? ORDER BY priority");
                try {
                    L8.c(1, j10);
                    int x26 = X.x(L8, "id");
                    int x27 = X.x(L8, "eventId");
                    int x28 = X.x(L8, "name");
                    int x29 = X.x(L8, "type");
                    int x30 = X.x(L8, "priority");
                    int x31 = X.x(L8, "path");
                    int x32 = X.x(L8, "area_left");
                    int x33 = X.x(L8, "area_top");
                    int x34 = X.x(L8, "area_right");
                    int x35 = X.x(L8, "area_bottom");
                    int x36 = X.x(L8, "threshold");
                    int x37 = X.x(L8, "detection_type");
                    int x38 = X.x(L8, "shouldBeDetected");
                    int x39 = X.x(L8, "detection_area_left");
                    int x40 = X.x(L8, "detection_area_top");
                    int x41 = X.x(L8, "detection_area_right");
                    int x42 = X.x(L8, "detection_area_bottom");
                    int x43 = X.x(L8, "broadcast_action");
                    int x44 = X.x(L8, "counter_name");
                    int x45 = X.x(L8, "counter_comparison_operation");
                    int x46 = X.x(L8, "counter_operation_value_type");
                    int x47 = X.x(L8, "counter_value");
                    int x48 = X.x(L8, "counter_value_counter_name");
                    int x49 = X.x(L8, "timer_value_ms");
                    int x50 = X.x(L8, "timer_restart_when_reached");
                    ArrayList arrayList5 = new ArrayList();
                    while (L8.H()) {
                        long j11 = L8.getLong(x26);
                        long j12 = L8.getLong(x27);
                        String l16 = L8.l(x28);
                        T1.s a3 = p.a(L8.l(x29));
                        int i25 = x26;
                        int i26 = x27;
                        int i27 = (int) L8.getLong(x30);
                        Boolean bool3 = null;
                        if (L8.isNull(x31)) {
                            l6 = null;
                        } else {
                            l6 = L8.l(x31);
                        }
                        if (L8.isNull(x32)) {
                            i4 = i27;
                            valueOf = null;
                        } else {
                            i4 = i27;
                            valueOf = Integer.valueOf((int) L8.getLong(x32));
                        }
                        if (L8.isNull(x33)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Integer.valueOf((int) L8.getLong(x33));
                        }
                        if (L8.isNull(x34)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Integer.valueOf((int) L8.getLong(x34));
                        }
                        if (L8.isNull(x35)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Integer.valueOf((int) L8.getLong(x35));
                        }
                        if (L8.isNull(x36)) {
                            valueOf5 = null;
                        } else {
                            valueOf5 = Integer.valueOf((int) L8.getLong(x36));
                        }
                        if (L8.isNull(x37)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Integer.valueOf((int) L8.getLong(x37));
                        }
                        if (L8.isNull(x38)) {
                            valueOf7 = null;
                        } else {
                            valueOf7 = Integer.valueOf((int) L8.getLong(x38));
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
                        if (L8.isNull(x39)) {
                            valueOf8 = null;
                        } else {
                            valueOf8 = Integer.valueOf((int) L8.getLong(x39));
                        }
                        int i28 = x40;
                        if (L8.isNull(i28)) {
                            i8 = x28;
                            i9 = x29;
                            valueOf9 = null;
                        } else {
                            i8 = x28;
                            i9 = x29;
                            valueOf9 = Integer.valueOf((int) L8.getLong(i28));
                        }
                        int i29 = x41;
                        if (L8.isNull(i29)) {
                            num = valueOf8;
                            i10 = i28;
                            valueOf10 = null;
                        } else {
                            num = valueOf8;
                            i10 = i28;
                            valueOf10 = Integer.valueOf((int) L8.getLong(i29));
                        }
                        int i30 = x42;
                        if (L8.isNull(i30)) {
                            i11 = i29;
                            num2 = num;
                            valueOf11 = null;
                        } else {
                            i11 = i29;
                            num2 = num;
                            valueOf11 = Integer.valueOf((int) L8.getLong(i30));
                        }
                        int i31 = x43;
                        if (L8.isNull(i31)) {
                            l8 = null;
                        } else {
                            l8 = L8.l(i31);
                        }
                        int i32 = x44;
                        if (L8.isNull(i32)) {
                            l9 = null;
                        } else {
                            l9 = L8.l(i32);
                        }
                        int i33 = x39;
                        int i34 = x45;
                        if (L8.isNull(i34)) {
                            c6 = null;
                        } else {
                            c6 = p.c(L8.l(i34));
                        }
                        x45 = i34;
                        int i35 = x46;
                        if (L8.isNull(i35)) {
                            e9 = null;
                        } else {
                            e9 = p.e(L8.l(i35));
                        }
                        x46 = i35;
                        int i36 = x47;
                        if (L8.isNull(i36)) {
                            i12 = i30;
                            i13 = i11;
                            valueOf12 = null;
                        } else {
                            i12 = i30;
                            i13 = i11;
                            valueOf12 = Integer.valueOf((int) L8.getLong(i36));
                        }
                        int i37 = x48;
                        if (L8.isNull(i37)) {
                            l10 = null;
                        } else {
                            l10 = L8.l(i37);
                        }
                        int i38 = x49;
                        if (L8.isNull(i38)) {
                            valueOf13 = null;
                        } else {
                            valueOf13 = Long.valueOf(L8.getLong(i38));
                        }
                        int i39 = x50;
                        if (L8.isNull(i39)) {
                            i14 = i37;
                            i15 = i38;
                            valueOf14 = null;
                        } else {
                            i14 = i37;
                            i15 = i38;
                            valueOf14 = Integer.valueOf((int) L8.getLong(i39));
                        }
                        if (valueOf14 != null) {
                            if (valueOf14.intValue() != 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            bool3 = Boolean.valueOf(z8);
                        }
                        arrayList5.add(new T1.r(j11, j12, l16, a3, i4, l6, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, bool, num2, valueOf9, valueOf10, valueOf11, l8, l9, c6, e9, valueOf12, l10, valueOf13, bool3));
                        int i40 = i15;
                        x50 = i39;
                        x39 = i33;
                        x43 = i31;
                        x28 = i8;
                        x40 = i10;
                        x41 = i13;
                        x47 = i36;
                        x48 = i14;
                        x49 = i40;
                        x42 = i12;
                        x26 = i25;
                        x27 = i26;
                        x44 = i32;
                        x29 = i9;
                    }
                    return arrayList5;
                } finally {
                }
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                long j13 = this.f5244e;
                D0.a aVar6 = (D0.a) obj;
                o6.j.e(aVar6, "_connection");
                L8 = aVar6.L("SELECT path FROM condition_table WHERE eventId=? AND type='ON_IMAGE_DETECTED'");
                try {
                    L8.c(1, j13);
                    ArrayList arrayList6 = new ArrayList();
                    while (L8.H()) {
                        arrayList6.add(L8.l(0));
                    }
                    return arrayList6;
                } finally {
                }
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                long j14 = this.f5244e;
                D0.a aVar7 = (D0.a) obj;
                o6.j.e(aVar7, "_connection");
                L8 = aVar7.L("SELECT * FROM condition_table WHERE eventId=? ORDER BY priority");
                try {
                    L8.c(1, j14);
                    int x51 = X.x(L8, "id");
                    int x52 = X.x(L8, "eventId");
                    int x53 = X.x(L8, "name");
                    int x54 = X.x(L8, "type");
                    int x55 = X.x(L8, "priority");
                    int x56 = X.x(L8, "path");
                    int x57 = X.x(L8, "area_left");
                    int x58 = X.x(L8, "area_top");
                    int x59 = X.x(L8, "area_right");
                    int x60 = X.x(L8, "area_bottom");
                    int x61 = X.x(L8, "threshold");
                    int x62 = X.x(L8, "detection_type");
                    int x63 = X.x(L8, "shouldBeDetected");
                    int x64 = X.x(L8, "detection_area_left");
                    int x65 = X.x(L8, "detection_area_top");
                    int x66 = X.x(L8, "detection_area_right");
                    int x67 = X.x(L8, "detection_area_bottom");
                    int x68 = X.x(L8, "broadcast_action");
                    int x69 = X.x(L8, "counter_name");
                    int x70 = X.x(L8, "counter_comparison_operation");
                    int x71 = X.x(L8, "counter_operation_value_type");
                    int x72 = X.x(L8, "counter_value");
                    int x73 = X.x(L8, "counter_value_counter_name");
                    int x74 = X.x(L8, "timer_value_ms");
                    int x75 = X.x(L8, "timer_restart_when_reached");
                    ArrayList arrayList7 = new ArrayList();
                    while (L8.H()) {
                        long j15 = L8.getLong(x51);
                        long j16 = L8.getLong(x52);
                        String l17 = L8.l(x53);
                        T1.s b4 = p.b(L8.l(x54));
                        int i41 = x51;
                        int i42 = x52;
                        int i43 = (int) L8.getLong(x55);
                        Boolean bool4 = null;
                        if (L8.isNull(x56)) {
                            l11 = null;
                        } else {
                            l11 = L8.l(x56);
                        }
                        if (L8.isNull(x57)) {
                            i16 = i43;
                            valueOf15 = null;
                        } else {
                            i16 = i43;
                            valueOf15 = Integer.valueOf((int) L8.getLong(x57));
                        }
                        if (L8.isNull(x58)) {
                            valueOf16 = null;
                        } else {
                            valueOf16 = Integer.valueOf((int) L8.getLong(x58));
                        }
                        if (L8.isNull(x59)) {
                            valueOf17 = null;
                        } else {
                            valueOf17 = Integer.valueOf((int) L8.getLong(x59));
                        }
                        if (L8.isNull(x60)) {
                            valueOf18 = null;
                        } else {
                            valueOf18 = Integer.valueOf((int) L8.getLong(x60));
                        }
                        if (L8.isNull(x61)) {
                            valueOf19 = null;
                        } else {
                            valueOf19 = Integer.valueOf((int) L8.getLong(x61));
                        }
                        if (L8.isNull(x62)) {
                            valueOf20 = null;
                        } else {
                            valueOf20 = Integer.valueOf((int) L8.getLong(x62));
                        }
                        if (L8.isNull(x63)) {
                            valueOf21 = null;
                        } else {
                            valueOf21 = Integer.valueOf((int) L8.getLong(x63));
                        }
                        if (valueOf21 != null) {
                            if (valueOf21.intValue() != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            bool2 = Boolean.valueOf(z11);
                        } else {
                            bool2 = null;
                        }
                        if (L8.isNull(x64)) {
                            valueOf22 = null;
                        } else {
                            valueOf22 = Integer.valueOf((int) L8.getLong(x64));
                        }
                        int i44 = x65;
                        if (L8.isNull(i44)) {
                            i17 = x53;
                            i18 = x54;
                            valueOf23 = null;
                        } else {
                            i17 = x53;
                            i18 = x54;
                            valueOf23 = Integer.valueOf((int) L8.getLong(i44));
                        }
                        int i45 = x66;
                        if (L8.isNull(i45)) {
                            num3 = valueOf22;
                            i19 = i44;
                            valueOf24 = null;
                        } else {
                            num3 = valueOf22;
                            i19 = i44;
                            valueOf24 = Integer.valueOf((int) L8.getLong(i45));
                        }
                        int i46 = x67;
                        if (L8.isNull(i46)) {
                            i20 = i45;
                            num4 = num3;
                            valueOf25 = null;
                        } else {
                            i20 = i45;
                            num4 = num3;
                            valueOf25 = Integer.valueOf((int) L8.getLong(i46));
                        }
                        int i47 = x68;
                        if (L8.isNull(i47)) {
                            l12 = null;
                        } else {
                            l12 = L8.l(i47);
                        }
                        int i48 = x69;
                        if (L8.isNull(i48)) {
                            l13 = null;
                        } else {
                            l13 = L8.l(i48);
                        }
                        int i49 = x64;
                        int i50 = x70;
                        if (L8.isNull(i50)) {
                            d2 = null;
                        } else {
                            d2 = p.d(L8.l(i50));
                        }
                        x70 = i50;
                        int i51 = x71;
                        if (L8.isNull(i51)) {
                            f8 = null;
                        } else {
                            f8 = p.f(L8.l(i51));
                        }
                        x71 = i51;
                        int i52 = x72;
                        if (L8.isNull(i52)) {
                            i21 = i46;
                            i22 = i20;
                            valueOf26 = null;
                        } else {
                            i21 = i46;
                            i22 = i20;
                            valueOf26 = Integer.valueOf((int) L8.getLong(i52));
                        }
                        int i53 = x73;
                        if (L8.isNull(i53)) {
                            l14 = null;
                        } else {
                            l14 = L8.l(i53);
                        }
                        int i54 = x74;
                        if (L8.isNull(i54)) {
                            valueOf27 = null;
                        } else {
                            valueOf27 = Long.valueOf(L8.getLong(i54));
                        }
                        int i55 = x75;
                        if (L8.isNull(i55)) {
                            i23 = i53;
                            i24 = i54;
                            valueOf28 = null;
                        } else {
                            i23 = i53;
                            i24 = i54;
                            valueOf28 = Integer.valueOf((int) L8.getLong(i55));
                        }
                        if (valueOf28 != null) {
                            if (valueOf28.intValue() != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            bool4 = Boolean.valueOf(z10);
                        }
                        arrayList7.add(new T1.r(j15, j16, l17, b4, i16, l11, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, bool2, num4, valueOf23, valueOf24, valueOf25, l12, l13, d2, f8, valueOf26, l14, valueOf27, bool4));
                        int i56 = i24;
                        x75 = i55;
                        x64 = i49;
                        x68 = i47;
                        x53 = i17;
                        x65 = i19;
                        x66 = i22;
                        x72 = i52;
                        x73 = i23;
                        x74 = i56;
                        x67 = i21;
                        x51 = i41;
                        x52 = i42;
                        x69 = i48;
                        x54 = i18;
                    }
                    return arrayList7;
                } finally {
                }
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                long j17 = this.f5244e;
                D0.a aVar8 = (D0.a) obj;
                o6.j.e(aVar8, "_connection");
                L8 = aVar8.L("SELECT path FROM condition_table WHERE eventId=? AND type='ON_IMAGE_DETECTED'");
                try {
                    L8.c(1, j17);
                    ArrayList arrayList8 = new ArrayList();
                    while (L8.H()) {
                        arrayList8.add(L8.l(0));
                    }
                    return arrayList8;
                } finally {
                }
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                long j18 = this.f5244e;
                D0.a aVar9 = (D0.a) obj;
                o6.j.e(aVar9, "_connection");
                L8 = aVar9.L("SELECT id FROM event_table WHERE scenario_id=?");
                try {
                    L8.c(1, j18);
                    ArrayList arrayList9 = new ArrayList();
                    while (L8.H()) {
                        arrayList9.add(Long.valueOf(L8.getLong(0)));
                    }
                    return arrayList9;
                } finally {
                }
            case 9:
                return f(obj);
            case 10:
                long j19 = this.f5244e;
                D0.a aVar10 = (D0.a) obj;
                o6.j.e(aVar10, "_connection");
                L8 = aVar10.L("SELECT id FROM event_table WHERE scenario_id=?");
                try {
                    L8.c(1, j19);
                    ArrayList arrayList10 = new ArrayList();
                    while (L8.H()) {
                        arrayList10.add(Long.valueOf(L8.getLong(0)));
                    }
                    return arrayList10;
                } finally {
                }
            case 11:
                return g(obj);
            case 12:
                long j20 = this.f5244e;
                D0.a aVar11 = (D0.a) obj;
                o6.j.e(aVar11, "_connection");
                L8 = aVar11.L("DELETE FROM scenario_table WHERE id = ?");
                try {
                    L8.c(1, j20);
                    L8.H();
                    L8.close();
                    return Z5.y.f7506a;
                } finally {
                }
            case 13:
                long j21 = this.f5244e;
                D0.a aVar12 = (D0.a) obj;
                o6.j.e(aVar12, "_connection");
                L8 = aVar12.L("SELECT * FROM scenario_usage_table WHERE id=?");
                try {
                    L8.c(1, j21);
                    int x76 = X.x(L8, "id");
                    int x77 = X.x(L8, "scenario_id");
                    int x78 = X.x(L8, "last_start_timestamp_ms");
                    int x79 = X.x(L8, "start_count");
                    if (L8.H()) {
                        l15 = new T1.L(L8.getLong(x76), L8.getLong(x77), L8.getLong(x78), L8.getLong(x79));
                    } else {
                        l15 = null;
                    }
                    return l15;
                } finally {
                }
            case 14:
                return h(obj);
            case 15:
                return k(obj);
            case 16:
                return n(obj);
            default:
                long j22 = this.f5244e;
                D0.a aVar13 = (D0.a) obj;
                o6.j.e(aVar13, "_connection");
                L8 = aVar13.L("DELETE FROM dumb_scenario_table WHERE id = ?");
                try {
                    L8.c(1, j22);
                    L8.H();
                    return Z5.y.f7506a;
                } finally {
                }
        }
    }

    public /* synthetic */ C0290a(int i4, long j, Object obj) {
        this.f5243d = i4;
        this.f5244e = j;
    }
}
