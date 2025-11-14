package o6;

import L7.C0165x;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import n6.InterfaceC1165d;
import n6.InterfaceC1166e;
import n6.InterfaceC1167f;
import u6.InterfaceC1642c;
import w6.InterfaceC1718e;

/* renamed from: o6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1286e implements InterfaceC1642c, InterfaceC1285d {

    /* renamed from: e, reason: collision with root package name */
    public static final Map f13634e;

    /* renamed from: d, reason: collision with root package name */
    public final Class f13635d;

    static {
        List X8 = AbstractC0437l.X(InterfaceC1162a.class, InterfaceC1163b.class, InterfaceC1164c.class, InterfaceC1165d.class, InterfaceC1166e.class, InterfaceC1167f.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class);
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(X8, 10));
        int i4 = 0;
        for (Object obj : X8) {
            int i8 = i4 + 1;
            if (i4 >= 0) {
                arrayList.add(new Z5.j((Class) obj, Integer.valueOf(i4)));
                i4 = i8;
            } else {
                AbstractC0437l.c0();
                throw null;
            }
        }
        f13634e = a6.x.R0(arrayList);
    }

    public C1286e(Class cls) {
        j.e(cls, "jClass");
        this.f13635d = cls;
    }

    @Override // u6.InterfaceC1642c
    public final String a() {
        String d2;
        Class cls = this.f13635d;
        j.e(cls, "jClass");
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (d2 = y.d(componentType.getName())) != null) {
                str = d2.concat("Array");
            }
            if (str == null) {
                return "kotlin.Array";
            }
            return str;
        }
        String d3 = y.d(cls.getName());
        if (d3 == null) {
            return cls.getCanonicalName();
        }
        return d3;
    }

    @Override // u6.InterfaceC1642c
    public final boolean b(Object obj) {
        Class cls = this.f13635d;
        j.e(cls, "jClass");
        Map map = f13634e;
        j.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return y.e(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = h2.a.l(h2.a.n(cls));
        }
        return cls.isInstance(obj);
    }

    @Override // u6.InterfaceC1642c
    public final String c() {
        String f8;
        Class cls = this.f13635d;
        j.e(cls, "jClass");
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return I7.m.s0(simpleName, enclosingMethod.getName() + '$');
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return I7.m.s0(simpleName, enclosingConstructor.getName() + '$');
            }
            return I7.m.r0('$', simpleName, simpleName);
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (f8 = y.f(componentType.getName())) != null) {
                str = f8.concat("Array");
            }
            if (str == null) {
                return "Array";
            }
            return str;
        }
        String f9 = y.f(cls.getName());
        if (f9 == null) {
            return cls.getSimpleName();
        }
        return f9;
    }

    @Override // o6.InterfaceC1285d
    public final Class d() {
        return this.f13635d;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C1286e) && h2.a.l(this).equals(h2.a.l((InterfaceC1642c) obj))) {
            return true;
        }
        return false;
    }

    @Override // u6.InterfaceC1642c
    public final int hashCode() {
        return h2.a.l(this).hashCode();
    }

    @Override // u6.InterfaceC1642c
    public final boolean m() {
        throw new C0165x();
    }

    public final String toString() {
        return this.f13635d + " (Kotlin reflection is not available)";
    }
}
