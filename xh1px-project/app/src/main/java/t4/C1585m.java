package t4;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import l2.C1001a;
import n6.InterfaceC1164c;

/* renamed from: t4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1585m extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x f15085h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1001a f15086i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1585m(x xVar, C1001a c1001a, String str, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15085h = xVar;
        this.f15086i = c1001a;
        this.j = str;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1585m c1585m = (C1585m) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c1585m.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1585m(this.f15085h, this.f15086i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        this.f15085h.f15114c.m(C1001a.b(this.f15086i, this.j, 0, false, false, 125));
        return Z5.y.f7506a;
    }
}
