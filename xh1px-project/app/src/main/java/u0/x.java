package u0;

import d6.InterfaceC0619e;
import d6.InterfaceC0620f;
import d6.InterfaceC0621g;
import d6.InterfaceC0622h;
import java.util.concurrent.atomic.AtomicInteger;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class x implements InterfaceC0620f {

    /* renamed from: f, reason: collision with root package name */
    public static final G5.e f15289f = new G5.e(28);

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0619e f15290d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f15291e = new AtomicInteger(0);

    public x(InterfaceC0619e interfaceC0619e) {
        this.f15290d = interfaceC0619e;
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
        return f15289f;
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
