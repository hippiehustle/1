package U1;

import Z5.y;
import android.content.ContentValues;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import n1.AbstractC1149a;
import n6.InterfaceC1166e;
import o6.t;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC1166e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f6037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f6038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ R.g f6039f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f6040g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ R.g f6041h;

    public /* synthetic */ e(t tVar, LinkedHashMap linkedHashMap, R.g gVar, LinkedHashSet linkedHashSet, R.g gVar2) {
        this.f6037d = tVar;
        this.f6038e = linkedHashMap;
        this.f6039f = gVar;
        this.f6040g = linkedHashSet;
        this.f6041h = gVar2;
    }

    @Override // n6.InterfaceC1166e
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        Long l6 = (Long) obj;
        long longValue = l6.longValue();
        Long l8 = (Long) obj2;
        l8.getClass();
        Long l9 = (Long) obj3;
        l9.getClass();
        String str = (String) obj4;
        o6.j.e(str, "toggleType");
        LinkedHashMap linkedHashMap = this.f6038e;
        Object obj5 = linkedHashMap.get(l8);
        if (obj5 == null) {
            String f8 = AbstractC1149a.f("WHERE `id` = ", longValue);
            ContentValues contentValues = new ContentValues();
            contentValues.put("toggle_all", "0");
            this.f6041h.S(f8, contentValues);
            linkedHashMap.put(l8, l6);
            obj5 = l6;
        }
        long longValue2 = ((Number) obj5).longValue();
        t tVar = this.f6037d;
        tVar.f13641d = longValue2;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(h.f6052f.f12841a, Long.valueOf(tVar.f13641d));
        contentValues2.put(h.f6051e.f12853a, str);
        contentValues2.put(h.f6053g.f12841a, l9);
        this.f6039f.G(contentValues2);
        if (longValue != tVar.f13641d) {
            this.f6040g.add(l6);
        }
        return y.f7506a;
    }
}
