package H6;

import I7.v;
import o6.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2037a;

    /* renamed from: b, reason: collision with root package name */
    public final Z6.b f2038b;

    public b(Class cls, Z6.b bVar) {
        this.f2037a = cls;
        this.f2038b = bVar;
    }

    public final String a() {
        return v.Y(this.f2037a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (j.a(this.f2037a, ((b) obj).f2037a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2037a.hashCode();
    }

    public final String toString() {
        return b.class.getName() + ": " + this.f2037a;
    }
}
