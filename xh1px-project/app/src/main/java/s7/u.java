package s7;

import C6.O;
import c7.InterfaceC0588g;
import f7.C0723c;

/* loaded from: classes.dex */
public final class u extends v {

    /* renamed from: d, reason: collision with root package name */
    public final C0723c f14627d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C0723c c0723c, InterfaceC0588g interfaceC0588g, F6.B b4, O o7) {
        super(interfaceC0588g, b4, o7);
        o6.j.e(c0723c, "fqName");
        o6.j.e(interfaceC0588g, "nameResolver");
        this.f14627d = c0723c;
    }

    @Override // s7.v
    public final C0723c a() {
        return this.f14627d;
    }
}
