package b5;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: b5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532b extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9182h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f9183i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0532b(d dVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f9183i = dVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0532b c0532b = (C0532b) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c0532b.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0532b c0532b = new C0532b(this.f9183i, interfaceC0617c);
        c0532b.f9182h = obj;
        return c0532b;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f9182h;
        Z5.a.d(obj);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0531a(this.f9183i, null), 3);
        return y.f7506a;
    }
}
