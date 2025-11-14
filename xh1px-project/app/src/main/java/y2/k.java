package y2;

import Z5.y;
import a0.C0407b;
import a0.C0409d;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class k extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f16482h;

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        k kVar = (k) p((InterfaceC0617c) obj2, (C0407b) obj);
        y yVar = y.f7506a;
        kVar.v(yVar);
        return yVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y2.k, f6.j, d6.c] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        ?? abstractC0720j = new AbstractC0720j(2, interfaceC0617c);
        abstractC0720j.f16482h = obj;
        return abstractC0720j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        boolean z8;
        C0407b c0407b = (C0407b) this.f16482h;
        Z5.a.d(obj);
        C0409d c0409d = p.f16487b;
        Boolean bool = (Boolean) c0407b.c(c0409d);
        if (bool != null) {
            z8 = bool.booleanValue();
        } else {
            z8 = true;
        }
        c0407b.d(c0409d, Boolean.valueOf(!z8));
        return y.f7506a;
    }
}
