package O7;

import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class F extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ int f4068h;

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((F) p((InterfaceC0617c) obj2, Integer.valueOf(((Number) obj).intValue()))).v(Z5.y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f6.j, O7.F, d6.c] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        ?? abstractC0720j = new AbstractC0720j(2, interfaceC0617c);
        abstractC0720j.f4068h = ((Number) obj).intValue();
        return abstractC0720j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        boolean z8;
        Z5.a.d(obj);
        if (this.f4068h > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }
}
