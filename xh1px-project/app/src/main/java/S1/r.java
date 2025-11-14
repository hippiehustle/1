package S1;

import T1.C0313l;
import java.util.ArrayList;
import java.util.List;
import n6.InterfaceC1163b;
import q4.X;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f5294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f5295f;

    public /* synthetic */ r(long j, w wVar, int i4) {
        this.f5293d = i4;
        this.f5294e = j;
        this.f5295f = wVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        boolean z8;
        Integer valueOf;
        Boolean bool;
        boolean z9;
        boolean z10;
        Integer valueOf2;
        Boolean bool2;
        boolean z11;
        boolean z12;
        Integer valueOf3;
        Boolean bool3;
        boolean z13;
        boolean z14;
        Integer valueOf4;
        Boolean bool4;
        boolean z15;
        int i4 = this.f5293d;
        long j = this.f5294e;
        switch (i4) {
            case 0:
                w wVar = this.f5295f;
                D0.a aVar = (D0.a) obj;
                o6.j.e(aVar, "_connection");
                D0.c L8 = aVar.L("SELECT * FROM event_table WHERE scenario_id=? AND type='IMAGE_EVENT' ORDER BY priority");
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
                    t.g gVar = new t.g((Object) null);
                    t.g gVar2 = new t.g((Object) null);
                    while (L8.H()) {
                        int i8 = x10;
                        long j5 = L8.getLong(x8);
                        if (!gVar.b(j5)) {
                            gVar.g(j5, new ArrayList());
                        }
                        long j8 = L8.getLong(x8);
                        if (!gVar2.b(j8)) {
                            gVar2.g(j8, new ArrayList());
                        }
                        x10 = i8;
                    }
                    int i9 = x10;
                    L8.reset();
                    wVar.s(aVar, gVar);
                    wVar.u(aVar, gVar2);
                    ArrayList arrayList = new ArrayList();
                    while (L8.H()) {
                        long j9 = L8.getLong(x8);
                        long j10 = L8.getLong(x9);
                        int i10 = i9;
                        String l6 = L8.l(i10);
                        int i11 = (int) L8.getLong(x11);
                        int i12 = x9;
                        i9 = i10;
                        int i13 = (int) L8.getLong(x12);
                        if (((int) L8.getLong(x13)) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        T1.C m6 = w.m(L8.l(x14));
                        if (L8.isNull(x15)) {
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf((int) L8.getLong(x15));
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
                        T1.x xVar = new T1.x(j9, j10, l6, i11, i13, z8, m6, bool);
                        Object c6 = gVar.c(L8.getLong(x8));
                        if (c6 != null) {
                            List list = (List) c6;
                            int i14 = x11;
                            int i15 = x12;
                            Object c9 = gVar2.c(L8.getLong(x8));
                            if (c9 != null) {
                                arrayList.add(new C0313l(xVar, list, (List) c9));
                                x9 = i12;
                                x11 = i14;
                                x12 = i15;
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    L8.close();
                    return arrayList;
                } catch (Throwable th) {
                    L8.close();
                    throw th;
                }
            case 1:
                w wVar2 = this.f5295f;
                D0.a aVar2 = (D0.a) obj;
                o6.j.e(aVar2, "_connection");
                D0.c L9 = aVar2.L("SELECT * FROM event_table WHERE scenario_id=? AND type='TRIGGER_EVENT' ORDER BY name");
                try {
                    L9.c(1, j);
                    int x16 = X.x(L9, "id");
                    int x17 = X.x(L9, "scenario_id");
                    int x18 = X.x(L9, "name");
                    int x19 = X.x(L9, "operator");
                    int x20 = X.x(L9, "priority");
                    int x21 = X.x(L9, "enabled_on_start");
                    int x22 = X.x(L9, "type");
                    int x23 = X.x(L9, "keep_detecting");
                    t.g gVar3 = new t.g((Object) null);
                    t.g gVar4 = new t.g((Object) null);
                    while (L9.H()) {
                        int i16 = x18;
                        long j11 = L9.getLong(x16);
                        if (!gVar3.b(j11)) {
                            gVar3.g(j11, new ArrayList());
                        }
                        long j12 = L9.getLong(x16);
                        if (!gVar4.b(j12)) {
                            gVar4.g(j12, new ArrayList());
                        }
                        x18 = i16;
                    }
                    int i17 = x18;
                    L9.reset();
                    wVar2.s(aVar2, gVar3);
                    wVar2.u(aVar2, gVar4);
                    ArrayList arrayList2 = new ArrayList();
                    while (L9.H()) {
                        long j13 = L9.getLong(x16);
                        long j14 = L9.getLong(x17);
                        int i18 = i17;
                        String l8 = L9.l(i18);
                        int i19 = (int) L9.getLong(x19);
                        int i20 = x17;
                        i17 = i18;
                        int i21 = (int) L9.getLong(x20);
                        if (((int) L9.getLong(x21)) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        T1.C m8 = w.m(L9.l(x22));
                        if (L9.isNull(x23)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Integer.valueOf((int) L9.getLong(x23));
                        }
                        if (valueOf2 != null) {
                            if (valueOf2.intValue() != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            bool2 = Boolean.valueOf(z11);
                        } else {
                            bool2 = null;
                        }
                        T1.x xVar2 = new T1.x(j13, j14, l8, i19, i21, z10, m8, bool2);
                        Object c10 = gVar3.c(L9.getLong(x16));
                        if (c10 != null) {
                            List list2 = (List) c10;
                            int i22 = x19;
                            int i23 = x20;
                            Object c11 = gVar4.c(L9.getLong(x16));
                            if (c11 != null) {
                                arrayList2.add(new C0313l(xVar2, list2, (List) c11));
                                x17 = i20;
                                x19 = i22;
                                x20 = i23;
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    L9.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    L9.close();
                    throw th2;
                }
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                w wVar3 = this.f5295f;
                D0.a aVar3 = (D0.a) obj;
                o6.j.e(aVar3, "_connection");
                D0.c L10 = aVar3.L("SELECT * FROM event_table WHERE scenario_id=? AND type='TRIGGER_EVENT' ORDER BY name");
                try {
                    L10.c(1, j);
                    int x24 = X.x(L10, "id");
                    int x25 = X.x(L10, "scenario_id");
                    int x26 = X.x(L10, "name");
                    int x27 = X.x(L10, "operator");
                    int x28 = X.x(L10, "priority");
                    int x29 = X.x(L10, "enabled_on_start");
                    int x30 = X.x(L10, "type");
                    int x31 = X.x(L10, "keep_detecting");
                    t.g gVar5 = new t.g((Object) null);
                    t.g gVar6 = new t.g((Object) null);
                    while (L10.H()) {
                        int i24 = x26;
                        long j15 = L10.getLong(x24);
                        if (!gVar5.b(j15)) {
                            gVar5.g(j15, new ArrayList());
                        }
                        long j16 = L10.getLong(x24);
                        if (!gVar6.b(j16)) {
                            gVar6.g(j16, new ArrayList());
                        }
                        x26 = i24;
                    }
                    int i25 = x26;
                    L10.reset();
                    wVar3.s(aVar3, gVar5);
                    wVar3.u(aVar3, gVar6);
                    ArrayList arrayList3 = new ArrayList();
                    while (L10.H()) {
                        long j17 = L10.getLong(x24);
                        long j18 = L10.getLong(x25);
                        int i26 = i25;
                        String l9 = L10.l(i26);
                        int i27 = (int) L10.getLong(x27);
                        int i28 = x25;
                        i25 = i26;
                        int i29 = (int) L10.getLong(x28);
                        if (((int) L10.getLong(x29)) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        T1.C m9 = w.m(L10.l(x30));
                        if (L10.isNull(x31)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Integer.valueOf((int) L10.getLong(x31));
                        }
                        if (valueOf3 != null) {
                            if (valueOf3.intValue() != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            bool3 = Boolean.valueOf(z13);
                        } else {
                            bool3 = null;
                        }
                        T1.x xVar3 = new T1.x(j17, j18, l9, i27, i29, z12, m9, bool3);
                        Object c12 = gVar5.c(L10.getLong(x24));
                        if (c12 != null) {
                            List list3 = (List) c12;
                            int i30 = x27;
                            int i31 = x28;
                            Object c13 = gVar6.c(L10.getLong(x24));
                            if (c13 != null) {
                                arrayList3.add(new C0313l(xVar3, list3, (List) c13));
                                x25 = i28;
                                x27 = i30;
                                x28 = i31;
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    L10.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    L10.close();
                    throw th3;
                }
            default:
                w wVar4 = this.f5295f;
                D0.a aVar4 = (D0.a) obj;
                o6.j.e(aVar4, "_connection");
                D0.c L11 = aVar4.L("SELECT * FROM event_table WHERE scenario_id=? AND type='IMAGE_EVENT' ORDER BY priority");
                try {
                    L11.c(1, j);
                    int x32 = X.x(L11, "id");
                    int x33 = X.x(L11, "scenario_id");
                    int x34 = X.x(L11, "name");
                    int x35 = X.x(L11, "operator");
                    int x36 = X.x(L11, "priority");
                    int x37 = X.x(L11, "enabled_on_start");
                    int x38 = X.x(L11, "type");
                    int x39 = X.x(L11, "keep_detecting");
                    t.g gVar7 = new t.g((Object) null);
                    t.g gVar8 = new t.g((Object) null);
                    while (L11.H()) {
                        int i32 = x34;
                        long j19 = L11.getLong(x32);
                        if (!gVar7.b(j19)) {
                            gVar7.g(j19, new ArrayList());
                        }
                        long j20 = L11.getLong(x32);
                        if (!gVar8.b(j20)) {
                            gVar8.g(j20, new ArrayList());
                        }
                        x34 = i32;
                    }
                    int i33 = x34;
                    L11.reset();
                    wVar4.s(aVar4, gVar7);
                    wVar4.u(aVar4, gVar8);
                    ArrayList arrayList4 = new ArrayList();
                    while (L11.H()) {
                        long j21 = L11.getLong(x32);
                        long j22 = L11.getLong(x33);
                        int i34 = i33;
                        String l10 = L11.l(i34);
                        int i35 = (int) L11.getLong(x35);
                        int i36 = x33;
                        i33 = i34;
                        int i37 = (int) L11.getLong(x36);
                        if (((int) L11.getLong(x37)) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        T1.C m10 = w.m(L11.l(x38));
                        if (L11.isNull(x39)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Integer.valueOf((int) L11.getLong(x39));
                        }
                        if (valueOf4 != null) {
                            if (valueOf4.intValue() != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            bool4 = Boolean.valueOf(z15);
                        } else {
                            bool4 = null;
                        }
                        T1.x xVar4 = new T1.x(j21, j22, l10, i35, i37, z14, m10, bool4);
                        Object c14 = gVar7.c(L11.getLong(x32));
                        if (c14 != null) {
                            List list4 = (List) c14;
                            int i38 = x35;
                            int i39 = x36;
                            Object c15 = gVar8.c(L11.getLong(x32));
                            if (c15 != null) {
                                arrayList4.add(new C0313l(xVar4, list4, (List) c15));
                                x33 = i36;
                                x35 = i38;
                                x36 = i39;
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    L11.close();
                    return arrayList4;
                } catch (Throwable th4) {
                    L11.close();
                    throw th4;
                }
        }
    }
}
