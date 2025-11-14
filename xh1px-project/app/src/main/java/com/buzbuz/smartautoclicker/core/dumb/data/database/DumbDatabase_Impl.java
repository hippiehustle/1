package com.buzbuz.smartautoclicker.core.dumb.data.database;

import B0.e;
import R1.a;
import R1.d;
import Z.g;
import Z5.n;
import a6.s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import n2.j;
import o6.v;
import u0.C1617h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/buzbuz/smartautoclicker/core/dumb/data/database/DumbDatabase_Impl;", "Lcom/buzbuz/smartautoclicker/core/dumb/data/database/DumbDatabase;", "<init>", "()V", "dumb_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DumbDatabase_Impl extends DumbDatabase {

    /* renamed from: l, reason: collision with root package name */
    public final n f9777l = new n(new e(23, this));

    @Override // u0.u
    public final List b(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(1, 2, 13));
        return arrayList;
    }

    @Override // u0.u
    public final C1617h c() {
        return new C1617h(this, new LinkedHashMap(), new LinkedHashMap(), "dumb_scenario_table", "dumb_action_table", "dumb_scenario_stats_table");
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
        linkedHashMap.put(v.f13643a.b(j.class), s.f7766d);
        return linkedHashMap;
    }

    @Override // com.buzbuz.smartautoclicker.core.dumb.data.database.DumbDatabase
    public final j o() {
        return (j) this.f9777l.getValue();
    }
}
