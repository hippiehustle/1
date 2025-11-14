package C4;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f636a;

    /* renamed from: b, reason: collision with root package name */
    public final long f637b;

    /* renamed from: c, reason: collision with root package name */
    public final long f638c;

    /* renamed from: d, reason: collision with root package name */
    public final long f639d;

    /* renamed from: e, reason: collision with root package name */
    public final long f640e;

    /* renamed from: f, reason: collision with root package name */
    public final long f641f;

    public g(long j, long j5, long j8, long j9, long j10, long j11) {
        this.f636a = j;
        this.f637b = j5;
        this.f638c = j8;
        this.f639d = j9;
        this.f640e = j10;
        this.f641f = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f636a == gVar.f636a && this.f637b == gVar.f637b && this.f638c == gVar.f638c && this.f639d == gVar.f639d && this.f640e == gVar.f640e && this.f641f == gVar.f641f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f641f) + AbstractC1149a.d(this.f640e, AbstractC1149a.d(this.f639d, AbstractC1149a.d(this.f638c, AbstractC1149a.d(this.f637b, Long.hashCode(this.f636a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "ProcessingDebugInfo(processingCount=" + this.f636a + ", successCount=" + this.f637b + ", totalProcessingTimeMs=" + this.f638c + ", avgProcessingTimeMs=" + this.f639d + ", minProcessingTimeMs=" + this.f640e + ", maxProcessingTimeMs=" + this.f641f + ")";
    }
}
