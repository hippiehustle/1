package Z5;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class k implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f7487d;

    public k(Throwable th) {
        o6.j.e(th, "exception");
        this.f7487d = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (o6.j.a(this.f7487d, ((k) obj).f7487d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7487d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f7487d + ')';
    }
}
