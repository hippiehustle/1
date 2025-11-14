package X;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class e0 extends OutputStream {

    /* renamed from: d, reason: collision with root package name */
    public final FileOutputStream f6725d;

    public e0(FileOutputStream fileOutputStream) {
        this.f6725d = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f6725d.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i4) {
        this.f6725d.write(i4);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        o6.j.e(bArr, "b");
        this.f6725d.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i4, int i8) {
        o6.j.e(bArr, "bytes");
        this.f6725d.write(bArr, i4, i8);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
