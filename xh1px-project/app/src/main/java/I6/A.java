package I6;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class A extends w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2176a;

    public A(Object obj) {
        o6.j.e(obj, "recordComponent");
        this.f2176a = obj;
    }

    @Override // I6.w
    public final Member b() {
        Object obj = this.f2176a;
        o6.j.e(obj, "recordComponent");
        C0062a c0062a = E2.d.f1185b;
        Method method = null;
        if (c0062a == null) {
            Class<?> cls = obj.getClass();
            try {
                c0062a = new C0062a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                c0062a = new C0062a(null, null);
            }
            E2.d.f1185b = c0062a;
        }
        Method method2 = c0062a.f2184b;
        if (method2 != null) {
            Object invoke = method2.invoke(obj, null);
            o6.j.c(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) invoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final W6.d f() {
        Object obj = this.f2176a;
        o6.j.e(obj, "recordComponent");
        C0062a c0062a = E2.d.f1185b;
        Class cls = null;
        if (c0062a == null) {
            Class<?> cls2 = obj.getClass();
            try {
                c0062a = new C0062a(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                c0062a = new C0062a(null, null);
            }
            E2.d.f1185b = c0062a;
        }
        Method method = c0062a.f2183a;
        if (method != null) {
            Object invoke = method.invoke(obj, null);
            o6.j.c(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) invoke;
        }
        if (cls != null) {
            return new q(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
