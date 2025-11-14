package U1;

import Z5.y;
import android.content.ContentValues;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC1164c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ R.g f6046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R.g f6047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f6048f;

    public /* synthetic */ g(R.g gVar, R.g gVar2, long j) {
        this.f6046d = gVar;
        this.f6047e = gVar2;
        this.f6048f = j;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        Long l6 = (Long) obj;
        long longValue = l6.longValue();
        Integer num = (Integer) obj2;
        num.intValue();
        String str = "\"Stop Scenario " + longValue + "\"";
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventId", l6);
        contentValues.put("priority", (Integer) 10000);
        contentValues.put("name", "Execution count");
        contentValues.put("type", "CHANGE_COUNTER");
        contentValues.put("counter_name", str);
        contentValues.put("counter_operation", "ADD");
        contentValues.put("counter_operation_value", (Integer) 1);
        this.f6046d.G(contentValues);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("eventId", Long.valueOf(this.f6048f));
        contentValues2.put("name", str);
        contentValues2.put("type", "ON_COUNTER_REACHED");
        contentValues2.put("counter_name", str);
        contentValues2.put("counter_comparison_operation", "GREATER_OR_EQUALS");
        contentValues2.put("counter_value", num);
        this.f6047e.G(contentValues2);
        return y.f7506a;
    }
}
