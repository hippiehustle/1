package h3;

import D4.C0036l;
import L7.AbstractC0166y;
import L7.F;
import O7.i0;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import l0.C0997a;
import l1.C0999a;
import n6.InterfaceC1162a;
import q2.C1365k;

/* renamed from: h3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0826n extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final g3.e f11358b;

    /* renamed from: c, reason: collision with root package name */
    public final C1365k f11359c;

    /* renamed from: d, reason: collision with root package name */
    public final L4.j f11360d;

    /* renamed from: e, reason: collision with root package name */
    public final A4.c f11361e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f11362f;

    public C0826n(g3.e eVar, C1365k c1365k, L4.j jVar) {
        o6.j.e(eVar, "dumbEditionRepository");
        o6.j.e(c1365k, "dumbEngine");
        o6.j.e(jVar, "tutorialRepository");
        this.f11358b = eVar;
        this.f11359c = c1365k;
        this.f11360d = jVar;
        this.f11361e = new A4.c(eVar.f11152e, c1365k.f13970i, new C0036l(3, null, 4), 27);
        this.f11362f = c1365k.k;
    }

    public final void e(C0999a c0999a, InterfaceC1162a interfaceC1162a) {
        o6.j.e(c0999a, "dumbScenarioId");
        C0997a g8 = U.g(this);
        S7.e eVar = F.f3175a;
        AbstractC0166y.q(g8, S7.d.f5456f, null, new C0823k(this, c0999a, interfaceC1162a, null), 2);
    }
}
