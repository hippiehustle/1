package D4;

/* renamed from: D4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033i {

    /* renamed from: a, reason: collision with root package name */
    public final String f961a;

    /* renamed from: b, reason: collision with root package name */
    public final String f962b;

    /* renamed from: c, reason: collision with root package name */
    public final String f963c;

    public /* synthetic */ C0033i() {
        this("", "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0033i)) {
            return false;
        }
        C0033i c0033i = (C0033i) obj;
        if (o6.j.a(this.f961a, c0033i.f961a) && o6.j.a(this.f962b, c0033i.f962b) && o6.j.a(this.f963c, c0033i.f963c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f963c.hashCode() + A.j.c(this.f962b, this.f961a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastPositiveDebugInfo(eventName=");
        sb.append(this.f961a);
        sb.append(", conditionName=");
        sb.append(this.f962b);
        sb.append(", confidenceRateText=");
        return A.j.r(sb, this.f963c, ")");
    }

    public C0033i(String str, String str2, String str3) {
        o6.j.e(str, "eventName");
        o6.j.e(str2, "conditionName");
        o6.j.e(str3, "confidenceRateText");
        this.f961a = str;
        this.f962b = str2;
        this.f963c = str3;
    }
}
