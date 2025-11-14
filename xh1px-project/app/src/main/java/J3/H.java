package J3;

import D4.C0040p;
import L7.AbstractC0166y;
import L7.k0;
import O7.C0232e;
import O7.C0235h;
import O7.InterfaceC0233f;
import O7.L;
import O7.P;
import O7.V;
import android.content.Context;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import f6.AbstractC0720j;
import kotlin.NoWhenBranchMatchedException;
import l0.C0997a;
import o4.C1254C;
import z3.EnumC1855a;

/* loaded from: classes.dex */
public final class H extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final v2.h f2413b;

    /* renamed from: c, reason: collision with root package name */
    public final H3.n f2414c;

    /* renamed from: d, reason: collision with root package name */
    public final L4.j f2415d;

    /* renamed from: e, reason: collision with root package name */
    public final A3.a f2416e;

    /* renamed from: f, reason: collision with root package name */
    public final J2.b f2417f;

    /* renamed from: g, reason: collision with root package name */
    public final C4.f f2418g;

    /* renamed from: h, reason: collision with root package name */
    public final P f2419h;

    /* renamed from: i, reason: collision with root package name */
    public k0 f2420i;
    public final C0235h j;
    public final P k;

    /* renamed from: l, reason: collision with root package name */
    public final P f2421l;

    /* renamed from: m, reason: collision with root package name */
    public final L f2422m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0233f f2423n;

    /* JADX WARN: Type inference failed for: r7v6, types: [f6.j, n6.e] */
    public H(v2.h hVar, H3.n nVar, L4.j jVar, A3.a aVar, J2.b bVar, C4.f fVar) {
        o6.j.e(hVar, "detectionRepository");
        o6.j.e(nVar, "editionRepository");
        o6.j.e(jVar, "tutorialRepository");
        o6.j.e(aVar, "revenueRepository");
        o6.j.e(bVar, "monitoredViewsManager");
        o6.j.e(fVar, "debugRepository");
        this.f2413b = hVar;
        this.f2414c = nVar;
        this.f2415d = jVar;
        this.f2416e = aVar;
        this.f2417f = bVar;
        this.f2418g = fVar;
        C4.e eVar = new C4.e(hVar.f15509i, 3);
        C0997a g8 = U.g(this);
        C0232e c0232e = O7.Z.f4117a;
        this.f2419h = V.t(eVar, g8, c0232e, null);
        this.j = aVar.f278d;
        C1254C c1254c = hVar.j;
        this.k = V.t(V.k(new C0040p(c1254c, 3)), U.g(this), c0232e, J.f2425a);
        P t8 = V.t(new C4.e(c1254c, 4), U.g(this), c0232e, Boolean.TRUE);
        this.f2421l = t8;
        this.f2422m = V.h(hVar.k, nVar.f1951f, t8, new AbstractC0720j(4, null));
        this.f2423n = V.k(new C0040p(c1254c, 4));
    }

    public final void e() {
        C0997a g8 = U.g(this);
        S7.e eVar = L7.F.f3175a;
        AbstractC0166y.q(g8, S7.d.f5456f, null, new v(this, null), 2);
    }

    public final void f(Context context) {
        P p8 = this.k;
        K k = (K) p8.f4088d.f();
        if (o6.j.a(k, I.f2424a)) {
            if (!(p8.f4088d.f() instanceof I)) {
                return;
            }
            this.f2413b.e();
        } else {
            if (o6.j.a(k, J.f2425a)) {
                A3.a aVar = this.f2416e;
                if (((EnumC1855a) aVar.f277c.f()) == EnumC1855a.f16626d) {
                    this.f2420i = V.s(new A4.c(aVar.f278d, aVar.f277c, new E(this, context, null), 27), U.g(this));
                    return;
                } else {
                    AbstractC0166y.q(U.g(this), null, null, new D(this, context, null), 3);
                    return;
                }
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
