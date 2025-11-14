package x0;

import android.database.Cursor;
import g0.L;
import java.util.Arrays;
import o6.j;

/* renamed from: x0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1776e extends AbstractC1778g {

    /* renamed from: g, reason: collision with root package name */
    public int[] f16085g;

    /* renamed from: h, reason: collision with root package name */
    public long[] f16086h;

    /* renamed from: i, reason: collision with root package name */
    public double[] f16087i;
    public String[] j;
    public byte[][] k;

    /* renamed from: l, reason: collision with root package name */
    public Cursor f16088l;

    public static void j(Cursor cursor, int i4) {
        if (i4 >= 0 && i4 < cursor.getColumnCount()) {
            return;
        }
        E2.b.M("column index out of range", 25);
        throw null;
    }

    @Override // D0.c
    public final boolean H() {
        a();
        e();
        Cursor cursor = this.f16088l;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // D0.c
    public final void b(int i4) {
        a();
        d(5, i4);
        this.f16085g[i4] = 5;
    }

    @Override // D0.c
    public final void c(int i4, long j) {
        a();
        d(1, i4);
        this.f16085g[i4] = 1;
        this.f16086h[i4] = j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f16092f) {
            a();
            this.f16085g = new int[0];
            this.f16086h = new long[0];
            this.f16087i = new double[0];
            this.j = new String[0];
            this.k = new byte[0];
            reset();
        }
        this.f16092f = true;
    }

    public final void d(int i4, int i8) {
        int i9 = i8 + 1;
        int[] iArr = this.f16085g;
        if (iArr.length < i9) {
            int[] copyOf = Arrays.copyOf(iArr, i9);
            j.d(copyOf, "copyOf(...)");
            this.f16085g = copyOf;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        byte[][] bArr = this.k;
                        if (bArr.length < i9) {
                            Object[] copyOf2 = Arrays.copyOf(bArr, i9);
                            j.d(copyOf2, "copyOf(...)");
                            this.k = (byte[][]) copyOf2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                String[] strArr = this.j;
                if (strArr.length < i9) {
                    Object[] copyOf3 = Arrays.copyOf(strArr, i9);
                    j.d(copyOf3, "copyOf(...)");
                    this.j = (String[]) copyOf3;
                    return;
                }
                return;
            }
            double[] dArr = this.f16087i;
            if (dArr.length < i9) {
                double[] copyOf4 = Arrays.copyOf(dArr, i9);
                j.d(copyOf4, "copyOf(...)");
                this.f16087i = copyOf4;
                return;
            }
            return;
        }
        long[] jArr = this.f16086h;
        if (jArr.length < i9) {
            long[] copyOf5 = Arrays.copyOf(jArr, i9);
            j.d(copyOf5, "copyOf(...)");
            this.f16086h = copyOf5;
        }
    }

    public final void e() {
        if (this.f16088l == null) {
            this.f16088l = this.f16090d.i(new L(23, this));
        }
    }

    @Override // D0.c
    public final int getColumnCount() {
        a();
        e();
        Cursor cursor = this.f16088l;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // D0.c
    public final String getColumnName(int i4) {
        a();
        e();
        Cursor cursor = this.f16088l;
        if (cursor != null) {
            j(cursor, i4);
            String columnName = cursor.getColumnName(i4);
            j.d(columnName, "getColumnName(...)");
            return columnName;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // D0.c
    public final long getLong(int i4) {
        a();
        Cursor cursor = this.f16088l;
        if (cursor != null) {
            j(cursor, i4);
            return cursor.getLong(i4);
        }
        E2.b.M("no row", 21);
        throw null;
    }

    @Override // D0.c
    public final boolean isNull(int i4) {
        a();
        Cursor cursor = this.f16088l;
        if (cursor != null) {
            j(cursor, i4);
            return cursor.isNull(i4);
        }
        E2.b.M("no row", 21);
        throw null;
    }

    @Override // D0.c
    public final void k(String str, int i4) {
        j.e(str, "value");
        a();
        d(3, i4);
        this.f16085g[i4] = 3;
        this.j[i4] = str;
    }

    @Override // D0.c
    public final String l(int i4) {
        a();
        Cursor cursor = this.f16088l;
        if (cursor != null) {
            j(cursor, i4);
            String string = cursor.getString(i4);
            j.d(string, "getString(...)");
            return string;
        }
        E2.b.M("no row", 21);
        throw null;
    }

    @Override // D0.c
    public final void reset() {
        a();
        Cursor cursor = this.f16088l;
        if (cursor != null) {
            cursor.close();
        }
        this.f16088l = null;
    }
}
