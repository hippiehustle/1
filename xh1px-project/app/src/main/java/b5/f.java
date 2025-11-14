package b5;

import o6.j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final i f9193a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9194b;

    /* renamed from: c, reason: collision with root package name */
    public final E2.b f9195c;

    public f(i iVar, String str, E2.b bVar) {
        j.e(iVar, "migrationState");
        this.f9193a = iVar;
        this.f9194b = str;
        this.f9195c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f9193a == fVar.f9193a && j.a(this.f9194b, fVar.f9194b) && j.a(this.f9195c, fVar.f9195c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9195c.hashCode() + A.j.c(this.f9194b, this.f9193a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ConditionsMigrationUiState(migrationState=" + this.f9193a + ", textState=" + this.f9194b + ", buttonState=" + this.f9195c + ")";
    }
}
