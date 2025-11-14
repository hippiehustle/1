package a8;

import a.AbstractC0405a;
import n1.AbstractC1149a;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class z implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final z f8305a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final X7.g f8306b = AbstractC0405a.f("kotlinx.serialization.json.JsonPrimitive", X7.d.f7061m, new X7.f[0]);

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        j s8 = AbstractC1492c.c(bVar).s();
        if (s8 instanceof y) {
            return (y) s8;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw b8.j.d(-1, AbstractC1149a.i(o6.v.f13643a, s8.getClass(), sb), s8.toString());
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        y yVar = (y) obj;
        o6.j.e(yVar, "value");
        AbstractC1492c.a(cVar);
        if (yVar instanceof r) {
            cVar.r(s.f8297a, r.INSTANCE);
        } else {
            cVar.r(p.f8295a, (o) yVar);
        }
    }

    @Override // V7.a
    public final X7.f d() {
        return f8306b;
    }
}
