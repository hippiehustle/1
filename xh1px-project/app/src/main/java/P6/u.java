package P6;

import java.util.Map;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final A f4591a;

    /* renamed from: b, reason: collision with root package name */
    public final A f4592b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f4593c = a6.t.f7767d;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4594d;

    public u(A a3, A a4) {
        boolean z8;
        this.f4591a = a3;
        this.f4592b = a4;
        A a9 = A.f4515d;
        if (a3 == a9 && a4 == a9) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f4594d = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4591a == uVar.f4591a && this.f4592b == uVar.f4592b && o6.j.a(this.f4593c, uVar.f4593c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f4591a.hashCode() * 31;
        A a3 = this.f4592b;
        if (a3 == null) {
            hashCode = 0;
        } else {
            hashCode = a3.hashCode();
        }
        return this.f4593c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f4591a + ", migrationLevel=" + this.f4592b + ", userDefinedLevelForSpecificAnnotation=" + this.f4593c + ')';
    }
}
