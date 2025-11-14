package w7;

import x7.C1824f;

/* loaded from: classes.dex */
public abstract class M {
    public abstract X a();

    public abstract AbstractC1759v b();

    public abstract boolean c();

    public abstract M d(C1824f c1824f);

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof M) {
                M m6 = (M) obj;
                if (c() != m6.c() || a() != m6.a() || !b().equals(m6.b())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = a().hashCode();
        if (U.l(b())) {
            return (hashCode2 * 31) + 19;
        }
        int i4 = hashCode2 * 31;
        if (c()) {
            hashCode = 17;
        } else {
            hashCode = b().hashCode();
        }
        return i4 + hashCode;
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == X.INVARIANT) {
            return b().toString();
        }
        return a() + " " + b();
    }
}
