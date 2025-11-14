package u6;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* renamed from: u6.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1639D implements WildcardType, Type {

    /* renamed from: f, reason: collision with root package name */
    public static final C1639D f15363f = new C1639D(null, null);

    /* renamed from: d, reason: collision with root package name */
    public final Type f15364d;

    /* renamed from: e, reason: collision with root package name */
    public final Type f15365e;

    public C1639D(Type type, Type type2) {
        this.f15364d = type;
        this.f15365e = type2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f15365e;
        if (type == null) {
            return new Type[0];
        }
        return new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f15365e;
        if (type != null) {
            return "? super " + AbstractC1638C.h(type);
        }
        Type type2 = this.f15364d;
        if (type2 != null && !o6.j.a(type2, Object.class)) {
            return "? extends " + AbstractC1638C.h(type2);
        }
        return "?";
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f15364d;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
