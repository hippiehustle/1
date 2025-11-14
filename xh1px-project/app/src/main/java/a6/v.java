package a6;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f7769a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7770b;

    public v(int i4, Object obj) {
        this.f7769a = i4;
        this.f7770b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f7769a == vVar.f7769a && o6.j.a(this.f7770b, vVar.f7770b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f7769a) * 31;
        Object obj = this.f7770b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f7769a + ", value=" + this.f7770b + ')';
    }
}
