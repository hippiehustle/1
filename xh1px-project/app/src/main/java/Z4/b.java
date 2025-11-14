package Z4;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: b, reason: collision with root package name */
    public final p2.e f7418b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7419c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7420d;

    public b(p2.e eVar, long j, long j5) {
        super(eVar.f13700b);
        this.f7418b = eVar;
        this.f7419c = j;
        this.f7420d = j5;
    }

    @Override // Z4.i
    public final long a() {
        return this.f7419c;
    }

    @Override // Z4.i
    public final Object b() {
        return this.f7418b;
    }

    @Override // Z4.i
    public final long c() {
        return this.f7420d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (o6.j.a(this.f7418b, bVar.f7418b) && this.f7419c == bVar.f7419c && this.f7420d == bVar.f7420d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7420d) + AbstractC1149a.d(this.f7419c, this.f7418b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Dumb(scenario=" + this.f7418b + ", lastStartTimestamp=" + this.f7419c + ", startCount=" + this.f7420d + ")";
    }
}
