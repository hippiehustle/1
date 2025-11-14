package g7;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;

/* renamed from: g7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0792a extends FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public int f11216d;

    public C0792a(ByteArrayInputStream byteArrayInputStream, int i4) {
        super(byteArrayInputStream);
        this.f11216d = i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f11216d);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f11216d <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.f11216d--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = super.skip(Math.min(j, this.f11216d));
        if (skip >= 0) {
            this.f11216d = (int) (this.f11216d - skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i4, int i8) {
        int i9 = this.f11216d;
        if (i9 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i4, Math.min(i8, i9));
        if (read >= 0) {
            this.f11216d -= read;
        }
        return read;
    }
}
