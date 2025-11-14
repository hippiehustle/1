package I6;

import f7.C0723c;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import q4.X;

/* loaded from: classes.dex */
public final class C extends s implements W6.b {

    /* renamed from: a, reason: collision with root package name */
    public final TypeVariable f2177a;

    public C(TypeVariable typeVariable) {
        o6.j.e(typeVariable, "typeVariable");
        this.f2177a = typeVariable;
    }

    @Override // W6.b
    public final C0066e a(C0723c c0723c) {
        AnnotatedElement annotatedElement;
        Annotation[] declaredAnnotations;
        o6.j.e(c0723c, "fqName");
        TypeVariable typeVariable = this.f2177a;
        if (typeVariable instanceof AnnotatedElement) {
            annotatedElement = (AnnotatedElement) typeVariable;
        } else {
            annotatedElement = null;
        }
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return X.s(declaredAnnotations, c0723c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C) {
            if (o6.j.a(this.f2177a, ((C) obj).f2177a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // W6.b
    public final Collection getAnnotations() {
        AnnotatedElement annotatedElement;
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f2177a;
        if (typeVariable instanceof AnnotatedElement) {
            annotatedElement = (AnnotatedElement) typeVariable;
        } else {
            annotatedElement = null;
        }
        if (annotatedElement != null && (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) != null) {
            return X.v(declaredAnnotations);
        }
        return a6.s.f7766d;
    }

    public final int hashCode() {
        return this.f2177a.hashCode();
    }

    public final String toString() {
        return C.class.getName() + ": " + this.f2177a;
    }
}
