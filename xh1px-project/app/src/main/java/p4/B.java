package p4;

import D4.C0037m;
import O7.InterfaceC0233f;
import O7.P;
import O7.V;
import O7.i0;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import d6.InterfaceC0617c;
import g0.L;
import o4.C1254C;

/* loaded from: classes.dex */
public final class B extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final H3.n f13730b;

    /* renamed from: c, reason: collision with root package name */
    public final L f13731c;

    /* renamed from: d, reason: collision with root package name */
    public final P f13732d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0233f f13733e;

    /* renamed from: f, reason: collision with root package name */
    public final C4.e f13734f;

    /* renamed from: g, reason: collision with root package name */
    public final w f13735g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f13736h;

    /* renamed from: i, reason: collision with root package name */
    public final i0 f13737i;
    public final P7.n j;
    public final u k;

    /* renamed from: l, reason: collision with root package name */
    public final w f13738l;

    /* renamed from: m, reason: collision with root package name */
    public final Y3.z f13739m;

    public B(H3.n nVar) {
        Object obj;
        o6.j.e(nVar, "editionRepository");
        this.f13730b = nVar;
        H3.y yVar = nVar.f1950e;
        P7.n nVar2 = yVar.k;
        L l6 = new L(14, new C1254C(nVar2, 3));
        this.f13731c = l6;
        this.f13732d = V.t(new C1254C(nVar2, 2), U.g(this), O7.Z.f4117a, Boolean.FALSE);
        this.f13733e = V.j(V.k(nVar.f1954i));
        this.f13734f = new C4.e(new u(l6, 0), 12);
        this.f13735g = new w(l6, 0);
        j2.f fVar = (j2.f) yVar.b();
        if (fVar != null) {
            obj = E2.c.T(Long.valueOf(fVar.f11817d));
        } else {
            obj = D2.h.f878c;
        }
        i0 c6 = V.c(obj);
        this.f13736h = c6;
        this.f13737i = c6;
        this.j = V.u(c6, new C0037m((InterfaceC0617c) null, this, 9));
        int i4 = 1;
        this.k = new u(l6, i4);
        this.f13738l = new w(l6, i4);
        this.f13739m = new Y3.z(yVar.k, 10);
    }
}
