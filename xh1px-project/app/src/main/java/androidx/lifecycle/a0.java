package androidx.lifecycle;

import android.app.Application;
import h4.AbstractC0832f;
import java.lang.reflect.InvocationTargetException;
import k0.AbstractC0948c;
import t7.C1594d;

/* loaded from: classes.dex */
public final class a0 extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public static a0 f8825c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1594d f8826d = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Application f8827b;

    public a0(Application application) {
        this.f8827b = application;
    }

    @Override // androidx.lifecycle.c0, androidx.lifecycle.b0
    public final Z a(Class cls, AbstractC0948c abstractC0948c) {
        o6.j.e(abstractC0948c, "extras");
        if (this.f8827b != null) {
            return b(cls);
        }
        Application application = (Application) abstractC0948c.a(f8826d);
        if (application != null) {
            return d(cls, application);
        }
        if (!AbstractC0490a.class.isAssignableFrom(cls)) {
            return AbstractC0832f.k(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    @Override // androidx.lifecycle.c0, androidx.lifecycle.b0
    public final Z b(Class cls) {
        o6.j.e(cls, "modelClass");
        Application application = this.f8827b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public final Z d(Class cls, Application application) {
        if (AbstractC0490a.class.isAssignableFrom(cls)) {
            try {
                Z z8 = (Z) cls.getConstructor(Application.class).newInstance(application);
                o6.j.b(z8);
                return z8;
            } catch (IllegalAccessException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }
        return super.b(cls);
    }
}
