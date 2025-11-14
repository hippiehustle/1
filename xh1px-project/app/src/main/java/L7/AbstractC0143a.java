package L7;

import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0711a;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;
import n6.InterfaceC1164c;

/* renamed from: L7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0143a extends d0 implements InterfaceC0617c, InterfaceC0163v {

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0622h f3198f;

    public AbstractC0143a(InterfaceC0622h interfaceC0622h, boolean z8) {
        super(z8);
        N((X) interfaceC0622h.B(C0161t.f3244e));
        this.f3198f = interfaceC0622h.D(this);
    }

    @Override // L7.d0
    public final void M(CompletionHandlerException completionHandlerException) {
        AbstractC0166y.n(this.f3198f, completionHandlerException);
    }

    @Override // L7.d0
    public final void W(Object obj) {
        if (obj instanceof C0158p) {
            C0158p c0158p = (C0158p) obj;
            Throwable th = c0158p.f3235a;
            boolean z8 = true;
            if (C0158p.f3234b.get(c0158p) != 1) {
                z8 = false;
            }
            e0(th, z8);
            return;
        }
        f0(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g0(EnumC0164w enumC0164w, AbstractC0143a abstractC0143a, InterfaceC1164c interfaceC1164c) {
        int ordinal = enumC0164w.ordinal();
        Z5.y yVar = Z5.y.f7506a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            InterfaceC0622h interfaceC0622h = this.f3198f;
                            Object n3 = Q7.b.n(interfaceC0622h, null);
                            try {
                                o6.y.c(2, interfaceC1164c);
                                Object l6 = interfaceC1164c.l(abstractC0143a, this);
                                if (l6 != EnumC0646a.f10656d) {
                                    k(l6);
                                    return;
                                }
                                return;
                            } finally {
                                Q7.b.g(interfaceC0622h, n3);
                            }
                        } catch (Throwable th) {
                            th = th;
                            return;
                        }
                    }
                    throw new NoWhenBranchMatchedException();
                }
                E2.c.d0(((AbstractC0711a) interfaceC1164c).p(this, abstractC0143a)).k(yVar);
                return;
            }
            return;
        }
        try {
            Q7.b.h(E2.c.d0(((AbstractC0711a) interfaceC1164c).p(this, abstractC0143a)), yVar);
        } finally {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).f12156d;
            }
            k(Z5.a.b(th));
        }
    }

    @Override // d6.InterfaceC0617c
    public final InterfaceC0622h h() {
        return this.f3198f;
    }

    @Override // d6.InterfaceC0617c
    public final void k(Object obj) {
        Throwable a3 = Z5.l.a(obj);
        if (a3 != null) {
            obj = new C0158p(a3, false);
        }
        Object S8 = S(obj);
        if (S8 == AbstractC0166y.f3257e) {
            return;
        }
        s(S8);
    }

    @Override // L7.InterfaceC0163v
    public final InterfaceC0622h p() {
        return this.f3198f;
    }

    @Override // L7.d0
    public final String x() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void f0(Object obj) {
    }

    public void e0(Throwable th, boolean z8) {
    }
}
