package v4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: v4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1671f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f15526h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1674i f15527i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1671f(C1674i c1674i, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15527i = c1674i;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1671f c1671f = (C1671f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1671f.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1671f c1671f = new C1671f(this.f15527i, interfaceC0617c);
        c1671f.f15526h = obj;
        return c1671f;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f15526h;
        Z5.a.d(obj);
        C1674i c1674i = this.f15527i;
        AbstractC0166y.q(interfaceC0163v, null, null, new C1668c(c1674i, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1669d(c1674i, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1670e(c1674i, null), 3);
        return y.f7506a;
    }
}
