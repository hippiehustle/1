package B7;

import o6.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f525a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f526b;

    public a(Object obj, Object obj2) {
        this.f525a = obj;
        this.f526b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.f525a, aVar.f525a) && j.a(this.f526b, aVar.f526b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        Object obj = this.f525a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = hashCode * 31;
        Object obj2 = this.f526b;
        if (obj2 != null) {
            i4 = obj2.hashCode();
        }
        return i8 + i4;
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f525a + ", upper=" + this.f526b + ')';
    }
}
