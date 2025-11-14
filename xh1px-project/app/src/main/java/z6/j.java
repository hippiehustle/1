package z6;

import a6.AbstractC0434i;
import f7.C0725e;
import java.util.Set;

/* loaded from: classes.dex */
public enum j {
    f16722i("Boolean"),
    j("Char"),
    k("Byte"),
    f16723l("Short"),
    f16724m("Int"),
    f16725n("Float"),
    f16726o("Long"),
    f16727p("Double");


    /* renamed from: d, reason: collision with root package name */
    public final C0725e f16729d;

    /* renamed from: e, reason: collision with root package name */
    public final C0725e f16730e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16731f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f16732g;

    /* renamed from: h, reason: collision with root package name */
    public static final Set f16721h = AbstractC0434i.l1(new j[]{j, k, f16723l, f16724m, f16725n, f16726o, f16727p});

    j(String str) {
        this.f16729d = C0725e.e(str);
        this.f16730e = C0725e.e(str.concat("Array"));
        i iVar = new i(this, 0);
        Z5.h hVar = Z5.h.f7482d;
        this.f16731f = Z5.a.c(hVar, iVar);
        this.f16732g = Z5.a.c(hVar, new i(this, 1));
    }
}
