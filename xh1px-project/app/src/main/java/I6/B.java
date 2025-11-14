package I6;

import f7.C0723c;
import java.lang.reflect.Type;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class B implements W6.d {
    @Override // W6.b
    public C0066e a(C0723c c0723c) {
        Object obj;
        o6.j.e(c0723c, "fqName");
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o6.j.a(AbstractC0065d.a(h2.a.k(h2.a.g(((C0066e) obj).f2196a))).a(), c0723c)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C0066e) obj;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        if ((obj instanceof B) && o6.j.a(b(), ((B) obj).b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
