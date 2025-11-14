package F0;

import C6.C0024z;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c implements E0.a {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f1259e = new String[0];

    /* renamed from: f, reason: collision with root package name */
    public static final Object f1260f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f1261g;

    /* renamed from: d, reason: collision with root package name */
    public final SQLiteDatabase f1262d;

    static {
        B1.e eVar = new B1.e(1);
        Z5.h hVar = Z5.h.f7483e;
        f1260f = Z5.a.c(hVar, eVar);
        f1261g = Z5.a.c(hVar, new B1.e(2));
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        this.f1262d = sQLiteDatabase;
    }

    @Override // E0.a
    public final boolean A() {
        return this.f1262d.isWriteAheadLoggingEnabled();
    }

    @Override // E0.a
    public final void C() {
        this.f1262d.setTransactionSuccessful();
    }

    @Override // E0.a
    public final void E() {
        this.f1262d.beginTransactionNonExclusive();
    }

    @Override // E0.a
    public final Cursor K(String str) {
        o6.j.e(str, "query");
        return i(new C0024z(str, 1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1262d.close();
    }

    @Override // E0.a
    public final void f() {
        this.f1262d.endTransaction();
    }

    @Override // E0.a
    public final void g() {
        this.f1262d.beginTransaction();
    }

    @Override // E0.a
    public final Cursor i(E0.d dVar) {
        final a aVar = new a(0, dVar);
        Cursor rawQueryWithFactory = this.f1262d.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: F0.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) a.this.q(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, dVar.l(), f1259e, null);
        o6.j.d(rawQueryWithFactory, "rawQueryWithFactory(...)");
        return rawQueryWithFactory;
    }

    @Override // E0.a
    public final boolean isOpen() {
        return this.f1262d.isOpen();
    }

    @Override // E0.a
    public final void m(String str) {
        o6.j.e(str, "sql");
        this.f1262d.execSQL(str);
    }

    @Override // E0.a
    public final j q(String str) {
        o6.j.e(str, "sql");
        SQLiteStatement compileStatement = this.f1262d.compileStatement(str);
        o6.j.d(compileStatement, "compileStatement(...)");
        return new j(compileStatement);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, Z5.g] */
    @Override // E0.a
    public final void t() {
        ?? r12 = f1261g;
        if (((Method) r12.getValue()) != null) {
            ?? r22 = f1260f;
            if (((Method) r22.getValue()) != null) {
                Method method = (Method) r12.getValue();
                o6.j.b(method);
                Method method2 = (Method) r22.getValue();
                o6.j.b(method2);
                Object invoke = method2.invoke(this.f1262d, null);
                if (invoke != null) {
                    method.invoke(invoke, 0, null, 0, null);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        g();
    }

    @Override // E0.a
    public final boolean w() {
        return this.f1262d.inTransaction();
    }

    @Override // E0.a
    public final long x(String str, ContentValues contentValues) {
        o6.j.e(str, "table");
        return this.f1262d.insertWithOnConflict(str, null, contentValues, 3);
    }
}
