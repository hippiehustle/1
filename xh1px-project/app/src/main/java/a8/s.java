package a8;

import a.AbstractC0405a;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class s implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final s f8297a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final X7.g f8298b = AbstractC0405a.f("kotlinx.serialization.json.JsonNull", X7.h.f7072f, new X7.f[0]);

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        AbstractC1492c.c(bVar);
        if (!bVar.f()) {
            return r.INSTANCE;
        }
        throw new IllegalArgumentException("Expected 'null' literal");
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        o6.j.e((r) obj, "value");
        AbstractC1492c.a(cVar);
        cVar.o();
    }

    @Override // V7.a
    public final X7.f d() {
        return f8298b;
    }
}
