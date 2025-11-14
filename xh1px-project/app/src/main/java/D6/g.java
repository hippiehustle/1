package D6;

import a6.s;
import a6.x;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0725e f1038a = C0725e.e("message");

    /* renamed from: b, reason: collision with root package name */
    public static final C0725e f1039b = C0725e.e("replaceWith");

    /* renamed from: c, reason: collision with root package name */
    public static final C0725e f1040c = C0725e.e("level");

    /* renamed from: d, reason: collision with root package name */
    public static final C0725e f1041d = C0725e.e("expression");

    /* renamed from: e, reason: collision with root package name */
    public static final C0725e f1042e = C0725e.e("imports");

    public static final l a(z6.h hVar, String str, String str2, String str3) {
        o6.j.e(hVar, "<this>");
        o6.j.e(str, "message");
        o6.j.e(str2, "replaceWith");
        l lVar = new l(hVar, z6.m.f16781o, x.P0(new Z5.j(f1041d, new k7.g(str2)), new Z5.j(f1042e, new k7.b(s.f7766d, new f(hVar, 0)))));
        C0723c c0723c = z6.m.f16779m;
        Z5.j jVar = new Z5.j(f1038a, new k7.g(str));
        Z5.j jVar2 = new Z5.j(f1039b, new k7.g(lVar));
        C0723c c0723c2 = z6.m.f16780n;
        o6.j.e(c0723c2, "topLevelFqName");
        return new l(hVar, c0723c, x.P0(jVar, jVar2, new Z5.j(f1040c, new k7.i(new C0722b(c0723c2.b(), c0723c2.f10797a.f()), C0725e.e(str3)))));
    }
}
