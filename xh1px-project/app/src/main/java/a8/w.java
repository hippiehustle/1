package a8;

import Z7.H;
import Z7.d0;
import java.util.Map;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class w implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final w f8303a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final v f8304b = v.f8300b;

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        AbstractC1492c.c(bVar);
        d0 d0Var = d0.f7591a;
        l lVar = l.f8290a;
        return new u((Map) new H().i(bVar));
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        u uVar = (u) obj;
        o6.j.e(uVar, "value");
        AbstractC1492c.a(cVar);
        d0 d0Var = d0.f7591a;
        l lVar = l.f8290a;
        new H().c(cVar, uVar);
    }

    @Override // V7.a
    public final X7.f d() {
        return f8304b;
    }
}
