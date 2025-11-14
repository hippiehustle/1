package t4;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import l2.C1001a;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class w extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x f15111h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1001a f15112i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, C1001a c1001a, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15111h = xVar;
        this.f15112i = c1001a;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        w wVar = (w) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        wVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new w(this.f15111h, this.f15112i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        this.f15111h.f15114c.m(C1001a.b(this.f15112i, null, 0, !r0.f12193d, false, 119));
        return Z5.y.f7506a;
    }
}
