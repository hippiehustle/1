package X;

import d6.InterfaceC0620f;
import d6.InterfaceC0621g;
import d6.InterfaceC0622h;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class g0 implements InterfaceC0620f {

    /* renamed from: d, reason: collision with root package name */
    public final g0 f6732d;

    /* renamed from: e, reason: collision with root package name */
    public final H f6733e;

    public g0(g0 g0Var, H h8) {
        this.f6732d = g0Var;
        this.f6733e = h8;
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0620f B(InterfaceC0621g interfaceC0621g) {
        return E2.d.p(this, interfaceC0621g);
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0622h D(InterfaceC0622h interfaceC0622h) {
        return E2.d.C(this, interfaceC0622h);
    }

    public final void b(H h8) {
        if (this.f6733e != h8) {
            g0 g0Var = this.f6732d;
            if (g0Var != null) {
                g0Var.b(h8);
                return;
            }
            return;
        }
        throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }

    @Override // d6.InterfaceC0620f
    public final InterfaceC0621g getKey() {
        return f0.f6731d;
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
