package d6;

import n6.InterfaceC1164c;

/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0615a implements InterfaceC0620f {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0621g f10444d;

    public AbstractC0615a(InterfaceC0621g interfaceC0621g) {
        this.f10444d = interfaceC0621g;
    }

    @Override // d6.InterfaceC0622h
    public InterfaceC0620f B(InterfaceC0621g interfaceC0621g) {
        return E2.d.p(this, interfaceC0621g);
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0622h D(InterfaceC0622h interfaceC0622h) {
        return E2.d.C(this, interfaceC0622h);
    }

    @Override // d6.InterfaceC0620f
    public final InterfaceC0621g getKey() {
        return this.f10444d;
    }

    @Override // d6.InterfaceC0622h
    public final Object n(Object obj, InterfaceC1164c interfaceC1164c) {
        return interfaceC1164c.l(obj, this);
    }

    @Override // d6.InterfaceC0622h
    public InterfaceC0622h y(InterfaceC0621g interfaceC0621g) {
        return E2.d.z(this, interfaceC0621g);
    }
}
