package D4;

import L7.AbstractC0166y;
import O7.V;
import O7.i0;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import d6.InterfaceC0617c;

/* loaded from: classes.dex */
public final class P extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final v2.h f930b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f931c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f932d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f933e;

    /* renamed from: f, reason: collision with root package name */
    public final O7.P f934f;

    /* renamed from: g, reason: collision with root package name */
    public final A4.c f935g;

    /* renamed from: h, reason: collision with root package name */
    public final C1.f f936h;

    public P(v2.h hVar) {
        o6.j.e(hVar, "detectionRepository");
        this.f930b = hVar;
        InterfaceC0617c interfaceC0617c = null;
        i0 c6 = V.c(null);
        this.f931c = c6;
        i0 c9 = V.c(0);
        this.f932d = c9;
        i0 c10 = V.c(null);
        this.f933e = c10;
        O7.P t8 = V.t(V.k(new C4.e(hVar.j, 1)), U.g(this), O7.Z.f4117a, Boolean.FALSE);
        this.f934f = t8;
        this.f935g = new A4.c(c6, V.u(new C0040p(V.h(c10, c9, t8, new I(this, null)), 18), new C0037m(this, interfaceC0617c, 1)), new C3.c(3, interfaceC0617c, 2), 27);
        this.f936h = new C1.f(c9, 1);
    }

    public final void e() {
        if (!((Boolean) this.f934f.f4088d.f()).booleanValue()) {
            return;
        }
        AbstractC0166y.q(U.g(this), null, null, new O(this, null), 3);
    }
}
