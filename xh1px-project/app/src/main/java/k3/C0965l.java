package k3;

import n1.AbstractC1149a;

/* renamed from: k3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0965l {

    /* renamed from: a, reason: collision with root package name */
    public final int f11998a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11999b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12000c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12001d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12002e;

    /* renamed from: f, reason: collision with root package name */
    public final p2.d f12003f;

    public C0965l(int i4, String str, String str2, String str3, boolean z8, p2.d dVar) {
        o6.j.e(str, "name");
        o6.j.e(dVar, "action");
        this.f11998a = i4;
        this.f11999b = str;
        this.f12000c = str2;
        this.f12001d = str3;
        this.f12002e = z8;
        this.f12003f = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0965l) {
                C0965l c0965l = (C0965l) obj;
                if (this.f11998a != c0965l.f11998a || !o6.j.a(this.f11999b, c0965l.f11999b) || !this.f12000c.equals(c0965l.f12000c) || !o6.j.a(this.f12001d, c0965l.f12001d) || this.f12002e != c0965l.f12002e || !o6.j.a(this.f12003f, c0965l.f12003f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int c6 = A.j.c(this.f12000c, A.j.c(this.f11999b, Integer.hashCode(this.f11998a) * 31, 31), 31);
        String str = this.f12001d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f12003f.hashCode() + AbstractC1149a.c((c6 + hashCode) * 31, 31, this.f12002e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DumbActionDetails(icon=");
        sb.append(this.f11998a);
        sb.append(", name=");
        sb.append(this.f11999b);
        sb.append(", detailsText=");
        AbstractC1149a.m(sb, this.f12000c, ", repeatCountText=", this.f12001d, ", haveError=");
        sb.append(this.f12002e);
        sb.append(", action=");
        sb.append(this.f12003f);
        sb.append(")");
        return sb.toString();
    }
}
