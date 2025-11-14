package Z7;

/* renamed from: Z7.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0392m implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0392m f7617a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final X f7618b = new X("kotlin.Char", X7.d.f7057g);

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        return Character.valueOf(bVar.h());
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        cVar.e(((Character) obj).charValue());
    }

    @Override // V7.a
    public final X7.f d() {
        return f7618b;
    }
}
