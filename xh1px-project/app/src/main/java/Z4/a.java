package Z4;

import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Set f7416a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f7417b;

    public a(Set set, Set set2) {
        o6.j.e(set, "dumbSelection");
        o6.j.e(set2, "smartSelection");
        this.f7416a = set;
        this.f7417b = set2;
    }

    public static a a(Set set, Set set2) {
        o6.j.e(set, "dumbSelection");
        o6.j.e(set2, "smartSelection");
        return new a(set, set2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (o6.j.a(this.f7416a, aVar.f7416a) && o6.j.a(this.f7417b, aVar.f7417b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7417b.hashCode() + (this.f7416a.hashCode() * 31);
    }

    public final String toString() {
        return "ScenarioBackupSelection(dumbSelection=" + this.f7416a + ", smartSelection=" + this.f7417b + ")";
    }
}
