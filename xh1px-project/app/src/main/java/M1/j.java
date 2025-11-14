package M1;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final L1.b f3323a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3324b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3325c;

    public j(L1.b bVar, int i4, int i8) {
        o6.j.e(bVar, "permission");
        this.f3323a = bVar;
        this.f3324b = i4;
        this.f3325c = i8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (!o6.j.a(this.f3323a, jVar.f3323a) || this.f3324b != jVar.f3324b || this.f3325c != jVar.f3325c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3325c) + AbstractC1149a.b(this.f3324b, this.f3323a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PermissionDialogUiState(permission=");
        sb.append(this.f3323a);
        sb.append(", titleRes=");
        sb.append(this.f3324b);
        sb.append(", descriptionRes=");
        return AbstractC1149a.h(sb, this.f3325c, ")");
    }
}
