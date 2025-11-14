package D4;

import L7.AbstractC0166y;
import O7.V;
import O7.i0;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import d6.InterfaceC0617c;

/* loaded from: classes.dex */
public final class s extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final v2.h f983b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f984c;

    /* renamed from: d, reason: collision with root package name */
    public final O7.P f985d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f986e;

    /* renamed from: f, reason: collision with root package name */
    public final A4.c f987f;

    public s(v2.h hVar) {
        o6.j.e(hVar, "detectionRepository");
        this.f983b = hVar;
        InterfaceC0617c interfaceC0617c = null;
        i0 c6 = V.c(null);
        this.f984c = c6;
        O7.P t8 = V.t(V.k(new C0040p(hVar.j, 0)), U.g(this), O7.Z.f4117a, Boolean.FALSE);
        this.f985d = t8;
        i0 c9 = V.c(a6.s.f7766d);
        this.f986e = c9;
        this.f987f = new A4.c(c6, V.u(new A4.c(c9, t8, new C0036l(3, null, 0), 27), new C0037m(this, interfaceC0617c, 0)), new C3.c(3, interfaceC0617c, 1), 27);
    }

    public final void e() {
        if (!((Boolean) this.f985d.f4088d.f()).booleanValue()) {
            return;
        }
        AbstractC0166y.q(U.g(this), null, null, new r(this, null), 3);
    }
}
