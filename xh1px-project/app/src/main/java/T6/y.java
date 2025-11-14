package T6;

import C6.C0014o;
import C6.EnumC0005f;
import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import C6.M;
import C6.W;
import F6.K;
import F6.N;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import f7.C0725e;
import i7.AbstractC0890e;
import i7.AbstractC0898m;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import m7.AbstractC1098d;
import n6.InterfaceC1163b;
import n7.C1168a;
import n7.InterfaceC1172e;
import s3.AbstractC1492c;
import u6.AbstractC1638C;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.S;
import w7.U;
import x7.InterfaceC1822d;

/* loaded from: classes.dex */
public final class y implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5900d;

    /* renamed from: e, reason: collision with root package name */
    public final A f5901e;

    public /* synthetic */ y(A a3, int i4) {
        this.f5900d = i4;
        this.f5901e = a3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0272, code lost:
    
        if (z6.r.a(r6) == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0226  */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, o6.u] */
    @Override // n6.InterfaceC1163b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj) {
        char c6;
        S6.a aVar;
        InterfaceC0010k interfaceC0010k;
        H6.f fVar;
        boolean z8;
        W6.d iVar;
        W6.d dVar;
        AbstractC1759v R5;
        InterfaceC0010k q6;
        InterfaceC0004e interfaceC0004e;
        W w8;
        int i4 = this.f5900d;
        A a3 = this.f5901e;
        switch (i4) {
            case 0:
                C0725e c0725e = (C0725e) obj;
                o6.j.e(c0725e, "name");
                A a4 = a3.f5794c;
                if (a4 != null) {
                    return (Collection) a4.f5797f.m(c0725e);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((InterfaceC0328c) a3.f5796e.a()).d(c0725e).iterator();
                while (it.hasNext()) {
                    R6.f t8 = a3.t((I6.x) it.next());
                    if (a3.r(t8)) {
                        ((S6.a) a3.f5793b.f280e).f5404g.getClass();
                        arrayList.add(t8);
                    }
                }
                a3.j(c0725e, arrayList);
                return arrayList;
            case 1:
                C0725e c0725e2 = (C0725e) obj;
                o6.j.e(c0725e2, "name");
                A a9 = a3.f5794c;
                if (a9 != null) {
                    return (M) a9.f5798g.m(c0725e2);
                }
                I6.u c9 = ((InterfaceC0328c) a3.f5796e.a()).c(c0725e2);
                if (c9 != null) {
                    Field field = c9.f2214a;
                    if (!field.isEnumConstant()) {
                        ?? obj2 = new Object();
                        boolean z9 = !Modifier.isFinal(((Field) c9.b()).getModifiers());
                        A4.a aVar2 = a3.f5793b;
                        S6.c H2 = AbstractC1492c.H(aVar2, c9);
                        S6.a aVar3 = (S6.a) aVar2.f280e;
                        InterfaceC0010k q8 = a3.q();
                        C0014o N8 = AbstractC1638C.N(c9.e());
                        C0725e c10 = c9.c();
                        H6.f b4 = aVar3.j.b(c9);
                        int i8 = 0;
                        if (Modifier.isFinal(((Field) c9.b()).getModifiers()) && Modifier.isStatic(((Field) c9.b()).getModifiers())) {
                            c6 = 1;
                            aVar = aVar3;
                            interfaceC0010k = q8;
                            fVar = b4;
                            z8 = true;
                        } else {
                            c6 = 1;
                            aVar = aVar3;
                            interfaceC0010k = q8;
                            fVar = b4;
                            z8 = false;
                        }
                        R6.g U02 = R6.g.U0(interfaceC0010k, H2, N8, z9, c10, fVar, z8);
                        obj2.f13642d = U02;
                        U02.Q0(null, null, null, null);
                        R.g gVar = (R.g) aVar2.f283h;
                        Type genericType = field.getGenericType();
                        o6.j.d(genericType, "getGenericType(...)");
                        boolean z10 = genericType instanceof Class;
                        if (z10) {
                            Class cls = (Class) genericType;
                            if (cls.isPrimitive()) {
                                dVar = new I6.z(cls);
                                R5 = gVar.R(dVar, AbstractC0405a.D0(S.f15974e, false, null, 7));
                                if ((!z6.h.G(R5) || z6.h.H(R5)) && Modifier.isFinal(((Field) c9.b()).getModifiers())) {
                                    Modifier.isStatic(((Field) c9.b()).getModifiers());
                                }
                                K k = (K) obj2.f13642d;
                                F6.w p8 = a3.p();
                                a6.s sVar = a6.s.f7766d;
                                k.T0(R5, sVar, p8, null, sVar);
                                q6 = a3.q();
                                if (!(q6 instanceof InterfaceC0004e)) {
                                    interfaceC0004e = (InterfaceC0004e) q6;
                                } else {
                                    interfaceC0004e = null;
                                }
                                if (interfaceC0004e != null) {
                                    InterfaceC1172e interfaceC1172e = aVar.f5419x;
                                    K k6 = (K) obj2.f13642d;
                                    ((C1168a) interfaceC1172e).getClass();
                                    o6.j.e(k6, "propertyDescriptor");
                                    o6.j.e(aVar2, "c");
                                    obj2.f13642d = k6;
                                }
                                Object obj3 = obj2.f13642d;
                                w8 = (W) obj3;
                                AbstractC1759v b9 = ((K) obj3).b();
                                if (w8 == null) {
                                    if (b9 != null) {
                                        int i9 = AbstractC0890e.f11774a;
                                        if (!w8.H() && !AbstractC1741c.j(b9)) {
                                            if (!U.b(b9)) {
                                                z6.h e9 = AbstractC1098d.e(w8);
                                                if (!z6.h.G(b9)) {
                                                    x7.l lVar = InterfaceC1822d.f16280a;
                                                    if (!lVar.a(e9.v(), b9)) {
                                                        if (!lVar.a(e9.k("Number").l(), b9)) {
                                                            if (!lVar.a(e9.e(), b9)) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            ((K) obj2.f13642d).R0(null, new x(a3, c9, obj2, i8));
                                        }
                                        Q6.h hVar = aVar.f5404g;
                                        M m6 = (M) obj2.f13642d;
                                        hVar.getClass();
                                        if (m6 != null) {
                                            return (M) obj2.f13642d;
                                        }
                                        Object[] objArr = new Object[3];
                                        switch (6) {
                                            case 1:
                                                objArr[0] = "member";
                                                break;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                                                objArr[0] = "descriptor";
                                                break;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                objArr[0] = "element";
                                                break;
                                            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                                objArr[0] = "field";
                                                break;
                                            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                                objArr[0] = "javaClass";
                                                break;
                                            default:
                                                objArr[0] = "fqName";
                                                break;
                                        }
                                        objArr[c6] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
                                        switch (6) {
                                            case 1:
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                objArr[2] = "recordMethod";
                                                break;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                                objArr[2] = "recordConstructor";
                                                break;
                                            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                                objArr[2] = "recordField";
                                                break;
                                            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                                                objArr[2] = "recordClass";
                                                break;
                                            default:
                                                objArr[2] = "getClassResolvedFromSource";
                                                break;
                                        }
                                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                                    }
                                    AbstractC0890e.a(66);
                                    throw null;
                                }
                                AbstractC0890e.a(65);
                                throw null;
                            }
                        }
                        if (!(genericType instanceof GenericArrayType) && (!z10 || !((Class) genericType).isArray())) {
                            if (genericType instanceof WildcardType) {
                                iVar = new I6.E((WildcardType) genericType);
                            } else {
                                iVar = new I6.q(genericType);
                            }
                        } else {
                            iVar = new I6.i(genericType);
                        }
                        dVar = iVar;
                        R5 = gVar.R(dVar, AbstractC0405a.D0(S.f15974e, false, null, 7));
                        if (!z6.h.G(R5)) {
                        }
                        Modifier.isStatic(((Field) c9.b()).getModifiers());
                        K k8 = (K) obj2.f13642d;
                        F6.w p82 = a3.p();
                        a6.s sVar2 = a6.s.f7766d;
                        k8.T0(R5, sVar2, p82, null, sVar2);
                        q6 = a3.q();
                        if (!(q6 instanceof InterfaceC0004e)) {
                        }
                        if (interfaceC0004e != null) {
                        }
                        Object obj32 = obj2.f13642d;
                        w8 = (W) obj32;
                        AbstractC1759v b92 = ((K) obj32).b();
                        if (w8 == null) {
                        }
                    }
                }
                return null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C0725e c0725e3 = (C0725e) obj;
                o6.j.e(c0725e3, "name");
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) a3.f5797f.m(c0725e3));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : linkedHashSet) {
                    String e10 = D2.f.e((N) obj4, 2);
                    Object obj5 = linkedHashMap.get(e10);
                    if (obj5 == null) {
                        obj5 = new ArrayList();
                        linkedHashMap.put(e10, obj5);
                    }
                    ((List) obj5).add(obj4);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        Collection o7 = AbstractC0898m.o(list, m.f5861f);
                        linkedHashSet.removeAll(list);
                        linkedHashSet.addAll(o7);
                    }
                }
                a3.m(linkedHashSet, c0725e3);
                A4.a aVar4 = a3.f5793b;
                return AbstractC0436k.Q0(((S6.a) aVar4.f280e).f5413r.e(aVar4, linkedHashSet));
            default:
                C0725e c0725e4 = (C0725e) obj;
                o6.j.e(c0725e4, "name");
                ArrayList arrayList2 = new ArrayList();
                F7.l.a(arrayList2, a3.f5798g.m(c0725e4));
                a3.n(c0725e4, arrayList2);
                InterfaceC0010k q9 = a3.q();
                int i10 = AbstractC0890e.f11774a;
                if (AbstractC0890e.m(q9, EnumC0005f.f745h)) {
                    return AbstractC0436k.Q0(arrayList2);
                }
                A4.a aVar5 = a3.f5793b;
                return AbstractC0436k.Q0(((S6.a) aVar5.f280e).f5413r.e(aVar5, arrayList2));
        }
    }
}
