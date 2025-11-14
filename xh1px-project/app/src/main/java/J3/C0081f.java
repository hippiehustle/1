package J3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: J3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2436h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u f2437i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0081f(u uVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2437i = uVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0081f c0081f = (C0081f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c0081f.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0081f c0081f = new C0081f(this.f2437i, interfaceC0617c);
        c0081f.f2436h = obj;
        return c0081f;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f2436h;
        Z5.a.d(obj);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0080e(this.f2437i, null), 3);
        return Z5.y.f7506a;
    }
}
