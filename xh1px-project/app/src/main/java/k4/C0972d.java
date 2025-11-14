package k4;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import j2.C0902b;
import n6.InterfaceC1164c;

/* renamed from: k4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0972d extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0969a f12085h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0902b f12086i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0972d(C0969a c0969a, C0902b c0902b, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12085h = c0969a;
        this.f12086i = c0902b;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0972d c0972d = (C0972d) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c0972d.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0972d(this.f12085h, this.f12086i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        this.f12085h.m(this.f12086i);
        return Z5.y.f7506a;
    }
}
