package I6;

import f7.C0725e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: I6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066e extends s {

    /* renamed from: a, reason: collision with root package name */
    public final Annotation f2196a;

    public C0066e(Annotation annotation) {
        o6.j.e(annotation, "annotation");
        this.f2196a = annotation;
    }

    public final ArrayList b() {
        f vVar;
        Annotation annotation = this.f2196a;
        Method[] declaredMethods = h2.a.k(h2.a.g(annotation)).getDeclaredMethods();
        o6.j.d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object invoke = method.invoke(annotation, null);
            o6.j.d(invoke, "invoke(...)");
            C0725e e9 = C0725e.e(method.getName());
            Class<?> cls = invoke.getClass();
            List list = AbstractC0065d.f2192a;
            if (Enum.class.isAssignableFrom(cls)) {
                vVar = new t(e9, (Enum) invoke);
            } else if (invoke instanceof Annotation) {
                vVar = new g(e9, (Annotation) invoke);
            } else if (invoke instanceof Object[]) {
                vVar = new h(e9, (Object[]) invoke);
            } else if (invoke instanceof Class) {
                vVar = new p(e9, (Class) invoke);
            } else {
                vVar = new v(e9, invoke);
            }
            arrayList.add(vVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0066e) {
            if (this.f2196a == ((C0066e) obj).f2196a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2196a);
    }

    public final String toString() {
        return C0066e.class.getName() + ": " + this.f2196a;
    }
}
