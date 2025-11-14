package C4;

import java.util.HashMap;
import java.util.List;
import l2.C1001a;
import n1.AbstractC1149a;
import o6.j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C1001a f619a;

    /* renamed from: b, reason: collision with root package name */
    public final g f620b;

    /* renamed from: c, reason: collision with root package name */
    public final g f621c;

    /* renamed from: d, reason: collision with root package name */
    public final long f622d;

    /* renamed from: e, reason: collision with root package name */
    public final List f623e;

    /* renamed from: f, reason: collision with root package name */
    public final long f624f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f625g;

    public c(C1001a c1001a, g gVar, g gVar2, long j, List list, long j5, HashMap hashMap) {
        j.e(c1001a, "scenario");
        j.e(gVar, "sessionInfo");
        j.e(gVar2, "imageProcessedInfo");
        this.f619a = c1001a;
        this.f620b = gVar;
        this.f621c = gVar2;
        this.f622d = j;
        this.f623e = list;
        this.f624f = j5;
        this.f625g = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!j.a(this.f619a, cVar.f619a) || !j.a(this.f620b, cVar.f620b) || !j.a(this.f621c, cVar.f621c) || this.f622d != cVar.f622d || !this.f623e.equals(cVar.f623e) || this.f624f != cVar.f624f || !this.f625g.equals(cVar.f625g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f625g.hashCode() + AbstractC1149a.d(this.f624f, (this.f623e.hashCode() + AbstractC1149a.d(this.f622d, (this.f621c.hashCode() + ((this.f620b.hashCode() + (this.f619a.hashCode() * 31)) * 31)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "DebugReport(scenario=" + this.f619a + ", sessionInfo=" + this.f620b + ", imageProcessedInfo=" + this.f621c + ", eventsTriggeredCount=" + this.f622d + ", eventsProcessedInfo=" + this.f623e + ", conditionsDetectedCount=" + this.f624f + ", conditionsProcessedInfo=" + this.f625g + ")";
    }
}
