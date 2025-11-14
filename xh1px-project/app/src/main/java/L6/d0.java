package L6;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3128a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3129b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3130c;

    public d0(int i4, int i8, int i9) {
        this.f3128a = i4;
        this.f3129b = i8;
        this.f3130c = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f3128a == d0Var.f3128a && this.f3129b == d0Var.f3129b && this.f3130c == d0Var.f3130c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3130c) + AbstractC1149a.b(this.f3129b, Integer.hashCode(this.f3128a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3128a);
        sb.append('.');
        sb.append(this.f3129b);
        sb.append('.');
        sb.append(this.f3130c);
        return sb.toString();
    }
}
