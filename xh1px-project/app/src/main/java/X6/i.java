package X6;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final h f7008a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7009b;

    public i(h hVar) {
        this.f7008a = hVar;
        this.f7009b = false;
    }

    public static i a(i iVar, h hVar, boolean z8, int i4) {
        if ((i4 & 1) != 0) {
            hVar = iVar.f7008a;
        }
        if ((i4 & 2) != 0) {
            z8 = iVar.f7009b;
        }
        iVar.getClass();
        o6.j.e(hVar, "qualifier");
        return new i(hVar, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f7008a == iVar.f7008a && this.f7009b == iVar.f7009b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7009b) + (this.f7008a.hashCode() * 31);
    }

    public final String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f7008a + ", isForWarningOnly=" + this.f7009b + ')';
    }

    public i(h hVar, boolean z8) {
        this.f7008a = hVar;
        this.f7009b = z8;
    }
}
