package x3;

import o6.j;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1784a {

    /* renamed from: a, reason: collision with root package name */
    public final int f16112a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16113b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16114c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f16115d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f16116e;

    public C1784a(int i4, String str, String str2, Long l6, Boolean bool) {
        this.f16112a = i4;
        this.f16113b = str;
        this.f16114c = str2;
        this.f16115d = l6;
        this.f16116e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1784a)) {
            return false;
        }
        C1784a c1784a = (C1784a) obj;
        if (this.f16112a == c1784a.f16112a && j.a(this.f16113b, c1784a.f16113b) && j.a(this.f16114c, c1784a.f16114c) && j.a(this.f16115d, c1784a.f16115d) && j.a(this.f16116e, c1784a.f16116e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int c6 = A.j.c(this.f16113b, Integer.hashCode(this.f16112a) * 31, 31);
        int i4 = 0;
        String str = this.f16114c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (c6 + hashCode) * 31;
        Long l6 = this.f16115d;
        if (l6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l6.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        Boolean bool = this.f16116e;
        if (bool != null) {
            i4 = bool.hashCode();
        }
        return i9 + i4;
    }

    public final String toString() {
        return "QSTileDisplayInfo(tileState=" + this.f16112a + ", tileTitle=" + this.f16113b + ", tileSubTitle=" + this.f16114c + ", scenarioId=" + this.f16115d + ", isSmart=" + this.f16116e + ")";
    }
}
