package L7;

import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import f6.AbstractC0713c;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes.dex */
public abstract class D extends S7.i {

    /* renamed from: f, reason: collision with root package name */
    public int f3174f;

    public D(int i4) {
        super(0L, false);
        this.f3174f = i4;
    }

    public abstract InterfaceC0617c c();

    public Throwable d(Object obj) {
        C0158p c0158p;
        if (obj instanceof C0158p) {
            c0158p = (C0158p) obj;
        } else {
            c0158p = null;
        }
        if (c0158p == null) {
            return null;
        }
        return c0158p.f3235a;
    }

    public final void i(Throwable th) {
        AbstractC0166y.n(c().h(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r4 = (L7.X) r5.B(L7.C0161t.f3244e);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        q0 q0Var;
        try {
            InterfaceC0617c c6 = c();
            o6.j.c(c6, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            Q7.f fVar = (Q7.f) c6;
            AbstractC0713c abstractC0713c = fVar.f4943h;
            Object obj = fVar.j;
            InterfaceC0622h h8 = abstractC0713c.h();
            Object n3 = Q7.b.n(h8, obj);
            X x8 = null;
            if (n3 != Q7.b.f4934d) {
                q0Var = AbstractC0166y.z(abstractC0713c, h8, n3);
            } else {
                q0Var = null;
            }
            try {
                InterfaceC0622h h9 = abstractC0713c.h();
                Object j = j();
                Throwable d2 = d(j);
                if (d2 == null) {
                    int i4 = this.f3174f;
                    boolean z8 = true;
                    if (i4 != 1 && i4 != 2) {
                        z8 = false;
                    }
                }
                if (x8 != null && !x8.a()) {
                    CancellationException z9 = x8.z();
                    b(z9);
                    abstractC0713c.k(Z5.a.b(z9));
                } else if (d2 != null) {
                    abstractC0713c.k(Z5.a.b(d2));
                } else {
                    abstractC0713c.k(e(j));
                }
                if (q0Var == null || q0Var.i0()) {
                    Q7.b.g(h8, n3);
                }
            } catch (Throwable th) {
                if (q0Var == null || q0Var.i0()) {
                    Q7.b.g(h8, n3);
                }
                throw th;
            }
        } catch (DispatchException e9) {
            AbstractC0166y.n(c().h(), e9.f12156d);
        } catch (Throwable th2) {
            i(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object e(Object obj) {
        return obj;
    }
}
