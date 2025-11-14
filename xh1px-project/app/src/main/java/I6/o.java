package I6;

import a.AbstractC0405a;
import a6.AbstractC0434i;
import f7.C0723c;
import f7.C0725e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import q4.X;

/* loaded from: classes.dex */
public final class o extends s implements W6.b, W6.e {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2208a;

    public o(Class cls) {
        o6.j.e(cls, "klass");
        this.f2208a = cls;
    }

    @Override // W6.b
    public final C0066e a(C0723c c0723c) {
        Annotation[] declaredAnnotations;
        o6.j.e(c0723c, "fqName");
        Class cls = this.f2208a;
        if (cls != null && (declaredAnnotations = cls.getDeclaredAnnotations()) != null) {
            return X.s(declaredAnnotations, c0723c);
        }
        return null;
    }

    public final List b() {
        Field[] declaredFields = this.f2208a.getDeclaredFields();
        o6.j.d(declaredFields, "getDeclaredFields(...)");
        return H7.m.Y(H7.m.W(new H7.g(AbstractC0434i.L0(declaredFields), false, l.f2205l), m.f2206l));
    }

    public final C0723c c() {
        return AbstractC0065d.a(this.f2208a).a();
    }

    public final List d() {
        Method[] declaredMethods = this.f2208a.getDeclaredMethods();
        o6.j.d(declaredMethods, "getDeclaredMethods(...)");
        return H7.m.Y(H7.m.W(new H7.g(AbstractC0434i.L0(declaredMethods), true, new B6.n(4, this)), n.f2207l));
    }

    public final C0725e e() {
        Class cls = this.f2208a;
        if (cls.isAnonymousClass()) {
            String name = cls.getName();
            int l02 = I7.m.l0(0, 6, name, ".");
            if (l02 != -1) {
                name = name.substring(1 + l02, name.length());
                o6.j.d(name, "substring(...)");
            }
            return C0725e.e(name);
        }
        return C0725e.e(cls.getSimpleName());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (o6.j.a(this.f2208a, ((o) obj).f2208a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final ArrayList f() {
        Class cls = this.f2208a;
        o6.j.e(cls, "clazz");
        A4.a aVar = AbstractC0405a.f7655a;
        Object[] objArr = null;
        if (aVar == null) {
            try {
                aVar = new A4.a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 16);
            } catch (NoSuchMethodException unused) {
                aVar = new A4.a(objArr, objArr, objArr, objArr, 16);
            }
            AbstractC0405a.f7655a = aVar;
        }
        Method method = (Method) aVar.f283h;
        if (method != null) {
            objArr = (Object[]) method.invoke(cls, null);
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new A(obj));
        }
        return arrayList;
    }

    public final boolean g() {
        Class cls = this.f2208a;
        o6.j.e(cls, "clazz");
        A4.a aVar = AbstractC0405a.f7655a;
        Boolean bool = null;
        if (aVar == null) {
            try {
                aVar = new A4.a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 16);
            } catch (NoSuchMethodException unused) {
                aVar = new A4.a(bool, bool, bool, bool, 16);
            }
            AbstractC0405a.f7655a = aVar;
        }
        Method method = (Method) aVar.f282g;
        if (method != null) {
            Object invoke = method.invoke(cls, null);
            o6.j.c(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) invoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // W6.b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f2208a;
        if (cls != null && (declaredAnnotations = cls.getDeclaredAnnotations()) != null) {
            return X.v(declaredAnnotations);
        }
        return a6.s.f7766d;
    }

    @Override // W6.e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f2208a.getTypeParameters();
        o6.j.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f2208a.hashCode();
    }

    public final String toString() {
        return o.class.getName() + ": " + this.f2208a;
    }
}
