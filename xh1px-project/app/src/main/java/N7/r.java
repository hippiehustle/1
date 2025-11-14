package N7;

import L7.AbstractC0143a;
import L7.AbstractC0166y;
import L7.C0158p;
import L7.c0;
import L7.d0;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;

/* loaded from: classes.dex */
public final class r extends AbstractC0143a implements s, l {

    /* renamed from: g, reason: collision with root package name */
    public final h f3845g;

    public r(InterfaceC0622h interfaceC0622h, h hVar) {
        super(interfaceC0622h, true);
        this.f3845g = hVar;
    }

    @Override // N7.v
    public final Object b(InterfaceC0617c interfaceC0617c, Object obj) {
        return this.f3845g.b(interfaceC0617c, obj);
    }

    @Override // N7.u
    public final Object c(P7.r rVar) {
        h hVar = this.f3845g;
        hVar.getClass();
        return h.B(hVar, rVar);
    }

    @Override // L7.d0, L7.X
    public final void d(CancellationException cancellationException) {
        Object obj = d0.f3210d.get(this);
        if (!(obj instanceof C0158p)) {
            if (!(obj instanceof c0) || !((c0) obj).e()) {
                if (cancellationException == null) {
                    cancellationException = new JobCancellationException(x(), null, this);
                }
                u(cancellationException);
            }
        }
    }

    @Override // L7.AbstractC0143a
    public final void e0(Throwable th, boolean z8) {
        if (!this.f3845g.h(th, false) && !z8) {
            AbstractC0166y.n(this.f3198f, th);
        }
    }

    @Override // L7.AbstractC0143a
    public final void f0(Object obj) {
        E2.d.g(this.f3845g);
    }

    @Override // N7.u
    public final R3.r i() {
        return this.f3845g.i();
    }

    @Override // N7.u
    public final c iterator() {
        h hVar = this.f3845g;
        hVar.getClass();
        return new c(hVar);
    }

    @Override // N7.u
    public final Object l() {
        return this.f3845g.l();
    }

    @Override // N7.v
    public final Object m(Object obj) {
        throw null;
    }

    @Override // L7.d0
    public final void u(CancellationException cancellationException) {
        this.f3845g.h(cancellationException, true);
        t(cancellationException);
    }
}
