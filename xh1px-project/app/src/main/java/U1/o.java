package U1;

import T1.EnumC0305d;
import y0.AbstractC1829a;

/* loaded from: classes.dex */
public final class o extends AbstractC1829a {

    /* renamed from: c, reason: collision with root package name */
    public static final o f6077c = new AbstractC1829a(9, 10);

    /* renamed from: d, reason: collision with root package name */
    public static final n1.g f6078d = new n1.g();

    /* renamed from: e, reason: collision with root package name */
    public static final n1.h f6079e = new n1.h(6, "type", null);

    /* renamed from: f, reason: collision with root package name */
    public static final n1.f f6080f = new n1.f("pressDuration", 6);

    /* renamed from: g, reason: collision with root package name */
    public static final n1.f f6081g = new n1.f("swipeDuration", 6);

    @Override // y0.AbstractC1829a
    public final void b(E0.a aVar) {
        o6.j.e(aVar, "db");
        R.g p8 = h2.a.p(aVar, "action_table");
        F0.a aVar2 = new F0.a(1, p8);
        String str = "WHERE `type` = \"" + EnumC0305d.f5582d + "\" OR `type` = \"" + EnumC0305d.f5583e + "\"";
        n1.g gVar = f6078d;
        n1.h hVar = f6079e;
        n1.f fVar = f6080f;
        n1.f fVar2 = f6081g;
        n1.k N8 = p8.N(str, gVar, hVar, fVar, fVar2);
        try {
            N8.a(new b(aVar2, gVar, hVar, fVar, fVar2));
            N8.close();
        } finally {
        }
    }
}
