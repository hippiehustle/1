package w0;

import d6.InterfaceC0620f;
import d6.InterfaceC0621g;
import d6.InterfaceC0622h;
import n6.InterfaceC1164c;
import t7.C1594d;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1683a implements InterfaceC0620f {

    /* renamed from: e, reason: collision with root package name */
    public static final C1594d f15569e = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final x f15570d;

    public C1683a(x xVar) {
        o6.j.e(xVar, "connectionWrapper");
        this.f15570d = xVar;
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0620f B(InterfaceC0621g interfaceC0621g) {
        return E2.d.p(this, interfaceC0621g);
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0622h D(InterfaceC0622h interfaceC0622h) {
        return E2.d.C(this, interfaceC0622h);
    }

    @Override // d6.InterfaceC0620f
    public final InterfaceC0621g getKey() {
        return f15569e;
    }

    @Override // d6.InterfaceC0622h
    public final Object n(Object obj, InterfaceC1164c interfaceC1164c) {
        return interfaceC1164c.l(obj, this);
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0622h y(InterfaceC0621g interfaceC0621g) {
        return E2.d.z(this, interfaceC0621g);
    }
}
