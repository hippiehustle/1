package L6;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public Y f3086a;

    /* renamed from: b, reason: collision with root package name */
    public String f3087b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u8 = (U) obj;
        if (o6.j.a(this.f3086a, u8.f3086a) && o6.j.a(this.f3087b, u8.f3087b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f3086a.hashCode() * 31;
        String str = this.f3087b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb.append(this.f3086a);
        sb.append(", typeFlexibilityId=");
        return A.j.q(sb, this.f3087b, ')');
    }
}
