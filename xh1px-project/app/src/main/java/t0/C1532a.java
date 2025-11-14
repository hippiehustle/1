package t0;

import n1.AbstractC1149a;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1532a {

    /* renamed from: a, reason: collision with root package name */
    public int f14797a;

    /* renamed from: b, reason: collision with root package name */
    public int f14798b;

    /* renamed from: c, reason: collision with root package name */
    public int f14799c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1532a) {
                C1532a c1532a = (C1532a) obj;
                int i4 = this.f14797a;
                if (i4 == c1532a.f14797a) {
                    if (i4 != 8 || Math.abs(this.f14799c - this.f14798b) != 1 || this.f14799c != c1532a.f14798b || this.f14798b != c1532a.f14799c) {
                        if (this.f14799c == c1532a.f14799c && this.f14798b == c1532a.f14798b) {
                            return true;
                        }
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f14797a * 31) + this.f14798b) * 31) + this.f14799c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i4 = this.f14797a;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    if (i4 != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f14798b);
        sb.append("c:");
        return AbstractC1149a.h(sb, this.f14799c, ",p:null]");
    }
}
