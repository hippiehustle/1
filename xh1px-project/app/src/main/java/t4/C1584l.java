package t4;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import l2.C1001a;
import n6.InterfaceC1164c;

/* renamed from: t4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1584l extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x f15083h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1001a f15084i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1584l(x xVar, C1001a c1001a, int i4, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15083h = xVar;
        this.f15084i = c1001a;
        this.j = i4;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1584l c1584l = (C1584l) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c1584l.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1584l(this.f15083h, this.f15084i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        this.f15083h.f15114c.m(C1001a.b(this.f15084i, null, this.j, false, false, 123));
        return Z5.y.f7506a;
    }
}
