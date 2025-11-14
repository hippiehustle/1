package androidx.lifecycle;

import a6.AbstractC0434i;
import a6.AbstractC0437l;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Y {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8822a = AbstractC0437l.X(Application.class, Q.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f8823b = E2.d.y(Q.class);

    public static final Constructor a(Class cls, List list) {
        o6.j.e(cls, "modelClass");
        o6.j.e(list, "signature");
        P.S g8 = o6.j.g(cls.getConstructors());
        while (g8.hasNext()) {
            Constructor constructor = (Constructor) g8.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            o6.j.d(parameterTypes, "getParameterTypes(...)");
            List i12 = AbstractC0434i.i1(parameterTypes);
            if (list.equals(i12)) {
                return constructor;
            }
            if (list.size() == i12.size() && i12.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final Z b(Class cls, Constructor constructor, Object... objArr) {
        o6.j.e(cls, "modelClass");
        try {
            return (Z) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("Failed to access " + cls, e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e11.getCause());
        }
    }
}
