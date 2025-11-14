package I6;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* loaded from: classes.dex */
public final class i extends B implements W6.d {

    /* renamed from: a, reason: collision with root package name */
    public final Type f2200a;

    /* renamed from: b, reason: collision with root package name */
    public final B f2201b;

    /* renamed from: c, reason: collision with root package name */
    public final a6.s f2202c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Type type) {
        B iVar;
        B b4;
        this.f2200a = type;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            o6.j.d(genericComponentType, "getGenericComponentType(...)");
            boolean z8 = genericComponentType instanceof Class;
            if (z8) {
                Class cls = (Class) genericComponentType;
                if (cls.isPrimitive()) {
                    b4 = new z(cls);
                    this.f2201b = b4;
                    this.f2202c = a6.s.f7766d;
                }
            }
            if (!(genericComponentType instanceof GenericArrayType) && (!z8 || !((Class) genericComponentType).isArray())) {
                if (genericComponentType instanceof WildcardType) {
                    iVar = new E((WildcardType) genericComponentType);
                } else {
                    iVar = new q(genericComponentType);
                }
            } else {
                iVar = new i(genericComponentType);
            }
        } else {
            if (type instanceof Class) {
                Class cls2 = (Class) type;
                if (cls2.isArray()) {
                    Class<?> componentType = cls2.getComponentType();
                    o6.j.d(componentType, "getComponentType(...)");
                    if (componentType.isPrimitive()) {
                        iVar = new z(componentType);
                    } else if (!(componentType instanceof GenericArrayType) && !componentType.isArray()) {
                        if (componentType instanceof WildcardType) {
                            iVar = new E((WildcardType) componentType);
                        } else {
                            iVar = new q(componentType);
                        }
                    } else {
                        iVar = new i(componentType);
                    }
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        b4 = iVar;
        this.f2201b = b4;
        this.f2202c = a6.s.f7766d;
    }

    @Override // I6.B
    public final Type b() {
        return this.f2200a;
    }

    @Override // W6.b
    public final Collection getAnnotations() {
        return this.f2202c;
    }
}
