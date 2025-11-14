package Q4;

import D4.C0036l;
import D4.C0040p;
import O7.InterfaceC0233f;
import O7.V;
import O7.i0;
import androidx.lifecycle.Z;
import d6.InterfaceC0617c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ4/t;", "Landroidx/lifecycle/Z;", "tutorial_fDroidRelease"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, Z.g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final L4.j f4897b;

    /* renamed from: c, reason: collision with root package name */
    public final C4.e f4898c;

    /* renamed from: d, reason: collision with root package name */
    public final C0040p f4899d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0233f f4900e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0233f f4901f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0233f f4902g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0233f f4903h;

    /* renamed from: i, reason: collision with root package name */
    public final A4.c f4904i;

    public t(L4.j jVar) {
        o6.j.e(jVar, "tutorialRepository");
        this.f4897b = jVar;
        C4.e eVar = jVar.f2929n;
        this.f4898c = eVar;
        this.f4899d = new C0040p(jVar.f2928m, 19);
        int i4 = 3;
        InterfaceC0617c interfaceC0617c = null;
        InterfaceC0233f k = V.k(V.u(eVar, new C3.d(i4, interfaceC0617c, 17)));
        this.f4900e = k;
        this.f4901f = V.k(V.u(eVar, new C3.d(i4, interfaceC0617c, 18)));
        this.f4902g = V.k(V.u(eVar, new C3.d(i4, interfaceC0617c, 19)));
        this.f4903h = V.k(V.u(eVar, new C3.d(i4, interfaceC0617c, 20)));
        this.f4904i = new A4.c(eVar, k, new C0036l(3, null, 1), 27);
    }

    public final void e(N4.d dVar) {
        L4.j jVar = this.f4897b;
        jVar.getClass();
        F4.j jVar2 = jVar.f2922e;
        jVar2.getClass();
        dVar.toString();
        F4.h hVar = (F4.h) jVar2.f1391d.f();
        if (hVar != null) {
            H4.c cVar = hVar.f1385b.f1741b;
            if (((Boolean) cVar.f2008b.f()).booleanValue()) {
                cVar.c(dVar);
                return;
            }
            i0 i0Var = cVar.f2013g;
            i0Var.getClass();
            i0Var.h(null, a6.t.f7767d);
        }
    }
}
