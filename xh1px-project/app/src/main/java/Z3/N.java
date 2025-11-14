package Z3;

import O7.InterfaceC0233f;
import O7.P;
import O7.V;
import android.content.Context;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;

/* loaded from: classes.dex */
public final class N extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final H3.n f7351b;

    /* renamed from: c, reason: collision with root package name */
    public final P f7352c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0233f f7353d;

    /* renamed from: e, reason: collision with root package name */
    public final C4.e f7354e;

    /* renamed from: f, reason: collision with root package name */
    public final W0.c f7355f;

    /* renamed from: g, reason: collision with root package name */
    public final H f7356g;

    /* renamed from: h, reason: collision with root package name */
    public final R.g f7357h;

    /* renamed from: i, reason: collision with root package name */
    public final Y3.z f7358i;

    public N(Context context, H3.n nVar) {
        o6.j.e(nVar, "editionRepository");
        this.f7351b = nVar;
        H3.y yVar = nVar.f1950e;
        P7.n nVar2 = yVar.f1990m;
        W5.a aVar = new W5.a(6, new C4.e(nVar2, 21));
        this.f7352c = V.t(new Y3.z(nVar2, 1), U.g(this), O7.Z.f4117a, Boolean.FALSE);
        this.f7353d = V.j(V.k(nVar.j));
        this.f7354e = new C4.e(new H(aVar, 0), 12);
        this.f7355f = new W0.c(22, aVar);
        this.f7356g = new H(aVar, 1);
        this.f7357h = new R.g(aVar, this, context, 6);
        this.f7358i = new Y3.z(yVar.f1990m, 2);
    }
}
