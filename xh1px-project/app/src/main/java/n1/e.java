package n1;

/* loaded from: classes.dex */
public final class e extends AbstractC1151c {

    /* renamed from: a, reason: collision with root package name */
    public final String f12845a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12846b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12847c;

    public e(int i4, String str, String str2) {
        boolean z8;
        if ((i4 & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        str2 = (i4 & 4) != 0 ? null : str2;
        this.f12845a = str;
        this.f12846b = z8;
        this.f12847c = str2;
    }

    @Override // n1.i
    public final String a() {
        return this.f12845a;
    }

    @Override // n1.i
    public final String b() {
        return "INTEGER";
    }

    @Override // n1.i
    public final boolean c() {
        return this.f12846b;
    }

    @Override // n1.AbstractC1151c
    public final String d() {
        return this.f12847c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (o6.j.a(this.f12845a, eVar.f12845a) && this.f12846b == eVar.f12846b && o6.j.a(this.f12847c, eVar.f12847c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c6 = AbstractC1149a.c(this.f12845a.hashCode() * 31, 31, this.f12846b);
        String str = this.f12847c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c6 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Int(name=");
        sb.append(this.f12845a);
        sb.append(", isNotNull=");
        sb.append(this.f12846b);
        sb.append(", defaultValue=");
        return A.j.r(sb, this.f12847c, ")");
    }
}
