package w6;

import a6.AbstractC0434i;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class V implements Type {

    /* renamed from: d, reason: collision with root package name */
    public final Type[] f15822d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15823e;

    public V(Type[] typeArr) {
        o6.j.e(typeArr, "types");
        this.f15822d = typeArr;
        this.f15823e = Arrays.hashCode(typeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof V) {
            if (Arrays.equals(this.f15822d, ((V) obj).f15822d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return AbstractC0434i.b1(this.f15822d, ", ", "[", "]", null, 56);
    }

    public final int hashCode() {
        return this.f15823e;
    }

    public final String toString() {
        return getTypeName();
    }
}
