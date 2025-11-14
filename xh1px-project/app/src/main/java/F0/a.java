package F0;

import T1.EnumC0305d;
import U1.o;
import Z5.y;
import android.content.ContentValues;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import n1.AbstractC1149a;
import n6.InterfaceC1166e;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1166e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1257e;

    public /* synthetic */ a(int i4, Object obj) {
        this.f1256d = i4;
        this.f1257e = obj;
    }

    @Override // n6.InterfaceC1166e
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f1256d) {
            case 0:
                E0.d dVar = (E0.d) this.f1257e;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                o6.j.b(sQLiteQuery);
                dVar.P(new i(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            default:
                R.g gVar = (R.g) this.f1257e;
                long longValue = ((Long) obj).longValue();
                String str = (String) obj2;
                long longValue2 = ((Long) obj3).longValue();
                long longValue3 = ((Long) obj4).longValue();
                o6.j.e(str, "type");
                int ordinal = EnumC0305d.valueOf(str).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        long min = Math.min(longValue3, 59999L);
                        String f8 = AbstractC1149a.f("WHERE `id` = ", longValue);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(o.f6081g.f12848a, Long.valueOf(min));
                        gVar.S(f8, contentValues);
                    } else {
                        throw new IllegalArgumentException("It should be a click or a swipe");
                    }
                } else {
                    long min2 = Math.min(longValue2, 59999L);
                    String f9 = AbstractC1149a.f("WHERE `id` = ", longValue);
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(o.f6080f.f12848a, Long.valueOf(min2));
                    gVar.S(f9, contentValues2);
                }
                return y.f7506a;
        }
    }
}
