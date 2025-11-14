package Z7;

/* loaded from: classes.dex */
public final class L implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final L f7554a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final X f7555b = new X("kotlin.Long", X7.d.k);

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        return Long.valueOf(bVar.a());
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        cVar.m(((Number) obj).longValue());
    }

    @Override // V7.a
    public final X7.f d() {
        return f7555b;
    }
}
