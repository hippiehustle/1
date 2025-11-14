package I3;

import java.util.List;
import l2.C1001a;
import o6.j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C1001a f2093a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2094b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2095c;

    public c(C1001a c1001a, List list, List list2) {
        j.e(c1001a, "scenario");
        j.e(list, "imageEvents");
        j.e(list2, "triggerEvents");
        this.f2093a = c1001a;
        this.f2094b = list;
        this.f2095c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (j.a(this.f2093a, cVar.f2093a) && j.a(this.f2094b, cVar.f2094b) && j.a(this.f2095c, cVar.f2095c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2095c.hashCode() + ((this.f2094b.hashCode() + (this.f2093a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EditedScenarioState(scenario=" + this.f2093a + ", imageEvents=" + this.f2094b + ", triggerEvents=" + this.f2095c + ")";
    }
}
