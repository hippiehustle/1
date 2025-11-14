package g0;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: b, reason: collision with root package name */
    public static final t.j f10867b = new t.j(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f10868a;

    public J(T t8) {
        this.f10868a = t8;
    }

    public static Class b(ClassLoader classLoader, String str) {
        t.j jVar = f10867b;
        t.j jVar2 = (t.j) jVar.get(classLoader);
        if (jVar2 == null) {
            jVar2 = new t.j(0);
            jVar.put(classLoader, jVar2);
        }
        Class cls = (Class) jVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            jVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e9) {
            throw new RuntimeException(A.j.p("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e9);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(A.j.p("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        }
    }

    public final AbstractComponentCallbacksC0755y a(String str) {
        try {
            return (AbstractComponentCallbacksC0755y) c(this.f10868a.f10921x.j.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException(A.j.p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException(A.j.p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(A.j.p("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(A.j.p("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12);
        }
    }
}
