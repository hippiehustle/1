package Z7;

import java.util.List;

/* loaded from: classes.dex */
public final class G implements X7.f {

    /* renamed from: a, reason: collision with root package name */
    public final X7.f f7547a;

    /* renamed from: b, reason: collision with root package name */
    public final X7.f f7548b;

    public G(X7.f fVar, X7.f fVar2) {
        o6.j.e(fVar, "keyDesc");
        o6.j.e(fVar2, "valueDesc");
        this.f7547a = fVar;
        this.f7548b = fVar2;
    }

    @Override // X7.f
    public final int a(String str) {
        o6.j.e(str, "name");
        Integer U8 = I7.u.U(str);
        if (U8 != null) {
            return U8.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // X7.f
    public final String b() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // X7.f
    public final int c() {
        return 2;
    }

    @Override // X7.f
    public final String d(int i4) {
        return String.valueOf(i4);
    }

    @Override // X7.f
    public final q4.X e() {
        return X7.i.f7075g;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof G) {
                G g8 = (G) obj;
                g8.getClass();
                if (!o6.j.a(this.f7547a, g8.f7547a) || !o6.j.a(this.f7548b, g8.f7548b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X7.f
    public final boolean g() {
        return false;
    }

    @Override // X7.f
    public final List getAnnotations() {
        return a6.s.f7766d;
    }

    @Override // X7.f
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.f7548b.hashCode() + ((this.f7547a.hashCode() + 710441009) * 31);
    }

    @Override // X7.f
    public final List i(int i4) {
        if (i4 >= 0) {
            return a6.s.f7766d;
        }
        throw new IllegalArgumentException(A.j.j(i4, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // X7.f
    public final X7.f j(int i4) {
        if (i4 >= 0) {
            int i8 = i4 % 2;
            if (i8 != 0) {
                if (i8 == 1) {
                    return this.f7548b;
                }
                throw new IllegalStateException("Unreached");
            }
            return this.f7547a;
        }
        throw new IllegalArgumentException(A.j.j(i4, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // X7.f
    public final boolean k(int i4) {
        if (i4 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(A.j.j(i4, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f7547a + ", " + this.f7548b + ')';
    }
}
