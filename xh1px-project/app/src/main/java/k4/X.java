package k4;

import D4.C0040p;
import O7.InterfaceC0233f;
import android.content.Context;

/* loaded from: classes.dex */
public final class X extends androidx.lifecycle.Z {

    /* renamed from: b, reason: collision with root package name */
    public final q1.e f12064b;

    /* renamed from: c, reason: collision with root package name */
    public final H3.n f12065c;

    /* renamed from: d, reason: collision with root package name */
    public final J2.b f12066d;

    /* renamed from: e, reason: collision with root package name */
    public final O7.P f12067e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0233f f12068f;

    /* renamed from: g, reason: collision with root package name */
    public final C4.e f12069g;

    /* renamed from: h, reason: collision with root package name */
    public final P f12070h;

    /* renamed from: i, reason: collision with root package name */
    public final N f12071i;
    public final C0040p j;
    public final P k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0233f f12072l;

    /* renamed from: m, reason: collision with root package name */
    public final C4.e f12073m;

    public X(Context context, q1.e eVar, H3.n nVar, J2.b bVar) {
        o6.j.e(eVar, "bitmapRepository");
        o6.j.e(nVar, "editionRepository");
        o6.j.e(bVar, "monitoredViewsManager");
        this.f12064b = eVar;
        this.f12065c = nVar;
        this.f12066d = bVar;
        H3.y yVar = nVar.f1950e;
        P7.n nVar2 = yVar.f1988i;
        Y3.z zVar = new Y3.z(nVar2, 5);
        this.f12067e = O7.V.t(new C4.e(nVar2, 26), androidx.lifecycle.U.g(this), O7.Z.f4117a, Boolean.FALSE);
        this.f12068f = O7.V.j(O7.V.k(nVar.f1954i));
        this.f12069g = new C4.e(new N(zVar, 0), 12);
        this.f12070h = new P(zVar, 0);
        this.f12071i = new N(zVar, 1);
        this.j = new C0040p(new R.g(zVar, this, context, 13), 18);
        this.k = new P(zVar, 1);
        this.f12072l = O7.V.q(new R3.r(zVar, 22, this), S7.d.f5456f);
        this.f12073m = new C4.e(yVar.f1988i, 27);
    }
}
