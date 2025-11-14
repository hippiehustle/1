package F0;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
public class i implements E0.c {

    /* renamed from: d, reason: collision with root package name */
    public final SQLiteProgram f1284d;

    public i(SQLiteProgram sQLiteProgram) {
        o6.j.e(sQLiteProgram, "delegate");
        this.f1284d = sQLiteProgram;
    }

    @Override // E0.c
    public final void F(int i4, byte[] bArr) {
        this.f1284d.bindBlob(i4, bArr);
    }

    @Override // E0.c
    public final void G(String str, int i4) {
        o6.j.e(str, "value");
        this.f1284d.bindString(i4, str);
    }

    @Override // E0.c
    public final void b(int i4) {
        this.f1284d.bindNull(i4);
    }

    @Override // E0.c
    public final void c(int i4, long j) {
        this.f1284d.bindLong(i4, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1284d.close();
    }

    @Override // E0.c
    public final void r(int i4, double d2) {
        this.f1284d.bindDouble(i4, d2);
    }
}
