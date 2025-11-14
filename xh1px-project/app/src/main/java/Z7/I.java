package Z7;

import java.util.List;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public abstract class I implements X7.f {

    /* renamed from: a, reason: collision with root package name */
    public final X7.f f7550a;

    public I(X7.f fVar) {
        this.f7550a = fVar;
    }

    @Override // X7.f
    public final int a(String str) {
        o6.j.e(str, "name");
        Integer U8 = I7.u.U(str);
        if (U8 != null) {
            return U8.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // X7.f
    public final int c() {
        return 1;
    }

    @Override // X7.f
    public final String d(int i4) {
        return String.valueOf(i4);
    }

    @Override // X7.f
    public final q4.X e() {
        return X7.i.f7074f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof I) {
                I i4 = (I) obj;
                if (o6.j.a(this.f7550a, i4.f7550a) && o6.j.a(b(), i4.b())) {
                    return true;
                }
                return false;
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
        return b().hashCode() + (this.f7550a.hashCode() * 31);
    }

    @Override // X7.f
    public final List i(int i4) {
        if (i4 >= 0) {
            return a6.s.f7766d;
        }
        StringBuilder j = AbstractC1149a.j(i4, "Illegal index ", ", ");
        j.append(b());
        j.append(" expects only non-negative indices");
        throw new IllegalArgumentException(j.toString().toString());
    }

    @Override // X7.f
    public final X7.f j(int i4) {
        if (i4 >= 0) {
            return this.f7550a;
        }
        StringBuilder j = AbstractC1149a.j(i4, "Illegal index ", ", ");
        j.append(b());
        j.append(" expects only non-negative indices");
        throw new IllegalArgumentException(j.toString().toString());
    }

    @Override // X7.f
    public final boolean k(int i4) {
        if (i4 >= 0) {
            return false;
        }
        StringBuilder j = AbstractC1149a.j(i4, "Illegal index ", ", ");
        j.append(b());
        j.append(" expects only non-negative indices");
        throw new IllegalArgumentException(j.toString().toString());
    }

    public final String toString() {
        return b() + '(' + this.f7550a + ')';
    }
}
