package T1;

import java.util.List;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final K f5537a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5538b;

    /* renamed from: c, reason: collision with root package name */
    public final L f5539c;

    public M(K k, List list, L l6) {
        this.f5537a = k;
        this.f5538b = list;
        this.f5539c = l6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m6 = (M) obj;
        if (o6.j.a(this.f5537a, m6.f5537a) && o6.j.a(this.f5538b, m6.f5538b) && o6.j.a(this.f5539c, m6.f5539c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f5538b.hashCode() + (this.f5537a.hashCode() * 31)) * 31;
        L l6 = this.f5539c;
        if (l6 == null) {
            hashCode = 0;
        } else {
            hashCode = l6.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ScenarioWithEvents(scenario=" + this.f5537a + ", events=" + this.f5538b + ", stats=" + this.f5539c + ")";
    }
}
