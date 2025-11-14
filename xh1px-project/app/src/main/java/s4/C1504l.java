package s4;

import D4.C0036l;
import D4.C0040p;
import H3.n;
import H3.q;
import H3.y;
import O7.InterfaceC0233f;
import O7.L;
import O7.P;
import O7.V;
import Y3.z;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;

/* renamed from: s4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1504l extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final J2.b f14548b;

    /* renamed from: c, reason: collision with root package name */
    public final P f14549c;

    /* renamed from: d, reason: collision with root package name */
    public final L f14550d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0233f f14551e;

    /* renamed from: f, reason: collision with root package name */
    public final A4.c f14552f;

    public C1504l(n nVar, J2.b bVar) {
        o6.j.e(nVar, "editionRepository");
        o6.j.e(bVar, "monitoredViewsManager");
        this.f14548b = bVar;
        y yVar = nVar.f1950e;
        this.f14549c = V.t(new z(yVar.f1981b, 15), U.g(this), O7.Z.f4117a, Boolean.FALSE);
        this.f14550d = V.h(new C0040p(yVar.f1982c, 18), new C0040p(yVar.f1983d, 18), new C0040p(yVar.f1984e, 18), new q(4, null, 1));
        C4.e eVar = nVar.f1952g;
        this.f14551e = V.j(V.k(eVar));
        this.f14552f = new A4.c(yVar.f1981b, eVar, new C0036l(3, null, 5), 27);
    }
}
