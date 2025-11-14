package com.buzbuz.smartautoclicker.core.database;

import R1.a;
import R1.b;
import R1.d;
import S1.C0297h;
import S1.F;
import S1.p;
import S1.w;
import Z.g;
import Z5.n;
import a6.s;
import com.buzbuz.smartautoclicker.core.database.ClickDatabase_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import n6.InterfaceC1162a;
import o6.v;
import u0.C1617h;
import u6.InterfaceC1642c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/buzbuz/smartautoclicker/core/database/ClickDatabase_Impl;", "Lcom/buzbuz/smartautoclicker/core/database/ClickDatabase;", "<init>", "()V", "database_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClickDatabase_Impl extends ClickDatabase {

    /* renamed from: l, reason: collision with root package name */
    public final n f9763l;

    /* renamed from: m, reason: collision with root package name */
    public final n f9764m;

    /* renamed from: n, reason: collision with root package name */
    public final n f9765n;

    /* renamed from: o, reason: collision with root package name */
    public final n f9766o;

    public ClickDatabase_Impl() {
        final int i4 = 0;
        this.f9763l = new n(new InterfaceC1162a(this) { // from class: R1.c

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ClickDatabase_Impl f4997e;

            {
                this.f4997e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i4) {
                    case 0:
                        return new F(this.f4997e, 0);
                    case 1:
                        return new w(this.f4997e, 0);
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        return new p(this.f4997e, 0);
                    default:
                        return new C0297h(this.f4997e, 0);
                }
            }
        });
        final int i8 = 1;
        this.f9764m = new n(new InterfaceC1162a(this) { // from class: R1.c

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ClickDatabase_Impl f4997e;

            {
                this.f4997e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i8) {
                    case 0:
                        return new F(this.f4997e, 0);
                    case 1:
                        return new w(this.f4997e, 0);
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        return new p(this.f4997e, 0);
                    default:
                        return new C0297h(this.f4997e, 0);
                }
            }
        });
        final int i9 = 2;
        this.f9765n = new n(new InterfaceC1162a(this) { // from class: R1.c

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ClickDatabase_Impl f4997e;

            {
                this.f4997e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i9) {
                    case 0:
                        return new F(this.f4997e, 0);
                    case 1:
                        return new w(this.f4997e, 0);
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        return new p(this.f4997e, 0);
                    default:
                        return new C0297h(this.f4997e, 0);
                }
            }
        });
        final int i10 = 3;
        this.f9766o = new n(new InterfaceC1162a(this) { // from class: R1.c

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ClickDatabase_Impl f4997e;

            {
                this.f4997e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i10) {
                    case 0:
                        return new F(this.f4997e, 0);
                    case 1:
                        return new w(this.f4997e, 0);
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        return new p(this.f4997e, 0);
                    default:
                        return new C0297h(this.f4997e, 0);
                }
            }
        });
    }

    @Override // u0.u
    public final List b(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(7, 8, 6));
        arrayList.add(new b());
        arrayList.add(new a(11, 12, 0));
        arrayList.add(new a(13, 14, 1));
        arrayList.add(new a(14, 15, 2));
        arrayList.add(new a(15, 16, 3));
        arrayList.add(new a(16, 17, 4));
        arrayList.add(new a(17, 18, 5));
        return arrayList;
    }

    @Override // u0.u
    public final C1617h c() {
        return new C1617h(this, new LinkedHashMap(), new LinkedHashMap(), "action_table", "event_table", "scenario_table", "condition_table", "intent_extra_table", "event_toggle_table", "scenario_usage_table");
    }

    @Override // u0.u
    public final c0.g d() {
        return new d(this);
    }

    @Override // u0.u
    public final Set g() {
        return new LinkedHashSet();
    }

    @Override // u0.u
    public final LinkedHashMap h() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        o6.w wVar = v.f13643a;
        InterfaceC1642c b4 = wVar.b(F.class);
        s sVar = s.f7766d;
        linkedHashMap.put(b4, sVar);
        linkedHashMap.put(wVar.b(w.class), sVar);
        linkedHashMap.put(wVar.b(p.class), sVar);
        linkedHashMap.put(wVar.b(C0297h.class), sVar);
        return linkedHashMap;
    }

    @Override // com.buzbuz.smartautoclicker.core.database.ScenarioDatabase
    public final C0297h o() {
        return (C0297h) this.f9766o.getValue();
    }

    @Override // com.buzbuz.smartautoclicker.core.database.ScenarioDatabase
    public final p p() {
        return (p) this.f9765n.getValue();
    }

    @Override // com.buzbuz.smartautoclicker.core.database.ScenarioDatabase
    public final w q() {
        return (w) this.f9764m.getValue();
    }

    @Override // com.buzbuz.smartautoclicker.core.database.ScenarioDatabase
    public final F r() {
        return (F) this.f9763l.getValue();
    }
}
