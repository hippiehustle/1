package k7;

import C6.A;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12144a;

    public g(Object obj) {
        this.f12144a = obj;
    }

    public abstract AbstractC1759v a(A a3);

    public Object b() {
        return this.f12144a;
    }

    public final boolean equals(Object obj) {
        g gVar;
        if (this != obj) {
            Object b4 = b();
            Object obj2 = null;
            if (obj instanceof g) {
                gVar = (g) obj;
            } else {
                gVar = null;
            }
            if (gVar != null) {
                obj2 = gVar.b();
            }
            if (!o6.j.a(b4, obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        Object b4 = b();
        if (b4 != null) {
            return b4.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
