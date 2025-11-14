package U1;

import y0.AbstractC1829a;

/* loaded from: classes.dex */
public final class l extends AbstractC1829a {

    /* renamed from: c, reason: collision with root package name */
    public static final l f6066c = new AbstractC1829a(4, 5);

    /* renamed from: d, reason: collision with root package name */
    public static final n1.g f6067d = new n1.g();

    /* renamed from: e, reason: collision with root package name */
    public static final n1.e f6068e = new n1.e(6, "threshold", null);

    @Override // y0.AbstractC1829a
    public final void b(E0.a aVar) {
        o6.j.e(aVar, "db");
        R.g p8 = h2.a.p(aVar, "condition_table");
        p8.g(new n1.h(2, "name", "Condition"));
        p8.g(new n1.e(2, "detection_type", "1"));
        n1.g gVar = f6067d;
        n1.e eVar = f6068e;
        n1.k N8 = p8.N(null, gVar, eVar);
        try {
            N8.a(new k(gVar, eVar, p8, 0));
            N8.close();
        } finally {
        }
    }
}
