package W1;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f6492a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6493b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6494c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6495d;

    public c(int i4, long j, long j5, long j8) {
        this.f6492a = j;
        this.f6493b = j5;
        this.f6494c = j8;
        this.f6495d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f6492a == cVar.f6492a && this.f6493b == cVar.f6493b && this.f6494c == cVar.f6494c && this.f6495d == cVar.f6495d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6495d) + AbstractC1149a.d(this.f6494c, AbstractC1149a.d(this.f6493b, Long.hashCode(this.f6492a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegacyEndCondition(id=");
        sb.append(this.f6492a);
        sb.append(", scenarioId=");
        sb.append(this.f6493b);
        sb.append(", eventId=");
        sb.append(this.f6494c);
        sb.append(", executions=");
        return AbstractC1149a.h(sb, this.f6495d, ")");
    }
}
