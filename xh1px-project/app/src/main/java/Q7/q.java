package Q7;

import L7.AbstractC0143a;
import L7.AbstractC0166y;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import f6.InterfaceC0714d;

/* loaded from: classes.dex */
public class q extends AbstractC0143a implements InterfaceC0714d {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0617c f4964g;

    public q(InterfaceC0617c interfaceC0617c, InterfaceC0622h interfaceC0622h) {
        super(interfaceC0622h, true);
        this.f4964g = interfaceC0617c;
    }

    @Override // L7.d0
    public final boolean Q() {
        return true;
    }

    @Override // f6.InterfaceC0714d
    public final InterfaceC0714d g() {
        InterfaceC0617c interfaceC0617c = this.f4964g;
        if (interfaceC0617c instanceof InterfaceC0714d) {
            return (InterfaceC0714d) interfaceC0617c;
        }
        return null;
    }

    @Override // L7.d0
    public void q(Object obj) {
        b.h(E2.c.d0(this.f4964g), AbstractC0166y.r(obj));
    }

    @Override // L7.d0
    public void s(Object obj) {
        this.f4964g.k(AbstractC0166y.r(obj));
    }

    public void h0() {
    }
}
