package F4;

import L7.AbstractC0160s;
import L7.AbstractC0166y;
import L7.EnumC0164w;
import O7.H;
import O7.InterfaceC0233f;
import O7.L;
import O7.O;
import O7.U;
import O7.V;
import O7.Y;
import O7.Z;
import O7.f0;
import O7.i0;
import a.AbstractC0405a;
import a6.AbstractC0437l;
import d6.InterfaceC0622h;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final C1.g f1388a;

    /* renamed from: b, reason: collision with root package name */
    public final J2.b f1389b;

    /* renamed from: c, reason: collision with root package name */
    public final Q7.d f1390c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f1391d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f1392e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f1393f;

    /* renamed from: g, reason: collision with root package name */
    public final O f1394g;

    public j(C1.g gVar, J2.b bVar, AbstractC0160s abstractC0160s) {
        EnumC0164w enumC0164w;
        o6.j.e(gVar, "overlayManager");
        o6.j.e(bVar, "monitoredViewsManager");
        this.f1388a = gVar;
        this.f1389b = bVar;
        Q7.d b4 = AbstractC0166y.b(E2.d.C(AbstractC0166y.c(), abstractC0160s));
        this.f1390c = b4;
        i0 c6 = V.c(null);
        this.f1391d = c6;
        this.f1392e = c6;
        i0 c9 = V.c(null);
        this.f1393f = c9;
        L h8 = V.h(c6, c9, gVar.k, new D3.b(this, null, 1));
        f0 f0Var = new f0(3000L);
        Y i4 = V.i(h8, 1);
        U a3 = V.a(1, i4.f4113a, (N7.a) i4.f4115c);
        InterfaceC0622h interfaceC0622h = (InterfaceC0622h) i4.f4116d;
        InterfaceC0233f interfaceC0233f = (InterfaceC0233f) i4.f4114b;
        Q7.t tVar = V.f4104a;
        if (f0Var.equals(Z.f4117a)) {
            enumC0164w = EnumC0164w.f3248d;
        } else {
            enumC0164w = EnumC0164w.f3251g;
        }
        AbstractC0166y.p(b4, interfaceC0622h, enumC0164w, new H(f0Var, interfaceC0233f, a3, tVar, null));
        this.f1394g = new O(a3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i4) {
        v vVar;
        h hVar = (h) this.f1391d.f();
        if (hVar != null) {
            List list = hVar.f1386c;
            if (i4 >= 0 && i4 <= AbstractC0437l.W(list)) {
                vVar = (v) list.get(i4);
                i0 i0Var = this.f1393f;
                if (vVar != null) {
                    i0Var.g(null);
                    return;
                }
                w1.e eVar = (w1.e) this.f1388a.f575d.h();
                AbstractC0405a a3 = vVar.a();
                if ((vVar instanceof u) && (a3 instanceof f)) {
                    ((f) a3).getClass();
                    B0.e eVar2 = new B0.e(2, this);
                    J2.b bVar = this.f1389b;
                    bVar.getClass();
                    bVar.f2387c.put(J2.a.k, new A1.n(bVar, eVar2));
                }
                x xVar = new x(i4, false, null, eVar);
                i0Var.getClass();
                i0Var.h(null, xVar);
                return;
            }
        }
        vVar = null;
        i0 i0Var2 = this.f1393f;
        if (vVar != null) {
        }
    }
}
