package q4;

import D4.C0040p;
import L7.AbstractC0166y;
import O7.InterfaceC0233f;
import android.content.Context;
import androidx.lifecycle.Z;
import j3.C0907B;
import k2.AbstractC0951a;
import n6.InterfaceC1163b;
import o4.C1254C;

/* loaded from: classes.dex */
public final class U extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final q1.e f14065b;

    /* renamed from: c, reason: collision with root package name */
    public final H3.n f14066c;

    /* renamed from: d, reason: collision with root package name */
    public final J2.b f14067d;

    /* renamed from: e, reason: collision with root package name */
    public final x2.f f14068e;

    /* renamed from: f, reason: collision with root package name */
    public final O7.P f14069f;

    /* renamed from: g, reason: collision with root package name */
    public final C1254C f14070g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0233f f14071h;

    /* renamed from: i, reason: collision with root package name */
    public final C4.e f14072i;
    public final C1378C j;
    public final M3.W k;

    /* renamed from: l, reason: collision with root package name */
    public final C1392Q f14073l;

    /* renamed from: m, reason: collision with root package name */
    public final C1376A f14074m;

    /* renamed from: n, reason: collision with root package name */
    public final C1392Q f14075n;

    /* renamed from: o, reason: collision with root package name */
    public final C1378C f14076o;

    /* renamed from: p, reason: collision with root package name */
    public final C1376A f14077p;

    /* renamed from: q, reason: collision with root package name */
    public final W5.a f14078q;

    /* renamed from: r, reason: collision with root package name */
    public final g0.L f14079r;

    public U(Context context, q1.e eVar, H3.n nVar, J2.b bVar, x2.f fVar) {
        o6.j.e(eVar, "bitmapRepository");
        o6.j.e(nVar, "editionRepository");
        o6.j.e(bVar, "monitoredViewsManager");
        o6.j.e(fVar, "settingsRepository");
        this.f14065b = eVar;
        this.f14066c = nVar;
        this.f14067d = bVar;
        this.f14068e = fVar;
        H3.y yVar = nVar.f1950e;
        P7.n nVar2 = yVar.f1986g;
        C1254C c1254c = new C1254C(nVar2, 6);
        this.f14069f = O7.V.t(new Y3.z(nVar2, 11), androidx.lifecycle.U.g(this), O7.Z.f4117a, Boolean.FALSE);
        this.f14070g = new C1254C(yVar.f1986g, 5);
        this.f14071h = O7.V.j(O7.V.k(nVar.f1953h));
        this.f14072i = new C4.e(new C0907B(new C0040p(c1254c, 18), 9), 12);
        this.j = new C1378C(c1254c, 1);
        this.k = new M3.W(yVar.f1987h, context, 6);
        this.f14073l = new C1392Q(yVar.j, this, 0);
        int i4 = 1;
        this.f14074m = new C1376A(c1254c, i4);
        this.f14075n = new C1392Q(yVar.f1989l, this, i4);
        int i8 = 2;
        this.f14076o = new C1378C(c1254c, i8);
        this.f14077p = new C1376A(c1254c, i8);
        this.f14078q = new W5.a(25, new C1376A(c1254c, 0));
        this.f14079r = new g0.L(15, new C1378C(c1254c, 0));
    }

    public final void e(InterfaceC1163b interfaceC1163b) {
        AbstractC0951a c6 = this.f14066c.f1950e.c();
        if (c6 != null) {
            AbstractC0166y.q(androidx.lifecycle.U.g(this), null, null, new C1394T(interfaceC1163b, c6, this, null), 3);
        }
    }
}
