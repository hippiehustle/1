package K3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class I extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2658h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f2659i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(L l6, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2659i = l6;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        I i4 = (I) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        i4.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        I i4 = new I(this.f2659i, interfaceC0617c);
        i4.f2658h = obj;
        return i4;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f2658h;
        Z5.a.d(obj);
        L l6 = this.f2659i;
        AbstractC0166y.q(interfaceC0163v, null, null, new G(l6, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new H(l6, null), 3);
        return Z5.y.f7506a;
    }
}
