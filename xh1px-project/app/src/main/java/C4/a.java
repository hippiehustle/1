package C4;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f604a;

    /* renamed from: b, reason: collision with root package name */
    public final long f605b;

    /* renamed from: c, reason: collision with root package name */
    public final long f606c;

    /* renamed from: d, reason: collision with root package name */
    public final long f607d;

    /* renamed from: e, reason: collision with root package name */
    public final long f608e;

    /* renamed from: f, reason: collision with root package name */
    public final long f609f;

    /* renamed from: g, reason: collision with root package name */
    public final double f610g;

    /* renamed from: h, reason: collision with root package name */
    public final double f611h;

    /* renamed from: i, reason: collision with root package name */
    public final double f612i;

    public a(long j, long j5, long j8, long j9, long j10, long j11, double d2, double d3, double d9) {
        this.f604a = j;
        this.f605b = j5;
        this.f606c = j8;
        this.f607d = j9;
        this.f608e = j10;
        this.f609f = j11;
        this.f610g = d2;
        this.f611h = d3;
        this.f612i = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f604a == aVar.f604a && this.f605b == aVar.f605b && this.f606c == aVar.f606c && this.f607d == aVar.f607d && this.f608e == aVar.f608e && this.f609f == aVar.f609f && Double.compare(this.f610g, aVar.f610g) == 0 && Double.compare(this.f611h, aVar.f611h) == 0 && Double.compare(this.f612i, aVar.f612i) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f612i) + ((Double.hashCode(this.f611h) + ((Double.hashCode(this.f610g) + AbstractC1149a.d(this.f609f, AbstractC1149a.d(this.f608e, AbstractC1149a.d(this.f607d, AbstractC1149a.d(this.f606c, AbstractC1149a.d(this.f605b, Long.hashCode(this.f604a) * 31, 31), 31), 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ConditionProcessingDebugInfo(processingCount=" + this.f604a + ", successCount=" + this.f605b + ", totalProcessingTimeMs=" + this.f606c + ", avgProcessingTimeMs=" + this.f607d + ", minProcessingTimeMs=" + this.f608e + ", maxProcessingTimeMs=" + this.f609f + ", avgConfidenceRate=" + this.f610g + ", minConfidenceRate=" + this.f611h + ", maxConfidenceRate=" + this.f612i + ")";
    }
}
