package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0484u extends AbstractC0465a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0484u> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected Z unknownFields;

    public AbstractC0484u() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = Z.f8656f;
    }

    public static AbstractC0484u d(Class cls) {
        AbstractC0484u abstractC0484u = defaultInstanceMap.get(cls);
        if (abstractC0484u == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0484u = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e9) {
                throw new IllegalStateException("Class initialization cannot fail.", e9);
            }
        }
        if (abstractC0484u == null) {
            AbstractC0484u abstractC0484u2 = (AbstractC0484u) ((AbstractC0484u) f0.d(cls)).c(6);
            if (abstractC0484u2 != null) {
                defaultInstanceMap.put(cls, abstractC0484u2);
                return abstractC0484u2;
            }
            throw new IllegalStateException();
        }
        return abstractC0484u;
    }

    public static Object e(Method method, AbstractC0484u abstractC0484u, Object... objArr) {
        try {
            return method.invoke(abstractC0484u, objArr);
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

    public static final boolean f(AbstractC0484u abstractC0484u, boolean z8) {
        byte byteValue = ((Byte) abstractC0484u.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        O o7 = O.f8627c;
        o7.getClass();
        boolean e9 = o7.a(abstractC0484u.getClass()).e(abstractC0484u);
        if (z8) {
            abstractC0484u.c(2);
        }
        return e9;
    }

    public static void j(Class cls, AbstractC0484u abstractC0484u) {
        abstractC0484u.h();
        defaultInstanceMap.put(cls, abstractC0484u);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0465a
    public final int a(S s8) {
        int h8;
        int h9;
        if (g()) {
            if (s8 == null) {
                O o7 = O.f8627c;
                o7.getClass();
                h9 = o7.a(getClass()).h(this);
            } else {
                h9 = s8.h(this);
            }
            if (h9 >= 0) {
                return h9;
            }
            throw new IllegalStateException(A.j.l("serialized size must be non-negative, was ", h9));
        }
        int i4 = this.memoizedSerializedSize;
        if ((i4 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i4 & Integer.MAX_VALUE;
        }
        if (s8 == null) {
            O o8 = O.f8627c;
            o8.getClass();
            h8 = o8.a(getClass()).h(this);
        } else {
            h8 = s8.h(this);
        }
        k(h8);
        return h8;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0465a
    public final void b(C0475k c0475k) {
        O o7 = O.f8627c;
        o7.getClass();
        S a3 = o7.a(getClass());
        B b4 = c0475k.f8707i;
        if (b4 == null) {
            b4 = new B(c0475k);
        }
        a3.b(this, b4);
    }

    public abstract Object c(int i4);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        O o7 = O.f8627c;
        o7.getClass();
        return o7.a(getClass()).f(this, (AbstractC0484u) obj);
    }

    public final boolean g() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            O o7 = O.f8627c;
            o7.getClass();
            return o7.a(getClass()).c(this);
        }
        if (this.memoizedHashCode == 0) {
            O o8 = O.f8627c;
            o8.getClass();
            this.memoizedHashCode = o8.a(getClass()).c(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC0484u i() {
        return (AbstractC0484u) c(4);
    }

    public final void k(int i4) {
        if (i4 >= 0) {
            this.memoizedSerializedSize = (i4 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(A.j.l("serialized size must be non-negative, was ", i4));
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = I.f8607a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        I.c(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }
}
