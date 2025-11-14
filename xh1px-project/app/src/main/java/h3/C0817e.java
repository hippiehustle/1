package h3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: h3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0817e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f11340h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0820h f11341i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0817e(C0820h c0820h, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f11341i = c0820h;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0817e c0817e = (C0817e) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c0817e.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0817e c0817e = new C0817e(this.f11341i, interfaceC0617c);
        c0817e.f11340h = obj;
        return c0817e;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f11340h;
        Z5.a.d(obj);
        C0820h c0820h = this.f11341i;
        AbstractC0166y.q(interfaceC0163v, null, null, new C0815c(c0820h, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0816d(c0820h, null), 3);
        return y.f7506a;
    }
}
