package T1;

import Z7.Q;
import m1.InterfaceC1052b;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class F implements InterfaceC1052b {
    public static final E Companion = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final Z5.g[] f5511f = {null, null, Z5.a.c(Z5.h.f7482d, new B1.e(20)), null, null};

    /* renamed from: a, reason: collision with root package name */
    public final long f5512a;

    /* renamed from: b, reason: collision with root package name */
    public long f5513b;

    /* renamed from: c, reason: collision with root package name */
    public final G f5514c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5515d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5516e;

    public /* synthetic */ F(int i4, long j, long j5, G g8, String str, String str2) {
        if (31 != (i4 & 31)) {
            Q.f(i4, 31, D.f5510a.d());
            throw null;
        }
        this.f5512a = j;
        this.f5513b = j5;
        this.f5514c = g8;
        this.f5515d = str;
        this.f5516e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f8 = (F) obj;
        if (this.f5512a == f8.f5512a && this.f5513b == f8.f5513b && this.f5514c == f8.f5514c && o6.j.a(this.f5515d, f8.f5515d) && o6.j.a(this.f5516e, f8.f5516e)) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1052b
    public final long getId() {
        return this.f5512a;
    }

    public final int hashCode() {
        return this.f5516e.hashCode() + A.j.c(this.f5515d, (this.f5514c.hashCode() + AbstractC1149a.d(this.f5513b, Long.hashCode(this.f5512a) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        long j = this.f5513b;
        StringBuilder sb = new StringBuilder("IntentExtraEntity(id=");
        sb.append(this.f5512a);
        sb.append(", actionId=");
        sb.append(j);
        sb.append(", type=");
        sb.append(this.f5514c);
        AbstractC1149a.m(sb, ", key=", this.f5515d, ", value=", this.f5516e);
        sb.append(")");
        return sb.toString();
    }

    public F(long j, long j5, G g8, String str, String str2) {
        o6.j.e(str, "key");
        o6.j.e(str2, "value");
        this.f5512a = j;
        this.f5513b = j5;
        this.f5514c = g8;
        this.f5515d = str;
        this.f5516e = str2;
    }
}
