package w3;

import Z5.y;
import a0.C0407b;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: w3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1694c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f15682h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1692a f15683i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1694c(C1692a c1692a, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15683i = c1692a;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1694c c1694c = (C1694c) p((InterfaceC0617c) obj2, (C0407b) obj);
        y yVar = y.f7506a;
        c1694c.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1694c c1694c = new C1694c(this.f15683i, interfaceC0617c);
        c1694c.f15682h = obj;
        return c1694c;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        C0407b c0407b = (C0407b) this.f15682h;
        Z5.a.d(obj);
        C1692a c1692a = this.f15683i;
        c0407b.d(C1695d.f15684b, new Long(c1692a.f15677a));
        c0407b.d(C1695d.f15685c, Boolean.valueOf(c1692a.f15678b));
        return y.f7506a;
    }
}
