package Z7;

import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class Z implements X7.f, InterfaceC0389j {

    /* renamed from: a, reason: collision with root package name */
    public final X7.f f7580a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7581b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f7582c;

    public Z(X7.f fVar) {
        o6.j.e(fVar, "original");
        this.f7580a = fVar;
        this.f7581b = fVar.b() + '?';
        this.f7582c = Q.b(fVar);
    }

    @Override // X7.f
    public final int a(String str) {
        o6.j.e(str, "name");
        return this.f7580a.a(str);
    }

    @Override // X7.f
    public final String b() {
        return this.f7581b;
    }

    @Override // X7.f
    public final int c() {
        return this.f7580a.c();
    }

    @Override // X7.f
    public final String d(int i4) {
        return this.f7580a.d(i4);
    }

    @Override // X7.f
    public final q4.X e() {
        return this.f7580a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        if (o6.j.a(this.f7580a, ((Z) obj).f7580a)) {
            return true;
        }
        return false;
    }

    @Override // Z7.InterfaceC0389j
    public final Set f() {
        return this.f7582c;
    }

    @Override // X7.f
    public final boolean g() {
        return this.f7580a.g();
    }

    @Override // X7.f
    public final List getAnnotations() {
        return this.f7580a.getAnnotations();
    }

    @Override // X7.f
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return this.f7580a.hashCode() * 31;
    }

    @Override // X7.f
    public final List i(int i4) {
        return this.f7580a.i(i4);
    }

    @Override // X7.f
    public final X7.f j(int i4) {
        return this.f7580a.j(i4);
    }

    @Override // X7.f
    public final boolean k(int i4) {
        return this.f7580a.k(i4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7580a);
        sb.append('?');
        return sb.toString();
    }
}
