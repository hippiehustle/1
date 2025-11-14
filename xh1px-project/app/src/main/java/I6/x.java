package I6;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class x extends w implements W6.e {

    /* renamed from: a, reason: collision with root package name */
    public final Method f2216a;

    public x(Method method) {
        o6.j.e(method, "member");
        this.f2216a = method;
    }

    @Override // I6.w
    public final Member b() {
        return this.f2216a;
    }

    public final B f() {
        Type genericReturnType = this.f2216a.getGenericReturnType();
        o6.j.d(genericReturnType, "getGenericReturnType(...)");
        boolean z8 = genericReturnType instanceof Class;
        if (z8) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new z(cls);
            }
        }
        if (!(genericReturnType instanceof GenericArrayType) && (!z8 || !((Class) genericReturnType).isArray())) {
            if (genericReturnType instanceof WildcardType) {
                return new E((WildcardType) genericReturnType);
            }
            return new q(genericReturnType);
        }
        return new i(genericReturnType);
    }

    public final List g() {
        Method method = this.f2216a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        o6.j.d(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        o6.j.d(parameterAnnotations, "getParameterAnnotations(...)");
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // W6.e
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f2216a.getTypeParameters();
        o6.j.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C(typeVariable));
        }
        return arrayList;
    }
}
