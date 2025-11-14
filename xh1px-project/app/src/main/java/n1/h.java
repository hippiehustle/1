package n1;

/* loaded from: classes.dex */
public final class h extends AbstractC1151c {

    /* renamed from: a, reason: collision with root package name */
    public final String f12853a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12854b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12855c;

    public h(int i4, String str, String str2) {
        boolean z8;
        if ((i4 & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        str2 = (i4 & 4) != 0 ? null : str2;
        this.f12853a = str;
        this.f12854b = z8;
        this.f12855c = str2;
    }

    @Override // n1.i
    public final String a() {
        return this.f12853a;
    }

    @Override // n1.i
    public final String b() {
        return "TEXT";
    }

    @Override // n1.i
    public final boolean c() {
        return this.f12854b;
    }

    @Override // n1.AbstractC1151c
    public final String d() {
        return this.f12855c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (o6.j.a(this.f12853a, hVar.f12853a) && this.f12854b == hVar.f12854b && o6.j.a(this.f12855c, hVar.f12855c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c6 = AbstractC1149a.c(this.f12853a.hashCode() * 31, 31, this.f12854b);
        String str = this.f12855c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c6 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(name=");
        sb.append(this.f12853a);
        sb.append(", isNotNull=");
        sb.append(this.f12854b);
        sb.append(", defaultValue=");
        return A.j.r(sb, this.f12855c, ")");
    }
}
