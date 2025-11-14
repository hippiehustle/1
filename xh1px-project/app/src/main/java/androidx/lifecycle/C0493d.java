package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0493d f8833c = new C0493d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8834a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8835b = new HashMap();

    public static void b(HashMap hashMap, C0492c c0492c, EnumC0503n enumC0503n, Class cls) {
        EnumC0503n enumC0503n2 = (EnumC0503n) hashMap.get(c0492c);
        if (enumC0503n2 != null && enumC0503n != enumC0503n2) {
            throw new IllegalArgumentException("Method " + c0492c.f8831b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0503n2 + ", new value " + enumC0503n);
        }
        if (enumC0503n2 == null) {
            hashMap.put(c0492c, enumC0503n);
        }
    }

    public final C0491b a(Class cls, Method[] methodArr) {
        int i4;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f8834a;
        if (superclass != null) {
            C0491b c0491b = (C0491b) hashMap2.get(superclass);
            if (c0491b == null) {
                c0491b = a(superclass, null);
            }
            hashMap.putAll(c0491b.f8829b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0491b c0491b2 = (C0491b) hashMap2.get(cls2);
            if (c0491b2 == null) {
                c0491b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0491b2.f8829b.entrySet()) {
                b(hashMap, (C0492c) entry.getKey(), (EnumC0503n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e9) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e9);
            }
        }
        boolean z8 = false;
        for (Method method : methodArr) {
            E e10 = (E) method.getAnnotation(E.class);
            if (e10 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (InterfaceC0510v.class.isAssignableFrom(parameterTypes[0])) {
                        i4 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i4 = 0;
                }
                EnumC0503n value = e10.value();
                if (parameterTypes.length > 1) {
                    if (EnumC0503n.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == EnumC0503n.ON_ANY) {
                            i4 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new C0492c(i4, method), value, cls);
                    z8 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0491b c0491b3 = new C0491b(hashMap);
        hashMap2.put(cls, c0491b3);
        this.f8835b.put(cls, Boolean.valueOf(z8));
        return c0491b3;
    }
}
