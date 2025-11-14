package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f8674a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f8675b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f8676c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8677d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f8678e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f8679f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f8680g;

    static {
        boolean r8;
        boolean q6;
        Unsafe i4 = i();
        f8674a = i4;
        f8675b = AbstractC0467c.f8663a;
        boolean h8 = h(Long.TYPE);
        boolean h9 = h(Integer.TYPE);
        e0 e0Var = null;
        if (i4 != null) {
            if (AbstractC0467c.a()) {
                if (h8) {
                    e0Var = new c0(i4, 1);
                } else if (h9) {
                    e0Var = new c0(i4, 0);
                }
            } else {
                e0Var = new e0(i4);
            }
        }
        f8676c = e0Var;
        boolean z8 = false;
        if (e0Var == null) {
            r8 = false;
        } else {
            r8 = e0Var.r();
        }
        f8677d = r8;
        if (e0Var == null) {
            q6 = false;
        } else {
            q6 = e0Var.q();
        }
        f8678e = q6;
        f8679f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field g8 = g();
        if (g8 != null && e0Var != null) {
            e0Var.i(g8);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z8 = true;
        }
        f8680g = z8;
    }

    public static void a(Throwable th) {
        Logger.getLogger(f0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j, Object obj) {
        if (((byte) ((f8676c.f((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean c(long j, Object obj) {
        if (((byte) ((f8676c.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static Object d(Class cls) {
        try {
            return f8674a.allocateInstance(cls);
        } catch (InstantiationException e9) {
            throw new IllegalStateException(e9);
        }
    }

    public static int e(Class cls) {
        if (f8678e) {
            return f8676c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f8678e) {
            f8676c.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        if (AbstractC0467c.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean h(Class cls) {
        if (!AbstractC0467c.a()) {
            return false;
        }
        try {
            Class cls2 = f8675b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b4) {
        f8676c.k(bArr, f8679f + j, b4);
    }

    public static void k(Object obj, long j, byte b4) {
        long j5 = (-4) & j;
        int f8 = f8676c.f(j5, obj);
        int i4 = ((~((int) j)) & 3) << 3;
        m(((255 & b4) << i4) | (f8 & (~(255 << i4))), j5, obj);
    }

    public static void l(Object obj, long j, byte b4) {
        long j5 = (-4) & j;
        int i4 = (((int) j) & 3) << 3;
        m(((255 & b4) << i4) | (f8676c.f(j5, obj) & (~(255 << i4))), j5, obj);
    }

    public static void m(int i4, long j, Object obj) {
        f8676c.n(i4, j, obj);
    }

    public static void n(Object obj, long j, long j5) {
        f8676c.o(obj, j, j5);
    }

    public static void o(Object obj, long j, Object obj2) {
        f8676c.p(obj, j, obj2);
    }
}
