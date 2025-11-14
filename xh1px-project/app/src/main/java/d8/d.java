package d8;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import t7.C1594d;

/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: d, reason: collision with root package name */
    public final InputStream f10530d;

    public d(InputStream inputStream, C1594d c1594d) {
        o6.j.e(inputStream, "input");
        this.f10530d = inputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10530d.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r8 != false) goto L27;
     */
    @Override // d8.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(a aVar, long j) {
        boolean z8;
        o6.j.e(aVar, "sink");
        boolean z9 = true;
        try {
            if (!Thread.currentThread().isInterrupted()) {
                j y4 = aVar.y(1);
                int read = this.f10530d.read(y4.f10544a, y4.f10546c, (int) Math.min(8192L, 8192 - y4.f10546c));
                if (read == -1) {
                    if (y4.f10545b == y4.f10546c) {
                        aVar.f10524d = y4.a();
                        k.a(y4);
                        return -1L;
                    }
                    return -1L;
                }
                y4.f10546c += read;
                long j5 = read;
                aVar.f10525e += j5;
                return j5;
            }
            throw new InterruptedIOException("interrupted");
        } catch (AssertionError e9) {
            int i4 = e.f10531a;
            if (e9.getCause() != null) {
                String message = e9.getMessage();
                if (message != null) {
                    z8 = I7.m.b0(message, "getsockname failed", false);
                } else {
                    z8 = false;
                }
            }
            z9 = false;
            if (z9) {
                throw new IOException(e9);
            }
            throw e9;
        }
    }

    public final String toString() {
        return "source(" + this.f10530d + ')';
    }
}
