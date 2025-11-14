package C6;

import a6.AbstractC0436k;
import a6.AbstractC0438m;
import f7.C0722b;
import f7.C0723c;
import f7.C0724d;
import f7.C0725e;
import i7.AbstractC0890e;
import i7.AbstractC0898m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC1098d;
import m7.C1096b;
import p7.C1329k;
import p7.InterfaceC1333o;

/* renamed from: C6.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0021w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0024z f776a = new C0024z("InvalidModuleNotifier", 0);

    public static final A4.c a(w7.z zVar, InterfaceC0008i interfaceC0008i, int i4) {
        InterfaceC0008i interfaceC0008i2 = null;
        if (interfaceC0008i == null || y7.l.f(interfaceC0008i)) {
            return null;
        }
        int size = interfaceC0008i.t().size() + i4;
        if (!interfaceC0008i.d0()) {
            if (size != zVar.r0().size()) {
                AbstractC0890e.n(interfaceC0008i);
            }
            return new A4.c(interfaceC0008i, zVar.r0().subList(i4, zVar.r0().size()), null);
        }
        List subList = zVar.r0().subList(i4, size);
        InterfaceC0010k q6 = interfaceC0008i.q();
        if (q6 instanceof InterfaceC0008i) {
            interfaceC0008i2 = (InterfaceC0008i) q6;
        }
        return new A4.c(interfaceC0008i, subList, a(zVar, interfaceC0008i2, size));
    }

    public static final void b(I i4, C0723c c0723c, ArrayList arrayList) {
        o6.j.e(i4, "<this>");
        o6.j.e(c0723c, "fqName");
        i4.a(c0723c, arrayList);
    }

    public static final List c(InterfaceC0008i interfaceC0008i) {
        H7.k cVar;
        H7.k cVar2;
        List list;
        Object obj;
        w7.J B8;
        List t8 = interfaceC0008i.t();
        o6.j.d(t8, "getDeclaredTypeParameters(...)");
        if (!interfaceC0008i.d0() && !(interfaceC0008i.q() instanceof InterfaceC0001b)) {
            return t8;
        }
        int i4 = AbstractC1098d.f12556a;
        C1096b c1096b = C1096b.f12553e;
        H7.k T5 = H7.m.T(interfaceC0008i, c1096b);
        if (T5 instanceof H7.d) {
            cVar = ((H7.d) T5).a();
        } else {
            cVar = new H7.c(T5, 1);
        }
        List Y = H7.m.Y(new H7.h(new H7.g(new H7.j(cVar, r.f770g), true, r.f771h), r.f772i, H7.r.f2078l));
        H7.k T8 = H7.m.T(interfaceC0008i, c1096b);
        if (T8 instanceof H7.d) {
            cVar2 = ((H7.d) T8).a();
        } else {
            cVar2 = new H7.c(T8, 1);
        }
        Iterator it = cVar2.iterator();
        while (true) {
            list = null;
            if (it.hasNext()) {
                obj = it.next();
                if (obj instanceof InterfaceC0004e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC0004e interfaceC0004e = (InterfaceC0004e) obj;
        if (interfaceC0004e != null && (B8 = interfaceC0004e.B()) != null) {
            list = B8.e();
        }
        if (list == null) {
            list = a6.s.f7766d;
        }
        if (Y.isEmpty() && list.isEmpty()) {
            List t9 = interfaceC0008i.t();
            o6.j.d(t9, "getDeclaredTypeParameters(...)");
            return t9;
        }
        ArrayList C02 = AbstractC0436k.C0(Y, list);
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(C02, 10));
        Iterator it2 = C02.iterator();
        while (it2.hasNext()) {
            T t10 = (T) it2.next();
            o6.j.b(t10);
            arrayList.add(new C0003d(t10, interfaceC0008i, t8.size()));
        }
        return AbstractC0436k.C0(t8, arrayList);
    }

    public static final InterfaceC0004e d(A a3, C0722b c0722b) {
        o6.j.e(a3, "<this>");
        o6.j.e(c0722b, "classId");
        InterfaceC0007h e9 = e(a3, c0722b);
        if (e9 instanceof InterfaceC0004e) {
            return (InterfaceC0004e) e9;
        }
        return null;
    }

    public static final InterfaceC0007h e(A a3, C0722b c0722b) {
        o6.j.e(a3, "<this>");
        o6.j.e(c0722b, "classId");
        if (a3.m0(AbstractC0898m.f11787a) == null) {
            J U8 = a3.U(c0722b.f10793a);
            C0724d c0724d = c0722b.f10794b.f10797a;
            c0724d.getClass();
            List e9 = C0724d.e(c0724d);
            C1329k c1329k = ((F6.y) U8).k;
            C0725e c0725e = (C0725e) AbstractC0436k.p0(e9);
            K6.b bVar = K6.b.j;
            InterfaceC0007h d2 = c1329k.d(c0725e, bVar);
            if (d2 != null) {
                for (C0725e c0725e2 : e9.subList(1, e9.size())) {
                    if (d2 instanceof InterfaceC0004e) {
                        InterfaceC0007h d3 = ((InterfaceC0004e) d2).k0().d(c0725e2, bVar);
                        if (d3 instanceof InterfaceC0004e) {
                            d2 = (InterfaceC0004e) d3;
                        } else {
                            d2 = null;
                        }
                        if (d2 != null) {
                        }
                    }
                }
                return d2;
            }
            return null;
        }
        throw new ClassCastException();
    }

    public static final InterfaceC0004e f(A a3, C0722b c0722b, A4.a aVar) {
        o6.j.e(a3, "<this>");
        o6.j.e(c0722b, "classId");
        o6.j.e(aVar, "notFoundClasses");
        InterfaceC0004e d2 = d(a3, c0722b);
        if (d2 != null) {
            return d2;
        }
        return aVar.i(c0722b, H7.m.Y(H7.m.W(H7.m.T(c0722b, C0017s.k), r.f768e)));
    }

    public static final InterfaceC0007h g(InterfaceC0010k interfaceC0010k) {
        o6.j.e(interfaceC0010k, "<this>");
        InterfaceC0010k q6 = interfaceC0010k.q();
        if (q6 == null || (interfaceC0010k instanceof F)) {
            return null;
        }
        if (!(q6.q() instanceof F)) {
            return g(q6);
        }
        if (q6 instanceof InterfaceC0007h) {
            return (InterfaceC0007h) q6;
        }
        return null;
    }

    public static final boolean h(I i4, C0723c c0723c) {
        o6.j.e(i4, "<this>");
        o6.j.e(c0723c, "fqName");
        return i4.b(c0723c);
    }

    public static final ArrayList i(I i4, C0723c c0723c) {
        o6.j.e(i4, "<this>");
        o6.j.e(c0723c, "fqName");
        ArrayList arrayList = new ArrayList();
        b(i4, c0723c, arrayList);
        return arrayList;
    }

    public static final InterfaceC0004e j(A a3, C0723c c0723c) {
        InterfaceC0004e interfaceC0004e;
        InterfaceC0007h interfaceC0007h;
        InterfaceC1333o k02;
        o6.j.e(a3, "<this>");
        o6.j.e(c0723c, "fqName");
        C0724d c0724d = c0723c.f10797a;
        if (!c0724d.c()) {
            C1329k c1329k = ((F6.y) a3.U(c0723c.b())).k;
            C0725e f8 = c0724d.f();
            K6.b bVar = K6.b.f2730d;
            InterfaceC0007h d2 = c1329k.d(f8, bVar);
            if (d2 instanceof InterfaceC0004e) {
                interfaceC0004e = (InterfaceC0004e) d2;
            } else {
                interfaceC0004e = null;
            }
            if (interfaceC0004e != null) {
                return interfaceC0004e;
            }
            InterfaceC0004e j = j(a3, c0723c.b());
            if (j != null && (k02 = j.k0()) != null) {
                interfaceC0007h = k02.d(c0724d.f(), bVar);
            } else {
                interfaceC0007h = null;
            }
            if (interfaceC0007h instanceof InterfaceC0004e) {
                return (InterfaceC0004e) interfaceC0007h;
            }
        }
        return null;
    }
}
