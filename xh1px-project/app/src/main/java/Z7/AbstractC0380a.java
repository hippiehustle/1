package Z7;

import java.util.Iterator;

/* renamed from: Z7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0380a implements V7.a {
    @Override // V7.a
    public Object a(Y7.b bVar) {
        return i(bVar);
    }

    public abstract Object e();

    public abstract int f(Object obj);

    public abstract Iterator g(Object obj);

    public abstract int h(Object obj);

    public final Object i(Y7.b bVar) {
        Object e9 = e();
        int f8 = f(e9);
        Y7.a j = bVar.j(d());
        while (true) {
            int n3 = j.n(d());
            if (n3 != -1) {
                j(j, n3 + f8, e9);
            } else {
                j.g(d());
                return l(e9);
            }
        }
    }

    public abstract void j(Y7.a aVar, int i4, Object obj);

    public abstract Object k(Object obj);

    public abstract Object l(Object obj);
}
