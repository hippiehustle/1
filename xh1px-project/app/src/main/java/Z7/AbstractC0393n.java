package Z7;

import java.util.Iterator;

/* renamed from: Z7.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0393n extends AbstractC0380a {

    /* renamed from: a, reason: collision with root package name */
    public final V7.a f7621a;

    public AbstractC0393n(V7.a aVar) {
        this.f7621a = aVar;
    }

    @Override // V7.a
    public void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        int h8 = h(obj);
        X7.f d2 = d();
        o6.j.e(d2, "descriptor");
        kotlinx.serialization.json.internal.c a3 = cVar.a(d2);
        Iterator g8 = g(obj);
        for (int i4 = 0; i4 < h8; i4++) {
            a3.q(d(), i4, this.f7621a, g8.next());
        }
        a3.v(d2);
    }

    @Override // Z7.AbstractC0380a
    public void j(Y7.a aVar, int i4, Object obj) {
        m(obj, i4, aVar.p(d(), i4, this.f7621a, null));
    }

    public abstract void m(Object obj, int i4, Object obj2);
}
