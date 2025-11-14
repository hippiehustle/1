package d8;

import a.AbstractC0405a;

/* loaded from: classes.dex */
public final class g implements m {

    /* renamed from: d, reason: collision with root package name */
    public final b f10534d;

    /* renamed from: e, reason: collision with root package name */
    public final a f10535e;

    /* renamed from: f, reason: collision with root package name */
    public j f10536f;

    /* renamed from: g, reason: collision with root package name */
    public int f10537g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10538h;

    /* renamed from: i, reason: collision with root package name */
    public long f10539i;

    public g(b bVar) {
        int i4;
        this.f10534d = bVar;
        a u8 = bVar.u();
        this.f10535e = u8;
        j jVar = u8.f10524d;
        this.f10536f = jVar;
        if (jVar != null) {
            i4 = jVar.f10545b;
        } else {
            i4 = -1;
        }
        this.f10537g = i4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10538h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r12 == r0.f10545b) goto L13;
     */
    @Override // d8.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(a aVar, long j) {
        j jVar;
        o6.j.e(aVar, "sink");
        if (!this.f10538h) {
            j jVar2 = this.f10536f;
            a aVar2 = this.f10535e;
            if (jVar2 != null) {
                j jVar3 = aVar2.f10524d;
                if (jVar2 == jVar3) {
                    int i4 = this.f10537g;
                    o6.j.b(jVar3);
                }
                throw new IllegalStateException("Peek source is invalid because upstream source was used");
            }
            if (!this.f10534d.o(this.f10539i + 1)) {
                return -1L;
            }
            if (this.f10536f == null && (jVar = aVar2.f10524d) != null) {
                this.f10536f = jVar;
                this.f10537g = jVar.f10545b;
            }
            long min = Math.min(8192L, aVar2.f10525e - this.f10539i);
            long j5 = this.f10539i;
            AbstractC0405a.m(aVar2.f10525e, j5, min);
            if (min != 0) {
                aVar.f10525e += min;
                j jVar4 = aVar2.f10524d;
                while (true) {
                    o6.j.b(jVar4);
                    long j8 = jVar4.f10546c - jVar4.f10545b;
                    if (j5 < j8) {
                        break;
                    }
                    j5 -= j8;
                    jVar4 = jVar4.f10549f;
                }
                long j9 = min;
                while (j9 > 0) {
                    o6.j.b(jVar4);
                    j c6 = jVar4.c();
                    int i8 = c6.f10545b + ((int) j5);
                    c6.f10545b = i8;
                    c6.f10546c = Math.min(i8 + ((int) j9), c6.f10546c);
                    j jVar5 = aVar.f10524d;
                    if (jVar5 == null) {
                        c6.f10550g = c6;
                        c6.f10549f = c6;
                        aVar.f10524d = c6;
                    } else {
                        j jVar6 = jVar5.f10550g;
                        o6.j.b(jVar6);
                        jVar6.b(c6);
                    }
                    j9 -= c6.f10546c - c6.f10545b;
                    jVar4 = jVar4.f10549f;
                    j5 = 0;
                }
            }
            this.f10539i += min;
            return min;
        }
        throw new IllegalStateException("closed");
    }
}
