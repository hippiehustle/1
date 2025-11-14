package Q7;

import L7.AbstractC0160s;
import L7.AbstractC0166y;
import L7.C0158p;
import L7.D;
import L7.P;
import L7.m0;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import f6.AbstractC0713c;
import f6.InterfaceC0714d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class f extends D implements InterfaceC0714d, InterfaceC0617c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0160s f4942g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0713c f4943h;

    /* renamed from: i, reason: collision with root package name */
    public Object f4944i;
    public final Object j;

    public f(AbstractC0160s abstractC0160s, AbstractC0713c abstractC0713c) {
        super(-1);
        this.f4942g = abstractC0160s;
        this.f4943h = abstractC0713c;
        this.f4944i = b.f4932b;
        this.j = b.m(abstractC0713c.h());
    }

    @Override // f6.InterfaceC0714d
    public final InterfaceC0714d g() {
        return this.f4943h;
    }

    @Override // d6.InterfaceC0617c
    public final InterfaceC0622h h() {
        return this.f4943h.h();
    }

    @Override // L7.D
    public final Object j() {
        Object obj = this.f4944i;
        this.f4944i = b.f4932b;
        return obj;
    }

    @Override // d6.InterfaceC0617c
    public final void k(Object obj) {
        Object c0158p;
        Throwable a3 = Z5.l.a(obj);
        if (a3 == null) {
            c0158p = obj;
        } else {
            c0158p = new C0158p(a3, false);
        }
        AbstractC0713c abstractC0713c = this.f4943h;
        InterfaceC0622h h8 = abstractC0713c.h();
        AbstractC0160s abstractC0160s = this.f4942g;
        if (b.j(abstractC0160s, h8)) {
            this.f4944i = c0158p;
            this.f3174f = 0;
            b.i(abstractC0160s, abstractC0713c.h(), this);
            return;
        }
        P a4 = m0.a();
        if (a4.f3188f >= 4294967296L) {
            this.f4944i = c0158p;
            this.f3174f = 0;
            a4.S(this);
            return;
        }
        a4.U(true);
        try {
            InterfaceC0622h h9 = abstractC0713c.h();
            Object n3 = b.n(h9, this.j);
            try {
                abstractC0713c.k(obj);
                do {
                } while (a4.W());
            } finally {
                b.g(h9, n3);
            }
        } catch (Throwable th) {
            try {
                i(th);
            } finally {
                a4.R(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f4942g + ", " + AbstractC0166y.w(this.f4943h) + ']';
    }

    @Override // L7.D
    public final InterfaceC0617c c() {
        return this;
    }
}
