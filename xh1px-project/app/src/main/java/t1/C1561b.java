package t1;

import n1.AbstractC1149a;
import o6.j;

/* renamed from: t1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1561b {

    /* renamed from: a, reason: collision with root package name */
    public final long f15042a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15043b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15044c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15045d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15046e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15047f;

    public C1561b(long j, long j5, String str, String str2, String str3, int i4) {
        j.e(str2, "message");
        j.e(str3, "groupName");
        this.f15042a = j;
        this.f15043b = j5;
        this.f15044c = str;
        this.f15045d = str2;
        this.f15046e = str3;
        this.f15047f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1561b)) {
            return false;
        }
        C1561b c1561b = (C1561b) obj;
        if (this.f15042a == c1561b.f15042a && this.f15043b == c1561b.f15043b && j.a(this.f15044c, c1561b.f15044c) && j.a(this.f15045d, c1561b.f15045d) && j.a(this.f15046e, c1561b.f15046e) && this.f15047f == c1561b.f15047f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15047f) + A.j.c(this.f15046e, A.j.c(this.f15045d, A.j.c(this.f15044c, AbstractC1149a.d(this.f15043b, Long.hashCode(this.f15042a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNotificationRequest(actionId=");
        sb.append(this.f15042a);
        sb.append(", eventId=");
        sb.append(this.f15043b);
        sb.append(", title=");
        sb.append(this.f15044c);
        AbstractC1149a.m(sb, ", message=", this.f15045d, ", groupName=", this.f15046e);
        sb.append(", importance=");
        sb.append(this.f15047f);
        sb.append(")");
        return sb.toString();
    }
}
