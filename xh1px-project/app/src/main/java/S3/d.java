package S3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class d extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5334h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f5335i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f5335i = gVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        d dVar = (d) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        dVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        d dVar = new d(this.f5335i, interfaceC0617c);
        dVar.f5334h = obj;
        return dVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f5334h;
        Z5.a.d(obj);
        AbstractC0166y.q(interfaceC0163v, null, null, new c(this.f5335i, null), 3);
        return y.f7506a;
    }
}
