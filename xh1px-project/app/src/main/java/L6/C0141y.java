package L6;

/* renamed from: L6.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141y extends K {

    /* renamed from: a, reason: collision with root package name */
    public final String f3169a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3170b;

    public C0141y(String str, String str2) {
        o6.j.e(str, "enumClassName");
        o6.j.e(str2, "enumEntryName");
        this.f3169a = str;
        this.f3170b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0141y)) {
            return false;
        }
        C0141y c0141y = (C0141y) obj;
        if (o6.j.a(this.f3169a, c0141y.f3169a) && o6.j.a(this.f3170b, c0141y.f3170b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3170b.hashCode() + (this.f3169a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnumValue(");
        sb.append(this.f3169a);
        sb.append('.');
        return A.j.q(sb, this.f3170b, ')');
    }
}
