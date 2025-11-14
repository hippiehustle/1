package Z7;

/* renamed from: Z7.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396q implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0396q f7630a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final X f7631b = new X("kotlin.Double", X7.d.f7058h);

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        return Double.valueOf(bVar.E());
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        cVar.f(((Number) obj).doubleValue());
    }

    @Override // V7.a
    public final X7.f d() {
        return f7631b;
    }
}
