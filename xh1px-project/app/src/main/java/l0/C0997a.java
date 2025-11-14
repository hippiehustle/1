package l0;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0622h;
import o6.j;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0997a implements AutoCloseable, InterfaceC0163v {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0622h f12182d;

    public C0997a(InterfaceC0622h interfaceC0622h) {
        j.e(interfaceC0622h, "coroutineContext");
        this.f12182d = interfaceC0622h;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        AbstractC0166y.d(this.f12182d, null);
    }

    @Override // L7.InterfaceC0163v
    public final InterfaceC0622h p() {
        return this.f12182d;
    }
}
