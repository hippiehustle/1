package s7;

import c7.C0587f;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14598a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14599b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14600c;

    /* renamed from: d, reason: collision with root package name */
    public final C0587f f14601d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14602e;

    public n(Object obj, Object obj2, C0587f c0587f, C0587f c0587f2, String str) {
        o6.j.e(str, "filePath");
        this.f14598a = obj;
        this.f14599b = obj2;
        this.f14600c = c0587f;
        this.f14601d = c0587f2;
        this.f14602e = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                if (!this.f14598a.equals(nVar.f14598a) || !o6.j.a(this.f14599b, nVar.f14599b) || !o6.j.a(this.f14600c, nVar.f14600c) || !this.f14601d.equals(nVar.f14601d) || !o6.j.a(this.f14602e, nVar.f14602e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f14598a.hashCode() * 31;
        int i4 = 0;
        Object obj = this.f14599b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = (hashCode2 + hashCode) * 31;
        Object obj2 = this.f14600c;
        if (obj2 != null) {
            i4 = obj2.hashCode();
        }
        return this.f14602e.hashCode() + ((this.f14601d.hashCode() + ((i8 + i4) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.f14598a);
        sb.append(", compilerVersion=");
        sb.append(this.f14599b);
        sb.append(", languageVersion=");
        sb.append(this.f14600c);
        sb.append(", expectedVersion=");
        sb.append(this.f14601d);
        sb.append(", filePath=");
        return A.j.q(sb, this.f14602e, ')');
    }
}
