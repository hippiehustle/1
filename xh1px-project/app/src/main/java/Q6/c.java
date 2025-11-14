package Q6;

import I6.AbstractC0065d;
import I6.C0066e;
import P6.w;
import T6.C0331f;
import a6.x;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import z6.m;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0725e f4913a = C0725e.e("message");

    /* renamed from: b, reason: collision with root package name */
    public static final C0725e f4914b = C0725e.e("allowedTargets");

    /* renamed from: c, reason: collision with root package name */
    public static final C0725e f4915c = C0725e.e("value");

    /* renamed from: d, reason: collision with root package name */
    public static final Object f4916d = x.P0(new Z5.j(m.f16786t, w.f4599c), new Z5.j(m.f16789w, w.f4600d), new Z5.j(m.f16790x, w.f4602f));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    public static R6.h a(C0723c c0723c, W6.b bVar, A4.a aVar) {
        C0066e a3;
        o6.j.e(c0723c, "kotlinName");
        o6.j.e(bVar, "annotationOwner");
        o6.j.e(aVar, "c");
        if (c0723c.equals(m.f16779m)) {
            C0723c c0723c2 = w.f4601e;
            o6.j.d(c0723c2, "DEPRECATED_ANNOTATION");
            C0066e a4 = bVar.a(c0723c2);
            if (a4 != null) {
                return new g(a4, aVar);
            }
        }
        C0723c c0723c3 = (C0723c) f4916d.get(c0723c);
        if (c0723c3 != null && (a3 = bVar.a(c0723c3)) != null) {
            return b(aVar, a3, false);
        }
        return null;
    }

    public static R6.h b(A4.a aVar, C0066e c0066e, boolean z8) {
        o6.j.e(c0066e, "annotation");
        o6.j.e(aVar, "c");
        C0722b a3 = AbstractC0065d.a(h2.a.k(h2.a.g(c0066e.f2196a)));
        C0723c c0723c = w.f4599c;
        o6.j.d(c0723c, "TARGET_ANNOTATION");
        if (a3.equals(E2.c.D0(c0723c))) {
            return new j(c0066e, aVar);
        }
        C0723c c0723c2 = w.f4600d;
        o6.j.d(c0723c2, "RETENTION_ANNOTATION");
        if (a3.equals(E2.c.D0(c0723c2))) {
            return new i(c0066e, aVar);
        }
        C0723c c0723c3 = w.f4602f;
        o6.j.d(c0723c3, "DOCUMENTED_ANNOTATION");
        if (a3.equals(E2.c.D0(c0723c3))) {
            return new b(aVar, c0066e, m.f16790x);
        }
        C0723c c0723c4 = w.f4601e;
        o6.j.d(c0723c4, "DEPRECATED_ANNOTATION");
        if (a3.equals(E2.c.D0(c0723c4))) {
            return null;
        }
        return new C0331f(aVar, c0066e, z8);
    }
}
