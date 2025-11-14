package w6;

import C6.InterfaceC0004e;
import C6.InterfaceC0009j;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import F6.AbstractC0054n;
import L7.C0165x;
import a7.C0439A;
import a7.C0453n;
import f7.C0722b;
import f7.C0723c;
import g7.AbstractC0793b;
import g7.C0799h;
import h6.AbstractC0837b;
import i7.AbstractC0890e;
import i7.AbstractC0892g;
import i7.AbstractC0898m;
import java.lang.reflect.Method;
import m7.AbstractC1098d;
import s3.AbstractC1492c;
import u7.InterfaceC1649b;

/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0722b f15923a;

    static {
        C0723c c0723c = new C0723c("java.lang.Void");
        f15923a = new C0722b(c0723c.b(), c0723c.f10797a.f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1724k a(InterfaceC0019u interfaceC0019u) {
        String r8 = AbstractC1492c.r(interfaceC0019u);
        if (r8 == null) {
            if (interfaceC0019u instanceof F6.L) {
                String b4 = AbstractC1098d.k(interfaceC0019u).getName().b();
                o6.j.d(b4, "asString(...)");
                r8 = P6.v.a(b4);
            } else if (interfaceC0019u instanceof F6.M) {
                String b9 = AbstractC1098d.k(interfaceC0019u).getName().b();
                o6.j.d(b9, "asString(...)");
                r8 = P6.v.b(b9);
            } else {
                r8 = ((AbstractC0054n) interfaceC0019u).getName().b();
                o6.j.d(r8, "asString(...)");
            }
        }
        return new C1724k(new e7.e(r8, D2.f.e(interfaceC0019u, 1)));
    }

    public static AbstractC0837b b(C6.M m6) {
        H6.f fVar;
        I6.s sVar;
        C6.O o7;
        H6.f fVar2;
        I6.s sVar2;
        I6.x xVar;
        o6.j.e(m6, "possiblyOverriddenProperty");
        C6.M a3 = ((C6.M) AbstractC0890e.s(m6)).a();
        o6.j.d(a3, "getOriginal(...)");
        Method method = null;
        C1724k c1724k = null;
        if (a3 instanceof u7.q) {
            u7.q qVar = (u7.q) a3;
            a7.I i4 = qVar.f15440E;
            g7.n nVar = d7.k.f10515d;
            o6.j.d(nVar, "propertySignature");
            d7.e eVar = (d7.e) E2.d.t(i4, nVar);
            if (eVar != null) {
                return new C1727n(a3, i4, eVar, qVar.f15441F, qVar.f15442G);
            }
        } else if (a3 instanceof R6.g) {
            R6.g gVar = (R6.g) a3;
            C6.O h8 = gVar.h();
            if (h8 instanceof H6.f) {
                fVar = (H6.f) h8;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                sVar = fVar.f2044d;
            } else {
                sVar = null;
            }
            if (sVar instanceof I6.u) {
                return new C1725l(((I6.u) sVar).f2214a);
            }
            if (sVar instanceof I6.x) {
                Method method2 = ((I6.x) sVar).f2216a;
                F6.M m8 = gVar.f1482B;
                if (m8 != null) {
                    o7 = m8.h();
                } else {
                    o7 = null;
                }
                if (o7 instanceof H6.f) {
                    fVar2 = (H6.f) o7;
                } else {
                    fVar2 = null;
                }
                if (fVar2 != null) {
                    sVar2 = fVar2.f2044d;
                } else {
                    sVar2 = null;
                }
                if (sVar2 instanceof I6.x) {
                    xVar = (I6.x) sVar2;
                } else {
                    xVar = null;
                }
                if (xVar != null) {
                    method = xVar.f2216a;
                }
                return new C1726m(method2, method);
            }
            throw new C0165x("Incorrect resolution sequence for Java field " + a3 + " (source = " + sVar + ')');
        }
        F6.L c6 = a3.c();
        o6.j.b(c6);
        C1724k a4 = a(c6);
        F6.M i8 = a3.i();
        if (i8 != null) {
            c1724k = a(i8);
        }
        return new C1728o(a4, c1724k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h4.g c(InterfaceC0019u interfaceC0019u) {
        H6.f fVar;
        H6.f fVar2;
        I6.s sVar;
        Method method;
        o6.j.e(interfaceC0019u, "possiblySubstitutedFunction");
        InterfaceC0019u a3 = ((InterfaceC0019u) AbstractC0890e.s(interfaceC0019u)).a();
        o6.j.d(a3, "getOriginal(...)");
        if (a3 instanceof InterfaceC1649b) {
            u7.k kVar = (u7.k) a3;
            AbstractC0793b P4 = kVar.P();
            if (P4 instanceof C0439A) {
                C0799h c0799h = e7.g.f10671a;
                e7.e c6 = e7.g.c((C0439A) P4, kVar.C0(), kVar.p0());
                if (c6 != null) {
                    return new C1724k(c6);
                }
            }
            if (P4 instanceof C0453n) {
                C0799h c0799h2 = e7.g.f10671a;
                e7.e a4 = e7.g.a((C0453n) P4, kVar.C0(), kVar.p0());
                if (a4 != null) {
                    String str = a4.f10665e;
                    String str2 = a4.f10666f;
                    InterfaceC0010k q6 = interfaceC0019u.q();
                    o6.j.d(q6, "getContainingDeclaration(...)");
                    if (AbstractC0892g.b(q6)) {
                        return new C1724k(a4);
                    }
                    InterfaceC0010k q8 = interfaceC0019u.q();
                    o6.j.d(q8, "getContainingDeclaration(...)");
                    if (AbstractC0892g.d(q8)) {
                        InterfaceC0009j interfaceC0009j = (InterfaceC0009j) interfaceC0019u;
                        if (interfaceC0009j.I()) {
                            if (!o6.j.a(str, "constructor-impl") || !I7.v.W(str2, ")V")) {
                                throw new IllegalArgumentException(("Invalid signature: " + a4).toString());
                            }
                        } else if (o6.j.a(str, "constructor-impl")) {
                            InterfaceC0004e J6 = interfaceC0009j.J();
                            o6.j.d(J6, "getConstructedClass(...)");
                            C0722b f8 = AbstractC1098d.f(J6);
                            o6.j.b(f8);
                            String b4 = e7.b.b(f8.b());
                            if (I7.v.W(str2, ")V")) {
                                String str3 = I7.m.p0(str2, "V") + b4;
                                o6.j.e(str, "name");
                                o6.j.e(str3, "desc");
                                a4 = new e7.e(str, str3);
                            } else if (!I7.v.W(str2, b4)) {
                                throw new IllegalArgumentException(("Invalid signature: " + a4).toString());
                            }
                        } else {
                            throw new IllegalArgumentException(("Invalid signature: " + a4).toString());
                        }
                        return new C1724k(a4);
                    }
                    return new C1723j(a4);
                }
            }
            return a(a3);
        }
        Object obj = null;
        I6.x xVar = null;
        if (a3 instanceof R6.f) {
            C6.O h8 = ((R6.f) a3).h();
            if (h8 instanceof H6.f) {
                fVar2 = (H6.f) h8;
            } else {
                fVar2 = null;
            }
            if (fVar2 != null) {
                sVar = fVar2.f2044d;
            } else {
                sVar = null;
            }
            if (sVar instanceof I6.x) {
                xVar = (I6.x) sVar;
            }
            if (xVar != null && (method = xVar.f2216a) != null) {
                return new C1722i(method);
            }
            throw new C0165x("Incorrect resolution sequence for Java method " + a3);
        }
        if (a3 instanceof R6.b) {
            C6.O h9 = ((R6.b) a3).h();
            if (h9 instanceof H6.f) {
                fVar = (H6.f) h9;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                obj = fVar.f2044d;
            }
            if (obj instanceof I6.r) {
                return new C1721h(((I6.r) obj).f2212a);
            }
            if (obj instanceof I6.o) {
                I6.o oVar = (I6.o) obj;
                if (oVar.f2208a.isAnnotation()) {
                    return new C1720g(oVar.f2208a);
                }
            }
            throw new C0165x("Incorrect resolution sequence for Java constructor " + a3 + " (" + obj + ')');
        }
        AbstractC0054n abstractC0054n = (AbstractC0054n) a3;
        if ((abstractC0054n.getName().equals(z6.n.f16795c) && AbstractC0898m.n(a3)) || ((abstractC0054n.getName().equals(z6.n.f16793a) && AbstractC0898m.n(a3)) || (o6.j.a(abstractC0054n.getName(), B6.a.f452e) && a3.z0().isEmpty()))) {
            return a(a3);
        }
        throw new C0165x("Unknown origin of " + a3 + " (" + a3.getClass() + ')');
    }
}
