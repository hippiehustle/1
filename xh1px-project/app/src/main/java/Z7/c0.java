package Z7;

/* loaded from: classes.dex */
public final class c0 implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f7587a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final X f7588b = new X("kotlin.Short", X7.d.f7060l);

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        return Short.valueOf(bVar.z());
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        cVar.s(((Number) obj).shortValue());
    }

    @Override // V7.a
    public final X7.f d() {
        return f7588b;
    }
}
