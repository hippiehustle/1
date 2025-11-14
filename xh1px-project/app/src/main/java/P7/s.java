package P7;

import d6.InterfaceC0620f;
import d6.InterfaceC0621g;
import d6.InterfaceC0622h;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class s implements InterfaceC0622h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0622h f4681d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f4682e;

    public s(InterfaceC0622h interfaceC0622h, Throwable th) {
        this.f4681d = interfaceC0622h;
        this.f4682e = th;
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0620f B(InterfaceC0621g interfaceC0621g) {
        return this.f4681d.B(interfaceC0621g);
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0622h D(InterfaceC0622h interfaceC0622h) {
        return this.f4681d.D(interfaceC0622h);
    }

    @Override // d6.InterfaceC0622h
    public final Object n(Object obj, InterfaceC1164c interfaceC1164c) {
        return this.f4681d.n(obj, interfaceC1164c);
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0622h y(InterfaceC0621g interfaceC0621g) {
        return this.f4681d.y(interfaceC0621g);
    }
}
