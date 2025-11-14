package Z7;

/* loaded from: classes.dex */
public final class P implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7561a = Z5.a.c(Z5.h.f7482d, new B1.e(this));

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        X7.f d2 = d();
        Y7.a j = bVar.j(d2);
        int n3 = j.n(d());
        if (n3 == -1) {
            j.g(d2);
            return Z5.y.f7506a;
        }
        throw new IllegalArgumentException(A.j.l("Unexpected index ", n3));
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        o6.j.e(obj, "value");
        cVar.a(d()).v(d());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // V7.a
    public final X7.f d() {
        return (X7.f) this.f7561a.getValue();
    }
}
