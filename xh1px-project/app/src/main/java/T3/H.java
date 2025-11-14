package T3;

import D4.C0040p;
import O7.InterfaceC0233f;
import O7.P;
import O7.V;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;

/* loaded from: classes.dex */
public final class H extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final H3.n f5700b;

    /* renamed from: c, reason: collision with root package name */
    public final P f5701c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0233f f5702d;

    /* renamed from: e, reason: collision with root package name */
    public final C4.e f5703e;

    /* renamed from: f, reason: collision with root package name */
    public final C f5704f;

    /* renamed from: g, reason: collision with root package name */
    public final A f5705g;

    /* renamed from: h, reason: collision with root package name */
    public final C f5706h;

    /* renamed from: i, reason: collision with root package name */
    public final C4.e f5707i;

    public H(H3.n nVar) {
        o6.j.e(nVar, "editionRepository");
        this.f5700b = nVar;
        H3.y yVar = nVar.f1950e;
        P7.n nVar2 = yVar.f1990m;
        W0.d dVar = new W0.d(25, new C0040p(nVar2, 23));
        this.f5701c = V.t(new C0040p(nVar2, 22), U.g(this), O7.Z.f4117a, Boolean.FALSE);
        this.f5702d = V.j(V.k(nVar.j));
        this.f5703e = new C4.e(new A(dVar, 0), 12);
        this.f5704f = new C(dVar, 0);
        int i4 = 1;
        this.f5705g = new A(dVar, i4);
        this.f5706h = new C(dVar, i4);
        this.f5707i = new C4.e(yVar.f1990m, 14);
    }

    public final void e(String str) {
        o6.j.e(str, "counterName");
        H3.n nVar = this.f5700b;
        f2.h hVar = (f2.h) nVar.f1950e.a();
        if (hVar != null) {
            nVar.j(f2.h.i(hVar, null, null, null, 0, null, null, str, 0, 191));
        }
    }
}
