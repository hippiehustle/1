package P6;

import java.util.Collection;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final X6.i f4568a;

    /* renamed from: b, reason: collision with root package name */
    public final Collection f4569b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4570c;

    public m(X6.i iVar, Collection collection) {
        this(iVar, collection, iVar.f7008a == X6.h.f7006f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (o6.j.a(this.f4568a, mVar.f4568a) && o6.j.a(this.f4569b, mVar.f4569b) && this.f4570c == mVar.f4570c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4570c) + ((this.f4569b.hashCode() + (this.f4568a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f4568a + ", qualifierApplicabilityTypes=" + this.f4569b + ", definitelyNotNull=" + this.f4570c + ')';
    }

    public m(X6.i iVar, Collection collection, boolean z8) {
        o6.j.e(collection, "qualifierApplicabilityTypes");
        this.f4568a = iVar;
        this.f4569b = collection;
        this.f4570c = z8;
    }
}
