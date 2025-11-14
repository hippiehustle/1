package Z7;

/* renamed from: Z7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0388i implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0388i f7606a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final X f7607b = new X("kotlin.Byte", X7.d.f7056f);

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        return Byte.valueOf(bVar.x());
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        cVar.d(((Number) obj).byteValue());
    }

    @Override // V7.a
    public final X7.f d() {
        return f7607b;
    }
}
