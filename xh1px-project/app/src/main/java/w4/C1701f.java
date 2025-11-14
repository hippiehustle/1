package w4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: w4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1701f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f15696h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1704i f15697i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1701f(C1704i c1704i, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15697i = c1704i;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1701f c1701f = (C1701f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1701f.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1701f c1701f = new C1701f(this.f15697i, interfaceC0617c);
        c1701f.f15696h = obj;
        return c1701f;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f15696h;
        Z5.a.d(obj);
        C1704i c1704i = this.f15697i;
        AbstractC0166y.q(interfaceC0163v, null, null, new C1699d(c1704i, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1700e(c1704i, null), 3);
        return y.f7506a;
    }
}
