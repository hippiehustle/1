package l3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: l3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1010i extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f12213h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1013l f12214i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1010i(C1013l c1013l, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12214i = c1013l;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1010i c1010i = (C1010i) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1010i.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1010i c1010i = new C1010i(this.f12214i, interfaceC0617c);
        c1010i.f12213h = obj;
        return c1010i;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f12213h;
        Z5.a.d(obj);
        C1013l c1013l = this.f12214i;
        AbstractC0166y.q(interfaceC0163v, null, null, new C1004c(c1013l, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1005d(c1013l, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1006e(c1013l, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1007f(c1013l, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1008g(c1013l, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1009h(c1013l, null), 3);
        return y.f7506a;
    }
}
