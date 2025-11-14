package W4;

import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Set f6589a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f6590b;

    public d(Set set, Set set2) {
        this.f6589a = set;
        this.f6590b = set2;
    }

    public static d a(d dVar, Set set, Set set2, int i4) {
        if ((i4 & 1) != 0) {
            set = dVar.f6589a;
        }
        if ((i4 & 2) != 0) {
            set2 = dVar.f6590b;
        }
        return new d(set, set2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (o6.j.a(this.f6589a, dVar.f6589a) && o6.j.a(this.f6590b, dVar.f6590b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6590b.hashCode() + (this.f6589a.hashCode() * 31);
    }

    public final String toString() {
        return "ScenarioExpandedSelection(dumbSelection=" + this.f6589a + ", smartSelection=" + this.f6590b + ")";
    }
}
