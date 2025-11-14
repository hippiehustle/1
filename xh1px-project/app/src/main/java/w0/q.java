package w0;

/* loaded from: classes.dex */
public final class q implements D0.c {

    /* renamed from: d, reason: collision with root package name */
    public final D0.c f15624d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f15626f;

    public q(x xVar, D0.c cVar) {
        o6.j.e(cVar, "delegate");
        this.f15626f = xVar;
        this.f15624d = cVar;
        this.f15625e = h4.g.h();
    }

    @Override // D0.c
    public final boolean H() {
        if (!this.f15626f.f15650d.get()) {
            if (this.f15625e == h4.g.h()) {
                return this.f15624d.H();
            }
            E2.b.M("Attempted to use statement on a different thread", 21);
            throw null;
        }
        E2.b.M("Statement is recycled", 21);
        throw null;
    }

    @Override // D0.c
    public final void b(int i4) {
        if (!this.f15626f.f15650d.get()) {
            if (this.f15625e == h4.g.h()) {
                this.f15624d.b(i4);
                return;
            } else {
                E2.b.M("Attempted to use statement on a different thread", 21);
                throw null;
            }
        }
        E2.b.M("Statement is recycled", 21);
        throw null;
    }

    @Override // D0.c
    public final void c(int i4, long j) {
        if (!this.f15626f.f15650d.get()) {
            if (this.f15625e == h4.g.h()) {
                this.f15624d.c(i4, j);
                return;
            } else {
                E2.b.M("Attempted to use statement on a different thread", 21);
                throw null;
            }
        }
        E2.b.M("Statement is recycled", 21);
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f15626f.f15650d.get()) {
            if (this.f15625e == h4.g.h()) {
                this.f15624d.close();
                return;
            } else {
                E2.b.M("Attempted to use statement on a different thread", 21);
                throw null;
            }
        }
        E2.b.M("Statement is recycled", 21);
        throw null;
    }

    @Override // D0.c
    public final int getColumnCount() {
        if (!this.f15626f.f15650d.get()) {
            if (this.f15625e == h4.g.h()) {
                return this.f15624d.getColumnCount();
            }
            E2.b.M("Attempted to use statement on a different thread", 21);
            throw null;
        }
        E2.b.M("Statement is recycled", 21);
        throw null;
    }

    @Override // D0.c
    public final String getColumnName(int i4) {
        if (!this.f15626f.f15650d.get()) {
            if (this.f15625e == h4.g.h()) {
                return this.f15624d.getColumnName(i4);
            }
            E2.b.M("Attempted to use statement on a different thread", 21);
            throw null;
        }
        E2.b.M("Statement is recycled", 21);
        throw null;
    }

    @Override // D0.c
    public final long getLong(int i4) {
        if (!this.f15626f.f15650d.get()) {
            if (this.f15625e == h4.g.h()) {
                return this.f15624d.getLong(i4);
            }
            E2.b.M("Attempted to use statement on a different thread", 21);
            throw null;
        }
        E2.b.M("Statement is recycled", 21);
        throw null;
    }

    @Override // D0.c
    public final boolean isNull(int i4) {
        if (!this.f15626f.f15650d.get()) {
            if (this.f15625e == h4.g.h()) {
                return this.f15624d.isNull(i4);
            }
            E2.b.M("Attempted to use statement on a different thread", 21);
            throw null;
        }
        E2.b.M("Statement is recycled", 21);
        throw null;
    }

    @Override // D0.c
    public final void k(String str, int i4) {
        o6.j.e(str, "value");
        if (!this.f15626f.f15650d.get()) {
            if (this.f15625e == h4.g.h()) {
                this.f15624d.k(str, i4);
                return;
            } else {
                E2.b.M("Attempted to use statement on a different thread", 21);
                throw null;
            }
        }
        E2.b.M("Statement is recycled", 21);
        throw null;
    }

    @Override // D0.c
    public final String l(int i4) {
        if (!this.f15626f.f15650d.get()) {
            if (this.f15625e == h4.g.h()) {
                return this.f15624d.l(i4);
            }
            E2.b.M("Attempted to use statement on a different thread", 21);
            throw null;
        }
        E2.b.M("Statement is recycled", 21);
        throw null;
    }

    @Override // D0.c
    public final void reset() {
        if (!this.f15626f.f15650d.get()) {
            if (this.f15625e == h4.g.h()) {
                this.f15624d.reset();
                return;
            } else {
                E2.b.M("Attempted to use statement on a different thread", 21);
                throw null;
            }
        }
        E2.b.M("Statement is recycled", 21);
        throw null;
    }
}
