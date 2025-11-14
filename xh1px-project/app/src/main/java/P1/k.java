package P1;

import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class k extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4465h;

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((k) p((InterfaceC0617c) obj2, (N1.d) obj)).v(y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f6.j, d6.c, P1.k] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        ?? abstractC0720j = new AbstractC0720j(2, interfaceC0617c);
        abstractC0720j.f4465h = obj;
        return abstractC0720j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        N1.d dVar = (N1.d) this.f4465h;
        Z5.a.d(obj);
        return N1.d.a(dVar, 0L, System.currentTimeMillis(), 0, 0, 13);
    }
}
