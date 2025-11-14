package o2;

import F4.r;
import i.AbstractC0863b;
import m2.l;
import n2.h;
import o6.j;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1229a {

    /* renamed from: a, reason: collision with root package name */
    public final l f13440a;

    /* renamed from: b, reason: collision with root package name */
    public final r f13441b;

    public C1229a(l lVar) {
        j.e(lVar, "dumbScenarioDataSource");
        this.f13440a = lVar;
        this.f13441b = lVar.f12412c;
    }

    public final W5.a a(long j) {
        n2.j jVar = this.f13440a.f12410a;
        return new W5.a(17, AbstractC0863b.c(jVar.f12901a, true, new String[]{"dumb_action_table", "dumb_scenario_stats_table", "dumb_scenario_table"}, new h(j, jVar, 1)));
    }
}
