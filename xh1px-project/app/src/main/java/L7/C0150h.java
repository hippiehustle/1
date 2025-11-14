package L7;

import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.InterfaceC0714d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n6.InterfaceC1165d;

/* renamed from: L7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0150h extends D implements InterfaceC0149g, InterfaceC0714d, s0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3216i = AtomicIntegerFieldUpdater.newUpdater(C0150h.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(C0150h.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(C0150h.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0617c f3217g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0622h f3218h;

    public C0150h(int i4, InterfaceC0617c interfaceC0617c) {
        super(i4);
        this.f3217g = interfaceC0617c;
        this.f3218h = interfaceC0617c.h();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0144b.f3200d;
    }

    public static Object E(i0 i0Var, Object obj, int i4, InterfaceC1165d interfaceC1165d) {
        InterfaceC0148f interfaceC0148f;
        if (obj instanceof C0158p) {
            return obj;
        }
        if (i4 != 1 && i4 != 2) {
            return obj;
        }
        if (interfaceC1165d == null && !(i0Var instanceof InterfaceC0148f)) {
            return obj;
        }
        if (i0Var instanceof InterfaceC0148f) {
            interfaceC0148f = (InterfaceC0148f) i0Var;
        } else {
            interfaceC0148f = null;
        }
        return new C0157o(obj, interfaceC0148f, interfaceC1165d, (Throwable) null, 16);
    }

    public static void z(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        Q7.f fVar;
        InterfaceC0617c interfaceC0617c = this.f3217g;
        Throwable th = null;
        if (interfaceC0617c instanceof Q7.f) {
            fVar = (Q7.f) interfaceC0617c;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q7.f.k;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                Q7.t tVar = Q7.b.f4933c;
                if (obj != tVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, tVar, this)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != tVar) {
                        break;
                    }
                }
            }
            if (th != null) {
                q();
                p(th);
            }
        }
    }

    public final void C(Object obj, int i4, InterfaceC1165d interfaceC1165d) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof i0) {
                Object E7 = E((i0) obj2, obj, i4, interfaceC1165d);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E7)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!y()) {
                    q();
                }
                s(i4);
                return;
            }
            if (obj2 instanceof C0151i) {
                C0151i c0151i = (C0151i) obj2;
                c0151i.getClass();
                if (C0151i.f3220c.compareAndSet(c0151i, 0, 1)) {
                    if (interfaceC1165d != null) {
                        m(interfaceC1165d, c0151i.f3235a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void D(AbstractC0160s abstractC0160s) {
        Q7.f fVar;
        AbstractC0160s abstractC0160s2;
        int i4;
        InterfaceC0617c interfaceC0617c = this.f3217g;
        if (interfaceC0617c instanceof Q7.f) {
            fVar = (Q7.f) interfaceC0617c;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            abstractC0160s2 = fVar.f4942g;
        } else {
            abstractC0160s2 = null;
        }
        if (abstractC0160s2 == abstractC0160s) {
            i4 = 4;
        } else {
            i4 = this.f3174f;
        }
        C(Z5.y.f7506a, i4, null);
    }

    @Override // L7.s0
    public final void a(Q7.r rVar, int i4) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        do {
            atomicIntegerFieldUpdater = f3216i;
            i8 = atomicIntegerFieldUpdater.get(this);
            if ((i8 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, ((i8 >> 29) << 29) + i4));
        x(rVar);
    }

    @Override // L7.D
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof i0)) {
                if (!(obj instanceof C0158p)) {
                    if (obj instanceof C0157o) {
                        C0157o c0157o = (C0157o) obj;
                        if (c0157o.f3230e == null) {
                            C0157o a3 = C0157o.a(c0157o, null, cancellationException, 15);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a3)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    cancellationException2 = cancellationException;
                                }
                            }
                            InterfaceC0148f interfaceC0148f = c0157o.f3227b;
                            if (interfaceC0148f != null) {
                                l(interfaceC0148f, cancellationException);
                            }
                            InterfaceC1165d interfaceC1165d = c0157o.f3228c;
                            if (interfaceC1165d != null) {
                                m(interfaceC1165d, cancellationException, c0157o.f3226a);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Must be called at most once");
                    }
                    cancellationException2 = cancellationException;
                    C0157o c0157o2 = new C0157o(obj, (InterfaceC0148f) null, (InterfaceC1165d) null, cancellationException2, 14);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0157o2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    return;
                    cancellationException = cancellationException2;
                } else {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed");
            }
        }
    }

    @Override // L7.D
    public final InterfaceC0617c c() {
        return this.f3217g;
    }

    @Override // L7.D
    public final Throwable d(Object obj) {
        Throwable d2 = super.d(obj);
        if (d2 != null) {
            return d2;
        }
        return null;
    }

    @Override // L7.D
    public final Object e(Object obj) {
        if (obj instanceof C0157o) {
            return ((C0157o) obj).f3226a;
        }
        return obj;
    }

    @Override // L7.InterfaceC0149g
    public final void f(Object obj, InterfaceC1165d interfaceC1165d) {
        C(obj, this.f3174f, interfaceC1165d);
    }

    @Override // f6.InterfaceC0714d
    public final InterfaceC0714d g() {
        InterfaceC0617c interfaceC0617c = this.f3217g;
        if (interfaceC0617c instanceof InterfaceC0714d) {
            return (InterfaceC0714d) interfaceC0617c;
        }
        return null;
    }

    @Override // d6.InterfaceC0617c
    public final InterfaceC0622h h() {
        return this.f3218h;
    }

    @Override // L7.D
    public final Object j() {
        return j.get(this);
    }

    @Override // d6.InterfaceC0617c
    public final void k(Object obj) {
        Throwable a3 = Z5.l.a(obj);
        if (a3 != null) {
            obj = new C0158p(a3, false);
        }
        C(obj, this.f3174f, null);
    }

    public final void l(InterfaceC0148f interfaceC0148f, Throwable th) {
        try {
            interfaceC0148f.b(th);
        } catch (Throwable th2) {
            AbstractC0166y.n(this.f3218h, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(InterfaceC1165d interfaceC1165d, Throwable th, Object obj) {
        InterfaceC0622h interfaceC0622h = this.f3218h;
        try {
            interfaceC1165d.j(th, obj, interfaceC0622h);
        } catch (Throwable th2) {
            AbstractC0166y.n(interfaceC0622h, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(Q7.r rVar, Throwable th) {
        InterfaceC0622h interfaceC0622h = this.f3218h;
        int i4 = f3216i.get(this) & 536870911;
        if (i4 != 536870911) {
            try {
                rVar.h(i4, interfaceC0622h);
                return;
            } catch (Throwable th2) {
                AbstractC0166y.n(interfaceC0622h, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    @Override // L7.InterfaceC0149g
    public final Q7.t o(Object obj, InterfaceC1165d interfaceC1165d) {
        Q7.t tVar = AbstractC0166y.f3253a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof i0) {
                Object E7 = E((i0) obj2, obj, this.f3174f, interfaceC1165d);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E7)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!y()) {
                    q();
                }
                return tVar;
            }
            return null;
        }
    }

    public final boolean p(Throwable th) {
        Throwable th2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z8 = false;
            if (!(obj instanceof i0)) {
                return false;
            }
            if ((obj instanceof InterfaceC0148f) || (obj instanceof Q7.r)) {
                z8 = true;
            }
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            C0158p c0158p = new C0158p(th2, z8);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0158p)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            i0 i0Var = (i0) obj;
            if (i0Var instanceof InterfaceC0148f) {
                l((InterfaceC0148f) obj, th);
            } else if (i0Var instanceof Q7.r) {
                n((Q7.r) obj, th);
            }
            if (!y()) {
                q();
            }
            s(this.f3174f);
            return true;
        }
    }

    public final void q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        H h8 = (H) atomicReferenceFieldUpdater.get(this);
        if (h8 == null) {
            return;
        }
        h8.b();
        atomicReferenceFieldUpdater.set(this, h0.f3219d);
    }

    @Override // L7.InterfaceC0149g
    public final void r(Object obj) {
        s(this.f3174f);
    }

    public final void s(int i4) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        boolean z8;
        boolean z9;
        do {
            atomicIntegerFieldUpdater = f3216i;
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 1) {
                    boolean z10 = false;
                    if (i4 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    InterfaceC0617c interfaceC0617c = this.f3217g;
                    if (!z8 && (interfaceC0617c instanceof Q7.f)) {
                        if (i4 != 1 && i4 != 2) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        int i10 = this.f3174f;
                        if (i10 == 1 || i10 == 2) {
                            z10 = true;
                        }
                        if (z9 == z10) {
                            Q7.f fVar = (Q7.f) interfaceC0617c;
                            AbstractC0160s abstractC0160s = fVar.f4942g;
                            InterfaceC0622h h8 = fVar.f4943h.h();
                            if (Q7.b.j(abstractC0160s, h8)) {
                                Q7.b.i(abstractC0160s, h8, this);
                                return;
                            }
                            P a3 = m0.a();
                            if (a3.f3188f >= 4294967296L) {
                                a3.S(this);
                                return;
                            }
                            a3.U(true);
                            try {
                                AbstractC0166y.s(this, interfaceC0617c, true);
                                do {
                                } while (a3.W());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                    AbstractC0166y.s(this, interfaceC0617c, z8);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
    }

    public Throwable t(d0 d0Var) {
        return d0Var.z();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(AbstractC0166y.w(this.f3217g));
        sb.append("){");
        Object obj = j.get(this);
        if (obj instanceof i0) {
            str = "Active";
        } else if (obj instanceof C0151i) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0166y.l(this));
        return sb.toString();
    }

    public final Object u() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        X x8;
        boolean y4 = y();
        do {
            atomicIntegerFieldUpdater = f3216i;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i8 = i4 >> 29;
            if (i8 != 0) {
                if (i8 == 2) {
                    if (y4) {
                        B();
                    }
                    Object obj = j.get(this);
                    if (!(obj instanceof C0158p)) {
                        int i9 = this.f3174f;
                        if ((i9 == 1 || i9 == 2) && (x8 = (X) this.f3218h.B(C0161t.f3244e)) != null && !x8.a()) {
                            CancellationException z8 = x8.z();
                            b(z8);
                            throw z8;
                        }
                        return e(obj);
                    }
                    throw ((C0158p) obj).f3235a;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 536870912 + (536870911 & i4)));
        if (((H) k.get(this)) == null) {
            w();
        }
        if (y4) {
            B();
        }
        return EnumC0646a.f10656d;
    }

    public final void v() {
        H w8 = w();
        if (w8 != null && !(j.get(this) instanceof i0)) {
            w8.b();
            k.set(this, h0.f3219d);
        }
    }

    public final H w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        X x8 = (X) this.f3218h.B(C0161t.f3244e);
        if (x8 == null) {
            return null;
        }
        H o7 = AbstractC0166y.o(x8, true, new C0152j(this, 0));
        do {
            atomicReferenceFieldUpdater = k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, o7)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return o7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b7, code lost:
    
        z(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ba, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(i0 i0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0144b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, i0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            Throwable th = null;
            if ((obj instanceof InterfaceC0148f) || (obj instanceof Q7.r)) {
                break;
            }
            if (obj instanceof C0158p) {
                C0158p c0158p = (C0158p) obj;
                c0158p.getClass();
                if (C0158p.f3234b.compareAndSet(c0158p, 0, 1)) {
                    if (obj instanceof C0151i) {
                        if (obj == null) {
                            c0158p = null;
                        }
                        if (c0158p != null) {
                            th = c0158p.f3235a;
                        }
                        if (i0Var instanceof InterfaceC0148f) {
                            l((InterfaceC0148f) i0Var, th);
                            return;
                        } else {
                            o6.j.c(i0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            n((Q7.r) i0Var, th);
                            return;
                        }
                    }
                    return;
                }
                z(i0Var, obj);
                throw null;
            }
            if (obj instanceof C0157o) {
                C0157o c0157o = (C0157o) obj;
                if (c0157o.f3227b == null) {
                    if (i0Var instanceof Q7.r) {
                        return;
                    }
                    o6.j.c(i0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC0148f interfaceC0148f = (InterfaceC0148f) i0Var;
                    Throwable th2 = c0157o.f3230e;
                    if (th2 != null) {
                        l(interfaceC0148f, th2);
                        return;
                    }
                    C0157o a3 = C0157o.a(c0157o, interfaceC0148f, null, 29);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a3)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    return;
                }
                z(i0Var, obj);
                throw null;
            }
            if (i0Var instanceof Q7.r) {
                return;
            }
            o6.j.c(i0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            C0157o c0157o2 = new C0157o(obj, (InterfaceC0148f) i0Var, (InterfaceC1165d) null, (Throwable) null, 28);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0157o2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean y() {
        if (this.f3174f == 2) {
            InterfaceC0617c interfaceC0617c = this.f3217g;
            o6.j.c(interfaceC0617c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (Q7.f.k.get((Q7.f) interfaceC0617c) != null) {
                return true;
            }
            return false;
        }
        return false;
    }
}
