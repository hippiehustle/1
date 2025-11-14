package M3;

import D4.C0040p;
import O7.i0;
import android.graphics.Point;
import d6.InterfaceC0617c;

/* loaded from: classes.dex */
public final class H extends androidx.lifecycle.Z {

    /* renamed from: b, reason: collision with root package name */
    public final q1.e f3355b;

    /* renamed from: c, reason: collision with root package name */
    public final H3.n f3356c;

    /* renamed from: d, reason: collision with root package name */
    public final Y1.d f3357d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f3358e;

    /* renamed from: f, reason: collision with root package name */
    public final A4.c f3359f;

    /* renamed from: g, reason: collision with root package name */
    public final A.i f3360g;

    public H(q1.e eVar, H3.n nVar, Y1.d dVar) {
        o6.j.e(eVar, "bitmapRepository");
        o6.j.e(nVar, "editionRepository");
        o6.j.e(dVar, "displayConfigManager");
        this.f3355b = eVar;
        this.f3356c = nVar;
        this.f3357d = dVar;
        H3.y yVar = nVar.f1950e;
        W0.d dVar2 = new W0.d(13, new C0040p(yVar.f1986g, 9));
        C4.e eVar2 = new C4.e(yVar.f1987h, 8);
        W0.c cVar = new W0.c(10, new C0040p(yVar.f1990m, 10));
        InterfaceC0617c interfaceC0617c = null;
        O7.L h8 = O7.V.h(dVar2, eVar2, cVar, new D3.b(this, interfaceC0617c, 2));
        C4.e eVar3 = new C4.e(new W0.d(14, cVar), 12);
        i0 c6 = O7.V.c(null);
        this.f3358e = c6;
        this.f3359f = new A4.c(eVar3, c6, new C3.c(3, interfaceC0617c, 4), 27);
        this.f3360g = new A.i(h8, 16, this);
    }

    public final Point e() {
        Point point;
        Point point2;
        C0191y c0191y = (C0191y) this.f3358e.f();
        if (c0191y != null && (point2 = c0191y.f3476a) != null) {
            return point2;
        }
        f2.e eVar = (f2.e) this.f3356c.f1950e.a();
        if (eVar != null) {
            point = eVar.f10698i;
        } else {
            point = null;
        }
        if (point == null) {
            return new Point(0, 0);
        }
        return point;
    }
}
