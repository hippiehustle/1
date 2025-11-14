package X3;

import D4.C0040p;
import O7.InterfaceC0233f;
import O7.P;
import O7.V;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;

/* loaded from: classes.dex */
public final class C extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final H3.n f6871b;

    /* renamed from: c, reason: collision with root package name */
    public final P f6872c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedPreferences f6873d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0233f f6874e;

    /* renamed from: f, reason: collision with root package name */
    public final C4.e f6875f;

    /* renamed from: g, reason: collision with root package name */
    public final w f6876g;

    /* renamed from: h, reason: collision with root package name */
    public final C4.e f6877h;

    /* renamed from: i, reason: collision with root package name */
    public final w f6878i;
    public final u j;
    public final C0040p k;

    public C(Context context, H3.n nVar) {
        o6.j.e(nVar, "editionRepository");
        this.f6871b = nVar;
        H3.y yVar = nVar.f1950e;
        P7.n nVar2 = yVar.f1990m;
        W5.a aVar = new W5.a(2, new C4.e(nVar2, 18));
        this.f6872c = V.t(new C0040p(nVar2, 28), U.g(this), O7.Z.f4117a, Boolean.FALSE);
        this.f6873d = h2.a.j(context);
        this.f6874e = V.j(V.k(nVar.j));
        this.f6875f = new C4.e(new u(aVar, 0), 12);
        this.f6876g = new w(aVar, 0);
        this.f6877h = new C4.e(new u(aVar, 1), 12);
        this.f6878i = new w(aVar, 1);
        this.j = new u(aVar, 2);
        this.k = new C0040p(yVar.f1990m, 29);
    }
}
