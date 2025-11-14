package h3;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: h3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0824l extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0826n f11356h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0824l(C0826n c0826n, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f11356h = c0826n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0824l c0824l = (C0824l) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c0824l.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0824l(this.f11356h, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        this.f11356h.f11359c.c();
        return y.f7506a;
    }
}
