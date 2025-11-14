package androidx.lifecycle;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0622h;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506q implements InterfaceC0508t, InterfaceC0163v {

    /* renamed from: d, reason: collision with root package name */
    public final C0512x f8854d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0622h f8855e;

    public C0506q(C0512x c0512x, InterfaceC0622h interfaceC0622h) {
        o6.j.e(interfaceC0622h, "coroutineContext");
        this.f8854d = c0512x;
        this.f8855e = interfaceC0622h;
        if (c0512x.f8862d == EnumC0504o.f8846d) {
            AbstractC0166y.d(interfaceC0622h, null);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0508t
    public final void a(InterfaceC0510v interfaceC0510v, EnumC0503n enumC0503n) {
        C0512x c0512x = this.f8854d;
        if (c0512x.f8862d.compareTo(EnumC0504o.f8846d) <= 0) {
            c0512x.f(this);
            AbstractC0166y.d(this.f8855e, null);
        }
    }

    @Override // L7.InterfaceC0163v
    public final InterfaceC0622h p() {
        return this.f8855e;
    }
}
