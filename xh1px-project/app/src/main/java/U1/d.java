package U1;

import T1.EnumC0305d;
import T1.EnumC0307f;
import a6.AbstractC0434i;
import android.content.ContentValues;
import n1.AbstractC1149a;
import n1.C1150b;
import n1.C1152d;
import y0.AbstractC1829a;

/* loaded from: classes.dex */
public final class d extends AbstractC1829a {

    /* renamed from: c, reason: collision with root package name */
    public static final d f6028c = new AbstractC1829a(10, 11);

    /* renamed from: d, reason: collision with root package name */
    public static final n1.g f6029d = new n1.g();

    /* renamed from: e, reason: collision with root package name */
    public static final n1.e f6030e = new n1.e(6, "detection_quality", null);

    /* renamed from: f, reason: collision with root package name */
    public static final n1.g f6031f = new n1.g();

    /* renamed from: g, reason: collision with root package name */
    public static final C1150b f6032g = new C1150b("shouldBeDetected", 6);

    /* renamed from: h, reason: collision with root package name */
    public static final n1.g f6033h = new n1.g();

    /* renamed from: i, reason: collision with root package name */
    public static final C1152d f6034i = new C1152d(5, 18, "eventId", "event_table");
    public static final n1.h j = new n1.h(6, "type", null);
    public static final C1150b k = new C1150b("clickOnCondition", 6);

    /* renamed from: l, reason: collision with root package name */
    public static final C1152d f6035l = new C1152d(3, 16, "clickOnConditionId", "condition_table");

    /* renamed from: m, reason: collision with root package name */
    public static final C1152d f6036m = new C1152d(3, 16, "toggle_event_id", "event_table");

    public static void c(R.g gVar, long j5, EnumC0307f enumC0307f) {
        String f8 = AbstractC1149a.f("WHERE `id` = ", j5);
        ContentValues contentValues = new ContentValues();
        contentValues.put("clickPositionType", "\"" + enumC0307f.name() + "\"");
        gVar.S(f8, contentValues);
    }

    @Override // y0.AbstractC1829a
    public final void b(E0.a aVar) {
        o6.j.e(aVar, "db");
        R.g p8 = h2.a.p(aVar, "scenario_table");
        C1.b bVar = new C1.b(7, p8);
        n1.g gVar = f6029d;
        n1.e eVar = f6030e;
        n1.k N8 = p8.N(null, gVar, eVar);
        try {
            N8.a(new c(bVar, gVar, eVar, 0));
            N8.close();
            R.g p9 = h2.a.p(aVar, "condition_table");
            R.g p10 = h2.a.p(aVar, "action_table");
            R.g p11 = h2.a.p(aVar, "temp_action_table");
            n1.e eVar2 = new n1.e(6, "priority", null);
            n1.h hVar = new n1.h(6, "name", null);
            n1.h hVar2 = new n1.h(6, "type", null);
            n1.h hVar3 = new n1.h(4, "clickPositionType", null);
            n1.e eVar3 = new n1.e(4, "x", null);
            n1.e eVar4 = new n1.e(4, "y", null);
            n1.f fVar = new n1.f("pressDuration", 4);
            n1.e eVar5 = new n1.e(4, "fromX", null);
            n1.e eVar6 = new n1.e(4, "fromY", null);
            n1.e eVar7 = new n1.e(4, "toX", null);
            n1.e eVar8 = new n1.e(4, "toY", null);
            n1.f fVar2 = new n1.f("swipeDuration", 4);
            n1.f fVar3 = new n1.f("pauseDuration", 4);
            C1150b c1150b = new C1150b("isAdvanced", 4);
            C1150b c1150b2 = new C1150b("isBroadcast", 4);
            n1.h hVar4 = new n1.h(4, "intent_action", null);
            n1.h hVar5 = new n1.h(4, "component_name", null);
            n1.e eVar9 = new n1.e(4, "flags", null);
            n1.h hVar6 = new n1.h(4, "toggle_type", null);
            C1152d c1152d = f6034i;
            C1152d c1152d2 = f6035l;
            C1152d c1152d3 = f6036m;
            p11.o(AbstractC0434i.l1(new n1.i[]{c1152d, eVar2, hVar, hVar2, hVar3, eVar3, eVar4, c1152d2, fVar, eVar5, eVar6, eVar7, eVar8, fVar2, fVar3, c1150b, c1150b2, hVar4, hVar5, eVar9, c1152d3, hVar6}));
            p11.F("action_table", null, h2.a.d("`id`"), h2.a.d("`eventId`"), h2.a.d("`priority`"), h2.a.d("`name`"), h2.a.d("`type`"), new Z5.j("`clickPositionType`", "NULL"), h2.a.d("`x`"), h2.a.d("`y`"), new Z5.j("`clickOnConditionId`", "NULL"), h2.a.d("`pressDuration`"), h2.a.d("`fromX`"), h2.a.d("`fromY`"), h2.a.d("`toX`"), h2.a.d("`toY`"), h2.a.d("`swipeDuration`"), h2.a.d("`pauseDuration`"), h2.a.d("`isAdvanced`"), h2.a.d("`isBroadcast`"), h2.a.d("`intent_action`"), h2.a.d("`component_name`"), h2.a.d("`flags`"), h2.a.d("`toggle_event_id`"), h2.a.d("`toggle_type`"));
            a aVar2 = new a(p11, p9);
            String str = "WHERE `type` = \"" + EnumC0305d.f5582d + "\"";
            n1.g gVar2 = f6033h;
            n1.h hVar7 = j;
            C1150b c1150b3 = k;
            N8 = p10.N(str, gVar2, c1152d, hVar7, c1150b3);
            try {
                N8.a(new b(gVar2, c1152d, hVar7, c1150b3, aVar2));
                N8.close();
                p10.r();
                p11.n(c1152d, "index_action_table_eventId");
                p11.n(c1152d3, "index_action_table_toggle_event_id");
                p11.n(c1152d2, "index_action_table_clickOnConditionId");
                p11.i("action_table");
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
