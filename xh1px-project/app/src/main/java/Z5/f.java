package Z5;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f7479d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7480e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7481f;

    static {
        new f(2, 2, 0);
    }

    public f(int i4, int i8, int i9) {
        this.f7479d = i4;
        this.f7480e = i8;
        if (i4 >= 0 && i4 < 256 && i8 >= 0 && i8 < 256) {
            this.f7481f = (i4 << 16) + (i8 << 8);
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i4 + '.' + i8 + ".0").toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        o6.j.e(fVar, "other");
        return this.f7481f - fVar.f7481f;
    }

    public final boolean equals(Object obj) {
        f fVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            fVar = (f) obj;
        } else {
            fVar = null;
        }
        if (fVar != null && this.f7481f == fVar.f7481f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7481f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7479d);
        sb.append('.');
        return AbstractC1149a.h(sb, this.f7480e, ".0");
    }
}
