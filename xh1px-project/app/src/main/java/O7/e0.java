package O7;

import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class e0 extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4136h;

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((e0) p((InterfaceC0617c) obj2, (X) obj)).v(Z5.y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f6.j, O7.e0, d6.c] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        ?? abstractC0720j = new AbstractC0720j(2, interfaceC0617c);
        abstractC0720j.f4136h = obj;
        return abstractC0720j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        boolean z8;
        Z5.a.d(obj);
        if (((X) this.f4136h) != X.f4109d) {
            z8 = true;
        } else {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }
}
