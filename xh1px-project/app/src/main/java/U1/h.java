package U1;

import T1.EnumC0305d;
import a6.AbstractC0425A;
import a6.AbstractC0434i;
import a6.AbstractC0438m;
import b6.C0541i;
import g0.b0;
import h4.AbstractC0832f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import n1.AbstractC1151c;
import n1.C1150b;
import n1.C1152d;
import q4.X;
import y0.AbstractC1829a;

/* loaded from: classes.dex */
public final class h extends AbstractC1829a {

    /* renamed from: c, reason: collision with root package name */
    public static final h f6049c = new AbstractC1829a(12, 13);

    /* renamed from: d, reason: collision with root package name */
    public static final n1.e f6050d = new n1.e(6, "end_condition_operator", null);

    /* renamed from: e, reason: collision with root package name */
    public static final n1.h f6051e = new n1.h(6, "toggle_type", null);

    /* renamed from: f, reason: collision with root package name */
    public static final C1152d f6052f = new C1152d(5, 18, "action_id", "action_table");

    /* renamed from: g, reason: collision with root package name */
    public static final C1152d f6053g = new C1152d(5, 18, "toggle_event_id", "event_table");

    /* renamed from: h, reason: collision with root package name */
    public static final n1.f f6054h = new n1.f("toggle_event_id", 4);

    /* renamed from: i, reason: collision with root package name */
    public static final n1.h f6055i = new n1.h(4, "toggle_type", null);

    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, o6.t] */
    @Override // y0.AbstractC1829a
    public final void b(E0.a aVar) {
        o6.j.e(aVar, "db");
        R.g p8 = h2.a.p(aVar, "event_table");
        p8.g(new n1.h(2, "type", "IMAGE_EVENT"));
        R.g p9 = h2.a.p(aVar, "condition_table");
        Set l12 = AbstractC0434i.l1(new AbstractC1151c[]{new n1.h(4, "path", null), new n1.e(4, "area_left", null), new n1.e(4, "area_top", null), new n1.e(4, "area_right", null), new n1.e(4, "area_bottom", null), new n1.e(4, "threshold", null), new n1.e(4, "detection_type", null), new C1150b("shouldBeDetected", 4), new n1.e(4, "detection_area_left", null), new n1.e(4, "detection_area_top", null), new n1.e(4, "detection_area_right", null), new n1.e(4, "detection_area_bottom", null)});
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(l12, 10));
        Iterator it = l12.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC1151c) it.next()).a());
        }
        String str = ((String) p9.f4989g) + "_new";
        o6.j.e(str, "copyName");
        E0.a aVar2 = (E0.a) p9.f4987e;
        b0 l6 = h4.g.l(aVar2, (String) p9.f4989g, str, arrayList);
        R.g p10 = h2.a.p(aVar2, (String) l6.f10989f);
        p10.v((String) l6.f10988e);
        ArrayList arrayList2 = (ArrayList) l6.f10987d;
        Iterator it2 = AbstractC0425A.g0(AbstractC0434i.l1(new AbstractC1151c[]{new n1.h(2, "type", "ON_IMAGE_DETECTED"), new n1.h(4, "broadcast_action", null), new n1.h(4, "counter_name", null), new n1.h(4, "counter_comparison_operation", null), new n1.e(4, "counter_value", null), new n1.f("timer_value_ms", 4), new n1.f("timer_restart_when_reached", 4)}), l12).iterator();
        while (it2.hasNext()) {
            p10.g((AbstractC1151c) it2.next());
        }
        C0541i c0541i = new C0541i();
        ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(l12, 10));
        Iterator it3 = l12.iterator();
        while (it3.hasNext()) {
            arrayList3.add(h2.a.d(((AbstractC1151c) it3.next()).a()));
        }
        c0541i.addAll(arrayList3);
        c0541i.add(h2.a.d("id"));
        c0541i.add(h2.a.d("eventId"));
        c0541i.add(h2.a.d("name"));
        Z5.j[] jVarArr = (Z5.j[]) X.j(c0541i).toArray(new Z5.j[0]);
        p10.F("condition_table", null, (Z5.j[]) Arrays.copyOf(jVarArr, jVarArr.length));
        p9.r();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            p9.v((String) it4.next());
        }
        p10.i("condition_table");
        R.g p11 = h2.a.p(aVar, "event_toggle_table");
        C1152d c1152d = f6052f;
        C1152d c1152d2 = f6053g;
        p11.o(AbstractC0434i.l1(new n1.i[]{c1152d, f6051e, c1152d2}));
        p11.n(c1152d, null);
        p11.n(c1152d2, null);
        R.g p12 = h2.a.p(aVar, "action_table");
        Iterator it5 = AbstractC0434i.l1(new AbstractC1151c[]{new n1.h(4, "counter_name", null), new n1.h(4, "counter_operation", null), new n1.e(4, "counter_operation_value", null), new C1150b("toggle_all", 4), new n1.h(4, "toggle_all_type", null)}).iterator();
        while (it5.hasNext()) {
            p12.g((AbstractC1151c) it5.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e eVar = new e(new Object(), new LinkedHashMap(), p11, linkedHashSet, p12);
        String str2 = "WHERE `type` =\"" + EnumC0305d.f5586h + "\" ORDER BY `priority` ASC";
        n1.g gVar = new n1.g();
        n1.f fVar = new n1.f("eventId", 6);
        n1.f fVar2 = f6054h;
        n1.h hVar = f6055i;
        n1.k N8 = p12.N(str2, gVar, fVar, fVar2, hVar);
        try {
            N8.a(new b(eVar, gVar, fVar, fVar2, hVar));
            N8.close();
            if (!linkedHashSet.isEmpty()) {
                p12.v(I7.o.Q("\n            DELETE FROM `" + ((String) p12.f4989g) + "` \n            WHERE `id` IN (" + AbstractC0832f.l(linkedHashSet) + ")\n        "));
            }
            p12.h(AbstractC0434i.l1(new String[]{hVar.f12853a, fVar2.f12848a}));
            R.g p13 = h2.a.p(aVar, "scenario_table");
            R.g p14 = h2.a.p(aVar, "end_condition_table");
            f fVar3 = new f(p8, p12, p14, p9);
            String Q5 = I7.o.Q("\n                JOIN `end_condition_table` ON " + ((String) p13.f4989g) + ".id = end_condition_table.scenario_id\n                GROUP BY end_condition_table.scenario_id\n            ");
            n1.f fVar4 = new n1.f("end_condition_table.scenario_id", 6);
            n1.e eVar2 = f6050d;
            N8 = p13.N(Q5, fVar4, eVar2);
            try {
                N8.a(new c(fVar3, fVar4, eVar2));
                N8.close();
                p14.r();
                h2.a.p(aVar, "scenario_table").h(X.T(eVar2.f12845a));
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
