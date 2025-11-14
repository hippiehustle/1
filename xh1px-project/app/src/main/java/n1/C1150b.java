package n1;

/* renamed from: n1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1150b extends AbstractC1151c {

    /* renamed from: a, reason: collision with root package name */
    public final String f12838a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12839b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12840c;

    public C1150b(String str, int i4) {
        boolean z8;
        String str2;
        if ((i4 & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((i4 & 4) != 0) {
            str2 = null;
        } else {
            str2 = "1";
        }
        this.f12838a = str;
        this.f12839b = z8;
        this.f12840c = str2;
    }

    @Override // n1.i
    public final String a() {
        return this.f12838a;
    }

    @Override // n1.i
    public final String b() {
        return "INTEGER";
    }

    @Override // n1.i
    public final boolean c() {
        return this.f12839b;
    }

    @Override // n1.AbstractC1151c
    public final String d() {
        return this.f12840c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1150b)) {
            return false;
        }
        C1150b c1150b = (C1150b) obj;
        if (o6.j.a(this.f12838a, c1150b.f12838a) && this.f12839b == c1150b.f12839b && o6.j.a(this.f12840c, c1150b.f12840c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c6 = AbstractC1149a.c(this.f12838a.hashCode() * 31, 31, this.f12839b);
        String str = this.f12840c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c6 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Boolean(name=");
        sb.append(this.f12838a);
        sb.append(", isNotNull=");
        sb.append(this.f12839b);
        sb.append(", defaultValue=");
        return A.j.r(sb, this.f12840c, ")");
    }
}
