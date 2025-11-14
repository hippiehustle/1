package a8;

import Z7.C0382c;
import java.util.List;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class f implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f8287a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final e f8288b = e.f8284b;

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        AbstractC1492c.c(bVar);
        return new d((List) new C0382c(l.f8290a).i(bVar));
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        d dVar = (d) obj;
        o6.j.e(dVar, "value");
        AbstractC1492c.a(cVar);
        new C0382c(l.f8290a).c(cVar, dVar);
    }

    @Override // V7.a
    public final X7.f d() {
        return f8288b;
    }
}
