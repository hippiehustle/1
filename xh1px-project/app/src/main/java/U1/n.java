package U1;

import a6.AbstractC0434i;
import n1.C1152d;
import y0.AbstractC1829a;

/* loaded from: classes.dex */
public final class n extends AbstractC1829a {

    /* renamed from: c, reason: collision with root package name */
    public static final n f6074c = new AbstractC1829a(6, 7);

    /* renamed from: d, reason: collision with root package name */
    public static final C1152d f6075d = new C1152d(5, 18, "scenario_id", "scenario_table");

    /* renamed from: e, reason: collision with root package name */
    public static final C1152d f6076e = new C1152d(5, 18, "event_id", "event_table");

    @Override // y0.AbstractC1829a
    public final void b(E0.a aVar) {
        o6.j.e(aVar, "db");
        R.g p8 = h2.a.p(aVar, "end_condition_table");
        n1.e eVar = new n1.e(6, "executions", null);
        C1152d c1152d = f6075d;
        C1152d c1152d2 = f6076e;
        p8.o(AbstractC0434i.l1(new n1.i[]{c1152d, c1152d2, eVar}));
        p8.n(c1152d, null);
        p8.n(c1152d2, null);
        p8.F("event_table", "WHERE `stop_after` IS NOT NULL", h2.a.d("scenario_id"), new Z5.j("event_id", "id"), new Z5.j("executions", "stop_after"));
        R.g p9 = h2.a.p(aVar, "scenario_table");
        p9.g(new n1.e(2, "detection_quality", "600"));
        p9.g(new n1.e(2, "end_condition_operator", "2"));
    }
}
