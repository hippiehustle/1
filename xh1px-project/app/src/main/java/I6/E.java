package I6;

import a6.AbstractC0434i;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* loaded from: classes.dex */
public final class E extends B implements W6.d {

    /* renamed from: a, reason: collision with root package name */
    public final WildcardType f2182a;

    public E(WildcardType wildcardType) {
        this.f2182a = wildcardType;
    }

    @Override // I6.B
    public final Type b() {
        return this.f2182a;
    }

    public final B c() {
        WildcardType wildcardType = this.f2182a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length <= 1 && lowerBounds.length <= 1) {
            if (lowerBounds.length == 1) {
                Object d12 = AbstractC0434i.d1(lowerBounds);
                o6.j.d(d12, "single(...)");
                Type type = (Type) d12;
                boolean z8 = type instanceof Class;
                if (z8) {
                    Class cls = (Class) type;
                    if (cls.isPrimitive()) {
                        return new z(cls);
                    }
                }
                if (!(type instanceof GenericArrayType) && (!z8 || !((Class) type).isArray())) {
                    if (type instanceof WildcardType) {
                        return new E((WildcardType) type);
                    }
                    return new q(type);
                }
                return new i(type);
            }
            if (upperBounds.length == 1) {
                Type type2 = (Type) AbstractC0434i.d1(upperBounds);
                if (!o6.j.a(type2, Object.class)) {
                    o6.j.b(type2);
                    boolean z9 = type2 instanceof Class;
                    if (z9) {
                        Class cls2 = (Class) type2;
                        if (cls2.isPrimitive()) {
                            return new z(cls2);
                        }
                    }
                    if (!(type2 instanceof GenericArrayType) && (!z9 || !((Class) type2).isArray())) {
                        if (type2 instanceof WildcardType) {
                            return new E((WildcardType) type2);
                        }
                        return new q(type2);
                    }
                    return new i(type2);
                }
                return null;
            }
            return null;
        }
        throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
    }

    @Override // W6.b
    public final Collection getAnnotations() {
        return a6.s.f7766d;
    }
}
