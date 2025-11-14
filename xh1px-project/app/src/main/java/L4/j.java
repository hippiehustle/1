package L4;

import D4.C0040p;
import F4.s;
import F4.u;
import F4.v;
import F4.x;
import L7.AbstractC0160s;
import L7.AbstractC0166y;
import L7.k0;
import O7.V;
import O7.f0;
import O7.i0;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import b2.r;
import l1.C0999a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final r f2918a;

    /* renamed from: b, reason: collision with root package name */
    public final v2.h f2919b;

    /* renamed from: c, reason: collision with root package name */
    public final F4.i f2920c;

    /* renamed from: d, reason: collision with root package name */
    public final s f2921d;

    /* renamed from: e, reason: collision with root package name */
    public final F4.j f2922e;

    /* renamed from: f, reason: collision with root package name */
    public final Q7.d f2923f;

    /* renamed from: g, reason: collision with root package name */
    public final SharedPreferences f2924g;

    /* renamed from: h, reason: collision with root package name */
    public C0999a f2925h;

    /* renamed from: i, reason: collision with root package name */
    public C0999a f2926i;
    public k0 j;
    public final i0 k;

    /* renamed from: l, reason: collision with root package name */
    public final A.i f2927l;

    /* renamed from: m, reason: collision with root package name */
    public final C0040p f2928m;

    /* renamed from: n, reason: collision with root package name */
    public final C4.e f2929n;

    public j(Context context, r rVar, v2.h hVar, F4.i iVar, s sVar, F4.j jVar, AbstractC0160s abstractC0160s) {
        o6.j.e(rVar, "scenarioRepository");
        o6.j.e(hVar, "detectionRepository");
        o6.j.e(iVar, "dataSource");
        o6.j.e(sVar, "stateDataSource");
        o6.j.e(jVar, "tutorialEngine");
        this.f2918a = rVar;
        this.f2919b = hVar;
        this.f2920c = iVar;
        this.f2921d = sVar;
        this.f2922e = jVar;
        Q7.d b4 = AbstractC0166y.b(E2.d.C(AbstractC0166y.c(), abstractC0160s));
        this.f2923f = b4;
        SharedPreferences sharedPreferences = context.getSharedPreferences("TutorialPreferences", 0);
        o6.j.d(sharedPreferences, "getSharedPreferences(...)");
        this.f2924g = sharedPreferences;
        this.k = V.c(null);
        this.f2927l = new A.i(sVar.f1427d, 13, this);
        this.f2928m = new C0040p(jVar.f1394g, 7);
        C4.e eVar = new C4.e(jVar.f1392e, 7);
        this.f2929n = eVar;
        int i4 = 26;
        V.s(new A.i(V.t(new H3.g(V.u(eVar, new C3.d(3, null, 16)), 2), b4, new f0(3000L), Boolean.FALSE), i4, new a(this, null)), b4);
    }

    public final void a() {
        x xVar;
        View view;
        F4.j jVar = this.f2922e;
        i0 i0Var = jVar.f1393f;
        x xVar2 = (x) i0Var.f();
        v vVar = null;
        if (xVar2 != null) {
            int i4 = xVar2.f1434a;
            F4.h hVar = (F4.h) jVar.f1391d.f();
            if (hVar != null) {
                vVar = (v) hVar.f1386c.get(i4);
            }
        }
        if (vVar != null && (xVar = (x) i0Var.f()) != null) {
            jVar.a(xVar.f1434a + 1);
            if (vVar instanceof u) {
                E2.d dVar = ((u) vVar).f1431d;
                if (dVar instanceof F4.a) {
                    J2.b bVar = jVar.f1389b;
                    J2.a aVar = ((F4.a) dVar).f1378e;
                    bVar.getClass();
                    o6.j.e(aVar, "type");
                    J2.d dVar2 = (J2.d) bVar.f2386b.get(aVar);
                    if (dVar2 != null && (view = dVar2.f2391c) != null) {
                        view.performClick();
                    }
                }
            }
        }
    }

    public final void b() {
        Integer num;
        if (this.f2922e.f1391d.f() != null && (num = (Integer) this.k.f()) != null) {
            this.j = AbstractC0166y.q(this.f2923f, null, null, new h(num.intValue(), this, null), 3);
        }
    }
}
