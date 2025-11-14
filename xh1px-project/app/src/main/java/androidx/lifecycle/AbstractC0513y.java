package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0513y {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f8868a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f8869b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0509u interfaceC0509u) {
        try {
            o6.j.b(constructor.newInstance(interfaceC0509u));
            throw new ClassCastException();
        } catch (IllegalAccessException e9) {
            throw new RuntimeException(e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z8;
        boolean z9;
        boolean z10;
        String str;
        HashMap hashMap = f8868a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i4 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r32 != null) {
                    str = r32.getName();
                } else {
                    str = "";
                }
                o6.j.b(str);
                if (str.length() != 0) {
                    o6.j.b(canonicalName);
                    canonicalName = canonicalName.substring(str.length() + 1);
                    o6.j.d(canonicalName, "substring(...)");
                }
                o6.j.b(canonicalName);
                String concat = I7.v.Z(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (str.length() != 0) {
                    concat = str + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException(e9);
            }
            HashMap hashMap2 = f8869b;
            if (constructor != null) {
                hashMap2.put(cls, E2.d.y(constructor));
            } else {
                C0493d c0493d = C0493d.f8833c;
                HashMap hashMap3 = c0493d.f8835b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z8 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 < length) {
                                if (((E) declaredMethods[i8].getAnnotation(E.class)) != null) {
                                    c0493d.a(cls, declaredMethods);
                                    z8 = true;
                                    break;
                                }
                                i8++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z8 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e10) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
                    }
                }
                if (!z8) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0509u.class.isAssignableFrom(superclass)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        o6.j.b(superclass);
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            o6.j.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    P.S g8 = o6.j.g(cls.getInterfaces());
                    while (true) {
                        if (g8.hasNext()) {
                            Class cls2 = (Class) g8.next();
                            if (cls2 != null && InterfaceC0509u.class.isAssignableFrom(cls2)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                o6.j.b(cls2);
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                o6.j.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i4 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i4));
        return i4;
    }
}
