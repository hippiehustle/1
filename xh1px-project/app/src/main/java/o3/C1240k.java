package o3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: o3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1240k extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f13460h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1243n f13461i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240k(C1243n c1243n, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13461i = c1243n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1240k c1240k = (C1240k) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1240k.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1240k c1240k = new C1240k(this.f13461i, interfaceC0617c);
        c1240k.f13460h = obj;
        return c1240k;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f13460h;
        Z5.a.d(obj);
        C1243n c1243n = this.f13461i;
        AbstractC0166y.q(interfaceC0163v, null, null, new C1237h(c1243n, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1238i(c1243n, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1239j(c1243n, null), 3);
        return y.f7506a;
    }
}
