package h6;

import java.lang.reflect.Method;
import o6.j;

/* renamed from: h6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0836a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f11420a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        j.b(methods);
        int length = methods.length;
        int i4 = 0;
        while (true) {
            method = null;
            Class<?> cls = null;
            if (i4 >= length) {
                break;
            }
            Method method2 = methods[i4];
            if (j.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                j.d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 1) {
                    cls = parameterTypes[0];
                }
                if (j.a(cls, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i4++;
        }
        f11420a = method;
        int length2 = methods.length;
        for (int i8 = 0; i8 < length2 && !j.a(methods[i8].getName(), "getSuppressed"); i8++) {
        }
    }
}
