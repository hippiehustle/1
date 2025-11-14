package Z5;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class o implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Object f7494d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7495e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f7496f;

    public o(Object obj, Object obj2, Object obj3) {
        this.f7494d = obj;
        this.f7495e = obj2;
        this.f7496f = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (o6.j.a(this.f7494d, oVar.f7494d) && o6.j.a(this.f7495e, oVar.f7495e) && o6.j.a(this.f7496f, oVar.f7496f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i4 = 0;
        Object obj = this.f7494d;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = hashCode * 31;
        Object obj2 = this.f7495e;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        Object obj3 = this.f7496f;
        if (obj3 != null) {
            i4 = obj3.hashCode();
        }
        return i9 + i4;
    }

    public final String toString() {
        return "(" + this.f7494d + ", " + this.f7495e + ", " + this.f7496f + ')';
    }
}
