package w6;

import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import L7.C0165x;
import i.AbstractC0862a;
import kotlin.NoWhenBranchMatchedException;
import u6.InterfaceC1642c;
import u7.InterfaceC1657j;

/* loaded from: classes.dex */
public final class p0 implements u6.t {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f15898g = {o6.v.f13643a.f(new o6.p(p0.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0))};

    /* renamed from: d, reason: collision with root package name */
    public final C6.T f15899d;

    /* renamed from: e, reason: collision with root package name */
    public final s0 f15900e;

    /* renamed from: f, reason: collision with root package name */
    public final q0 f15901f;

    public p0(q0 q0Var, C6.T t8) {
        u7.k kVar;
        Y6.g gVar;
        H6.b bVar;
        Class cls;
        C1710B c1710b;
        Object K;
        o6.j.e(t8, "descriptor");
        this.f15899d = t8;
        this.f15900e = AbstractC0862a.l(null, new B6.j(24, this));
        if (q0Var == null) {
            InterfaceC0010k q6 = t8.q();
            o6.j.d(q6, "getContainingDeclaration(...)");
            if (q6 instanceof InterfaceC0004e) {
                K = e((InterfaceC0004e) q6);
            } else if (q6 instanceof InterfaceC0002c) {
                InterfaceC0010k q8 = ((InterfaceC0002c) q6).q();
                o6.j.d(q8, "getContainingDeclaration(...)");
                if (q8 instanceof InterfaceC0004e) {
                    c1710b = e((InterfaceC0004e) q8);
                } else {
                    if (q6 instanceof u7.k) {
                        kVar = (u7.k) q6;
                    } else {
                        kVar = null;
                    }
                    if (kVar != null) {
                        InterfaceC1657j w8 = kVar.w();
                        if (w8 instanceof Y6.g) {
                            gVar = (Y6.g) w8;
                        } else {
                            gVar = null;
                        }
                        if (gVar != null) {
                            bVar = gVar.f7224f;
                        } else {
                            bVar = null;
                        }
                        H6.b bVar2 = bVar instanceof H6.b ? bVar : null;
                        if (bVar2 != null && (cls = bVar2.f2037a) != null) {
                            c1710b = (C1710B) h2.a.n(cls);
                        } else {
                            throw new C0165x("Container of deserialized member is not resolved: " + kVar);
                        }
                    } else {
                        throw new C0165x("Non-class callable descriptor must be deserialized: " + q6);
                    }
                }
                K = q6.K(new g0.L(22, c1710b), Z5.y.f7506a);
            } else {
                throw new C0165x("Unknown type parameter container: " + q6);
            }
            q0Var = (q0) K;
        }
        this.f15901f = q0Var;
    }

    public static C1710B e(InterfaceC0004e interfaceC0004e) {
        InterfaceC1642c interfaceC1642c;
        Class k = y0.k(interfaceC0004e);
        if (k != null) {
            interfaceC1642c = h2.a.n(k);
        } else {
            interfaceC1642c = null;
        }
        C1710B c1710b = (C1710B) interfaceC1642c;
        if (c1710b != null) {
            return c1710b;
        }
        throw new C0165x("Type parameter container is not resolved: " + interfaceC0004e.q());
    }

    public final String d() {
        String b4 = this.f15899d.getName().b();
        o6.j.d(b4, "asString(...)");
        return b4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            if (o6.j.a(this.f15901f, p0Var.f15901f) && d().equals(p0Var.d())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return d().hashCode() + (this.f15901f.hashCode() * 31);
    }

    public final String toString() {
        u6.w wVar;
        StringBuilder sb = new StringBuilder();
        int ordinal = this.f15899d.e0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    wVar = u6.w.f15377f;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                wVar = u6.w.f15376e;
            }
        } else {
            wVar = u6.w.f15375d;
        }
        int ordinal2 = wVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 == 2) {
                    sb.append("out ");
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                sb.append("in ");
            }
        }
        sb.append(d());
        return sb.toString();
    }
}
