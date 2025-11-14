package q4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import k2.C0952b;
import n6.InterfaceC1164c;

/* renamed from: q4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1416v extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14133h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1419y f14134i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1416v(C1419y c1419y, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14134i = c1419y;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1416v c1416v = (C1416v) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c1416v.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1416v c1416v = new C1416v(this.f14134i, interfaceC0617c);
        c1416v.f14133h = obj;
        return c1416v;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f14133h;
        Z5.a.d(obj);
        C1419y c1419y = this.f14134i;
        AbstractC0166y.q(interfaceC0163v, null, null, new C1407m(c1419y, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1408n(c1419y, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1409o(c1419y, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1410p(c1419y, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1411q(c1419y, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1412r(c1419y, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1413s(c1419y, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1414t(c1419y, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1415u(c1419y, null), 3);
        if (c1419y.K().f14066c.f1950e.c() instanceof C0952b) {
            AbstractC0166y.q(interfaceC0163v, null, null, new C1404j(c1419y, null), 3);
        } else {
            AbstractC0166y.q(interfaceC0163v, null, null, new C1406l(c1419y, null), 3);
        }
        return Z5.y.f7506a;
    }
}
