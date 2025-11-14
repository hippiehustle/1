package P1;

import L7.AbstractC0160s;
import L7.AbstractC0166y;
import L7.EnumC0164w;
import O7.C0232e;
import O7.H;
import O7.InterfaceC0233f;
import O7.O;
import O7.U;
import O7.V;
import O7.Y;
import O7.Z;
import d6.InterfaceC0622h;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final N1.c f4471a;

    /* renamed from: b, reason: collision with root package name */
    public final Q7.d f4472b;

    /* renamed from: c, reason: collision with root package name */
    public final A.i f4473c;

    /* renamed from: d, reason: collision with root package name */
    public final O f4474d;

    public o(N1.c cVar, AbstractC0160s abstractC0160s) {
        EnumC0164w enumC0164w;
        o6.j.e(cVar, "qualityDataSource");
        this.f4471a = cVar;
        Q7.d b4 = AbstractC0166y.b(E2.d.C(AbstractC0166y.c(), abstractC0160s));
        this.f4472b = b4;
        A.i iVar = new A.i((InterfaceC0233f) cVar.f3714a.f5083f, 18, cVar);
        this.f4473c = iVar;
        Y i4 = V.i(new C4.e(iVar, 12), 0);
        U a3 = V.a(0, i4.f4113a, (N7.a) i4.f4115c);
        InterfaceC0622h interfaceC0622h = (InterfaceC0622h) i4.f4116d;
        InterfaceC0233f interfaceC0233f = (InterfaceC0233f) i4.f4114b;
        Q7.t tVar = V.f4104a;
        C0232e c0232e = Z.f4117a;
        if (c0232e.equals(c0232e)) {
            enumC0164w = EnumC0164w.f3248d;
        } else {
            enumC0164w = EnumC0164w.f3251g;
        }
        AbstractC0166y.p(b4, interfaceC0622h, enumC0164w, new H(c0232e, interfaceC0233f, a3, tVar, null));
        this.f4474d = new O(a3);
    }
}
