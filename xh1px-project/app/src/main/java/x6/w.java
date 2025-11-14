package x6;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class w extends x {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16272e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ w(Method method, boolean z8, int i4) {
        this(method, z8, r4);
        z8 = (i4 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z8;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        o6.j.d(genericParameterTypes, "getGenericParameterTypes(...)");
    }

    public final Object g(Object obj, Object[] objArr) {
        o6.j.e(objArr, "args");
        Object invoke = ((Method) this.f16273a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        if (this.f16272e) {
            return Z5.y.f7506a;
        }
        return invoke;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(Method method, boolean z8, Type[] typeArr) {
        super(method, r0, z8 ? method.getDeclaringClass() : null, typeArr);
        Type genericReturnType = method.getGenericReturnType();
        o6.j.d(genericReturnType, "getGenericReturnType(...)");
        this.f16272e = genericReturnType.equals(Void.TYPE);
    }
}
