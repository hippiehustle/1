package q2;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: q2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1361g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1365k f13956h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1361g(C1365k c1365k, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13956h = c1365k;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1361g c1361g = (C1361g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1361g.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1361g(this.f13956h, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        this.f13956h.c();
        return y.f7506a;
    }
}
