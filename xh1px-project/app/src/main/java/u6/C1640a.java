package u6;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: u6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1640a implements GenericArrayType, Type {

    /* renamed from: d, reason: collision with root package name */
    public final Type f15366d;

    public C1640a(Type type) {
        o6.j.e(type, "elementType");
        this.f15366d = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            if (o6.j.a(this.f15366d, ((GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f15366d;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return AbstractC1638C.h(this.f15366d) + "[]";
    }

    public final int hashCode() {
        return this.f15366d.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
