package x4;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;

/* renamed from: x4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1789b extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1163b f16130h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789b(InterfaceC0617c interfaceC0617c, InterfaceC1163b interfaceC1163b) {
        super(2, interfaceC0617c);
        this.f16130h = interfaceC1163b;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1789b c1789b = (C1789b) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1789b.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1789b(interfaceC0617c, this.f16130h);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        this.f16130h.m(null);
        return y.f7506a;
    }
}
