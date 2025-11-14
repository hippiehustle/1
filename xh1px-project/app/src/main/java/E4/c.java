package E4;

import j2.C0902b;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f1200a;

    /* renamed from: b, reason: collision with root package name */
    public final C0902b f1201b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1202c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1203d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1204e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1205f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1206g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1207h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1208i;
    public final String j;

    public c(long j, C0902b c0902b, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        o6.j.e(c0902b, "condition");
        o6.j.e(str, "matchCount");
        o6.j.e(str2, "processingCount");
        o6.j.e(str3, "avgProcessingDuration");
        o6.j.e(str4, "minProcessingDuration");
        o6.j.e(str5, "maxProcessingDuration");
        o6.j.e(str6, "avgConfidence");
        o6.j.e(str7, "minConfidence");
        o6.j.e(str8, "maxConfidence");
        this.f1200a = j;
        this.f1201b = c0902b;
        this.f1202c = str;
        this.f1203d = str2;
        this.f1204e = str3;
        this.f1205f = str4;
        this.f1206g = str5;
        this.f1207h = str6;
        this.f1208i = str7;
        this.j = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1200a == cVar.f1200a && o6.j.a(this.f1201b, cVar.f1201b) && o6.j.a(this.f1202c, cVar.f1202c) && o6.j.a(this.f1203d, cVar.f1203d) && o6.j.a(this.f1204e, cVar.f1204e) && o6.j.a(this.f1205f, cVar.f1205f) && o6.j.a(this.f1206g, cVar.f1206g) && o6.j.a(this.f1207h, cVar.f1207h) && o6.j.a(this.f1208i, cVar.f1208i) && o6.j.a(this.j, cVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + A.j.c(this.f1208i, A.j.c(this.f1207h, A.j.c(this.f1206g, A.j.c(this.f1205f, A.j.c(this.f1204e, A.j.c(this.f1203d, A.j.c(this.f1202c, (this.f1201b.hashCode() + (Long.hashCode(this.f1200a) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConditionReport(id=");
        sb.append(this.f1200a);
        sb.append(", condition=");
        sb.append(this.f1201b);
        AbstractC1149a.m(sb, ", matchCount=", this.f1202c, ", processingCount=", this.f1203d);
        AbstractC1149a.m(sb, ", avgProcessingDuration=", this.f1204e, ", minProcessingDuration=", this.f1205f);
        AbstractC1149a.m(sb, ", maxProcessingDuration=", this.f1206g, ", avgConfidence=", this.f1207h);
        AbstractC1149a.m(sb, ", minConfidence=", this.f1208i, ", maxConfidence=", this.j);
        sb.append(")");
        return sb.toString();
    }
}
