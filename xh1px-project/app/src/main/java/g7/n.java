package g7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0793b f11247a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11248b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0793b f11249c;

    /* renamed from: d, reason: collision with root package name */
    public final C0804m f11250d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f11251e;

    public n(AbstractC0793b abstractC0793b, Object obj, AbstractC0793b abstractC0793b2, C0804m c0804m, Class cls) {
        if (abstractC0793b != null) {
            if (c0804m.f11245e == L.f11204i && abstractC0793b2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f11247a = abstractC0793b;
            this.f11248b = obj;
            this.f11249c = abstractC0793b2;
            this.f11250d = c0804m;
            if (p.class.isAssignableFrom(cls)) {
                try {
                    this.f11251e = cls.getMethod("valueOf", Integer.TYPE);
                    return;
                } catch (NoSuchMethodException e9) {
                    String name = cls.getName();
                    StringBuilder sb = new StringBuilder(name.length() + 52);
                    sb.append("Generated message class \"");
                    sb.append(name);
                    sb.append("\" missing method \"valueOf\".");
                    throw new RuntimeException(sb.toString(), e9);
                }
            }
            this.f11251e = null;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }

    public final Object a(Object obj) {
        if (this.f11250d.f11245e.f11205d == M.ENUM) {
            try {
                return this.f11251e.invoke(null, (Integer) obj);
            } catch (IllegalAccessException e9) {
                throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e9);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
                }
                throw ((RuntimeException) cause);
            }
        }
        return obj;
    }

    public final Object b(Object obj) {
        if (this.f11250d.f11245e.f11205d == M.ENUM) {
            return Integer.valueOf(((p) obj).a());
        }
        return obj;
    }
}
