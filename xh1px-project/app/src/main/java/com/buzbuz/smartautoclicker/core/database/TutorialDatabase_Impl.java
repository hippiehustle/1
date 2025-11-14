package com.buzbuz.smartautoclicker.core.database;

import R1.a;
import R1.d;
import S1.C0297h;
import S1.F;
import S1.L;
import S1.p;
import S1.w;
import Z.g;
import Z5.n;
import a6.s;
import com.buzbuz.smartautoclicker.core.database.TutorialDatabase_Impl;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/buzbuz/smartautoclicker/core/database/TutorialDatabase_Impl;", "Lcom/buzbuz/smartautoclicker/core/database/TutorialDatabase;", "<init>", "()V", "database_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TutorialDatabase_Impl extends TutorialDatabase {

    /* renamed from: l, reason: collision with root package name */
    public final n f9767l;

    /* renamed from: m, reason: collision with root package name */
    public final n f9768m;

    /* renamed from: n, reason: collision with root package name */
    public final n f9769n;

    /* renamed from: o, reason: collision with root package name */
    public final n f9770o;

    /* renamed from: p, reason: collision with root package name */
    public final n f9771p;

    public TutorialDatabase_Impl() {
        final int i4 = 0;
        this.f9767l = new n(new InterfaceC1162a(this) { // from class: R1.e

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ TutorialDatabase_Impl f5001e;

            {
                this.f5001e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i4) {
                    case 0:
                        return new F(this.f5001e, 1);
                    case 1:
                        return new w(this.f5001e, 1);
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        return new p(this.f5001e, 1);
                    case g.INTEGER_FIELD_NUMBER /* 3 */:
                        return new C0297h(this.f5001e, 1);
                    default:
                        return new L(this.f5001e);
                }
            }
        });
        final int i8 = 1;
        this.f9768m = new n(new InterfaceC1162a(this) { // from class: R1.e

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ TutorialDatabase_Impl f5001e;

            {
                this.f5001e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i8) {
                    case 0:
                        return new F(this.f5001e, 1);
                    case 1:
                        return new w(this.f5001e, 1);
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        return new p(this.f5001e, 1);
                    case g.INTEGER_FIELD_NUMBER /* 3 */:
                        return new C0297h(this.f5001e, 1);
                    default:
                        return new L(this.f5001e);
                }
            }
        });
        final int i9 = 2;
        this.f9769n = new n(new InterfaceC1162a(this) { // from class: R1.e

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ TutorialDatabase_Impl f5001e;

            {
                this.f5001e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i9) {
                    case 0:
                        return new F(this.f5001e, 1);
                    case 1:
                        return new w(this.f5001e, 1);
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        return new p(this.f5001e, 1);
                    case g.INTEGER_FIELD_NUMBER /* 3 */:
                        return new C0297h(this.f5001e, 1);
                    default:
                        return new L(this.f5001e);
                }
            }
        });
        final int i10 = 3;
        this.f9770o = new n(new InterfaceC1162a(this) { // from class: R1.e

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ TutorialDatabase_Impl f5001e;

            {
                this.f5001e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i10) {
                    case 0:
                        return new F(this.f5001e, 1);
                    case 1:
                        return new w(this.f5001e, 1);
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        return new p(this.f5001e, 1);
                    case g.INTEGER_FIELD_NUMBER /* 3 */:
                        return new C0297h(this.f5001e, 1);
                    default:
                        return new L(this.f5001e);
                }
            }
        });
        final int i11 = 4;
        this.f9771p = new n(new InterfaceC1162a(this) { // from class: R1.e

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ TutorialDatabase_Impl f5001e;

            {
                this.f5001e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i11) {
                    case 0:
                        return new F(this.f5001e, 1);
                    case 1:
                        return new w(this.f5001e, 1);
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        return new p(this.f5001e, 1);
                    case g.INTEGER_FIELD_NUMBER /* 3 */:
                        return new C0297h(this.f5001e, 1);
                    default:
                        return new L(this.f5001e);
                }
            }
        });
    }

    @Override // u0.u
    public final List b(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(11, 12, 7));
        arrayList.add(new a(13, 14, 8));
        arrayList.add(new a(14, 15, 9));
        arrayList.add(new a(15, 16, 10));
        arrayList.add(new a(16, 17, 11));
        arrayList.add(new a(17, 18, 12));
        return arrayList;
    }

    @Override // u0.u
    public final C1617h c() {
        return new C1617h(this, new LinkedHashMap(), new LinkedHashMap(), "action_table", "event_table", "scenario_table", "condition_table", "intent_extra_table", "event_toggle_table", "tutorial_success_table", "scenario_usage_table");
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
        linkedHashMap.put(wVar.b(L.class), sVar);
        return linkedHashMap;
    }

    @Override // com.buzbuz.smartautoclicker.core.database.ScenarioDatabase
    public final C0297h o() {
        return (C0297h) this.f9770o.getValue();
    }

    @Override // com.buzbuz.smartautoclicker.core.database.ScenarioDatabase
    public final p p() {
        return (p) this.f9769n.getValue();
    }

    @Override // com.buzbuz.smartautoclicker.core.database.ScenarioDatabase
    public final w q() {
        return (w) this.f9768m.getValue();
    }

    @Override // com.buzbuz.smartautoclicker.core.database.ScenarioDatabase
    public final F r() {
        return (F) this.f9767l.getValue();
    }

    @Override // com.buzbuz.smartautoclicker.core.database.TutorialDatabase
    public final L s() {
        return (L) this.f9771p.getValue();
    }
}
