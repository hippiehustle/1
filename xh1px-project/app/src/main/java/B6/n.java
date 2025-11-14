package B6;

import C6.AbstractC0021w;
import C6.F;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0011l;
import C6.O;
import C6.P;
import C6.T;
import F6.AbstractC0046f;
import F6.B;
import F6.C;
import F6.C0041a;
import F6.G;
import F6.H;
import F6.N;
import F6.U;
import I6.AbstractC0065d;
import I6.C0066e;
import I6.D;
import I6.x;
import P.S;
import P6.A;
import T6.C0326a;
import Z5.y;
import a.AbstractC0405a;
import a6.AbstractC0425A;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import a7.C0450k;
import a7.Z;
import a7.g0;
import b6.C0541i;
import c7.AbstractC0582a;
import c7.C0590i;
import c7.InterfaceC0588g;
import f7.AbstractC0727g;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m7.AbstractC1098d;
import n1.AbstractC1149a;
import n6.InterfaceC1163b;
import o.p1;
import o6.v;
import p7.InterfaceC1333o;
import q4.X;
import s7.C1513d;
import s7.C1515f;
import s7.C1516g;
import s7.C1518i;
import t0.C1536c;
import t7.C1593c;
import u7.C1655h;
import w7.AbstractC1741c;
import w7.AbstractC1744f;
import w7.AbstractC1759v;
import w7.C1743e;
import w7.C1758u;
import w7.J;
import w7.L;
import w7.M;
import w7.Q;
import w7.W;
import w7.z;
import x7.AbstractC1825g;
import x7.C1824f;
import z7.InterfaceC1887d;

/* loaded from: classes.dex */
public final class n implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f493d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f494e;

    public /* synthetic */ n(int i4, Object obj) {
        this.f493d = i4;
        this.f494e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:283:0x06a8, code lost:
    
        if (r1.equals("hashCode") == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x06f4, code lost:
    
        r0 = ((java.util.ArrayList) r0.g()).isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x06f2, code lost:
    
        if (r1.equals("toString") != false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x08da, code lost:
    
        if (r0 != false) goto L353;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0705  */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object] */
    @Override // n6.InterfaceC1163b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj) {
        boolean z8;
        boolean z9;
        boolean equals;
        Object next;
        C0723c b4;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj2;
        C0723c c6;
        boolean z13;
        x7.m mVar;
        J s8;
        X6.a aVar;
        F f8;
        F3.m a3;
        C1655h c1655h;
        List list;
        Set T5;
        M a4;
        int i4 = this.f493d;
        y yVar = y.f7506a;
        I6.q qVar = null;
        AbstractC1759v abstractC1759v = null;
        C1758u c1758u = null;
        List list2 = null;
        int i8 = 1;
        Object obj3 = this.f494e;
        switch (i4) {
            case 0:
                Z5.j jVar = (Z5.j) obj;
                o6.j.e(jVar, "<destruct>");
                String str = (String) jVar.f7485d;
                String str2 = (String) jVar.f7486e;
                List y4 = E2.d.y(D6.g.a(((r) obj3).f505a.f1450h, "'" + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN"));
                if (y4.isEmpty()) {
                    return D6.i.f1043a;
                }
                return new D6.k(0, y4);
            case 1:
                ((C1824f) obj).getClass();
                return (z) ((C0041a) obj3).f1518e.f1520e.a();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0046f abstractC0046f = (AbstractC0046f) obj3;
                W w8 = (W) obj;
                o6.j.b(w8);
                if (!AbstractC1741c.j(w8)) {
                    InterfaceC0007h c9 = w8.B0().c();
                    if ((c9 instanceof T) && !o6.j.a(((T) c9).q(), abstractC0046f)) {
                        z8 = true;
                        return Boolean.valueOf(z8);
                    }
                }
                z8 = false;
                return Boolean.valueOf(z8);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                C c10 = (C) obj3;
                C0723c c0723c = (C0723c) obj;
                o6.j.e(c0723c, "fqName");
                H h8 = c10.j;
                v7.k kVar = c10.f1449g;
                ((G) h8).getClass();
                o6.j.e(kVar, "storageManager");
                return new F6.y(c10, c0723c, kVar);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                I6.o oVar = (I6.o) obj3;
                Method method = (Method) obj;
                if (!method.isSynthetic()) {
                    if (oVar.f2208a.isEnum()) {
                        String name = method.getName();
                        if (o6.j.a(name, "values")) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            o6.j.d(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0) {
                                equals = true;
                                break;
                            }
                            equals = false;
                            break;
                        } else {
                            if (o6.j.a(name, "valueOf")) {
                                equals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                                break;
                            }
                            equals = false;
                        }
                        return Boolean.valueOf(z9);
                    }
                    z9 = true;
                    return Boolean.valueOf(z9);
                }
                z9 = false;
                return Boolean.valueOf(z9);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                o6.j.e((InterfaceC0002c) obj, "it");
                return Boolean.valueOf(P6.F.f4542i.containsKey(D2.f.f((N) obj3)));
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                Z5.f fVar = (Z5.f) obj3;
                C0723c c0723c2 = (C0723c) obj;
                o6.j.e(c0723c2, "it");
                C0723c c0723c3 = P6.q.f4578a;
                P6.z.f4628c.getClass();
                A.i iVar = P6.y.f4627b;
                o6.j.e(iVar, "configuredReportLevels");
                A a9 = (A) ((U1.c) iVar.f89f).m(c0723c2);
                if (a9 == null) {
                    A.i iVar2 = P6.q.f4580c;
                    iVar2.getClass();
                    P6.r rVar = (P6.r) ((U1.c) iVar2.f89f).m(c0723c2);
                    if (rVar == null) {
                        return A.f4515d;
                    }
                    Z5.f fVar2 = rVar.f4584b;
                    if (fVar2 != null && fVar2.f7481f - fVar.f7481f <= 0) {
                        return rVar.f4585c;
                    }
                    return rVar.f4583a;
                }
                return a9;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                C0723c c0723c4 = (C0723c) obj;
                o6.j.b(c0723c4);
                ?? r12 = ((A.i) obj3).f88e;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : r12.entrySet()) {
                    C0723c c0723c5 = (C0723c) entry.getKey();
                    if (!c0723c4.equals(c0723c5)) {
                        o6.j.e(c0723c5, "packageName");
                        if (c0723c4.f10797a.c()) {
                            b4 = null;
                        } else {
                            b4 = c0723c4.b();
                        }
                        if (o6.j.a(b4, c0723c5)) {
                        }
                    }
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                if (linkedHashMap.isEmpty()) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    return null;
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                if (!it.hasNext()) {
                    next = null;
                } else {
                    next = it.next();
                    if (it.hasNext()) {
                        int length = AbstractC0405a.C0((C0723c) ((Map.Entry) next).getKey(), c0723c4).f10797a.f10800a.length();
                        do {
                            Object next2 = it.next();
                            int length2 = AbstractC0405a.C0((C0723c) ((Map.Entry) next2).getKey(), c0723c4).f10797a.f10800a.length();
                            if (length > length2) {
                                next = next2;
                                length = length2;
                            }
                        } while (it.hasNext());
                    }
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 == null) {
                    return null;
                }
                return entry2.getValue();
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                InterfaceC0002c interfaceC0002c = (InterfaceC0002c) obj;
                if (interfaceC0002c != null) {
                    ((Q6.a) obj3).f4905c.a(interfaceC0002c);
                    return yVar;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
            case 9:
                S6.c cVar = (S6.c) obj3;
                C0066e c0066e = (C0066e) obj;
                o6.j.e(c0066e, "annotation");
                C0725e c0725e = Q6.c.f4913a;
                return Q6.c.b(cVar.f5422d, c0066e, cVar.f5424f);
            case 10:
                S6.e eVar = (S6.e) obj3;
                I6.C c11 = (I6.C) obj;
                o6.j.e(c11, "typeParameter");
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) eVar.f5432e;
                InterfaceC0011l interfaceC0011l = (InterfaceC0011l) eVar.f5431d;
                Integer num = (Integer) linkedHashMap2.get(c11);
                if (num == null) {
                    return null;
                }
                int intValue = num.intValue();
                A4.a aVar2 = (A4.a) eVar.f5430c;
                o6.j.e(aVar2, "<this>");
                return new T6.F(X.q(new A4.a((S6.a) aVar2.f280e, eVar, (Z5.g) aVar2.f282g), interfaceC0011l.getAnnotations()), c11, eVar.f5429b + intValue, interfaceC0011l);
            case 11:
                x xVar = (x) obj;
                o6.j.e(xVar, "m");
                if (((Boolean) ((C0326a) obj3).f5812b.m(xVar)).booleanValue()) {
                    Class<?> declaringClass = ((Method) xVar.b()).getDeclaringClass();
                    o6.j.d(declaringClass, "getDeclaringClass(...)");
                    if (declaringClass.isInterface()) {
                        String b9 = xVar.c().b();
                        int hashCode = b9.hashCode();
                        if (hashCode == -1776922004) {
                            break;
                        } else {
                            if (hashCode != -1295482945) {
                                if (hashCode == 147696667) {
                                    break;
                                }
                            } else if (b9.equals("equals")) {
                                D d2 = (D) AbstractC0436k.I0(xVar.g());
                                if (d2 != null) {
                                    obj2 = d2.f2178a;
                                } else {
                                    obj2 = null;
                                }
                                if (obj2 instanceof I6.q) {
                                    qVar = (I6.q) obj2;
                                }
                                if (qVar != null) {
                                    I6.s sVar = qVar.f2211b;
                                    if ((sVar instanceof I6.o) && (c6 = ((I6.o) sVar).c()) != null && o6.j.a(c6.f10797a.f10800a, "java.lang.Object")) {
                                        z12 = true;
                                    }
                                }
                            }
                            z12 = false;
                        }
                        if (z12) {
                            z11 = true;
                            if (!z11) {
                                z10 = true;
                                return Boolean.valueOf(z10);
                            }
                        }
                    }
                    z11 = false;
                    if (!z11) {
                    }
                }
                z10 = false;
                return Boolean.valueOf(z10);
            case 12:
                T6.i iVar3 = (T6.i) obj3;
                o6.j.e((C1824f) obj, "it");
                A4.a aVar3 = iVar3.f5839m;
                I6.o oVar2 = iVar3.k;
                if (iVar3.f5838l != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                return new T6.o(aVar3, iVar3, oVar2, z13, iVar3.f5846t);
            case 13:
                InterfaceC1333o interfaceC1333o = (InterfaceC1333o) obj;
                o6.j.e(interfaceC1333o, "it");
                return interfaceC1333o.f((C0725e) obj3, K6.b.f2734h);
            case 14:
                o6.j.e((C1824f) obj, "kotlinTypeRefiner");
                AbstractC1098d.f((InterfaceC0004e) obj3);
                return null;
            case 15:
                X6.r rVar2 = (X6.r) obj3;
                X6.a aVar4 = (X6.a) obj;
                o6.j.e(aVar4, "it");
                P6.t tVar = aVar4.f6989b;
                InterfaceC1887d interfaceC1887d = aVar4.f6988a;
                if (rVar2.f7036c && interfaceC1887d != null) {
                    o6.j.e(interfaceC1887d, "$receiver");
                    if (interfaceC1887d instanceof AbstractC1759v) {
                        if (interfaceC1887d instanceof U6.h) {
                            return null;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb.append(interfaceC1887d);
                        sb.append(", ");
                        throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1887d.getClass(), sb).toString());
                    }
                }
                if (interfaceC1887d == null || (s8 = (mVar = x7.m.f16299a).s(interfaceC1887d)) == null) {
                    return null;
                }
                if (s8 instanceof J) {
                    List e9 = s8.e();
                    o6.j.d(e9, "getParameters(...)");
                    o6.j.e(interfaceC1887d, "$receiver");
                    if (interfaceC1887d instanceof AbstractC1759v) {
                        List r02 = ((AbstractC1759v) interfaceC1887d).r0();
                        Iterator it2 = e9.iterator();
                        Iterator it3 = r02.iterator();
                        ArrayList arrayList = new ArrayList(Math.min(AbstractC0438m.d0(e9, 10), AbstractC0438m.d0(r02, 10)));
                        while (it2.hasNext() && it3.hasNext()) {
                            T t8 = (T) it2.next();
                            W r8 = AbstractC1825g.r(mVar, (M) it3.next());
                            if (r8 == null) {
                                aVar = new X6.a(null, tVar, t8);
                            } else {
                                aVar = new X6.a(r8, ((S6.a) ((A4.a) rVar2.f7038e).f280e).f5412q.b(tVar, r8.getAnnotations()), t8);
                            }
                            arrayList.add(aVar);
                        }
                        return arrayList;
                    }
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(interfaceC1887d);
                    sb2.append(", ");
                    throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, interfaceC1887d.getClass(), sb2).toString());
                }
                StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb3.append(s8);
                sb3.append(", ");
                throw new IllegalArgumentException(AbstractC1149a.i(v.f13643a, s8.getClass(), sb3).toString());
            case 16:
                InterfaceC0002c interfaceC0002c2 = (InterfaceC0002c) obj;
                o6.j.e(interfaceC0002c2, "it");
                AbstractC1759v b10 = ((U) interfaceC0002c2.z0().get(((U) obj3).j)).b();
                o6.j.d(b10, "getType(...)");
                return b10;
            case 17:
                H6.b bVar = (H6.b) obj;
                o6.j.e(bVar, "kotlinClass");
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                R3.r rVar3 = new R3.r((F3.a) obj3, hashMap, hashMap2);
                Class cls = bVar.f2037a;
                o6.j.e(cls, "klass");
                S g8 = o6.j.g(cls.getDeclaredMethods());
                while (g8.hasNext()) {
                    Method method2 = (Method) g8.next();
                    C0725e e10 = C0725e.e(method2.getName());
                    StringBuilder sb4 = new StringBuilder("(");
                    S g9 = o6.j.g(method2.getParameterTypes());
                    while (g9.hasNext()) {
                        Class cls2 = (Class) g9.next();
                        o6.j.b(cls2);
                        sb4.append(AbstractC0065d.b(cls2));
                    }
                    sb4.append(")");
                    Class<?> returnType = method2.getReturnType();
                    o6.j.d(returnType, "getReturnType(...)");
                    sb4.append(AbstractC0065d.b(returnType));
                    String sb5 = sb4.toString();
                    o6.j.d(sb5, "toString(...)");
                    A4.a c02 = rVar3.c0(e10, sb5);
                    S g10 = o6.j.g(method2.getDeclaredAnnotations());
                    while (g10.hasNext()) {
                        Annotation annotation = (Annotation) g10.next();
                        o6.j.b(annotation);
                        X.H(c02, annotation);
                    }
                    Annotation[][] parameterAnnotations = method2.getParameterAnnotations();
                    o6.j.d(parameterAnnotations, "getParameterAnnotations(...)");
                    Annotation[][] annotationArr = parameterAnnotations;
                    int length3 = annotationArr.length;
                    for (int i9 = 0; i9 < length3; i9++) {
                        S g11 = o6.j.g(annotationArr[i9]);
                        while (g11.hasNext()) {
                            Annotation annotation2 = (Annotation) g11.next();
                            Class k = h2.a.k(h2.a.g(annotation2));
                            p1 t9 = c02.t(i9, AbstractC0065d.a(k), new H6.a(annotation2));
                            if (t9 != null) {
                                X.I(t9, annotation2, k);
                            }
                        }
                    }
                    c02.k();
                }
                S g12 = o6.j.g(cls.getDeclaredConstructors());
                while (g12.hasNext()) {
                    Constructor constructor = (Constructor) g12.next();
                    C0725e c0725e2 = AbstractC0727g.f10812e;
                    o6.j.b(constructor);
                    StringBuilder sb6 = new StringBuilder("(");
                    S g13 = o6.j.g(constructor.getParameterTypes());
                    while (g13.hasNext()) {
                        Class cls3 = (Class) g13.next();
                        o6.j.b(cls3);
                        sb6.append(AbstractC0065d.b(cls3));
                    }
                    sb6.append(")V");
                    String sb7 = sb6.toString();
                    o6.j.d(sb7, "toString(...)");
                    A4.a c03 = rVar3.c0(c0725e2, sb7);
                    S g14 = o6.j.g(constructor.getDeclaredAnnotations());
                    while (g14.hasNext()) {
                        Annotation annotation3 = (Annotation) g14.next();
                        o6.j.b(annotation3);
                        X.H(c03, annotation3);
                    }
                    Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                    o6.j.b(parameterAnnotations2);
                    if (parameterAnnotations2.length != 0) {
                        int length4 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                        int length5 = parameterAnnotations2.length;
                        for (int i10 = 0; i10 < length5; i10++) {
                            S g15 = o6.j.g(parameterAnnotations2[i10]);
                            while (g15.hasNext()) {
                                Annotation annotation4 = (Annotation) g15.next();
                                S s9 = g12;
                                Class k6 = h2.a.k(h2.a.g(annotation4));
                                Class cls4 = cls;
                                int i11 = length4;
                                Annotation[][] annotationArr2 = parameterAnnotations2;
                                p1 t10 = c03.t(i10 + length4, AbstractC0065d.a(k6), new H6.a(annotation4));
                                if (t10 != null) {
                                    X.I(t10, annotation4, k6);
                                }
                                g12 = s9;
                                cls = cls4;
                                length4 = i11;
                                parameterAnnotations2 = annotationArr2;
                            }
                        }
                    }
                    S s10 = g12;
                    Class cls5 = cls;
                    c03.k();
                    g12 = s10;
                    cls = cls5;
                }
                S g16 = o6.j.g(cls.getDeclaredFields());
                while (g16.hasNext()) {
                    Field field = (Field) g16.next();
                    C0725e e11 = C0725e.e(field.getName());
                    Class<?> type = field.getType();
                    o6.j.d(type, "getType(...)");
                    String b11 = AbstractC0065d.b(type);
                    o6.j.e(b11, "desc");
                    String b12 = e11.b();
                    o6.j.d(b12, "asString(...)");
                    Y6.p pVar = new Y6.p(b12 + '#' + b11);
                    ArrayList arrayList2 = new ArrayList();
                    S g17 = o6.j.g(field.getDeclaredAnnotations());
                    while (g17.hasNext()) {
                        Annotation annotation5 = (Annotation) g17.next();
                        o6.j.b(annotation5);
                        Class k8 = h2.a.k(h2.a.g(annotation5));
                        p1 x8 = ((F3.a) rVar3.f5082e).x(AbstractC0065d.a(k8), new H6.a(annotation5), arrayList2);
                        if (x8 != null) {
                            X.I(x8, annotation5, k8);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ((HashMap) rVar3.f5083f).put(pVar, arrayList2);
                    }
                }
                return new Y6.c(hashMap, hashMap2, hashMap3);
            case 18:
                o6.j.b(obj);
                ((F7.i) obj3).add(obj);
                return yVar;
            case 19:
                C6.A a10 = (C6.A) obj;
                o6.j.e(a10, "it");
                return a10.o().r((z6.j) obj3);
            case 20:
                AbstractC1759v abstractC1759v2 = (AbstractC1759v) obj3;
                o6.j.e((C6.A) obj, "it");
                return abstractC1759v2;
            case 21:
                t tVar2 = (t) obj3;
                C0723c c0723c6 = (C0723c) obj;
                o6.j.e(c0723c6, "fqName");
                C1593c c12 = tVar2.c(c0723c6);
                if (c12 == null) {
                    return null;
                }
                C1518i c1518i = tVar2.f516c;
                if (c1518i != null) {
                    c12.N0(c1518i);
                    return c12;
                }
                o6.j.i("components");
                throw null;
            case 22:
                C1516g c1516g = (C1516g) obj3;
                C1515f c1515f = (C1515f) obj;
                o6.j.e(c1515f, "key");
                C0722b c0722b = c1515f.f14567a;
                C1518i c1518i2 = c1516g.f14570a;
                Iterator it4 = c1518i2.k.iterator();
                while (it4.hasNext()) {
                    InterfaceC0004e b13 = ((E6.c) it4.next()).b(c0722b);
                    if (b13 != null) {
                        return b13;
                    }
                }
                if (C1516g.f14569c.contains(c0722b)) {
                    return null;
                }
                C1513d c1513d = c1515f.f14568b;
                if (c1513d == null && (c1513d = c1518i2.f14576d.c(c0722b)) == null) {
                    return null;
                }
                InterfaceC0588g interfaceC0588g = c1513d.f14563a;
                C0450k c0450k = c1513d.f14564b;
                AbstractC0582a abstractC0582a = c1513d.f14565c;
                O o7 = c1513d.f14566d;
                C0722b e12 = c0722b.e();
                if (e12 != null) {
                    InterfaceC0004e a11 = c1516g.a(e12, null);
                    if (a11 instanceof C1655h) {
                        c1655h = (C1655h) a11;
                    } else {
                        c1655h = null;
                    }
                    if (c1655h == null) {
                        return null;
                    }
                    if (!c1655h.r0().m().contains(c0722b.f())) {
                        return null;
                    }
                    a3 = c1655h.f15404o;
                } else {
                    Iterator it5 = AbstractC0021w.i(c1518i2.f14578f, c0722b.f10793a).iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            f8 = it5.next();
                            F f9 = (F) f8;
                            if (f9 instanceof C1593c) {
                                C1593c c1593c = (C1593c) f9;
                                C0725e f10 = c0722b.f();
                                c1593c.getClass();
                                if (((u7.o) c1593c.w0()).m().contains(f10)) {
                                }
                            }
                        } else {
                            f8 = 0;
                        }
                    }
                    F f11 = f8;
                    if (f11 == null) {
                        return null;
                    }
                    Z z14 = c0450k.f8152I;
                    o6.j.d(z14, "getTypeTable(...)");
                    B b14 = new B(z14);
                    C0590i c0590i = C0590i.f9728b;
                    g0 g0Var = c0450k.K;
                    o6.j.d(g0Var, "getVersionRequirementTable(...)");
                    a3 = c1518i2.a(f11, interfaceC0588g, b14, X.r(g0Var), abstractC0582a, null);
                }
                return new C1655h(a3, c0450k, interfaceC0588g, abstractC0582a, o7);
            case 23:
                AbstractC1744f abstractC1744f = (AbstractC1744f) obj3;
                C1743e c1743e = (C1743e) obj;
                o6.j.e(c1743e, "supertypes");
                P h9 = abstractC1744f.h();
                ?? r32 = c1743e.f15990a;
                h9.getClass();
                o6.j.e(r32, "superTypes");
                boolean isEmpty = r32.isEmpty();
                List list3 = r32;
                if (isEmpty) {
                    AbstractC1759v g18 = abstractC1744f.g();
                    if (g18 != null) {
                        list = E2.d.y(g18);
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        list = a6.s.f7766d;
                    }
                    list3 = list;
                }
                if (list3 instanceof List) {
                    list2 = list3;
                }
                if (list2 == null) {
                    list2 = AbstractC0436k.Q0(list3);
                }
                List k9 = abstractC1744f.k(list2);
                o6.j.e(k9, "<set-?>");
                c1743e.f15991b = k9;
                return yVar;
            case 24:
                AbstractC1759v abstractC1759v3 = (AbstractC1759v) obj;
                o6.j.b(abstractC1759v3);
                return ((InterfaceC1163b) obj3).m(abstractC1759v3).toString();
            case 25:
                C1758u c1758u2 = (C1758u) obj3;
                C1824f c1824f = (C1824f) obj;
                o6.j.e(c1824f, "kotlinTypeRefiner");
                LinkedHashSet linkedHashSet = c1758u2.f16016b;
                ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(linkedHashSet, 10));
                Iterator it6 = linkedHashSet.iterator();
                boolean z15 = false;
                while (it6.hasNext()) {
                    arrayList3.add(((AbstractC1759v) it6.next()).G0(c1824f));
                    z15 = true;
                }
                if (z15) {
                    AbstractC1759v abstractC1759v4 = c1758u2.f16015a;
                    if (abstractC1759v4 != null) {
                        abstractC1759v = abstractC1759v4.G0(c1824f);
                    }
                    arrayList3.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList3);
                    linkedHashSet2.hashCode();
                    C1758u c1758u3 = new C1758u(linkedHashSet2);
                    c1758u3.f16015a = abstractC1759v;
                    c1758u = c1758u3;
                }
                if (c1758u != null) {
                    c1758u2 = c1758u;
                }
                return c1758u2.f();
            default:
                C1536c c1536c = (C1536c) obj3;
                L l6 = (L) obj;
                T t11 = l6.f15968a;
                U6.a aVar5 = l6.f15969b;
                Set set = aVar5.f6174e;
                if (set != null && set.contains(t11.a())) {
                    return c1536c.j(aVar5);
                }
                z l8 = t11.l();
                o6.j.d(l8, "getDefaultType(...)");
                LinkedHashSet<T> linkedHashSet3 = new LinkedHashSet();
                AbstractC0405a.w(l8, l8, linkedHashSet3, set);
                int N02 = a6.x.N0(AbstractC0438m.d0(linkedHashSet3, 10));
                if (N02 < 16) {
                    N02 = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(N02);
                for (T t12 : linkedHashSet3) {
                    if (set != null && set.contains(t12)) {
                        a4 = w7.U.k(t12, aVar5);
                    } else {
                        Set set2 = aVar5.f6174e;
                        if (set2 != null) {
                            T5 = AbstractC0425A.h0(set2, t11);
                        } else {
                            T5 = X.T(t11);
                        }
                        a4 = U6.e.a(t12, aVar5, c1536c, c1536c.k(t12, U6.a.a(aVar5, null, false, T5, null, 47)));
                    }
                    linkedHashMap3.put(t12.B(), a4);
                }
                Q q6 = new Q(new w7.F(i8, linkedHashMap3));
                List upperBounds = t11.getUpperBounds();
                o6.j.d(upperBounds, "getUpperBounds(...)");
                C0541i w9 = c1536c.w(q6, upperBounds, aVar5);
                if (!w9.f9241d.isEmpty()) {
                    if (w9.f9241d.f9232l == 1) {
                        return (AbstractC1759v) AbstractC0436k.F0(w9);
                    }
                    throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
                }
                return c1536c.j(aVar5);
        }
    }

    public n(InterfaceC0004e interfaceC0004e, U6.f fVar, z zVar, U6.a aVar) {
        this.f493d = 14;
        this.f494e = interfaceC0004e;
    }
}
