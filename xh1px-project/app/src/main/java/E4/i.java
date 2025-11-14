package E4;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    public final long f1226a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1227b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1228c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1229d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1230e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1231f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1232g;

    public i(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        o6.j.e(str, "name");
        o6.j.e(str2, "duration");
        o6.j.e(str3, "imageProcessed");
        o6.j.e(str4, "averageImageProcessingTime");
        o6.j.e(str5, "eventsTriggered");
        o6.j.e(str6, "conditionsDetected");
        this.f1226a = j;
        this.f1227b = str;
        this.f1228c = str2;
        this.f1229d = str3;
        this.f1230e = str4;
        this.f1231f = str5;
        this.f1232g = str6;
    }

    @Override // E4.j
    public final long a() {
        return this.f1226a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f1226a == iVar.f1226a && o6.j.a(this.f1227b, iVar.f1227b) && o6.j.a(this.f1228c, iVar.f1228c) && o6.j.a(this.f1229d, iVar.f1229d) && o6.j.a(this.f1230e, iVar.f1230e) && o6.j.a(this.f1231f, iVar.f1231f) && o6.j.a(this.f1232g, iVar.f1232g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1232g.hashCode() + A.j.c(this.f1231f, A.j.c(this.f1230e, A.j.c(this.f1229d, A.j.c(this.f1228c, A.j.c(this.f1227b, Long.hashCode(this.f1226a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScenarioReportItem(id=");
        sb.append(this.f1226a);
        sb.append(", name=");
        sb.append(this.f1227b);
        AbstractC1149a.m(sb, ", duration=", this.f1228c, ", imageProcessed=", this.f1229d);
        AbstractC1149a.m(sb, ", averageImageProcessingTime=", this.f1230e, ", eventsTriggered=", this.f1231f);
        sb.append(", conditionsDetected=");
        sb.append(this.f1232g);
        sb.append(")");
        return sb.toString();
    }
}
