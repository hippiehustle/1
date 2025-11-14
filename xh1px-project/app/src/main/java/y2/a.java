package y2;

import Z5.y;
import a0.C0407b;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class a extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f16459h;

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        a aVar = (a) p((InterfaceC0617c) obj2, (C0407b) obj);
        y yVar = y.f7506a;
        aVar.v(yVar);
        return yVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f6.j, d6.c, y2.a] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        ?? abstractC0720j = new AbstractC0720j(2, interfaceC0617c);
        abstractC0720j.f16459h = obj;
        return abstractC0720j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        C0407b c0407b = (C0407b) this.f16459h;
        Z5.a.d(obj);
        c0407b.b();
        c0407b.f7661a.clear();
        return y.f7506a;
    }
}
