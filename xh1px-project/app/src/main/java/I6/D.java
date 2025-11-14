package I6;

import f7.C0723c;
import f7.C0725e;
import java.lang.annotation.Annotation;
import java.util.Collection;
import q4.X;

/* loaded from: classes.dex */
public final class D extends s implements W6.b {

    /* renamed from: a, reason: collision with root package name */
    public final B f2178a;

    /* renamed from: b, reason: collision with root package name */
    public final Annotation[] f2179b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2180c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2181d;

    public D(B b4, Annotation[] annotationArr, String str, boolean z8) {
        o6.j.e(annotationArr, "reflectAnnotations");
        this.f2178a = b4;
        this.f2179b = annotationArr;
        this.f2180c = str;
        this.f2181d = z8;
    }

    @Override // W6.b
    public final C0066e a(C0723c c0723c) {
        o6.j.e(c0723c, "fqName");
        return X.s(this.f2179b, c0723c);
    }

    @Override // W6.b
    public final Collection getAnnotations() {
        return X.v(this.f2179b);
    }

    public final String toString() {
        String str;
        C0725e c0725e;
        StringBuilder sb = new StringBuilder();
        sb.append(D.class.getName());
        sb.append(": ");
        if (this.f2181d) {
            str = "vararg ";
        } else {
            str = "";
        }
        sb.append(str);
        String str2 = this.f2180c;
        if (str2 != null) {
            c0725e = C0725e.d(str2);
        } else {
            c0725e = null;
        }
        sb.append(c0725e);
        sb.append(": ");
        sb.append(this.f2178a);
        return sb.toString();
    }
}
