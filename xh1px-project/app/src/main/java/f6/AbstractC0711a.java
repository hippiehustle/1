package f6;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: f6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0711a implements InterfaceC0617c, InterfaceC0714d, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0617c f10780d;

    public AbstractC0711a(InterfaceC0617c interfaceC0617c) {
        this.f10780d = interfaceC0617c;
    }

    public InterfaceC0714d g() {
        InterfaceC0617c interfaceC0617c = this.f10780d;
        if (interfaceC0617c instanceof InterfaceC0714d) {
            return (InterfaceC0714d) interfaceC0617c;
        }
        return null;
    }

    @Override // d6.InterfaceC0617c
    public final void k(Object obj) {
        InterfaceC0617c interfaceC0617c = this;
        while (true) {
            AbstractC0711a abstractC0711a = (AbstractC0711a) interfaceC0617c;
            InterfaceC0617c interfaceC0617c2 = abstractC0711a.f10780d;
            o6.j.b(interfaceC0617c2);
            try {
                obj = abstractC0711a.v(obj);
                if (obj == EnumC0646a.f10656d) {
                    return;
                }
            } catch (Throwable th) {
                obj = Z5.a.b(th);
            }
            abstractC0711a.w();
            if (interfaceC0617c2 instanceof AbstractC0711a) {
                interfaceC0617c = interfaceC0617c2;
            } else {
                interfaceC0617c2.k(obj);
                return;
            }
        }
    }

    public InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object u8 = u();
        if (u8 == null) {
            u8 = getClass().getName();
        }
        sb.append(u8);
        return sb.toString();
    }

    public StackTraceElement u() {
        int i4;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i8;
        InterfaceC0715e interfaceC0715e = (InterfaceC0715e) getClass().getAnnotation(InterfaceC0715e.class);
        String str2 = null;
        if (interfaceC0715e == null) {
            return null;
        }
        int v8 = interfaceC0715e.v();
        if (v8 <= 1) {
            int i9 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this);
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (num != null) {
                    i8 = num.intValue();
                } else {
                    i8 = 0;
                }
                i4 = i8 - 1;
            } catch (Exception unused) {
                i4 = -1;
            }
            if (i4 >= 0) {
                i9 = interfaceC0715e.l()[i4];
            }
            C0716f c0716f = AbstractC0717g.f10788b;
            C0716f c0716f2 = AbstractC0717g.f10787a;
            if (c0716f == null) {
                try {
                    C0716f c0716f3 = new C0716f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    AbstractC0717g.f10788b = c0716f3;
                    c0716f = c0716f3;
                } catch (Exception unused2) {
                    AbstractC0717g.f10788b = c0716f2;
                    c0716f = c0716f2;
                }
            }
            if (c0716f != c0716f2 && (method = c0716f.f10784a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = c0716f.f10785b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = c0716f.f10786c;
                if (method3 != null) {
                    obj = method3.invoke(invoke2, null);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = (String) obj;
                }
            }
            if (str2 == null) {
                str = interfaceC0715e.c();
            } else {
                str = str2 + '/' + interfaceC0715e.c();
            }
            return new StackTraceElement(str, interfaceC0715e.m(), interfaceC0715e.f(), i9);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v8 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object v(Object obj);

    public void w() {
    }
}
