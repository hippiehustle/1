package M7;

import G.k;
import L7.AbstractC0160s;
import L7.AbstractC0166y;
import L7.B;
import L7.C0147e;
import L7.C0150h;
import L7.F;
import L7.H;
import L7.h0;
import Q7.n;
import android.os.Handler;
import android.os.Looper;
import d6.InterfaceC0622h;
import java.util.concurrent.CancellationException;
import n1.AbstractC1149a;
import o6.j;

/* loaded from: classes.dex */
public final class e extends AbstractC0160s implements B {

    /* renamed from: f, reason: collision with root package name */
    public final Handler f3505f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3506g;

    /* renamed from: h, reason: collision with root package name */
    public final e f3507h;

    public e(Handler handler, boolean z8) {
        e eVar;
        this.f3505f = handler;
        this.f3506g = z8;
        if (z8) {
            eVar = this;
        } else {
            eVar = new e(handler, true);
        }
        this.f3507h = eVar;
    }

    @Override // L7.B
    public final void M(long j, C0150h c0150h) {
        k kVar = new k(c0150h, 1, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f3505f.postDelayed(kVar, j)) {
            c cVar = new c(this, 0, kVar);
            c0150h.getClass();
            c0150h.x(new C0147e(1, cVar));
            return;
        }
        R(c0150h.f3218h, kVar);
    }

    @Override // L7.AbstractC0160s
    public final void N(InterfaceC0622h interfaceC0622h, Runnable runnable) {
        if (!this.f3505f.post(runnable)) {
            R(interfaceC0622h, runnable);
        }
    }

    @Override // L7.AbstractC0160s
    public final boolean P(InterfaceC0622h interfaceC0622h) {
        if (this.f3506g && j.a(Looper.myLooper(), this.f3505f.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // L7.AbstractC0160s
    public AbstractC0160s Q(int i4) {
        Q7.b.a(i4);
        return this;
    }

    public final void R(InterfaceC0622h interfaceC0622h, Runnable runnable) {
        AbstractC0166y.d(interfaceC0622h, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        S7.e eVar = F.f3175a;
        S7.d.f5456f.N(interfaceC0622h, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.f3505f == this.f3505f && eVar.f3506g == this.f3506g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int identityHashCode = System.identityHashCode(this.f3505f);
        if (this.f3506g) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return identityHashCode ^ i4;
    }

    @Override // L7.B
    public final H p(long j, final Runnable runnable, InterfaceC0622h interfaceC0622h) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f3505f.postDelayed(runnable, j)) {
            return new H() { // from class: M7.d
                @Override // L7.H
                public final void b() {
                    e.this.f3505f.removeCallbacks(runnable);
                }
            };
        }
        R(interfaceC0622h, runnable);
        return h0.f3219d;
    }

    @Override // L7.AbstractC0160s
    public final String toString() {
        e eVar;
        String str;
        S7.e eVar2 = F.f3175a;
        e eVar3 = n.f4962a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f3507h;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            if (this == eVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String handler = this.f3505f.toString();
            if (this.f3506g) {
                return AbstractC1149a.g(handler, ".immediate");
            }
            return handler;
        }
        return str;
    }
}
