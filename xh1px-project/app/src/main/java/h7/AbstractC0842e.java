package h7;

import C6.AbstractC0015p;
import C6.B;
import C6.EnumC0005f;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0009j;
import C6.InterfaceC0010k;
import C6.T;
import C6.W;
import F6.w;
import L7.C0165x;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import b6.C0535c;
import c7.InterfaceC0588g;
import f7.C0722b;
import f7.C0725e;
import h6.AbstractC0837b;
import i7.AbstractC0890e;
import i7.AbstractC0892g;
import j7.C0942a;
import j7.C0944c;
import j7.C0945d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import m1.InterfaceC1051a;
import m7.AbstractC1098d;
import n0.AbstractC1117G;
import n6.InterfaceC1163b;
import o6.v;
import org.xmlpull.v1.XmlPullParserException;
import p7.InterfaceC1333o;
import u6.InterfaceC1642c;
import u6.InterfaceC1643d;
import v7.C1679b;
import w6.C1724k;
import w6.C1725l;
import w6.C1726m;
import w6.C1727n;
import w6.C1728o;
import w6.F;
import w6.h0;
import w6.m0;
import w6.o0;
import w6.p0;
import w6.s0;
import w6.w0;
import w6.y0;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.C1756s;
import w7.C1761x;
import w7.E;
import w7.G;
import w7.M;
import w7.O;
import w7.U;
import w7.X;
import w7.z;
import x6.AbstractC1793A;
import x6.AbstractC1809m;
import x6.AbstractC1813q;
import x6.C1794B;
import x6.C1796D;
import x6.C1806j;
import x6.C1808l;
import x6.C1810n;
import x6.C1812p;
import x6.C1814r;
import x6.C1815s;
import x6.C1816t;
import x6.C1818v;
import x6.InterfaceC1803g;
import x6.x;
import x6.y;

/* renamed from: h7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0842e {
    public static final Class A(InterfaceC0010k interfaceC0010k) {
        if ((interfaceC0010k instanceof InterfaceC0004e) && AbstractC0892g.b(interfaceC0010k)) {
            InterfaceC0004e interfaceC0004e = (InterfaceC0004e) interfaceC0010k;
            Class k = y0.k(interfaceC0004e);
            if (k != null) {
                return k;
            }
            throw new C0165x("Class object for the class " + interfaceC0004e.getName() + " cannot be found (classId=" + AbstractC1098d.f((InterfaceC0007h) interfaceC0010k) + ')');
        }
        return null;
    }

    public static final Class B(AbstractC1759v abstractC1759v) {
        z i4;
        Class A2 = A(abstractC1759v.B0().c());
        if (A2 != null) {
            if (!U.e(abstractC1759v) || ((i4 = AbstractC0892g.i(abstractC1759v)) != null && !U.e(i4) && !z6.h.G(i4))) {
                return A2;
            }
            return null;
        }
        return null;
    }

    public static C0845h C(InterfaceC1163b interfaceC1163b) {
        o6.j.e(interfaceC1163b, "changeOptions");
        C0849l c0849l = new C0849l();
        interfaceC1163b.m(c0849l);
        c0849l.f11492a = true;
        return new C0845h(c0849l);
    }

    public static O D(O o7) {
        if (o7 instanceof C1756s) {
            C1756s c1756s = (C1756s) o7;
            T[] tArr = c1756s.f16010b;
            M[] mArr = c1756s.f16011c;
            o6.j.e(mArr, "<this>");
            o6.j.e(tArr, "other");
            int min = Math.min(mArr.length, tArr.length);
            ArrayList arrayList = new ArrayList(min);
            for (int i4 = 0; i4 < min; i4++) {
                arrayList.add(new Z5.j(mArr[i4], tArr[i4]));
            }
            ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Z5.j jVar = (Z5.j) it.next();
                arrayList2.add(h((M) jVar.f7485d, (T) jVar.f7486e));
            }
            return new C1756s(tArr, (M[]) arrayList2.toArray(new M[0]), true);
        }
        return new C0945d(o7, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, Z5.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC1803g a(h0 h0Var, boolean z8) {
        C1724k c1724k;
        Method method;
        InterfaceC1803g c1818v;
        d7.c cVar;
        InterfaceC1803g c1818v2;
        if (F.f15791d.c(h0Var.v().f15879h)) {
            return C1794B.f16228a;
        }
        C0722b c0722b = w0.f15923a;
        AbstractC0837b b4 = w0.b(h0Var.v().o());
        if (b4 instanceof C1727n) {
            C1727n c1727n = (C1727n) b4;
            InterfaceC0588g interfaceC0588g = c1727n.f15884d;
            d7.e eVar = c1727n.f15883c;
            Method method2 = null;
            if (z8) {
                if (eVar.i()) {
                    cVar = eVar.f10478h;
                    if (cVar != null) {
                        method2 = h0Var.v().f15877f.g(interfaceC0588g.getString(cVar.f10463f), interfaceC0588g.getString(cVar.f10464g));
                    }
                    if (method2 != null) {
                        if (AbstractC0892g.e(h0Var.v().o()) && o6.j.a(h0Var.v().o().d(), AbstractC0015p.f757d)) {
                            Class A2 = A(h0Var.v().o().q());
                            if (A2 != null) {
                                Method o7 = o(A2, h0Var.v().o());
                                if (h0Var.t()) {
                                    c1818v = new y(o7, l(h0Var));
                                } else {
                                    c1818v = new AbstractC1793A(o7, E2.d.y(o7.getDeclaringClass()));
                                }
                            } else {
                                throw new C0165x("Underlying property of inline class " + h0Var.v() + " should have a field");
                            }
                        } else {
                            Field field = (Field) h0Var.v().j.getValue();
                            if (field != null) {
                                c1818v = f(h0Var, z8, field);
                            } else {
                                throw new C0165x("No accessors or field is found for property " + h0Var.v());
                            }
                        }
                    } else {
                        if (!Modifier.isStatic(method2.getModifiers())) {
                            if (h0Var.t()) {
                                c1818v2 = new C1814r(method2, l(h0Var));
                            } else {
                                c1818v2 = new C1818v(0, method2);
                            }
                        } else if (h0Var.v().o().getAnnotations().a(y0.f15935a)) {
                            if (h0Var.t()) {
                                c1818v2 = new C1815s(method2);
                            } else {
                                c1818v2 = new C1818v(1, method2);
                            }
                        } else if (h0Var.t()) {
                            c1818v2 = new C1816t(method2, false, l(h0Var));
                        } else {
                            c1818v2 = new C1818v(2, method2);
                        }
                        c1818v = c1818v2;
                    }
                }
                cVar = null;
                if (cVar != null) {
                }
                if (method2 != null) {
                }
            } else {
                if ((eVar.f10475e & 8) == 8) {
                    cVar = eVar.f10479i;
                    if (cVar != null) {
                    }
                    if (method2 != null) {
                    }
                }
                cVar = null;
                if (cVar != null) {
                }
                if (method2 != null) {
                }
            }
        } else if (b4 instanceof C1725l) {
            c1818v = f(h0Var, z8, ((C1725l) b4).f15870a);
        } else if (b4 instanceof C1726m) {
            if (z8) {
                method = ((C1726m) b4).f15874a;
            } else {
                C1726m c1726m = (C1726m) b4;
                method = c1726m.f15875b;
                if (method == null) {
                    throw new C0165x("No source found for setter of Java method property: " + c1726m.f15874a);
                }
            }
            if (h0Var.t()) {
                c1818v = new C1814r(method, l(h0Var));
            } else {
                c1818v = new C1818v(0, method);
            }
        } else {
            if (b4 instanceof C1728o) {
                if (z8) {
                    c1724k = ((C1728o) b4).f15889a;
                } else {
                    c1724k = ((C1728o) b4).f15890b;
                    if (c1724k == null) {
                        throw new C0165x("No setter found for property " + h0Var.v());
                    }
                }
                F f8 = h0Var.v().f15877f;
                e7.e eVar2 = c1724k.f15866b;
                Method g8 = f8.g(eVar2.f10665e, eVar2.f10666f);
                if (g8 != null) {
                    Modifier.isStatic(g8.getModifiers());
                    if (h0Var.t()) {
                        return new C1814r(g8, l(h0Var));
                    }
                    return new C1818v(0, g8);
                }
                throw new C0165x("No accessor found for property " + h0Var.v());
            }
            throw new NoWhenBranchMatchedException();
        }
        return j(h0Var.u(), c1818v, false);
    }

    public static final boolean b(List list) {
        o6.j.e(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC1051a) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    public static AbstractC1117G d(TypedValue typedValue, AbstractC1117G abstractC1117G, AbstractC1117G abstractC1117G2, String str, String str2) {
        if (abstractC1117G != null && abstractC1117G != abstractC1117G2) {
            throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
        }
        if (abstractC1117G == null) {
            return abstractC1117G2;
        }
        return abstractC1117G;
    }

    public static final Object e(Object obj, InterfaceC0002c interfaceC0002c) {
        AbstractC1759v n3;
        Class B8;
        if ((!(interfaceC0002c instanceof C6.M) || !AbstractC0892g.e((W) interfaceC0002c)) && (n3 = n(interfaceC0002c)) != null && (B8 = B(n3)) != null) {
            return o(B8, interfaceC0002c).invoke(obj, null);
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if (e7.g.d(((u7.q) r0).f15440E) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (i7.AbstractC0890e.m(r1, C6.EnumC0005f.f745h) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final x f(h0 h0Var, boolean z8, Field field) {
        C6.M o7 = h0Var.v().o();
        InterfaceC0010k q6 = o7.q();
        o6.j.d(q6, "getContainingDeclaration(...)");
        boolean z9 = true;
        if (AbstractC0890e.l(q6)) {
            InterfaceC0010k q8 = q6.q();
            if (!AbstractC0890e.m(q8, EnumC0005f.f742e)) {
            }
            if (o7 instanceof u7.q) {
            }
        }
        if (Modifier.isStatic(field.getModifiers())) {
            boolean z10 = false;
            if (h0Var.v().o().getAnnotations().a(y0.f15935a)) {
                if (z8) {
                    if (h0Var.t()) {
                        return new AbstractC1809m(field, false);
                    }
                    return new C1808l(field, z9, 1);
                }
                if (h0Var.t()) {
                    return new AbstractC1813q(field, g(h0Var), false);
                }
                return new C1812p(field, g(h0Var), z9, 1);
            }
            if (z8) {
                return new C1808l(field, z10, 2);
            }
            return new C1812p(field, g(h0Var), z10, 2);
        }
        if (z8) {
            if (h0Var.t()) {
                return new C1806j(field, l(h0Var));
            }
            o6.j.e(field, "field");
            return new C1808l(field, z9, 0);
        }
        if (h0Var.t()) {
            return new C1810n(field, g(h0Var), l(h0Var));
        }
        boolean g8 = g(h0Var);
        o6.j.e(field, "field");
        return new C1812p(field, g8, z9, 0);
    }

    public static final boolean g(h0 h0Var) {
        return !U.e(h0Var.v().o().b());
    }

    public static final M h(M m6, T t8) {
        if (t8 != null && m6.a() != X.INVARIANT) {
            if (t8.e0() == m6.a()) {
                if (m6.c()) {
                    C1679b c1679b = v7.k.f15560e;
                    o6.j.d(c1679b, "NO_LOCKS");
                    return new E(new C1761x(c1679b, new B6.j(13, m6)));
                }
                return new E(m6.b());
            }
            C0944c c0944c = new C0944c(m6);
            G.f15953e.getClass();
            return new E(new C0942a(m6, c0944c, false, G.f15954f));
        }
        return m6;
    }

    public static final InterfaceC1803g j(InterfaceC0002c interfaceC0002c, InterfaceC1803g interfaceC1803g, boolean z8) {
        AbstractC1759v n3;
        o6.j.e(interfaceC0002c, "descriptor");
        if (!AbstractC0892g.a(interfaceC0002c)) {
            List W7 = interfaceC0002c.W();
            o6.j.d(W7, "getContextReceiverParameters(...)");
            if (!W7.isEmpty()) {
                Iterator it = W7.iterator();
                while (it.hasNext()) {
                    if (AbstractC0892g.g(((w) it.next()).b())) {
                        break;
                    }
                }
            }
            List z02 = interfaceC0002c.z0();
            o6.j.d(z02, "getValueParameters(...)");
            if (!z02.isEmpty()) {
                Iterator it2 = z02.iterator();
                while (it2.hasNext()) {
                    AbstractC1759v b4 = ((F6.U) it2.next()).b();
                    o6.j.d(b4, "getType(...)");
                    if (AbstractC0892g.g(b4)) {
                        break;
                    }
                }
            }
            AbstractC1759v r8 = interfaceC0002c.r();
            if ((r8 == null || !AbstractC0892g.c(r8)) && ((n3 = n(interfaceC0002c)) == null || !AbstractC0892g.g(n3))) {
                return interfaceC1803g;
            }
        }
        return new C1796D(interfaceC0002c, interfaceC1803g, z8);
    }

    public static final HashSet k(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set e9 = ((InterfaceC1333o) it.next()).e();
            if (e9 == null) {
                return null;
            }
            a6.q.f0(hashSet, e9);
        }
        return hashSet;
    }

    public static final Object l(h0 h0Var) {
        m0 v8 = h0Var.v();
        return e(v8.f15880i, v8.o());
    }

    public static final C0722b m(InterfaceC0588g interfaceC0588g, int i4) {
        o6.j.e(interfaceC0588g, "<this>");
        return E2.c.V(interfaceC0588g.q(i4), interfaceC0588g.o(i4));
    }

    public static final AbstractC1759v n(InterfaceC0002c interfaceC0002c) {
        InterfaceC0004e interfaceC0004e;
        w M8 = interfaceC0002c.M();
        w A2 = interfaceC0002c.A();
        if (M8 != null) {
            return M8.b();
        }
        if (A2 != null) {
            if (interfaceC0002c instanceof InterfaceC0009j) {
                return A2.b();
            }
            InterfaceC0010k q6 = interfaceC0002c.q();
            if (q6 instanceof InterfaceC0004e) {
                interfaceC0004e = (InterfaceC0004e) q6;
            } else {
                interfaceC0004e = null;
            }
            if (interfaceC0004e != null) {
                return interfaceC0004e.l();
            }
        }
        return null;
    }

    public static final Method o(Class cls, InterfaceC0002c interfaceC0002c) {
        o6.j.e(interfaceC0002c, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            o6.j.b(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new C0165x("No unbox method found in inline class: " + cls + " (calling " + interfaceC0002c + ')');
        }
    }

    public static final InterfaceC1642c p(o6.k kVar) {
        InterfaceC1643d c6 = ((o0) kVar).c();
        if (c6 != null) {
            return q(c6);
        }
        throw new C0165x("Cannot calculate JVM erasure for type: " + kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC1642c q(InterfaceC1643d interfaceC1643d) {
        InterfaceC0004e interfaceC0004e;
        if (interfaceC1643d instanceof InterfaceC1642c) {
            return (InterfaceC1642c) interfaceC1643d;
        }
        if (interfaceC1643d instanceof u6.t) {
            s0 s0Var = ((p0) ((u6.t) interfaceC1643d)).f15900e;
            u6.s sVar = p0.f15898g[0];
            Object a3 = s0Var.a();
            o6.j.d(a3, "getValue(...)");
            List list = (List) a3;
            Iterator it = list.iterator();
            while (true) {
                interfaceC0004e = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                o6.k kVar = (o6.k) next;
                o6.j.c(kVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                InterfaceC0007h c6 = ((o0) kVar).f15892a.B0().c();
                if (c6 instanceof InterfaceC0004e) {
                    interfaceC0004e = (InterfaceC0004e) c6;
                }
                if (interfaceC0004e != null && interfaceC0004e.e() != EnumC0005f.f742e && interfaceC0004e.e() != EnumC0005f.f745h) {
                    interfaceC0004e = next;
                    break;
                }
            }
            o6.k kVar2 = (o6.k) interfaceC0004e;
            if (kVar2 == null) {
                kVar2 = (o6.k) AbstractC0436k.r0(list);
            }
            if (kVar2 != null) {
                return p(kVar2);
            }
            return v.f13643a.b(Object.class);
        }
        throw new C0165x("Cannot calculate JVM erasure for type: " + interfaceC1643d);
    }

    public static final ArrayList r(z zVar) {
        ArrayList s8 = s(AbstractC1741c.b(zVar));
        if (s8 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(s8, 10));
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        InterfaceC0007h c6 = zVar.B0().c();
        o6.j.c(c6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class k = y0.k((InterfaceC0004e) c6);
        o6.j.b(k);
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(k.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final ArrayList s(z zVar) {
        ?? y4;
        B b4 = null;
        if (!AbstractC0892g.h(zVar)) {
            return null;
        }
        InterfaceC0007h c6 = zVar.B0().c();
        o6.j.c(c6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        int i4 = AbstractC1098d.f12556a;
        C6.U l02 = ((InterfaceC0004e) c6).l0();
        if (l02 instanceof B) {
            b4 = (B) l02;
        }
        o6.j.b(b4);
        ArrayList arrayList = b4.f711a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Z5.j jVar = (Z5.j) it.next();
            C0725e c0725e = (C0725e) jVar.f7485d;
            ArrayList s8 = s((z) jVar.f7486e);
            if (s8 != null) {
                y4 = new ArrayList(AbstractC0438m.d0(s8, 10));
                Iterator it2 = s8.iterator();
                while (it2.hasNext()) {
                    y4.add(c0725e.c() + '-' + ((String) it2.next()));
                }
            } else {
                y4 = E2.d.y(c0725e.c());
            }
            a6.q.f0(arrayList2, y4);
        }
        return arrayList2;
    }

    public static final C0725e t(InterfaceC0588g interfaceC0588g, int i4) {
        o6.j.e(interfaceC0588g, "<this>");
        return C0725e.d(interfaceC0588g.getString(i4));
    }

    public static final boolean x(AbstractC1759v abstractC1759v) {
        T t8;
        InterfaceC0007h c6 = abstractC1759v.B0().c();
        if (c6 == null || ((!AbstractC0892g.b(c6) || !AbstractC0892g.f(c6) || AbstractC1098d.g((InterfaceC0004e) c6).equals(z6.n.f16800h)) && !AbstractC0892g.h(abstractC1759v))) {
            InterfaceC0007h c9 = abstractC1759v.B0().c();
            if (c9 instanceof T) {
                t8 = (T) c9;
            } else {
                t8 = null;
            }
            if (t8 != null && x(AbstractC0405a.O(t8))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean y(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        o6.j.e(windowManager, "<this>");
        if (view != null && layoutParams != null) {
            try {
                windowManager.addView(view, layoutParams);
                return true;
            } catch (WindowManager.BadTokenException unused) {
                Log.e("WindowManagerExt", "Can't add view to window manager, permission is denied !");
            }
        }
        return false;
    }

    public static final void z(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        o6.j.e(windowManager, "<this>");
        o6.j.e(view, "view");
        try {
            windowManager.updateViewLayout(view, layoutParams);
        } catch (IllegalArgumentException unused) {
        }
    }

    public abstract void c(D0.c cVar, Object obj);

    public abstract String i();

    public void u(D0.a aVar, Object obj) {
        o6.j.e(aVar, "connection");
        if (obj == null) {
            return;
        }
        D0.c L8 = aVar.L(i());
        try {
            c(L8, obj);
            L8.H();
            AbstractC0837b.d(L8, null);
        } finally {
        }
    }

    public long v(D0.a aVar, Object obj) {
        o6.j.e(aVar, "connection");
        D0.c L8 = aVar.L(i());
        try {
            c(L8, obj);
            L8.H();
            AbstractC0837b.d(L8, null);
            return AbstractC0405a.J(aVar);
        } finally {
        }
    }

    public List w(D0.a aVar, Collection collection) {
        o6.j.e(aVar, "connection");
        if (collection == null) {
            return a6.s.f7766d;
        }
        C0535c i4 = E2.d.i();
        D0.c L8 = aVar.L(i());
        try {
            for (Object obj : collection) {
                if (obj != null) {
                    c(L8, obj);
                    L8.H();
                    L8.reset();
                    i4.add(Long.valueOf(AbstractC0405a.J(aVar)));
                } else {
                    i4.add(-1L);
                }
            }
            AbstractC0837b.d(L8, null);
            return E2.d.f(i4);
        } finally {
        }
    }
}
