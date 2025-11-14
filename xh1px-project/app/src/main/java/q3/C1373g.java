package q3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: q3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1373g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f13988h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f13989i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1373g(j jVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13989i = jVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1373g c1373g = (C1373g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1373g.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1373g c1373g = new C1373g(this.f13989i, interfaceC0617c);
        c1373g.f13988h = obj;
        return c1373g;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f13988h;
        Z5.a.d(obj);
        j jVar = this.f13989i;
        AbstractC0166y.q(interfaceC0163v, null, null, new C1371e(jVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1372f(jVar, null), 3);
        return y.f7506a;
    }
}
