package L7;

import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import f6.AbstractC0711a;
import kotlinx.coroutines.DispatchException;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class e0 extends k0 {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0617c f3214g;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(InterfaceC0622h interfaceC0622h, InterfaceC1164c interfaceC1164c) {
        super(interfaceC0622h, false);
        this.f3214g = ((AbstractC0711a) interfaceC1164c).p(this, this);
    }

    @Override // L7.d0
    public final void X() {
        try {
            Q7.b.h(E2.c.d0(this.f3214g), Z5.y.f7506a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).f12156d;
            }
            k(Z5.a.b(th));
            throw th;
        }
    }
}
