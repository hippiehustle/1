package U3;

import D4.C0037m;
import D4.C0040p;
import O7.InterfaceC0233f;
import O7.P;
import O7.V;
import O7.i0;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import d6.InterfaceC0617c;

/* loaded from: classes.dex */
public final class A extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final H3.n f6085b;

    /* renamed from: c, reason: collision with root package name */
    public final W0.c f6086c;

    /* renamed from: d, reason: collision with root package name */
    public final P f6087d;

    /* renamed from: e, reason: collision with root package name */
    public final SharedPreferences f6088e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0233f f6089f;

    /* renamed from: g, reason: collision with root package name */
    public final C4.e f6090g;

    /* renamed from: h, reason: collision with root package name */
    public final W0.d f6091h;

    /* renamed from: i, reason: collision with root package name */
    public final i0 f6092i;
    public final i0 j;
    public final P7.n k;

    /* renamed from: l, reason: collision with root package name */
    public final v f6093l;

    /* renamed from: m, reason: collision with root package name */
    public final C4.e f6094m;

    public A(Context context, H3.n nVar) {
        Object obj;
        o6.j.e(nVar, "editionRepository");
        this.f6085b = nVar;
        H3.y yVar = nVar.f1950e;
        P7.n nVar2 = yVar.f1990m;
        W0.c cVar = new W0.c(17, new C0040p(nVar2, 24));
        this.f6086c = cVar;
        this.f6087d = V.t(new C4.e(nVar2, 15), U.g(this), O7.Z.f4117a, Boolean.FALSE);
        this.f6088e = h2.a.j(context);
        this.f6089f = V.j(V.k(nVar.j));
        this.f6090g = new C4.e(new v(cVar, 0), 12);
        this.f6091h = new W0.d(27, cVar);
        f2.i iVar = (f2.i) yVar.a();
        if (iVar != null) {
            obj = E2.c.T(iVar.f10723e);
        } else {
            obj = D2.h.f878c;
        }
        i0 c6 = V.c(obj);
        this.f6092i = c6;
        this.j = c6;
        this.k = V.u(c6, new C0037m((InterfaceC0617c) null, this, 5));
        this.f6093l = new v(cVar, 1);
        this.f6094m = new C4.e(yVar.f1990m, 16);
    }
}
