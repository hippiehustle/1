package c4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: c4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577d extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9654h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0580g f9655i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0577d(C0580g c0580g, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f9655i = c0580g;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0577d c0577d = (C0577d) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c0577d.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0577d c0577d = new C0577d(this.f9655i, interfaceC0617c);
        c0577d.f9654h = obj;
        return c0577d;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f9654h;
        Z5.a.d(obj);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0576c(this.f9655i, null), 3);
        return y.f7506a;
    }
}
