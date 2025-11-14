package Z5;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Object f7485d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7486e;

    public j(Object obj, Object obj2) {
        this.f7485d = obj;
        this.f7486e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (o6.j.a(this.f7485d, jVar.f7485d) && o6.j.a(this.f7486e, jVar.f7486e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        Object obj = this.f7485d;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = hashCode * 31;
        Object obj2 = this.f7486e;
        if (obj2 != null) {
            i4 = obj2.hashCode();
        }
        return i8 + i4;
    }

    public final String toString() {
        return "(" + this.f7485d + ", " + this.f7486e + ')';
    }
}
