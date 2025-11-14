package w6;

import C6.InterfaceC0001b;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import I6.AbstractC0065d;
import I6.C0066e;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import a7.C0439A;
import c7.AbstractC0582a;
import c7.C0590i;
import c7.InterfaceC0588g;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import g7.AbstractC0803l;
import i7.AbstractC0892g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k7.C0995a;
import kotlin.NoWhenBranchMatchedException;
import m7.AbstractC1098d;
import n6.InterfaceC1164c;
import o.p1;
import s3.AbstractC1492c;
import s7.C1518i;
import u6.InterfaceC1641b;
import u7.InterfaceC1657j;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0723c f15935a = new C0723c("kotlin.jvm.JvmStatic");

    public static final AbstractC1731s a(InterfaceC1641b interfaceC1641b) {
        AbstractC1731s abstractC1731s;
        if (interfaceC1641b instanceof AbstractC1731s) {
            abstractC1731s = (AbstractC1731s) interfaceC1641b;
        } else {
            abstractC1731s = null;
        }
        if (abstractC1731s == null) {
            H b4 = b(interfaceC1641b);
            if (b4 != null) {
                return b4;
            }
            return c(interfaceC1641b);
        }
        return abstractC1731s;
    }

    public static final H b(Object obj) {
        H h8;
        o6.i iVar;
        InterfaceC1641b interfaceC1641b;
        if (obj instanceof H) {
            h8 = (H) obj;
        } else {
            h8 = null;
        }
        if (h8 == null) {
            if (obj instanceof o6.i) {
                iVar = (o6.i) obj;
            } else {
                iVar = null;
            }
            if (iVar != null) {
                interfaceC1641b = iVar.f13628d;
                if (interfaceC1641b == null) {
                    interfaceC1641b = iVar.f();
                    iVar.f13628d = interfaceC1641b;
                }
            } else {
                interfaceC1641b = null;
            }
            if (!(interfaceC1641b instanceof H)) {
                return null;
            }
            return (H) interfaceC1641b;
        }
        return h8;
    }

    public static final m0 c(Object obj) {
        m0 m0Var;
        o6.q qVar;
        InterfaceC1641b interfaceC1641b;
        if (obj instanceof m0) {
            m0Var = (m0) obj;
        } else {
            m0Var = null;
        }
        if (m0Var == null) {
            if (obj instanceof o6.q) {
                qVar = (o6.q) obj;
            } else {
                qVar = null;
            }
            if (qVar != null) {
                interfaceC1641b = qVar.h();
            } else {
                interfaceC1641b = null;
            }
            if (!(interfaceC1641b instanceof m0)) {
                return null;
            }
            return (m0) interfaceC1641b;
        }
        return m0Var;
    }

    public static final List d(InterfaceC0001b interfaceC0001b) {
        Annotation j;
        C0066e c0066e;
        o6.j.e(interfaceC0001b, "<this>");
        D6.j<D6.c> annotations = interfaceC0001b.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (D6.c cVar : annotations) {
            C6.O h8 = cVar.h();
            if (h8 instanceof H6.a) {
                j = ((H6.a) h8).f2036d;
            } else if (h8 instanceof H6.f) {
                I6.s sVar = ((H6.f) h8).f2044d;
                if (sVar instanceof C0066e) {
                    c0066e = (C0066e) sVar;
                } else {
                    c0066e = null;
                }
                if (c0066e != null) {
                    j = c0066e.f2196a;
                } else {
                    j = null;
                }
            } else {
                j = j(cVar);
            }
            if (j != null) {
                arrayList.add(j);
            }
        }
        return m(arrayList);
    }

    public static final Object e(Type type) {
        o6.j.e(type, "type");
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (cls.equals(Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (cls.equals(Character.TYPE)) {
                    return (char) 0;
                }
                if (cls.equals(Byte.TYPE)) {
                    return (byte) 0;
                }
                if (cls.equals(Short.TYPE)) {
                    return (short) 0;
                }
                if (cls.equals(Integer.TYPE)) {
                    return 0;
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (cls.equals(Long.TYPE)) {
                    return 0L;
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (cls.equals(Void.TYPE)) {
                    throw new IllegalStateException("Parameter with void type is illegal");
                }
                throw new UnsupportedOperationException("Unknown primitive: " + type);
            }
            return null;
        }
        return null;
    }

    public static final InterfaceC0001b f(Class cls, AbstractC0803l abstractC0803l, InterfaceC0588g interfaceC0588g, F6.B b4, AbstractC0582a abstractC0582a, InterfaceC1164c interfaceC1164c) {
        List list;
        o6.j.e(cls, "moduleAnchor");
        o6.j.e(abstractC0803l, "proto");
        o6.j.e(interfaceC0588g, "nameResolver");
        o6.j.e(abstractC0582a, "metadataVersion");
        H6.e a3 = r0.a(cls);
        if (abstractC0803l instanceof C0439A) {
            list = ((C0439A) abstractC0803l).f7783l;
        } else if (abstractC0803l instanceof a7.I) {
            list = ((a7.I) abstractC0803l).f7859l;
        } else {
            throw new IllegalStateException(("Unsupported message: " + abstractC0803l).toString());
        }
        List list2 = list;
        C1518i c1518i = a3.f2042a;
        C6.A a4 = c1518i.f14574b;
        C0590i c0590i = C0590i.f9728b;
        o6.j.b(list2);
        return (InterfaceC0001b) interfaceC1164c.l(new s7.s(new F3.m(c1518i, interfaceC0588g, a4, b4, c0590i, abstractC0582a, (InterfaceC1657j) null, (p1) null, list2)), abstractC0803l);
    }

    public static final F6.w g(InterfaceC0001b interfaceC0001b) {
        o6.j.e(interfaceC0001b, "<this>");
        if (interfaceC0001b.A() != null) {
            InterfaceC0010k q6 = interfaceC0001b.q();
            o6.j.c(q6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return ((InterfaceC0004e) q6).F0();
        }
        return null;
    }

    public static final boolean h(o0 o0Var) {
        AbstractC1759v abstractC1759v = o0Var.f15892a;
        if (abstractC1759v != null && AbstractC0892g.h(abstractC1759v)) {
            return true;
        }
        return false;
    }

    public static final Class i(ClassLoader classLoader, C0722b c0722b, int i4) {
        o6.j.e(c0722b, "kotlinClassId");
        String str = B6.d.f457a;
        C0722b f8 = B6.d.f(c0722b.a().f10797a);
        if (f8 == null) {
            f8 = c0722b;
        }
        if (!f8.equals(c0722b)) {
            classLoader = AbstractC0065d.d(Z5.y.class);
        }
        String str2 = f8.f10793a.f10797a.f10800a;
        String str3 = f8.f10794b.f10797a.f10800a;
        if (o6.j.a(str2, "kotlin")) {
            switch (str3.hashCode()) {
                case -901856463:
                    if (str3.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str3.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str3.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str3.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str3.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str3.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str3.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str3.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str3.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i4 > 0) {
            for (int i8 = 0; i8 < i4; i8++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str2.length() > 0) {
            sb.append(str2.concat("."));
        }
        sb.append(I7.v.Y(str3, '.', '$'));
        if (i4 > 0) {
            sb.append(";");
        }
        return AbstractC1492c.L(classLoader, sb.toString());
    }

    public static final Annotation j(D6.c cVar) {
        Class cls;
        Z5.j jVar;
        InterfaceC0004e d2 = AbstractC1098d.d(cVar);
        if (d2 != null) {
            cls = k(d2);
        } else {
            cls = null;
        }
        if (cls == null) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        Set<Map.Entry> entrySet = cVar.c().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            C0725e c0725e = (C0725e) entry.getKey();
            k7.g gVar = (k7.g) entry.getValue();
            ClassLoader classLoader = cls.getClassLoader();
            o6.j.d(classLoader, "getClassLoader(...)");
            Object l6 = l(gVar, classLoader);
            if (l6 != null) {
                jVar = new Z5.j(c0725e.b(), l6);
            } else {
                jVar = null;
            }
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        Map R02 = a6.x.R0(arrayList);
        Set keySet = R02.keySet();
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        return (Annotation) h4.g.f(cls, R02, arrayList2);
    }

    public static final Class k(InterfaceC0004e interfaceC0004e) {
        o6.j.e(interfaceC0004e, "<this>");
        C6.O h8 = interfaceC0004e.h();
        o6.j.d(h8, "getSource(...)");
        if (h8 instanceof Y6.o) {
            return ((Y6.o) h8).f7236d.f2037a;
        }
        if (h8 instanceof H6.f) {
            I6.s sVar = ((H6.f) h8).f2044d;
            o6.j.c(sVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((I6.o) sVar).f2208a;
        }
        C0722b f8 = AbstractC1098d.f(interfaceC0004e);
        if (f8 == null) {
            return null;
        }
        return i(AbstractC0065d.d(interfaceC0004e.getClass()), f8, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object l(k7.g gVar, ClassLoader classLoader) {
        InterfaceC0004e interfaceC0004e;
        k7.x xVar;
        AbstractC1759v abstractC1759v;
        z6.j s8;
        int i4;
        InterfaceC0004e interfaceC0004e2;
        Class i8;
        if (gVar instanceof C0995a) {
            return j((D6.c) ((C0995a) gVar).f12144a);
        }
        int i9 = 0;
        if (gVar instanceof k7.b) {
            k7.b bVar = (k7.b) gVar;
            if (bVar instanceof k7.x) {
                xVar = (k7.x) bVar;
            } else {
                xVar = null;
            }
            if (xVar != null && (abstractC1759v = xVar.f12153c) != null) {
                Object obj = bVar.f12144a;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(l((k7.g) it.next(), classLoader));
                }
                C0725e c0725e = z6.h.f16714e;
                InterfaceC0007h c6 = abstractC1759v.B0().c();
                if (c6 == null) {
                    s8 = null;
                } else {
                    s8 = z6.h.s(c6);
                }
                if (s8 == null) {
                    i4 = -1;
                } else {
                    i4 = x0.f15925a[s8.ordinal()];
                }
                switch (i4) {
                    case -1:
                        if (z6.h.z(abstractC1759v)) {
                            AbstractC1759v b4 = ((w7.M) AbstractC0436k.G0(abstractC1759v.r0())).b();
                            o6.j.d(b4, "getType(...)");
                            InterfaceC0007h c9 = b4.B0().c();
                            if (c9 instanceof InterfaceC0004e) {
                                interfaceC0004e2 = (InterfaceC0004e) c9;
                            } else {
                                interfaceC0004e2 = null;
                            }
                            if (interfaceC0004e2 != null) {
                                if (z6.h.H(b4)) {
                                    int size = ((List) obj).size();
                                    String[] strArr = new String[size];
                                    while (i9 < size) {
                                        Object obj2 = arrayList.get(i9);
                                        o6.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                                        strArr[i9] = obj2;
                                        i9++;
                                    }
                                    return strArr;
                                }
                                if (z6.h.b(interfaceC0004e2, z6.m.f16753Q)) {
                                    int size2 = ((List) obj).size();
                                    Class[] clsArr = new Class[size2];
                                    while (i9 < size2) {
                                        Object obj3 = arrayList.get(i9);
                                        o6.j.c(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                                        clsArr[i9] = obj3;
                                        i9++;
                                    }
                                    return clsArr;
                                }
                                C0722b f8 = AbstractC1098d.f(interfaceC0004e2);
                                if (f8 != null && (i8 = i(classLoader, f8, 0)) != null) {
                                    Object newInstance = Array.newInstance((Class<?>) i8, ((List) obj).size());
                                    o6.j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                                    Object[] objArr = (Object[]) newInstance;
                                    int size3 = arrayList.size();
                                    while (i9 < size3) {
                                        objArr[i9] = arrayList.get(i9);
                                        i9++;
                                    }
                                    return objArr;
                                }
                            } else {
                                throw new IllegalStateException(("Not a class type: " + b4).toString());
                            }
                        } else {
                            throw new IllegalStateException(("Not an array type: " + abstractC1759v).toString());
                        }
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i9 < size4) {
                            Object obj4 = arrayList.get(i9);
                            o6.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            zArr[i9] = ((Boolean) obj4).booleanValue();
                            i9++;
                        }
                        return zArr;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i9 < size5) {
                            Object obj5 = arrayList.get(i9);
                            o6.j.c(obj5, "null cannot be cast to non-null type kotlin.Char");
                            cArr[i9] = ((Character) obj5).charValue();
                            i9++;
                        }
                        return cArr;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i9 < size6) {
                            Object obj6 = arrayList.get(i9);
                            o6.j.c(obj6, "null cannot be cast to non-null type kotlin.Byte");
                            bArr[i9] = ((Byte) obj6).byteValue();
                            i9++;
                        }
                        return bArr;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i9 < size7) {
                            Object obj7 = arrayList.get(i9);
                            o6.j.c(obj7, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i9] = ((Short) obj7).shortValue();
                            i9++;
                        }
                        return sArr;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i9 < size8) {
                            Object obj8 = arrayList.get(i9);
                            o6.j.c(obj8, "null cannot be cast to non-null type kotlin.Int");
                            iArr[i9] = ((Integer) obj8).intValue();
                            i9++;
                        }
                        return iArr;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i9 < size9) {
                            Object obj9 = arrayList.get(i9);
                            o6.j.c(obj9, "null cannot be cast to non-null type kotlin.Float");
                            fArr[i9] = ((Float) obj9).floatValue();
                            i9++;
                        }
                        return fArr;
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i9 < size10) {
                            Object obj10 = arrayList.get(i9);
                            o6.j.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                            jArr[i9] = ((Long) obj10).longValue();
                            i9++;
                        }
                        return jArr;
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i9 < size11) {
                            Object obj11 = arrayList.get(i9);
                            o6.j.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            dArr[i9] = ((Double) obj11).doubleValue();
                            i9++;
                        }
                        return dArr;
                }
            }
        } else if (gVar instanceof k7.i) {
            Z5.j jVar = (Z5.j) ((k7.i) gVar).f12144a;
            C0722b c0722b = (C0722b) jVar.f7485d;
            C0725e c0725e2 = (C0725e) jVar.f7486e;
            Class i10 = i(classLoader, c0722b, 0);
            if (i10 != null) {
                return Enum.valueOf(i10, c0725e2.b());
            }
        } else if (gVar instanceof k7.s) {
            k7.r rVar = (k7.r) ((k7.s) gVar).f12144a;
            if (rVar instanceof k7.q) {
                k7.f fVar = ((k7.q) rVar).f12152a;
                return i(classLoader, fVar.f12142a, fVar.f12143b);
            }
            if (rVar instanceof k7.p) {
                InterfaceC0007h c10 = ((k7.p) rVar).f12151a.B0().c();
                if (c10 instanceof InterfaceC0004e) {
                    interfaceC0004e = (InterfaceC0004e) c10;
                } else {
                    interfaceC0004e = null;
                }
                if (interfaceC0004e != null) {
                    return k(interfaceC0004e);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if ((gVar instanceof k7.j) || (gVar instanceof k7.u)) {
                return null;
            }
            return gVar.b();
        }
        return null;
    }

    public static final List m(ArrayList arrayList) {
        List y4;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (h2.a.k(h2.a.g((Annotation) it.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Annotation annotation = (Annotation) it2.next();
                        Class k = h2.a.k(h2.a.g(annotation));
                        if (k.getSimpleName().equals("Container") && k.getAnnotation(o6.x.class) != null) {
                            Object invoke = k.getDeclaredMethod("value", null).invoke(annotation, null);
                            o6.j.c(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            y4 = AbstractC0434i.K0((Annotation[]) invoke);
                        } else {
                            y4 = E2.d.y(annotation);
                        }
                        a6.q.f0(arrayList2, y4);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }
}
