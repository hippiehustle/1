package w6;

import C6.AbstractC0015p;
import C6.InterfaceC0002c;
import C6.InterfaceC0010k;
import I6.AbstractC0065d;
import L7.C0165x;
import a6.AbstractC0436k;
import f7.C0723c;
import f7.C0725e;
import java.lang.reflect.Array;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import o6.AbstractC1287f;
import o6.InterfaceC1285d;
import p7.InterfaceC1333o;
import s3.AbstractC1492c;
import t0.C1536c;

/* loaded from: classes.dex */
public abstract class F implements InterfaceC1285d {

    /* renamed from: d, reason: collision with root package name */
    public static final I7.k f15791d = new I7.k("<v#(\\d+)>");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    public static void e(ArrayList arrayList, ArrayList arrayList2, boolean z8) {
        GenericDeclaration genericDeclaration = AbstractC1287f.class;
        boolean a3 = o6.j.a(AbstractC0436k.y0(arrayList2), genericDeclaration);
        ArrayList arrayList3 = arrayList2;
        if (a3) {
            arrayList3 = arrayList2.subList(0, arrayList2.size() - 1);
        }
        arrayList.addAll(arrayList3);
        int size = (arrayList3.size() + 31) / 32;
        for (int i4 = 0; i4 < size; i4++) {
            Class cls = Integer.TYPE;
            o6.j.d(cls, "TYPE");
            arrayList.add(cls);
        }
        if (!z8) {
            genericDeclaration = Object.class;
        }
        arrayList.add(genericDeclaration);
    }

    public static Method o(Class cls, String str, Class[] clsArr, Class cls2, boolean z8) {
        Class L8;
        Method o7;
        if (z8) {
            clsArr[0] = cls;
        }
        Method r8 = r(cls, str, clsArr, cls2);
        if (r8 != null) {
            return r8;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (o7 = o(superclass, str, clsArr, cls2, z8)) != null) {
            return o7;
        }
        P.S g8 = o6.j.g(cls.getInterfaces());
        while (g8.hasNext()) {
            Class cls3 = (Class) g8.next();
            o6.j.b(cls3);
            Method o8 = o(cls3, str, clsArr, cls2, z8);
            if (o8 != null) {
                return o8;
            }
            if (z8 && (L8 = AbstractC1492c.L(AbstractC0065d.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method r9 = r(L8, str, clsArr, cls2);
                if (r9 != null) {
                    return r9;
                }
            }
        }
        return null;
    }

    public static Method r(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (o6.j.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            o6.j.d(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (o6.j.a(method.getName(), str) && o6.j.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final Method f(String str, String str2, boolean z8) {
        o6.j.e(str, "name");
        o6.j.e(str2, "desc");
        if (str.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z8) {
            arrayList.add(d());
        }
        C1536c p8 = p(str2, true);
        e(arrayList, (ArrayList) p8.f14808e, false);
        Class l6 = l();
        String concat = str.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class cls = (Class) p8.f14809f;
        o6.j.b(cls);
        return o(l6, concat, clsArr, cls, z8);
    }

    public final Method g(String str, String str2) {
        Method o7;
        o6.j.e(str, "name");
        o6.j.e(str2, "desc");
        if (!str.equals("<init>")) {
            C1536c p8 = p(str2, true);
            Class[] clsArr = (Class[]) ((ArrayList) p8.f14808e).toArray(new Class[0]);
            Class cls = (Class) p8.f14809f;
            o6.j.b(cls);
            Method o8 = o(l(), str, clsArr, cls, false);
            if (o8 != null) {
                return o8;
            }
            if (l().isInterface() && (o7 = o(Object.class, str, clsArr, cls, false)) != null) {
                return o7;
            }
            return null;
        }
        return null;
    }

    public abstract Collection h();

    public abstract Collection i(C0725e c0725e);

    public abstract C6.M j(int i4);

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List k(InterfaceC1333o interfaceC1333o, EnumC1712D enumC1712D) {
        AbstractC1731s abstractC1731s;
        boolean z8;
        o6.j.e(interfaceC1333o, "scope");
        g0.L l6 = new g0.L(22, this);
        Collection<InterfaceC0010k> d2 = h7.u.d(interfaceC1333o, null, 3);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0010k interfaceC0010k : d2) {
            if (interfaceC0010k instanceof InterfaceC0002c) {
                InterfaceC0002c interfaceC0002c = (InterfaceC0002c) interfaceC0010k;
                if (!o6.j.a(interfaceC0002c.d(), AbstractC0015p.f761h)) {
                    boolean z9 = true;
                    if (interfaceC0002c.e() != 2) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (enumC1712D != EnumC1712D.f15788d) {
                        z9 = false;
                    }
                    if (z8 == z9) {
                        abstractC1731s = (AbstractC1731s) interfaceC0010k.K(l6, Z5.y.f7506a);
                        if (abstractC1731s == null) {
                            arrayList.add(abstractC1731s);
                        }
                    }
                }
            }
            abstractC1731s = null;
            if (abstractC1731s == null) {
            }
        }
        return AbstractC0436k.Q0(arrayList);
    }

    public Class l() {
        Class d2 = d();
        List list = AbstractC0065d.f2192a;
        o6.j.e(d2, "<this>");
        Class cls = (Class) AbstractC0065d.f2194c.get(d2);
        if (cls == null) {
            return d();
        }
        return cls;
    }

    public abstract Collection n(C0725e c0725e);

    public final C1536c p(String str, boolean z8) {
        Class cls;
        int h02;
        ArrayList arrayList = new ArrayList();
        int i4 = 1;
        while (str.charAt(i4) != ')') {
            int i8 = i4;
            while (str.charAt(i8) == '[') {
                i8++;
            }
            char charAt = str.charAt(i8);
            if (I7.m.c0("VZCBSIFJD", charAt)) {
                h02 = i8 + 1;
            } else if (charAt == 'L') {
                h02 = I7.m.h0(str, ';', i4, 4) + 1;
            } else {
                throw new C0165x("Unknown type prefix in the method signature: ".concat(str));
            }
            arrayList.add(q(str, i4, h02));
            i4 = h02;
        }
        if (z8) {
            cls = q(str, i4 + 1, str.length());
        } else {
            cls = null;
        }
        return new C1536c(arrayList, 16, cls);
    }

    public final Class q(String str, int i4, int i8) {
        char charAt = str.charAt(i4);
        if (charAt != 'F') {
            if (charAt != 'L') {
                if (charAt != 'S') {
                    if (charAt != 'V') {
                        if (charAt != 'I') {
                            if (charAt != 'J') {
                                if (charAt != 'Z') {
                                    if (charAt != '[') {
                                        switch (charAt) {
                                            case 'B':
                                                return Byte.TYPE;
                                            case 'C':
                                                return Character.TYPE;
                                            case 'D':
                                                return Double.TYPE;
                                            default:
                                                throw new C0165x("Unknown type prefix in the method signature: ".concat(str));
                                        }
                                    }
                                    Class q6 = q(str, i4 + 1, i8);
                                    C0723c c0723c = y0.f15935a;
                                    o6.j.e(q6, "<this>");
                                    return Array.newInstance((Class<?>) q6, 0).getClass();
                                }
                                return Boolean.TYPE;
                            }
                            return Long.TYPE;
                        }
                        return Integer.TYPE;
                    }
                    Class cls = Void.TYPE;
                    o6.j.d(cls, "TYPE");
                    return cls;
                }
                return Short.TYPE;
            }
            ClassLoader d2 = AbstractC0065d.d(d());
            String substring = str.substring(i4 + 1, i8 - 1);
            o6.j.d(substring, "substring(...)");
            Class<?> loadClass = d2.loadClass(I7.v.Y(substring, '/', '.'));
            o6.j.d(loadClass, "loadClass(...)");
            return loadClass;
        }
        return Float.TYPE;
    }
}
