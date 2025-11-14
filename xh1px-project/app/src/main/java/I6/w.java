package I6;

import C6.b0;
import C6.e0;
import C6.h0;
import a6.AbstractC0436k;
import f7.AbstractC0727g;
import f7.C0723c;
import f7.C0725e;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import q4.X;

/* loaded from: classes.dex */
public abstract class w extends s implements W6.b, W6.c {
    @Override // W6.b
    public final C0066e a(C0723c c0723c) {
        o6.j.e(c0723c, "fqName");
        Member b4 = b();
        o6.j.c(b4, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) b4).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return X.s(declaredAnnotations, c0723c);
        }
        return null;
    }

    public abstract Member b();

    public final C0725e c() {
        String name = b().getName();
        if (name != null) {
            return C0725e.e(name);
        }
        return AbstractC0727g.f10808a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList d(Type[] typeArr, Annotation[][] annotationArr, boolean z8) {
        Method method;
        ArrayList arrayList;
        int i4;
        B iVar;
        B b4;
        String str;
        boolean z9;
        C0062a c0062a;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        C0063b c0063b = C0063b.f2185a;
        Member b9 = b();
        o6.j.e(b9, "member");
        C0062a c0062a2 = C0063b.f2186b;
        if (c0062a2 == null) {
            synchronized (c0063b) {
                c0062a2 = C0063b.f2186b;
                if (c0062a2 == null) {
                    Class<?> cls = b9.getClass();
                    try {
                        c0062a = new C0062a(cls.getMethod("getParameters", null), AbstractC0065d.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
                    } catch (NoSuchMethodException unused) {
                        c0062a = new C0062a(null, null);
                    }
                    C0063b.f2186b = c0062a;
                    c0062a2 = c0062a;
                }
            }
        }
        Method method2 = c0062a2.f2183a;
        if (method2 == null || (method = c0062a2.f2184b) == null) {
            arrayList = null;
        } else {
            Object invoke = method2.invoke(b9, null);
            o6.j.c(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) invoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object invoke2 = method.invoke(obj, null);
                o6.j.c(invoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) invoke2);
            }
        }
        if (arrayList != null) {
            i4 = arrayList.size() - typeArr.length;
        } else {
            i4 = 0;
        }
        int length = typeArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            Type type = typeArr[i8];
            o6.j.e(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls2 = (Class) type;
                if (cls2.isPrimitive()) {
                    b4 = new z(cls2);
                    if (arrayList == null) {
                        str = (String) AbstractC0436k.s0(i8 + i4, arrayList);
                        if (str == null) {
                            throw new IllegalStateException(("No parameter with index " + i8 + '+' + i4 + " (name=" + c() + " type=" + b4 + ") in " + this).toString());
                        }
                    } else {
                        str = null;
                    }
                    if (z8) {
                        z9 = true;
                        if (i8 == typeArr.length - 1) {
                            arrayList2.add(new D(b4, annotationArr[i8], str, z9));
                        }
                    }
                    z9 = false;
                    arrayList2.add(new D(b4, annotationArr[i8], str, z9));
                }
            }
            if (!(type instanceof GenericArrayType) && (!z10 || !((Class) type).isArray())) {
                if (type instanceof WildcardType) {
                    iVar = new E((WildcardType) type);
                } else {
                    iVar = new q(type);
                }
            } else {
                iVar = new i(type);
            }
            b4 = iVar;
            if (arrayList == null) {
            }
            if (z8) {
            }
            z9 = false;
            arrayList2.add(new D(b4, annotationArr[i8], str, z9));
        }
        return arrayList2;
    }

    public final h0 e() {
        int modifiers = b().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return e0.f740g;
        }
        if (Modifier.isPrivate(modifiers)) {
            return b0.f734g;
        }
        if (Modifier.isProtected(modifiers)) {
            if (Modifier.isStatic(modifiers)) {
                return G6.c.f1844g;
            }
            return G6.b.f1843g;
        }
        return G6.a.f1842g;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof w) && o6.j.a(b(), ((w) obj).b())) {
            return true;
        }
        return false;
    }

    @Override // W6.b
    public final Collection getAnnotations() {
        Member b4 = b();
        o6.j.c(b4, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) b4).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return X.v(declaredAnnotations);
        }
        return a6.s.f7766d;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
