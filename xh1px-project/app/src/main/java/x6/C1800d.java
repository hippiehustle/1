package x6;

import L7.C0165x;
import a6.AbstractC0434i;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: x6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1800d implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Class f16253a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f16254b;

    /* renamed from: c, reason: collision with root package name */
    public final Z5.n f16255c;

    /* renamed from: d, reason: collision with root package name */
    public final Z5.n f16256d;

    /* renamed from: e, reason: collision with root package name */
    public final List f16257e;

    public C1800d(Class cls, Map map, Z5.n nVar, Z5.n nVar2, List list) {
        this.f16253a = cls;
        this.f16254b = map;
        this.f16255c = nVar;
        this.f16256d = nVar2;
        this.f16257e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Annotation annotation;
        Class cls;
        boolean a3;
        boolean z8;
        String name = method.getName();
        Class cls2 = this.f16253a;
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return cls2;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.f16256d.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.f16255c.getValue();
            }
        }
        boolean a4 = o6.j.a(name, "equals");
        Map map = this.f16254b;
        boolean z9 = false;
        if (a4 && objArr != null && objArr.length == 1) {
            Object d12 = AbstractC0434i.d1(objArr);
            if (d12 instanceof Annotation) {
                annotation = (Annotation) d12;
            } else {
                annotation = null;
            }
            if (annotation != null) {
                cls = h2.a.k(h2.a.g(annotation));
            } else {
                cls = null;
            }
            if (o6.j.a(cls, cls2)) {
                List<Method> list = this.f16257e;
                if (list == null || !list.isEmpty()) {
                    for (Method method2 : list) {
                        Object obj2 = map.get(method2.getName());
                        Object invoke = method2.invoke(d12, null);
                        if (obj2 instanceof boolean[]) {
                            o6.j.c(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                            a3 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                        } else if (obj2 instanceof char[]) {
                            o6.j.c(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                            a3 = Arrays.equals((char[]) obj2, (char[]) invoke);
                        } else if (obj2 instanceof byte[]) {
                            o6.j.c(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                            a3 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                        } else if (obj2 instanceof short[]) {
                            o6.j.c(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                            a3 = Arrays.equals((short[]) obj2, (short[]) invoke);
                        } else if (obj2 instanceof int[]) {
                            o6.j.c(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                            a3 = Arrays.equals((int[]) obj2, (int[]) invoke);
                        } else if (obj2 instanceof float[]) {
                            o6.j.c(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                            a3 = Arrays.equals((float[]) obj2, (float[]) invoke);
                        } else if (obj2 instanceof long[]) {
                            o6.j.c(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                            a3 = Arrays.equals((long[]) obj2, (long[]) invoke);
                        } else if (obj2 instanceof double[]) {
                            o6.j.c(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                            a3 = Arrays.equals((double[]) obj2, (double[]) invoke);
                        } else if (obj2 instanceof Object[]) {
                            o6.j.c(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                            a3 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                        } else {
                            a3 = o6.j.a(obj2, invoke);
                        }
                        if (!a3) {
                            z8 = false;
                            break;
                        }
                    }
                }
                z8 = true;
                if (z8) {
                    z9 = true;
                }
            }
            return Boolean.valueOf(z9);
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb = new StringBuilder("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb.append(AbstractC0434i.i1(objArr));
        sb.append(')');
        throw new C0165x(sb.toString());
    }
}
