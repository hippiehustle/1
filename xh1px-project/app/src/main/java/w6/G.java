package w6;

import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0009j;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import L7.C0165x;
import a6.AbstractC0438m;
import f7.C0722b;
import h7.AbstractC0842e;
import i7.AbstractC0892g;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m7.AbstractC1098d;
import n6.InterfaceC1162a;
import x6.C1795C;
import x6.C1799c;
import x6.C1814r;
import x6.C1815s;
import x6.C1818v;
import x6.EnumC1797a;
import x6.EnumC1798b;

/* loaded from: classes.dex */
public final class G implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15792d;

    /* renamed from: e, reason: collision with root package name */
    public final H f15793e;

    public /* synthetic */ G(H h8, int i4) {
        this.f15792d = i4;
        this.f15793e = h8;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
    @Override // n6.InterfaceC1162a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        x6.x v8;
        GenericDeclaration genericDeclaration;
        x6.x xVar;
        x6.x c1818v;
        Object obj;
        InterfaceC0019u interfaceC0019u;
        int i4 = this.f15792d;
        Object obj2 = null;
        H h8 = this.f15793e;
        switch (i4) {
            case 0:
                C0722b c0722b = w0.f15923a;
                InterfaceC0019u o7 = h8.o();
                F f8 = h8.f15795f;
                h4.g c6 = w0.c(o7);
                boolean z8 = c6 instanceof C1723j;
                EnumC1797a enumC1797a = EnumC1797a.f16241e;
                if (z8) {
                    if (h8.s()) {
                        Class d2 = f8.d();
                        List r8 = h8.r();
                        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(r8, 10));
                        Iterator it = r8.iterator();
                        while (it.hasNext()) {
                            String b4 = ((W) ((u6.l) it.next())).b();
                            o6.j.b(b4);
                            arrayList.add(b4);
                        }
                        return new C1799c(d2, arrayList, enumC1797a);
                    }
                    String str = ((C1723j) c6).f15861b.f10666f;
                    f8.getClass();
                    o6.j.e(str, "desc");
                    Class d3 = f8.d();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) f8.p(str, false).f14808e).toArray(new Class[0]);
                        obj2 = d3.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    } catch (NoSuchMethodException unused) {
                    }
                } else if (c6 instanceof C1724k) {
                    InterfaceC0019u o8 = h8.o();
                    InterfaceC0010k q6 = o8.q();
                    o6.j.d(q6, "getContainingDeclaration(...)");
                    if (AbstractC0892g.d(q6) && (o8 instanceof InterfaceC0009j) && ((InterfaceC0009j) o8).I()) {
                        InterfaceC0019u o9 = h8.o();
                        String str2 = ((C1724k) c6).f15866b.f10666f;
                        List z02 = h8.o().z0();
                        o6.j.d(z02, "getValueParameters(...)");
                        return new C1795C(o9, f8, str2, z02);
                    }
                    e7.e eVar = ((C1724k) c6).f15866b;
                    obj2 = f8.g(eVar.f10665e, eVar.f10666f);
                } else if (c6 instanceof C1722i) {
                    obj2 = ((C1722i) c6).f15858b;
                    o6.j.c(obj2, "null cannot be cast to non-null type java.lang.reflect.Member");
                } else if (c6 instanceof C1721h) {
                    obj2 = ((C1721h) c6).f15857b;
                    o6.j.c(obj2, "null cannot be cast to non-null type java.lang.reflect.Member");
                } else {
                    if (c6 instanceof C1720g) {
                        List list = ((C1720g) c6).f15854b;
                        Class d9 = f8.d();
                        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new C1799c(d9, arrayList2, enumC1797a, EnumC1798b.f16243d, list);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (obj2 instanceof Constructor) {
                    v8 = h8.u((Constructor) obj2, h8.o(), false);
                } else if (obj2 instanceof Method) {
                    Method method = (Method) obj2;
                    if (!Modifier.isStatic(method.getModifiers())) {
                        if (h8.t()) {
                            v8 = new C1814r(method, AbstractC0842e.e(h8.f15797h, h8.o()));
                        } else {
                            v8 = new C1818v(0, method);
                        }
                    } else if (((D6.b) h8.o()).getAnnotations().e(y0.f15935a) != null) {
                        if (h8.t()) {
                            v8 = new C1815s(method);
                        } else {
                            v8 = new C1818v(1, method);
                        }
                    } else {
                        v8 = h8.v(method, false);
                    }
                } else {
                    throw new C0165x("Could not compute caller for function: " + h8.o() + " (member = " + obj2 + ')');
                }
                return AbstractC0842e.j(h8.o(), v8, false);
            default:
                C0722b c0722b2 = w0.f15923a;
                InterfaceC0019u o10 = h8.o();
                F f9 = h8.f15795f;
                h4.g c9 = w0.c(o10);
                if (c9 instanceof C1724k) {
                    InterfaceC0019u o11 = h8.o();
                    InterfaceC0010k q8 = o11.q();
                    o6.j.d(q8, "getContainingDeclaration(...)");
                    if (AbstractC0892g.d(q8) && (o11 instanceof InterfaceC0009j) && ((InterfaceC0009j) o11).I()) {
                        throw new C0165x(h8.o().q() + " cannot have default arguments");
                    }
                    InterfaceC0019u o12 = h8.o();
                    List z03 = o12.z0();
                    o6.j.d(z03, "getValueParameters(...)");
                    if (!z03.isEmpty()) {
                        Iterator it3 = z03.iterator();
                        while (it3.hasNext()) {
                            if (((F6.U) it3.next()).N0()) {
                                interfaceC0019u = null;
                                if (interfaceC0019u != null) {
                                    e7.e eVar2 = ((C1724k) w0.c(interfaceC0019u)).f15866b;
                                    genericDeclaration = f9.f(eVar2.f10665e, eVar2.f10666f, true);
                                } else {
                                    e7.e eVar3 = ((C1724k) c9).f15866b;
                                    String str3 = eVar3.f10665e;
                                    String str4 = eVar3.f10666f;
                                    o6.j.b(h8.h().b());
                                    genericDeclaration = f9.f(str3, str4, !Modifier.isStatic(r3.getModifiers()));
                                }
                            }
                        }
                    }
                    InterfaceC0010k q9 = o12.q();
                    o6.j.d(q9, "getContainingDeclaration(...)");
                    if (AbstractC0892g.f(q9)) {
                        Member b9 = h8.h().b();
                        o6.j.b(b9);
                        if (Modifier.isStatic(b9.getModifiers())) {
                            H7.f fVar = new H7.f(AbstractC1098d.l(o12));
                            while (true) {
                                if (fVar.hasNext()) {
                                    obj = fVar.next();
                                    List z04 = ((InterfaceC0002c) obj).z0();
                                    o6.j.d(z04, "getValueParameters(...)");
                                    if (!z04.isEmpty()) {
                                        Iterator it4 = z04.iterator();
                                        while (it4.hasNext()) {
                                            if (((F6.U) it4.next()).N0()) {
                                            }
                                        }
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj instanceof InterfaceC0019u) {
                                interfaceC0019u = (InterfaceC0019u) obj;
                                if (interfaceC0019u != null) {
                                }
                            }
                        }
                    }
                    interfaceC0019u = null;
                    if (interfaceC0019u != null) {
                    }
                } else {
                    boolean z9 = c9 instanceof C1723j;
                    EnumC1797a enumC1797a2 = EnumC1797a.f16240d;
                    if (z9) {
                        if (h8.s()) {
                            Class d10 = f9.d();
                            List r9 = h8.r();
                            ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(r9, 10));
                            Iterator it5 = r9.iterator();
                            while (it5.hasNext()) {
                                String b10 = ((W) ((u6.l) it5.next())).b();
                                o6.j.b(b10);
                                arrayList3.add(b10);
                            }
                            return new C1799c(d10, arrayList3, enumC1797a2);
                        }
                        String str5 = ((C1723j) c9).f15861b.f10666f;
                        f9.getClass();
                        o6.j.e(str5, "desc");
                        Class d11 = f9.d();
                        ArrayList arrayList4 = new ArrayList();
                        F.e(arrayList4, (ArrayList) f9.p(str5, false).f14808e, true);
                        try {
                            Class[] clsArr2 = (Class[]) arrayList4.toArray(new Class[0]);
                            genericDeclaration = d11.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                        } catch (NoSuchMethodException unused2) {
                        }
                    } else if (c9 instanceof C1720g) {
                        List list2 = ((C1720g) c9).f15854b;
                        Class d12 = f9.d();
                        ArrayList arrayList5 = new ArrayList(AbstractC0438m.d0(list2, 10));
                        Iterator it6 = list2.iterator();
                        while (it6.hasNext()) {
                            arrayList5.add(((Method) it6.next()).getName());
                        }
                        return new C1799c(d12, arrayList5, enumC1797a2, EnumC1798b.f16243d, list2);
                    }
                    genericDeclaration = null;
                }
                if (genericDeclaration instanceof Constructor) {
                    xVar = h8.u((Constructor) genericDeclaration, h8.o(), true);
                } else if (genericDeclaration instanceof Method) {
                    if (((D6.b) h8.o()).getAnnotations().e(y0.f15935a) != null) {
                        InterfaceC0010k q10 = h8.o().q();
                        o6.j.c(q10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        if (!((InterfaceC0004e) q10).E()) {
                            Method method2 = (Method) genericDeclaration;
                            if (h8.t()) {
                                c1818v = new C1815s(method2);
                            } else {
                                c1818v = new C1818v(1, method2);
                            }
                            xVar = c1818v;
                        }
                    }
                    xVar = h8.v((Method) genericDeclaration, h8.h().c());
                } else {
                    xVar = null;
                }
                if (xVar == null) {
                    return null;
                }
                return AbstractC0842e.j(h8.o(), xVar, true);
        }
    }
}
