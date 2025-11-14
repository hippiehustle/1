package a8;

/* loaded from: classes.dex */
public final class o extends y {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8293d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8294e;

    public o(String str, boolean z8) {
        o6.j.e(str, "body");
        this.f8293d = z8;
        this.f8294e = str.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o.class == obj.getClass()) {
                o oVar = (o) obj;
                if (this.f8293d == oVar.f8293d && o6.j.a(this.f8294e, oVar.f8294e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // a8.y
    public final String g() {
        return this.f8294e;
    }

    @Override // a8.y
    public final boolean h() {
        return this.f8293d;
    }

    public final int hashCode() {
        return this.f8294e.hashCode() + (Boolean.hashCode(this.f8293d) * 31);
    }

    @Override // a8.y
    public final String toString() {
        boolean z8 = this.f8293d;
        String str = this.f8294e;
        if (z8) {
            StringBuilder sb = new StringBuilder();
            b8.s.a(str, sb);
            return sb.toString();
        }
        return str;
    }
}
