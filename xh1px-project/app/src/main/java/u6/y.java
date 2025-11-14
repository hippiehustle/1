package u6;

import a6.AbstractC0434i;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y implements ParameterizedType, Type {

    /* renamed from: d, reason: collision with root package name */
    public final Class f15380d;

    /* renamed from: e, reason: collision with root package name */
    public final Type f15381e;

    /* renamed from: f, reason: collision with root package name */
    public final Type[] f15382f;

    public y(Class cls, Type type, ArrayList arrayList) {
        this.f15380d = cls;
        this.f15381e = type;
        this.f15382f = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (o6.j.a(this.f15380d, parameterizedType.getRawType()) && o6.j.a(this.f15381e, parameterizedType.getOwnerType()) && Arrays.equals(this.f15382f, parameterizedType.getActualTypeArguments())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f15382f;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f15381e;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f15380d;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f15380d;
        Type type = this.f15381e;
        if (type != null) {
            sb.append(AbstractC1638C.h(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(AbstractC1638C.h(cls));
        }
        Type[] typeArr = this.f15382f;
        if (typeArr.length != 0) {
            AbstractC0434i.a1(typeArr, sb, ", ", "<", ">", "...", x.f15379l);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.f15380d.hashCode();
        Type type = this.f15381e;
        if (type != null) {
            i4 = type.hashCode();
        } else {
            i4 = 0;
        }
        return (hashCode ^ i4) ^ Arrays.hashCode(this.f15382f);
    }

    public final String toString() {
        return getTypeName();
    }
}
