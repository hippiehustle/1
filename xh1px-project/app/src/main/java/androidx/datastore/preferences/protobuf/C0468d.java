package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0468d implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8666d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f8667e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f8668f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Iterable f8669g;

    public C0468d(C0471g c0471g) {
        this.f8669g = c0471g;
        this.f8668f = c0471g.size();
    }

    public byte a() {
        try {
            byte[] bArr = ((g7.t) this.f8669g).f11255e;
            int i4 = this.f8667e;
            this.f8667e = i4 + 1;
            return bArr[i4];
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw new NoSuchElementException(e9.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8666d) {
            case 0:
                if (this.f8667e < this.f8668f) {
                    return true;
                }
                return false;
            default:
                if (this.f8667e < this.f8668f) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8666d) {
            case 0:
                int i4 = this.f8667e;
                if (i4 < this.f8668f) {
                    this.f8667e = i4 + 1;
                    return Byte.valueOf(((C0471g) this.f8669g).l(i4));
                }
                throw new NoSuchElementException();
            default:
                return Byte.valueOf(a());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8666d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0468d(g7.t tVar) {
        this.f8669g = tVar;
        this.f8668f = tVar.f11255e.length;
    }
}
