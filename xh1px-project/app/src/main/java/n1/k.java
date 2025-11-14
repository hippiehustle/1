package n1;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import b6.C0538f;
import java.util.Iterator;
import java.util.List;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class k implements Cursor {

    /* renamed from: d, reason: collision with root package name */
    public final Cursor f12857d;

    /* renamed from: e, reason: collision with root package name */
    public final C0538f f12858e;

    public k(Cursor cursor, List list) {
        o6.j.e(cursor, "cursor");
        this.f12857d = cursor;
        C0538f c0538f = new C0538f();
        if (cursor.getCount() != 0) {
            moveToFirst();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                int columnIndex = this.f12857d.getColumnIndex(iVar.a());
                if (columnIndex >= 0) {
                    c0538f.put(iVar.a(), new Z5.j(iVar, Integer.valueOf(columnIndex)));
                } else {
                    throw new IllegalStateException(A.j.o("Can't find column ", iVar.a()));
                }
            }
        }
        this.f12858e = c0538f.c();
    }

    public final void a(InterfaceC1163b interfaceC1163b) {
        Cursor cursor = this.f12857d;
        if (!cursor.isClosed() && cursor.getCount() != 0) {
            moveToFirst();
            do {
                interfaceC1163b.m(new j(this));
            } while (cursor.moveToNext());
        }
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12857d.close();
    }

    @Override // android.database.Cursor
    public final void copyStringToBuffer(int i4, CharArrayBuffer charArrayBuffer) {
        this.f12857d.copyStringToBuffer(i4, charArrayBuffer);
    }

    @Override // android.database.Cursor
    public final void deactivate() {
        this.f12857d.deactivate();
    }

    @Override // android.database.Cursor
    public final byte[] getBlob(int i4) {
        return this.f12857d.getBlob(i4);
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        return this.f12857d.getColumnCount();
    }

    @Override // android.database.Cursor
    public final int getColumnIndex(String str) {
        return this.f12857d.getColumnIndex(str);
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        return this.f12857d.getColumnIndexOrThrow(str);
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i4) {
        return this.f12857d.getColumnName(i4);
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        return this.f12857d.getColumnNames();
    }

    @Override // android.database.Cursor
    public final int getCount() {
        return this.f12857d.getCount();
    }

    @Override // android.database.Cursor
    public final double getDouble(int i4) {
        return this.f12857d.getDouble(i4);
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        return this.f12857d.getExtras();
    }

    @Override // android.database.Cursor
    public final float getFloat(int i4) {
        return this.f12857d.getFloat(i4);
    }

    @Override // android.database.Cursor
    public final int getInt(int i4) {
        return this.f12857d.getInt(i4);
    }

    @Override // android.database.Cursor
    public final long getLong(int i4) {
        return this.f12857d.getLong(i4);
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        return this.f12857d.getNotificationUri();
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.f12857d.getPosition();
    }

    @Override // android.database.Cursor
    public final short getShort(int i4) {
        return this.f12857d.getShort(i4);
    }

    @Override // android.database.Cursor
    public final String getString(int i4) {
        return this.f12857d.getString(i4);
    }

    @Override // android.database.Cursor
    public final int getType(int i4) {
        return this.f12857d.getType(i4);
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return this.f12857d.getWantsAllOnMoveCalls();
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return this.f12857d.isAfterLast();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return this.f12857d.isBeforeFirst();
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return this.f12857d.isClosed();
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.f12857d.isFirst();
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        return this.f12857d.isLast();
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i4) {
        return this.f12857d.isNull(i4);
    }

    @Override // android.database.Cursor
    public final boolean move(int i4) {
        return this.f12857d.move(i4);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return this.f12857d.moveToFirst();
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return this.f12857d.moveToLast();
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return this.f12857d.moveToNext();
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i4) {
        return this.f12857d.moveToPosition(i4);
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return this.f12857d.moveToPrevious();
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
        this.f12857d.registerContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f12857d.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public final boolean requery() {
        return this.f12857d.requery();
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        return this.f12857d.respond(bundle);
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
        this.f12857d.setExtras(bundle);
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        this.f12857d.setNotificationUri(contentResolver, uri);
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
        this.f12857d.unregisterContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f12857d.unregisterDataSetObserver(dataSetObserver);
    }
}
