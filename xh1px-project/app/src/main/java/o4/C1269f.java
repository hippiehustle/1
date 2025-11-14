package o4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: o4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1269f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f13567h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f13568i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1269f(t tVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13568i = tVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1269f c1269f = (C1269f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c1269f.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1269f c1269f = new C1269f(this.f13568i, interfaceC0617c);
        c1269f.f13567h = obj;
        return c1269f;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f13567h;
        Z5.a.d(obj);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1268e(this.f13568i, null), 3);
        return Z5.y.f7506a;
    }
}
