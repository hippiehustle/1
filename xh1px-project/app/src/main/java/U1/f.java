package U1;

import Z5.y;
import android.content.ContentValues;
import n1.AbstractC1149a;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC1164c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ R.g f6042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R.g f6043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ R.g f6044f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ R.g f6045g;

    public /* synthetic */ f(R.g gVar, R.g gVar2, R.g gVar3, R.g gVar4) {
        this.f6042d = gVar;
        this.f6043e = gVar2;
        this.f6044f = gVar3;
        this.f6045g = gVar4;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        Long l6 = (Long) obj;
        long longValue = l6.longValue();
        int intValue = ((Integer) obj2).intValue();
        ContentValues contentValues = new ContentValues();
        contentValues.put("scenario_id", l6);
        contentValues.put("name", "Stop scenario");
        contentValues.put("type", "TRIGGER_EVENT");
        contentValues.put("operator", String.valueOf(intValue));
        contentValues.put("priority", "-1");
        contentValues.put("enabled_on_start", "1");
        long G8 = this.f6042d.G(contentValues);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("eventId", Long.valueOf(G8));
        contentValues2.put("priority", (Integer) 0);
        contentValues2.put("name", "Stop scenario");
        contentValues2.put("type", "TOGGLE_EVENT");
        contentValues2.put("toggle_all", "1");
        contentValues2.put("toggle_all_type", "DISABLE");
        R.g gVar = this.f6043e;
        gVar.G(contentValues2);
        g gVar2 = new g(gVar, this.f6045g, G8);
        String f8 = AbstractC1149a.f("WHERE `scenario_id` = ", longValue);
        n1.f fVar = new n1.f("event_id", 6);
        n1.e eVar = new n1.e(6, "executions", null);
        n1.k N8 = this.f6044f.N(f8, fVar, eVar);
        try {
            N8.a(new c(gVar2, fVar, eVar, 2));
            N8.close();
            return y.f7506a;
        } finally {
        }
    }
}
