package I6;

import a6.AbstractC0438m;
import f7.C0723c;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class q extends B implements W6.d {

    /* renamed from: a, reason: collision with root package name */
    public final Type f2210a;

    /* renamed from: b, reason: collision with root package name */
    public final s f2211b;

    public q(Type type) {
        s oVar;
        o6.j.e(type, "reflectType");
        this.f2210a = type;
        if (type instanceof Class) {
            oVar = new o((Class) type);
        } else if (type instanceof TypeVariable) {
            oVar = new C((TypeVariable) type);
        } else if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            o6.j.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            oVar = new o((Class) rawType);
        } else {
            throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
        }
        this.f2211b = oVar;
    }

    @Override // I6.B, W6.b
    public final C0066e a(C0723c c0723c) {
        o6.j.e(c0723c, "fqName");
        return null;
    }

    @Override // I6.B
    public final Type b() {
        return this.f2210a;
    }

    public final ArrayList c() {
        B b4;
        B b9;
        List<Type> c6 = AbstractC0065d.c(this.f2210a);
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(c6, 10));
        for (Type type : c6) {
            o6.j.e(type, "type");
            boolean z8 = type instanceof Class;
            if (z8) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    b9 = new z(cls);
                    arrayList.add(b9);
                }
            }
            if (!(type instanceof GenericArrayType) && (!z8 || !((Class) type).isArray())) {
                if (type instanceof WildcardType) {
                    b4 = new E((WildcardType) type);
                } else {
                    b4 = new q(type);
                }
            } else {
                b4 = new i(type);
            }
            b9 = b4;
            arrayList.add(b9);
        }
        return arrayList;
    }

    public final boolean d() {
        boolean z8;
        Type type = this.f2210a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            o6.j.d(typeParameters, "getTypeParameters(...)");
            if (typeParameters.length == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                return true;
            }
        }
        return false;
    }

    @Override // W6.b
    public final Collection getAnnotations() {
        return a6.s.f7766d;
    }
}
