package d8;

import a.AbstractC0405a;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class h extends InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f10540d;

    public h(i iVar) {
        this.f10540d = iVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        i iVar = this.f10540d;
        if (!iVar.f10543f) {
            return (int) Math.min(iVar.f10542e.f10525e, Integer.MAX_VALUE);
        }
        throw new IOException("closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10540d.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        i iVar = this.f10540d;
        a aVar = iVar.f10542e;
        if (iVar.f10543f) {
            throw new IOException("closed");
        }
        if (aVar.f10525e == 0 && iVar.f10541d.h(aVar, 8192L) == -1) {
            return -1;
        }
        return aVar.d() & 255;
    }

    public final String toString() {
        return this.f10540d + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i8) {
        o6.j.e(bArr, "data");
        i iVar = this.f10540d;
        a aVar = iVar.f10542e;
        if (!iVar.f10543f) {
            AbstractC0405a.m(bArr.length, i4, i8);
            if (aVar.f10525e == 0 && iVar.f10541d.h(aVar, 8192L) == -1) {
                return -1;
            }
            return aVar.read(bArr, i4, i8);
        }
        throw new IOException("closed");
    }
}
