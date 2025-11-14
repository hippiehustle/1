package L7;

import d6.InterfaceC0620f;
import d6.InterfaceC0621g;
import d6.InterfaceC0622h;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class r0 implements InterfaceC0620f, InterfaceC0621g {

    /* renamed from: d, reason: collision with root package name */
    public static final r0 f3241d = new Object();

    @Override // d6.InterfaceC0622h
    public final InterfaceC0620f B(InterfaceC0621g interfaceC0621g) {
        return E2.d.p(this, interfaceC0621g);
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0622h D(InterfaceC0622h interfaceC0622h) {
        return E2.d.C(this, interfaceC0622h);
    }

    @Override // d6.InterfaceC0622h
    public final Object n(Object obj, InterfaceC1164c interfaceC1164c) {
        return interfaceC1164c.l(obj, this);
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0622h y(InterfaceC0621g interfaceC0621g) {
        return E2.d.z(this, interfaceC0621g);
    }

    @Override // d6.InterfaceC0620f
    public final InterfaceC0621g getKey() {
        return this;
    }
}
