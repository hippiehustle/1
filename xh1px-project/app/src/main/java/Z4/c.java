package Z4;

import l2.C1001a;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: b, reason: collision with root package name */
    public final C1001a f7421b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7422c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C1001a c1001a, long j, long j5) {
        super(c1001a.f12191b);
        o6.j.e(c1001a, "scenario");
        this.f7421b = c1001a;
        this.f7422c = j;
        this.f7423d = j5;
    }

    @Override // Z4.i
    public final long a() {
        return this.f7422c;
    }

    @Override // Z4.i
    public final Object b() {
        return this.f7421b;
    }

    @Override // Z4.i
    public final long c() {
        return this.f7423d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (o6.j.a(this.f7421b, cVar.f7421b) && this.f7422c == cVar.f7422c && this.f7423d == cVar.f7423d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7423d) + AbstractC1149a.d(this.f7422c, this.f7421b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Smart(scenario=" + this.f7421b + ", lastStartTimestamp=" + this.f7422c + ", startCount=" + this.f7423d + ")";
    }
}
