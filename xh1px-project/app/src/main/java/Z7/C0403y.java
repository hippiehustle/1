package Z7;

/* renamed from: Z7.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403y implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0403y f7653a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final X f7654b = new X("kotlin.Float", X7.d.f7059i);

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        return Float.valueOf(bVar.C());
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        cVar.h(((Number) obj).floatValue());
    }

    @Override // V7.a
    public final X7.f d() {
        return f7654b;
    }
}
