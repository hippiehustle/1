package n4;

import O7.InterfaceC0233f;
import O7.P;
import O7.V;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import g0.L;
import j2.C0903c;

/* loaded from: classes.dex */
public final class z extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final H3.n f12987b;

    /* renamed from: c, reason: collision with root package name */
    public final P f12988c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0233f f12989d;

    /* renamed from: e, reason: collision with root package name */
    public final C4.e f12990e;

    /* renamed from: f, reason: collision with root package name */
    public final u f12991f;

    /* renamed from: g, reason: collision with root package name */
    public final C4.e f12992g;

    /* renamed from: h, reason: collision with root package name */
    public final u f12993h;

    /* renamed from: i, reason: collision with root package name */
    public final Y3.z f12994i;

    public z(H3.n nVar) {
        o6.j.e(nVar, "editionRepository");
        this.f12987b = nVar;
        H3.y yVar = nVar.f1950e;
        P7.n nVar2 = yVar.k;
        L l6 = new L(7, new C4.e(nVar2, 29));
        this.f12988c = V.t(new C4.e(nVar2, 28), U.g(this), O7.Z.f4117a, Boolean.FALSE);
        this.f12989d = V.j(V.k(nVar.f1954i));
        this.f12990e = new C4.e(new s(l6, 0), 12);
        this.f12991f = new u(l6, 0);
        this.f12992g = new C4.e(new s(l6, 1), 12);
        this.f12993h = new u(l6, 1);
        this.f12994i = new Y3.z(yVar.k, 6);
    }

    public final void e(String str) {
        H3.n nVar = this.f12987b;
        C0903c c0903c = (C0903c) nVar.f1950e.b();
        if (c0903c != null) {
            if (str == null) {
                str = "";
            }
            nVar.k(C0903c.i(c0903c, null, null, str, 7));
        }
    }
}
