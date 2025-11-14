package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f8671a;

    public e0(Unsafe unsafe) {
        this.f8671a = unsafe;
    }

    public final int a(Class cls) {
        return this.f8671a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f8671a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, Object obj);

    public abstract double d(long j, Object obj);

    public abstract float e(long j, Object obj);

    public final int f(long j, Object obj) {
        return this.f8671a.getInt(obj, j);
    }

    public final long g(long j, Object obj) {
        return this.f8671a.getLong(obj, j);
    }

    public final Object h(long j, Object obj) {
        return this.f8671a.getObject(obj, j);
    }

    public final long i(Field field) {
        return this.f8671a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j, boolean z8);

    public abstract void k(Object obj, long j, byte b4);

    public abstract void l(Object obj, long j, double d2);

    public abstract void m(Object obj, long j, float f8);

    public final void n(int i4, long j, Object obj) {
        this.f8671a.putInt(obj, j, i4);
    }

    public final void o(Object obj, long j, long j5) {
        this.f8671a.putLong(obj, j, j5);
    }

    public final void p(Object obj, long j, Object obj2) {
        this.f8671a.putObject(obj, j, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f8671a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            f0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
