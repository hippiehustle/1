package L3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: L3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2850h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f2851i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0104f(w wVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2851i = wVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0104f c0104f = (C0104f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c0104f.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0104f c0104f = new C0104f(this.f2851i, interfaceC0617c);
        c0104f.f2850h = obj;
        return c0104f;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f2850h;
        Z5.a.d(obj);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0103e(this.f2851i, null), 3);
        return Z5.y.f7506a;
    }
}
