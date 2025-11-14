package F0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import u0.r;
import x0.C1772a;

/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {
    public static final /* synthetic */ int j = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Context f1273d;

    /* renamed from: e, reason: collision with root package name */
    public final W0.d f1274e;

    /* renamed from: f, reason: collision with root package name */
    public final M.i f1275f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1276g;

    /* renamed from: h, reason: collision with root package name */
    public final G0.a f1277h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1278i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final W0.d dVar, final M.i iVar) {
        super(context, str, null, iVar.f3287d, new DatabaseErrorHandler() { // from class: F0.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i4 = g.j;
                o6.j.b(sQLiteDatabase);
                c u8 = D2.f.u(dVar, sQLiteDatabase);
                M.i.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + u8 + ".path");
                SQLiteDatabase sQLiteDatabase2 = u8.f1262d;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        M.i.d(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                o6.j.d(obj, "second");
                                M.i.d((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                M.i.d(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    u8.close();
                } catch (IOException unused2) {
                }
            }
        });
        String str2;
        o6.j.e(context, "context");
        o6.j.e(iVar, "callback");
        this.f1273d = context;
        this.f1274e = dVar;
        this.f1275f = iVar;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            o6.j.d(str2, "toString(...)");
        } else {
            str2 = str;
        }
        this.f1277h = new G0.a(str2, context.getCacheDir(), false);
    }

    public final E0.a a(boolean z8) {
        boolean z9;
        G0.a aVar = this.f1277h;
        try {
            if (!this.f1278i && getDatabaseName() != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            aVar.a(z9);
            this.f1276g = false;
            SQLiteDatabase d2 = d(z8);
            if (this.f1276g) {
                close();
                E0.a a3 = a(z8);
                aVar.b();
                return a3;
            }
            c u8 = D2.f.u(this.f1274e, d2);
            aVar.b();
            return u8;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        G0.a aVar = this.f1277h;
        try {
            aVar.a(aVar.f1689a);
            super.close();
            this.f1274e.f6489e = null;
            this.f1278i = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase d(boolean z8) {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z9 = this.f1278i;
        if (databaseName != null && !z9 && (parentFile = this.f1273d.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z8) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                o6.j.b(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            o6.j.b(readableDatabase2);
            return readableDatabase2;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z8) {
                    readableDatabase = getWritableDatabase();
                    o6.j.b(readableDatabase);
                } else {
                    readableDatabase = getReadableDatabase();
                    o6.j.b(readableDatabase);
                }
                return readableDatabase;
            } catch (Throwable th) {
                th = th;
                if (th instanceof e) {
                    e eVar = (e) th;
                    int ordinal = eVar.f1265d.ordinal();
                    th = eVar.f1266e;
                    if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
                        if (ordinal == 4) {
                            if (!(th instanceof SQLiteException)) {
                                throw th;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        o6.j.e(sQLiteDatabase, "db");
        boolean z8 = this.f1276g;
        M.i iVar = this.f1275f;
        if (!z8 && iVar.f3287d != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            D2.f.u(this.f1274e, sQLiteDatabase);
            iVar.getClass();
        } catch (Throwable th) {
            throw new e(f.f1267d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        o6.j.e(sQLiteDatabase, "sqLiteDatabase");
        try {
            ((r) this.f1275f.f3288e).d(new C1772a(D2.f.u(this.f1274e, sQLiteDatabase)));
        } catch (Throwable th) {
            throw new e(f.f1268e, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i8) {
        o6.j.e(sQLiteDatabase, "db");
        this.f1276g = true;
        try {
            this.f1275f.f(D2.f.u(this.f1274e, sQLiteDatabase), i4, i8);
        } catch (Throwable th) {
            throw new e(f.f1270g, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        o6.j.e(sQLiteDatabase, "db");
        if (!this.f1276g) {
            try {
                M.i iVar = this.f1275f;
                c u8 = D2.f.u(this.f1274e, sQLiteDatabase);
                r rVar = (r) iVar.f3288e;
                rVar.f(new C1772a(u8));
                rVar.f15257g = u8;
            } catch (Throwable th) {
                throw new e(f.f1271h, th);
            }
        }
        this.f1278i = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i8) {
        o6.j.e(sQLiteDatabase, "sqLiteDatabase");
        this.f1276g = true;
        try {
            this.f1275f.f(D2.f.u(this.f1274e, sQLiteDatabase), i4, i8);
        } catch (Throwable th) {
            throw new e(f.f1269f, th);
        }
    }
}
