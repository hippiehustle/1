package U1;

import n1.C1150b;
import y0.AbstractC1829a;

/* loaded from: classes.dex */
public final class m extends AbstractC1829a {

    /* renamed from: c, reason: collision with root package name */
    public static final m f6069c = new AbstractC1829a(5, 6);

    /* renamed from: d, reason: collision with root package name */
    public static final C1150b f6070d = new C1150b("shouldBeDetected", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final n1.g f6071e = new n1.g();

    /* renamed from: f, reason: collision with root package name */
    public static final n1.h f6072f = new n1.h(6, "type", null);

    /* renamed from: g, reason: collision with root package name */
    public static final n1.e f6073g = new n1.e(4, "clickOnCondition", null);

    @Override // y0.AbstractC1829a
    public final void b(E0.a aVar) {
        o6.j.e(aVar, "db");
        h2.a.p(aVar, "condition_table").g(f6070d);
        R.g p8 = h2.a.p(aVar, "action_table");
        p8.g(f6073g);
        n1.g gVar = f6071e;
        n1.h hVar = f6072f;
        n1.k N8 = p8.N(null, gVar, hVar);
        try {
            N8.a(new k(gVar, hVar, p8, 1));
            N8.close();
        } finally {
        }
    }
}
