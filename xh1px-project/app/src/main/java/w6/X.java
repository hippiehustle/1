package w6;

import h6.AbstractC0837b;
import h7.AbstractC0842e;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class X implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15829d;

    /* renamed from: e, reason: collision with root package name */
    public final Z f15830e;

    public /* synthetic */ X(Z z8, int i4) {
        this.f15829d = i4;
        this.f15830e = z8;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        Object obj;
        AccessibleObject accessibleObject;
        switch (this.f15829d) {
            case 0:
                return new Y(this.f15830e);
            default:
                Z z8 = this.f15830e;
                Object u8 = z8.u();
                try {
                    Object obj2 = m0.f15876l;
                    if (z8.t()) {
                        obj = AbstractC0842e.e(z8.f15880i, z8.o());
                    } else {
                        obj = null;
                    }
                    if (obj == obj2) {
                        obj = null;
                    }
                    if (u8 != null) {
                        accessibleObject = (AccessibleObject) u8;
                    } else {
                        accessibleObject = null;
                    }
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(AbstractC0837b.n(z8));
                    }
                    if (u8 == null) {
                        return null;
                    }
                    if (u8 instanceof Field) {
                        return ((Field) u8).get(obj);
                    }
                    if (u8 instanceof Method) {
                        int length = ((Method) u8).getParameterTypes().length;
                        if (length != 0) {
                            if (length != 1) {
                                if (length == 2) {
                                    Method method = (Method) u8;
                                    Class<?> cls = ((Method) u8).getParameterTypes()[1];
                                    o6.j.d(cls, "get(...)");
                                    return method.invoke(null, obj, y0.e(cls));
                                }
                                throw new AssertionError("delegate method " + u8 + " should take 0, 1, or 2 parameters");
                            }
                            Method method2 = (Method) u8;
                            if (obj == null) {
                                Class<?> cls2 = ((Method) u8).getParameterTypes()[0];
                                o6.j.d(cls2, "get(...)");
                                obj = y0.e(cls2);
                            }
                            return method2.invoke(null, obj);
                        }
                        return ((Method) u8).invoke(null, null);
                    }
                    throw new AssertionError("delegate field/method " + u8 + " neither field nor method");
                } catch (IllegalAccessException e9) {
                    throw new Exception("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e9);
                }
        }
    }
}
