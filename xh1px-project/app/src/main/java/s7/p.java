package s7;

import C6.InterfaceC0010k;
import L7.C0165x;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import g7.AbstractC0793b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import n6.InterfaceC1162a;
import w6.o0;
import w6.s0;

/* loaded from: classes.dex */
public final class p implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14607d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14608e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14609f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14610g;

    public /* synthetic */ p(s sVar, AbstractC0793b abstractC0793b, int i4, int i8) {
        this.f14607d = i8;
        this.f14608e = sVar;
        this.f14609f = abstractC0793b;
        this.f14610g = i4;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, Z5.g] */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        List list;
        List list2;
        Type type;
        Type type2;
        Class<?> cls;
        switch (this.f14607d) {
            case 0:
                s sVar = (s) this.f14608e;
                AbstractC0793b abstractC0793b = (AbstractC0793b) this.f14609f;
                F3.m mVar = sVar.f14620a;
                v a3 = sVar.a((InterfaceC0010k) mVar.f1373f);
                if (a3 != null) {
                    list = AbstractC0436k.Q0(((C1518i) mVar.f1371d).f14577e.k(a3, abstractC0793b, this.f14610g));
                } else {
                    list = null;
                }
                if (list == null) {
                    return a6.s.f7766d;
                }
                return list;
            case 1:
                s sVar2 = (s) this.f14608e;
                AbstractC0793b abstractC0793b2 = (AbstractC0793b) this.f14609f;
                F3.m mVar2 = sVar2.f14620a;
                v a4 = sVar2.a((InterfaceC0010k) mVar2.f1373f);
                if (a4 != null) {
                    list2 = ((C1518i) mVar2.f1371d).f14577e.e(a4, abstractC0793b2, this.f14610g);
                } else {
                    list2 = null;
                }
                if (list2 == null) {
                    return a6.s.f7766d;
                }
                return list2;
            default:
                o0 o0Var = (o0) this.f14608e;
                s0 s0Var = o0Var.f15893b;
                if (s0Var != null) {
                    type = (Type) s0Var.a();
                } else {
                    type = null;
                }
                if (type instanceof Class) {
                    Class cls2 = (Class) type;
                    if (cls2.isArray()) {
                        cls = cls2.getComponentType();
                    } else {
                        cls = Object.class;
                    }
                    o6.j.b(cls);
                    return cls;
                }
                boolean z8 = type instanceof GenericArrayType;
                int i4 = this.f14610g;
                if (z8) {
                    if (i4 == 0) {
                        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                        o6.j.b(genericComponentType);
                        return genericComponentType;
                    }
                    throw new C0165x("Array type has been queried for a non-0th argument: " + o0Var);
                }
                if (type instanceof ParameterizedType) {
                    Type type3 = (Type) ((List) this.f14609f.getValue()).get(i4);
                    if (type3 instanceof WildcardType) {
                        WildcardType wildcardType = (WildcardType) type3;
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        o6.j.d(lowerBounds, "getLowerBounds(...)");
                        Type type4 = (Type) AbstractC0434i.X0(lowerBounds);
                        if (type4 == null) {
                            Type[] upperBounds = wildcardType.getUpperBounds();
                            o6.j.d(upperBounds, "getUpperBounds(...)");
                            type2 = (Type) AbstractC0434i.W0(upperBounds);
                        } else {
                            type2 = type4;
                        }
                        o6.j.b(type2);
                        return type2;
                    }
                    return type3;
                }
                throw new C0165x("Non-generic type has been queried for arguments: " + o0Var);
        }
    }

    public p(o0 o0Var, int i4, Z5.g gVar) {
        this.f14607d = 2;
        this.f14608e = o0Var;
        this.f14610g = i4;
        this.f14609f = gVar;
    }
}
