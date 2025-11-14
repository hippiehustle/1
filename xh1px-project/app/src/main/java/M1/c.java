package M1;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3305h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f3306i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f3306i = hVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        c cVar = (c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        cVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        c cVar = new c(this.f3306i, interfaceC0617c);
        cVar.f3305h = obj;
        return cVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f3305h;
        Z5.a.d(obj);
        AbstractC0166y.q(interfaceC0163v, null, null, new b(this.f3306i, null), 3);
        return y.f7506a;
    }
}
