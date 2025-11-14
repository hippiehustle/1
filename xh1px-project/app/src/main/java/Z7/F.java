package Z7;

/* loaded from: classes.dex */
public final class F implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final F f7545a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final X f7546b = new X("kotlin.Int", X7.d.j);

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        return Integer.valueOf(bVar.t());
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        cVar.k(((Number) obj).intValue());
    }

    @Override // V7.a
    public final X7.f d() {
        return f7546b;
    }
}
