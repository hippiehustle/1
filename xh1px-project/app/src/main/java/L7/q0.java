package L7;

import d6.C0618d;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;

/* loaded from: classes.dex */
public final class q0 extends Q7.q {

    /* renamed from: h, reason: collision with root package name */
    public final ThreadLocal f3238h;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q0(InterfaceC0617c interfaceC0617c, InterfaceC0622h interfaceC0622h) {
        super(interfaceC0617c, r0);
        InterfaceC0622h interfaceC0622h2;
        r0 r0Var = r0.f3241d;
        if (interfaceC0622h.B(r0Var) == null) {
            interfaceC0622h2 = interfaceC0622h.D(r0Var);
        } else {
            interfaceC0622h2 = interfaceC0622h;
        }
        this.f3238h = new ThreadLocal();
        if (!(interfaceC0617c.h().B(C0618d.f10447d) instanceof AbstractC0160s)) {
            Object n3 = Q7.b.n(interfaceC0622h, null);
            Q7.b.g(interfaceC0622h, n3);
            k0(interfaceC0622h, n3);
        }
    }

    @Override // Q7.q
    public final void h0() {
        j0();
    }

    public final boolean i0() {
        boolean z8;
        if (this.threadLocalIsSet && this.f3238h.get() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f3238h.remove();
        return !z8;
    }

    public final void j0() {
        if (this.threadLocalIsSet) {
            Z5.j jVar = (Z5.j) this.f3238h.get();
            if (jVar != null) {
                Q7.b.g((InterfaceC0622h) jVar.f7485d, jVar.f7486e);
            }
            this.f3238h.remove();
        }
    }

    public final void k0(InterfaceC0622h interfaceC0622h, Object obj) {
        this.threadLocalIsSet = true;
        this.f3238h.set(new Z5.j(interfaceC0622h, obj));
    }

    @Override // Q7.q, L7.d0
    public final void s(Object obj) {
        j0();
        Object r8 = AbstractC0166y.r(obj);
        InterfaceC0617c interfaceC0617c = this.f4964g;
        InterfaceC0622h h8 = interfaceC0617c.h();
        q0 q0Var = null;
        Object n3 = Q7.b.n(h8, null);
        if (n3 != Q7.b.f4934d) {
            q0Var = AbstractC0166y.z(interfaceC0617c, h8, n3);
        }
        try {
            interfaceC0617c.k(r8);
            if (q0Var != null && !q0Var.i0()) {
                return;
            }
            Q7.b.g(h8, n3);
        } catch (Throwable th) {
            if (q0Var == null || q0Var.i0()) {
                Q7.b.g(h8, n3);
            }
            throw th;
        }
    }
}
