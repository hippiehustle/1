package S7;

import L7.AbstractC0160s;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: g, reason: collision with root package name */
    public static final e f5458g;

    /* JADX WARN: Type inference failed for: r0v0, types: [L7.s, S7.h, S7.e] */
    static {
        int i4 = k.f5466c;
        int i8 = k.f5467d;
        long j = k.f5468e;
        String str = k.f5464a;
        ?? abstractC0160s = new AbstractC0160s();
        abstractC0160s.f5460f = new c(i4, i8, j, str);
        f5458g = abstractC0160s;
    }

    @Override // L7.AbstractC0160s
    public final AbstractC0160s Q(int i4) {
        Q7.b.a(i4);
        if (i4 >= k.f5466c) {
            return this;
        }
        return super.Q(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // L7.AbstractC0160s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
