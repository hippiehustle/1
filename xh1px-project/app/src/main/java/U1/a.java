package U1;

import T1.EnumC0307f;
import Z5.y;
import android.content.ContentValues;
import n1.AbstractC1149a;
import n1.C1150b;
import n6.InterfaceC1165d;
import o6.u;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1165d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ R.g f6016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R.g f6017e;

    public /* synthetic */ a(R.g gVar, R.g gVar2) {
        this.f6016d = gVar;
        this.f6017e = gVar2;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, o6.u] */
    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        long longValue = ((Long) obj).longValue();
        long longValue2 = ((Long) obj2).longValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        d dVar = d.f6028c;
        R.g gVar = this.f6016d;
        if (booleanValue) {
            ?? obj4 = new Object();
            n1.g gVar2 = d.f6031f;
            C1150b c1150b = d.f6032g;
            n1.k N8 = this.f6017e.N("WHERE `eventId` = " + longValue2 + " AND `shouldBeDetected` = 1", gVar2, c1150b);
            try {
                N8.a(new c(gVar2, c1150b, (u) obj4));
                N8.close();
                Long l6 = (Long) obj4.f13642d;
                String f8 = AbstractC1149a.f("WHERE `id` = ", longValue);
                ContentValues contentValues = new ContentValues();
                contentValues.put(d.f6035l.f12841a, l6);
                gVar.S(f8, contentValues);
                d.c(gVar, longValue, EnumC0307f.f5595e);
            } finally {
            }
        } else {
            d.c(gVar, longValue, EnumC0307f.f5594d);
        }
        return y.f7506a;
    }
}
