package y0;

import o6.j;
import x0.C1772a;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1829a {

    /* renamed from: a, reason: collision with root package name */
    public final int f16457a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16458b;

    public AbstractC1829a(int i4, int i8) {
        this.f16457a = i4;
        this.f16458b = i8;
    }

    public void a(D0.a aVar) {
        j.e(aVar, "connection");
        if (aVar instanceof C1772a) {
            b(((C1772a) aVar).f16079d);
            return;
        }
        throw new Error("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }

    public void b(E0.a aVar) {
        j.e(aVar, "db");
        throw new Error("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
