package x0;

import F0.j;

/* renamed from: x0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1777f extends AbstractC1778g {

    /* renamed from: g, reason: collision with root package name */
    public final j f16089g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1777f(E0.a aVar, String str) {
        super(aVar, str);
        o6.j.e(aVar, "db");
        o6.j.e(str, "sql");
        this.f16089g = aVar.q(str);
    }

    @Override // D0.c
    public final boolean H() {
        a();
        this.f16089g.f1285e.execute();
        return false;
    }

    @Override // D0.c
    public final void b(int i4) {
        a();
        this.f16089g.b(i4);
    }

    @Override // D0.c
    public final void c(int i4, long j) {
        a();
        this.f16089g.c(i4, j);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f16089g.close();
        this.f16092f = true;
    }

    @Override // D0.c
    public final int getColumnCount() {
        a();
        return 0;
    }

    @Override // D0.c
    public final String getColumnName(int i4) {
        a();
        E2.b.M("no row", 21);
        throw null;
    }

    @Override // D0.c
    public final long getLong(int i4) {
        a();
        E2.b.M("no row", 21);
        throw null;
    }

    @Override // D0.c
    public final boolean isNull(int i4) {
        a();
        E2.b.M("no row", 21);
        throw null;
    }

    @Override // D0.c
    public final void k(String str, int i4) {
        o6.j.e(str, "value");
        a();
        this.f16089g.G(str, i4);
    }

    @Override // D0.c
    public final String l(int i4) {
        a();
        E2.b.M("no row", 21);
        throw null;
    }

    @Override // D0.c
    public final void reset() {
    }
}
