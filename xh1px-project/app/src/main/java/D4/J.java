package D4;

import L7.InterfaceC0163v;
import O7.i0;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import j2.C0902b;
import l2.C1001a;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class J extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ P f917h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1001a f918i;
    public final /* synthetic */ C0902b j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(P p8, C1001a c1001a, C0902b c0902b, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f917h = p8;
        this.f918i = c1001a;
        this.j = c0902b;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        J j = (J) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        j.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new J(this.f917h, this.f918i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        P p8 = this.f917h;
        i0 i0Var = p8.f931c;
        C1001a c1001a = this.f918i;
        C0902b c0902b = this.j;
        C0034j c0034j = new C0034j(c1001a, c0902b);
        i0Var.getClass();
        i0Var.h(null, c0034j);
        i0 i0Var2 = p8.f932d;
        Integer num = new Integer(c0902b.f11795g);
        i0Var2.getClass();
        i0Var2.h(null, num);
        return Z5.y.f7506a;
    }
}
