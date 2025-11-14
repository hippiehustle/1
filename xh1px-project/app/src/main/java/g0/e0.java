package g0;

import java.io.Writer;

/* loaded from: classes.dex */
public final class e0 extends Writer {

    /* renamed from: d, reason: collision with root package name */
    public final StringBuilder f11015d = new StringBuilder(128);

    public final void a() {
        StringBuilder sb = this.f11015d;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i4, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c6 = cArr[i4 + i9];
            if (c6 == '\n') {
                a();
            } else {
                this.f11015d.append(c6);
            }
        }
    }
}
