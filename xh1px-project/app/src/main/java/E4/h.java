package E4;

import b6.C0535c;
import java.util.List;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    public final long f1218a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1219b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1220c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1221d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1222e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1223f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1224g;

    /* renamed from: h, reason: collision with root package name */
    public final List f1225h;

    public h(long j, String str, String str2, String str3, String str4, String str5, String str6, C0535c c0535c) {
        o6.j.e(str, "name");
        o6.j.e(str2, "triggerCount");
        o6.j.e(str3, "processingCount");
        o6.j.e(str4, "avgProcessingDuration");
        o6.j.e(str5, "minProcessingDuration");
        o6.j.e(str6, "maxProcessingDuration");
        o6.j.e(c0535c, "conditionReports");
        this.f1218a = j;
        this.f1219b = str;
        this.f1220c = str2;
        this.f1221d = str3;
        this.f1222e = str4;
        this.f1223f = str5;
        this.f1224g = str6;
        this.f1225h = c0535c;
    }

    @Override // E4.j
    public final long a() {
        return this.f1218a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f1218a == hVar.f1218a && o6.j.a(this.f1219b, hVar.f1219b) && o6.j.a(this.f1220c, hVar.f1220c) && o6.j.a(this.f1221d, hVar.f1221d) && o6.j.a(this.f1222e, hVar.f1222e) && o6.j.a(this.f1223f, hVar.f1223f) && o6.j.a(this.f1224g, hVar.f1224g) && o6.j.a(this.f1225h, hVar.f1225h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1225h.hashCode() + A.j.c(this.f1224g, A.j.c(this.f1223f, A.j.c(this.f1222e, A.j.c(this.f1221d, A.j.c(this.f1220c, A.j.c(this.f1219b, Long.hashCode(this.f1218a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventReportItem(id=");
        sb.append(this.f1218a);
        sb.append(", name=");
        sb.append(this.f1219b);
        AbstractC1149a.m(sb, ", triggerCount=", this.f1220c, ", processingCount=", this.f1221d);
        AbstractC1149a.m(sb, ", avgProcessingDuration=", this.f1222e, ", minProcessingDuration=", this.f1223f);
        sb.append(", maxProcessingDuration=");
        sb.append(this.f1224g);
        sb.append(", conditionReports=");
        sb.append(this.f1225h);
        sb.append(")");
        return sb.toString();
    }
}
