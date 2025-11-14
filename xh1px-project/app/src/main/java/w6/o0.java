package w6;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import I6.AbstractC0065d;
import L7.C0165x;
import a6.AbstractC0436k;
import h7.AbstractC0842e;
import h7.C0845h;
import i.AbstractC0862a;
import java.lang.reflect.Array;
import java.util.List;
import n1.AbstractC1149a;
import n6.InterfaceC1162a;
import u6.InterfaceC1643d;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class o0 implements o6.k {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f15891e;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1759v f15892a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f15893b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f15894c;

    /* renamed from: d, reason: collision with root package name */
    public final s0 f15895d;

    static {
        o6.p pVar = new o6.p(o0.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0);
        o6.w wVar = o6.v.f13643a;
        f15891e = new u6.s[]{wVar.f(pVar), AbstractC1149a.k(o0.class, "arguments", "getArguments()Ljava/util/List;", 0, wVar)};
    }

    public o0(AbstractC1759v abstractC1759v, InterfaceC1162a interfaceC1162a) {
        s0 s0Var;
        o6.j.e(abstractC1759v, "type");
        this.f15892a = abstractC1759v;
        if (interfaceC1162a instanceof s0) {
            s0Var = (s0) interfaceC1162a;
        } else {
            s0Var = null;
        }
        if (s0Var == null) {
            if (interfaceC1162a != null) {
                s0Var = AbstractC0862a.l(null, interfaceC1162a);
            } else {
                s0Var = null;
            }
        }
        this.f15893b = s0Var;
        this.f15894c = AbstractC0862a.l(null, new n0(this, 0));
        this.f15895d = AbstractC0862a.l(null, new B6.f(this, 15, interfaceC1162a));
    }

    public final InterfaceC1643d a(AbstractC1759v abstractC1759v) {
        AbstractC1759v b4;
        InterfaceC0007h c6 = abstractC1759v.B0().c();
        if (c6 instanceof InterfaceC0004e) {
            Class k = y0.k((InterfaceC0004e) c6);
            if (k != null) {
                if (k.isArray()) {
                    w7.M m6 = (w7.M) AbstractC0436k.I0(abstractC1759v.r0());
                    if (m6 != null && (b4 = m6.b()) != null) {
                        InterfaceC1643d a3 = a(b4);
                        if (a3 != null) {
                            return new C1710B(Array.newInstance((Class<?>) h2.a.k(AbstractC0842e.q(a3)), 0).getClass());
                        }
                        throw new C0165x("Cannot determine classifier for array element type: " + this);
                    }
                    return new C1710B(k);
                }
                if (!w7.U.e(abstractC1759v)) {
                    Class cls = (Class) AbstractC0065d.f2193b.get(k);
                    if (cls != null) {
                        k = cls;
                    }
                    return new C1710B(k);
                }
                return new C1710B(k);
            }
        } else {
            if (c6 instanceof C6.T) {
                return new p0(null, (C6.T) c6);
            }
            if (c6 instanceof C6.S) {
                throw new Error("An operation is not implemented: Type alias classifiers are not yet supported");
            }
        }
        return null;
    }

    public final List b() {
        u6.s sVar = f15891e[1];
        Object a3 = this.f15895d.a();
        o6.j.d(a3, "getValue(...)");
        return (List) a3;
    }

    public final InterfaceC1643d c() {
        u6.s sVar = f15891e[0];
        return (InterfaceC1643d) this.f15894c.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            if (o6.j.a(this.f15892a, o0Var.f15892a) && o6.j.a(c(), o0Var.c()) && b().equals(o0Var.b())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.f15892a.hashCode() * 31;
        InterfaceC1643d c6 = c();
        if (c6 != null) {
            i4 = c6.hashCode();
        } else {
            i4 = 0;
        }
        return b().hashCode() + ((hashCode + i4) * 31);
    }

    public final String toString() {
        C0845h c0845h = v0.f15919a;
        return v0.d(this.f15892a);
    }
}
