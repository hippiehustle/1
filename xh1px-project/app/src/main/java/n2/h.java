package n2;

import java.util.ArrayList;
import java.util.List;
import n6.InterfaceC1163b;
import q4.X;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f12896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f12897f;

    public /* synthetic */ h(long j, j jVar, int i4) {
        this.f12895d = i4;
        this.f12896e = j;
        this.f12897f = jVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        D0.c L8;
        Integer valueOf;
        Integer valueOf2;
        Boolean bool;
        Long valueOf3;
        Long valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        Long valueOf7;
        Integer valueOf8;
        int i4;
        int i8;
        Integer valueOf9;
        int i9;
        int i10;
        Integer valueOf10;
        int i11;
        int i12;
        Integer valueOf11;
        Long valueOf12;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Integer valueOf13;
        Integer valueOf14;
        Boolean bool2;
        Long valueOf15;
        Long valueOf16;
        Integer valueOf17;
        Integer valueOf18;
        Long valueOf19;
        Integer valueOf20;
        int i13;
        int i14;
        Integer valueOf21;
        int i15;
        int i16;
        Integer valueOf22;
        int i17;
        int i18;
        Integer valueOf23;
        Long valueOf24;
        boolean z15;
        int i19 = this.f12895d;
        long j = this.f12896e;
        switch (i19) {
            case 0:
                j jVar = this.f12897f;
                D0.a aVar = (D0.a) obj;
                o6.j.e(aVar, "_connection");
                L8 = aVar.L("SELECT * FROM dumb_action_table WHERE dumb_scenario_id=? ORDER BY priority ASC");
                try {
                    L8.c(1, j);
                    int x8 = X.x(L8, "id");
                    int x9 = X.x(L8, "dumb_scenario_id");
                    int x10 = X.x(L8, "priority");
                    int x11 = X.x(L8, "name");
                    int x12 = X.x(L8, "type");
                    int x13 = X.x(L8, "repeat_count");
                    int x14 = X.x(L8, "is_repeat_infinite");
                    int x15 = X.x(L8, "repeat_delay");
                    int x16 = X.x(L8, "press_duration");
                    int x17 = X.x(L8, "x");
                    int x18 = X.x(L8, "y");
                    int x19 = X.x(L8, "swipe_duration");
                    int x20 = X.x(L8, "fromX");
                    int x21 = X.x(L8, "fromY");
                    int x22 = X.x(L8, "toX");
                    int x23 = X.x(L8, "toY");
                    int x24 = X.x(L8, "pause_duration");
                    ArrayList arrayList = new ArrayList();
                    while (L8.H()) {
                        long j5 = L8.getLong(x8);
                        long j8 = L8.getLong(x9);
                        int i20 = x8;
                        int i21 = x9;
                        int i22 = (int) L8.getLong(x10);
                        String l6 = L8.l(x11);
                        String l8 = L8.l(x12);
                        G5.e eVar = jVar.f12904d;
                        o6.j.e(l8, "value");
                        EnumC1156d valueOf25 = EnumC1156d.valueOf(l8);
                        if (L8.isNull(x13)) {
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf((int) L8.getLong(x13));
                        }
                        if (L8.isNull(x14)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Integer.valueOf((int) L8.getLong(x14));
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
                        if (L8.isNull(x15)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Long.valueOf(L8.getLong(x15));
                        }
                        if (L8.isNull(x16)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Long.valueOf(L8.getLong(x16));
                        }
                        if (L8.isNull(x17)) {
                            valueOf5 = null;
                        } else {
                            valueOf5 = Integer.valueOf((int) L8.getLong(x17));
                        }
                        if (L8.isNull(x18)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Integer.valueOf((int) L8.getLong(x18));
                        }
                        if (L8.isNull(x19)) {
                            valueOf7 = null;
                        } else {
                            valueOf7 = Long.valueOf(L8.getLong(x19));
                        }
                        if (L8.isNull(x20)) {
                            valueOf8 = null;
                        } else {
                            valueOf8 = Integer.valueOf((int) L8.getLong(x20));
                        }
                        int i23 = x21;
                        if (L8.isNull(i23)) {
                            i4 = x20;
                            i8 = x10;
                            valueOf9 = null;
                        } else {
                            i4 = x20;
                            i8 = x10;
                            valueOf9 = Integer.valueOf((int) L8.getLong(i23));
                        }
                        int i24 = x22;
                        if (L8.isNull(i24)) {
                            i9 = i23;
                            i10 = i8;
                            valueOf10 = null;
                        } else {
                            i9 = i23;
                            i10 = i8;
                            valueOf10 = Integer.valueOf((int) L8.getLong(i24));
                        }
                        int i25 = x23;
                        if (L8.isNull(i25)) {
                            i11 = i24;
                            i12 = i9;
                            valueOf11 = null;
                        } else {
                            i11 = i24;
                            i12 = i9;
                            valueOf11 = Integer.valueOf((int) L8.getLong(i25));
                        }
                        int i26 = x24;
                        if (L8.isNull(i26)) {
                            valueOf12 = null;
                        } else {
                            valueOf12 = Long.valueOf(L8.getLong(i26));
                        }
                        arrayList.add(new C1155c(j5, j8, i22, l6, valueOf25, valueOf, bool, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12));
                        x24 = i26;
                        x20 = i4;
                        x10 = i10;
                        x21 = i12;
                        x23 = i25;
                        x22 = i11;
                        x8 = i20;
                        x9 = i21;
                    }
                    L8.close();
                    return arrayList;
                } finally {
                    L8.close();
                }
            case 1:
                j jVar2 = this.f12897f;
                D0.a aVar2 = (D0.a) obj;
                o6.j.e(aVar2, "_connection");
                D0.c L9 = aVar2.L("SELECT * FROM dumb_scenario_table WHERE id=?");
                try {
                    L9.c(1, j);
                    int x25 = X.x(L9, "id");
                    int x26 = X.x(L9, "name");
                    int x27 = X.x(L9, "repeat_count");
                    int x28 = X.x(L9, "is_repeat_infinite");
                    int x29 = X.x(L9, "max_duration_minutes");
                    int x30 = X.x(L9, "is_duration_infinite");
                    int x31 = X.x(L9, "randomize");
                    s sVar = null;
                    t.g gVar = new t.g((Object) null);
                    t.g gVar2 = new t.g((Object) null);
                    while (L9.H()) {
                        int i27 = x27;
                        long j9 = L9.getLong(x25);
                        if (!gVar.b(j9)) {
                            gVar.g(j9, new ArrayList());
                        }
                        sVar = null;
                        gVar2.g(L9.getLong(x25), null);
                        x27 = i27;
                    }
                    int i28 = x27;
                    L9.reset();
                    jVar2.a(aVar2, gVar);
                    jVar2.b(aVar2, gVar2);
                    if (L9.H()) {
                        long j10 = L9.getLong(x25);
                        String l9 = L9.l(x26);
                        int i29 = (int) L9.getLong(i28);
                        if (((int) L9.getLong(x28)) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        int i30 = (int) L9.getLong(x29);
                        if (((int) L9.getLong(x30)) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (((int) L9.getLong(x31)) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        m mVar = new m(j10, l9, i29, z9, i30, z10, z11);
                        Object c6 = gVar.c(L9.getLong(x25));
                        if (c6 != null) {
                            sVar = new s(mVar, (List) c6, (p) gVar2.c(L9.getLong(x25)));
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    L9.close();
                    return sVar;
                } finally {
                    L9.close();
                }
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                j jVar3 = this.f12897f;
                D0.a aVar3 = (D0.a) obj;
                o6.j.e(aVar3, "_connection");
                D0.c L10 = aVar3.L("SELECT * FROM dumb_scenario_table WHERE id=?");
                try {
                    L10.c(1, j);
                    int x32 = X.x(L10, "id");
                    int x33 = X.x(L10, "name");
                    int x34 = X.x(L10, "repeat_count");
                    int x35 = X.x(L10, "is_repeat_infinite");
                    int x36 = X.x(L10, "max_duration_minutes");
                    int x37 = X.x(L10, "is_duration_infinite");
                    int x38 = X.x(L10, "randomize");
                    s sVar2 = null;
                    t.g gVar3 = new t.g((Object) null);
                    t.g gVar4 = new t.g((Object) null);
                    while (L10.H()) {
                        int i31 = x34;
                        long j11 = L10.getLong(x32);
                        if (!gVar3.b(j11)) {
                            gVar3.g(j11, new ArrayList());
                        }
                        sVar2 = null;
                        gVar4.g(L10.getLong(x32), null);
                        x34 = i31;
                    }
                    int i32 = x34;
                    L10.reset();
                    jVar3.a(aVar3, gVar3);
                    jVar3.b(aVar3, gVar4);
                    if (L10.H()) {
                        long j12 = L10.getLong(x32);
                        String l10 = L10.l(x33);
                        int i33 = (int) L10.getLong(i32);
                        if (((int) L10.getLong(x35)) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        int i34 = (int) L10.getLong(x36);
                        if (((int) L10.getLong(x37)) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (((int) L10.getLong(x38)) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        m mVar2 = new m(j12, l10, i33, z12, i34, z13, z14);
                        Object c9 = gVar3.c(L10.getLong(x32));
                        if (c9 != null) {
                            sVar2 = new s(mVar2, (List) c9, (p) gVar4.c(L10.getLong(x32)));
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    L10.close();
                    return sVar2;
                } finally {
                    L10.close();
                }
            default:
                j jVar4 = this.f12897f;
                D0.a aVar4 = (D0.a) obj;
                o6.j.e(aVar4, "_connection");
                L8 = aVar4.L("SELECT * FROM dumb_action_table WHERE dumb_scenario_id!=?");
                try {
                    L8.c(1, j);
                    int x39 = X.x(L8, "id");
                    int x40 = X.x(L8, "dumb_scenario_id");
                    int x41 = X.x(L8, "priority");
                    int x42 = X.x(L8, "name");
                    int x43 = X.x(L8, "type");
                    int x44 = X.x(L8, "repeat_count");
                    int x45 = X.x(L8, "is_repeat_infinite");
                    int x46 = X.x(L8, "repeat_delay");
                    int x47 = X.x(L8, "press_duration");
                    int x48 = X.x(L8, "x");
                    int x49 = X.x(L8, "y");
                    int x50 = X.x(L8, "swipe_duration");
                    int x51 = X.x(L8, "fromX");
                    int x52 = X.x(L8, "fromY");
                    int x53 = X.x(L8, "toX");
                    int x54 = X.x(L8, "toY");
                    int x55 = X.x(L8, "pause_duration");
                    ArrayList arrayList2 = new ArrayList();
                    while (L8.H()) {
                        long j13 = L8.getLong(x39);
                        long j14 = L8.getLong(x40);
                        int i35 = x39;
                        int i36 = x40;
                        int i37 = (int) L8.getLong(x41);
                        String l11 = L8.l(x42);
                        String l12 = L8.l(x43);
                        G5.e eVar2 = jVar4.f12904d;
                        o6.j.e(l12, "value");
                        EnumC1156d valueOf26 = EnumC1156d.valueOf(l12);
                        if (L8.isNull(x44)) {
                            valueOf13 = null;
                        } else {
                            valueOf13 = Integer.valueOf((int) L8.getLong(x44));
                        }
                        if (L8.isNull(x45)) {
                            valueOf14 = null;
                        } else {
                            valueOf14 = Integer.valueOf((int) L8.getLong(x45));
                        }
                        if (valueOf14 != null) {
                            if (valueOf14.intValue() != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            bool2 = Boolean.valueOf(z15);
                        } else {
                            bool2 = null;
                        }
                        if (L8.isNull(x46)) {
                            valueOf15 = null;
                        } else {
                            valueOf15 = Long.valueOf(L8.getLong(x46));
                        }
                        if (L8.isNull(x47)) {
                            valueOf16 = null;
                        } else {
                            valueOf16 = Long.valueOf(L8.getLong(x47));
                        }
                        if (L8.isNull(x48)) {
                            valueOf17 = null;
                        } else {
                            valueOf17 = Integer.valueOf((int) L8.getLong(x48));
                        }
                        if (L8.isNull(x49)) {
                            valueOf18 = null;
                        } else {
                            valueOf18 = Integer.valueOf((int) L8.getLong(x49));
                        }
                        if (L8.isNull(x50)) {
                            valueOf19 = null;
                        } else {
                            valueOf19 = Long.valueOf(L8.getLong(x50));
                        }
                        if (L8.isNull(x51)) {
                            valueOf20 = null;
                        } else {
                            valueOf20 = Integer.valueOf((int) L8.getLong(x51));
                        }
                        int i38 = x52;
                        if (L8.isNull(i38)) {
                            i13 = x51;
                            i14 = x41;
                            valueOf21 = null;
                        } else {
                            i13 = x51;
                            i14 = x41;
                            valueOf21 = Integer.valueOf((int) L8.getLong(i38));
                        }
                        int i39 = x53;
                        if (L8.isNull(i39)) {
                            i15 = i38;
                            i16 = i14;
                            valueOf22 = null;
                        } else {
                            i15 = i38;
                            i16 = i14;
                            valueOf22 = Integer.valueOf((int) L8.getLong(i39));
                        }
                        int i40 = x54;
                        if (L8.isNull(i40)) {
                            i17 = i39;
                            i18 = i15;
                            valueOf23 = null;
                        } else {
                            i17 = i39;
                            i18 = i15;
                            valueOf23 = Integer.valueOf((int) L8.getLong(i40));
                        }
                        int i41 = x55;
                        if (L8.isNull(i41)) {
                            valueOf24 = null;
                        } else {
                            valueOf24 = Long.valueOf(L8.getLong(i41));
                        }
                        arrayList2.add(new C1155c(j13, j14, i37, l11, valueOf26, valueOf13, bool2, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24));
                        x55 = i41;
                        x51 = i13;
                        x41 = i16;
                        x52 = i18;
                        x54 = i40;
                        x53 = i17;
                        x39 = i35;
                        x40 = i36;
                    }
                    L8.close();
                    return arrayList2;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
