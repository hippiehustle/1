package Z7;

import java.util.List;

/* loaded from: classes.dex */
public final class X implements X7.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f7577a;

    /* renamed from: b, reason: collision with root package name */
    public final X7.e f7578b;

    public X(String str, X7.e eVar) {
        o6.j.e(eVar, "kind");
        this.f7577a = str;
        this.f7578b = eVar;
    }

    @Override // X7.f
    public final int a(String str) {
        o6.j.e(str, "name");
        f();
        throw null;
    }

    @Override // X7.f
    public final String b() {
        return this.f7577a;
    }

    @Override // X7.f
    public final int c() {
        return 0;
    }

    @Override // X7.f
    public final String d(int i4) {
        f();
        throw null;
    }

    @Override // X7.f
    public final q4.X e() {
        return this.f7578b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x8 = (X) obj;
        if (o6.j.a(this.f7577a, x8.f7577a) && o6.j.a(this.f7578b, x8.f7578b)) {
            return true;
        }
        return false;
    }

    public final void f() {
        throw new IllegalStateException(A.j.r(new StringBuilder("Primitive descriptor "), this.f7577a, " does not have elements"));
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
        return (this.f7578b.hashCode() * 31) + this.f7577a.hashCode();
    }

    @Override // X7.f
    public final List i(int i4) {
        f();
        throw null;
    }

    @Override // X7.f
    public final X7.f j(int i4) {
        f();
        throw null;
    }

    @Override // X7.f
    public final boolean k(int i4) {
        f();
        throw null;
    }

    public final String toString() {
        return A.j.q(new StringBuilder("PrimitiveDescriptor("), this.f7577a, ')');
    }
}
