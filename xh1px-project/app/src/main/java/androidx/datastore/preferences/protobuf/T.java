package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f8637a;

    /* renamed from: b, reason: collision with root package name */
    public static final Y f8638b;

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f8639c;

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.datastore.preferences.protobuf.a0, java.lang.Object] */
    static {
        Class<?> cls;
        Class<?> cls2;
        O o7 = O.f8627c;
        Y y4 = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f8637a = cls;
        try {
            O o8 = O.f8627c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                y4 = (Y) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f8638b = y4;
        f8639c = new Object();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i4 += C0475k.Y(((Integer) list.get(i8)).intValue());
        }
        return i4;
    }

    public static int b(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0475k.W(i4) + 4) * size;
    }

    public static int c(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0475k.W(i4) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i4 += C0475k.Y(((Integer) list.get(i8)).intValue());
        }
        return i4;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i4 += C0475k.Y(((Long) list.get(i8)).longValue());
        }
        return i4;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            int intValue = ((Integer) list.get(i8)).intValue();
            i4 += C0475k.X((intValue >> 31) ^ (intValue << 1));
        }
        return i4;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            long longValue = ((Long) list.get(i8)).longValue();
            i4 += C0475k.Y((longValue >> 63) ^ (longValue << 1));
        }
        return i4;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i4 += C0475k.X(((Integer) list.get(i8)).intValue());
        }
        return i4;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i4 += C0475k.Y(((Long) list.get(i8)).longValue());
        }
        return i4;
    }

    public static void k(Y y4, Object obj, Object obj2) {
        ((a0) y4).getClass();
        AbstractC0484u abstractC0484u = (AbstractC0484u) obj;
        Z z8 = abstractC0484u.unknownFields;
        Z z9 = ((AbstractC0484u) obj2).unknownFields;
        Z z10 = Z.f8656f;
        if (!z10.equals(z9)) {
            if (z10.equals(z8)) {
                int i4 = z8.f8657a + z9.f8657a;
                int[] copyOf = Arrays.copyOf(z8.f8658b, i4);
                System.arraycopy(z9.f8658b, 0, copyOf, z8.f8657a, z9.f8657a);
                Object[] copyOf2 = Arrays.copyOf(z8.f8659c, i4);
                System.arraycopy(z9.f8659c, 0, copyOf2, z8.f8657a, z9.f8657a);
                z8 = new Z(i4, copyOf, copyOf2, true);
            } else {
                z8.getClass();
                if (!z9.equals(z10)) {
                    if (z8.f8661e) {
                        int i8 = z8.f8657a + z9.f8657a;
                        z8.a(i8);
                        System.arraycopy(z9.f8658b, 0, z8.f8658b, z8.f8657a, z9.f8657a);
                        System.arraycopy(z9.f8659c, 0, z8.f8659c, z8.f8657a, z9.f8657a);
                        z8.f8657a = i8;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        abstractC0484u.unknownFields = z8;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void m(int i4, List list, B b4, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0475k c0475k = (C0475k) b4.f8597a;
            int i8 = 0;
            if (z8) {
                c0475k.p0(i4, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Boolean) list.get(i10)).getClass();
                    Logger logger = C0475k.f8705n;
                    i9++;
                }
                c0475k.r0(i9);
                while (i8 < list.size()) {
                    c0475k.b0(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0475k.d0(i4, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
        }
    }

    public static void n(int i4, List list, B b4, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0475k c0475k = (C0475k) b4.f8597a;
            int i8 = 0;
            if (z8) {
                c0475k.p0(i4, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Double) list.get(i10)).getClass();
                    Logger logger = C0475k.f8705n;
                    i9 += 8;
                }
                c0475k.r0(i9);
                while (i8 < list.size()) {
                    c0475k.j0(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                double doubleValue = ((Double) list.get(i8)).doubleValue();
                c0475k.getClass();
                c0475k.i0(i4, Double.doubleToRawLongBits(doubleValue));
                i8++;
            }
        }
    }

    public static void o(int i4, List list, B b4, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0475k c0475k = (C0475k) b4.f8597a;
            int i8 = 0;
            if (z8) {
                c0475k.p0(i4, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += C0475k.Y(((Integer) list.get(i10)).intValue());
                }
                c0475k.r0(i9);
                while (i8 < list.size()) {
                    c0475k.l0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0475k.k0(i4, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void p(int i4, List list, B b4, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0475k c0475k = (C0475k) b4.f8597a;
            int i8 = 0;
            if (z8) {
                c0475k.p0(i4, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Integer) list.get(i10)).getClass();
                    Logger logger = C0475k.f8705n;
                    i9 += 4;
                }
                c0475k.r0(i9);
                while (i8 < list.size()) {
                    c0475k.h0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0475k.g0(i4, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void q(int i4, List list, B b4, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0475k c0475k = (C0475k) b4.f8597a;
            int i8 = 0;
            if (z8) {
                c0475k.p0(i4, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Long) list.get(i10)).getClass();
                    Logger logger = C0475k.f8705n;
                    i9 += 8;
                }
                c0475k.r0(i9);
                while (i8 < list.size()) {
                    c0475k.j0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0475k.i0(i4, ((Long) list.get(i8)).longValue());
                i8++;
            }
        }
    }

    public static void r(int i4, List list, B b4, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0475k c0475k = (C0475k) b4.f8597a;
            int i8 = 0;
            if (z8) {
                c0475k.p0(i4, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Float) list.get(i10)).getClass();
                    Logger logger = C0475k.f8705n;
                    i9 += 4;
                }
                c0475k.r0(i9);
                while (i8 < list.size()) {
                    c0475k.h0(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                float floatValue = ((Float) list.get(i8)).floatValue();
                c0475k.getClass();
                c0475k.g0(i4, Float.floatToRawIntBits(floatValue));
                i8++;
            }
        }
    }

    public static void s(int i4, List list, B b4, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0475k c0475k = (C0475k) b4.f8597a;
            int i8 = 0;
            if (z8) {
                c0475k.p0(i4, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += C0475k.Y(((Integer) list.get(i10)).intValue());
                }
                c0475k.r0(i9);
                while (i8 < list.size()) {
                    c0475k.l0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0475k.k0(i4, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void t(int i4, List list, B b4, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0475k c0475k = (C0475k) b4.f8597a;
            int i8 = 0;
            if (z8) {
                c0475k.p0(i4, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += C0475k.Y(((Long) list.get(i10)).longValue());
                }
                c0475k.r0(i9);
                while (i8 < list.size()) {
                    c0475k.t0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0475k.s0(i4, ((Long) list.get(i8)).longValue());
                i8++;
            }
        }
    }

    public static void u(int i4, List list, B b4, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0475k c0475k = (C0475k) b4.f8597a;
            int i8 = 0;
            if (z8) {
                c0475k.p0(i4, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Integer) list.get(i10)).getClass();
                    Logger logger = C0475k.f8705n;
                    i9 += 4;
                }
                c0475k.r0(i9);
                while (i8 < list.size()) {
                    c0475k.h0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0475k.g0(i4, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void v(int i4, List list, B b4, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0475k c0475k = (C0475k) b4.f8597a;
            int i8 = 0;
            if (z8) {
                c0475k.p0(i4, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Long) list.get(i10)).getClass();
                    Logger logger = C0475k.f8705n;
                    i9 += 8;
                }
                c0475k.r0(i9);
                while (i8 < list.size()) {
                    c0475k.j0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0475k.i0(i4, ((Long) list.get(i8)).longValue());
                i8++;
            }
        }
    }

    public static void w(int i4, List list, B b4, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0475k c0475k = (C0475k) b4.f8597a;
            int i8 = 0;
            if (z8) {
                c0475k.p0(i4, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    int intValue = ((Integer) list.get(i10)).intValue();
                    i9 += C0475k.X((intValue >> 31) ^ (intValue << 1));
                }
                c0475k.r0(i9);
                while (i8 < list.size()) {
                    int intValue2 = ((Integer) list.get(i8)).intValue();
                    c0475k.r0((intValue2 >> 31) ^ (intValue2 << 1));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                int intValue3 = ((Integer) list.get(i8)).intValue();
                c0475k.q0(i4, (intValue3 >> 31) ^ (intValue3 << 1));
                i8++;
            }
        }
    }

    public static void x(int i4, List list, B b4, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0475k c0475k = (C0475k) b4.f8597a;
            int i8 = 0;
            if (z8) {
                c0475k.p0(i4, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    long longValue = ((Long) list.get(i10)).longValue();
                    i9 += C0475k.Y((longValue >> 63) ^ (longValue << 1));
                }
                c0475k.r0(i9);
                while (i8 < list.size()) {
                    long longValue2 = ((Long) list.get(i8)).longValue();
                    c0475k.t0((longValue2 >> 63) ^ (longValue2 << 1));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                long longValue3 = ((Long) list.get(i8)).longValue();
                c0475k.s0(i4, (longValue3 >> 63) ^ (longValue3 << 1));
                i8++;
            }
        }
    }

    public static void y(int i4, List list, B b4, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0475k c0475k = (C0475k) b4.f8597a;
            int i8 = 0;
            if (z8) {
                c0475k.p0(i4, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += C0475k.X(((Integer) list.get(i10)).intValue());
                }
                c0475k.r0(i9);
                while (i8 < list.size()) {
                    c0475k.r0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0475k.q0(i4, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void z(int i4, List list, B b4, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0475k c0475k = (C0475k) b4.f8597a;
            int i8 = 0;
            if (z8) {
                c0475k.p0(i4, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += C0475k.Y(((Long) list.get(i10)).longValue());
                }
                c0475k.r0(i9);
                while (i8 < list.size()) {
                    c0475k.t0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0475k.s0(i4, ((Long) list.get(i8)).longValue());
                i8++;
            }
        }
    }

    public static Object j(Object obj, int i4, InterfaceC0485v interfaceC0485v, Object obj2, Y y4) {
        return obj2;
    }
}
