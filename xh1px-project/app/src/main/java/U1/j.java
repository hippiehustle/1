package U1;

import a6.AbstractC0434i;
import n1.C1152d;
import y0.AbstractC1829a;

/* loaded from: classes.dex */
public final class j extends AbstractC1829a {

    /* renamed from: c, reason: collision with root package name */
    public static final j f6059c = new AbstractC1829a(3, 4);

    /* renamed from: d, reason: collision with root package name */
    public static final C1152d f6060d = new C1152d(5, 18, "scenario_id", "scenario_table");

    /* renamed from: e, reason: collision with root package name */
    public static final C1152d f6061e = new C1152d(5, 18, "eventId", "event_table");

    @Override // y0.AbstractC1829a
    public final void b(E0.a aVar) {
        o6.j.e(aVar, "db");
        R.g p8 = h2.a.p(aVar, "event_table");
        n1.h hVar = new n1.h(6, "name", null);
        n1.e eVar = new n1.e(6, "operator", null);
        n1.e eVar2 = new n1.e(6, "priority", null);
        n1.e eVar3 = new n1.e(4, "stop_after", null);
        C1152d c1152d = f6060d;
        p8.o(AbstractC0434i.l1(new n1.i[]{c1152d, hVar, eVar, eVar2, eVar3}));
        R.g p9 = h2.a.p(aVar, "action_table");
        n1.e eVar4 = new n1.e(6, "priority", null);
        n1.h hVar2 = new n1.h(6, "name", null);
        n1.h hVar3 = new n1.h(6, "type", null);
        n1.e eVar5 = new n1.e(4, "x", null);
        n1.e eVar6 = new n1.e(4, "y", null);
        n1.f fVar = new n1.f("pressDuration", 4);
        n1.e eVar7 = new n1.e(4, "fromX", null);
        n1.e eVar8 = new n1.e(4, "fromY", null);
        n1.e eVar9 = new n1.e(4, "toX", null);
        n1.e eVar10 = new n1.e(4, "toY", null);
        n1.f fVar2 = new n1.f("swipeDuration", 4);
        n1.f fVar3 = new n1.f("pauseDuration", 4);
        C1152d c1152d2 = f6061e;
        p9.o(AbstractC0434i.l1(new n1.i[]{c1152d2, eVar4, hVar2, hVar3, eVar5, eVar6, fVar, eVar7, eVar8, eVar9, eVar10, fVar2, fVar3}));
        R.g p10 = h2.a.p(aVar, "condition_table_new");
        p10.o(AbstractC0434i.l1(new n1.i[]{c1152d2, new n1.h(6, "path", null), new n1.e(6, "area_left", null), new n1.e(6, "area_top", null), new n1.e(6, "area_right", null), new n1.e(6, "area_bottom", null), new n1.e(2, "threshold", "1")}));
        p8.n(c1152d, null);
        p9.n(c1152d2, null);
        p10.n(c1152d2, "index_condition_table_eventId");
        p8.F("click_table", null, new Z5.j("id", "clickId"), new Z5.j("scenario_id", "scenario_id"), new Z5.j("name", "name"), new Z5.j("operator", "operator"), new Z5.j("priority", "priority"), new Z5.j("stop_after", "stop_after"));
        p10.F("condition_table", "INNER JOIN ClickConditionCrossRef on ClickConditionCrossRef.path = condition_table.path", new Z5.j("eventId", "ClickConditionCrossRef.clickId"), new Z5.j("path", "ClickConditionCrossRef.path"), h2.a.d("area_left"), h2.a.d("area_top"), h2.a.d("area_right"), h2.a.d("area_bottom"), h2.a.d("threshold"));
        p9.F("click_table", "WHERE click_table.type = 1", new Z5.j("eventId", "clickId"), new Z5.j("priority", "0"), new Z5.j("name", "name"), new Z5.j("type", "\"CLICK\""), new Z5.j("x", "from_x"), new Z5.j("y", "from_y"), new Z5.j("pressDuration", "1"));
        p9.F("click_table", "WHERE click_table.type = 2", new Z5.j("eventId", "clickId"), new Z5.j("priority", "0"), new Z5.j("name", "name"), new Z5.j("type", "\"SWIPE\""), new Z5.j("fromX", "from_x"), new Z5.j("fromY", "from_y"), new Z5.j("toX", "to_x"), new Z5.j("toY", "to_y"), new Z5.j("swipeDuration", "175"));
        p9.F("click_table", null, new Z5.j("eventId", "clickId"), new Z5.j("priority", "1"), new Z5.j("name", "\"Pause\""), new Z5.j("type", "\"PAUSE\""), new Z5.j("pauseDuration", "delay_after"));
        h2.a.p(aVar, "click_table").r();
        h2.a.p(aVar, "condition_table").r();
        h2.a.p(aVar, "ClickConditionCrossRef").r();
        p10.i("condition_table");
    }
}
