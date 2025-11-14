package E0;

import F0.j;
import android.content.ContentValues;
import android.database.Cursor;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface a extends Closeable {
    boolean A();

    void C();

    void E();

    Cursor K(String str);

    void f();

    void g();

    Cursor i(d dVar);

    boolean isOpen();

    void m(String str);

    j q(String str);

    void t();

    boolean w();

    long x(String str, ContentValues contentValues);
}
