package Z7;

/* renamed from: Z7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385f implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0385f f7596a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final X f7597b = new X("kotlin.Boolean", X7.d.f7055e);

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        return Boolean.valueOf(bVar.e());
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        cVar.b(((Boolean) obj).booleanValue());
    }

    @Override // V7.a
    public final X7.f d() {
        return f7597b;
    }
}
